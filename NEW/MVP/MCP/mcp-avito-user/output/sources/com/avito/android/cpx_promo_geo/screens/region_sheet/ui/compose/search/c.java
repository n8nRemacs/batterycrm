package com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.search;

import Y41.p;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RegionSheetSearchItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20576h2 f128534l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RegionSheetState.Location f128535m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C20576h2 c20576h2, RegionSheetState.Location location, int i12) {
        super(2);
        this.f128534l = c20576h2;
        this.f128535m = location;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(71);
        g.a(this.f128534l, this.f128535m, a12, iA2);
        return G0.f406611a;
    }
}
