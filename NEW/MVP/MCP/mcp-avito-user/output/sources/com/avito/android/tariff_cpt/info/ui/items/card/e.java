package com.avito.android.tariff_cpt.info.ui.items.card;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.y6;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CptInfoCardItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/card/e;", "Lcom/avito/android/tariff_cpt/info/ui/items/card/d;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f298280b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@com.avito.android.tariff_cpt.common.di.b @k l<? super DeepLink, G0> lVar) {
        this.f298280b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        ArrayList arrayList = aVar2.f298273g;
        l<DeepLink, G0> lVar = this.f298280b;
        if (arrayList == null || arrayList.isEmpty()) {
            gVar.Ta();
        } else {
            gVar.r60(lVar, arrayList);
        }
        Integer num = aVar2.f298272f;
        gVar.P9(num != null ? num.intValue() : y6.b(12));
        DeepLink deepLink = aVar2.f298270d;
        if (deepLink != null) {
            gVar.W8(lVar, deepLink);
        }
        gVar.t70(aVar2.f298271e);
    }
}
