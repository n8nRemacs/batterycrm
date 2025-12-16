package defpackage;

import ru.ok.android.externcalls.sdk.ml.config.KwsFeaturesConfigProviderImpl;

/* loaded from: classes2.dex */
public final class fvb extends l0g {
    public String c;

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        if (str.equals(KwsFeaturesConfigProviderImpl.URL_KEY)) {
            this.c = tm9Var.w0();
        } else {
            tm9Var.v();
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return ho7.i("{url='", this.c, "'}");
    }
}
