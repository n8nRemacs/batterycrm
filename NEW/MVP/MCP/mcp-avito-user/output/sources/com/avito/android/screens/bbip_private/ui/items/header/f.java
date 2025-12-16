package com.avito.android.screens.bbip_private.ui.items.header;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import hh.InterfaceC40938f;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BbipPrivateHeaderItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/header/f;", "Lcom/avito/android/screens/bbip_private/ui/items/header/d;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f260873b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@InterfaceC40938f @k l<? super DeepLink, G0> lVar) {
        this.f260873b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.setTitle(aVar2.f260863c);
        hVar.n0(aVar2.f260864d);
        AttributedText attributedText = aVar2.f260865e;
        hVar.g(attributedText);
        if (attributedText == null) {
            return;
        }
        attributedText.setOnDeepLinkClickListener(new e(this.f260873b));
    }
}
