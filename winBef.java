
public class winBef {
    public static String maxPref = "powercfg.exe /setactive 8c5e7fda-e8bf-4a96-9a85-a6e23a8c635c";
    public static String flushDNS = "ipconfig /FlushDNS";
    public static String disBackG = "Reg Add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\BackgroundAccessApplications /v GlobalUserDisabled /t REG_DWORD /d 1 /f";
    public static String minRes1 = "bcdedit /set useplatformtick yes";
    public static String minRes2 = "bcdedit /set disabledynamictick yes";
    public static String minRes3 = "bcdedit /deletevalue useplatformclock";
    public static String resetP = "powercfg.exe /setactive 381b4222-f694-41f0-9685-ff5bb260df2e";

    public static String enBackG = "Reg Add HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\BackgroundAccessApplications /v GlobalUserDisabled /t REG_DWORD /d 0 /f";


    public winBef() {
    }
}
