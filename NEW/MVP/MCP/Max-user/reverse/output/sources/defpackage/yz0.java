package defpackage;

import java.util.Collections;
import java.util.Hashtable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class yz0 implements mze {
    public final /* synthetic */ int a;
    public final /* synthetic */ k01 b;
    public final /* synthetic */ ti1 c;

    public /* synthetic */ yz0(k01 k01Var, ti1 ti1Var, int i) {
        this.a = i;
        this.b = k01Var;
        this.c = ti1Var;
    }

    @Override // defpackage.mze
    public final void onResponse(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                k01 k01Var = this.b;
                mw6 mw6Var = k01Var.e0;
                dj1 dj1Var = k01Var.k0;
                dj1Var.getClass();
                yi1 yi1Var = (yi1) ue3.I(dj1Var.l(null, Collections.singletonList(this.c)));
                if (yi1Var == null) {
                    mw6Var.getClass();
                    break;
                } else {
                    ((Hashtable) mw6Var.d).remove(yi1Var);
                    break;
                }
            default:
                k01 k01Var2 = this.b;
                if (this.c.equals(k01Var2.D0)) {
                    k01Var2.D0 = null;
                    k01Var2.l(x71.H0, null);
                    break;
                }
                break;
        }
    }
}
