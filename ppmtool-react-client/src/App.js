import React from "react";
import "./App.css";
import Dashboard from "./components/Dashboard";
import Header from "./components/Layout/Header";
import ProjectItem from "./components/Project/ProjectItem";

function App() {
  return (
    <div className="App">
      <Header />
      <Dashboard />
      <ProjectItem />
    </div>
  );
}

export default App;