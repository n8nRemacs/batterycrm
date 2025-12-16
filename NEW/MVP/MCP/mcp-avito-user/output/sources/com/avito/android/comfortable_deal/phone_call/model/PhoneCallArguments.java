package com.avito.android.comfortable_deal.phone_call.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhoneCallArguments.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/phone_call/model/PhoneCallArguments;", "Landroid/os/Parcelable;", "NoPhone", "Phone", "Lcom/avito/android/comfortable_deal/phone_call/model/PhoneCallArguments$NoPhone;", "Lcom/avito/android/comfortable_deal/phone_call/model/PhoneCallArguments$Phone;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PhoneCallArguments extends Parcelable {

    /* compiled from: PhoneCallArguments.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/phone_call/model/PhoneCallArguments$NoPhone;", "Lcom/avito/android/comfortable_deal/phone_call/model/PhoneCallArguments;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class NoPhone implements PhoneCallArguments {

        @k
        public static final Parcelable.Creator<NoPhone> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f122477b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f122478c;

        /* compiled from: PhoneCallArguments.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NoPhone> {
            @Override // android.os.Parcelable.Creator
            public final NoPhone createFromParcel(Parcel parcel) {
                return new NoPhone(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NoPhone[] newArray(int i12) {
                return new NoPhone[i12];
            }
        }

        public NoPhone(@k String str, @k String str2) {
            this.f122477b = str;
            this.f122478c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoPhone)) {
                return false;
            }
            NoPhone noPhone = (NoPhone) obj;
            return L.f(this.f122477b, noPhone.f122477b) && L.f(this.f122478c, noPhone.f122478c);
        }

        @Override // com.avito.android.comfortable_deal.phone_call.model.PhoneCallArguments
        @k
        /* renamed from: getDealId, reason: from getter */
        public final String getF122479b() {
            return this.f122477b;
        }

        public final int hashCode() {
            return this.f122478c.hashCode() + (this.f122477b.hashCode() * 31);
        }

        @Override // com.avito.android.comfortable_deal.phone_call.model.PhoneCallArguments
        @k
        /* renamed from: o2, reason: from getter */
        public final String getF122480c() {
            return this.f122478c;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NoPhone(dealId=");
            sb2.append(this.f122477b);
            sb2.append(", clientId=");
            return C22026a.c(sb2, this.f122478c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f122477b);
            parcel.writeString(this.f122478c);
        }
    }

    /* compiled from: PhoneCallArguments.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/phone_call/model/PhoneCallArguments$Phone;", "Lcom/avito/android/comfortable_deal/phone_call/model/PhoneCallArguments;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Phone implements PhoneCallArguments {

        @k
        public static final Parcelable.Creator<Phone> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f122479b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f122480c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f122481d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f122482e;

        /* compiled from: PhoneCallArguments.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Phone> {
            @Override // android.os.Parcelable.Creator
            public final Phone createFromParcel(Parcel parcel) {
                return new Phone(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Phone[] newArray(int i12) {
                return new Phone[i12];
            }
        }

        public Phone(@k String str, @k String str2, @k String str3, boolean z12) {
            this.f122479b = str;
            this.f122480c = str2;
            this.f122481d = str3;
            this.f122482e = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Phone)) {
                return false;
            }
            Phone phone = (Phone) obj;
            return L.f(this.f122479b, phone.f122479b) && L.f(this.f122480c, phone.f122480c) && L.f(this.f122481d, phone.f122481d) && this.f122482e == phone.f122482e;
        }

        @Override // com.avito.android.comfortable_deal.phone_call.model.PhoneCallArguments
        @k
        /* renamed from: getDealId, reason: from getter */
        public final String getF122479b() {
            return this.f122479b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f122482e) + H.d(H.d(this.f122479b.hashCode() * 31, 31, this.f122480c), 31, this.f122481d);
        }

        @Override // com.avito.android.comfortable_deal.phone_call.model.PhoneCallArguments
        @k
        /* renamed from: o2, reason: from getter */
        public final String getF122480c() {
            return this.f122480c;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Phone(dealId=");
            sb2.append(this.f122479b);
            sb2.append(", clientId=");
            sb2.append(this.f122480c);
            sb2.append(", phone=");
            sb2.append(this.f122481d);
            sb2.append(", isTemporary=");
            return r.x(sb2, this.f122482e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f122479b);
            parcel.writeString(this.f122480c);
            parcel.writeString(this.f122481d);
            parcel.writeInt(this.f122482e ? 1 : 0);
        }
    }

    @k
    /* renamed from: getDealId */
    String getF122479b();

    @k
    /* renamed from: o2 */
    String getF122480c();
}
