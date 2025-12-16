package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.C36813j;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import dY0.C39669m;

@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new C36828p();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public Boolean f354299b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public Boolean f354300c;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public CameraPosition f354302e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public Boolean f354303f;

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.c
    public Boolean f354304g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.c
    public Boolean f354305h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.c
    public Boolean f354306i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.c
    public Boolean f354307j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.c
    public Boolean f354308k;

    /* renamed from: l, reason: collision with root package name */
    @SafeParcelable.c
    public Boolean f354309l;

    /* renamed from: m, reason: collision with root package name */
    @SafeParcelable.c
    public Boolean f354310m;

    /* renamed from: n, reason: collision with root package name */
    @SafeParcelable.c
    public Boolean f354311n;

    /* renamed from: r, reason: collision with root package name */
    @SafeParcelable.c
    public Boolean f354315r;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public int f354301d = -1;

    /* renamed from: o, reason: collision with root package name */
    @SafeParcelable.c
    public Float f354312o = null;

    /* renamed from: p, reason: collision with root package name */
    @SafeParcelable.c
    public Float f354313p = null;

    /* renamed from: q, reason: collision with root package name */
    @SafeParcelable.c
    public LatLngBounds f354314q = null;

    public static GoogleMapOptions h(Context context, AttributeSet attributeSet) {
        LatLngBounds latLngBounds = null;
        if (context == null || attributeSet == null) {
            return null;
        }
        Resources resources = context.getResources();
        int[] iArr = C36813j.c.f354365a;
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (typedArrayObtainAttributes.hasValue(13)) {
            googleMapOptions.f354301d = typedArrayObtainAttributes.getInt(13, -1);
        }
        if (typedArrayObtainAttributes.hasValue(23)) {
            googleMapOptions.f354299b = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(23, false));
        }
        if (typedArrayObtainAttributes.hasValue(22)) {
            googleMapOptions.f354300c = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(22, false));
        }
        if (typedArrayObtainAttributes.hasValue(14)) {
            googleMapOptions.f354304g = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(14, true));
        }
        if (typedArrayObtainAttributes.hasValue(16)) {
            googleMapOptions.f354308k = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(16, true));
        }
        if (typedArrayObtainAttributes.hasValue(18)) {
            googleMapOptions.f354315r = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(18, true));
        }
        if (typedArrayObtainAttributes.hasValue(17)) {
            googleMapOptions.f354305h = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(17, true));
        }
        if (typedArrayObtainAttributes.hasValue(19)) {
            googleMapOptions.f354307j = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(19, true));
        }
        if (typedArrayObtainAttributes.hasValue(21)) {
            googleMapOptions.f354306i = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(21, true));
        }
        if (typedArrayObtainAttributes.hasValue(20)) {
            googleMapOptions.f354303f = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(20, true));
        }
        if (typedArrayObtainAttributes.hasValue(12)) {
            googleMapOptions.f354309l = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(12, false));
        }
        if (typedArrayObtainAttributes.hasValue(15)) {
            googleMapOptions.f354310m = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(15, true));
        }
        if (typedArrayObtainAttributes.hasValue(0)) {
            googleMapOptions.f354311n = Boolean.valueOf(typedArrayObtainAttributes.getBoolean(0, false));
        }
        if (typedArrayObtainAttributes.hasValue(3)) {
            googleMapOptions.f354312o = Float.valueOf(typedArrayObtainAttributes.getFloat(3, Float.NEGATIVE_INFINITY));
        }
        if (typedArrayObtainAttributes.hasValue(3)) {
            googleMapOptions.f354313p = Float.valueOf(typedArrayObtainAttributes.getFloat(2, Float.POSITIVE_INFINITY));
        }
        TypedArray typedArrayObtainAttributes2 = context.getResources().obtainAttributes(attributeSet, iArr);
        Float fValueOf = typedArrayObtainAttributes2.hasValue(10) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(10, 0.0f)) : null;
        Float fValueOf2 = typedArrayObtainAttributes2.hasValue(11) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(11, 0.0f)) : null;
        Float fValueOf3 = typedArrayObtainAttributes2.hasValue(8) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(8, 0.0f)) : null;
        Float fValueOf4 = typedArrayObtainAttributes2.hasValue(9) ? Float.valueOf(typedArrayObtainAttributes2.getFloat(9, 0.0f)) : null;
        typedArrayObtainAttributes2.recycle();
        if (fValueOf != null && fValueOf2 != null && fValueOf3 != null && fValueOf4 != null) {
            latLngBounds = new LatLngBounds(new LatLng(fValueOf.floatValue(), fValueOf2.floatValue()), new LatLng(fValueOf3.floatValue(), fValueOf4.floatValue()));
        }
        googleMapOptions.f354314q = latLngBounds;
        TypedArray typedArrayObtainAttributes3 = context.getResources().obtainAttributes(attributeSet, iArr);
        LatLng latLng = new LatLng(typedArrayObtainAttributes3.hasValue(4) ? typedArrayObtainAttributes3.getFloat(4, 0.0f) : 0.0f, typedArrayObtainAttributes3.hasValue(5) ? typedArrayObtainAttributes3.getFloat(5, 0.0f) : 0.0f);
        Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
        CameraPosition.a aVar = new CameraPosition.a();
        aVar.f354379a = latLng;
        if (typedArrayObtainAttributes3.hasValue(7)) {
            aVar.f354380b = typedArrayObtainAttributes3.getFloat(7, 0.0f);
        }
        if (typedArrayObtainAttributes3.hasValue(1)) {
            aVar.f354382d = typedArrayObtainAttributes3.getFloat(1, 0.0f);
        }
        if (typedArrayObtainAttributes3.hasValue(6)) {
            aVar.f354381c = typedArrayObtainAttributes3.getFloat(6, 0.0f);
        }
        typedArrayObtainAttributes3.recycle();
        googleMapOptions.f354302e = new CameraPosition(aVar.f354379a, aVar.f354380b, aVar.f354381c, aVar.f354382d);
        typedArrayObtainAttributes.recycle();
        return googleMapOptions;
    }

    public final String toString() {
        C36727t.a aVarB = C36727t.b(this);
        aVarB.a(Integer.valueOf(this.f354301d), "MapType");
        aVarB.a(this.f354309l, "LiteMode");
        aVarB.a(this.f354302e, "Camera");
        aVarB.a(this.f354304g, "CompassEnabled");
        aVarB.a(this.f354303f, "ZoomControlsEnabled");
        aVarB.a(this.f354305h, "ScrollGesturesEnabled");
        aVarB.a(this.f354306i, "ZoomGesturesEnabled");
        aVarB.a(this.f354307j, "TiltGesturesEnabled");
        aVarB.a(this.f354308k, "RotateGesturesEnabled");
        aVarB.a(this.f354315r, "ScrollGesturesEnabledDuringRotateOrZoom");
        aVarB.a(this.f354310m, "MapToolbarEnabled");
        aVarB.a(this.f354311n, "AmbientEnabled");
        aVarB.a(this.f354312o, "MinZoomPreference");
        aVarB.a(this.f354313p, "MaxZoomPreference");
        aVarB.a(this.f354314q, "LatLngBoundsForCameraTarget");
        aVarB.a(this.f354299b, "ZOrderOnTop");
        aVarB.a(this.f354300c, "UseViewLifecycleInFragment");
        return aVarB.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        byte bA2 = C39669m.a(this.f354299b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(bA2);
        byte bA3 = C39669m.a(this.f354300c);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(bA3);
        int i13 = this.f354301d;
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(i13);
        TX0.a.i(parcel, 5, this.f354302e, i12, false);
        byte bA4 = C39669m.a(this.f354303f);
        TX0.a.q(parcel, 6, 4);
        parcel.writeInt(bA4);
        byte bA5 = C39669m.a(this.f354304g);
        TX0.a.q(parcel, 7, 4);
        parcel.writeInt(bA5);
        byte bA6 = C39669m.a(this.f354305h);
        TX0.a.q(parcel, 8, 4);
        parcel.writeInt(bA6);
        byte bA7 = C39669m.a(this.f354306i);
        TX0.a.q(parcel, 9, 4);
        parcel.writeInt(bA7);
        byte bA8 = C39669m.a(this.f354307j);
        TX0.a.q(parcel, 10, 4);
        parcel.writeInt(bA8);
        byte bA9 = C39669m.a(this.f354308k);
        TX0.a.q(parcel, 11, 4);
        parcel.writeInt(bA9);
        byte bA10 = C39669m.a(this.f354309l);
        TX0.a.q(parcel, 12, 4);
        parcel.writeInt(bA10);
        byte bA11 = C39669m.a(this.f354310m);
        TX0.a.q(parcel, 14, 4);
        parcel.writeInt(bA11);
        byte bA12 = C39669m.a(this.f354311n);
        TX0.a.q(parcel, 15, 4);
        parcel.writeInt(bA12);
        TX0.a.d(parcel, 16, this.f354312o);
        TX0.a.d(parcel, 17, this.f354313p);
        TX0.a.i(parcel, 18, this.f354314q, i12, false);
        byte bA13 = C39669m.a(this.f354315r);
        TX0.a.q(parcel, 19, 4);
        parcel.writeInt(bA13);
        TX0.a.p(parcel, iO2);
    }
}
