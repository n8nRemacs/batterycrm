package com.avito.android.universal_map.map_mvi.point_info;

import android.view.ViewGroup;
import com.avito.android.universal_map.UniversalMapParams;
import com.avito.android.util.y6;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UniversalMapPointInfoViewMviV2Impl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f306320l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar) {
        super(0);
        this.f306320l = oVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        o oVar = this.f306320l;
        int measuredHeight = oVar.f306325a.getMeasuredHeight();
        UniversalMapParams.PointInfoBottomSheetSettings pointInfoBottomSheetSettings = oVar.f306330f;
        int i12 = (int) (measuredHeight * pointInfoBottomSheetSettings.f304755c);
        int iB2 = y6.b(pointInfoBottomSheetSettings.f304754b);
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = oVar.f306347w;
        bottomSheetBehavior.N(i12, false);
        bottomSheetBehavior.f356006l = measuredHeight - iB2;
        oVar.f306335k.setMinimumHeight(i12);
        return G0.f406611a;
    }
}
