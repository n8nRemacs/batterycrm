package com.avito.android.tariff_cpt.info.ui.items.header;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff_cpt.info.ui.items.header.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CptInfoHeaderItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/header/g;", "Lcom/avito/android/tariff_cpt/info/ui/items/header/d;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f298362b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@com.avito.android.tariff_cpt.common.di.b @k l<? super DeepLink, G0> lVar) {
        this.f298362b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        iVar.setTitle(aVar2.f298342c);
        AttributedText attributedText = aVar2.f298343d;
        iVar.g(attributedText);
        iVar.t30(aVar2.f298344e, new e(aVar2, this));
        l<DeepLink, G0> lVar = this.f298362b;
        List<a.b> list = aVar2.f298345f;
        if (list != null) {
            iVar.K2(lVar, list);
        }
        if (attributedText == null) {
            return;
        }
        attributedText.setOnDeepLinkClickListener(new f(lVar));
    }
}
