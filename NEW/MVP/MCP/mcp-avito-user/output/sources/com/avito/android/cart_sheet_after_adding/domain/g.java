package com.avito.android.cart_sheet_after_adding.domain;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import dagger.internal.h;
import en.InterfaceC40131a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FetchDiscountOnDeliveryStatusUseCase_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/domain/g;", "Ldagger/internal/h;", "Lcom/avito/android/cart_sheet_after_adding/domain/f;", "a", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements h<f> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f115346c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<InterfaceC40131a> f115347a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<R0> f115348b;

    /* compiled from: FetchDiscountOnDeliveryStatusUseCase_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/domain/g$a;", "", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@k Provider<InterfaceC40131a> provider, @k Provider<R0> provider2) {
        this.f115347a = provider;
        this.f115348b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40131a interfaceC40131a = this.f115347a.get();
        R0 r02 = this.f115348b.get();
        f115346c.getClass();
        return new f(interfaceC40131a, r02);
    }
}
