package com.avito.android.bxcontent.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertListAdditionalTopics.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/model/AdvertListData;", "Landroid/os/Parcelable;", "_avito_serp_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AdvertListData implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertListData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f111190b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<String> f111191c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f111192d;

    /* compiled from: AdvertListAdditionalTopics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertListData> {
        @Override // android.os.Parcelable.Creator
        public final AdvertListData createFromParcel(Parcel parcel) {
            return new AdvertListData(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertListData[] newArray(int i12) {
            return new AdvertListData[i12];
        }
    }

    public AdvertListData(@k String str, @k List<String> list, @l String str2) {
        this.f111190b = str;
        this.f111191c = list;
        this.f111192d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertListData)) {
            return false;
        }
        AdvertListData advertListData = (AdvertListData) obj;
        return L.f(this.f111190b, advertListData.f111190b) && L.f(this.f111191c, advertListData.f111191c) && L.f(this.f111192d, advertListData.f111192d);
    }

    public final int hashCode() {
        int iE2 = H.e(this.f111190b.hashCode() * 31, 31, this.f111191c);
        String str = this.f111192d;
        return iE2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertListData(title=");
        sb2.append(this.f111190b);
        sb2.append(", advertIds=");
        sb2.append(this.f111191c);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.f111192d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f111190b);
        parcel.writeStringList(this.f111191c);
        parcel.writeString(this.f111192d);
    }
}
