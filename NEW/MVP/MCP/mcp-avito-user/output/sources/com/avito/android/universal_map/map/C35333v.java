package com.avito.android.universal_map.map;

import kotlin.Metadata;

/* compiled from: UniversalMapFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "markerId", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.universal_map.map.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35333v<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UniversalMapFragment f305954b;

    public C35333v(UniversalMapFragment universalMapFragment) {
        this.f305954b = universalMapFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String str = (String) obj;
        UniversalMapFragment universalMapFragment = this.f305954b;
        oG0.f fVar = universalMapFragment.f304873y0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.K4(UniversalMapFragment.q5(universalMapFragment), str);
    }
}
