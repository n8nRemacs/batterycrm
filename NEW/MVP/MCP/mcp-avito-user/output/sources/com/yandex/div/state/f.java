package com.yandex.div.state;

import Y61.k;
import Y61.l;
import j.InterfaceC42148d;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: InMemoryDivStateCache.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/state/f;", "Lcom/yandex/div/state/a;", "<init>", "()V", "div-states_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@InterfaceC42148d
/* loaded from: classes7.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Q<String, String>, String> f370586a = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, String> f370587b = Collections.synchronizedMap(new LinkedHashMap());

    @Override // com.yandex.div.state.a
    public final void a(@k String str, @k String str2, @k String str3) {
        this.f370586a.put(new Q<>(str, str2), str3);
    }

    @Override // com.yandex.div.state.a
    @l
    public final String b(@k String str) {
        return this.f370587b.get(str);
    }

    @Override // com.yandex.div.state.a
    public final void c(@k String str, @k String str2) {
        this.f370587b.put(str, str2);
    }

    @Override // com.yandex.div.state.a
    @l
    public final String d(@k String str, @k String str2) {
        return this.f370586a.get(new Q(str, str2));
    }
}
