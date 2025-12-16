package com.avito.android.vas_planning.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasAdvantage.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/model/VasAdvantage;", "Landroid/os/Parcelable;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VasAdvantage implements Parcelable {

    @k
    public static final Parcelable.Creator<VasAdvantage> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f322413b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f322414c;

    /* compiled from: VasAdvantage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasAdvantage> {
        @Override // android.os.Parcelable.Creator
        public final VasAdvantage createFromParcel(Parcel parcel) {
            return new VasAdvantage(parcel.readString(), (DeepLink) parcel.readParcelable(VasAdvantage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VasAdvantage[] newArray(int i12) {
            return new VasAdvantage[i12];
        }
    }

    public VasAdvantage(@k String str, @k DeepLink deepLink) {
        this.f322413b = str;
        this.f322414c = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VasAdvantage)) {
            return false;
        }
        VasAdvantage vasAdvantage = (VasAdvantage) obj;
        return L.f(this.f322413b, vasAdvantage.f322413b) && L.f(this.f322414c, vasAdvantage.f322414c);
    }

    public final int hashCode() {
        return this.f322414c.hashCode() + (this.f322413b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasAdvantage(title=");
        sb2.append(this.f322413b);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f322414c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f322413b);
        parcel.writeParcelable(this.f322414c, i12);
    }
}
