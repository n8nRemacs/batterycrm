package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ix2 extends dtf implements sm6 {
    public final /* synthetic */ zx2 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ CharSequence Z;
    public int o;
    public final /* synthetic */ List s0;
    public final /* synthetic */ boolean t0;
    public final /* synthetic */ Long u0;
    public final /* synthetic */ vf6 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix2(zx2 zx2Var, long j, CharSequence charSequence, List list, boolean z, Long l, vf6 vf6Var, Continuation continuation) {
        super(2, continuation);
        this.X = zx2Var;
        this.Y = j;
        this.Z = charSequence;
        this.s0 = list;
        this.t0 = z;
        this.u0 = l;
        this.v0 = vf6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ix2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ix2(this.X, this.Y, this.Z, this.s0, this.t0, this.u0, this.v0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (r0 == r12) goto L24;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.o
            r9 = 2
            java.util.List r4 = r13.s0
            r10 = 1
            zx2 r11 = r13.X
            g84 r12 = defpackage.g84.a
            if (r0 == 0) goto L22
            if (r0 == r10) goto L1e
            if (r0 != r9) goto L16
            defpackage.g8j.b(r14)
            r0 = r14
            goto L90
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1e:
            defpackage.g8j.b(r14)
            goto L44
        L22:
            defpackage.g8j.b(r14)
            bwf r0 = r11.E0
            java.lang.Object r0 = r0.getValue()
            ide r0 = (defpackage.ide) r0
            r13.o = r10
            long r1 = r13.Y
            java.lang.CharSequence r3 = r13.Z
            boolean r6 = r13.t0
            r7 = r6
            java.lang.Long r6 = r13.u0
            r8 = r7
            vf6 r7 = r13.v0
            r5 = r8
            r8 = r13
            java.lang.Object r0 = r0.a(r1, r3, r4, r5, r6, r7, r8)
            if (r0 != r12) goto L44
            goto L8f
        L44:
            r11.w()
            boolean r0 = r13.t0
            if (r0 == 0) goto L51
            int r0 = r4.size()
        L4f:
            r2 = r0
            goto L79
        L51:
            k18 r0 = r11.z0
            java.lang.Object r0 = r0.getValue()
            age r0 = (defpackage.age) r0
            l5c r0 = (defpackage.l5c) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r1 = ru.ok.tamtam.android.prefs.PmsKey.f78maxattachcount
            r2 = 12
            long r2 = (long) r2
            long r0 = r0.m(r1, r2)
            int r0 = (int) r0
            int r1 = r4.size()
            int r1 = r1 / r0
            int r2 = r4.size()
            int r2 = r2 % r0
            if (r2 == 0) goto L75
            goto L76
        L75:
            r10 = 0
        L76:
            int r0 = r1 + r10
            goto L4f
        L79:
            k18 r0 = r11.F0
            java.lang.Object r0 = r0.getValue()
            r3 = r0
            ew0 r3 = (defpackage.ew0) r3
            r13.o = r9
            long r0 = r13.Y
            vf6 r4 = r13.v0
            r5 = r13
            java.lang.Object r0 = defpackage.v17.f(r0, r2, r3, r4, r5)
            if (r0 != r12) goto L90
        L8f:
            return r12
        L90:
            ew2 r0 = (defpackage.ew2) r0
            ci5 r1 = r11.d1
            defpackage.xfh.r(r1, r0)
            qqg r0 = defpackage.qqg.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix2.n(java.lang.Object):java.lang.Object");
    }
}
