import { createGlobalStyle } from 'styled-components';

const GlobalStyle = createGlobalStyle`
*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

body{
  font-family: "Roboto", serif;
  background-color: #404e4d;
  color: #fff;
  line-height: 1.6;
}

a {
  text-decoration: none;
}

`;

export default GlobalStyle;
