package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class SleepSegmentEvent extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<SleepSegmentEvent> CREATOR = new C36801w();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final long f354272b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final long f354273c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354274d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354275e;

    /* renamed from: f, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354276f;

    @SafeParcelable.b
    @InterfaceC36733z
    public SleepSegmentEvent(@SafeParcelable.e long j12, @SafeParcelable.e int i12, @SafeParcelable.e int i13, @SafeParcelable.e int i14, @SafeParcelable.e long j13) {
        C36729v.a("endTimeMillis must be greater than or equal to startTimeMillis", j12 <= j13);
        this.f354272b = j12;
        this.f354273c = j13;
        this.f354274d = i12;
        this.f354275e = i13;
        this.f354276f = i14;
    }

    public final boolean equals(@j.P Object obj) {
        if (obj instanceof SleepSegmentEvent) {
            SleepSegmentEvent sleepSegmentEvent = (SleepSegmentEvent) obj;
            if (this.f354272b == sleepSegmentEvent.f354272b && this.f354273c == sleepSegmentEvent.f354273c && this.f354274d == sleepSegmentEvent.f354274d && this.f354275e == sleepSegmentEvent.f354275e && this.f354276f == sleepSegmentEvent.f354276f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f354272b), Long.valueOf(this.f354273c), Integer.valueOf(this.f354274d)});
    }

    @j.N
    public final String toString() {
        return "startMillis=" + this.f354272b + ", endMillis=" + this.f354273c + ", status=" + this.f354274d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        C36729v.j(parcel);
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 8);
        parcel.writeLong(this.f354272b);
        TX0.a.q(parcel, 2, 8);
        parcel.writeLong(this.f354273c);
        TX0.a.q(parcel, 3, 4);
        parcel.writeInt(this.f354274d);
        TX0.a.q(parcel, 4, 4);
        parcel.writeInt(this.f354275e);
        TX0.a.q(parcel, 5, 4);
        parcel.writeInt(this.f354276f);
        TX0.a.p(parcel, iO2);
    }
}
