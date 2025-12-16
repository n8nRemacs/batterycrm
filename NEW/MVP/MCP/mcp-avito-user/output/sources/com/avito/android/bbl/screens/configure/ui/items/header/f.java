package com.avito.android.bbl.screens.configure.ui.items.header;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import nh.InterfaceC44426e;

/* compiled from: BblConfigureHeaderItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbl/screens/configure/ui/items/header/f;", "Lcom/avito/android/bbl/screens/configure/ui/items/header/d;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f99261b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@InterfaceC44426e @k l<? super DeepLink, G0> lVar) {
        this.f99261b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        AttributedText attributedText = ((a) aVar).f99255b;
        ((h) eVar).e(attributedText);
        attributedText.setOnDeepLinkClickListener(new e(this.f99261b));
    }
}
