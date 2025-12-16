package com.avito.android.universal_map.map;

import com.avito.android.universal_map.map.pin_filters.j;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UniversalMapFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0018\u0010\u0003\u001a\u0014 \u0002*\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00010\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/universal_map/map/pin_filters/j$b;", "Lcom/avito/android/universal_map/map/pin_filters/SelectedPinFilters;", "kotlin.jvm.PlatformType", "filters", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/universal_map/map/pin_filters/j$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class C extends kotlin.jvm.internal.N implements Y41.l<j.b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalMapFragment f304782l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(UniversalMapFragment universalMapFragment) {
        super(1);
        this.f304782l = universalMapFragment;
    }

    @Override // Y41.l
    public final G0 invoke(j.b bVar) {
        j.b bVar2 = bVar;
        com.avito.android.universal_map.map.pin_filters.j jVar = this.f304782l.f304844F0;
        if (jVar == null) {
            jVar = null;
        }
        jVar.kd(bVar2);
        return G0.f406611a;
    }
}
