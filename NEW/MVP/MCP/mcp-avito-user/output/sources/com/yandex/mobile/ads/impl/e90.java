package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.C42784z0;

/* loaded from: classes8.dex */
public final class e90 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final List<eb<?>> f384818a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private List<? extends eb<?>> f384819a = C42784z0.f406748b;

        public final void a(@Y61.k h90 h90Var) {
        }

        public final void a(@Y61.k List<? extends eb<?>> list) {
            this.f384819a = list;
        }

        @Y61.k
        public final e90 a() {
            return new e90(this.f384819a, 0);
        }
    }

    public /* synthetic */ e90(List list, int i12) {
        this(list);
    }

    @Y61.k
    public final List<eb<?>> a() {
        return this.f384818a;
    }

    private e90(List list) {
        this.f384818a = list;
    }
}
