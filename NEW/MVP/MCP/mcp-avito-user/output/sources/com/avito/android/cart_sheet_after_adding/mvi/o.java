package com.avito.android.cart_sheet_after_adding.mvi;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CartSheetAfterAddingReducer_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/o;", "Ldagger/internal/h;", "Lcom/avito/android/cart_sheet_after_adding/mvi/n;", "a", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f115419c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cart_similar_items.formatter.b f115420a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cart_sheet_after_adding.domain.c f115421b;

    /* compiled from: CartSheetAfterAddingReducer_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/o$a;", "", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public o(@Y61.k com.avito.android.cart_similar_items.formatter.b bVar, @Y61.k com.avito.android.cart_sheet_after_adding.domain.c cVar) {
        this.f115420a = bVar;
        this.f115421b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.cart_similar_items.formatter.a aVar = (com.avito.android.cart_similar_items.formatter.a) this.f115420a.get();
        this.f115421b.getClass();
        com.avito.android.cart_sheet_after_adding.domain.b bVar = new com.avito.android.cart_sheet_after_adding.domain.b();
        f115419c.getClass();
        return new n(aVar, bVar);
    }
}
