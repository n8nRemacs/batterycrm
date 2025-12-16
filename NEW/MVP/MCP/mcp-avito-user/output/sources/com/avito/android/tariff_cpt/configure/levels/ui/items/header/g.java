package com.avito.android.tariff_cpt.configure.levels.ui.items.header;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TariffCptConfigureLevelsHeaderItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/levels/ui/items/header/g;", "Lcom/avito/android/tariff_cpt/configure/levels/ui/items/header/d;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f297939b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super DeepLink, G0> lVar) {
        this.f297939b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        AttributedText attributedText = aVar2.f297930b;
        iVar.e(attributedText);
        AttributedText attributedText2 = aVar2.f297931c;
        iVar.g(attributedText2);
        l<DeepLink, G0> lVar = this.f297939b;
        attributedText.setOnDeepLinkClickListener(new e(lVar));
        if (attributedText2 == null) {
            return;
        }
        attributedText2.setOnDeepLinkClickListener(new f(lVar));
    }
}
