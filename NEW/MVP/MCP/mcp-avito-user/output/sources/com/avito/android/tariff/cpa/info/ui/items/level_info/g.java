package com.avito.android.tariff.cpa.info.ui.items.level_info;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LevelInfoItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/level_info/g;", "Lcom/avito/android/tariff/cpa/info/ui/items/level_info/d;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f294921b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k l<? super DeepLink, G0> lVar) {
        this.f294921b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        iVar.setTitle(aVar2.f294910c);
        AttributedText attributedText = aVar2.f294911d;
        iVar.g(attributedText);
        ButtonAction buttonAction = aVar2.f294912e;
        iVar.r1(buttonAction != null ? buttonAction.getTitle() : null, new e(aVar2, this));
        iVar.MK(aVar2.f294913f);
        if (attributedText == null) {
            return;
        }
        attributedText.setOnDeepLinkClickListener(new f(this.f294921b));
    }
}
