document.addEventListener('DOMContentLoaded', function () {
    console.log("here....");
    document.getElementById('accessDomButton').addEventListener('click', function () {
      chrome.tabs.query({ active: true, currentWindow: true }, function (tabs) {
        const currentTab = tabs[0];
        chrome.scripting.executeScript({
          target: { tabId: currentTab.id },
          function: accessDOMInTab
        });
      });
    });
  });
  