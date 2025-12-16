package defpackage;

import java.util.Map;
import kotlin.coroutines.Continuation;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;

/* loaded from: classes2.dex */
public final class ene extends dtf implements sm6 {
    public final /* synthetic */ SettingsBlacklistScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ene(Continuation continuation, SettingsBlacklistScreen settingsBlacklistScreen) {
        super(2, continuation);
        this.X = settingsBlacklistScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ene eneVar = (ene) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        eneVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ene eneVar = new ene(continuation, this.X);
        eneVar.o = obj;
        return eneVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        Map map = (Map) this.o;
        SettingsBlacklistScreen settingsBlacklistScreen = this.X;
        ((x3b) settingsBlacklistScreen.o.D(settingsBlacklistScreen, SettingsBlacklistScreen.Y[1])).setVisibility(map.values().isEmpty() ? 0 : 8);
        settingsBlacklistScreen.X.E(ue3.d0(map.values()));
        return qqg.a;
    }
}
