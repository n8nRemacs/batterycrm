package com.avito.android.deep_linking.links.auth;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: SafetyLinks.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PasswordUpgradeLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class PasswordUpgradeLink extends DeepLink {

    @k
    public static final Parcelable.Creator<PasswordUpgradeLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f133930b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f133931c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f133932d;

    /* compiled from: SafetyLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PasswordUpgradeLink> {
        @Override // android.os.Parcelable.Creator
        public final PasswordUpgradeLink createFromParcel(Parcel parcel) {
            return new PasswordUpgradeLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PasswordUpgradeLink[] newArray(int i12) {
            return new PasswordUpgradeLink[i12];
        }
    }

    public /* synthetic */ PasswordUpgradeLink(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasswordUpgradeLink)) {
            return false;
        }
        PasswordUpgradeLink passwordUpgradeLink = (PasswordUpgradeLink) obj;
        return L.f(this.f133930b, passwordUpgradeLink.f133930b) && L.f(this.f133931c, passwordUpgradeLink.f133931c) && L.f(this.f133932d, passwordUpgradeLink.f133932d);
    }

    public final int hashCode() {
        String str = this.f133930b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f133931c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133932d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PasswordUpgradeLink(description=");
        sb2.append(this.f133930b);
        sb2.append(", context=");
        sb2.append(this.f133931c);
        sb2.append(", login=");
        return C22026a.c(sb2, this.f133932d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f133930b);
        parcel.writeString(this.f133931c);
        parcel.writeString(this.f133932d);
    }

    public PasswordUpgradeLink(@l String str, @l String str2, @l String str3) {
        this.f133930b = str;
        this.f133931c = str2;
        this.f133932d = str3;
    }
}
