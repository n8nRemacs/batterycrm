package com.avito.android.credits.landing;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CreditProductsLandingFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CreditProductsLandingFragment f128941l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CreditProductsLandingFragment creditProductsLandingFragment) {
        super(0);
        this.f128941l = creditProductsLandingFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.ui.view.d dVar = this.f128941l.f128885C0;
        if (dVar != null) {
            dVar.f304687a.reload();
        }
        return G0.f406611a;
    }
}
