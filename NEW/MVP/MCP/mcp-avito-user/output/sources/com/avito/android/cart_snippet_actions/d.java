package com.avito.android.cart_snippet_actions;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartActionsAnalyticsInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_snippet_actions/d;", "Ldagger/internal/h;", "Lcom/avito/android/cart_snippet_actions/b;", "a", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f116157c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f116158a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<E> f116159b;

    /* compiled from: CartActionsAnalyticsInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_snippet_actions/d$a;", "", "<init>", "()V", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@Y61.k dagger.internal.f fVar, @Y61.k Provider provider) {
        this.f116158a = fVar;
        this.f116159b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f116158a.get();
        E e12 = this.f116159b.get();
        f116157c.getClass();
        return new b(e12, interfaceC28373a);
    }
}
