package com.avito.android.remote.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NetworkLayerErrorNames_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/A;", "Ldagger/internal/h;", "Lcom/avito/android/remote/analytics/y;", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class A implements dagger.internal.h<y> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253076b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f253077a;

    /* compiled from: NetworkLayerErrorNames_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/A$a;", "", "<init>", "()V", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public A(@Y61.k dagger.internal.u uVar) {
        this.f253077a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.quic.cronet.o oVar = (com.avito.android.quic.cronet.o) this.f253077a.get();
        f253076b.getClass();
        return new y(oVar);
    }
}
