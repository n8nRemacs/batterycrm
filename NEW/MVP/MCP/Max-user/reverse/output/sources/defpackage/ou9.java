package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class ou9 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ vu9 Y;
    public final /* synthetic */ long Z;
    public MessageModel o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou9(vu9 vu9Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = vu9Var;
        this.Z = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ou9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ou9(this.Y, this.Z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.X
            qqg r1 = defpackage.qqg.a
            r2 = 1
            vu9 r3 = r8.Y
            if (r0 == 0) goto L19
            if (r0 != r2) goto L11
            one.me.messages.list.loader.MessageModel r0 = r8.o
            defpackage.g8j.b(r9)
            goto L3c
        L11:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L19:
            defpackage.g8j.b(r9)
            hbd r9 = r3.D1
            mcf r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            hr9 r9 = (defpackage.hr9) r9
            long r4 = r8.Z
            one.me.messages.list.loader.MessageModel r0 = r9.e(r4)
            if (r0 != 0) goto L2f
            goto L44
        L2f:
            r8.o = r0
            r8.X = r2
            java.lang.Object r9 = defpackage.vu9.v(r3, r4, r8)
            g84 r4 = defpackage.g84.a
            if (r9 != r4) goto L3c
            return r4
        L3c:
            java.util.List r9 = (java.util.List) r9
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L45
        L44:
            return r1
        L45:
            yad r4 = r3.B0
            vad r4 = r4.t()
            xi9 r5 = r0.G0
            r6 = 0
            if (r5 == 0) goto L61
            r4.getClass()
            xi9 r7 = defpackage.xi9.Y
            if (r5 == r7) goto L61
            xi9 r7 = defpackage.xi9.d
            if (r5 == r7) goto L61
            xi9 r7 = defpackage.xi9.c
            if (r5 == r7) goto L61
            r5 = r2
            goto L62
        L61:
            r5 = r6
        L62:
            boolean r4 = r4.y()
            if (r4 == 0) goto L6b
            if (r5 == 0) goto L6b
            goto L6c
        L6b:
            r2 = r6
        L6c:
            ci5 r3 = r3.I1
            mye r4 = new mye
            r4.<init>(r0, r9, r2)
            defpackage.xfh.r(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ou9.n(java.lang.Object):java.lang.Object");
    }
}
