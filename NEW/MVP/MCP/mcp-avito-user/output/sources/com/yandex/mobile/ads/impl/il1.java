package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.offline.c;
import java.util.List;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class il1 implements c.InterfaceC10972c {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f386527c = {kotlin.jvm.internal.m0.f406844a.i(new kotlin.jvm.internal.h0(il1.class, "cacheListener", "getCacheListener()Lcom/yandex/mobile/ads/nativeads/video/cache/VideoCacheListener;", 0))};

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    @Deprecated
    private static final List<Integer> f386528d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    @Deprecated
    private static final List<Integer> f386529e;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f386530a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final kx0 f386531b;

    static {
        List<Integer> listU = C42745f0.U(3, 4);
        f386528d = listU;
        f386529e = C42745f0.i0(5, C42745f0.i0(1, listU));
    }

    public il1(@Y61.k String str, @Y61.k zg1 zg1Var) {
        this.f386530a = str;
        this.f386531b = lx0.a(zg1Var);
    }

    private final zg1 a() {
        return (zg1) this.f386531b.getValue(this, f386527c[0]);
    }

    @Override // com.yandex.mobile.ads.exo.offline.c.InterfaceC10972c
    public final void a(@Y61.k com.yandex.mobile.ads.exo.offline.c cVar, @Y61.k com.yandex.mobile.ads.exo.offline.b bVar) {
        zg1 zg1VarA;
        if (kotlin.jvm.internal.L.f(bVar.f383094a.f383070a, this.f386530a)) {
            if (f386528d.contains(Integer.valueOf(bVar.f383095b)) && (zg1VarA = a()) != null) {
                zg1VarA.a();
            }
            if (f386529e.contains(Integer.valueOf(bVar.f383095b))) {
                cVar.a((c.InterfaceC10972c) this);
            }
        }
    }
}
