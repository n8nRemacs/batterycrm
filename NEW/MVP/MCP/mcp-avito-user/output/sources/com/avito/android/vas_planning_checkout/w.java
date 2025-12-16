package com.avito.android.vas_planning_checkout;

import androidx.fragment.app.ActivityC22955m;
import com.avito.android.vas_planning_checkout.VasPlanCheckoutFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VasPlanCheckoutView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class w extends N implements Y41.l<G0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f323028l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar) {
        super(1);
        this.f323028l = zVar;
    }

    @Override // Y41.l
    public final G0 invoke(G0 g02) {
        VasPlanCheckoutFragment vasPlanCheckoutFragment = this.f323028l.f323033c;
        VasPlanCheckoutFragment.c cVar = vasPlanCheckoutFragment.f322811v0;
        cVar.d(false);
        ActivityC22955m activityC22955mL1 = vasPlanCheckoutFragment.l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.onBackPressed();
        }
        cVar.d(true);
        return G0.f406611a;
    }
}
