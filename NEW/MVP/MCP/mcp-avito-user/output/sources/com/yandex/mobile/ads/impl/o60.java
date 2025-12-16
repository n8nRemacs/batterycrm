package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class o60 implements InstreamAd {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<p60> f388450a;

    public o60(@j.N ArrayList arrayList) {
        this.f388450a = arrayList;
    }

    public final void a() {
        Iterator<p60> it = this.f388450a.iterator();
        while (it.hasNext()) {
            it.next().a(null);
        }
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAd
    @j.N
    public final List<p60> getAdBreaks() {
        return this.f388450a;
    }
}
