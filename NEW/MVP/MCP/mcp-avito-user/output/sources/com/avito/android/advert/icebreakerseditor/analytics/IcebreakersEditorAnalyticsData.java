package com.avito.android.advert.icebreakerseditor.analytics;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IcebreakersEditorAnalyticsData.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/icebreakerseditor/analytics/IcebreakersEditorAnalyticsData;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IcebreakersEditorAnalyticsData implements Parcelable {

    @k
    public static final Parcelable.Creator<IcebreakersEditorAnalyticsData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f71192b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f71193c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f71194d;

    /* compiled from: IcebreakersEditorAnalyticsData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IcebreakersEditorAnalyticsData> {
        @Override // android.os.Parcelable.Creator
        public final IcebreakersEditorAnalyticsData createFromParcel(Parcel parcel) {
            return new IcebreakersEditorAnalyticsData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IcebreakersEditorAnalyticsData[] newArray(int i12) {
            return new IcebreakersEditorAnalyticsData[i12];
        }
    }

    public IcebreakersEditorAnalyticsData(@k String str, @l String str2, @l String str3) {
        this.f71192b = str;
        this.f71193c = str2;
        this.f71194d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IcebreakersEditorAnalyticsData)) {
            return false;
        }
        IcebreakersEditorAnalyticsData icebreakersEditorAnalyticsData = (IcebreakersEditorAnalyticsData) obj;
        return L.f(this.f71192b, icebreakersEditorAnalyticsData.f71192b) && L.f(this.f71193c, icebreakersEditorAnalyticsData.f71193c) && L.f(this.f71194d, icebreakersEditorAnalyticsData.f71194d);
    }

    public final int hashCode() {
        int iHashCode = this.f71192b.hashCode() * 31;
        String str = this.f71193c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f71194d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IcebreakersEditorAnalyticsData(advertId=");
        sb2.append(this.f71192b);
        sb2.append(", cid=");
        sb2.append(this.f71193c);
        sb2.append(", mcid=");
        return C22026a.c(sb2, this.f71194d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f71192b);
        parcel.writeString(this.f71193c);
        parcel.writeString(this.f71194d);
    }
}
