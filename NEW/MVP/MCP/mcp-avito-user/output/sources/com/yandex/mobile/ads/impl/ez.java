package com.yandex.mobile.ads.impl;

import okhttp3.internal.http2.Header;
import okio.C44805o;

/* loaded from: classes8.dex */
public final class ez {

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final C44805o f385138d;

    /* renamed from: e, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final C44805o f385139e;

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final C44805o f385140f;

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final C44805o f385141g;

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final C44805o f385142h;

    /* renamed from: i, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final C44805o f385143i;

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final C44805o f385144a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final C44805o f385145b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    public final int f385146c;

    static {
        C44805o.f420139e.getClass();
        f385138d = C44805o.a.c(":");
        f385139e = C44805o.a.c(Header.RESPONSE_STATUS_UTF8);
        f385140f = C44805o.a.c(Header.TARGET_METHOD_UTF8);
        f385141g = C44805o.a.c(Header.TARGET_PATH_UTF8);
        f385142h = C44805o.a.c(Header.TARGET_SCHEME_UTF8);
        f385143i = C44805o.a.c(Header.TARGET_AUTHORITY_UTF8);
    }

    public ez(@Y61.k C44805o c44805o, @Y61.k C44805o c44805o2) {
        this.f385144a = c44805o;
        this.f385145b = c44805o2;
        this.f385146c = c44805o2.d() + c44805o.d() + 32;
    }

    @Y61.k
    public final C44805o a() {
        return this.f385144a;
    }

    @Y61.k
    public final C44805o b() {
        return this.f385145b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez)) {
            return false;
        }
        ez ezVar = (ez) obj;
        return kotlin.jvm.internal.L.f(this.f385144a, ezVar.f385144a) && kotlin.jvm.internal.L.f(this.f385145b, ezVar.f385145b);
    }

    public final int hashCode() {
        return this.f385145b.hashCode() + (this.f385144a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return this.f385144a.t() + ": " + this.f385145b.t();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ez(@Y61.k String str, @Y61.k String str2) {
        this(C44805o.a.c(str), C44805o.a.c(str2));
        C44805o.f420139e.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ez(@Y61.k C44805o c44805o, @Y61.k String str) {
        this(c44805o, C44805o.a.c(str));
        C44805o.f420139e.getClass();
    }
}
