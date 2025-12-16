package androidx.compose.ui.text;

import kotlin.Metadata;

/* compiled from: TextPainter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/t0;", "", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final t0 f42728a = new t0();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(@Y61.k androidx.compose.ui.graphics.M r11, @Y61.k androidx.compose.ui.text.o0 r12) {
        /*
            boolean r0 = r12.e()
            androidx.compose.ui.text.n0 r1 = r12.f42526a
            if (r0 == 0) goto L19
            int r0 = r1.f42511f
            androidx.compose.ui.text.style.s$a r2 = androidx.compose.ui.text.style.s.f42720b
            r2.getClass()
            int r2 = androidx.compose.ui.text.style.s.f42723e
            boolean r0 = androidx.compose.ui.text.style.s.a(r0, r2)
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 == 0) goto L4d
            long r2 = r12.f42528c
            r4 = 32
            long r5 = r2 >> r4
            int r5 = (int) r5
            float r5 = (float) r5
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            int r2 = (int) r2
            float r2 = (float) r2
            l0.g$a r3 = l0.g.f413384b
            r3.getClass()
            int r3 = java.lang.Float.floatToRawIntBits(r5)
            long r8 = (long) r3
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r2
            long r4 = r8 << r4
            long r2 = r2 & r6
            long r2 = r2 | r4
            l0.n$a r4 = l0.n.f413402b
            r4 = 0
            l0.j r2 = l0.k.a(r4, r2)
            r11.k()
            androidx.compose.ui.graphics.M.o(r11, r2)
        L4d:
            androidx.compose.ui.text.x0 r1 = r1.f42507b
            androidx.compose.ui.text.e0 r1 = r1.f42739a
            androidx.compose.ui.text.style.j r2 = r1.background
            androidx.compose.ui.text.style.m r3 = r1.f42142a
            if (r2 != 0) goto L5e
            androidx.compose.ui.text.style.j$a r2 = androidx.compose.ui.text.style.j.f42684b
            r2.getClass()
            androidx.compose.ui.text.style.j r2 = androidx.compose.ui.text.style.j.f42685c
        L5e:
            r9 = r2
            androidx.compose.ui.graphics.f1 r2 = r1.shadow
            if (r2 != 0) goto L6a
            androidx.compose.ui.graphics.f1$a r2 = androidx.compose.ui.graphics.f1.f39508d
            r2.getClass()
            androidx.compose.ui.graphics.f1 r2 = androidx.compose.ui.graphics.f1.f39509e
        L6a:
            r8 = r2
            androidx.compose.ui.graphics.drawscope.j r1 = r1.drawStyle
            if (r1 != 0) goto L71
            androidx.compose.ui.graphics.drawscope.n r1 = androidx.compose.ui.graphics.drawscope.n.f39497a
        L71:
            r10 = r1
            androidx.compose.ui.graphics.J r6 = r3.c()     // Catch: java.lang.Throwable -> L82
            if (r6 == 0) goto L8e
            androidx.compose.ui.text.style.m$b r1 = androidx.compose.ui.text.style.m.b.f42699b     // Catch: java.lang.Throwable -> L82
            if (r3 == r1) goto L84
            float r1 = r3.getF42632c()     // Catch: java.lang.Throwable -> L82
        L80:
            r7 = r1
            goto L87
        L82:
            r12 = move-exception
            goto Lac
        L84:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L80
        L87:
            androidx.compose.ui.text.G r4 = r12.f42527b     // Catch: java.lang.Throwable -> L82
            r5 = r11
            androidx.compose.ui.text.G.l(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L82
            goto La6
        L8e:
            androidx.compose.ui.text.style.m$b r1 = androidx.compose.ui.text.style.m.b.f42699b     // Catch: java.lang.Throwable -> L82
            if (r3 == r1) goto L98
            long r1 = r3.getF42633b()     // Catch: java.lang.Throwable -> L82
        L96:
            r6 = r1
            goto La0
        L98:
            androidx.compose.ui.graphics.T$a r1 = androidx.compose.ui.graphics.T.f39320b     // Catch: java.lang.Throwable -> L82
            r1.getClass()     // Catch: java.lang.Throwable -> L82
            long r1 = androidx.compose.ui.graphics.T.f39321c     // Catch: java.lang.Throwable -> L82
            goto L96
        La0:
            androidx.compose.ui.text.G r4 = r12.f42527b     // Catch: java.lang.Throwable -> L82
            r5 = r11
            androidx.compose.ui.text.G.j(r4, r5, r6, r8, r9, r10)     // Catch: java.lang.Throwable -> L82
        La6:
            if (r0 == 0) goto Lab
            r11.i()
        Lab:
            return
        Lac:
            if (r0 == 0) goto Lb1
            r11.i()
        Lb1:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.t0.a(androidx.compose.ui.graphics.M, androidx.compose.ui.text.o0):void");
    }
}
