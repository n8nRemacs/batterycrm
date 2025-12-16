package com.avito.android.safedeal_checkout.delivery_universal_checkout.common;

import com.avito.android.remote.model.delivery.DeliverySavedAddressResult;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.common.a;
import kotlin.Metadata;

/* compiled from: DeliverySavedAddressCheckDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/delivery/DeliverySavedAddressResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/delivery/DeliverySavedAddressResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f256910b;

    public c(a aVar) {
        this.f256910b = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        a.AbstractC7704a.b bVar = a.AbstractC7704a.b.f256908b;
        a aVar = this.f256910b;
        aVar.i(bVar, aVar.f256900i, ((DeliverySavedAddressResult) obj).getDeeplink());
    }
}
