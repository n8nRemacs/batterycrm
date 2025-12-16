package com.avito.android.universal_map.map;

import com.avito.android.universal_map.map.common.marker.Marker;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UniversalMapFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/Marker$Pin;", "marker", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/universal_map/map/common/marker/Marker$Pin;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class A extends kotlin.jvm.internal.N implements Y41.l<Marker.Pin, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalMapFragment f304780l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(UniversalMapFragment universalMapFragment) {
        super(1);
        this.f304780l = universalMapFragment;
    }

    @Override // Y41.l
    public final G0 invoke(Marker.Pin pin) {
        Marker.Pin pin2 = pin;
        UniversalMapFragment universalMapFragment = this.f304780l;
        T t12 = universalMapFragment.f304841C0;
        if (t12 == null) {
            t12 = null;
        }
        t12.n8(pin2);
        if (pin2 != null) {
            com.avito.android.universal_map.map.point_info.n nVar = universalMapFragment.f304842D0;
            if (nVar == null) {
                nVar = null;
            }
            nVar.h9(pin2);
            UniversalMapBottomSheet[] universalMapBottomSheetArr = UniversalMapBottomSheet.f304836b;
            com.avito.android.universal_map.map.pin_filters.j jVar = universalMapFragment.f304844F0;
            (jVar != null ? jVar : null).T2(true);
        }
        return G0.f406611a;
    }
}
