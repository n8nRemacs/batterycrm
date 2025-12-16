package com.avito.android.advert.item.safedeal;

import com.avito.android.advert.item.safedeal.trust_factors.combined_buttons.QuantityChange;
import kotlin.C42829l0;
import kotlin.Metadata;

/* compiled from: AdvertSafeDealPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/safedeal/a;", "it", "Lkotlin/l0;", "Lcom/avito/android/advert/item/safedeal/trust_factors/combined_buttons/QuantityChange;", "apply", "(Lcom/avito/android/remote/safedeal/a;)Lkotlin/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class K<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QuantityChange f78736b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ QuantityChange f78737c;

    public K(QuantityChange quantityChange, QuantityChange quantityChange2) {
        this.f78736b = quantityChange;
        this.f78737c = quantityChange2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return new C42829l0(this.f78736b, this.f78737c, (com.avito.android.remote.safedeal.a) obj);
    }
}
