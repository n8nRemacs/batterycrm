package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.NativeAd;

/* renamed from: com.yandex.mobile.ads.impl.q0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39357q0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final AdResponse<String> f389034a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final qn1 f389035b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final NativeAd f389036c;

    /* renamed from: d, reason: collision with root package name */
    private final int f389037d;

    /* renamed from: com.yandex.mobile.ads.impl.q0$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final AdResponse<String> f389038a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        private qn1 f389039b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        private NativeAd f389040c;

        /* renamed from: d, reason: collision with root package name */
        private int f389041d = 0;

        public a(@j.N AdResponse<String> adResponse) {
            this.f389038a = adResponse;
        }

        @j.N
        public final a a(@j.N qn1 qn1Var) {
            this.f389039b = qn1Var;
            return this;
        }

        @j.N
        public final a a(@j.N NativeAd nativeAd) {
            this.f389040c = nativeAd;
            return this;
        }

        @j.N
        public final a a(int i12) {
            this.f389041d = i12;
            return this;
        }
    }

    public C39357q0(@j.N a aVar) {
        this.f389034a = aVar.f389038a;
        this.f389035b = aVar.f389039b;
        this.f389036c = aVar.f389040c;
        this.f389037d = aVar.f389041d;
    }

    @j.N
    public final AdResponse<String> a() {
        return this.f389034a;
    }

    @j.P
    public final NativeAd b() {
        return this.f389036c;
    }

    public final int c() {
        return this.f389037d;
    }

    @j.P
    public final qn1 d() {
        return this.f389035b;
    }
}
