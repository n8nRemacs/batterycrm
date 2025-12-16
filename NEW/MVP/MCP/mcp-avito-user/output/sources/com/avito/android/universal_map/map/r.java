package com.avito.android.universal_map.map;

import com.avito.android.universal_map.map.common.marker.Marker;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UniversalMapFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/Marker$Pin$IconType;", "iconType", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/universal_map/map/common/marker/Marker$Pin$IconType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class r extends kotlin.jvm.internal.N implements Y41.l<Marker.Pin.IconType, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalMapFragment f305942l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(UniversalMapFragment universalMapFragment) {
        super(1);
        this.f305942l = universalMapFragment;
    }

    @Override // Y41.l
    public final G0 invoke(Marker.Pin.IconType iconType) {
        Marker.Pin.IconType iconType2 = iconType;
        oG0.f fVar = this.f305942l.f304873y0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.fd(iconType2);
        return G0.f406611a;
    }
}
