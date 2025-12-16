package com.huawei.agconnect.core.a;

import com.huawei.agconnect.j;

/* loaded from: classes7.dex */
final class b implements j.a {
    @Override // com.huawei.agconnect.j.a
    public final String a(com.huawei.agconnect.d dVar) {
        String str;
        if (dVar.b().equals(com.huawei.agconnect.a.f363130c)) {
            str = "/agcgw_all/CN_back";
        } else if (dVar.b().equals(com.huawei.agconnect.a.f363132e)) {
            str = "/agcgw_all/RU_back";
        } else if (dVar.b().equals(com.huawei.agconnect.a.f363131d)) {
            str = "/agcgw_all/DE_back";
        } else {
            if (!dVar.b().equals(com.huawei.agconnect.a.f363133f)) {
                return null;
            }
            str = "/agcgw_all/SG_back";
        }
        return dVar.getString(str);
    }
}
