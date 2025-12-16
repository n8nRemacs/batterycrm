package defpackage;

import kotlin.coroutines.Continuation;
import one.me.stickerssettings.StickersSettingsScreen;

/* loaded from: classes2.dex */
public final class tif extends dtf implements sm6 {
    public final /* synthetic */ StickersSettingsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tif(Continuation continuation, StickersSettingsScreen stickersSettingsScreen) {
        super(2, continuation);
        this.X = stickersSettingsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tif tifVar = (tif) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tifVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tif tifVar = new tif(continuation, this.X);
        tifVar.o = obj;
        return tifVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        yy7[] yy7VarArr = StickersSettingsScreen.X;
        if (cdaVar instanceof jc3) {
            this.X.getRouter().C();
        } else if (cdaVar instanceof ei4) {
            pif.c.s0((ei4) cdaVar);
        }
        return qqg.a;
    }
}
