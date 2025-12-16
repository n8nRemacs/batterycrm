package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ts.C48709c;

/* compiled from: CpxPromoGeoAutoManualChooserItem.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29587b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48709c.C48711b f128022l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f128023m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C29587b(C48709c.C48711b c48711b, Y41.l<? super DeepLink, G0> lVar) {
        super(0);
        this.f128022l = c48711b;
        this.f128023m = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f128022l.f439517b.f439601b;
        if (deepLink != null) {
            this.f128023m.invoke(deepLink);
        }
        return G0.f406611a;
    }
}
