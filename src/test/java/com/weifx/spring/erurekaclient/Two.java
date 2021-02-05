开发第二个新功能
修改功能
error: packages/apps/Wizard/: contains uncommitted changes
出现这个问题的原因是本地代码发生变化，但未commit。通过 git reset --hard xxx ，repo sync同步依然存在上述问题