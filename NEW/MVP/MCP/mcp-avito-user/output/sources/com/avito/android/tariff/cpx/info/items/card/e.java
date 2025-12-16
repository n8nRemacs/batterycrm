package com.avito.android.tariff.cpx.info.items.card;

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

/* compiled from: TariffCpxInfoCardItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/card/e;", "Lcom/avito/android/tariff/cpx/info/items/card/d;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f296440b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f296441c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k com.avito.android.util.text.a aVar, @k @YA0.b l<? super DeepLink, G0> lVar) {
        this.f296440b = aVar;
        this.f296441c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        ArrayList arrayList = aVar2.f296435g;
        l<DeepLink, G0> lVar = this.f296441c;
        if (arrayList == null || arrayList.isEmpty()) {
            gVar.Ta();
        } else {
            gVar.TQ(lVar, this.f296440b, arrayList);
        }
        Integer num = aVar2.f296434f;
        gVar.P9(num != null ? num.intValue() : y6.b(12));
        DeepLink deepLink = aVar2.f296432d;
        if (deepLink != null) {
            gVar.W8(lVar, deepLink);
        }
        gVar.LN(aVar2.f296433e);
    }
}
