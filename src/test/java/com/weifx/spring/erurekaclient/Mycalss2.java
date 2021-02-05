repo forall -c "git reset --hard && git clean -fd && git pull"//全部回退一个版本，重新pull 不建议。

使用git reset --hard 回退到commit未发生变化之前

git clean --fd 清除变化的文件，删除变化记录目录

git pull 重新pull代码

参考：https://blog.csdn.net/u012637313/article/details/48028161

2）试着通过 git reset --hard来恢复所有变化的文件之后，依然存在上述问题，