package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
final class yt0 extends AbstractC39317e {

    /* renamed from: e, reason: collision with root package name */
    private final int f392065e;

    /* renamed from: f, reason: collision with root package name */
    private final int f392066f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f392067g;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f392068h;

    /* renamed from: i, reason: collision with root package name */
    private final i91[] f392069i;

    /* renamed from: j, reason: collision with root package name */
    private final Object[] f392070j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap<Object, Integer> f392071k;

    public yt0(List list, s31 s31Var) {
        super(s31Var);
        int size = list.size();
        this.f392067g = new int[size];
        this.f392068h = new int[size];
        this.f392069i = new i91[size];
        this.f392070j = new Object[size];
        this.f392071k = new HashMap<>();
        Iterator it = list.iterator();
        int iB2 = 0;
        int iA2 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            ld0 ld0Var = (ld0) it.next();
            this.f392069i[i12] = ld0Var.b();
            this.f392068h[i12] = iB2;
            this.f392067g[i12] = iA2;
            iB2 += this.f392069i[i12].b();
            iA2 += this.f392069i[i12].a();
            this.f392070j[i12] = ld0Var.a();
            this.f392071k.put(this.f392070j[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f392065e = iB2;
        this.f392066f = iA2;
    }

    @Override // com.yandex.mobile.ads.impl.i91
    public final int a() {
        return this.f392066f;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC39317e
    public final int b(int i12) {
        return pc1.a(this.f392067g, i12 + 1, false, false);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC39317e
    public final int c(int i12) {
        return pc1.a(this.f392068h, i12 + 1, false, false);
    }

    public final List<i91> d() {
        return Arrays.asList(this.f392069i);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC39317e
    public final int e(int i12) {
        return this.f392067g[i12];
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC39317e
    public final int f(int i12) {
        return this.f392068h[i12];
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC39317e
    public final i91 g(int i12) {
        return this.f392069i[i12];
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC39317e
    public final int b(Object obj) {
        Integer num = this.f392071k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC39317e
    public final Object d(int i12) {
        return this.f392070j[i12];
    }

    @Override // com.yandex.mobile.ads.impl.i91
    public final int b() {
        return this.f392065e;
    }
}
