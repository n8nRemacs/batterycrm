package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class DetectedActivity extends AbstractSafeParcelable {
    public static final int IN_VEHICLE = 0;
    public static final int ON_BICYCLE = 1;
    public static final int ON_FOOT = 2;
    public static final int RUNNING = 8;
    public static final int STILL = 3;
    public static final int TILTING = 5;
    public static final int UNKNOWN = 4;
    public static final int WALKING = 7;

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354194b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354195c;

    @j.N
    public static final Comparator zza = new I();

    @j.N
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new J();

    @SafeParcelable.b
    public DetectedActivity(@SafeParcelable.e int i12, @SafeParcelable.e int i13) {
        this.f354194b = i12;
        this.f354195c = i13;
    }

    @InterfaceC36733z
    public final boolean equals(@j.P Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.f354194b == detectedActivity.f354194b && this.f354195c == detectedActivity.f354195c) {
                return true;
            }
        }
        return false;
    }

    public int getConfidence() {
        return this.f354195c;
    }

    public int getType() {
        int i12 = this.f354194b;
        if (i12 > 22 || i12 < 0) {
            return 4;
        }
        return i12;
    }

    @InterfaceC36733z
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f354194b), Integer.valueOf(this.f354195c)});
    }

    @j.N
    public String toString() {
        int type = getType();
        return "DetectedActivity [type=" + (type != 0 ? type != 1 ? type != 2 ? type != 3 ? type != 4 ? type != 5 ? type != 7 ? type != 8 ? type != 16 ? type != 17 ? Integer.toString(type) : "IN_RAIL_VEHICLE" : "IN_ROAD_VEHICLE" : "RUNNING" : "WALKING" : "TILTING" : GrsBaseInfo.CountryCodeSource.UNKNOWN : "STILL" : "ON_FOOT" : "ON_BICYCLE" : "IN_VEHICLE") + ", confidence=" + this.f354195c + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@j.N Parcel parcel, int i12) {
        C36729v.j(parcel);
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f354194b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f354195c);
        TX0.a.p(parcel, iO2);
    }
}
