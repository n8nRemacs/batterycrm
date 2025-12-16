package com.avito.android.tariff.cpa.info.ui.items.alert;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AlertItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/alert/f;", "Lcom/avito/android/tariff/cpa/info/ui/items/alert/c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f294804b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super DeepLink, G0> lVar) {
        this.f294804b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        AlertItem alertItem = (AlertItem) aVar;
        hVar.setTitle(alertItem.f294788c);
        AttributedText attributedText = alertItem.f294789d;
        hVar.g(attributedText);
        hVar.S5(alertItem.f294790e);
        hVar.j0(alertItem.f294791f);
        hVar.xz(alertItem.f294792g);
        l<DeepLink, G0> lVar = this.f294804b;
        hVar.Q2(new d(1, lVar, l.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0), alertItem.f294793h);
        if (attributedText == null) {
            return;
        }
        attributedText.setOnDeepLinkClickListener(new e(lVar));
    }
}
