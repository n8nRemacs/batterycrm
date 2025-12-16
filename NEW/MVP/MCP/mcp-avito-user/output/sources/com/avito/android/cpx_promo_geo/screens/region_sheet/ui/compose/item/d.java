package com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.item;

import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vs.InterfaceC49374a;

/* compiled from: RegionSheetItem.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC49374a, G0> f128513l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RegionSheetState.Location f128514m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Map.Entry<Long, RegionSheetState.Location> f128515n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Y41.l<? super InterfaceC49374a, G0> lVar, RegionSheetState.Location location, Map.Entry<Long, RegionSheetState.Location> entry) {
        super(0);
        this.f128513l = lVar;
        this.f128514m = location;
        this.f128515n = entry;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f128513l.invoke(new InterfaceC49374a.f(this.f128514m.f128397a, Long.valueOf(this.f128515n.getValue().f128397a)));
        return G0.f406611a;
    }
}
