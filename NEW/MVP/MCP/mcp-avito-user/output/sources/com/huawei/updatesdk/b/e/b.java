package com.huawei.updatesdk.b.e;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes7.dex */
public class b extends a {

    /* renamed from: a, reason: collision with root package name */
    private String f363843a = "";

    @Override // com.huawei.updatesdk.b.e.a
    public String a() {
        return "com.huawei.apptouch.updatesdk";
    }

    @Override // com.huawei.updatesdk.b.e.a
    public String b() {
        return com.huawei.updatesdk.service.otaupdate.f.e().c();
    }

    @Override // com.huawei.updatesdk.b.e.a
    public int c() {
        return 34;
    }

    @Override // com.huawei.updatesdk.b.e.a
    public String a(Context context) throws JSONException {
        if (!TextUtils.isEmpty(this.f363843a)) {
            return this.f363843a;
        }
        String strB = e.b(context, "grs_sdk_global_route_config_apptouchupdatesdk.json");
        this.f363843a = strB;
        return strB;
    }

    @Override // com.huawei.updatesdk.b.e.a
    public boolean c(Context context) {
        return com.huawei.updatesdk.b.h.b.d(context, b());
    }

    @Override // com.huawei.updatesdk.b.e.a
    public void a(List<String> list) {
    }
}
