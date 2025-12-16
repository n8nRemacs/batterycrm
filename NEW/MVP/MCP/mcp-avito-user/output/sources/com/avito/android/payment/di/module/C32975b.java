package com.avito.android.payment.di.module;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import nd.InterfaceC44378a;

/* compiled from: NativePaymentMethodsModule_ProvideNativeMethodsInteractorFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment/di/module/b;", "Ldagger/internal/h;", "Lcom/avito/android/payment/e;", "a", "_avito_payment-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.payment.di.module.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32975b implements dagger.internal.h<com.avito.android.payment.e> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f214248b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC44378a> f214249a;

    /* compiled from: NativePaymentMethodsModule_ProvideNativeMethodsInteractorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment/di/module/b$a;", "", "<init>", "()V", "_avito_payment-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.payment.di.module.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C32975b(@Y61.k C32974a c32974a, @Y61.k Provider<InterfaceC44378a> provider) {
        this.f214249a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC44378a interfaceC44378a = this.f214249a.get();
        f214248b.getClass();
        return new com.avito.android.payment.e(interfaceC44378a);
    }
}
