git 常用命令

克隆仓库
git clone <repository_url>

进入仓库目录
cd <repository_directory>

查看远程仓库配置
git remote -v

命令用于列出本地分支,包括当前所在的分支,每个分支都是基于您在本地仓库中的提交历史创建的
git branch 

命令用于列出远程仓库中的分支,但这些分支实际上不是本地的，而是指向远程仓库的引用
git branch -r 

切换到指定分支
git checkout <branch_name>

用于从远程仓库下载最新的提交历史和对象，但不会合并或应用这些更改到您的本地分支
git fetch [<remote>]
1.从远程仓库下载最新的提交历史和对象。
2.更新本地仓库中与远程仓库相关的远程跟踪分支（remote tracking branches），以反映远程仓库的状态。
3.如果有新的分支或标签被添加到远程仓库，将会在本地创建相应的远程跟踪分支或标签。
