package com.avito.android.beduin.v2.page;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinV2FragmentParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/v2/page/BeduinV2FragmentParams;", "Landroid/os/Parcelable;", "_design-modules_beduin-v2-page_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinV2FragmentParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BeduinV2FragmentParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f104775b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f104776c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f104777d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f104778e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f104779f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f104780g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f104781h;

    /* compiled from: BeduinV2FragmentParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinV2FragmentParams> {
        @Override // android.os.Parcelable.Creator
        public final BeduinV2FragmentParams createFromParcel(Parcel parcel) {
            return new BeduinV2FragmentParams(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinV2FragmentParams[] newArray(int i12) {
            return new BeduinV2FragmentParams[i12];
        }
    }

    public BeduinV2FragmentParams(@Y61.k String str, @Y61.k String str2, boolean z12, boolean z13, @Y61.l String str3, @Y61.l String str4, boolean z14) {
        this.f104775b = str;
        this.f104776c = str2;
        this.f104777d = z12;
        this.f104778e = z13;
        this.f104779f = str3;
        this.f104780g = str4;
        this.f104781h = z14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinV2FragmentParams)) {
            return false;
        }
        BeduinV2FragmentParams beduinV2FragmentParams = (BeduinV2FragmentParams) obj;
        return L.f(this.f104775b, beduinV2FragmentParams.f104775b) && L.f(this.f104776c, beduinV2FragmentParams.f104776c) && this.f104777d == beduinV2FragmentParams.f104777d && this.f104778e == beduinV2FragmentParams.f104778e && L.f(this.f104779f, beduinV2FragmentParams.f104779f) && L.f(this.f104780g, beduinV2FragmentParams.f104780g) && this.f104781h == beduinV2FragmentParams.f104781h;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(H.d(this.f104775b.hashCode() * 31, 31, this.f104776c), 31, this.f104777d), 31, this.f104778e);
        String str = this.f104779f;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f104780g;
        return Boolean.hashCode(this.f104781h) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinV2FragmentParams(pagePath=");
        sb2.append(this.f104775b);
        sb2.append(", screenName=");
        sb2.append(this.f104776c);
        sb2.append(", scrollOnKeyboardShown=");
        sb2.append(this.f104777d);
        sb2.append(", ignoreSafeArea=");
        sb2.append(this.f104778e);
        sb2.append(", scenarioParentId=");
        sb2.append(this.f104779f);
        sb2.append(", scenarioId=");
        sb2.append(this.f104780g);
        sb2.append(", composeRendererEnabled=");
        return androidx.appcompat.app.r.x(sb2, this.f104781h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f104775b);
        parcel.writeString(this.f104776c);
        parcel.writeInt(this.f104777d ? 1 : 0);
        parcel.writeInt(this.f104778e ? 1 : 0);
        parcel.writeString(this.f104779f);
        parcel.writeString(this.f104780g);
        parcel.writeInt(this.f104781h ? 1 : 0);
    }
}
