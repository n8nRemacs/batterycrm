package com.avito.android.mortgage_invite.client_form.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationClientFormArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/model/ApplicationClientFormArguments;", "Landroid/os/Parcelable;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ApplicationClientFormArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ApplicationClientFormArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f205210b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f205211c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f205212d;

    /* compiled from: ApplicationClientFormArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ApplicationClientFormArguments> {
        @Override // android.os.Parcelable.Creator
        public final ApplicationClientFormArguments createFromParcel(Parcel parcel) {
            return new ApplicationClientFormArguments(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ApplicationClientFormArguments[] newArray(int i12) {
            return new ApplicationClientFormArguments[i12];
        }
    }

    public ApplicationClientFormArguments(@k String str, @k String str2, @k String str3) {
        this.f205210b = str;
        this.f205211c = str2;
        this.f205212d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationClientFormArguments)) {
            return false;
        }
        ApplicationClientFormArguments applicationClientFormArguments = (ApplicationClientFormArguments) obj;
        return L.f(this.f205210b, applicationClientFormArguments.f205210b) && L.f(this.f205211c, applicationClientFormArguments.f205211c) && L.f(this.f205212d, applicationClientFormArguments.f205212d);
    }

    public final int hashCode() {
        return this.f205212d.hashCode() + H.d(this.f205210b.hashCode() * 31, 31, this.f205211c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationClientFormArguments(applicationId=");
        sb2.append(this.f205210b);
        sb2.append(", flowType=");
        sb2.append(this.f205211c);
        sb2.append(", participationType=");
        return C22026a.c(sb2, this.f205212d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f205210b);
        parcel.writeString(this.f205211c);
        parcel.writeString(this.f205212d);
    }
}
