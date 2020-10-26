var app = new Vue({
      el: '#app',
      data: {
        message: 'Hello Vue! This from a java script file!',
        product: 'Socks',
        description: 'Some really cool socks!',
        image: '@{/images/vmSocks-green-onWhite.jpg}',
        image2: '/images/vmSocks-green-onWhite.jpg'
      }
    })
