package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.SettingsListScreen;

/* loaded from: classes2.dex */
public final class dpe extends dtf implements sm6 {
    public final /* synthetic */ SettingsListScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpe(Continuation continuation, SettingsListScreen settingsListScreen) {
        super(2, continuation);
        this.X = settingsListScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dpe dpeVar = (dpe) l((fre) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dpeVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dpe dpeVar = new dpe(continuation, this.X);
        dpeVar.o = obj;
        return dpeVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        fre freVar = (fre) this.o;
        yy7[] yy7VarArr = SettingsListScreen.A0;
        SettingsListScreen settingsListScreen = this.X;
        settingsListScreen.C0().setTopBarContent(freVar);
        ((yfb) settingsListScreen.s0.D(settingsListScreen, SettingsListScreen.A0[1])).setTitle(freVar.c);
        return qqg.a;
    }
}
