package com.avito.android.mortgage_invite.client_search.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.F3;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageClient.kt */
@F3
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/model/MortgageClientField;", "Landroid/os/Parcelable;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MortgageClientField implements Parcelable {

    @k
    public static final Parcelable.Creator<MortgageClientField> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f205398b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f205399c;

    /* compiled from: MortgageClient.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageClientField> {
        @Override // android.os.Parcelable.Creator
        public final MortgageClientField createFromParcel(Parcel parcel) {
            return new MortgageClientField(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageClientField[] newArray(int i12) {
            return new MortgageClientField[i12];
        }
    }

    public MortgageClientField(@k String str, @k String str2) {
        this.f205398b = str;
        this.f205399c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageClientField)) {
            return false;
        }
        MortgageClientField mortgageClientField = (MortgageClientField) obj;
        return L.f(this.f205398b, mortgageClientField.f205398b) && L.f(this.f205399c, mortgageClientField.f205399c);
    }

    public final int hashCode() {
        return this.f205399c.hashCode() + (this.f205398b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageClientField(value=");
        sb2.append(this.f205398b);
        sb2.append(", maskedValue=");
        return C22026a.c(sb2, this.f205399c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f205398b);
        parcel.writeString(this.f205399c);
    }
}
