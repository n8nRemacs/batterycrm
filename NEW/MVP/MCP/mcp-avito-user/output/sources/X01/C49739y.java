package x01;

import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: x01.y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C49739y implements N {

    /* renamed from: b, reason: collision with root package name */
    public byte[] f442071b;

    /* renamed from: c, reason: collision with root package name */
    public String f442072c;

    /* renamed from: d, reason: collision with root package name */
    public String f442073d;

    /* renamed from: e, reason: collision with root package name */
    public String f442074e;

    /* renamed from: f, reason: collision with root package name */
    public String f442075f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f442076g;

    public C49739y() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m0.b("send data running");
        HashMap map = new HashMap();
        map.put("App-Id", AbstractC49722g.a());
        map.put("App-Ver", C49714A.a().f441939a.f441971d);
        map.put("Sdk-Name", "hianalytics");
        map.put("Sdk-Ver", "2.2.0.312");
        map.put("Device-Type", Build.MODEL);
        String str = this.f442073d;
        map.put("servicetag", str);
        String str2 = this.f442074e;
        if (m0.f442048a.a(4)) {
            m0.f442048a.getClass();
        }
        map.put("Request-Id", str2);
        String str3 = this.f442075f;
        AbstractC49725j.a(str, str3);
        int i12 = com.huawei.hms.hatool.a0.b(this.f442072c, this.f442071b, map).f442027a;
        if (i12 == 200) {
            m0.c(String.format(androidx.camera.camera2.internal.G.f("events PostRequest sendevent TYPE : %s, TAG : %s, resultCode: %d ,reqID:", str2), str3, str, Integer.valueOf(i12)));
        } else {
            Q.f441989b.a(new H(str, str2, str3, this.f442076g));
        }
    }
}
