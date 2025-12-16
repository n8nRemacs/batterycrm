package com.avito.android.user_advert.soa_with_price;

import androidx.view.C23038g0;
import com.avito.android.remote.model.my_advert.CloseReason;
import com.avito.android.user_advert.soa_with_price.j;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SoaWithPriceViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/a;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/user_advert/soa_with_price/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class B<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f311821b;

    public B(D d12) {
        this.f311821b = d12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        T next;
        C35547a c35547a = (C35547a) obj;
        D d12 = this.f311821b;
        Iterator<T> it = d12.f311823E.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = (T) null;
                break;
            } else {
                next = it.next();
                if (L.f(((CloseReason) next).getId(), c35547a.f311867b)) {
                    break;
                }
            }
        }
        CloseReason closeReason = next;
        if (closeReason != null) {
            d12.f311831Q = closeReason;
            d12.f311832R = closeReason.getCurrentPrice();
            if (L.f(closeReason.getShowInput(), Boolean.TRUE)) {
                C23038g0<j> c23038g0 = d12.f311827M;
                if (!(c23038g0.getValue() instanceof j.c)) {
                    CloseReason closeReason2 = d12.f311831Q;
                    if (closeReason2 == null) {
                        closeReason2 = null;
                    }
                    c23038g0.setValue(new j.c(closeReason2.getTitle()));
                    C23038g0<C35550d> c23038g02 = d12.f311826L;
                    CloseReason closeReason3 = d12.f311831Q;
                    if (closeReason3 == null) {
                        closeReason3 = null;
                    }
                    String currentPrice = closeReason3.getCurrentPrice();
                    CloseReason closeReason4 = d12.f311831Q;
                    c23038g02.setValue(new C35550d(currentPrice, (closeReason4 != null ? closeReason4 : null).getMotivationText()));
                }
            } else {
                D.ke(d12);
            }
            d12.f311829O.e();
        }
    }
}
