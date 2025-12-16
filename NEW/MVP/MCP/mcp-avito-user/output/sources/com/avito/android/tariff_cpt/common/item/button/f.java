package com.avito.android.tariff_cpt.common.item.button;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCptButtonItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/common/item/button/f;", "Lcom/avito/android/tariff_cpt/common/item/button/d;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e<DeepLink> f297528b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e f297529c;

    @Inject
    public f() {
        io.reactivex.rxjava3.subjects.e<DeepLink> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f297528b = eVar;
        this.f297529c = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        z<DeepLink> zVarLinkClicksV3;
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        AttributedText attributedText = aVar2.f297520e;
        if (attributedText != null && (zVarLinkClicksV3 = attributedText.linkClicksV3()) != null) {
            zVarLinkClicksV3.c(this.f297528b);
        }
        hVar.setTitle(aVar2.f297518c);
        DeepLink deepLink = aVar2.f297519d;
        if (deepLink != null) {
            hVar.a(new e(this, deepLink));
        }
        hVar.u2(attributedText);
        hVar.setLoading(aVar2.f297521f);
    }

    @Override // com.avito.android.deep_linking.K
    @k
    public final z<DeepLink> k() {
        return this.f297529c;
    }
}
