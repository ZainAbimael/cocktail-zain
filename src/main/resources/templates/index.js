function getCharacters(done) {
    const result = fetch("http://127.0.0.1:8080/Consultar/ingrediente/Gin");

    result
        .then(response => response.json())
        .then(data => {
            done(data)
        });
}

getCharacters(data =>{
    console.log(data)
})