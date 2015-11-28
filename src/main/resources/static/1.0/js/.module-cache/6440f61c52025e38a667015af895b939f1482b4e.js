/**
 * Created by wanglei on 15/11/28.
 */
var Main = React.createClass({displayName: "Main",
   render:function(){
       return (
         React.createElement("div", null, 
             "React Part"
         )
       );
   }
});

ReactDOM.render(
    React.createElement(Main, null),document.getElementById('main')
);