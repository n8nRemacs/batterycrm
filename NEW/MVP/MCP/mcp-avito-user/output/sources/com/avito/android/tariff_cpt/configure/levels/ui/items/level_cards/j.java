package com.avito.android.tariff_cpt.configure.levels.ui.items.level_cards;

import Y41.p;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffCptConfigureLevelsCardsView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "levelCardId", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class j extends N implements p<DeepLink, Long, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f297956l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar) {
        super(2);
        this.f297956l = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(DeepLink deepLink, Long l12) {
        DeepLink deepLink2 = deepLink;
        long jLongValue = l12.longValue();
        p<? super DeepLink, ? super Long, G0> pVar = this.f297956l.f297961e;
        if (pVar != null) {
            pVar.invoke(deepLink2, Long.valueOf(jLongValue));
        }
        return G0.f406611a;
    }
}
