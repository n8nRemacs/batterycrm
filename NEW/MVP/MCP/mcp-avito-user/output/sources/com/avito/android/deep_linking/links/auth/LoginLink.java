package com.avito.android.deep_linking.links.auth;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: AuthLinks.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/LoginLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class LoginLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<LoginLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f133917b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f133918c;

    /* compiled from: AuthLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LoginLink> {
        @Override // android.os.Parcelable.Creator
        public final LoginLink createFromParcel(Parcel parcel) {
            return new LoginLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LoginLink[] newArray(int i12) {
            return new LoginLink[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoginLink() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginLink)) {
            return false;
        }
        LoginLink loginLink = (LoginLink) obj;
        return L.f(this.f133917b, loginLink.f133917b) && L.f(this.f133918c, loginLink.f133918c);
    }

    public final int hashCode() {
        String str = this.f133917b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f133918c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LoginLink(login=");
        sb2.append(this.f133917b);
        sb2.append(", password=");
        return C22026a.c(sb2, this.f133918c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f133917b);
        parcel.writeString(this.f133918c);
    }

    public /* synthetic */ LoginLink(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
    }

    public LoginLink(@l String str, @l String str2) {
        this.f133917b = str;
        this.f133918c = str2;
    }
}
