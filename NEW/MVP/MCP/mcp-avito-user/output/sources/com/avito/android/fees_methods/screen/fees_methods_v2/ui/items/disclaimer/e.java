package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.disclaimer;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FeesMethodsV2DisclaimerItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/disclaimer/e;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/disclaimer/d;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f158349b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super DeepLink, G0> lVar) {
        this.f158349b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        AttributedText attributedText = ((a) aVar).f158343b;
        ((g) eVar).a6(attributedText);
        attributedText.setOnDeepLinkClickListener(new com.avito.android.cpt.pre_activation.ui.c(this, 10));
    }
}
