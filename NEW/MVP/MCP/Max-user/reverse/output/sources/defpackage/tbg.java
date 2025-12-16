package defpackage;

import android.net.Uri;
import javax.inject.Provider;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class tbg implements yl {
    public final Provider a;
    public final String b;

    public tbg(String str, Provider provider) {
        this.b = str;
        this.a = provider;
    }

    @Override // defpackage.yl
    public final ox7 getOkParser() {
        return b6a.b;
    }

    @Override // defpackage.hm
    public final nm getScope() {
        return nm.b;
    }

    @Override // defpackage.yl
    public final om getScopeAfter() {
        return om.b;
    }

    @Override // defpackage.hm
    public final Uri getUri() {
        return wm.a("auth.anonymLogin");
    }

    @Override // defpackage.hm
    public final void writeParams(gy7 gy7Var) {
        gy7Var.b0("session_data");
        gy7Var.p();
        String str = (String) this.a.get();
        if (str != null) {
            gy7Var.b0("auth_token").h(str);
        }
        ((e2) gy7Var.b0("version")).l(3);
        gy7Var.b0("device_id").h(this.b);
        ((e2) gy7Var.b0("client_version")).l(1);
        gy7Var.b0(ApiProtocol.KEY_CLIENT_TYPE).h("SDK_ANDROID");
        gy7Var.n();
    }
}
