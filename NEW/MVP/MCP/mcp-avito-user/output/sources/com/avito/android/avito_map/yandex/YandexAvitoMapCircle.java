package com.avito.android.avito_map.yandex;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Color;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapPoint;
import com.yandex.mapkit.geometry.Circle;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CircleMapObject;
import kotlin.Metadata;

/* compiled from: YandexAvitoMapCircle.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u00132\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J/\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b&\u0010,J\u001d\u0010-\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/avito/android/avito_map/yandex/YandexAvitoMapCircle;", "Lcom/avito/android/avito_map/AvitoMapMarker;", "Lcom/yandex/mapkit/map/CircleMapObject;", "circle", "<init>", "(Lcom/yandex/mapkit/map/CircleMapObject;)V", "", "alpha", "zoomLevel", "", "isDarkTheme", "coefficient", "", "getColor", "(FFZF)Ljava/lang/Integer;", "Lcom/avito/android/avito_map/AvitoMapPoint;", "getPosition", "()Lcom/avito/android/avito_map/AvitoMapPoint;", "position", "Lkotlin/G0;", "setPosition", "(Lcom/avito/android/avito_map/AvitoMapPoint;)V", "", "data", "setData", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "visible", "setVisibility", "(Z)V", "zIndex", "setZIndex", "(F)V", "isVisible", "()Z", "Landroid/graphics/Bitmap;", "icon", "changeIcon", "(Landroid/graphics/Bitmap;)V", "", "imageId", "Lcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;", "anchor", "(Landroid/graphics/Bitmap;Ljava/lang/String;FLcom/avito/android/avito_map/AvitoMapMarker$AvitoMapAnchor;)V", "changeAlpha", "(FZ)V", "Lcom/yandex/mapkit/map/CircleMapObject;", "getCircle", "()Lcom/yandex/mapkit/map/CircleMapObject;", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class YandexAvitoMapCircle implements AvitoMapMarker {

    @k
    private final CircleMapObject circle;

    public YandexAvitoMapCircle(@k CircleMapObject circleMapObject) {
        this.circle = circleMapObject;
    }

    @SuppressLint({"CustomColorsKotlin"})
    private final Integer getColor(float alpha, float zoomLevel, boolean isDarkTheme, float coefficient) {
        String hexString = Integer.toHexString((int) ((alpha - (Math.abs(12.0f - zoomLevel) * coefficient)) * 2.55f));
        if (hexString.length() != 1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("#0");
        sb2.append(hexString);
        sb2.append(isDarkTheme ? "FFFFFF" : "000000");
        return Integer.valueOf(Color.parseColor(sb2.toString()));
    }

    public static /* synthetic */ Integer getColor$default(YandexAvitoMapCircle yandexAvitoMapCircle, float f12, float f13, boolean z12, float f14, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            f14 = 2.0f;
        }
        return yandexAvitoMapCircle.getColor(f12, f13, z12, f14);
    }

    public final void changeAlpha(float zoomLevel, boolean isDarkTheme) {
        if (12.0f > zoomLevel || zoomLevel > 18.0f) {
            return;
        }
        Integer color = getColor(isDarkTheme ? 17.0f : 6.0f, zoomLevel, isDarkTheme, isDarkTheme ? 4.0f : 2.0f);
        if (color != null) {
            this.circle.setFillColor(color.intValue());
        }
        if (zoomLevel <= 14.0f) {
            Integer color2 = getColor(isDarkTheme ? 6.0f : 2.0f, zoomLevel, isDarkTheme, isDarkTheme ? 4.0f : 2.0f);
            if (color2 != null) {
                this.circle.setStrokeColor(color2.intValue());
            }
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public void changeIcon(@l Bitmap icon) {
    }

    @k
    public final CircleMapObject getCircle() {
        return this.circle;
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    @l
    public Object getData() {
        return this.circle.getUserData();
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    @k
    public AvitoMapPoint getPosition() {
        return AvitoYandexMapKt.toAvitoMapPoint(this.circle.getGeometry().getCenter());
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public boolean isVisible() {
        return this.circle.isVisible();
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public void setData(@k Object data) {
        this.circle.setUserData(data);
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public void setPosition(@k AvitoMapPoint position) {
        if (this.circle.isValid()) {
            this.circle.setGeometry(new Circle(new Point(position.getLatitude(), position.getLongitude()), this.circle.getGeometry().getRadius()));
        }
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public void setVisibility(boolean visible) {
        this.circle.setVisible(visible);
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public void setZIndex(float zIndex) {
        this.circle.setZIndex(zIndex);
    }

    @Override // com.avito.android.avito_map.AvitoMapMarker
    public void changeIcon(@k Bitmap icon, @k String imageId, float zIndex, @k AvitoMapMarker.AvitoMapAnchor anchor) {
    }
}
