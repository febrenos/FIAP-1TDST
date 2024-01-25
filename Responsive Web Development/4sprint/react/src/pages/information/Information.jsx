import React from 'react'
import Infocard1 from '../../components/infoCards/InfoCard1'
import Infocard2 from '../../components/infoCards/InfoCard2'
import Infocard3 from '../../components/infoCards/InfoCard3'
import Header from '../../components/header/Header'
import Footer from '../../components/footer/Footer'
import './Information.css'

export default () =>{
    return(
        <>
        <Header/>
        <main>
            <h1>Informações/Dicas</h1>
            <Infocard1/>
            <Infocard2/>
            <Infocard3/>
        </main>
        <Footer/>
        </>
    )
}