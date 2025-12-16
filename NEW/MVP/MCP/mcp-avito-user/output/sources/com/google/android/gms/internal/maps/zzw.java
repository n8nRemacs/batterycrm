package com.google.android.gms.internal.maps;

import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.List;

/* loaded from: classes6.dex */
public interface zzw extends IInterface {
    int getFillColor();

    List getHoles();

    String getId();

    List<LatLng> getPoints();

    int getStrokeColor();

    int getStrokeJointType();

    List<PatternItem> getStrokePattern();

    float getStrokeWidth();

    float getZIndex();

    boolean isClickable();

    boolean isGeodesic();

    boolean isVisible();

    void remove();

    void setClickable(boolean z12);

    void setFillColor(int i12);

    void setGeodesic(boolean z12);

    void setHoles(List list);

    void setPoints(List<LatLng> list);

    void setStrokeColor(int i12);

    void setStrokeJointType(int i12);

    void setStrokePattern(List<PatternItem> list);

    void setStrokeWidth(float f12);

    void setVisible(boolean z12);

    void setZIndex(float f12);

    boolean zzb(zzw zzwVar);

    void zze(d dVar);

    int zzj();

    d zzk();
}
