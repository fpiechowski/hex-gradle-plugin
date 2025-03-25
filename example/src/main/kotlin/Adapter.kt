class Adapter(
    override val dependencyDomain: DependencyDomain,
) : Domain

fun adapter(dependencyDomain: DependencyDomain) = Adapter(dependencyDomain)
