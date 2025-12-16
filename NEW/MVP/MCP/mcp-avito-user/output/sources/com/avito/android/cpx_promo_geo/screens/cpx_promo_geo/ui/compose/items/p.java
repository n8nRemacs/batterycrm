package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items;

import androidx.compose.runtime.C22066f2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CpxPromoGeoDescription.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class p extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f128188l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f128189m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f128190n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(AttributedText attributedText, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f128188l = attributedText;
        this.f128189m = lVar;
        this.f128190n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(393);
        androidx.compose.ui.v vVar = this.f128190n;
        q.a(this.f128188l, this.f128189m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
