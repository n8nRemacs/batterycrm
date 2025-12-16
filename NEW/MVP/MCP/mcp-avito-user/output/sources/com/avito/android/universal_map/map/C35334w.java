package com.avito.android.universal_map.map;

import kotlin.Metadata;

/* compiled from: UniversalMapFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.universal_map.map.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35334w<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UniversalMapFragment f305955b;

    public C35334w(UniversalMapFragment universalMapFragment) {
        this.f305955b = universalMapFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        UniversalMapFragment universalMapFragment = this.f305955b;
        oG0.f fVar = universalMapFragment.f304873y0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.uc();
        com.avito.android.universal_map.map.point_info.n nVar = universalMapFragment.f304842D0;
        (nVar != null ? nVar : null).hide();
    }
}
