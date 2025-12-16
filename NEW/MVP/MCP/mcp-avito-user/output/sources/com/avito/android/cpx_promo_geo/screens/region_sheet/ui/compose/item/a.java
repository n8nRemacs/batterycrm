package com.avito.android.cpx_promo_geo.screens.region_sheet.ui.compose.item;

import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vs.InterfaceC49374a;

/* compiled from: RegionSheetItem.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC49374a, G0> f128507l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RegionSheetState.Location f128508m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Y41.l<? super InterfaceC49374a, G0> lVar, RegionSheetState.Location location) {
        super(0);
        this.f128507l = lVar;
        this.f128508m = location;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f128507l.invoke(new InterfaceC49374a.f(this.f128508m.f128397a, null, 2, null));
        return G0.f406611a;
    }
}
