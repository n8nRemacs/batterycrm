package com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.header;

import Y41.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CpxLevelInfoHeaderItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/cpx_level_info/header/h;", "Lcom/avito/android/tariff/cpa/info/ui/items/cpx_level_info/header/e;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<DeepLink, G0> f294849b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k l<? super DeepLink, G0> lVar) {
        this.f294849b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        b bVar = (b) aVar;
        jVar.setTitle(bVar.f294838c);
        AttributedText attributedText = bVar.f294839d;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new f(this.f294849b));
        }
        jVar.g(attributedText);
        jVar.QT(bVar.f294840e, new g(bVar, this));
    }
}
