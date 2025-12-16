package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class b80 extends h0 implements km {
    public final String a;
    public final String b;

    public b80(String str, String str2) {
        this.a = str2;
        this.b = str;
    }

    @Override // defpackage.hm
    public final nm getScope() {
        return nm.b;
    }

    @Override // defpackage.hm
    public final Uri getUri() {
        return wm.a("auth.anonymLogin");
    }

    @Override // defpackage.h0
    public final void populateParams(gm gmVar) {
        gmVar.b("referrer", null);
        String str = this.a;
        gmVar.b("deviceId", str);
        gmVar.a(new br0("verification_supported", true));
        gmVar.b("verification_token", null);
        gmVar.b("verification_supported_v", "1");
        gmVar.b("client", "test");
        gmVar.a(new br0("gen_token", true));
        if (str == null) {
            str = "test";
        }
        String str2 = this.b;
        gmVar.b("session_data", str2 != null ? wy1.j("{\"auth_token\": \"", str2, "\", \"version\": 3, \"device_id\": \"", str, "\", \"client_version\": 1}") : ho7.i("{\"version\": 2, \"device_id\": \"", str, "\", \"client_version\": 1}"));
    }
}
