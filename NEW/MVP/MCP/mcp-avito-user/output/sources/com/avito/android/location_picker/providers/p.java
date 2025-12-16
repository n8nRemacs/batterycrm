package com.avito.android.location_picker.providers;

import com.avito.android.avito_map.AvitoMapBounds;
import kotlin.Metadata;
import uF.d;

/* compiled from: AddressGeoCoder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LuF/d;", "it", "Lkotlin/G0;", "accept", "(LuF/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f182464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f182465c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AvitoMapBounds f182466d;

    public p(u uVar, String str, AvitoMapBounds avitoMapBounds) {
        this.f182464b = uVar;
        this.f182465c = str;
        this.f182466d = avitoMapBounds;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        uF.d dVar = (uF.d) obj;
        if (dVar instanceof d.c) {
            this.f182464b.f182480c.put(this.f182465c + ' ' + this.f182466d, dVar);
        }
    }
}
