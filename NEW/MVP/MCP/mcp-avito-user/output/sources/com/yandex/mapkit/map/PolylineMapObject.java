package com.yandex.mapkit.map;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Subpolyline;
import j.N;
import java.util.List;

/* loaded from: classes7.dex */
public interface PolylineMapObject extends MapObject {
    @N
    Arrow addArrow(@N PolylinePosition polylinePosition, float f12, int i12);

    @N
    List<Arrow> arrows();

    float getArcApproximationStep();

    float getDashLength();

    float getDashOffset();

    float getGapLength();

    @N
    Polyline getGeometry();

    float getGradientLength();

    int getOutlineColor();

    float getOutlineWidth();

    int getPaletteColor(int i12);

    int getStrokeColor(int i12);

    float getStrokeWidth();

    float getTurnRadius();

    void hide(@N Subpolyline subpolyline);

    void hide(@N List<Subpolyline> list);

    boolean isInnerOutlineEnabled();

    void select(int i12, @N Subpolyline subpolyline);

    void setArcApproximationStep(float f12);

    void setDashLength(float f12);

    void setDashOffset(float f12);

    void setGapLength(float f12);

    void setGeometry(@N Polyline polyline);

    void setGradientLength(float f12);

    void setInnerOutlineEnabled(boolean z12);

    void setOutlineColor(int i12);

    void setOutlineWidth(float f12);

    void setPaletteColor(int i12, int i13);

    void setStrokeColor(int i12);

    void setStrokeColors(@N List<Integer> list);

    void setStrokeColors(@N List<Integer> list, @N List<Double> list2);

    void setStrokeWidth(float f12);

    void setTurnRadius(float f12);
}
