package com.avito.android.widget_filters_shared.mvi;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WidgetFiltersSharedFeatureBuilderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters_shared/mvi/e;", "Ldagger/internal/h;", "Lcom/avito/android/widget_filters_shared/mvi/d;", "a", "_avito_widget-filters-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f330586c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b f330587a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f330588b;

    /* compiled from: WidgetFiltersSharedFeatureBuilderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters_shared/mvi/e$a;", "", "<init>", "()V", "_avito_widget-filters-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k b bVar, @k h hVar) {
        this.f330587a = bVar;
        this.f330588b = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f330587a.getClass();
        com.avito.android.widget_filters_shared.mvi.a aVar = new com.avito.android.widget_filters_shared.mvi.a();
        this.f330588b.getClass();
        g gVar = new g();
        f330586c.getClass();
        return new d("WidgetFiltersShared", UP0.d.f16379a, new c(aVar, gVar));
    }
}
