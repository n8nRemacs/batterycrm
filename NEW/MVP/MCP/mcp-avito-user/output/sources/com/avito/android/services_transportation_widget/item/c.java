package com.avito.android.services_transportation_widget.item;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceTransportationWidgetItemBlueprintImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/c;", "Ldagger/internal/h;", "Lcom/avito/android/services_transportation_widget/item/b;", "a", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f280548d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<d> f280549a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.konveyor.adapter.j> f280550b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.konveyor.adapter.a> f280551c;

    /* compiled from: ServiceTransportationWidgetItemBlueprintImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/c$a;", "", "<init>", "()V", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@Y61.k Provider<d> provider, @Y61.k Provider<com.avito.konveyor.adapter.j> provider2, @Y61.k Provider<com.avito.konveyor.adapter.a> provider3) {
        this.f280549a = provider;
        this.f280550b = provider2;
        this.f280551c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = this.f280549a.get();
        com.avito.konveyor.adapter.j jVar = this.f280550b.get();
        com.avito.konveyor.adapter.a aVar = this.f280551c.get();
        f280548d.getClass();
        return new b(dVar, jVar, aVar);
    }
}
