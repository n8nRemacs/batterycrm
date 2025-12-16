package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xtf extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ytf Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtf(ytf ytfVar, Continuation continuation) {
        super(2, continuation);
        this.Y = ytfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xtf) l((ttg) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xtf xtfVar = new xtf(this.Y, continuation);
        xtfVar.X = obj;
        return xtfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r5.h(r3, r7) == r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r5.f(r8, r7) == r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        return r6;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.o
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L17
            if (r0 == r2) goto L13
            if (r0 != r1) goto Lb
            goto L13
        Lb:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L13:
            defpackage.g8j.b(r8)
            goto L4c
        L17:
            defpackage.g8j.b(r8)
            java.lang.Object r8 = r7.X
            ttg r8 = (defpackage.ttg) r8
            boolean r0 = r8.a()
            bug r3 = r8.a
            if (r0 == 0) goto L4c
            wvg r0 = r3.c
            r0.getClass()
            wvg r4 = defpackage.wvg.Y
            ytf r5 = r7.Y
            g84 r6 = defpackage.g84.a
            if (r0 != r4) goto L34
            goto L3a
        L34:
            boolean r0 = r0.a()
            if (r0 == 0) goto L43
        L3a:
            r7.o = r2
            java.lang.Object r8 = r5.h(r3, r7)
            if (r8 != r6) goto L4c
            goto L4b
        L43:
            r7.o = r1
            java.lang.Object r8 = r5.f(r8, r7)
            if (r8 != r6) goto L4c
        L4b:
            return r6
        L4c:
            qqg r8 = defpackage.qqg.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xtf.n(java.lang.Object):java.lang.Object");
    }
}
