package com.avito.android.oauth.deeplink;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: OAuthDeepLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/oauth/deeplink/OAuthDeepLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final /* data */ class OAuthDeepLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<OAuthDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f208206b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f208207c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f208208d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f208209e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f208210f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f208211g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f208212h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Uri f208213i;

    /* compiled from: OAuthDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OAuthDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final OAuthDeepLink createFromParcel(Parcel parcel) {
            return new OAuthDeepLink((Uri) parcel.readParcelable(OAuthDeepLink.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OAuthDeepLink[] newArray(int i12) {
            return new OAuthDeepLink[i12];
        }
    }

    public OAuthDeepLink(@k Uri uri, @k String str, @k String str2, @k String str3, @l String str4, @l String str5, @l String str6, @l String str7) {
        this.f208206b = str;
        this.f208207c = str2;
        this.f208208d = str3;
        this.f208209e = str4;
        this.f208210f = str5;
        this.f208211g = str6;
        this.f208212h = str7;
        this.f208213i = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OAuthDeepLink)) {
            return false;
        }
        OAuthDeepLink oAuthDeepLink = (OAuthDeepLink) obj;
        return L.f(this.f208206b, oAuthDeepLink.f208206b) && L.f(this.f208207c, oAuthDeepLink.f208207c) && L.f(this.f208208d, oAuthDeepLink.f208208d) && L.f(this.f208209e, oAuthDeepLink.f208209e) && L.f(this.f208210f, oAuthDeepLink.f208210f) && L.f(this.f208211g, oAuthDeepLink.f208211g) && L.f(this.f208212h, oAuthDeepLink.f208212h) && L.f(this.f208213i, oAuthDeepLink.f208213i);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f208206b.hashCode() * 31, 31, this.f208207c), 31, this.f208208d);
        String str = this.f208209e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f208210f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f208211g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f208212h;
        return this.f208213i.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OAuthDeepLink(clientId=");
        sb2.append(this.f208206b);
        sb2.append(", scope=");
        sb2.append(this.f208207c);
        sb2.append(", responseType=");
        sb2.append(this.f208208d);
        sb2.append(", state=");
        sb2.append(this.f208209e);
        sb2.append(", codeChallengeMethod=");
        sb2.append(this.f208210f);
        sb2.append(", codeChallenge=");
        sb2.append(this.f208211g);
        sb2.append(", redirectUri=");
        sb2.append(this.f208212h);
        sb2.append(", fullDeeplinkUri=");
        return com.avito.android.actions_sheet.a.t(sb2, this.f208213i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f208206b);
        parcel.writeString(this.f208207c);
        parcel.writeString(this.f208208d);
        parcel.writeString(this.f208209e);
        parcel.writeString(this.f208210f);
        parcel.writeString(this.f208211g);
        parcel.writeString(this.f208212h);
        parcel.writeParcelable(this.f208213i, i12);
    }
}
