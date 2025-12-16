package com.google.android.gms.maps;

import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.a9j;
import defpackage.h79;
import defpackage.jui;
import defpackage.l4;
import defpackage.obh;
import defpackage.y5d;

/* loaded from: classes.dex */
public final class GoogleMapOptions extends l4 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new obh(27);
    public static final Integer E0 = Integer.valueOf(Color.argb(255, 236, 233, 225));
    public Boolean A0;
    public int D0;
    public Boolean X;
    public Boolean Y;
    public Boolean Z;
    public Boolean a;
    public Boolean b;
    public CameraPosition d;
    public Boolean o;
    public Boolean s0;
    public Boolean t0;
    public Boolean u0;
    public Boolean v0;
    public Boolean w0;
    public int c = -1;
    public Float x0 = null;
    public Float y0 = null;
    public LatLngBounds z0 = null;
    public Integer B0 = null;
    public String C0 = null;

    public static GoogleMapOptions b(Activity activity, AttributeSet attributeSet) {
        String string;
        LatLngBounds latLngBounds = null;
        if (attributeSet == null) {
            return null;
        }
        TypedArray typedArrayObtainAttributes = activity.getResources().obtainAttributes(attributeSet, y5d.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (typedArrayObtainAttributes.hasValue(y5d.MapAttrs_mapType)) {
            googleMapOptions.c = typedArrayObtainAttributes.getInt(y5d.MapAttrs_mapType, -1);
        }
        if (typedArrayObtainAttributes.hasValue(y5d.MapAttrs_zOrderOnTop)) {
            googleMapOptions.a = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y5d.MapAttrs_zOrderOnTop, false));
        }
        if (typedArrayObtainAttributes.hasValue(y5d.MapAttrs_useViewLifecycle)) {
            googleMapOptions.b = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y5d.MapAttrs_useViewLifecycle, false));
        }
        if (typedArrayObtainAttributes.hasValue(y5d.MapAttrs_uiCompass)) {
            googleMapOptions.X = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y5d.MapAttrs_uiCompass, true));
        }
        if (typedArrayObtainAttributes.hasValue(y5d.MapAttrs_uiRotateGestures)) {
            googleMapOptions.t0 = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y5d.MapAttrs_uiRotateGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(y5d.MapAttrs_uiScrollGesturesDuringRotateOrZoom)) {
            googleMapOptions.A0 = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y5d.MapAttrs_uiScrollGesturesDuringRotateOrZoom, true));
        }
        if (typedArrayObtainAttributes.hasValue(y5d.MapAttrs_uiScrollGestures)) {
            googleMapOptions.Y = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y5d.MapAttrs_uiScrollGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(y5d.MapAttrs_uiTiltGestures)) {
            googleMapOptions.s0 = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y5d.MapAttrs_uiTiltGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(y5d.MapAttrs_uiZoomGestures)) {
            googleMapOptions.Z = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y5d.MapAttrs_uiZoomGestures, true));
        }
        if (typedArrayObtainAttributes.hasValue(y5d.MapAttrs_uiZoomControls)) {
            googleMapOptions.o = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y5d.MapAttrs_uiZoomControls, true));
        }
        if (typedArrayObtainAttributes.hasValue(y5d.MapAttrs_liteMode)) {
            googleMapOptions.u0 = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y5d.MapAttrs_liteMode, false));
        }
        if (typedArrayObtainAttributes.hasValue(y5d.MapAttrs_uiMapToolbar)) {
            googleMapOptions.v0 = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y5d.MapAttrs_uiMapToolbar, true));
        }
        if (typedArrayObtainAttributes.hasValue(y5d.MapAttrs_ambientEnabled)) {
            googleMapOptions.w0 = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(y5d.MapAttrs_ambientEnabled, false));
        }
        if (typedArrayObtainAttributes.hasValue(y5d.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.x0 = Float.valueOf(typedArrayObtainAttributes.getFloat(y5d.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(y5d.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.y0 = Float.valueOf(typedArrayObtainAttributes.getFloat(y5d.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(y5d.MapAttrs_backgroundColor)) {
            googleMapOptions.B0 = Integer.valueOf(typedArrayObtainAttributes.getColor(y5d.MapAttrs_backgroundColor, E0.intValue()));
        }
        if (typedArrayObtainAttributes.hasValue(y5d.MapAttrs_mapId) && (string = typedArrayObtainAttributes.getString(y5d.MapAttrs_mapId)) != null && !string.isEmpty()) {
            googleMapOptions.C0 = string;
        }
        if (typedArrayObtainAttributes.hasValue(y5d.MapAttrs_mapColorScheme)) {
            googleMapOptions.D0 = typedArrayObtainAttributes.getInt(y5d.MapAttrs_mapColorScheme, 0);
        }
        TypedArray typedArrayObtainAttributes2 = activity.getResources().obtainAttributes(attributeSet, y5d.MapAttrs);
        Float fValueOf = typedArrayObtainAttributes2.hasValue(y5d.MapAttrs_latLngBoundsSouthWestLatitude) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(y5d.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f)) : null;
        Float fValueOf2 = typedArrayObtainAttributes2.hasValue(y5d.MapAttrs_latLngBoundsSouthWestLongitude) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(y5d.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f)) : null;
        Float fValueOf3 = typedArrayObtainAttributes2.hasValue(y5d.MapAttrs_latLngBoundsNorthEastLatitude) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(y5d.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f)) : null;
        Float fValueOf4 = typedArrayObtainAttributes2.hasValue(y5d.MapAttrs_latLngBoundsNorthEastLongitude) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(y5d.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f)) : null;
        typedArrayObtainAttributes2.recycle();
        if (fValueOf != null && fValueOf2 != null && fValueOf3 != null && fValueOf4 != null) {
            latLngBounds = new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
        }
        googleMapOptions.z0 = latLngBounds;
        TypedArray typedArrayObtainAttributes3 = activity.getResources().obtainAttributes(attributeSet, y5d.MapAttrs);
        LatLng latLng = new LatLng(typedArrayObtainAttributes3.hasValue(y5d.MapAttrs_cameraTargetLat) ? typedArrayObtainAttributes3.getFloat(y5d.MapAttrs_cameraTargetLat, 0.0f) : 0.0f, typedArrayObtainAttributes3.hasValue(y5d.MapAttrs_cameraTargetLng) ? typedArrayObtainAttributes3.getFloat(y5d.MapAttrs_cameraTargetLng, 0.0f) : 0.0f);
        float f = typedArrayObtainAttributes3.hasValue(y5d.MapAttrs_cameraZoom) ? typedArrayObtainAttributes3.getFloat(y5d.MapAttrs_cameraZoom, 0.0f) : 0.0f;
        float f2 = typedArrayObtainAttributes3.hasValue(y5d.MapAttrs_cameraBearing) ? typedArrayObtainAttributes3.getFloat(y5d.MapAttrs_cameraBearing, 0.0f) : 0.0f;
        float f3 = typedArrayObtainAttributes3.hasValue(y5d.MapAttrs_cameraTilt) ? typedArrayObtainAttributes3.getFloat(y5d.MapAttrs_cameraTilt, 0.0f) : 0.0f;
        typedArrayObtainAttributes3.recycle();
        googleMapOptions.d = new CameraPosition(latLng, f, f3, f2);
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        h79 h79Var = new h79(this);
        h79Var.t(Integer.valueOf(this.c), "MapType");
        h79Var.t(this.u0, "LiteMode");
        h79Var.t(this.d, "Camera");
        h79Var.t(this.X, "CompassEnabled");
        h79Var.t(this.o, "ZoomControlsEnabled");
        h79Var.t(this.Y, "ScrollGesturesEnabled");
        h79Var.t(this.Z, "ZoomGesturesEnabled");
        h79Var.t(this.s0, "TiltGesturesEnabled");
        h79Var.t(this.t0, "RotateGesturesEnabled");
        h79Var.t(this.A0, "ScrollGesturesEnabledDuringRotateOrZoom");
        h79Var.t(this.v0, "MapToolbarEnabled");
        h79Var.t(this.w0, "AmbientEnabled");
        h79Var.t(this.x0, "MinZoomPreference");
        h79Var.t(this.y0, "MaxZoomPreference");
        h79Var.t(this.B0, "BackgroundColor");
        h79Var.t(this.z0, "LatLngBoundsForCameraTarget");
        h79Var.t(this.a, "ZOrderOnTop");
        h79Var.t(this.b, "UseViewLifecycleInFragment");
        h79Var.t(Integer.valueOf(this.D0), "mapColorScheme");
        return h79Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iK = a9j.k(parcel, 20293);
        byte bC = jui.c(this.a);
        a9j.m(parcel, 2, 4);
        parcel.writeInt(bC);
        byte bC2 = jui.c(this.b);
        a9j.m(parcel, 3, 4);
        parcel.writeInt(bC2);
        int i2 = this.c;
        a9j.m(parcel, 4, 4);
        parcel.writeInt(i2);
        a9j.f(parcel, 5, this.d, i);
        byte bC3 = jui.c(this.o);
        a9j.m(parcel, 6, 4);
        parcel.writeInt(bC3);
        byte bC4 = jui.c(this.X);
        a9j.m(parcel, 7, 4);
        parcel.writeInt(bC4);
        byte bC5 = jui.c(this.Y);
        a9j.m(parcel, 8, 4);
        parcel.writeInt(bC5);
        byte bC6 = jui.c(this.Z);
        a9j.m(parcel, 9, 4);
        parcel.writeInt(bC6);
        byte bC7 = jui.c(this.s0);
        a9j.m(parcel, 10, 4);
        parcel.writeInt(bC7);
        byte bC8 = jui.c(this.t0);
        a9j.m(parcel, 11, 4);
        parcel.writeInt(bC8);
        byte bC9 = jui.c(this.u0);
        a9j.m(parcel, 12, 4);
        parcel.writeInt(bC9);
        byte bC10 = jui.c(this.v0);
        a9j.m(parcel, 14, 4);
        parcel.writeInt(bC10);
        byte bC11 = jui.c(this.w0);
        a9j.m(parcel, 15, 4);
        parcel.writeInt(bC11);
        a9j.d(parcel, 16, this.x0);
        a9j.d(parcel, 17, this.y0);
        a9j.f(parcel, 18, this.z0, i);
        byte bC12 = jui.c(this.A0);
        a9j.m(parcel, 19, 4);
        parcel.writeInt(bC12);
        Integer num = this.B0;
        if (num != null) {
            a9j.m(parcel, 20, 4);
            parcel.writeInt(num.intValue());
        }
        a9j.g(parcel, 21, this.C0);
        int i3 = this.D0;
        a9j.m(parcel, 23, 4);
        parcel.writeInt(i3);
        a9j.l(parcel, iK);
    }
}
