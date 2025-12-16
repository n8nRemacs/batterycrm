package com.yandex.metrica.network;

import com.avito.android.advert.item.delivery_suggests.l;
import com.yandex.metrica.network.impl.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class Response {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f382386a;

    /* renamed from: b, reason: collision with root package name */
    public final int f382387b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f382388c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f382389d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f382390e;

    /* renamed from: f, reason: collision with root package name */
    public final Throwable f382391f;

    public Response(Throwable th2) {
        this(false, 0, new byte[0], new byte[0], new HashMap(), th2);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Response{completed=");
        sb2.append(this.f382386a);
        sb2.append(", code=");
        sb2.append(this.f382387b);
        sb2.append(", responseDataLength=");
        sb2.append(this.f382388c.length);
        sb2.append(", errorDataLength=");
        sb2.append(this.f382389d.length);
        sb2.append(", headers=");
        sb2.append(this.f382390e);
        sb2.append(", exception=");
        return l.t(sb2, this.f382391f, '}');
    }

    public Response(boolean z12, int i12, byte[] bArr, byte[] bArr2, Map map, Throwable th2) {
        Map mapUnmodifiableMap;
        this.f382386a = z12;
        this.f382387b = i12;
        this.f382388c = bArr;
        this.f382389d = bArr2;
        if (map == null) {
            mapUnmodifiableMap = Collections.emptyMap();
        } else {
            e eVar = e.f382396a;
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(map));
        }
        this.f382390e = mapUnmodifiableMap;
        this.f382391f = th2;
    }
}
