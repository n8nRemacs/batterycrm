package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;

/* loaded from: classes2.dex */
public final class jqe extends dtf implements sm6 {
    public final /* synthetic */ SettingsPrivacyScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqe(Continuation continuation, SettingsPrivacyScreen settingsPrivacyScreen) {
        super(2, continuation);
        this.X = settingsPrivacyScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jqe jqeVar = (jqe) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jqeVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jqe jqeVar = new jqe(continuation, this.X);
        jqeVar.o = obj;
        return jqeVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        String str = (String) this.o;
        ccb ccbVar = new ccb(this.X);
        ccbVar.h(str);
        ccbVar.i();
        return qqg.a;
    }
}
