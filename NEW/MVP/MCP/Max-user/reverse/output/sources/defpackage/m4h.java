package defpackage;

import android.os.Build;
import android.view.Display;
import android.view.Surface;

/* loaded from: classes.dex */
public final class m4h {
    public final /* synthetic */ int a;
    public boolean b;
    public Surface c;
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public final Object p;
    public final i4h q;
    public final Object r;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m4h(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r4.a = r6
            switch(r6) {
                case 1: goto L6e;
                default: goto L5;
            }
        L5:
            r4.<init>()
            j16 r6 = new j16
            r6.<init>()
            i16 r0 = new i16
            r1 = 0
            r0.<init>(r1)
            r6.d = r0
            i16 r0 = new i16
            r0.<init>(r1)
            r6.e = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.b = r0
            r4.p = r6
            r6 = 0
            if (r5 == 0) goto L55
            android.content.Context r5 = r5.getApplicationContext()
            int r2 = defpackage.xxg.a
            r3 = 17
            if (r2 < r3) goto L42
            java.lang.String r2 = "display"
            java.lang.Object r2 = r5.getSystemService(r2)
            android.hardware.display.DisplayManager r2 = (android.hardware.display.DisplayManager) r2
            if (r2 == 0) goto L42
            j4h r3 = new j4h
            r3.<init>(r2)
            goto L43
        L42:
            r3 = r6
        L43:
            if (r3 != 0) goto L56
            java.lang.String r2 = "window"
            java.lang.Object r5 = r5.getSystemService(r2)
            android.view.WindowManager r5 = (android.view.WindowManager) r5
            if (r5 == 0) goto L55
            zid r3 = new zid
            r3.<init>(r5)
            goto L56
        L55:
            r3 = r6
        L56:
            r4.q = r3
            if (r3 == 0) goto L5c
            k4h r6 = defpackage.k4h.o
        L5c:
            r4.r = r6
            r4.i = r0
            r4.j = r0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.d = r5
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.g = r5
            r5 = 0
            r4.h = r5
            return
        L6e:
            r4.<init>()
            j16 r6 = new j16
            r6.<init>()
            i16 r0 = new i16
            r1 = 1
            r0.<init>(r1)
            r6.d = r0
            i16 r0 = new i16
            r0.<init>(r1)
            r6.e = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.b = r0
            r4.p = r6
            r6 = 0
            if (r5 != 0) goto L93
        L91:
            r2 = r6
            goto La2
        L93:
            java.lang.String r2 = "display"
            java.lang.Object r5 = r5.getSystemService(r2)
            android.hardware.display.DisplayManager r5 = (android.hardware.display.DisplayManager) r5
            if (r5 == 0) goto L91
            j4h r2 = new j4h
            r2.<init>(r4, r5)
        La2:
            r4.q = r2
            if (r2 == 0) goto La8
            l4h r6 = defpackage.l4h.o
        La8:
            r4.r = r6
            r4.i = r0
            r4.j = r0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.d = r5
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.g = r5
            r5 = 0
            r4.h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m4h.<init>(android.content.Context, int):void");
    }

    public static void a(m4h m4hVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            m4hVar.i = refreshRate;
            m4hVar.j = (refreshRate * 80) / 100;
        } else {
            a8i.l("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            m4hVar.i = -9223372036854775807L;
            m4hVar.j = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        Surface surface2;
        switch (this.a) {
            case 0:
                if (xxg.a >= 30 && (surface = this.c) != null && this.h != Integer.MIN_VALUE && this.f != 0.0f) {
                    this.f = 0.0f;
                    h4h.a(surface, 0.0f);
                    break;
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 30 && (surface2 = this.c) != null && this.h != Integer.MIN_VALUE && this.f != 0.0f) {
                    this.f = 0.0f;
                    try {
                        surface2.setFrameRate(0.0f, 0);
                        break;
                    } catch (IllegalStateException e) {
                        a8i.h("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m4h.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r5) {
        /*
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto L47;
                default: goto L5;
            }
        L5:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L46
            android.view.Surface r0 = r4.c
            if (r0 == 0) goto L46
            int r1 = r4.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L16
            goto L46
        L16:
            boolean r1 = r4.b
            r2 = 0
            if (r1 == 0) goto L27
            float r1 = r4.e
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L27
            float r3 = r4.g
            float r1 = r1 * r3
            goto L28
        L27:
            r1 = r2
        L28:
            if (r5 != 0) goto L31
            float r5 = r4.f
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L31
            goto L46
        L31:
            r4.f = r1
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L39
            r5 = 0
            goto L3a
        L39:
            r5 = 1
        L3a:
            defpackage.jlb.t(r0, r1, r5)     // Catch: java.lang.IllegalStateException -> L3e
            goto L46
        L3e:
            r5 = move-exception
            java.lang.String r0 = "VideoFrameReleaseHelper"
            java.lang.String r1 = "Failed to call Surface.setFrameRate"
            defpackage.a8i.h(r0, r1, r5)
        L46:
            return
        L47:
            int r0 = defpackage.xxg.a
            r1 = 30
            if (r0 < r1) goto L77
            android.view.Surface r0 = r4.c
            if (r0 == 0) goto L77
            int r1 = r4.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L58
            goto L77
        L58:
            boolean r1 = r4.b
            if (r1 == 0) goto L68
            float r1 = r4.e
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L68
            float r2 = r4.g
            float r1 = r1 * r2
            goto L69
        L68:
            r1 = 0
        L69:
            if (r5 != 0) goto L72
            float r5 = r4.f
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L72
            goto L77
        L72:
            r4.f = r1
            defpackage.h4h.a(r0, r1)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m4h.d(boolean):void");
    }
}
