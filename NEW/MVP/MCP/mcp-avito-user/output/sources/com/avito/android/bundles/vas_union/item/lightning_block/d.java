package com.avito.android.bundles.vas_union.item.lightning_block;

import Rh.C15041a;
import Y61.k;
import com.avito.android.deep_linking.K;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.B;
import com.avito.android.remote.model.text.AttributedText;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LightningBlockItemPresenter.kt */
@B
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/bundles/vas_union/item/lightning_block/d;", "LTV0/d;", "Lcom/avito/android/bundles/vas_union/item/lightning_block/f;", "Lcom/avito/android/bundles/vas_union/item/lightning_block/a;", "Lcom/avito/android/deep_linking/K;", "<init>", "()V", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements TV0.d<f, a>, K {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e<DeepLink> f108596b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e f108597c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C15041a f108598d;

    @Inject
    public d() {
        io.reactivex.rxjava3.subjects.e<DeepLink> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f108596b = eVar;
        this.f108597c = eVar;
        this.f108598d = new C15041a(this, 22);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        a aVar2 = (a) aVar;
        com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(aVar2.f108591c);
        AttributedText attributedText = aVar2.f108590b;
        ((f) eVar).Nd(attributedText, aVarB);
        attributedText.setOnDeepLinkClickListener(this.f108598d);
    }

    @Override // com.avito.android.deep_linking.K
    @k
    public final z<DeepLink> k() {
        return this.f108597c;
    }
}
