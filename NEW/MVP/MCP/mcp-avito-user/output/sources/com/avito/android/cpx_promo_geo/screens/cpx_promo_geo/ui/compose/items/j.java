package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items;

import androidx.compose.runtime.C22066f2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ts.C48709c;

/* compiled from: CpxPromoGeoDaysCountItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class j extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<C48709c.g> f128034l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f128035m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f128036n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f128037o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i12, Y41.l lVar, androidx.compose.ui.v vVar, List list) {
        super(2);
        this.f128034l = list;
        this.f128035m = lVar;
        this.f128036n = vVar;
        this.f128037o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f128037o | 1);
        androidx.compose.ui.v vVar = this.f128036n;
        List<C48709c.g> list = this.f128034l;
        m.a(iA2, this.f128035m, a12, vVar, list);
        return G0.f406611a;
    }
}
