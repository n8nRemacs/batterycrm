package kotlin.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.io.i;
import kotlin.io.i.b;
import kotlin.text.C43047d;
import kotlin.text.C43066x;

@Metadata(d1 = {"kotlin/io/k", "kotlin/io/m", "kotlin/io/n", "kotlin/io/q"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 49)
/* loaded from: classes8.dex */
public final class j extends q {
    @Y61.k
    public static void b(@Y61.k File file, @Y61.k File file2) throws FileSystemException {
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (file2.exists()) {
            throw new FileAlreadyExistsException(file, file2, "The destination file already exists.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new FileSystemException(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                b.a(fileInputStream, fileOutputStream, 8192);
                c.a(fileOutputStream, null);
                c.a(fileInputStream, null);
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(fileInputStream, th2);
                throw th3;
            }
        }
    }

    public static boolean c(@Y61.k File file) {
        i.b bVar = new i(file, FileWalkDirection.f406765c).new b();
        while (true) {
            boolean z12 = true;
            while (bVar.hasNext()) {
                File next = bVar.next();
                if (!next.delete() && next.exists()) {
                    z12 = false;
                } else {
                    if (z12) {
                        break;
                    }
                    z12 = false;
                }
            }
            return z12;
        }
    }

    public static String d(File file) {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), C43047d.f410589b);
        try {
            String strC = w.c(inputStreamReader);
            c.a(inputStreamReader, null);
            return strC;
        } finally {
        }
    }

    @Y61.k
    public static File e(@Y61.k File file, @Y61.k String str) {
        int length;
        File file2;
        int iH2;
        File file3 = new File(str);
        String path = file3.getPath();
        char c12 = File.separatorChar;
        int iH3 = C43066x.H(c12, 0, 4, path);
        if (iH3 != 0) {
            length = (iH3 <= 0 || path.charAt(iH3 + (-1)) != ':') ? (iH3 == -1 && C43066x.A(path, ':')) ? path.length() : 0 : iH3 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c12 || (iH2 = C43066x.H(c12, 2, 4, path)) < 0) {
            length = 1;
        } else {
            int iH4 = C43066x.H(c12, iH2 + 1, 4, path);
            length = iH4 >= 0 ? iH4 + 1 : path.length();
        }
        if (length > 0) {
            return file3;
        }
        String string = file.toString();
        if ((string.length() == 0) || C43066x.A(string, c12)) {
            file2 = new File(string + file3);
        } else {
            file2 = new File(string + c12 + file3);
        }
        return file2;
    }

    public static void f(File file, String str) {
        Charset charset = C43047d.f410589b;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            m.a(fileOutputStream, str, charset);
            G0 g02 = G0.f406611a;
            c.a(fileOutputStream, null);
        } finally {
        }
    }
}
