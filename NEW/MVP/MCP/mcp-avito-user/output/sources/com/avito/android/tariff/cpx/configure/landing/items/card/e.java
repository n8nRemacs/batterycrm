package com.avito.android.tariff.cpx.configure.landing.items.card;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.UniversalImage;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CpxConfigureLandingCardItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/landing/items/card/e;", "Lcom/avito/android/tariff/cpx/configure/landing/items/card/d;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f295975b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f295976c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k com.avito.android.util.text.a aVar, @k @YA0.b l<? super DeepLink, G0> lVar) {
        this.f295975b = aVar;
        this.f295976c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        ArrayList arrayList = aVar2.f295967c;
        l<DeepLink, G0> lVar = this.f295976c;
        if (arrayList == null || arrayList.isEmpty()) {
            hVar.XR();
        } else {
            hVar.Ez(lVar, this.f295975b, arrayList);
        }
        ArrayList arrayList2 = aVar2.f295968d;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            hVar.lC();
        } else {
            hVar.P3(arrayList2);
        }
        G0 g03 = null;
        ButtonAction buttonAction = aVar2.f295969e;
        if (buttonAction != null) {
            hVar.gc(buttonAction, lVar);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            hVar.L1();
        }
        UniversalImage universalImage = aVar2.f295970f;
        if (universalImage != null) {
            hVar.i(universalImage);
            g03 = G0.f406611a;
        }
        if (g03 == null) {
            hVar.p0();
        }
    }
}
