package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class xje extends l0g {
    public String c;

    public xje(tm9 tm9Var) {
        super(tm9Var);
    }

    @Override // defpackage.l0g
    public final void d(tm9 tm9Var, String str) {
        str.getClass();
        if (str.equals(ApiProtocol.KEY_TOKEN)) {
            this.c = tm9Var.w0();
        } else {
            tm9Var.v();
        }
    }

    @Override // defpackage.pj0
    public final String toString() {
        return ho7.i("{token='", l8g.f(this.c), "'}");
    }
}
