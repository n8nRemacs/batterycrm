package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class is9 extends dtf implements sm6 {
    public vu9 X;
    public Object Y;
    public int Z;
    public f9a o;
    public final /* synthetic */ vu9 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is9(vu9 vu9Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = vu9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((is9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new is9(this.s0, continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0039 -> B:12:0x003c). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.Z
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            java.lang.Object r0 = r5.Y
            vu9 r2 = r5.X
            f9a r3 = r5.o
            defpackage.g8j.b(r6)
            goto L3c
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            defpackage.g8j.b(r6)
            vu9 r6 = r5.s0
            tcf r0 = r6.Q1
            r2 = r6
            r3 = r0
        L22:
            java.lang.Object r0 = r3.getValue()
            r6 = r0
            fff r6 = (defpackage.fff) r6
            xpb r6 = r2.s0
            r5.o = r3
            r5.X = r2
            r5.Y = r0
            r5.Z = r1
            java.lang.Object r6 = r6.v(r5)
            g84 r4 = defpackage.g84.a
            if (r6 != r4) goto L3c
            return r4
        L3c:
            fff r6 = (defpackage.fff) r6
            boolean r6 = r3.c(r0, r6)
            if (r6 == 0) goto L22
            qqg r6 = defpackage.qqg.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is9.n(java.lang.Object):java.lang.Object");
    }
}
