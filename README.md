#### QuotesApp with MVVM architecture

![alt text](https://github.com/jinia-konar/MVVM-architecture/blob/master/images/mvvm-architecture-pattern.png "mvvm-architecture-pattern")

* Here Activity/Fragment is basically the view that user can see. 
* All the data that is been updated in the view or any action is handled from the viewmodel
* ViewModel communicate with the repository, which fetch the data(Api calling)

![alt text](https://github.com/jinia-konar/MVVM-architecture/blob/master/images/mvvm.png "mvvm")

* **Model**:- Model represents the data and business logic of the app. Eg: Repository classes, response model classes,helpers etc.
* **View**:- In this pattern, the view role is to observe (or subscribe to a ViewModel observable to get information in order to change UI elements accordingly.
* **ViewModel**:- ViewModel interacts with model and prepares data that can be observed by a View between view and model. Has no reference to the view.

For reference:-
* [MVVM on Android Crash Course – Kotlin & Android Architecture Components](https://resocoder.com/2018/09/07/mvvm-on-android-crash-course-kotlin-android-architecture-components/)
* [Youtube Video](https://www.youtube.com/watch?v=d7UxPYxgBoA)
