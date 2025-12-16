package io.ktor.http;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HttpProtocolVersion.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/http/m0;", "", "a", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.http.m0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* data */ class C41533m0 {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f400064d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final C41533m0 f400065e = new C41533m0("HTTP", 2, 0);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final C41533m0 f400066f = new C41533m0("HTTP", 1, 1);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final C41533m0 f400067g = new C41533m0("HTTP", 1, 0);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final C41533m0 f400068h = new C41533m0("SPDY", 3, 0);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final C41533m0 f400069i = new C41533m0("QUIC", 1, 0);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f400070a;

    /* renamed from: b, reason: collision with root package name */
    public final int f400071b;

    /* renamed from: c, reason: collision with root package name */
    public final int f400072c;

    /* compiled from: HttpProtocolVersion.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/m0$a;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.m0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C41533m0(@Y61.k String str, int i12, int i13) {
        this.f400070a = str;
        this.f400071b = i12;
        this.f400072c = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41533m0)) {
            return false;
        }
        C41533m0 c41533m0 = (C41533m0) obj;
        return kotlin.jvm.internal.L.f(this.f400070a, c41533m0.f400070a) && this.f400071b == c41533m0.f400071b && this.f400072c == c41533m0.f400072c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f400072c) + androidx.appcompat.app.r.e(this.f400071b, this.f400070a.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        return this.f400070a + '/' + this.f400071b + '.' + this.f400072c;
    }
}
