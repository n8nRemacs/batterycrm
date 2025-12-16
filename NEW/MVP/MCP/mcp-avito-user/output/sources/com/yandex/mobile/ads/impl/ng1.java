package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ky0;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ng1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ny0 f388275a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final mg1 f388276b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    private ky0.a f388277c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private ky0.a f388278d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    private Map<String, ? extends Object> f388279e;

    public ng1(@Y61.k Context context, @Y61.k a4 a4Var) {
        this.f388275a = m9.a(context);
        this.f388276b = new mg1(a4Var);
    }

    public final void a(@Y61.l ky0.a aVar) {
        this.f388278d = aVar;
    }

    public final void b(@Y61.l ky0.a aVar) {
        this.f388277c = aVar;
    }

    public final void a(@Y61.l Map<String, ? extends Object> map) {
        this.f388279e = map;
    }

    public final void a() {
        LinkedHashMap linkedHashMapJ = kotlin.collections.P0.j(new kotlin.Q("status", "success"));
        linkedHashMapJ.putAll(this.f388276b.a());
        Map<String, ? extends Object> mapC = this.f388279e;
        if (mapC == null) {
            mapC = kotlin.collections.P0.c();
        }
        linkedHashMapJ.putAll(mapC);
        ky0.a aVar = this.f388277c;
        Map<String, Object> mapA = aVar != null ? aVar.a() : null;
        if (mapA == null) {
            mapA = kotlin.collections.P0.c();
        }
        linkedHashMapJ.putAll(mapA);
        ky0.a aVar2 = this.f388278d;
        Map<String, Object> mapA2 = aVar2 != null ? aVar2.a() : null;
        if (mapA2 == null) {
            mapA2 = kotlin.collections.P0.c();
        }
        linkedHashMapJ.putAll(mapA2);
        this.f388275a.a(new ky0(ky0.b.f387292M, linkedHashMapJ));
    }

    public final void a(@Y61.k String str, @Y61.k String str2) {
        LinkedHashMap linkedHashMapJ = kotlin.collections.P0.j(new kotlin.Q("status", "error"), new kotlin.Q("failure_reason", str), new kotlin.Q("error_message", str2));
        Map<String, ? extends Object> mapC = this.f388279e;
        if (mapC == null) {
            mapC = kotlin.collections.P0.c();
        }
        linkedHashMapJ.putAll(mapC);
        ky0.a aVar = this.f388277c;
        Map<String, Object> mapA = aVar != null ? aVar.a() : null;
        if (mapA == null) {
            mapA = kotlin.collections.P0.c();
        }
        linkedHashMapJ.putAll(mapA);
        ky0.a aVar2 = this.f388278d;
        Map<String, Object> mapA2 = aVar2 != null ? aVar2.a() : null;
        if (mapA2 == null) {
            mapA2 = kotlin.collections.P0.c();
        }
        linkedHashMapJ.putAll(mapA2);
        this.f388275a.a(new ky0(ky0.b.f387292M, linkedHashMapJ));
    }
}
