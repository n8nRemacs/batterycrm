package com.huawei.updatesdk.b.e;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes7.dex */
public class c extends a {

    /* renamed from: a, reason: collision with root package name */
    private String f363844a = null;

    /* renamed from: b, reason: collision with root package name */
    private String f363845b = "";

    private void e() {
        com.huawei.updatesdk.a.b.c.c.c.c(a(com.huawei.updatesdk.a.b.a.a.c().a()));
        com.huawei.updatesdk.a.b.c.c.d dVarA = com.huawei.updatesdk.b.g.b.a(new com.huawei.updatesdk.service.appmgr.bean.a(null));
        if (dVarA.e()) {
            com.huawei.updatesdk.service.appmgr.bean.b bVar = (com.huawei.updatesdk.service.appmgr.bean.b) dVarA;
            if (bVar.f() != null) {
                this.f363844a = bVar.f().d();
            } else {
                com.huawei.updatesdk.a.a.a.b("DefaultTaskInit", "can not getPackageName from store, HiApp info is null.");
            }
        }
    }

    @Override // com.huawei.updatesdk.b.e.a
    public String a() {
        return "com.huawei.updatesdk";
    }

    @Override // com.huawei.updatesdk.b.e.a
    public String b() {
        if (TextUtils.isEmpty(this.f363844a)) {
            com.huawei.updatesdk.a.a.a.b("DefaultTaskInit", "appgallery packagename is null and query again!");
            this.f363844a = b(new ArrayList());
        }
        return this.f363844a;
    }

    @Override // com.huawei.updatesdk.b.e.a
    public int c() {
        return 0;
    }

    private String b(List<String> list) {
        String strA = null;
        try {
            Context contextA = com.huawei.updatesdk.a.b.a.a.c().a();
            ServiceVerifyKit.Builder builder = new ServiceVerifyKit.Builder();
            Intent intent = new Intent("com.huawei.appmarket.appmarket.intent.action.AppDetail.withdetailId");
            builder.f363177f = contextA.getApplicationContext();
            ServiceVerifyKit.Builder.ComponentType componentType = ServiceVerifyKit.Builder.ComponentType.f363181b;
            builder.f363178g = intent;
            builder.f363179h = componentType;
            if (!com.huawei.updatesdk.b.h.d.a(list) && list.size() < 2) {
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    String strB = com.huawei.updatesdk.b.h.b.b(contextA, it.next());
                    if (!TextUtils.isEmpty(strB)) {
                        arrayList.add(strB);
                    }
                }
                if (!com.huawei.updatesdk.b.h.d.a(arrayList)) {
                    if (arrayList.isEmpty()) {
                        i01.b.f398338b.a("ServiceVerifyKit", "error input preferred package name");
                    } else {
                        builder.f363175d = arrayList;
                    }
                }
            }
            com.huawei.updatesdk.b.c.c cVarA = com.huawei.updatesdk.b.c.b.a();
            for (String str : cVarA.f()) {
                String strB2 = cVarA.b();
                HashMap map = builder.f363172a;
                String[] strArr = (String[]) map.get(strB2);
                if (strArr != null) {
                    int length = strArr.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            String[] strArr2 = new String[length + 1];
                            System.arraycopy(strArr, 0, strArr2, 0, length);
                            strArr2[length] = str;
                            strArr = strArr2;
                            break;
                        }
                        if (TextUtils.equals(strArr[i12], str)) {
                            break;
                        }
                        i12++;
                    }
                } else {
                    strArr = new String[]{str};
                }
                map.put(strB2, strArr);
                builder.f363174c.put(strB2, 0);
            }
            strA = builder.a();
            com.huawei.updatesdk.a.a.a.b("DefaultTaskInit", "get market packagename from verify kit is: " + strA);
            return strA;
        } catch (Throwable th2) {
            com.huawei.updatesdk.a.a.a.c("DefaultTaskInit", "genVerifiedPackageName error: " + th2.toString());
            return strA;
        }
    }

    @Override // com.huawei.updatesdk.b.e.a
    public String a(Context context) throws JSONException {
        if (!TextUtils.isEmpty(this.f363845b)) {
            return this.f363845b;
        }
        String strB = e.b(context, "grs_sdk_global_route_config_updatesdk.json");
        this.f363845b = strB;
        return strB;
    }

    @Override // com.huawei.updatesdk.b.e.a
    public boolean c(Context context) {
        return com.huawei.updatesdk.b.h.b.c(context, b()) > 100200000;
    }

    @Override // com.huawei.updatesdk.b.e.a
    public void a(String str) {
        com.huawei.updatesdk.a.a.a.b("DefaultTaskInit", "resetMarketPkgName: " + str);
        this.f363844a = str;
    }

    @Override // com.huawei.updatesdk.b.e.a
    public void a(List<String> list) {
        StringBuilder sb2;
        Context contextA = com.huawei.updatesdk.a.b.a.a.c().a();
        if (TextUtils.isEmpty(this.f363844a) || !com.huawei.updatesdk.b.h.b.d(contextA, this.f363844a)) {
            String strB = b(list);
            this.f363844a = strB;
            if (TextUtils.isEmpty(strB)) {
                e();
            }
            sb2 = new StringBuilder("initAppGalleryPkg and get AppMarket packageName is: ");
        } else {
            sb2 = new StringBuilder("AppMarket packageName has been obtained and is: ");
        }
        sb2.append(this.f363844a);
        com.huawei.updatesdk.a.a.a.b("DefaultTaskInit", sb2.toString());
    }
}
