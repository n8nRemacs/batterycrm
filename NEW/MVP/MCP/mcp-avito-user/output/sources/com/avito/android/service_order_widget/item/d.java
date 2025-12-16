package com.avito.android.service_order_widget.item;

import com.avito.android.B2;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceOrderWidgetItemBlueprintImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/item/d;", "Ldagger/internal/h;", "Lcom/avito/android/service_order_widget/item/c;", "a", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f278860c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f278861a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<B2> f278862b;

    /* compiled from: ServiceOrderWidgetItemBlueprintImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/item/d$a;", "", "<init>", "()V", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@Y61.k h hVar, @Y61.k Provider provider) {
        this.f278861a = hVar;
        this.f278862b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f278861a.get();
        B2 b22 = this.f278862b.get();
        f278860c.getClass();
        return new c(fVar, b22);
    }
}
