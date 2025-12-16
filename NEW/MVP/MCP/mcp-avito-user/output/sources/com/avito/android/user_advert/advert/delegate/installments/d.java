package com.avito.android.user_advert.advert.delegate.installments;

import com.avito.android.remote.model.installments.InstallmentsSwitcherData;
import com.avito.android.user_advert.advert.delegate.installments.b;
import com.avito.android.user_advert.advert.items.installments_promoblock.a;
import com.avito.android.util.P2;
import fH0.InterfaceC40292b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: InstallmentsPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/installments/InstallmentsSwitcherData;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f308605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.user_advert.advert.items.installments_promoblock.a f308606c;

    public d(f fVar, com.avito.android.user_advert.advert.items.installments_promoblock.a aVar) {
        this.f308605b = fVar;
        this.f308606c = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC40292b c9467b;
        P2 p22 = (P2) obj;
        f fVar = this.f308605b;
        fVar.getClass();
        boolean z12 = p22 instanceof P2.c;
        com.avito.android.user_advert.advert.items.installments_promoblock.a aVar = this.f308606c;
        if (z12) {
            a.C9491a c9491a = aVar.f309495g;
            c9467b = new b.a(com.avito.android.user_advert.advert.items.installments_promoblock.a.a(aVar, c9491a != null ? a.C9491a.a(c9491a, true) : null));
        } else if (p22 instanceof P2.b) {
            c9467b = new b.a(com.avito.android.user_advert.advert.items.installments_promoblock.a.a(aVar, BH0.a.a((InstallmentsSwitcherData) ((P2.b) p22).f318720a)));
        } else {
            if (!(p22 instanceof P2.a)) {
                throw new NoWhenBranchMatchedException();
            }
            a.C9491a c9491a2 = aVar.f309495g;
            c9467b = new b.C9467b(com.avito.android.user_advert.advert.items.installments_promoblock.a.a(aVar, c9491a2 != null ? a.C9491a.a(c9491a2, false) : null), fVar.f308612h.f308625a);
        }
        fVar.f395801b.accept(c9467b);
    }
}
