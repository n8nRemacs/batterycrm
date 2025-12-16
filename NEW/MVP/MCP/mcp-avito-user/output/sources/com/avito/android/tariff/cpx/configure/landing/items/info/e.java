package com.avito.android.tariff.cpx.configure.landing.items.info;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CpxConfigureLandingInfoItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpx/configure/landing/items/info/e;", "Lcom/avito/android/tariff/cpx/configure/landing/items/info/d;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f296006b;

    @Inject
    public e(@k com.avito.android.util.text.a aVar) {
        this.f296006b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        gVar.v(aVar2.f296000c);
        String str = aVar2.f295999b;
        if (str != null) {
            gVar.Z(str);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            gVar.jN();
        }
        gVar.c4(aVar2.f296001d, this.f296006b);
    }
}
