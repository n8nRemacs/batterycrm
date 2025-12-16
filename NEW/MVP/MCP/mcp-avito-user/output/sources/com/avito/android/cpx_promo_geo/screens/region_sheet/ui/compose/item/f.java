package com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.item;

import Y41.p;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RegionSheetItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C20576h2 f128520l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RegionSheetState.Location f128521m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C20576h2 c20576h2, RegionSheetState.Location location, int i12) {
        super(2);
        this.f128520l = c20576h2;
        this.f128521m = location;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(71);
        g.b(this.f128520l, this.f128521m, a12, iA2);
        return G0.f406611a;
    }
}
