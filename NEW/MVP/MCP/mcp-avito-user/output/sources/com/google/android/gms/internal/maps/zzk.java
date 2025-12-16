package com.google.android.gms.internal.maps;

import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes6.dex */
public interface zzk extends IInterface {
    float getBearing();

    LatLngBounds getBounds();

    float getHeight();

    String getId();

    LatLng getPosition();

    float getTransparency();

    float getWidth();

    float getZIndex();

    boolean isClickable();

    boolean isVisible();

    void remove();

    void setBearing(float f12);

    void setClickable(boolean z12);

    void setDimensions(float f12);

    void setPosition(LatLng latLng);

    void setPositionFromBounds(LatLngBounds latLngBounds);

    void setTransparency(float f12);

    void setVisible(boolean z12);

    void setZIndex(float f12);

    void zza(float f12, float f13);

    boolean zzb(zzk zzkVar);

    void zze(d dVar);

    void zzf(d dVar);

    int zzj();

    d zzk();
}
