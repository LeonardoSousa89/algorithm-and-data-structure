export default abstract class User {
    
    username: string
    email: string
    
    constructor(username: string, email: string){
        
        this.username = username
        this.email = email
    }

    abstract getUser(): Object | Array<Object>
}