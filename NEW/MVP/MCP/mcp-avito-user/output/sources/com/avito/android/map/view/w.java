package com.avito.android.map.view;

import android.graphics.Bitmap;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.marker.MarkerItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MapViewInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/Bitmap;", "icon", "Lkotlin/G0;", "invoke", "(Landroid/graphics/Bitmap;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class w extends N implements Y41.l<Bitmap, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f185570l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AvitoMapMarker f185571m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ MarkerItem f185572n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C c12, AvitoMapMarker avitoMapMarker, MarkerItem markerItem) {
        super(1);
        this.f185570l = c12;
        this.f185571m = avitoMapMarker;
        this.f185572n = markerItem;
    }

    @Override // Y41.l
    public final G0 invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (bitmap2 != null) {
            AvitoMapMarker avitoMapMarker = this.f185571m;
            C c12 = this.f185570l;
            c12.getClass();
            MarkerItem markerItem = this.f185572n;
            avitoMapMarker.changeIcon(bitmap2, markerItem.getMapId(), c12.f185337e.resolveZIndex(markerItem), c12.f185336d.resolveAnchor(markerItem));
            avitoMapMarker.setData(markerItem);
        }
        return G0.f406611a;
    }
}
