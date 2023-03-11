# VroomPC
The VroomPC Performance Booster program is a tool designed to help improve the performance of PCs, particularly for gaming. It consists of two classes: Function and WinBef.

The Function class contains two methods. The first method, makeString, takes in a string as input and returns a concatenated string consisting of the string "Process Process = Runtime.getRuntime().exec(" followed by the input string and then the string ");". The purpose of this method is to allow the user to input a command as a string, which can then be passed to the Runtime.getRuntime().exec() method to execute the command as a process. This method is used in the runCom method of the Function class.

The second method in the Function class is the runCom method. This method takes in three strings as input: x, y, and z. These strings represent commands to be executed as processes. The method first checks to see if all three strings are not null. If they are not null, the method creates three Process objects using the Runtime.getRuntime().exec() method and assigns them to variables named Process, Process2, and Process3, respectively. If either y or z is null, the method only creates one or two Process objects, depending on which of y or z is null. The purpose of this method is to allow the user to execute multiple commands as separate processes, with the option to execute one or two commands if desired.

The WinBef class contains a number of static strings, each of which represents a command to be executed as a process. These commands are designed to make changes to the PC that will improve its performance for gaming. For example, the "powercfg.exe /setactive 8c5e7fda-e8bf-4a96-9a85-a6e23a8c635c" command sets the power plan to "High Performance", which is optimized for gaming. The "ipconfig /FlushDNS" command flushes the DNS resolver cache, which can help improve network performance. The "Reg Add HKCU\Software\Microsoft\Windows\CurrentVersion\BackgroundAccessApplications /v GlobalUserDisabled /t REG_DWORD /d 1 /f" command disables background access applications, which can free up system resources. The other commands make similar changes to the PC.

Overall, the Performance Booster program is a basic tool designed to help improve PC performance for gaming. It provides a simple interface for executing multiple commands as separate processes and includes a number of commands designed to make changes that can improve gaming performance. However, the program could benefit from additional features, such as the ability to customize the commands executed or to automatically detect and optimize settings for a particular game or hardware configuration. Additionally, some of the commands used may have unintended side effects or may not be appropriate for all hardware configurations, so caution should be exercised when using this program.
