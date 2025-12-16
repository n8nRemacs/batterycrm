package com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.search;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vs.InterfaceC49374a;

/* compiled from: RegionSheetSearchItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RegionSheetState.Location f128541l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l<InterfaceC49374a, G0> f128542m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f128543n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RegionSheetState.Location location, l lVar, v vVar, int i12) {
        super(2);
        this.f128541l = location;
        this.f128542m = lVar;
        this.f128543n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        l<InterfaceC49374a, G0> lVar = this.f128542m;
        g.b(this.f128541l, lVar, a12, iA2);
        return G0.f406611a;
    }
}
