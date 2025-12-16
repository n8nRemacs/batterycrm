package com.avito.android.advert.item.leasing_calculator;

import com.avito.android.component.toast.util.c;
import com.avito.android.error.z;
import com.avito.android.remote.model.LeasingOffersResponse;
import com.avito.android.util.O2;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsLeasingCalculatorItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/LeasingOffersResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class m<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f77424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f77425c;

    public m(f fVar, p pVar) {
        this.f77424b = fVar;
        this.f77425c = pVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        f fVar = this.f77424b;
        fVar.getClass();
        if (!(p22 instanceof P2.b)) {
            if (!(p22 instanceof P2.a)) {
                L.f(p22, P2.c.f318721a);
                return;
            } else {
                c.a.a(fVar.f77373j, com.avito.android.printable_text.b.f(z.k(((P2.a) p22).f318719a)), 0, null, null, null, null, 254);
                return;
            }
        }
        LeasingOffersResponse leasingOffersResponse = (LeasingOffersResponse) ((P2.b) p22).f318720a;
        boolean z12 = leasingOffersResponse instanceof LeasingOffersResponse.Ok;
        p pVar = this.f77425c;
        if (z12) {
            LeasingOffersResponse.Ok ok2 = (LeasingOffersResponse.Ok) leasingOffersResponse;
            if (O2.a(ok2.getOffers())) {
                pVar.sj(true);
                fVar.O(pVar, ok2.getOffers());
                return;
            }
        }
        pVar.sj(false);
        fVar.O(pVar, null);
    }
}
