package defpackage;

import kotlin.coroutines.Continuation;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;

/* loaded from: classes2.dex */
public final class hk2 extends dtf implements sm6 {
    public final /* synthetic */ ChatMediaDownloadBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk2(Continuation continuation, ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet) {
        super(2, continuation);
        this.X = chatMediaDownloadBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        hk2 hk2Var = (hk2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        hk2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hk2 hk2Var = new hk2(continuation, this.X);
        hk2Var.o = obj;
        return hk2Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ((r00) this.X.D0.getValue()).setLevel(kti.d(((Number) this.o).floatValue() * 100));
        return qqg.a;
    }
}
