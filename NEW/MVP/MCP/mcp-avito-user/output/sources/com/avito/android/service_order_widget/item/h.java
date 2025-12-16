package com.avito.android.service_order_widget.item;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceOrderWidgetItemPresenterImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/item/h;", "Ldagger/internal/h;", "Lcom/avito/android/service_order_widget/item/g;", "a", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f278923b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_order_widget.item.delegate.f f278924a;

    /* compiled from: ServiceOrderWidgetItemPresenterImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/item/h$a;", "", "<init>", "()V", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@Y61.k com.avito.android.service_order_widget.item.delegate.f fVar) {
        this.f278924a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.service_order_widget.item.delegate.c cVar = (com.avito.android.service_order_widget.item.delegate.c) this.f278924a.get();
        f278923b.getClass();
        return new g(cVar);
    }
}
