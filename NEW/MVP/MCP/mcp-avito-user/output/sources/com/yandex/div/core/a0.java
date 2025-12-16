package com.yandex.div.core;

import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivKitConfiguration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/a0;", "", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@h31.h
/* loaded from: classes7.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Provider<com.yandex.android.beacon.b> f367271a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExecutorService f367272b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.yandex.div.histogram.o> f367273c;

    /* compiled from: DivKitConfiguration.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/a0$a;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.remote.analytics.o f367274a = new com.avito.android.remote.analytics.o(2);
    }

    public a0() {
        throw null;
    }

    public a0(Provider provider, ExecutorService executorService, Provider provider2, C42822w c42822w) {
        this.f367271a = provider;
        this.f367272b = executorService;
        this.f367273c = provider2;
    }
}
