import React from 'react'
import {NavLink} from 'react-router-dom'

const  HeaderCompenent=()=>{
    return (
        <div>
            <nav className="navbar navbar-expand-lg navbar-dark bg-dark">
                <a className="navbar-brand" href="/">Employe Managenent System (ems)</a>
                <div className="collapse navbar-collapse" id="navbarNav">
                    <ul className="navbar-nav">
                        <li className="nav-item">
                            <NavLink className="nav-link" exact>Employees</NavLink>
                        </li>
                        <li className="nav-item">
                            <NavLink className="nav-link" exact>Departaments</NavLink>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
    )
}
export default HeaderCompenent