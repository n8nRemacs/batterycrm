package com.avito.android.tariff_lf_publication.count;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff_lf_publication.count.deeplink.TariffLfPublicationCountLink;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;

/* compiled from: TariffLfPublicationCountFragmentFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_lf_publication/count/d;", "LA50/b;", "Lcom/avito/android/tariff_lf_publication/count/deeplink/TariffLfPublicationCountLink;", "<init>", "()V", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d implements A50.b<TariffLfPublicationCountLink> {
    @Override // A50.b
    public final Fragment a(DeepLink deepLink) {
        TariffLfPublicationCountFragment.f300720G0.getClass();
        TariffLfPublicationCountFragment tariffLfPublicationCountFragment = new TariffLfPublicationCountFragment();
        C35966w1.a(tariffLfPublicationCountFragment, -1, new b(((TariffLfPublicationCountLink) deepLink).f300757b));
        return tariffLfPublicationCountFragment;
    }
}
