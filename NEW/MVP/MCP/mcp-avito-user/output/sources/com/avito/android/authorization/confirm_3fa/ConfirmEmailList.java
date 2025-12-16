package com.avito.android.authorization.confirm_3fa;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConfirmEmailList.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/confirm_3fa/ConfirmEmailList;", "Landroid/os/Parcelable;", "Email", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ConfirmEmailList implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ConfirmEmailList> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f93534b;

    /* compiled from: ConfirmEmailList.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/confirm_3fa/ConfirmEmailList$Email;", "Landroid/os/Parcelable;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Email implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Email> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f93535b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f93536c;

        /* compiled from: ConfirmEmailList.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Email> {
            @Override // android.os.Parcelable.Creator
            public final Email createFromParcel(Parcel parcel) {
                return new Email(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Email[] newArray(int i12) {
                return new Email[i12];
            }
        }

        public Email(@Y61.k String str, @Y61.k String str2) {
            this.f93535b = str;
            this.f93536c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Email)) {
                return false;
            }
            Email email = (Email) obj;
            return L.f(this.f93535b, email.f93535b) && L.f(this.f93536c, email.f93536c);
        }

        public final int hashCode() {
            return this.f93536c.hashCode() + (this.f93535b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Email(serverId=");
            sb2.append(this.f93535b);
            sb2.append(", label=");
            return C22026a.c(sb2, this.f93536c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f93535b);
            parcel.writeString(this.f93536c);
        }
    }

    /* compiled from: ConfirmEmailList.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConfirmEmailList> {
        @Override // android.os.Parcelable.Creator
        public final ConfirmEmailList createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Email.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ConfirmEmailList(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ConfirmEmailList[] newArray(int i12) {
            return new ConfirmEmailList[i12];
        }
    }

    public ConfirmEmailList(@Y61.k ArrayList arrayList) {
        this.f93534b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ConfirmEmailList) && this.f93534b.equals(((ConfirmEmailList) obj).f93534b);
    }

    public final int hashCode() {
        return this.f93534b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("ConfirmEmailList(list="), this.f93534b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f93534b, parcel);
        while (itZ.hasNext()) {
            ((Email) itZ.next()).writeToParcel(parcel, i12);
        }
    }
}
