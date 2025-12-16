package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.Settings;

/* loaded from: classes.dex */
public final class q7b {
    public final Context a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;

    public q7b(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, Context context) {
        this.a = context;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
        this.e = k18Var4;
        Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
    }

    public final tka a() {
        return (tka) this.e.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.pb2 r5, defpackage.q44 r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.m7b
            if (r0 == 0) goto L13
            r0 = r6
            m7b r0 = (defpackage.m7b) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            m7b r0 = new m7b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.X
            g84 r1 = defpackage.g84.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            pb2 r5 = r0.o
            q7b r0 = r0.d
            defpackage.g8j.b(r6)
            goto L4c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.g8j.b(r6)
            n7b r6 = new n7b
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.d = r4
            r0.o = r5
            r0.Z = r3
            r2 = 200(0xc8, double:9.9E-322)
            java.lang.Object r6 = defpackage.yei.g(r2, r6, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 != 0) goto L68
            tka r6 = r0.a()
            r6.getClass()
            r5.p0()
            r5.q0()
            java.lang.CharSequence r0 = r5.w0
            long r1 = r5.h()
            android.graphics.Bitmap r5 = r6.i(r0, r1)
            return r5
        L68:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q7b.b(pb2, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ku3 r5, defpackage.q44 r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.o7b
            if (r0 == 0) goto L13
            r0 = r6
            o7b r0 = (defpackage.o7b) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            o7b r0 = new o7b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.X
            int r1 = r0.Z
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            ku3 r5 = r0.o
            q7b r0 = r0.d
            defpackage.g8j.b(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.g8j.b(r6)
            p7b r6 = new p7b
            r1 = 0
            r6.<init>(r4, r5, r1)
            r0.d = r4
            r0.o = r5
            r0.Z = r2
            r1 = 200(0xc8, double:9.9E-322)
            java.lang.Object r6 = defpackage.yei.g(r1, r6, r0)
            g84 r0 = defpackage.g84.a
            if (r6 != r0) goto L4b
            return r0
        L4b:
            r0 = r4
        L4c:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 != 0) goto L64
            tka r6 = r0.a()
            r6.getClass()
            java.lang.CharSequence r0 = r5.o()
            long r1 = r5.p()
            android.graphics.Bitmap r5 = r6.i(r0, r1)
            return r5
        L64:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q7b.c(ku3, q44):java.lang.Object");
    }

    public final int d() {
        return a93.s0.x(this.a).k().b().a.n;
    }

    public final int e() {
        return Long.hashCode(((z7c) this.b.getValue()).a.s());
    }

    public final pma f(String str, boolean z) {
        if (str.length() == 0) {
            return null;
        }
        return new pma(str, z, new Uri.Builder().scheme("content").authority("ru.oneme.app.notifications").appendPath("message_image").appendPath(str).appendPath(String.valueOf(z)).build());
    }
}
