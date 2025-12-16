package com.avito.android.tariff_cpt.configure.migration.item.terms;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CptMigrationTermsItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/migration/item/terms/e;", "Lcom/avito/android/tariff_cpt/configure/migration/item/terms/d;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e<DeepLink> f298068b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e f298069c;

    @Inject
    public e() {
        io.reactivex.rxjava3.subjects.e<DeepLink> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f298068b = eVar;
        this.f298069c = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        z<DeepLink> zVarLinkClicksV3;
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        AttributedText attributedText = aVar2.f298059c;
        z<DeepLink> zVarLinkClicksV32 = attributedText.linkClicksV3();
        io.reactivex.rxjava3.subjects.e<DeepLink> eVar2 = this.f298068b;
        zVarLinkClicksV32.c(eVar2);
        AttributedText attributedText2 = aVar2.f298060d;
        if (attributedText2 != null && (zVarLinkClicksV3 = attributedText2.linkClicksV3()) != null) {
            zVarLinkClicksV3.c(eVar2);
        }
        gVar.e(attributedText);
        gVar.k(attributedText2);
        gVar.Wx(aVar2.f298062f, aVar2.f298061e);
        gVar.cA(aVar2.f298063g);
    }

    @Override // com.avito.android.deep_linking.K
    @k
    public final z<DeepLink> k() {
        return this.f298069c;
    }
}
