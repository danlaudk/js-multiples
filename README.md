demo of travis ci with property testing

todo: deployment with scalajs

# sums the multiples of a set of numbers, up to a limiting number
eg sumOfMultiples(Set(9,10),20) = 9+ 18 + 10 = 37

There were 100+ successful automatic build+deployments made on a scalajs project that was deploying to github-pages, and recursively building with each successive commit!! My idea was ultimately to do integration tests on the scalajs product

When I wanted to add property tests, I couldn't work out this time around how to use scalatest (which I relied on for property testing) with scalajs
I thus scrapped the deployment and scalajs components
