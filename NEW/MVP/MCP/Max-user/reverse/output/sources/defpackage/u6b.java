package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.media.transformer.MediaTransformException;

/* loaded from: classes.dex */
public final class u6b {
    public static final /* synthetic */ int p = 0;
    public final Context a;
    public final qx5 b;
    public final age c;
    public final hx5 d;
    public final hc8 e;
    public final Handler f;
    public final CopyOnWriteArraySet g;
    public final yi5 h;
    public final d1e i;
    public final lzf j;
    public final k18 k;
    public final bwf l;
    public final bwf m;
    public final bwf n;
    public final AtomicBoolean o;

    public u6b(Context context, yi5 yi5Var, iz5 iz5Var, age ageVar, iya iyaVar, d1e d1eVar, lzf lzfVar, k18 k18Var) {
        hx5 hx5Var = iz5Var.b;
        this.f = new Handler(Looper.getMainLooper());
        this.g = new CopyOnWriteArraySet();
        this.a = context;
        this.d = hx5Var;
        this.b = iz5Var;
        this.c = ageVar;
        this.e = new hc8(context, iyaVar, yi5Var, 2);
        this.h = yi5Var;
        this.i = d1eVar;
        this.j = lzfVar;
        this.k = k18Var;
        final int i = 0;
        this.l = new bwf(new cm6(this) { // from class: r6b
            public final /* synthetic */ u6b b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return d7j.a(((q2b) this.b.j).b());
                    default:
                        u6b u6bVar = this.b;
                        return new vxd(u6bVar.i, ((q2b) u6bVar.j).b());
                }
            }
        });
        this.m = new bwf(new l3b(ageVar, 1, context));
        final int i2 = 1;
        this.n = new bwf(new cm6(this) { // from class: r6b
            public final /* synthetic */ u6b b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return d7j.a(((q2b) this.b.j).b());
                    default:
                        u6b u6bVar = this.b;
                        return new vxd(u6bVar.i, ((q2b) u6bVar.j).b());
                }
            }
        });
        this.o = new AtomicBoolean();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r22, java.lang.String r23, float r24, float r25, defpackage.isc r26, boolean r27, defpackage.snc r28) {
        /*
            r21 = this;
            r1 = r21
            java.util.concurrent.atomic.AtomicBoolean r9 = r1.o
            r0 = 1
            r9.set(r0)
            java.util.concurrent.CopyOnWriteArraySet r10 = r1.g
            boolean r2 = r10.isEmpty()
            android.os.Handler r11 = r1.f
            if (r2 != 0) goto L1b
            ak0 r2 = new ak0
            r3 = 1
            r2.<init>(r1)
            r11.post(r2)
        L1b:
            s6b r8 = new s6b
            r2 = r28
            r8.<init>(r2)
            r12 = 0
            android.net.Uri r14 = defpackage.xpi.q(r22)     // Catch: java.lang.Throwable -> L54
            if (r14 == 0) goto L80
            bwf r2 = r1.m     // Catch: java.lang.Throwable -> L54
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L54
            ka9 r2 = (defpackage.ka9) r2     // Catch: java.lang.Throwable -> L54
            bwf r2 = r2.e     // Catch: java.lang.Throwable -> L54
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L54
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L54
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L52
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r2 = r14
            boolean r13 = r1.i(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L54
            if (r13 == 0) goto L52
            r2 = r12
            goto L6b
        L52:
            r2 = r12
            goto L57
        L54:
            r0 = move-exception
            r2 = r12
            goto L89
        L57:
            android.content.Context r12 = r1.a     // Catch: java.lang.Throwable -> L7e
            yi5 r13 = r1.h     // Catch: java.lang.Throwable -> L7e
            r15 = r23
            r16 = r24
            r17 = r25
            r18 = r26
            r19 = r27
            r20 = r8
            boolean r0 = defpackage.v2h.a(r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L7e
        L6b:
            r9.set(r2)
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L7d
            ak0 r2 = new ak0
            r3 = 0
            r2.<init>(r1)
            r11.post(r2)
        L7d:
            return r0
        L7e:
            r0 = move-exception
            goto L89
        L80:
            r2 = r12
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7e
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L7e
            throw r3     // Catch: java.lang.Throwable -> L7e
        L89:
            r9.set(r2)
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L9b
            ak0 r2 = new ak0
            r3 = 0
            r2.<init>(r1)
            r11.post(r2)
        L9b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u6b.a(java.lang.String, java.lang.String, float, float, isc, boolean, snc):boolean");
    }

    public final String b(String str, String str2) {
        int iLastIndexOf;
        InputStream inputStreamOpenInputStream;
        Context context = this.a;
        InputStream inputStream = null;
        String strSubstring = (!l8g.c(str2) && (iLastIndexOf = str2.lastIndexOf(".")) >= 0) ? str2.substring(iLastIndexOf + 1) : null;
        String strReplaceAll = l8g.c(str) ? null : str.replaceAll(":", "_").replaceAll("//", "_").replaceAll("/", "_");
        wqi.c("xpi", "copyFromUri: generate file name from uri: uri = %s, generated name = %s", str, strReplaceAll);
        File fileM = ((iz5) this.b).m(strReplaceAll, strSubstring);
        wqi.c("xpi", "copyFromUri fromUriString = %s, copy = %s", str, fileM.getAbsolutePath());
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(Uri.parse(str));
            try {
                try {
                    gbj.g(fileM, inputStreamOpenInputStream);
                    String absolutePath = fileM.getAbsolutePath();
                    gbj.d(inputStreamOpenInputStream);
                    return absolutePath;
                } catch (Exception e) {
                    e = e;
                    wqi.f("xpi", "copyFromUri: failed to copy for uri %s, e: %s", str, e.toString());
                    if (fileM.exists()) {
                        fileM.delete();
                    }
                    gbj.d(inputStreamOpenInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                gbj.d(inputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            gbj.d(inputStream);
            throw th;
        }
    }

    public final void c(File file) {
        svi.e((f84) this.l.getValue(), null, null, new t6b(this, file, null), 3);
    }

    public final void d(File file, File file2) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(file.toString());
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(0L, 0);
                if (frameAtTime != null) {
                    try {
                        tfi.m(file2.toString(), frameAtTime, ((l5c) this.c).r(), Bitmap.CompressFormat.JPEG);
                    } catch (IOException unused) {
                    }
                    frameAtTime.recycle();
                }
                xc0.k(mediaMetadataRetriever);
            } finally {
            }
        } catch (Throwable th) {
            wqi.e("u6b", "fail to release", th);
        }
    }

    public final List e(String str) {
        try {
            return m7j.a(xpi.q(str), this.a, this);
        } catch (Throwable th) {
            wqi.e("u6b", "getAvailableQualitiesForVideo: failed", th);
            return null;
        }
    }

    public final q34 f(String str) {
        return xpi.d(this.a, str, this.d);
    }

    public final void g(String str, boolean z) {
        if (z) {
            zk6.e().f(rf7.b(str));
        } else {
            zk6.e().e(rf7.b(str), null);
        }
    }

    public final vah h(String str) throws Throwable {
        String absolutePath;
        j16 j16VarE = zpi.e(this.a, Uri.parse(str));
        Bitmap bitmap = (Bitmap) j16VarE.d;
        if (bitmap != null) {
            absolutePath = new File(((iz5) this.b).k(), String.valueOf(System.currentTimeMillis())).getAbsolutePath();
            try {
                tfi.m(absolutePath, bitmap, ((l5c) this.c).r(), Bitmap.CompressFormat.JPEG);
            } catch (IOException unused) {
            }
            bitmap.recycle();
        } else {
            absolutePath = null;
        }
        String str2 = absolutePath;
        Point point = (Point) j16VarE.e;
        int i = point.x;
        if (i == 0) {
            i = 480;
        }
        int i2 = i;
        int i3 = point.y;
        if (i3 == 0) {
            i3 = 270;
        }
        return new vah(j16VarE.b, str2, i2, i3);
    }

    public final boolean i(Uri uri, String str, float f, float f2, isc iscVar, boolean z, s6b s6bVar) {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "u6b", "transformMedia", null);
            }
        }
        ha9 ha9Var = new ha9(this.a);
        ha9Var.b.add(uri);
        ha9Var.c = str;
        ha9Var.g = f;
        ha9Var.h = f2;
        int i = iscVar.b;
        int i2 = iscVar.c;
        ha9Var.d = i;
        ha9Var.e = i2;
        ha9Var.f = iscVar.d;
        ha9Var.k = z;
        ha9Var.m = ((Boolean) ((ka9) this.m.getValue()).f.getValue()).booleanValue();
        ha9Var.l = ((Boolean) ((ka9) this.m.getValue()).g.getValue()).booleanValue();
        ha9Var.n = ((Number) ((ka9) this.m.getValue()).h.getValue()).intValue();
        ha9Var.o = s6bVar;
        gu5 gu5Var = (gu5) ((rt5) this.k.getValue());
        ha9Var.r = ((Boolean) gu5Var.B.D(gu5Var, gu5.S[15])).booleanValue();
        oa9 oa9VarW = ha9Var.a().w();
        if (oa9VarW instanceof na9) {
            return true;
        }
        if (!(oa9VarW instanceof ma9)) {
            throw new NoWhenBranchMatchedException();
        }
        yi5 yi5Var = this.h;
        MediaTransformException mediaTransformException = ((ma9) oa9VarW).f;
        ((y3b) yi5Var).a(new d1(mediaTransformException.getMessage(), mediaTransformException, 4));
        return false;
    }
}
