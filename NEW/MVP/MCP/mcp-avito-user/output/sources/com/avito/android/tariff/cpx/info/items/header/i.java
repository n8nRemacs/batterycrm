package com.avito.android.tariff.cpx.info.items.header;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TariffCpxInfoHeaderItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/header/i;", "Lcom/avito/android/tariff/cpx/info/items/header/f;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<DeepLink, G0> f296515b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public i(@Y61.k @YA0.b Y41.l<? super DeepLink, G0> lVar) {
        this.f296515b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        c cVar = (c) aVar;
        kVar.setTitle(cVar.f296504c);
        AttributedText attributedText = cVar.f296505d;
        kVar.g(attributedText);
        kVar.Zx(cVar.f296506e, new g(cVar, this));
        Y41.l<DeepLink, G0> lVar = this.f296515b;
        List<a> list = cVar.f296507f;
        if (list != null) {
            kVar.K2(lVar, list);
        }
        if (attributedText == null) {
            return;
        }
        attributedText.setOnDeepLinkClickListener(new h(lVar));
    }
}
