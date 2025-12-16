package com.yandex.metrica.network;

import androidx.appcompat.app.r;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes7.dex */
public class NetworkClient {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f382366a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f382367b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f382368c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f382369d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f382370e;

    /* renamed from: f, reason: collision with root package name */
    public final int f382371f;

    public class Builder {

        /* renamed from: a, reason: collision with root package name */
        public Integer f382372a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f382373b;

        /* renamed from: c, reason: collision with root package name */
        public SSLSocketFactory f382374c;

        /* renamed from: d, reason: collision with root package name */
        public Boolean f382375d;

        /* renamed from: e, reason: collision with root package name */
        public Boolean f382376e;

        /* renamed from: f, reason: collision with root package name */
        public Integer f382377f;

        public final NetworkClient a() {
            return new NetworkClient(this.f382372a, this.f382373b, this.f382374c, this.f382375d, this.f382376e, this.f382377f, null);
        }
    }

    public NetworkClient(Integer num, Integer num2, SSLSocketFactory sSLSocketFactory, Boolean bool, Boolean bool2, Integer num3, a aVar) {
        this.f382366a = num;
        this.f382367b = num2;
        this.f382368c = sSLSocketFactory;
        this.f382369d = bool;
        this.f382370e = bool2;
        this.f382371f = num3 == null ? Integer.MAX_VALUE : num3.intValue();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkClient{connectTimeout=");
        sb2.append(this.f382366a);
        sb2.append(", readTimeout=");
        sb2.append(this.f382367b);
        sb2.append(", sslSocketFactory=");
        sb2.append(this.f382368c);
        sb2.append(", useCaches=");
        sb2.append(this.f382369d);
        sb2.append(", instanceFollowRedirects=");
        sb2.append(this.f382370e);
        sb2.append(", maxResponseSize=");
        return r.t(sb2, this.f382371f, '}');
    }
}
