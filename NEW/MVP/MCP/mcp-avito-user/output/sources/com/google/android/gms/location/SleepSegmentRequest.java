package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class SleepSegmentRequest extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<SleepSegmentRequest> CREATOR = new C36802x();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final ArrayList f354277b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354278c;

    @SafeParcelable.b
    @InterfaceC36733z
    public SleepSegmentRequest(@SafeParcelable.e int i12, @SafeParcelable.e @j.P ArrayList arrayList) {
        this.f354277b = arrayList;
        this.f354278c = i12;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepSegmentRequest)) {
            return false;
        }
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
        return C36727t.a(this.f354277b, sleepSegmentRequest.f354277b) && this.f354278c == sleepSegmentRequest.f354278c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f354277b, Integer.valueOf(this.f354278c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        C36729v.j(parcel);
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.n(parcel, 1, this.f354277b, false);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f354278c);
        TX0.a.p(parcel, iO2);
    }
}
