package com.yandex.metrica.impl.ob;

import com.avito.android.remote.model.SearchParamsConverterKt;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.o5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39019o5 extends X4 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final I1 f381234b;

    public C39019o5(@j.N L3 l32) {
        this(l32, F0.g().k());
    }

    @Override // com.yandex.metrica.impl.ob.S4
    public boolean a(@j.N C38715c0 c38715c0) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject;
        EnumC39158u0 enumC39158u0 = null;
        try {
            jSONObjectOptJSONObject = new JSONObject(c38715c0.q()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObjectOptJSONObject = null;
        }
        I1 i12 = this.f381234b;
        String strB = Tl.b(jSONObjectOptJSONObject, "trackingId");
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has("additionalParams")) {
            jSONObject = null;
        } else {
            try {
                jSONObject = jSONObjectOptJSONObject.getJSONObject("additionalParams");
            } catch (Throwable unused2) {
            }
        }
        if (jSONObject == null) {
            jSONObject = jSONObject2;
        }
        boolean zA2 = Tl.a(jSONObjectOptJSONObject, "wasSet", false);
        boolean zA3 = Tl.a(jSONObjectOptJSONObject, "autoTracking", false);
        String strB2 = Tl.b(jSONObjectOptJSONObject, SearchParamsConverterKt.SOURCE);
        EnumC39158u0[] enumC39158u0ArrValues = EnumC39158u0.values();
        int i13 = 0;
        while (true) {
            if (i13 >= 4) {
                break;
            }
            EnumC39158u0 enumC39158u02 = enumC39158u0ArrValues[i13];
            if (kotlin.jvm.internal.L.f(enumC39158u02.a(), strB2)) {
                enumC39158u0 = enumC39158u02;
                break;
            }
            i13++;
        }
        i12.b(new C38779ee(strB, jSONObject, zA2, zA3, enumC39158u0 != null ? enumC39158u0 : EnumC39158u0.UNDEFINED));
        return false;
    }

    @j.k0
    public C39019o5(@j.N L3 l32, @j.N I1 i12) {
        super(l32);
        this.f381234b = i12;
    }
}
