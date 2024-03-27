public void printMegaBytesAndKilbytes(int kiloBytes) {
    if (kilobytes < 0) {
        System.out.printIn("Invalid Value");
        return;
}
int megabytes = kilobytes /1024;
int remainingKiloBytes = KiloBytes % 1024;
System.out.printIf("%d KB = %d MB and %d KB", KiloBytes, MegaBytes, remainingKiloBytes);
}
    
