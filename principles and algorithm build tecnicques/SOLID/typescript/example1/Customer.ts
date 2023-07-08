import User  from './User'
import UserViewer  from './UserViewer'
import Role  from './Role'

export default class Customer extends User implements UserViewer{
    
    role: Role = { role: 'customer' }
    
    constructor(username: string, email: string){
      
        super(username, email)
        this.role
    }
    
    getUser(): Object | Array<Object> {
        
        return {
            username: this.username,
            email: this.email,
            role: this.role
        } 
    }
    
    show(): void {
        
        console.log(this.getUser())
    }
} 
