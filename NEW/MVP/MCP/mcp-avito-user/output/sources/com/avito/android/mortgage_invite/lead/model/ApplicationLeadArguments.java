package com.avito.android.mortgage_invite.lead.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationLeadArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/lead/model/ApplicationLeadArguments;", "Landroid/os/Parcelable;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ApplicationLeadArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ApplicationLeadArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f205894b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f205895c;

    /* compiled from: ApplicationLeadArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ApplicationLeadArguments> {
        @Override // android.os.Parcelable.Creator
        public final ApplicationLeadArguments createFromParcel(Parcel parcel) {
            return new ApplicationLeadArguments(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ApplicationLeadArguments[] newArray(int i12) {
            return new ApplicationLeadArguments[i12];
        }
    }

    public ApplicationLeadArguments(@l String str, @l String str2) {
        this.f205894b = str;
        this.f205895c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationLeadArguments)) {
            return false;
        }
        ApplicationLeadArguments applicationLeadArguments = (ApplicationLeadArguments) obj;
        return L.f(this.f205894b, applicationLeadArguments.f205894b) && L.f(this.f205895c, applicationLeadArguments.f205895c);
    }

    public final int hashCode() {
        String str = this.f205894b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f205895c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationLeadArguments(sourceType=");
        sb2.append(this.f205894b);
        sb2.append(", utmSource=");
        return C22026a.c(sb2, this.f205895c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f205894b);
        parcel.writeString(this.f205895c);
    }
}
