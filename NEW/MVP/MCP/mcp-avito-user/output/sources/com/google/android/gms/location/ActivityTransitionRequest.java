package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@SafeParcelable.a
@SafeParcelable.g
/* loaded from: classes6.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {

    @j.N
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new F();

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public static final Comparator<ActivityTransition> f354177f = new E();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final List f354178b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public final String f354179c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final List f354180d;

    /* renamed from: e, reason: collision with root package name */
    @SafeParcelable.c
    @j.P
    public String f354181e;

    @SafeParcelable.b
    public ActivityTransitionRequest(@SafeParcelable.e @j.P String str, @SafeParcelable.e @j.P String str2, @SafeParcelable.e @j.N ArrayList arrayList, @SafeParcelable.e @j.P ArrayList arrayList2) {
        C36729v.k(arrayList, "transitions can't be null");
        C36729v.a("transitions can't be empty.", arrayList.size() > 0);
        TreeSet treeSet = new TreeSet(f354177f);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            C36729v.a(String.format("Found duplicated transition: %s.", activityTransition), treeSet.add(activityTransition));
        }
        this.f354178b = Collections.unmodifiableList(arrayList);
        this.f354179c = str;
        this.f354180d = arrayList2 == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList2);
        this.f354181e = str2;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (C36727t.a(this.f354178b, activityTransitionRequest.f354178b) && C36727t.a(this.f354179c, activityTransitionRequest.f354179c) && C36727t.a(this.f354181e, activityTransitionRequest.f354181e) && C36727t.a(this.f354180d, activityTransitionRequest.f354180d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f354178b.hashCode() * 31;
        String str = this.f354179c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f354180d;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f354181e;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @j.N
    public final String toString() {
        String strValueOf = String.valueOf(this.f354178b);
        String strValueOf2 = String.valueOf(this.f354180d);
        String str = this.f354181e;
        StringBuilder sbA = androidx.appcompat.app.r.A("ActivityTransitionRequest [mTransitions=", strValueOf, ", mTag='");
        androidx.media3.exoplayer.analytics.m.p(sbA, this.f354179c, "', mClients=", strValueOf2, ", mAttributionTag=");
        return AK.c.s(sbA, str, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        C36729v.j(parcel);
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.n(parcel, 1, this.f354178b, false);
        TX0.a.j(parcel, 2, this.f354179c, false);
        TX0.a.n(parcel, 3, this.f354180d, false);
        TX0.a.j(parcel, 4, this.f354181e, false);
        TX0.a.p(parcel, iO2);
    }
}
