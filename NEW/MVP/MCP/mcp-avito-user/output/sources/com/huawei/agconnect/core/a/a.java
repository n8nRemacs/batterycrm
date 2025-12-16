package com.huawei.agconnect.core.a;

import com.huawei.agconnect.j;

/* loaded from: classes7.dex */
final class a implements j.a {
    @Override // com.huawei.agconnect.j.a
    public final String a(com.huawei.agconnect.d dVar) {
        String str;
        if (dVar.b().equals(com.huawei.agconnect.a.f363130c)) {
            str = "/agcgw_all/CN";
        } else if (dVar.b().equals(com.huawei.agconnect.a.f363132e)) {
            str = "/agcgw_all/RU";
        } else if (dVar.b().equals(com.huawei.agconnect.a.f363131d)) {
            str = "/agcgw_all/DE";
        } else {
            if (!dVar.b().equals(com.huawei.agconnect.a.f363133f)) {
                return null;
            }
            str = "/agcgw_all/SG";
        }
        return dVar.getString(str);
    }
}
