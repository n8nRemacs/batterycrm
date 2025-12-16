package com.avito.android.publish.slots.market_price;

import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResultKt;
import kotlin.Metadata;

/* compiled from: MarketPriceSlotWrapper.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceResponse;", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class h<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f244537b;

    public h(a aVar) {
        this.f244537b = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        this.f244537b.f244518k.C((Throwable) obj);
        return TypedResultKt.toTyped((ApiError) com.avito.android.remote.error.j.d(3, null));
    }
}
