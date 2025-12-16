package com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.item;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RegionSheetItemSubError.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class h extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RegionSheetState.d f128522l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f128523m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f128524n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f128525o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(RegionSheetState.d dVar, Y41.a aVar, v vVar, int i12) {
        super(2);
        this.f128522l = dVar;
        this.f128523m = aVar;
        this.f128524n = vVar;
        this.f128525o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f128525o | 1);
        Y41.a<G0> aVar = this.f128523m;
        v vVar = this.f128524n;
        i.a(this.f128522l, aVar, vVar, a12, iA2);
        return G0.f406611a;
    }
}
