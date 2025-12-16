package com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.search;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RegionSheetSearchError.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RegionSheetState.SearchState.a.C3812a f128530l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f128531m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f128532n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f128533o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RegionSheetState.SearchState.a.C3812a c3812a, Y41.a aVar, v.a aVar2, int i12) {
        super(2);
        this.f128530l = c3812a;
        this.f128531m = aVar;
        this.f128532n = aVar2;
        this.f128533o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f128533o | 1);
        b.a(this.f128530l, this.f128531m, this.f128532n, a12, iA2);
        return G0.f406611a;
    }
}
