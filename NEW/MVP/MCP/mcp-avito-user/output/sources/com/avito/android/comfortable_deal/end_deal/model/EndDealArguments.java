package com.avito.android.comfortable_deal.end_deal.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EndDealArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/end_deal/model/EndDealArguments;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EndDealArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<EndDealArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f122240b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f122241c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f122242d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f122243e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f122244f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final EndDealSavedState f122245g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f122246h;

    /* compiled from: EndDealArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EndDealArguments> {
        @Override // android.os.Parcelable.Creator
        public final EndDealArguments createFromParcel(Parcel parcel) {
            return new EndDealArguments(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EndDealSavedState.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EndDealArguments[] newArray(int i12) {
            return new EndDealArguments[i12];
        }
    }

    public EndDealArguments(long j12, @k String str, @l String str2, @l String str3, @l String str4, @l EndDealSavedState endDealSavedState, @k String str5) {
        this.f122240b = j12;
        this.f122241c = str;
        this.f122242d = str2;
        this.f122243e = str3;
        this.f122244f = str4;
        this.f122245g = endDealSavedState;
        this.f122246h = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EndDealArguments)) {
            return false;
        }
        EndDealArguments endDealArguments = (EndDealArguments) obj;
        return this.f122240b == endDealArguments.f122240b && L.f(this.f122241c, endDealArguments.f122241c) && L.f(this.f122242d, endDealArguments.f122242d) && L.f(this.f122243e, endDealArguments.f122243e) && L.f(this.f122244f, endDealArguments.f122244f) && L.f(this.f122245g, endDealArguments.f122245g) && L.f(this.f122246h, endDealArguments.f122246h);
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f122240b) * 31, 31, this.f122241c);
        String str = this.f122242d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f122243e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f122244f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EndDealSavedState endDealSavedState = this.f122245g;
        return this.f122246h.hashCode() + ((iHashCode3 + (endDealSavedState != null ? endDealSavedState.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EndDealArguments(dealId=");
        sb2.append(this.f122240b);
        sb2.append(", requestKey=");
        sb2.append(this.f122241c);
        sb2.append(", itemId=");
        sb2.append(this.f122242d);
        sb2.append(", agencyId=");
        sb2.append(this.f122243e);
        sb2.append(", agentId=");
        sb2.append(this.f122244f);
        sb2.append(", savedState=");
        sb2.append(this.f122245g);
        sb2.append(", processId=");
        return C22026a.c(sb2, this.f122246h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f122240b);
        parcel.writeString(this.f122241c);
        parcel.writeString(this.f122242d);
        parcel.writeString(this.f122243e);
        parcel.writeString(this.f122244f);
        EndDealSavedState endDealSavedState = this.f122245g;
        if (endDealSavedState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            endDealSavedState.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f122246h);
    }
}
