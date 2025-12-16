package com.avito.android.advert.item.anchor_trust_factors;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.I1;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert.item.safedeal.InterfaceC28173a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.anchors.AnchorTrustFactors;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAnchorsPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/anchor_trust_factors/m;", "Lcom/avito/android/advert/item/anchor_trust_factors/l;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.anchor_trust_factors.topbar.d f72844a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public I1 f72845b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert.item.anchor_trust_factors.topbar.k f72846c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Z0 f72847d;

    @Inject
    public m(@Y61.k com.avito.android.advert.item.anchor_trust_factors.topbar.d dVar) {
        this.f72844a = dVar;
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.l
    public final void b() {
        this.f72845b = null;
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.l
    public final void c() {
        this.f72846c = null;
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.l
    public final void c0() {
        this.f72847d = null;
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.l
    public final void d(@Y61.k I1 i12) {
        this.f72845b = i12;
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.l
    public final void e(@Y61.k com.avito.android.advert.item.anchor_trust_factors.topbar.l lVar) {
        this.f72846c = lVar;
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.l
    public final void f(@Y61.k AnchorTrustFactors.Item item) {
        I1 i12;
        com.avito.android.advert.item.anchor_trust_factors.topbar.k kVar;
        com.avito.android.advert.item.anchor_trust_factors.topbar.d dVar;
        Integer numB;
        String blockIdentifier = item.getBlockIdentifier();
        if (blockIdentifier == null || (i12 = this.f72845b) == null || (kVar = this.f72846c) == null || (numB = (dVar = this.f72844a).b(blockIdentifier, i12)) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        if (dVar.a(iIntValue, i12)) {
            i12.L(iIntValue, kVar.getHeight());
        } else {
            i12.L(iIntValue, 0);
        }
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.l
    public final void g(@Y61.k DeepLink deepLink) {
        Z0 z02 = this.f72847d;
        if (z02 != null) {
            InterfaceC28173a.InterfaceC2325a.C2326a.a(z02, deepLink, null, 6);
        }
    }

    @Override // com.avito.android.advert.item.anchor_trust_factors.l
    public final void j0(@Y61.k Z0 z02) {
        this.f72847d = z02;
    }
}
