package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class p50 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final List<eb<?>> f388725a;

    /* JADX WARN: Multi-variable type inference failed */
    public p50(@Y61.l List<? extends eb<?>> list) {
        this.f388725a = list;
    }

    @Y61.l
    public final eb<?> a(@Y61.k String str) {
        List<eb<?>> list = this.f388725a;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (kotlin.jvm.internal.L.f(((eb) next).b(), str)) {
                obj = next;
                break;
            }
        }
        return (eb) obj;
    }
}
