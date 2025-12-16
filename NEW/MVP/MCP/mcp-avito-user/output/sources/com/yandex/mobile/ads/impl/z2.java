package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final List<h3> f392156a;

    /* renamed from: b, reason: collision with root package name */
    private int f392157b;

    public z2(@Y61.k ArrayList arrayList) {
        this.f392156a = arrayList;
    }

    @Y61.l
    public final h3 a(@Y61.k ff1<VideoAd> ff1Var) {
        Object next;
        Iterator<T> it = this.f392156a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.L.f(((h3) next).c(), ff1Var)) {
                break;
            }
        }
        return (h3) next;
    }

    @Y61.l
    public final ff1<VideoAd> b() {
        h3 h3VarA = a(this.f392157b);
        if (h3VarA != null) {
            return h3VarA.c();
        }
        return null;
    }

    @Y61.l
    public final l60 c() {
        h3 h3VarA = a(this.f392157b);
        if (h3VarA != null) {
            return h3VarA.a();
        }
        return null;
    }

    @Y61.l
    public final ri1 d() {
        h3 h3VarA = a(this.f392157b);
        if (h3VarA != null) {
            return h3VarA.d();
        }
        return null;
    }

    @Y61.l
    public final h3 e() {
        return a(this.f392157b + 1);
    }

    @Y61.l
    public final h3 f() {
        int i12 = this.f392157b + 1;
        this.f392157b = i12;
        return a(i12);
    }

    public final void a() {
        this.f392157b = this.f392156a.size();
    }

    private final h3 a(int i12) {
        return (h3) C42745f0.K(i12, this.f392156a);
    }
}
