package com.yandex.metrica.network;

import android.text.TextUtils;
import androidx.appcompat.app.r;
import com.yandex.metrica.network.impl.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class Request {

    /* renamed from: a, reason: collision with root package name */
    public final String f382378a;

    /* renamed from: b, reason: collision with root package name */
    public final String f382379b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f382380c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f382381d;

    public class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final String f382382a;

        /* renamed from: b, reason: collision with root package name */
        public String f382383b;

        /* renamed from: c, reason: collision with root package name */
        public byte[] f382384c = new byte[0];

        /* renamed from: d, reason: collision with root package name */
        public final HashMap f382385d = new HashMap();

        public Builder(String str) {
            this.f382382a = str;
        }

        public final void a(String str, String str2) {
            this.f382385d.put(str, str2);
        }

        public final Request b() {
            return new Request(this.f382382a, this.f382383b, this.f382384c, this.f382385d, null);
        }
    }

    public Request(String str, String str2, byte[] bArr, Map map, b bVar) {
        this.f382378a = str;
        this.f382379b = TextUtils.isEmpty(str2) ? "GET" : str2;
        this.f382380c = bArr;
        e eVar = e.f382396a;
        this.f382381d = Collections.unmodifiableMap(new HashMap(map));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{url=");
        sb2.append(this.f382378a);
        sb2.append(", method='");
        sb2.append(this.f382379b);
        sb2.append("', bodyLength=");
        sb2.append(this.f382380c.length);
        sb2.append(", headers=");
        return r.w(sb2, this.f382381d, '}');
    }
}
