package com.google.android.gms.internal.maps;

import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes6.dex */
public interface zzt extends IInterface {
    float getAlpha();

    String getId();

    LatLng getPosition();

    float getRotation();

    String getSnippet();

    String getTitle();

    float getZIndex();

    void hideInfoWindow();

    boolean isDraggable();

    boolean isFlat();

    boolean isInfoWindowShown();

    boolean isVisible();

    void remove();

    void setAlpha(float f12);

    void setAnchor(float f12, float f13);

    void setDraggable(boolean z12);

    void setFlat(boolean z12);

    void setInfoWindowAnchor(float f12, float f13);

    void setPosition(LatLng latLng);

    void setRotation(float f12);

    void setSnippet(String str);

    void setTitle(String str);

    void setVisible(boolean z12);

    void setZIndex(float f12);

    void showInfoWindow();

    void zze(d dVar);

    void zzg(d dVar);

    int zzj();

    boolean zzj(zzt zztVar);

    d zzk();
}
