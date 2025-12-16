package com.avito.android.services_transportation_widget.item;

import com.avito.android.util.R0;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import yv0.InterfaceC50307a;

/* compiled from: ServiceTransportationWidgetItemPresenterImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/i;", "Ldagger/internal/h;", "Lcom/avito/android/services_transportation_widget/item/h;", "a", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f280646g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.services_transportation_widget.interactor.a> f280647a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f280648b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC50307a> f280649c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f280650d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final u f280651e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f280652f;

    /* compiled from: ServiceTransportationWidgetItemPresenterImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/i$a;", "", "<init>", "()V", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public i(@Y61.k u uVar, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k Provider provider4, @Y61.k Provider provider5) {
        this.f280647a = provider;
        this.f280648b = provider2;
        this.f280649c = provider3;
        this.f280650d = provider4;
        this.f280651e = uVar;
        this.f280652f = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.services_transportation_widget.interactor.a aVar = this.f280647a.get();
        R0 r02 = this.f280648b.get();
        InterfaceC50307a interfaceC50307a = this.f280649c.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = this.f280650d.get();
        com.avito.android.services_transportation_widget.dialog.a aVar3 = (com.avito.android.services_transportation_widget.dialog.a) this.f280651e.get();
        com.avito.android.serp.analytics.widgets_tracker.g gVar = this.f280652f.get();
        f280646g.getClass();
        return new h(aVar, r02, interfaceC50307a, aVar2, aVar3, gVar);
    }
}
