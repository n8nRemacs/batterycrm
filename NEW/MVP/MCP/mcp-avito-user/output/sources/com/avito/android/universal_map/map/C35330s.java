package com.avito.android.universal_map.map;

import com.avito.android.universal_map.map.pin_filters.j;
import kotlin.Metadata;
import qG0.C47290a;

/* compiled from: UniversalMapFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LqG0/a;", "newCameraCoordinates", "Lkotlin/G0;", "accept", "(LqG0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.universal_map.map.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35330s<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UniversalMapFragment f305943b;

    public C35330s(UniversalMapFragment universalMapFragment) {
        this.f305943b = universalMapFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C47290a c47290a = (C47290a) obj;
        UniversalMapFragment universalMapFragment = this.f305943b;
        oG0.f fVar = universalMapFragment.f304873y0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.xd(c47290a);
        T t12 = universalMapFragment.f304841C0;
        if (t12 == null) {
            t12 = null;
        }
        com.avito.android.universal_map.map.pin_filters.j jVar = universalMapFragment.f304844F0;
        if (jVar == null) {
            jVar = null;
        }
        j.b bVar = (j.b) jVar.getF305787Z().getValue();
        t12.Gc(c47290a, bVar != null ? bVar.f305749b : null, false);
    }
}
