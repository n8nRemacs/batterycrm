package com.avito.android.universal_map.map;

import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UniversalMapFragment.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lkotlin/G0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class B extends kotlin.jvm.internal.N implements Y41.l<Map<String, ? extends Object>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalMapFragment f304781l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(UniversalMapFragment universalMapFragment) {
        super(1);
        this.f304781l = universalMapFragment;
    }

    @Override // Y41.l
    public final G0 invoke(Map<String, ? extends Object> map) {
        Map<String, ? extends Object> map2 = map;
        UniversalMapFragment universalMapFragment = this.f304781l;
        com.avito.android.universal_map.map.point_info.n nVar = universalMapFragment.f304842D0;
        if (nVar == null) {
            nVar = null;
        }
        nVar.H1(map2);
        com.avito.android.universal_map.map.pin_filters.j jVar = universalMapFragment.f304844F0;
        (jVar != null ? jVar : null).H1(map2);
        return G0.f406611a;
    }
}
