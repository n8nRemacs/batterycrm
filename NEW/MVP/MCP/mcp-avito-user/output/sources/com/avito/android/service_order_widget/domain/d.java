package com.avito.android.service_order_widget.domain;

import Eu0.InterfaceC13529a;
import Y61.k;
import com.avito.android.B2;
import com.avito.android.D2;
import dagger.internal.h;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import xu0.InterfaceC50001a;

/* compiled from: ServiceOrderRequestInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/domain/d;", "Ldagger/internal/h;", "Lcom/avito/android/service_order_widget/domain/b;", "a", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements h<b> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f278831d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<InterfaceC13529a> f278832a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final u f278833b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final D2 f278834c;

    /* compiled from: ServiceOrderRequestInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/domain/d$a;", "", "<init>", "()V", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k Provider provider, @k u uVar, @k D2 d22) {
        this.f278832a = provider;
        this.f278833b = uVar;
        this.f278834c = d22;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC13529a interfaceC13529a = this.f278832a.get();
        InterfaceC50001a interfaceC50001a = (InterfaceC50001a) this.f278833b.get();
        B2 b22 = (B2) this.f278834c.get();
        f278831d.getClass();
        return new b(interfaceC13529a, interfaceC50001a, b22);
    }
}
