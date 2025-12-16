package x01;

import com.adjust.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: x01.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C49723h {

    /* renamed from: a, reason: collision with root package name */
    public final String f442031a = AbstractC49722g.b().getFilesDir().getPath();

    public static boolean d(File file) {
        File[] fileArrListFiles;
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return false;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                if (!file2.delete()) {
                    m0.b("delete file failed : " + file2.getName());
                }
            } else if (file2.isDirectory()) {
                d(file2);
            }
        }
        return file.delete();
    }

    public static void e() {
        d(new File(AbstractC49722g.b().getFilesDir().getPath() + "/hms"));
    }

    public final String a(String str) {
        return this.f442031a + "/hms/component/".replace("component", str);
    }

    public final void b(String str, String str2) throws Throwable {
        boolean zCreateNewFile;
        File file = new File(a(str));
        File file2 = new File(a(str), "hianalytics_".concat(str));
        if (!file.exists() && file.mkdirs()) {
            m0.b("file directory is mkdirs");
        }
        if (file2.exists()) {
            zCreateNewFile = true;
        } else {
            try {
                zCreateNewFile = file2.createNewFile();
            } catch (IOException unused) {
                m0.e("hmsSdk", "create new file error!");
                zCreateNewFile = false;
            }
        }
        if (zCreateNewFile) {
            c0.c(file2, str2);
        } else {
            m0.e("hmsSdk", "refreshComponent():file is not found,and file is create failed");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, x01.U] */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    public final String c(String str) throws Throwable {
        boolean zCreateNewFile;
        String str2;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        ?? r32;
        File file = new File(a(str), "hianalytics_".concat(str));
        if (file.exists()) {
            zCreateNewFile = true;
        } else {
            try {
                zCreateNewFile = file.createNewFile();
            } catch (IOException unused) {
                m0.e("hmsSdk", "create new file error!");
                zCreateNewFile = false;
            }
        }
        if (!zCreateNewFile) {
            String strB = S01.b.b(128);
            c0.c(file, strB);
            return strB;
        }
        String str3 = "";
        FileInputStream fileInputStream3 = null;
        FileInputStream fileInputStream4 = null;
        FileInputStream fileInputStream5 = null;
        try {
            try {
                fileInputStream2 = new FileInputStream(file);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException unused2) {
        } catch (IOException unused3) {
        }
        try {
            ?? u12 = new U();
            u12.f442007b = 0;
            u12.f442006a = new byte[1024];
            byte[] bArr = new byte[1024];
            while (true) {
                r32 = fileInputStream2.read(bArr);
                if (r32 == -1) {
                    break;
                }
                u12.a(bArr, r32);
            }
            if (u12.f442007b == 0) {
                c0.b(fileInputStream2);
                fileInputStream3 = r32;
            } else {
                byte[] bArrB = u12.b();
                ?? r33 = Constants.ENCODING;
                String str4 = new String(bArrB, Constants.ENCODING);
                c0.b(fileInputStream2);
                str3 = str4;
                fileInputStream3 = r33;
            }
        } catch (FileNotFoundException unused4) {
            fileInputStream4 = fileInputStream2;
            str2 = "getInfoFromFile(): No files need to be read";
            fileInputStream = fileInputStream4;
            m0.e("hmsSdk", str2);
            c0.b(fileInputStream);
            fileInputStream3 = fileInputStream;
            return str3;
        } catch (IOException unused5) {
            fileInputStream5 = fileInputStream2;
            str2 = "getInfoFromFile(): stream.read or new string exception";
            fileInputStream = fileInputStream5;
            m0.e("hmsSdk", str2);
            c0.b(fileInputStream);
            fileInputStream3 = fileInputStream;
            return str3;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream3 = fileInputStream2;
            c0.b(fileInputStream3);
            throw th;
        }
        return str3;
    }
}
