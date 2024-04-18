git 常用命令

克隆仓库
git clone <repository_url>

将文件添加到暂存区
git add <file>
git add .

拉取远程分支并合并到当前分支
git pull
推送当前分支到远程仓库
git push <remote> <branch>

显示工作目录和暂存区的状态
git status

合并指定分支到当前分支
git merge <branch_name>

查看远程仓库配置
git remote -v

命令用于列出本地分支,包括当前所在的分支,每个分支都是基于您在本地仓库中的提交历史创建的
git branch 

命令用于列出远程仓库中的分支,但这些分支实际上不是本地的，而是指向远程仓库的引用
git branch -r 

切换到指定分支
git checkout <branch_name>

用于从远程仓库下载最新的提交历史和对象，但不会合并或应用这些更改到您的本地分支
git fetch <remote>
1.从远程仓库下载最新的提交历史和对象
2.更新本地仓库中与远程仓库相关的远程跟踪分支（remote tracking branches），以反映远程仓库的状态
3.如果有新的分支或标签被添加到远程仓库，将会在本地创建相应的远程跟踪分支或标签

删除分支(命令执行前,不能在要删除的分支上 删除本地分支)
git branch -d <branch_name>
-D 强制删除,谨慎会导致数据丢失
git branch -D <branch_name>

删除远程仓库的分支
git push origin --delete <branch_name>