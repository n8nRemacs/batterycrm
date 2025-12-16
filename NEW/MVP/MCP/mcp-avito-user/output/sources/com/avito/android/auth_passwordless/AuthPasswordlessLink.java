package com.avito.android.auth_passwordless;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: AuthPasswordlessLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auth_passwordless/AuthPasswordlessLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_auth-passwordless_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final /* data */ class AuthPasswordlessLink extends DeepLink {

    @k
    public static final Parcelable.Creator<AuthPasswordlessLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f92626b;

    /* compiled from: AuthPasswordlessLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AuthPasswordlessLink> {
        @Override // android.os.Parcelable.Creator
        public final AuthPasswordlessLink createFromParcel(Parcel parcel) {
            return new AuthPasswordlessLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthPasswordlessLink[] newArray(int i12) {
            return new AuthPasswordlessLink[i12];
        }
    }

    public AuthPasswordlessLink(@k String str) {
        this.f92626b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthPasswordlessLink) && L.f(this.f92626b, ((AuthPasswordlessLink) obj).f92626b);
    }

    public final int hashCode() {
        return this.f92626b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("AuthPasswordlessLink(flow="), this.f92626b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f92626b);
    }
}
