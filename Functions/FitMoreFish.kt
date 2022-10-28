fun fitMoreFish(tankSize: int, currentFish: Array<int>, fishSize: int = 2, hasDecorations: boolean = true): boolean {
    int totalSize =0
    for (i in currentFish.size) {
        totalSize += i
    }
    if (hasDecorations) {
        int left =(tankSize * 0.8) - totalSize
        if (left >= fishSize) {
            return true
        }
        return false
    } else {
        int left = tankSize -totalSize
        if (left >= fishSize) {
            return true
        }
        return false
    }
}
