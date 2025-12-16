package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose;

import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import ts.C48709c;

/* compiled from: CpxPromoGeoScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29601n extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48709c f128224l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f128225m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29601n(C48709c c48709c, InterfaceC22204y1 interfaceC22204y1) {
        super(0);
        this.f128224l = c48709c;
        this.f128225m = interfaceC22204y1;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f128224l.f439496e.f439527b;
        if (deepLink != null) {
            ((Y41.l) this.f128225m.getF42167b()).invoke(deepLink);
        }
        return G0.f406611a;
    }
}
