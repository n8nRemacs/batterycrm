package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public final class qg8 {
    public final int a;
    public final Context b;
    public final Object c;
    public volatile int d;
    public js e;
    public int f;
    public File g;
    public int h;
    public final ConcurrentLinkedQueue i;
    public final long j;

    public qg8(Context context, int i) {
        this.a = i;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.b = applicationContext;
        this.c = new Object();
        this.d = 1;
        this.f = 1;
        this.i = new ConcurrentLinkedQueue();
        this.j = System.currentTimeMillis();
    }

    public final void a(int i) {
        if (az1.b(this.d, i) >= 0) {
            return;
        }
        synchronized (this.c) {
            try {
                int i2 = this.d;
                if (az1.b(i2, i) >= 0) {
                    return;
                }
                Context context = this.b;
                String strB = d6j.b();
                File fileG = jz5.g(new File(context.getCacheDir(), strB.equals(context.getPackageName()) ? "tracer" : "tracer-" + Uri.encode(dnf.p(strB, ':', '-', false))), "logs");
                File fileG2 = jz5.g(fileG, "a.log");
                File fileG3 = jz5.g(fileG, "b.log");
                File fileG4 = jz5.g(fileG, "stash-a.log");
                File fileG5 = jz5.g(fileG, "stash-b.log");
                int iV = az1.v(i2);
                if (iV == 0) {
                    int iV2 = az1.v(i);
                    if (iV2 == 1) {
                        v1a.l(fileG4, fileG5);
                        imb[] imbVarArr = {new imb(fileG2, fileG4), new imb(fileG3, fileG5)};
                        for (int i3 = 0; i3 < 2; i3++) {
                            imb imbVar = imbVarArr[i3];
                            File file = (File) imbVar.a;
                            File file2 = (File) imbVar.b;
                            if (file.exists()) {
                                try {
                                    file.renameTo(file2);
                                } catch (IOException unused) {
                                    file.toString();
                                    Objects.toString(file2);
                                }
                            }
                        }
                    } else if (iV2 == 2) {
                        this.e = v1a.m(new File[]{fileG2, fileG3}, this.a);
                        v1a.l(fileG2, fileG3);
                    } else {
                        if (iV2 != 3) {
                            throw new AssertionError("Unreachable code");
                        }
                        v1a.l(fileG4, fileG5);
                        v1a.l(fileG2, fileG3);
                    }
                } else if (iV == 1) {
                    int iV3 = az1.v(i);
                    if (iV3 == 2) {
                        this.e = v1a.m(new File[]{fileG4, fileG5}, this.a);
                        v1a.l(fileG4, fileG5);
                    } else {
                        if (iV3 != 3) {
                            throw new AssertionError("Unreachable code");
                        }
                        v1a.l(fileG4, fileG5);
                    }
                } else {
                    if (iV != 2) {
                        throw new AssertionError("Unreachable code");
                    }
                    if (pg8.$EnumSwitchMapping$1[az1.v(i)] != 3) {
                        throw new AssertionError("Unreachable code");
                    }
                    this.e = null;
                }
                this.d = i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
