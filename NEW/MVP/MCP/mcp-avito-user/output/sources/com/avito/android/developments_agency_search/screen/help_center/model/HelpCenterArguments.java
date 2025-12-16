package com.avito.android.developments_agency_search.screen.help_center.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HelpCenterArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/help_center/model/HelpCenterArguments;", "Landroid/os/Parcelable;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class HelpCenterArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<HelpCenterArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f137994b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f137995c;

    /* compiled from: HelpCenterArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HelpCenterArguments> {
        @Override // android.os.Parcelable.Creator
        public final HelpCenterArguments createFromParcel(Parcel parcel) {
            return new HelpCenterArguments(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final HelpCenterArguments[] newArray(int i12) {
            return new HelpCenterArguments[i12];
        }
    }

    public HelpCenterArguments(@k String str, @l String str2) {
        this.f137994b = str;
        this.f137995c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HelpCenterArguments)) {
            return false;
        }
        HelpCenterArguments helpCenterArguments = (HelpCenterArguments) obj;
        return L.f(this.f137994b, helpCenterArguments.f137994b) && L.f(this.f137995c, helpCenterArguments.f137995c);
    }

    public final int hashCode() {
        int iHashCode = this.f137994b.hashCode() * 31;
        String str = this.f137995c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HelpCenterArguments(fromPage=");
        sb2.append(this.f137994b);
        sb2.append(", locationId=");
        return C22026a.c(sb2, this.f137995c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f137994b);
        parcel.writeString(this.f137995c);
    }
}
