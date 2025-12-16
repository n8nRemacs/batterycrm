package com.avito.android.tariff_lf_publication.level;

import Y41.p;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TariffLfPublicationLevelFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "levelId", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Long;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c extends N implements p<DeepLink, Long, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TariffLfPublicationLevelFragment f300885l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TariffLfPublicationLevelFragment tariffLfPublicationLevelFragment) {
        super(2);
        this.f300885l = tariffLfPublicationLevelFragment;
    }

    @Override // Y41.p
    public final G0 invoke(DeepLink deepLink, Long l12) {
        DeepLink deepLink2 = deepLink;
        Long l13 = l12;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f300885l.f300872p0;
        Bundle bundle = null;
        if (aVar == null) {
            aVar = null;
        }
        if (l13 != null) {
            long jLongValue = l13.longValue();
            Bundle bundle2 = new Bundle();
            bundle2.putLong("tariff_lf_publication_level_id", jLongValue);
            bundle = bundle2;
        }
        aVar.r6(bundle, deepLink2, "tariff_lf_publication_level_request_key");
        return G0.f406611a;
    }
}
