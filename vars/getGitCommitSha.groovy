#!/usr/bin/env groovy

/**
  Get the current commit SHA from the .git folder.
  If the checkout was made by Jenkins, you would use the environment variable GIT_COMMIT.
  In other cases, you probably has to use this step.
  
  def sha = getGitCommitSha()
*/
def call() {
  sh "git rev-parse HEAD > .git/current-commit"
  return readFile(".git/current-commit").trim()
}