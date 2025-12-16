package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.startconversation.channel.PickSubscribersScreen;

/* loaded from: classes2.dex */
public final class ywb extends dtf implements sm6 {
    public final /* synthetic */ PickSubscribersScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywb(PickSubscribersScreen pickSubscribersScreen, Continuation continuation) {
        super(2, continuation);
        this.X = pickSubscribersScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ywb ywbVar = (ywb) l((Set) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ywbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ywb ywbVar = new ywb(this.X, continuation);
        ywbVar.o = obj;
        return ywbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e5  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywb.n(java.lang.Object):java.lang.Object");
    }
}
