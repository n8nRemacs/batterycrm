package com.avito.android.tariff.cpa.configure_advance.items.extra_info;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExtraInfoItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_advance/items/extra_info/e;", "Lcom/avito/android/tariff/cpa/configure_advance/items/extra_info/d;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e<DeepLink> f294348b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e f294349c;

    @Inject
    public e() {
        io.reactivex.rxjava3.subjects.e<DeepLink> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f294348b = eVar;
        this.f294349c = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        gVar.setTitle(aVar2.f294340b);
        AttributedText attributedText = aVar2.f294341c;
        gVar.g(attributedText);
        attributedText.linkClicksV3().c(this.f294348b);
    }

    @Override // com.avito.android.deep_linking.K
    @k
    public final z<DeepLink> k() {
        return this.f294349c;
    }
}
