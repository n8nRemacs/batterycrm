package com.avito.android.advert_core.offers.offer_bottomsheet.mvi;

import J9.b;
import com.avito.android.advert_core.offers.offer_bottomsheet.OfferOpenParams;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: OfferBottomSheetBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/offers/offer_bottomsheet/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "LJ9/b;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements com.avito.android.arch.mvi.b<J9.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final OfferOpenParams f83894a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f83895b;

    @Inject
    public c(@Y61.k OfferOpenParams offerOpenParams, boolean z12) {
        this.f83894a = offerOpenParams;
        this.f83895b = z12;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<J9.b> a() {
        return this.f83895b ? C43175k.w() : new C43210w(new b.c(this.f83894a));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
