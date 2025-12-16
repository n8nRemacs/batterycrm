package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose;

import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import ts.C48709c;
import ts.InterfaceC48707a;

/* compiled from: CpxPromoGeoScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class r extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48709c f128233l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f128234m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C48709c c48709c, InterfaceC22204y1 interfaceC22204y1) {
        super(0);
        this.f128233l = c48709c;
        this.f128234m = interfaceC22204y1;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f128233l.f439507p.f439545c.f439527b;
        if (deepLink != null) {
            ((Y41.l) this.f128234m.getF42167b()).invoke(new InterfaceC48707a.e(deepLink));
        }
        return G0.f406611a;
    }
}
