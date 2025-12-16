package com.avito.android.mortgage_invite.client_search.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.F3;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageClient.kt */
@F3
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/model/MortgageClient;", "Landroid/os/Parcelable;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MortgageClient implements Parcelable {

    @k
    public static final Parcelable.Creator<MortgageClient> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f205394b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final MortgageClientFullName f205395c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final MortgageClientField f205396d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final MortgageClientField f205397e;

    /* compiled from: MortgageClient.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageClient> {
        @Override // android.os.Parcelable.Creator
        public final MortgageClient createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            MortgageClientFullName mortgageClientFullNameCreateFromParcel = MortgageClientFullName.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<MortgageClientField> creator = MortgageClientField.CREATOR;
            return new MortgageClient(string, mortgageClientFullNameCreateFromParcel, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageClient[] newArray(int i12) {
            return new MortgageClient[i12];
        }
    }

    public MortgageClient(@k String str, @k MortgageClientFullName mortgageClientFullName, @k MortgageClientField mortgageClientField, @k MortgageClientField mortgageClientField2) {
        this.f205394b = str;
        this.f205395c = mortgageClientFullName;
        this.f205396d = mortgageClientField;
        this.f205397e = mortgageClientField2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageClient)) {
            return false;
        }
        MortgageClient mortgageClient = (MortgageClient) obj;
        return L.f(this.f205394b, mortgageClient.f205394b) && L.f(this.f205395c, mortgageClient.f205395c) && L.f(this.f205396d, mortgageClient.f205396d) && L.f(this.f205397e, mortgageClient.f205397e);
    }

    public final int hashCode() {
        return this.f205397e.hashCode() + ((this.f205396d.hashCode() + ((this.f205395c.hashCode() + (this.f205394b.hashCode() * 31)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "MortgageClient(id=" + this.f205394b + ", fullName=" + this.f205395c + ", phone=" + this.f205396d + ", email=" + this.f205397e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f205394b);
        this.f205395c.writeToParcel(parcel, i12);
        this.f205396d.writeToParcel(parcel, i12);
        this.f205397e.writeToParcel(parcel, i12);
    }
}
