package com.avito.android.service_order_widget.item.delegate;

import Cu0.InterfaceC13358f;
import Y61.k;
import com.avito.android.serp.analytics.widgets_tracker.g;
import com.avito.android.serp.r;
import com.avito.android.service_order_widget.item.delegate.a;
import com.avito.android.service_order_widget.item.delegate.b;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceOrderWidgetPresenterDelegateImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/service_order_widget/item/delegate/f;", "Lcom/avito/android/service_order_widget/item/delegate/b;", "IV", "Lcom/avito/android/service_order_widget/item/delegate/a;", "I", "Ldagger/internal/h;", "Lcom/avito/android/service_order_widget/item/delegate/d;", "a", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f<IV extends b<I>, I extends com.avito.android.service_order_widget.item.delegate.a> implements h<d<IV, I>> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f278874f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dagger.internal.f f278875a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<wu0.d> f278876b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<InterfaceC13358f> f278877c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Provider<r> f278878d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Provider<g> f278879e;

    /* compiled from: ServiceOrderWidgetPresenterDelegateImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/item/delegate/f$a;", "", "<init>", "()V", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@k dagger.internal.f fVar, @k Provider provider, @k Provider provider2, @k Provider provider3, @k Provider provider4) {
        this.f278875a = fVar;
        this.f278876b = provider;
        this.f278877c = provider2;
        this.f278878d = provider3;
        this.f278879e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f278875a);
        wu0.d dVar = this.f278876b.get();
        InterfaceC13358f interfaceC13358f = this.f278877c.get();
        r rVar = this.f278878d.get();
        g gVar = this.f278879e.get();
        f278874f.getClass();
        return new d(eVarB, dVar, interfaceC13358f, rVar, gVar);
    }
}
