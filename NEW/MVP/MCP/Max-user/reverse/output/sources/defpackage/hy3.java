package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hy3 extends dtf implements sm6 {
    public hd5 X;
    public int Y;
    public final /* synthetic */ iy3 Z;
    public Collection o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy3(iy3 iy3Var, Continuation continuation) {
        super(2, continuation);
        this.Z = iy3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((hy3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new hy3(this.Z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r1 != r8) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.Y
            qqg r1 = defpackage.qqg.a
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            iy3 r7 = r10.Z
            g84 r8 = defpackage.g84.a
            if (r0 == 0) goto L40
            if (r0 == r6) goto L3c
            if (r0 == r5) goto L36
            if (r0 == r4) goto L30
            if (r0 == r3) goto L26
            if (r0 != r2) goto L1e
            defpackage.g8j.b(r11)
            goto L94
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            hd5 r0 = r10.X
            java.util.Collection r3 = r10.o
            java.util.List r3 = (java.util.List) r3
            defpackage.g8j.b(r11)
            goto L7e
        L30:
            java.util.Collection r0 = r10.o
            defpackage.g8j.b(r11)
            goto L6a
        L36:
            java.util.Collection r0 = r10.o
            defpackage.g8j.b(r11)
            goto L5a
        L3c:
            defpackage.g8j.b(r11)
            goto L4c
        L40:
            defpackage.g8j.b(r11)
            r10.Y = r6
            java.io.Serializable r11 = defpackage.iy3.c(r7, r10)
            if (r11 != r8) goto L4c
            goto L93
        L4c:
            r0 = r11
            java.util.Collection r0 = (java.util.Collection) r0
            r10.o = r0
            r10.Y = r5
            java.io.Serializable r11 = defpackage.iy3.d(r7, r10)
            if (r11 != r8) goto L5a
            goto L93
        L5a:
            java.util.Collection r11 = (java.util.Collection) r11
            r10.o = r11
            r10.Y = r4
            java.lang.Object r0 = defpackage.hui.b(r0, r10)
            if (r0 != r8) goto L67
            goto L93
        L67:
            r9 = r0
            r0 = r11
            r11 = r9
        L6a:
            java.util.List r11 = (java.util.List) r11
            r10.o = r11
            hd5 r4 = defpackage.hd5.a
            r10.X = r4
            r10.Y = r3
            java.lang.Object r0 = defpackage.hui.b(r0, r10)
            if (r0 != r8) goto L7b
            goto L93
        L7b:
            r3 = r11
            r11 = r0
            r0 = r4
        L7e:
            java.util.List r11 = (java.util.List) r11
            nx3 r4 = new nx3
            r4.<init>(r3, r0, r11)
            tcf r11 = r7.l
            r0 = 0
            r10.o = r0
            r10.X = r0
            r10.Y = r2
            r11.m(r0, r4)
            if (r1 != r8) goto L94
        L93:
            return r8
        L94:
            java.util.concurrent.atomic.AtomicBoolean r11 = r7.p
            r0 = 0
            r11.set(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy3.n(java.lang.Object):java.lang.Object");
    }
}
