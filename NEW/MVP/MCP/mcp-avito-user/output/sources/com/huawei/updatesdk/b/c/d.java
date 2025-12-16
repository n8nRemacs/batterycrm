package com.huawei.updatesdk.b.c;

import android.text.TextUtils;
import com.huawei.hms.common.PackageConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class d extends c {
    @Override // com.huawei.updatesdk.b.c.c
    public String a() {
        String strA = com.huawei.updatesdk.a.a.d.i.c.a("ro.product.hw_model", "");
        return TextUtils.isEmpty(strA) ? com.huawei.updatesdk.a.a.d.i.c.a("ro.product.hn_model", "") : strA;
    }

    @Override // com.huawei.updatesdk.b.c.c
    public String b() {
        return PackageConstants.SERVICES_PACKAGE_APPMARKET;
    }

    @Override // com.huawei.updatesdk.b.c.c
    public String c() {
        return com.huawei.updatesdk.a.a.d.i.c.a("ro.product.manufacturer", "");
    }

    @Override // com.huawei.updatesdk.b.c.c
    public List<String> f() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F");
        arrayList.add("FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212");
        return arrayList;
    }
}
