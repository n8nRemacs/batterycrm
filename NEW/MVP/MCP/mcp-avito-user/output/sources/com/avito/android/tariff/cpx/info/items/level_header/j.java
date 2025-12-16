package com.avito.android.tariff.cpx.info.items.level_header;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCpxInfoLevelHeaderItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/level_header/j;", "Lcom/avito/android/tariff/cpx/info/items/level_header/f;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<DeepLink, G0> f296547b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<DeepLink, G0> f296548c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f296549d;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public j(@com.avito.android.tariff.cpx.info.di.c @Y61.k Y41.l<? super DeepLink, G0> lVar, @Y61.k @YA0.b Y41.l<? super DeepLink, G0> lVar2, @Y61.k com.avito.android.util.text.a aVar) {
        this.f296547b = lVar;
        this.f296548c = lVar2;
        this.f296549d = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        l lVar = (l) eVar;
        c cVar = (c) aVar;
        lVar.setTitle(cVar.f296534b);
        b bVar = cVar.f296535c;
        if (bVar != null) {
            lVar.tk(bVar, new g(this, bVar));
        }
        AttributedText attributedText = cVar.f296536d;
        com.avito.android.util.text.a aVar2 = this.f296549d;
        lVar.de(attributedText, aVar2);
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new h(this.f296548c));
        }
        a aVar3 = cVar.f296537e;
        if (aVar3 != null) {
            lVar.Ql(aVar3, aVar2, new i(aVar3, this));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            lVar.ZV();
        }
    }
}
