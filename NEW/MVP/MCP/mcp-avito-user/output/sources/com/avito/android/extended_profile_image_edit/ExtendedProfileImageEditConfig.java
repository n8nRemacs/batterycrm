package com.avito.android.extended_profile_image_edit;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileImageEditConfig.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_image_edit/ExtendedProfileImageEditConfig;", "Landroid/os/Parcelable;", "_avito_extended-profile-image-edit_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExtendedProfileImageEditConfig implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ExtendedProfileImageEditConfig> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f150987b;

    /* renamed from: c, reason: collision with root package name */
    public final int f150988c;

    /* renamed from: d, reason: collision with root package name */
    public final int f150989d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f150990e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f150991f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f150992g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f150993h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f150994i;

    /* compiled from: ExtendedProfileImageEditConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileImageEditConfig> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileImageEditConfig createFromParcel(Parcel parcel) {
            return new ExtendedProfileImageEditConfig(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileImageEditConfig[] newArray(int i12) {
            return new ExtendedProfileImageEditConfig[i12];
        }
    }

    public ExtendedProfileImageEditConfig(@Y61.k String str, int i12, int i13, boolean z12, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5) {
        this.f150987b = str;
        this.f150988c = i12;
        this.f150989d = i13;
        this.f150990e = z12;
        this.f150991f = str2;
        this.f150992g = str3;
        this.f150993h = str4;
        this.f150994i = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedProfileImageEditConfig)) {
            return false;
        }
        ExtendedProfileImageEditConfig extendedProfileImageEditConfig = (ExtendedProfileImageEditConfig) obj;
        return L.f(this.f150987b, extendedProfileImageEditConfig.f150987b) && this.f150988c == extendedProfileImageEditConfig.f150988c && this.f150989d == extendedProfileImageEditConfig.f150989d && this.f150990e == extendedProfileImageEditConfig.f150990e && L.f(this.f150991f, extendedProfileImageEditConfig.f150991f) && L.f(this.f150992g, extendedProfileImageEditConfig.f150992g) && L.f(this.f150993h, extendedProfileImageEditConfig.f150993h) && L.f(this.f150994i, extendedProfileImageEditConfig.f150994i);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(androidx.appcompat.app.r.i(androidx.appcompat.app.r.e(this.f150989d, androidx.appcompat.app.r.e(this.f150988c, this.f150987b.hashCode() * 31, 31), 31), 31, this.f150990e), 31, this.f150991f), 31, this.f150992g);
        String str = this.f150993h;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f150994i;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileImageEditConfig(operationId=");
        sb2.append(this.f150987b);
        sb2.append(", minWidth=");
        sb2.append(this.f150988c);
        sb2.append(", minHeight=");
        sb2.append(this.f150989d);
        sb2.append(", showWarningMessage=");
        sb2.append(this.f150990e);
        sb2.append(", warningHeader=");
        sb2.append(this.f150991f);
        sb2.append(", warningBody=");
        sb2.append(this.f150992g);
        sb2.append(", saveButtonText=");
        sb2.append(this.f150993h);
        sb2.append(", cancelButtonText=");
        return C22026a.c(sb2, this.f150994i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f150987b);
        parcel.writeInt(this.f150988c);
        parcel.writeInt(this.f150989d);
        parcel.writeInt(this.f150990e ? 1 : 0);
        parcel.writeString(this.f150991f);
        parcel.writeString(this.f150992g);
        parcel.writeString(this.f150993h);
        parcel.writeString(this.f150994i);
    }

    public /* synthetic */ ExtendedProfileImageEditConfig(String str, int i12, int i13, boolean z12, String str2, String str3, String str4, String str5, int i14, C42822w c42822w) {
        this(str, i12, i13, (i14 & 8) != 0 ? true : z12, str2, str3, (i14 & 64) != 0 ? null : str4, (i14 & 128) != 0 ? null : str5);
    }
}
