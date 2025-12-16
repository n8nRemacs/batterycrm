package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ic6 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ oc6 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic6(oc6 oc6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = oc6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ic6) l((List) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ic6 ic6Var = new ic6(this.Y, continuation);
        ic6Var.X = obj;
        return ic6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r15 == r7) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6 A[RETURN] */
    /* JADX WARN: Type inference failed for: r5v1, types: [hd5] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r15) {
        /*
            r14 = this;
            oc6 r0 = r14.Y
            va4 r1 = r0.b
            int r2 = r14.o
            qqg r3 = defpackage.qqg.a
            r4 = 2
            r5 = 1
            r6 = 0
            g84 r7 = defpackage.g84.a
            if (r2 == 0) goto L27
            if (r2 == r5) goto L1f
            if (r2 != r4) goto L17
            defpackage.g8j.b(r15)
            return r3
        L17:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1f:
            java.lang.Object r2 = r14.X
            java.util.List r2 = (java.util.List) r2
            defpackage.g8j.b(r15)
            goto L41
        L27:
            defpackage.g8j.b(r15)
            java.lang.Object r15 = r14.X
            r2 = r15
            java.util.List r2 = (java.util.List) r2
            boolean r15 = r1.f()
            if (r15 == 0) goto L78
            r14.X = r2
            r14.o = r5
            java.io.Serializable r15 = r1.j(r14)
            if (r15 != r7) goto L41
            goto Le5
        L41:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r5 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.we3.q(r15, r8)
            r5.<init>(r8)
            java.util.Iterator r15 = r15.iterator()
        L52:
            boolean r8 = r15.hasNext()
            if (r8 == 0) goto L7a
            java.lang.Object r8 = r15.next()
            f86 r8 = (defpackage.f86) r8
            fxg r9 = new fxg
            if (r8 == 0) goto L65
            java.lang.CharSequence r10 = r8.b
            goto L66
        L65:
            r10 = r6
        L66:
            if (r10 != 0) goto L6a
            java.lang.String r10 = ""
        L6a:
            r5g r11 = new r5g
            r11.<init>(r10)
            exg r10 = defpackage.exg.d
            r9.<init>(r8, r10, r11)
            r5.add(r9)
            goto L52
        L78:
            hd5 r5 = defpackage.hd5.a
        L7a:
            java.util.ArrayList r15 = new java.util.ArrayList
            int r8 = r2.size()
            r15.<init>(r8)
            java.util.Iterator r2 = r2.iterator()
        L87:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto Lc0
            java.lang.Object r8 = r2.next()
            f86 r8 = (defpackage.f86) r8
            fxg r9 = new fxg
            java.lang.String r10 = r8.a
            java.lang.String r11 = "all.chat.folder"
            boolean r10 = defpackage.fni.a(r10, r11)
            if (r10 == 0) goto La2
            exg r10 = defpackage.exg.a
            goto La4
        La2:
            exg r10 = defpackage.exg.b
        La4:
            k18 r11 = r0.d
            java.lang.Object r11 = r11.getValue()
            e7b r11 = (defpackage.e7b) r11
            java.lang.CharSequence r12 = r8.b
            java.util.List r13 = r8.X
            java.lang.CharSequence r11 = defpackage.e7b.b(r11, r12, r13)
            r5g r12 = new r5g
            r12.<init>(r11)
            r9.<init>(r8, r10, r12)
            r15.add(r9)
            goto L87
        Lc0:
            boolean r1 = r1.f()
            if (r1 == 0) goto Lda
            fxg r1 = new fxg
            int r2 = defpackage.f5b.l
            n5g r8 = new n5g
            r8.<init>(r2)
            exg r2 = defpackage.exg.c
            r1.<init>(r6, r2, r8)
            r15.add(r1)
            r15.addAll(r5)
        Lda:
            tcf r0 = r0.s0
            r14.X = r6
            r14.o = r4
            r0.m(r6, r15)
            if (r3 != r7) goto Le6
        Le5:
            return r7
        Le6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ic6.n(java.lang.Object):java.lang.Object");
    }
}
