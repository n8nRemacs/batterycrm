package com.avito.android.verification.links.esia.apptoapp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.esiasdk.android.data.network.model.ClientSessionInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationEsiaAuthArgs.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/esia/apptoapp/VerificationEsiaAuthArgs;", "Landroid/os/Parcelable;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VerificationEsiaAuthArgs implements Parcelable {

    @k
    public static final Parcelable.Creator<VerificationEsiaAuthArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ClientSessionInfo f324224b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f324225c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f324226d;

    /* compiled from: VerificationEsiaAuthArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationEsiaAuthArgs> {
        @Override // android.os.Parcelable.Creator
        public final VerificationEsiaAuthArgs createFromParcel(Parcel parcel) {
            return new VerificationEsiaAuthArgs((ClientSessionInfo) parcel.readParcelable(VerificationEsiaAuthArgs.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationEsiaAuthArgs[] newArray(int i12) {
            return new VerificationEsiaAuthArgs[i12];
        }
    }

    public VerificationEsiaAuthArgs(@k ClientSessionInfo clientSessionInfo, @k String str, @k String str2) {
        this.f324224b = clientSessionInfo;
        this.f324225c = str;
        this.f324226d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationEsiaAuthArgs)) {
            return false;
        }
        VerificationEsiaAuthArgs verificationEsiaAuthArgs = (VerificationEsiaAuthArgs) obj;
        return L.f(this.f324224b, verificationEsiaAuthArgs.f324224b) && L.f(this.f324225c, verificationEsiaAuthArgs.f324225c) && L.f(this.f324226d, verificationEsiaAuthArgs.f324226d);
    }

    public final int hashCode() {
        return this.f324226d.hashCode() + H.d(this.f324224b.hashCode() * 31, 31, this.f324225c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationEsiaAuthArgs(clientSessionInfo=");
        sb2.append(this.f324224b);
        sb2.append(", apiUrl=");
        sb2.append(this.f324225c);
        sb2.append(", permissions=");
        return C22026a.c(sb2, this.f324226d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f324224b, i12);
        parcel.writeString(this.f324225c);
        parcel.writeString(this.f324226d);
    }
}
