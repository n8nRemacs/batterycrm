package com.avito.android.universal_map.map;

import com.avito.android.universal_map.map.AbstractC35294d;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UniversalMapFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/universal_map/map/d;", "kotlin.jvm.PlatformType", "preselectEvent", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/universal_map/map/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.universal_map.map.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35324l extends kotlin.jvm.internal.N implements Y41.l<AbstractC35294d, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalMapFragment f305235l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35324l(UniversalMapFragment universalMapFragment) {
        super(1);
        this.f305235l = universalMapFragment;
    }

    @Override // Y41.l
    public final G0 invoke(AbstractC35294d abstractC35294d) {
        AbstractC35294d abstractC35294d2 = abstractC35294d;
        boolean z12 = abstractC35294d2 instanceof AbstractC35294d.a;
        UniversalMapFragment universalMapFragment = this.f305235l;
        if (z12) {
            com.avito.android.universal_map.map.point_info.n nVar = universalMapFragment.f304842D0;
            (nVar != null ? nVar : null).h9(((AbstractC35294d.a) abstractC35294d2).f305013a);
        } else if (abstractC35294d2 instanceof AbstractC35294d.b) {
            oG0.f fVar = universalMapFragment.f304873y0;
            AbstractC35294d.b bVar = (AbstractC35294d.b) abstractC35294d2;
            (fVar != null ? fVar : null).i2(bVar.f305014a, UniversalMapFragment.q5(universalMapFragment), bVar.f305014a.f304930j);
        }
        return G0.f406611a;
    }
}
