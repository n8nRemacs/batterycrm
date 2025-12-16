package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class GeofencingRequest extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new L();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final ArrayList f354196b;

    /* renamed from: c, reason: collision with root package name */
    @b
    @SafeParcelable.c
    public final int f354197c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final String f354198d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f354199e;

    /* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f354200a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        @b
        public int f354201b = 5;

        /* renamed from: c, reason: collision with root package name */
        public final String f354202c = "";
    }

    /* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
    public @interface b {
    }

    @SafeParcelable.b
    public GeofencingRequest(@SafeParcelable.e @b int i12, @SafeParcelable.e String str, @SafeParcelable.e @j.P String str2, @SafeParcelable.e ArrayList arrayList) {
        this.f354196b = arrayList;
        this.f354197c = i12;
        this.f354198d = str;
        this.f354199e = str2;
    }

    @j.N
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GeofencingRequest[geofences=");
        sb2.append(this.f354196b);
        sb2.append(", initialTrigger=");
        sb2.append(this.f354197c);
        sb2.append(", tag=");
        sb2.append(this.f354198d);
        sb2.append(", attributionTag=");
        return AK.c.s(sb2, this.f354199e, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.n(parcel, 1, this.f354196b, false);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f354197c);
        TX0.a.j(parcel, 3, this.f354198d, false);
        TX0.a.j(parcel, 4, this.f354199e, false);
        TX0.a.p(parcel, iO2);
    }
}
