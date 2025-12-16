package io.ktor.http;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Cookie.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/l;", "", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.http.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* data */ class C41530l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f400042a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f400043b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CookieEncoding f400044c;

    /* renamed from: d, reason: collision with root package name */
    public final int f400045d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Q31.b f400046e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f400047f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f400048g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f400049h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f400050i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f400051j;

    public C41530l(@Y61.k String str, @Y61.k String str2, @Y61.k CookieEncoding cookieEncoding, int i12, @Y61.l Q31.b bVar, @Y61.l String str3, @Y61.l String str4, boolean z12, boolean z13, @Y61.k Map<String, String> map) {
        this.f400042a = str;
        this.f400043b = str2;
        this.f400044c = cookieEncoding;
        this.f400045d = i12;
        this.f400046e = bVar;
        this.f400047f = str3;
        this.f400048g = str4;
        this.f400049h = z12;
        this.f400050i = z13;
        this.f400051j = map;
    }

    public static C41530l a(C41530l c41530l, String str, String str2, int i12) {
        if ((i12 & 32) != 0) {
            str = c41530l.f400047f;
        }
        String str3 = str;
        if ((i12 & 64) != 0) {
            str2 = c41530l.f400048g;
        }
        return new C41530l(c41530l.f400042a, c41530l.f400043b, c41530l.f400044c, c41530l.f400045d, c41530l.f400046e, str3, str2, c41530l.f400049h, c41530l.f400050i, c41530l.f400051j);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41530l)) {
            return false;
        }
        C41530l c41530l = (C41530l) obj;
        return kotlin.jvm.internal.L.f(this.f400042a, c41530l.f400042a) && kotlin.jvm.internal.L.f(this.f400043b, c41530l.f400043b) && this.f400044c == c41530l.f400044c && this.f400045d == c41530l.f400045d && kotlin.jvm.internal.L.f(this.f400046e, c41530l.f400046e) && kotlin.jvm.internal.L.f(this.f400047f, c41530l.f400047f) && kotlin.jvm.internal.L.f(this.f400048g, c41530l.f400048g) && this.f400049h == c41530l.f400049h && this.f400050i == c41530l.f400050i && kotlin.jvm.internal.L.f(this.f400051j, c41530l.f400051j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.f400045d, (this.f400044c.hashCode() + androidx.compose.foundation.H.d(this.f400042a.hashCode() * 31, 31, this.f400043b)) * 31, 31);
        Q31.b bVar = this.f400046e;
        int iHashCode = (iE2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f400047f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f400048g;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z12 = this.f400049h;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        int i13 = (iHashCode3 + i12) * 31;
        boolean z13 = this.f400050i;
        return this.f400051j.hashCode() + ((i13 + (z13 ? 1 : z13 ? 1 : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Cookie(name=");
        sb2.append(this.f400042a);
        sb2.append(", value=");
        sb2.append(this.f400043b);
        sb2.append(", encoding=");
        sb2.append(this.f400044c);
        sb2.append(", maxAge=");
        sb2.append(this.f400045d);
        sb2.append(", expires=");
        sb2.append(this.f400046e);
        sb2.append(", domain=");
        sb2.append(this.f400047f);
        sb2.append(", path=");
        sb2.append(this.f400048g);
        sb2.append(", secure=");
        sb2.append(this.f400049h);
        sb2.append(", httpOnly=");
        sb2.append(this.f400050i);
        sb2.append(", extensions=");
        return androidx.appcompat.app.r.w(sb2, this.f400051j, ')');
    }

    public /* synthetic */ C41530l(String str, String str2, CookieEncoding cookieEncoding, int i12, Q31.b bVar, String str3, String str4, boolean z12, boolean z13, Map map, int i13, C42822w c42822w) {
        this(str, str2, (i13 & 4) != 0 ? CookieEncoding.f399850c : cookieEncoding, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? null : bVar, (i13 & 32) != 0 ? null : str3, (i13 & 64) != 0 ? null : str4, (i13 & 128) != 0 ? false : z12, (i13 & 256) != 0 ? false : z13, (i13 & 512) != 0 ? kotlin.collections.P0.c() : map);
    }
}
