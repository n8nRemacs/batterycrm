package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C39078qf;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ve, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39196ve implements InterfaceC39292ze {
    @Override // com.yandex.metrica.impl.ob.InterfaceC39292ze
    @j.P
    public C39078qf.d.a.c a(@j.P Integer num, @j.P String str, @j.P String str2, @j.P String str3) {
        C39029of[] c39029ofArr;
        C39078qf.d.a.c cVar = new C39078qf.d.a.c();
        if (num != null) {
            cVar.f381565c = num.intValue();
        }
        if (str != null) {
            cVar.f381566d = str;
        }
        try {
            C39029of[] c39029ofArrB = !TextUtils.isEmpty(str3) ? J1.b(new JSONArray(str3)) : null;
            c39029ofArr = c39029ofArrB;
        } catch (Throwable unused) {
            c39029ofArr = new C39029of[]{J1.b(new JSONObject(str3))};
        }
        if (c39029ofArr != null) {
            cVar.f381563a = c39029ofArr;
        }
        if (!TextUtils.isEmpty(str2)) {
            C39101rf[] c39101rfArrA = new C39101rf[0];
            try {
                c39101rfArrA = J1.a(new JSONArray(str2));
            } catch (Throwable unused2) {
            }
            cVar.f381564b = c39101rfArrA;
        }
        return cVar;
    }
}
