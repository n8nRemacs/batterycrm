package com.yandex.metrica.impl.ob;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Ud implements InterfaceC39110s0<a, C38779ee> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final C38779ee f379611a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final List<a> f379612b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public final String f379613a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final JSONObject f379614b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        public final EnumC39158u0 f379615c;

        public a(@j.P String str, @j.N JSONObject jSONObject, @j.N EnumC39158u0 enumC39158u0) {
            this.f379613a = str;
            this.f379614b = jSONObject;
            this.f379615c = enumC39158u0;
        }

        public String toString() {
            return "Candidate{trackingId='" + this.f379613a + "', additionalParams=" + this.f379614b + ", source=" + this.f379615c + '}';
        }
    }

    public Ud(@j.N C38779ee c38779ee, @j.N List<a> list) {
        this.f379611a = c38779ee;
        this.f379612b = list;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39110s0
    @j.N
    public List<a> a() {
        return this.f379612b;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39110s0
    @j.P
    public C38779ee b() {
        return this.f379611a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PreloadInfoData{chosenPreloadInfo=");
        sb2.append(this.f379611a);
        sb2.append(", candidates=");
        return androidx.compose.foundation.H.p(sb2, this.f379612b, '}');
    }
}
