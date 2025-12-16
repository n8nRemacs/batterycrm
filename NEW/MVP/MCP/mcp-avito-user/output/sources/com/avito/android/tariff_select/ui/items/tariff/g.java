package com.avito.android.tariff_select.ui.items.tariff;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TariffSelectTariffItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_select/ui/items/tariff/g;", "Lcom/avito/android/tariff_select/ui/items/tariff/d;", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f301278b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f301279c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@com.avito.android.tariff_select.di.b @k l<? super DeepLink, G0> lVar, @com.avito.android.tariff_select.di.c @k l<? super DeepLink, G0> lVar2) {
        this.f301278b = lVar;
        this.f301279c = lVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        AttributedText attributedText = aVar2.f301267c;
        iVar.r(attributedText);
        iVar.i(aVar2.f301269e);
        iVar.setListener(new e(this, aVar2));
        attributedText.setOnDeepLinkClickListener(new f(this.f301278b));
    }
}
