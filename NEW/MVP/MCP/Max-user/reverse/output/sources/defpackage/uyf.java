package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class uyf {
    public final Context a;
    public final Object b;
    public volatile int c;
    public Object d;
    public final ArrayList e;

    public uyf(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.a = applicationContext;
        this.b = new Object();
        this.c = 1;
        this.e = new ArrayList();
    }

    public final void a(int i) {
        String str;
        Object objE;
        if (az1.b(this.c, i) >= 0) {
            return;
        }
        synchronized (this.b) {
            try {
                int i2 = this.c;
                if (az1.b(i2, i) >= 0) {
                    return;
                }
                Context context = this.a;
                String strB = d6j.b();
                if (strB.equals(context.getPackageName())) {
                    str = "tracer";
                } else {
                    str = "tracer-" + Uri.encode(dnf.p(strB, ':', '-', false));
                }
                File fileG = jz5.g(new File(context.getCacheDir(), str), "tags");
                int iV = az1.v(i2);
                if (iV == 0) {
                    int iV2 = az1.v(i);
                    if (iV2 != 1) {
                        if (iV2 != 2) {
                            throw new AssertionError("Unreachable code");
                        }
                        if (fileG.exists()) {
                            try {
                                nbj.a(fileG);
                            } catch (IOException unused) {
                                fileG.toString();
                            }
                        }
                    } else if (fileG.exists()) {
                        try {
                            objE = jz5.e(fileG);
                        } catch (IOException unused2) {
                            fileG.toString();
                        }
                        this.d = objE;
                    } else {
                        objE = hd5.a;
                        this.d = objE;
                    }
                } else {
                    if (iV != 1) {
                        throw new AssertionError("Unreachable code");
                    }
                    if (tyf.$EnumSwitchMapping$0[az1.v(i)] != 2) {
                        throw new AssertionError("Unreachable code");
                    }
                    if (fileG.exists()) {
                        try {
                            nbj.a(fileG);
                        } catch (IOException unused3) {
                            fileG.toString();
                        }
                    }
                    this.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final List b() {
        a(2);
        ?? r0 = this.d;
        if (r0 != 0) {
            return r0;
        }
        throw new IllegalStateException("Cannot get prev tags after clear");
    }

    public final void c(Map map) {
        boolean zA;
        synchronized (this.e) {
            zA = false;
            for (Map.Entry entry : map.entrySet()) {
                zA |= syf.a((String) entry.getKey(), (String) entry.getValue(), this.e);
            }
        }
        if (zA) {
            afg.a(new bee(17, this));
        }
    }
}
