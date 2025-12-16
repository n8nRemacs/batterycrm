package com.avito.android.oauth.presentation;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OAuthDetails.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/oauth/presentation/OAuthDetails;", "Landroid/os/Parcelable;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class OAuthDetails implements Parcelable {

    @k
    public static final Parcelable.Creator<OAuthDetails> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f208236b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f208237c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f208238d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f208239e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Uri f208240f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f208241g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f208242h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f208243i;

    /* compiled from: OAuthDetails.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OAuthDetails> {
        @Override // android.os.Parcelable.Creator
        public final OAuthDetails createFromParcel(Parcel parcel) {
            return new OAuthDetails((Uri) parcel.readParcelable(OAuthDetails.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OAuthDetails[] newArray(int i12) {
            return new OAuthDetails[i12];
        }
    }

    public OAuthDetails(@k Uri uri, @k String str, @k String str2, @l String str3, @k String str4, @l String str5, @l String str6, @l String str7) {
        this.f208236b = str;
        this.f208237c = str2;
        this.f208238d = str3;
        this.f208239e = str4;
        this.f208240f = uri;
        this.f208241g = str5;
        this.f208242h = str6;
        this.f208243i = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAuthDetails)) {
            return false;
        }
        OAuthDetails oAuthDetails = (OAuthDetails) obj;
        return L.f(this.f208236b, oAuthDetails.f208236b) && L.f(this.f208237c, oAuthDetails.f208237c) && L.f(this.f208238d, oAuthDetails.f208238d) && L.f(this.f208239e, oAuthDetails.f208239e) && L.f(this.f208240f, oAuthDetails.f208240f) && L.f(this.f208241g, oAuthDetails.f208241g) && L.f(this.f208242h, oAuthDetails.f208242h) && L.f(this.f208243i, oAuthDetails.f208243i);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f208236b.hashCode() * 31, 31, this.f208237c);
        String str = this.f208238d;
        int iE2 = m.e(this.f208240f, H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f208239e), 31);
        String str2 = this.f208241g;
        int iHashCode = (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f208242h;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f208243i;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OAuthDetails(clientId=");
        sb2.append(this.f208236b);
        sb2.append(", scope=");
        sb2.append(this.f208237c);
        sb2.append(", state=");
        sb2.append(this.f208238d);
        sb2.append(", responseType=");
        sb2.append(this.f208239e);
        sb2.append(", deeplinkUri=");
        sb2.append(this.f208240f);
        sb2.append(", codeChallengeMethod=");
        sb2.append(this.f208241g);
        sb2.append(", codeChallenge=");
        sb2.append(this.f208242h);
        sb2.append(", redirectUri=");
        return C22026a.c(sb2, this.f208243i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f208236b);
        parcel.writeString(this.f208237c);
        parcel.writeString(this.f208238d);
        parcel.writeString(this.f208239e);
        parcel.writeParcelable(this.f208240f, i12);
        parcel.writeString(this.f208241g);
        parcel.writeString(this.f208242h);
        parcel.writeString(this.f208243i);
    }
}
