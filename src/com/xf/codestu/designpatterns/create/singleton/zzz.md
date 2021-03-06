**singleton:单例模式(一个类的唯一实例)**
意图：保证一个类仅有一个实例，并提供一个访问他的全局访问点

单例模式确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例，这个类称为单例类，它提供全局访问的方法。

单例模式的要点有三个：一是某个类只能有一个实例；
                    二是它必须自行创建这个实例；
                    三是它必须自行向整个系统提供这个实例。
                    单例模式是一种对象创建型模式。单例模式又名单件模式或单态模式。


注：事实上，通过Java反射机制是能够实例化构造方法为private的类的，那基本上会使所有的Java单例实现失效。

适用环境: 1、系统只需要一个实例对象，如系统要求提供一个唯一的序列号生成器，或者需要考虑资源消耗太大而只允许创建一个对象。
         2、客户调用类的单个实例只允许使用一个公共访问点，除了该公共访问点，不能通过其他途径访问该实例。
         3、在一个系统中要求一个类只有一个实例时才应当使用单例模式。反过来，如果一个类可以有几个实例共存，就需要对单例模式进行改进，使之成为多例模式


