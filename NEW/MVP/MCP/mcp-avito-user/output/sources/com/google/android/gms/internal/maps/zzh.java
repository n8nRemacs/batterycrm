package com.google.android.gms.internal.maps;

import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.List;

/* loaded from: classes6.dex */
public interface zzh extends IInterface {
    LatLng getCenter();

    int getFillColor();

    String getId();

    double getRadius();

    int getStrokeColor();

    List<PatternItem> getStrokePattern();

    float getStrokeWidth();

    float getZIndex();

    boolean isClickable();

    boolean isVisible();

    void remove();

    void setCenter(LatLng latLng);

    void setClickable(boolean z12);

    void setFillColor(int i12);

    void setRadius(double d12);

    void setStrokeColor(int i12);

    void setStrokePattern(List<PatternItem> list);

    void setStrokeWidth(float f12);

    void setVisible(boolean z12);

    void setZIndex(float f12);

    boolean zzb(zzh zzhVar);

    void zze(d dVar);

    int zzj();

    d zzk();
}
