package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class rk<T extends View> implements x9<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<x9<T>> f389559a;

    public rk(@j.N List<x9<T>> list) {
        this.f389559a = list;
    }

    @Override // com.yandex.mobile.ads.impl.x9
    public final void a(@j.N T t12) {
        Iterator<x9<T>> it = this.f389559a.iterator();
        while (it.hasNext()) {
            it.next().a(t12);
        }
    }

    @Override // com.yandex.mobile.ads.impl.x9
    public final void cancel() {
        Iterator<x9<T>> it = this.f389559a.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
