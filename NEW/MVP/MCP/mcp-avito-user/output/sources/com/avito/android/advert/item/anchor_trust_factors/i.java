package com.avito.android.advert.item.anchor_trust_factors;

import com.avito.android.advert.item.anchor_trust_factors.d;
import com.avito.android.advert.item.anchor_trust_factors.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.anchors.AnchorTrustFactors;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsAnchorTrustFactorsView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f.b f72833l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AnchorTrustFactors.Item f72834m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f.b bVar, AnchorTrustFactors.Item item) {
        super(0);
        this.f72833l = bVar;
        this.f72834m = item;
    }

    @Override // Y41.a
    public final G0 invoke() {
        f.b bVar = this.f72833l;
        if (bVar != null) {
            DeepLink onTapDeepLink = this.f72834m.getOnTapDeepLink();
            d.a aVar = (d.a) bVar;
            AnchorTrustFactors anchorTrustFactorsA = AnchorTrustFactors.a(aVar.f72813b);
            ((d.C2190d) aVar.f72814c).invoke(anchorTrustFactorsA);
            ((d.e) aVar.f72815d).invoke(0);
            f fVar = aVar.f72812a;
            fVar.mj(null);
            fVar.G30(null);
            fVar.hI(anchorTrustFactorsA, 0);
            if (onTapDeepLink != null) {
                aVar.f72816e.g(onTapDeepLink);
            }
        }
        return G0.f406611a;
    }
}
