package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.stickerssettings.StickersSettingsScreen;

/* loaded from: classes2.dex */
public final class rif extends dtf implements sm6 {
    public final /* synthetic */ StickersSettingsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rif(Continuation continuation, StickersSettingsScreen stickersSettingsScreen) {
        super(2, continuation);
        this.X = stickersSettingsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        rif rifVar = (rif) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        rifVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rif rifVar = new rif(continuation, this.X);
        rifVar.o = obj;
        return rifVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.o.E((List) this.o);
        return qqg.a;
    }
}
