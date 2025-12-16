package com.avito.android.vas_planning_checkout;

import com.avito.android.vas_planning_checkout.model.VasPlanCheckoutContent;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VasPlanCheckoutView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class t extends N implements Y41.l<VasPlanCheckoutContent, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f323025l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z zVar) {
        super(1);
        this.f323025l = zVar;
    }

    @Override // Y41.l
    public final G0 invoke(VasPlanCheckoutContent vasPlanCheckoutContent) {
        com.avito.android.progress_overlay.l lVar;
        VasPlanCheckoutContent vasPlanCheckoutContent2 = vasPlanCheckoutContent;
        boolean z12 = vasPlanCheckoutContent2 instanceof VasPlanCheckoutContent.b;
        z zVar = this.f323025l;
        if (z12) {
            com.avito.android.progress_overlay.l lVar2 = zVar.f323038h;
            if (lVar2 != null) {
                lVar2.k(null);
            }
        } else if (vasPlanCheckoutContent2 instanceof VasPlanCheckoutContent.a) {
            com.avito.android.progress_overlay.l lVar3 = zVar.f323038h;
            if (lVar3 != null) {
                lVar3.a("");
            }
        } else {
            if ((vasPlanCheckoutContent2 instanceof VasPlanCheckoutContent.Data ? true : vasPlanCheckoutContent2 instanceof VasPlanCheckoutContent.c) && (lVar = zVar.f323038h) != null) {
                lVar.j();
            }
        }
        return G0.f406611a;
    }
}
