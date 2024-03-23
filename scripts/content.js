const links = Array.from(document.querySelectorAll('a'));
links.forEach(link => {
  if (!link.hasAttribute('target') || link.getAttribute('target') !== '_blank') {
    console.log(link);
  }
});