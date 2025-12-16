package com.avito.android.publish.vinsuggest;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VinSuggestOpenParams.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/vinsuggest/VinSuggestOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class VinSuggestOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<VinSuggestOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f245698b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f245699c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f245700d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f245701e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f245702f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f245703g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f245704h;

    /* compiled from: VinSuggestOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VinSuggestOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final VinSuggestOpenParams createFromParcel(Parcel parcel) {
            return new VinSuggestOpenParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VinSuggestOpenParams[] newArray(int i12) {
            return new VinSuggestOpenParams[i12];
        }
    }

    public VinSuggestOpenParams(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7) {
        this.f245698b = str;
        this.f245699c = str2;
        this.f245700d = str3;
        this.f245701e = str4;
        this.f245702f = str5;
        this.f245703g = str6;
        this.f245704h = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VinSuggestOpenParams)) {
            return false;
        }
        VinSuggestOpenParams vinSuggestOpenParams = (VinSuggestOpenParams) obj;
        return L.f(this.f245698b, vinSuggestOpenParams.f245698b) && L.f(this.f245699c, vinSuggestOpenParams.f245699c) && L.f(this.f245700d, vinSuggestOpenParams.f245700d) && L.f(this.f245701e, vinSuggestOpenParams.f245701e) && L.f(this.f245702f, vinSuggestOpenParams.f245702f) && L.f(this.f245703g, vinSuggestOpenParams.f245703g) && L.f(this.f245704h, vinSuggestOpenParams.f245704h);
    }

    public final int hashCode() {
        int iHashCode = this.f245698b.hashCode() * 31;
        String str = this.f245699c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f245700d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f245701e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f245702f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f245703g;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f245704h;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VinSuggestOpenParams(vinId=");
        sb2.append(this.f245698b);
        sb2.append(", autoVINbyRegNumId=");
        sb2.append(this.f245699c);
        sb2.append(", vehicleNumberId=");
        sb2.append(this.f245700d);
        sb2.append(", vinByRegNumUserBackstepId=");
        sb2.append(this.f245701e);
        sb2.append(", regNumByPhotoRequest=");
        sb2.append(this.f245702f);
        sb2.append(", autoRegNumByPhoto=");
        sb2.append(this.f245703g);
        sb2.append(", photosId=");
        return C22026a.c(sb2, this.f245704h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f245698b);
        parcel.writeString(this.f245699c);
        parcel.writeString(this.f245700d);
        parcel.writeString(this.f245701e);
        parcel.writeString(this.f245702f);
        parcel.writeString(this.f245703g);
        parcel.writeString(this.f245704h);
    }
}
