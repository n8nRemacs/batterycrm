package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ts.C48709c;

/* compiled from: CpxPromoGeoSeparateRegionsToggleItem.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class A extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48709c.w f128003l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f128004m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(Y41.l lVar, C48709c.w wVar) {
        super(0);
        this.f128003l = wVar;
        this.f128004m = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f128003l.f439591c.f439601b;
        if (deepLink != null) {
            this.f128004m.invoke(deepLink);
        }
        return G0.f406611a;
    }
}
