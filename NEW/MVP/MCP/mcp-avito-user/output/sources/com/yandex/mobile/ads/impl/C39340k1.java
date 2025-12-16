package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: com.yandex.mobile.ads.impl.k1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39340k1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Object f387036a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final WeakHashMap<InterfaceC39337j1, Object> f387037b = new WeakHashMap<>();

    public final void a(@Y61.k InterfaceC39337j1 interfaceC39337j1) {
        synchronized (this.f387036a) {
            this.f387037b.put(interfaceC39337j1, null);
        }
    }

    public final void b(@Y61.k InterfaceC39337j1 interfaceC39337j1) {
        synchronized (this.f387036a) {
            this.f387037b.remove(interfaceC39337j1);
        }
    }

    public final void a() {
        HashSet hashSet;
        synchronized (this.f387036a) {
            hashSet = new HashSet(this.f387037b.keySet());
            this.f387037b.clear();
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC39337j1) it.next()).a();
        }
    }
}
