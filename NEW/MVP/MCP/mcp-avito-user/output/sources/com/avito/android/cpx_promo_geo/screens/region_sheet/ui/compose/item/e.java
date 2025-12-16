package com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.item;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vs.InterfaceC49374a;

/* compiled from: RegionSheetItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RegionSheetState.Location f128516l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC49374a, G0> f128517m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ RegionSheetState.d f128518n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f128519o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RegionSheetState.Location location, Y41.l lVar, RegionSheetState.d dVar, v vVar, int i12) {
        super(2);
        this.f128516l = location;
        this.f128517m = lVar;
        this.f128518n = dVar;
        this.f128519o = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        g.a(this.f128516l, this.f128517m, this.f128518n, a12, iA2);
        return G0.f406611a;
    }
}
