package com.avito.android.cart_sheet_after_adding.mvi;

import Hr.InterfaceC14024a;
import androidx.compose.runtime.internal.P;
import bn.C25680a;
import bn.C25681b;
import com.avito.android.cart_sheet_after_adding.ui.CartSheetAfterAddingArguments;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartSheetAfterAddingBootstrap_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/h;", "Ldagger/internal/h;", "Lcom/avito/android/cart_sheet_after_adding/mvi/g;", "a", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f115395e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f115396a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC14024a> f115397b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C25681b f115398c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f115399d;

    /* compiled from: CartSheetAfterAddingBootstrap_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/h$a;", "", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@Y61.k dagger.internal.l lVar, @Y61.k Provider provider, @Y61.k C25681b c25681b, @Y61.k dagger.internal.l lVar2) {
        this.f115396a = lVar;
        this.f115397b = provider;
        this.f115398c = c25681b;
        this.f115399d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        CartSheetAfterAddingArguments cartSheetAfterAddingArguments = (CartSheetAfterAddingArguments) this.f115396a.f393949a;
        InterfaceC14024a interfaceC14024a = this.f115397b.get();
        C25680a c25680a = (C25680a) this.f115398c.get();
        Y41.l lVar = (Y41.l) this.f115399d.f393949a;
        f115395e.getClass();
        return new g(cartSheetAfterAddingArguments, interfaceC14024a, c25680a, lVar);
    }
}
