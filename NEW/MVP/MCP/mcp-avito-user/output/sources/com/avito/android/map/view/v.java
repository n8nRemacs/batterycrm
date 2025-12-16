package com.avito.android.map.view;

import android.graphics.Bitmap;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.avito_map.marker.MarkerItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MapViewInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Bitmap;", "icon", "Lkotlin/G0;", "invoke", "(Landroid/graphics/Bitmap;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class v extends N implements Y41.l<Bitmap, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f185567l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AvitoMap f185568m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MarkerItem f185569n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(C c12, AvitoMap avitoMap, MarkerItem markerItem) {
        super(1);
        this.f185567l = c12;
        this.f185568m = avitoMap;
        this.f185569n = markerItem;
    }

    @Override // Y41.l
    public final G0 invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (bitmap2 != null) {
            this.f185567l.m(this.f185568m, this.f185569n, bitmap2);
        }
        return G0.f406611a;
    }
}
