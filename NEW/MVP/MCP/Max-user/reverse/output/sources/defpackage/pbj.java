package defpackage;

import android.graphics.drawable.Drawable;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes.dex */
public abstract class pbj {
    public static final /* synthetic */ int a = 0;

    public static void a(Closeable... closeableArr) throws IOException {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    wqi.c("pbj", "Failed to close output stream: " + e.getMessage(), new Object[0]);
                }
            }
        }
    }

    public static boolean b(File file) {
        try {
            if (file.exists()) {
                return file.canRead();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean c(String str) {
        return !l8g.c(str) && b(new File(str));
    }

    public static final Drawable d(xcf xcfVar, int[] iArr) {
        int iD = xcfVar.w0.d(iArr);
        if (iD == -1) {
            return null;
        }
        return xcfVar.w0.c(iD);
    }

    public static long e(String str) {
        if (l8g.c(str)) {
            return 0L;
        }
        try {
            return new File(str).lastModified();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static Object f(File file) throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        ObjectInputStream objectInputStream;
        if (!b(file)) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                objectInputStream = new ObjectInputStream(fileInputStream);
                try {
                    Object object = objectInputStream.readObject();
                    a(fileInputStream, objectInputStream);
                    return object;
                } catch (Throwable th2) {
                    th = th2;
                    a(fileInputStream, objectInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
            }
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            objectInputStream = null;
        }
    }

    public static boolean g(File file, Object obj) throws Throwable {
        ObjectOutputStream objectOutputStream;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream2);
            } catch (Exception e) {
                e = e;
                objectOutputStream = null;
            } catch (Throwable th) {
                th = th;
                objectOutputStream = null;
            }
            try {
                objectOutputStream.writeObject(obj);
                a(fileOutputStream2, objectOutputStream);
                return true;
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = fileOutputStream2;
                try {
                    wqi.e("pbj", "Failed to store object to file", e);
                    a(fileOutputStream, objectOutputStream);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    a(fileOutputStream, objectOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
                a(fileOutputStream, objectOutputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            objectOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            objectOutputStream = null;
        }
    }
}
