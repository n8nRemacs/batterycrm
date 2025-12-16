package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class xx9 extends dtf implements sm6 {
    public final /* synthetic */ ay9 X;
    public final /* synthetic */ MessageModel Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx9(ay9 ay9Var, MessageModel messageModel, Continuation continuation) {
        super(2, continuation);
        this.X = ay9Var;
        this.Y = messageModel;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xx9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xx9(this.X, this.Y, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x018a A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xx9.n(java.lang.Object):java.lang.Object");
    }
}
