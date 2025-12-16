package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class ActivityTransition extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new C();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354172b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final int f354173c;

    /* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
    public static class a {
    }

    /* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @SafeParcelable.b
    public ActivityTransition(@SafeParcelable.e int i12, @SafeParcelable.e int i13) {
        this.f354172b = i12;
        this.f354173c = i13;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f354172b == activityTransition.f354172b && this.f354173c == activityTransition.f354173c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f354172b), Integer.valueOf(this.f354173c)});
    }

    @j.N
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityTransition [mActivityType=");
        sb2.append(this.f354172b);
        sb2.append(", mTransitionType=");
        return AK.c.i(this.f354173c, "]", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        C36729v.j(parcel);
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f354172b);
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(this.f354173c);
        TX0.a.p(parcel, iO2);
    }
}
