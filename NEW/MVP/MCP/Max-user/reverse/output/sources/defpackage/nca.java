package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public abstract class nca {
    public static oca a;
    public static final nme b = new nme("CORE", 1);

    public static void a(oca ocaVar) {
        boolean z;
        synchronized (nca.class) {
            z = a != null;
        }
        if (z) {
            return;
        }
        synchronized (nca.class) {
            try {
                if (a != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                a = ocaVar;
            } finally {
            }
        }
    }

    public static boolean b(String str) {
        oca ocaVar;
        synchronized (nca.class) {
            ocaVar = a;
            if (ocaVar == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return ocaVar.c(str);
    }

    public static final byte[] c(File file) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            swi.a(fileInputStream, gZIPOutputStream);
            fileInputStream.close();
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } finally {
        }
    }

    public static q1g d(Context context) {
        Object ipdVar;
        Object baseContext = context;
        while (!(baseContext instanceof i7g)) {
            if (!(baseContext instanceof ContextWrapper)) {
                try {
                    i7g i7gVar = q1g.b0;
                    if (i7gVar == null) {
                        i7gVar = null;
                    }
                    ipdVar = i7gVar.f();
                } catch (Throwable th) {
                    ipdVar = new ipd(th);
                }
                if (kpd.a(ipdVar) != null) {
                    ipdVar = bq4.e0;
                }
                return (q1g) ipdVar;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((i7g) baseContext).f();
    }
}
