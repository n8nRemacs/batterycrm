package defpackage;

import android.net.Uri;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class uk implements yl {
    public static final Uri b = wm.a("auth.anonymLogin");
    public final String a;

    public uk(String str) {
        this.a = str;
    }

    @Override // defpackage.yl
    public final ul getConfigExtractor() {
        return v1a.b;
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
        return b;
    }

    @Override // defpackage.hm
    public final void writeParams(gy7 gy7Var) {
        gy7Var.b0("session_data");
        gy7Var.p();
        gy7Var.b0("device_id").h(this.a);
        ((e2) gy7Var.b0("version")).l(2);
        gy7Var.b0("client_version").h("android_8");
        gy7Var.b0(ApiProtocol.KEY_CLIENT_TYPE).h("SDK_ANDROID");
        gy7Var.n();
    }
}
