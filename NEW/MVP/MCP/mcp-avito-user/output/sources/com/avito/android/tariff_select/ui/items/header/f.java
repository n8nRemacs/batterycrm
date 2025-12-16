package com.avito.android.tariff_select.ui.items.header;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TariffSelectHeaderItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_select/ui/items/header/f;", "Lcom/avito/android/tariff_select/ui/items/header/d;", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f301261b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@com.avito.android.tariff_select.di.b @k l<? super DeepLink, G0> lVar) {
        this.f301261b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.setTitle(aVar2.f301253b);
        AttributedText attributedText = aVar2.f301254c;
        hVar.g(attributedText);
        if (attributedText == null) {
            return;
        }
        attributedText.setOnDeepLinkClickListener(new e(this.f301261b));
    }
}
