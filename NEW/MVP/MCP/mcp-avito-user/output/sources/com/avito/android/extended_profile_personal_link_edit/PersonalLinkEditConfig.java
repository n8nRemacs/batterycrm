package com.avito.android.extended_profile_personal_link_edit;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PersonalLinkEditConfig.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_personal_link_edit/PersonalLinkEditConfig;", "Landroid/os/Parcelable;", "_avito_extended-profile-personal-link-edit_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PersonalLinkEditConfig implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PersonalLinkEditConfig> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f151433b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f151434c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f151435d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f151436e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f151437f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f151438g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Integer f151439h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Integer f151440i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f151441j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f151442k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f151443l;

    /* compiled from: PersonalLinkEditConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PersonalLinkEditConfig> {
        @Override // android.os.Parcelable.Creator
        public final PersonalLinkEditConfig createFromParcel(Parcel parcel) {
            return new PersonalLinkEditConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PersonalLinkEditConfig[] newArray(int i12) {
            return new PersonalLinkEditConfig[i12];
        }
    }

    public PersonalLinkEditConfig(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l Integer num, @Y61.l Integer num2, @Y61.k String str7, @Y61.l String str8, @Y61.l String str9) {
        this.f151433b = str;
        this.f151434c = str2;
        this.f151435d = str3;
        this.f151436e = str4;
        this.f151437f = str5;
        this.f151438g = str6;
        this.f151439h = num;
        this.f151440i = num2;
        this.f151441j = str7;
        this.f151442k = str8;
        this.f151443l = str9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalLinkEditConfig)) {
            return false;
        }
        PersonalLinkEditConfig personalLinkEditConfig = (PersonalLinkEditConfig) obj;
        return L.f(this.f151433b, personalLinkEditConfig.f151433b) && L.f(this.f151434c, personalLinkEditConfig.f151434c) && L.f(this.f151435d, personalLinkEditConfig.f151435d) && L.f(this.f151436e, personalLinkEditConfig.f151436e) && L.f(this.f151437f, personalLinkEditConfig.f151437f) && L.f(this.f151438g, personalLinkEditConfig.f151438g) && L.f(this.f151439h, personalLinkEditConfig.f151439h) && L.f(this.f151440i, personalLinkEditConfig.f151440i) && L.f(this.f151441j, personalLinkEditConfig.f151441j) && L.f(this.f151442k, personalLinkEditConfig.f151442k) && L.f(this.f151443l, personalLinkEditConfig.f151443l);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f151433b.hashCode() * 31, 31, this.f151434c), 31, this.f151435d);
        String str = this.f151436e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f151437f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f151438g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f151439h;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f151440i;
        int iD3 = H.d((iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f151441j);
        String str4 = this.f151442k;
        int iHashCode5 = (iD3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f151443l;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PersonalLinkEditConfig(title=");
        sb2.append(this.f151433b);
        sb2.append(", description=");
        sb2.append(this.f151434c);
        sb2.append(", prefix=");
        sb2.append(this.f151435d);
        sb2.append(", savedPersonalLink=");
        sb2.append(this.f151436e);
        sb2.append(", hint=");
        sb2.append(this.f151437f);
        sb2.append(", placeholder=");
        sb2.append(this.f151438g);
        sb2.append(", minLengthCount=");
        sb2.append(this.f151439h);
        sb2.append(", maxLengthCount=");
        sb2.append(this.f151440i);
        sb2.append(", saveButtonText=");
        sb2.append(this.f151441j);
        sb2.append(", fieldName=");
        sb2.append(this.f151442k);
        sb2.append(", valueId=");
        return C22026a.c(sb2, this.f151443l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f151433b);
        parcel.writeString(this.f151434c);
        parcel.writeString(this.f151435d);
        parcel.writeString(this.f151436e);
        parcel.writeString(this.f151437f);
        parcel.writeString(this.f151438g);
        Integer num = this.f151439h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f151440i;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        parcel.writeString(this.f151441j);
        parcel.writeString(this.f151442k);
        parcel.writeString(this.f151443l);
    }
}
