package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class dl4 implements se4 {
    public z24 X;
    public se4 Y;
    public dqg Z;
    public final Context a;
    public final ArrayList b;
    public final se4 c;
    public xv5 d;
    public xt o;
    public me4 s0;
    public p8d t0;
    public se4 u0;

    public dl4(Context context, se4 se4Var) {
        this.a = context.getApplicationContext();
        se4Var.getClass();
        this.c = se4Var;
        this.b = new ArrayList();
    }

    public static void c(se4 se4Var, wgg wggVar) {
        if (se4Var != null) {
            se4Var.I(wggVar);
        }
    }

    @Override // defpackage.se4
    public final long H(ze4 ze4Var) {
        hsi.g(this.u0 == null);
        Uri uri = ze4Var.a;
        String scheme = uri.getScheme();
        String str = zxg.a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    xv5 xv5Var = new xv5(false);
                    this.d = xv5Var;
                    b(xv5Var);
                }
                this.u0 = this.d;
            } else {
                if (this.o == null) {
                    xt xtVar = new xt(context);
                    this.o = xtVar;
                    b(xtVar);
                }
                this.u0 = this.o;
            }
        } else if ("asset".equals(scheme)) {
            if (this.o == null) {
                xt xtVar2 = new xt(context);
                this.o = xtVar2;
                b(xtVar2);
            }
            this.u0 = this.o;
        } else if ("content".equals(scheme)) {
            if (this.X == null) {
                z24 z24Var = new z24(context);
                this.X = z24Var;
                b(z24Var);
            }
            this.u0 = this.X;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            se4 se4Var = this.c;
            if (zEquals) {
                if (this.Y == null) {
                    try {
                        int i = wud.Y;
                        se4 se4Var2 = (se4) wud.class.getConstructor(null).newInstance(null);
                        this.Y = se4Var2;
                        b(se4Var2);
                    } catch (ClassNotFoundException unused) {
                        a8i.l("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.Y == null) {
                        this.Y = se4Var;
                    }
                }
                this.u0 = this.Y;
            } else if ("udp".equals(scheme)) {
                if (this.Z == null) {
                    dqg dqgVar = new dqg();
                    this.Z = dqgVar;
                    b(dqgVar);
                }
                this.u0 = this.Z;
            } else if ("data".equals(scheme)) {
                if (this.s0 == null) {
                    me4 me4Var = new me4(false);
                    this.s0 = me4Var;
                    b(me4Var);
                }
                this.u0 = this.s0;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.t0 == null) {
                    p8d p8dVar = new p8d(context);
                    this.t0 = p8dVar;
                    b(p8dVar);
                }
                this.u0 = this.t0;
            } else {
                this.u0 = se4Var;
            }
        }
        return this.u0.H(ze4Var);
    }

    @Override // defpackage.se4
    public final void I(wgg wggVar) {
        wggVar.getClass();
        this.c.I(wggVar);
        this.b.add(wggVar);
        c(this.d, wggVar);
        c(this.o, wggVar);
        c(this.X, wggVar);
        c(this.Y, wggVar);
        c(this.Z, wggVar);
        c(this.s0, wggVar);
        c(this.t0, wggVar);
    }

    public final void b(se4 se4Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            se4Var.I((wgg) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.se4
    public final void close() {
        se4 se4Var = this.u0;
        if (se4Var != null) {
            try {
                se4Var.close();
            } finally {
                this.u0 = null;
            }
        }
    }

    @Override // defpackage.se4
    public final Uri getUri() {
        se4 se4Var = this.u0;
        if (se4Var == null) {
            return null;
        }
        return se4Var.getUri();
    }

    @Override // defpackage.ke4
    public final int read(byte[] bArr, int i, int i2) {
        se4 se4Var = this.u0;
        se4Var.getClass();
        return se4Var.read(bArr, i, i2);
    }

    @Override // defpackage.se4
    public final Map x() {
        se4 se4Var = this.u0;
        return se4Var == null ? Collections.EMPTY_MAP : se4Var.x();
    }
}
