package com.avito.android.avito_map.icon_factory;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import com.avito.android.avito_map.marker.AvitoMarkerItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AvitoMarkerIconFactory.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J<\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/avito_map/icon_factory/AvitoMarkerIconFactory;", "", "Lcom/avito/android/avito_map/marker/AvitoMarkerItem;", "item", "Landroid/graphics/Bitmap;", "getIcon", "(Lcom/avito/android/avito_map/marker/AvitoMarkerItem;)Landroid/graphics/Bitmap;", "Lkotlin/Function1;", "Lkotlin/S;", "name", "icon", "Lkotlin/G0;", "iconListener", "getIconAsync", "(Lcom/avito/android/avito_map/marker/AvitoMarkerItem;LY41/l;)V", "", "getZoomPadding", "()I", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AvitoMarkerIconFactory {
    @l
    Bitmap getIcon(@k AvitoMarkerItem item);

    void getIconAsync(@k AvitoMarkerItem item, @k Y41.l<? super Bitmap, G0> iconListener);

    int getZoomPadding();

    /* compiled from: AvitoMarkerIconFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void getIconAsync(@k AvitoMarkerIconFactory avitoMarkerIconFactory, @k AvitoMarkerItem avitoMarkerItem, @k Y41.l<? super Bitmap, G0> lVar) {
        }
    }
}
