package defpackage;

import ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate;

/* loaded from: classes.dex */
public final class mdb implements StartConversationDelegate {
    public final k18 a;

    public mdb(k18 k18Var) {
        this.a = k18Var;
    }

    @Override // ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate
    public final StartConversationDelegate.Result invoke(StartConversationDelegate.Params params) {
        return (StartConversationDelegate.Result) svi.g(bd5.a, new ldb(this, params, null));
    }
}
