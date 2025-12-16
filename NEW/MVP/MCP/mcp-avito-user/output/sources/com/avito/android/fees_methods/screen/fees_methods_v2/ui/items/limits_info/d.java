package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.limits_info;

import Mf0.InterfaceC14484d;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FeesMethodsV2LimitsInfoItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/limits_info/d;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/limits_info/c;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC14484d f158426b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f158427c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k InterfaceC14484d interfaceC14484d, @k l<? super DeepLink, G0> lVar) {
        this.f158426b = interfaceC14484d;
        this.f158427c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        FeesMethodsV2LimitsInfoItem feesMethodsV2LimitsInfoItem = (FeesMethodsV2LimitsInfoItem) aVar;
        fVar.e(feesMethodsV2LimitsInfoItem.f158410c);
        fVar.h(feesMethodsV2LimitsInfoItem.f158411d);
        fVar.AX(feesMethodsV2LimitsInfoItem.f158412e, feesMethodsV2LimitsInfoItem.f158413f);
        fVar.mR(feesMethodsV2LimitsInfoItem.f158414g);
        AttributedText attributedText = feesMethodsV2LimitsInfoItem.f158415h;
        fVar.U4(attributedText);
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new com.avito.android.advert_details_items.buyer_bonuses.g(2, this, feesMethodsV2LimitsInfoItem));
        }
    }
}
