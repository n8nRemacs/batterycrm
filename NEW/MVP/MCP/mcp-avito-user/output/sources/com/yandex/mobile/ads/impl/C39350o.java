package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.ky0;

/* renamed from: com.yandex.mobile.ads.impl.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C39350o {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final n2 f388402a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final AdResponse f388403b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final oy0 f388404c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final sm0 f388405d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.k f388406e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.w f388407f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private final ky0.a f388408g;

    public C39350o(@j.N n2 n2Var, @j.N AdResponse adResponse, @j.N dj djVar, @j.N sm0 sm0Var, @j.N com.yandex.mobile.ads.nativeads.w wVar, @j.N com.yandex.mobile.ads.nativeads.k kVar, @j.P ky0.a aVar) {
        this.f388402a = n2Var;
        this.f388403b = adResponse;
        this.f388404c = djVar;
        this.f388405d = sm0Var;
        this.f388407f = wVar;
        this.f388406e = kVar;
        this.f388408g = aVar;
    }

    @j.P
    public final InterfaceC39347n a(@j.N Context context, @j.N AbstractC39344m abstractC39344m) {
        rm0 rm0VarA;
        InterfaceC39347n hvVar;
        String strA = abstractC39344m.a();
        rm0VarA = this.f388405d.a(this.f388404c);
        strA.getClass();
        switch (strA) {
            case "social_action":
                return new p51(new r31(context, this.f388403b, this.f388402a, this.f388408g), new x51(this.f388402a, new xj0(context, this.f388403b, this.f388402a), this.f388406e, this.f388407f, this.f388405d));
            case "adtune":
                return new y7(new f8(this.f388406e, rm0VarA), new x6(context, this.f388402a), this.f388404c);
            case "feedback":
                hvVar = new hv(new qv(this.f388402a, this.f388404c, this.f388407f, this.f388406e));
                break;
            case "close":
                return new jj(this.f388404c, this.f388406e);
            case "deeplink":
                hvVar = new zn(new bo(this.f388404c, rm0VarA, this.f388406e));
                break;
            default:
                return null;
        }
        return hvVar;
    }
}
