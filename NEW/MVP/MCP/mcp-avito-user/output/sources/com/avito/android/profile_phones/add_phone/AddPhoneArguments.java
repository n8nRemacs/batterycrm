package com.avito.android.profile_phones.add_phone;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AddPhoneArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/AddPhoneArguments;", "Landroid/os/Parcelable;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AddPhoneArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AddPhoneArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f226793b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f226794c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f226795d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f226796e;

    /* compiled from: AddPhoneArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AddPhoneArguments> {
        @Override // android.os.Parcelable.Creator
        public final AddPhoneArguments createFromParcel(Parcel parcel) {
            return new AddPhoneArguments(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AddPhoneArguments[] newArray(int i12) {
            return new AddPhoneArguments[i12];
        }
    }

    public AddPhoneArguments(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        this.f226793b = str;
        this.f226794c = str2;
        this.f226795d = str3;
        this.f226796e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddPhoneArguments)) {
            return false;
        }
        AddPhoneArguments addPhoneArguments = (AddPhoneArguments) obj;
        return L.f(this.f226793b, addPhoneArguments.f226793b) && L.f(this.f226794c, addPhoneArguments.f226794c) && L.f(this.f226795d, addPhoneArguments.f226795d) && L.f(this.f226796e, addPhoneArguments.f226796e);
    }

    public final int hashCode() {
        String str = this.f226793b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f226794c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f226795d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f226796e;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddPhoneArguments(title=");
        sb2.append(this.f226793b);
        sb2.append(", subtitle=");
        sb2.append(this.f226794c);
        sb2.append(", source=");
        sb2.append(this.f226795d);
        sb2.append(", prefilledPhone=");
        return C22026a.c(sb2, this.f226796e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f226793b);
        parcel.writeString(this.f226794c);
        parcel.writeString(this.f226795d);
        parcel.writeString(this.f226796e);
    }

    public /* synthetic */ AddPhoneArguments(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : str4);
    }
}
