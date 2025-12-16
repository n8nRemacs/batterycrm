package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class cl4 implements qe4 {
    public y24 X;
    public qe4 Y;
    public cqg Z;
    public final Context a;
    public final ArrayList b;
    public final qe4 c;
    public wv5 d;
    public wt o;
    public le4 s0;
    public o8d t0;
    public qe4 u0;

    public cl4(Context context, qe4 qe4Var) {
        this.a = context.getApplicationContext();
        qe4Var.getClass();
        this.c = qe4Var;
        this.b = new ArrayList();
    }

    public static void c(qe4 qe4Var, vgg vggVar) {
        if (qe4Var != null) {
            qe4Var.S(vggVar);
        }
    }

    @Override // defpackage.qe4
    public final long R(ye4 ye4Var) {
        fsi.d(this.u0 == null);
        Uri uri = ye4Var.a;
        String scheme = uri.getScheme();
        int i = xxg.a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    wv5 wv5Var = new wv5(false);
                    this.d = wv5Var;
                    b(wv5Var);
                }
                this.u0 = this.d;
            } else {
                if (this.o == null) {
                    wt wtVar = new wt(context);
                    this.o = wtVar;
                    b(wtVar);
                }
                this.u0 = this.o;
            }
        } else if ("asset".equals(scheme)) {
            if (this.o == null) {
                wt wtVar2 = new wt(context);
                this.o = wtVar2;
                b(wtVar2);
            }
            this.u0 = this.o;
        } else if ("content".equals(scheme)) {
            if (this.X == null) {
                y24 y24Var = new y24(context);
                this.X = y24Var;
                b(y24Var);
            }
            this.u0 = this.X;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            qe4 qe4Var = this.c;
            if (zEquals) {
                if (this.Y == null) {
                    try {
                        qe4 qe4Var2 = (qe4) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.Y = qe4Var2;
                        b(qe4Var2);
                    } catch (ClassNotFoundException unused) {
                        Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.Y == null) {
                        this.Y = qe4Var;
                    }
                }
                this.u0 = this.Y;
            } else if ("udp".equals(scheme)) {
                if (this.Z == null) {
                    cqg cqgVar = new cqg();
                    this.Z = cqgVar;
                    b(cqgVar);
                }
                this.u0 = this.Z;
            } else if ("data".equals(scheme)) {
                if (this.s0 == null) {
                    le4 le4Var = new le4(false);
                    this.s0 = le4Var;
                    b(le4Var);
                }
                this.u0 = this.s0;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.t0 == null) {
                    o8d o8dVar = new o8d(context);
                    this.t0 = o8dVar;
                    b(o8dVar);
                }
                this.u0 = this.t0;
            } else {
                this.u0 = qe4Var;
            }
        }
        return this.u0.R(ye4Var);
    }

    @Override // defpackage.qe4
    public final void S(vgg vggVar) {
        vggVar.getClass();
        this.c.S(vggVar);
        this.b.add(vggVar);
        c(this.d, vggVar);
        c(this.o, vggVar);
        c(this.X, vggVar);
        c(this.Y, vggVar);
        c(this.Z, vggVar);
        c(this.s0, vggVar);
        c(this.t0, vggVar);
    }

    public final void b(qe4 qe4Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            qe4Var.S((vgg) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.qe4
    public final void close() {
        qe4 qe4Var = this.u0;
        if (qe4Var != null) {
            try {
                qe4Var.close();
            } finally {
                this.u0 = null;
            }
        }
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        qe4 qe4Var = this.u0;
        if (qe4Var == null) {
            return null;
        }
        return qe4Var.getUri();
    }

    @Override // defpackage.je4
    public final int read(byte[] bArr, int i, int i2) {
        qe4 qe4Var = this.u0;
        qe4Var.getClass();
        return qe4Var.read(bArr, i, i2);
    }

    @Override // defpackage.qe4
    public final Map x() {
        qe4 qe4Var = this.u0;
        return qe4Var == null ? Collections.EMPTY_MAP : qe4Var.x();
    }
}
