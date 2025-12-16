package com.avito.android.referral_program;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.q;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ReferralPageDeepLink.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/referral_program/ReferralPageDeepLink;", "Lcom/avito/android/referral_program/ReferralDeeplink;", "Lcom/avito/android/deep_linking/links/q;", "_avito_referral-program_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes16.dex */
public final /* data */ class ReferralPageDeepLink extends ReferralDeeplink implements q {

    @Y61.k
    public static final Parcelable.Creator<ReferralPageDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f252603b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f252604c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f252605d;

    /* compiled from: ReferralPageDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReferralPageDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final ReferralPageDeepLink createFromParcel(Parcel parcel) {
            return new ReferralPageDeepLink(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ReferralPageDeepLink[] newArray(int i12) {
            return new ReferralPageDeepLink[i12];
        }
    }

    public ReferralPageDeepLink(@Y61.k String str, @Y61.k String str2, boolean z12) {
        super(null);
        this.f252603b = str;
        this.f252604c = str2;
        this.f252605d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferralPageDeepLink)) {
            return false;
        }
        ReferralPageDeepLink referralPageDeepLink = (ReferralPageDeepLink) obj;
        return L.f(this.f252603b, referralPageDeepLink.f252603b) && L.f(this.f252604c, referralPageDeepLink.f252604c) && this.f252605d == referralPageDeepLink.f252605d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f252605d) + H.d(this.f252603b.hashCode() * 31, 31, this.f252604c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReferralPageDeepLink(pagePath=");
        sb2.append(this.f252603b);
        sb2.append(", screenName=");
        sb2.append(this.f252604c);
        sb2.append(", scrollOnKeyboardShown=");
        return r.x(sb2, this.f252605d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f252603b);
        parcel.writeString(this.f252604c);
        parcel.writeInt(this.f252605d ? 1 : 0);
    }
}
