package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class ActivityTransitionEvent extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new D();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354174b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354175c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final long f354176d;

    @SafeParcelable.b
    public ActivityTransitionEvent(@SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e long j12) {
        Parcelable.Creator<ActivityTransition> creator = ActivityTransition.CREATOR;
        boolean z12 = false;
        if (i13 >= 0 && i13 <= 1) {
            z12 = true;
        }
        C36729v.a("Transition type " + i13 + " is not valid.", z12);
        this.f354174b = i12;
        this.f354175c = i13;
        this.f354176d = j12;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f354174b == activityTransitionEvent.f354174b && this.f354175c == activityTransitionEvent.f354175c && this.f354176d == activityTransitionEvent.f354176d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f354174b), Integer.valueOf(this.f354175c), Long.valueOf(this.f354176d)});
    }

    @j.N
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ActivityType " + this.f354174b);
        sb2.append(" ");
        sb2.append("TransitionType " + this.f354175c);
        sb2.append(" ");
        sb2.append("ElapsedRealTimeNanos " + this.f354176d);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        C36729v.j(parcel);
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f354174b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f354175c);
        TX0.a.q(parcel, 3, 8);
        parcel.writeLong(this.f354176d);
        TX0.a.p(parcel, iO2);
    }
}
