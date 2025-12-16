package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new Y();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final ArrayList f354252b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354253c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final boolean f354254d;

    /* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
    public static final class a {
        public a() {
            new ArrayList();
        }
    }

    @SafeParcelable.b
    public LocationSettingsRequest(@SafeParcelable.e ArrayList arrayList, @SafeParcelable.e boolean z12, @SafeParcelable.e boolean z13) {
        this.f354252b = arrayList;
        this.f354253c = z12;
        this.f354254d = z13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.n(parcel, 1, Collections.unmodifiableList(this.f354252b), false);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f354253c ? 1 : 0);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f354254d ? 1 : 0);
        TX0.a.p(parcel, iO2);
    }
}
