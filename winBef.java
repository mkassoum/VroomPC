
public class winBef {
    public static String maxPref = "powercfg -duplicatescheme e9a42b02-d5df-448d-aa00-03f14749eb61";
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
