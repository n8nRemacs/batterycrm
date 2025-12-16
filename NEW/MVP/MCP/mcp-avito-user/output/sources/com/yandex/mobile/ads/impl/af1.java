package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C42784z0;

/* loaded from: classes8.dex */
public final class af1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final List<mu> f383542a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final List<ia1> f383543b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private List<mu> f383544a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private List<ia1> f383545b;

        public a() {
            C42784z0 c42784z0 = C42784z0.f406748b;
            this.f383544a = c42784z0;
            this.f383545b = c42784z0;
        }

        @Y61.k
        public final a a(@Y61.k ArrayList arrayList) {
            this.f383544a = arrayList;
            return this;
        }

        @Y61.k
        public final a b(@Y61.k ArrayList arrayList) {
            this.f383545b = arrayList;
            return this;
        }

        @Y61.k
        public final af1 a() {
            return new af1(this.f383544a, this.f383545b, 0);
        }
    }

    public /* synthetic */ af1(List list, List list2, int i12) {
        this(list, list2);
    }

    @Y61.k
    public final List<mu> a() {
        return this.f383542a;
    }

    @Y61.k
    public final List<ia1> b() {
        return this.f383543b;
    }

    private af1(List<mu> list, List<ia1> list2) {
        this.f383542a = list;
        this.f383543b = list2;
    }
}
