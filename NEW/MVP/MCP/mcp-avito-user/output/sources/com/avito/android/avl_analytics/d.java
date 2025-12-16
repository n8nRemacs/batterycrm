package com.avito.android.avl_analytics;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvlAnalyticsInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avl_analytics/d;", "Ldagger/internal/h;", "Lcom/avito/android/avl_analytics/b;", "a", "_avito_avl-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements h<b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f98442c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dagger.internal.f f98443a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.analytics.provider.f f98444b;

    /* compiled from: AvlAnalyticsInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avl_analytics/d$a;", "", "<init>", "()V", "_avito_avl-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k dagger.internal.f fVar, @k com.avito.android.analytics.provider.f fVar2) {
        this.f98443a = fVar;
        this.f98444b = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f98443a.get();
        this.f98444b.getClass();
        com.avito.android.analytics.provider.e eVar = new com.avito.android.analytics.provider.e();
        f98442c.getClass();
        return new b(interfaceC28373a, eVar);
    }
}
