package com.google.android.gms.internal.maps;

import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.List;

/* loaded from: classes6.dex */
public interface zzz extends IInterface {
    int getColor();

    Cap getEndCap();

    String getId();

    int getJointType();

    List<PatternItem> getPattern();

    List<LatLng> getPoints();

    Cap getStartCap();

    float getWidth();

    float getZIndex();

    boolean isClickable();

    boolean isGeodesic();

    boolean isVisible();

    void remove();

    void setClickable(boolean z12);

    void setColor(int i12);

    void setEndCap(Cap cap);

    void setGeodesic(boolean z12);

    void setJointType(int i12);

    void setPattern(List<PatternItem> list);

    void setPoints(List<LatLng> list);

    void setStartCap(Cap cap);

    void setVisible(boolean z12);

    void setWidth(float f12);

    void setZIndex(float f12);

    boolean zzb(zzz zzzVar);

    void zze(d dVar);

    int zzj();

    d zzk();
}
