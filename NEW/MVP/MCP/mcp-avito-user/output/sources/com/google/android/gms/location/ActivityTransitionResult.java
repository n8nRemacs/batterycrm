package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new G();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final List f354182b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final Bundle f354183c;

    public ActivityTransitionResult() {
        throw null;
    }

    @SafeParcelable.b
    @InterfaceC36733z
    public ActivityTransitionResult(@SafeParcelable.e @j.N ArrayList arrayList, @SafeParcelable.e @j.P Bundle bundle) {
        this.f354183c = null;
        C36729v.k(arrayList, "transitionEvents list can't be null.");
        if (!arrayList.isEmpty()) {
            for (int i12 = 1; i12 < arrayList.size(); i12++) {
                C36729v.b(((ActivityTransitionEvent) arrayList.get(i12)).f354176d >= ((ActivityTransitionEvent) arrayList.get(i12 + (-1))).f354176d);
            }
        }
        this.f354182b = Collections.unmodifiableList(arrayList);
        this.f354183c = bundle;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f354182b.equals(((ActivityTransitionResult) obj).f354182b);
    }

    public final int hashCode() {
        return this.f354182b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        C36729v.j(parcel);
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.n(parcel, 1, this.f354182b, false);
        TX0.a.a(parcel, 2, this.f354183c, false);
        TX0.a.p(parcel, iO2);
    }
}
