package com.avito.android.advert.item.short_term_rent.payment_toggles;

import Y41.p;
import com.avito.android.advert.item.short_term_rent.payment_toggles.b;
import com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.AdvertDetailsTravelPaymentToggleItem;
import com.avito.android.deeplink_handler.handler.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsTravelPaymentTogglesPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert/item/short_term_rent/payment_toggles/b;", "action", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/advert/item/short_term_rent/payment_toggles/b;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.short_term_rent.payment_toggles.AdvertDetailsTravelPaymentTogglesPresenterImpl$observeOnActions$1", f = "AdvertDetailsTravelPaymentTogglesPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class j extends SuspendLambda implements p<b, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f80091q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f80092r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f80092r = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f80092r, continuation);
        jVar.f80091q = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(b bVar, Continuation<? super G0> continuation) {
        return ((j) create(bVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object next;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        b bVar = (b) this.f80091q;
        boolean z12 = bVar instanceof b.a;
        k kVar = this.f80092r;
        if (z12) {
            b.a.a(kVar.f80094c, ((b.a) bVar).f80079a, null, null, 6);
        } else if (bVar instanceof b.C2366b) {
            AdvertDetailsTravelPaymentTogglesItem advertDetailsTravelPaymentTogglesItem = kVar.f80099h;
            if (advertDetailsTravelPaymentTogglesItem == null) {
                return G0.f406611a;
            }
            List<AdvertDetailsTravelPaymentToggleItem> list = advertDetailsTravelPaymentTogglesItem.f80076h;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((AdvertDetailsTravelPaymentToggleItem) next).f80109b, ((b.C2366b) bVar).f80080a)) {
                    break;
                }
            }
            AdvertDetailsTravelPaymentToggleItem advertDetailsTravelPaymentToggleItem = (AdvertDetailsTravelPaymentToggleItem) next;
            if (advertDetailsTravelPaymentToggleItem != null) {
                advertDetailsTravelPaymentToggleItem.f80110c = ((b.C2366b) bVar).f80081b;
            }
            int iF2 = P0.f(C42745f0.q(list, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
            for (AdvertDetailsTravelPaymentToggleItem advertDetailsTravelPaymentToggleItem2 : list) {
                linkedHashMap.put(advertDetailsTravelPaymentToggleItem2.f80109b, String.valueOf(advertDetailsTravelPaymentToggleItem2.f80110c));
            }
            kVar.f80095d.x(linkedHashMap, advertDetailsTravelPaymentToggleItem != null ? advertDetailsTravelPaymentToggleItem.f80116i : null);
        }
        return G0.f406611a;
    }
}
