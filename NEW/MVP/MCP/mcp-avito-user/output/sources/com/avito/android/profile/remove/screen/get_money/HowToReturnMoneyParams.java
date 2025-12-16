package com.avito.android.profile.remove.screen.get_money;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HowToReturnMoneyFragment.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/remove/screen/get_money/HowToReturnMoneyParams;", "Landroid/os/Parcelable;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class HowToReturnMoneyParams implements Parcelable {

    @k
    public static final Parcelable.Creator<HowToReturnMoneyParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f224052b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f224053c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f224054d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f224055e;

    /* compiled from: HowToReturnMoneyFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HowToReturnMoneyParams> {
        @Override // android.os.Parcelable.Creator
        public final HowToReturnMoneyParams createFromParcel(Parcel parcel) {
            return new HowToReturnMoneyParams(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(HowToReturnMoneyParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HowToReturnMoneyParams[] newArray(int i12) {
            return new HowToReturnMoneyParams[i12];
        }
    }

    public HowToReturnMoneyParams(@k String str, @k String str2, @k String str3, @l DeepLink deepLink) {
        this.f224052b = str;
        this.f224053c = str2;
        this.f224054d = str3;
        this.f224055e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HowToReturnMoneyParams)) {
            return false;
        }
        HowToReturnMoneyParams howToReturnMoneyParams = (HowToReturnMoneyParams) obj;
        return L.f(this.f224052b, howToReturnMoneyParams.f224052b) && L.f(this.f224053c, howToReturnMoneyParams.f224053c) && L.f(this.f224054d, howToReturnMoneyParams.f224054d) && L.f(this.f224055e, howToReturnMoneyParams.f224055e);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f224052b.hashCode() * 31, 31, this.f224053c), 31, this.f224054d);
        DeepLink deepLink = this.f224055e;
        return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HowToReturnMoneyParams(headerText=");
        sb2.append(this.f224052b);
        sb2.append(", descriptionText=");
        sb2.append(this.f224053c);
        sb2.append(", buttonText=");
        sb2.append(this.f224054d);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f224055e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f224052b);
        parcel.writeString(this.f224053c);
        parcel.writeString(this.f224054d);
        parcel.writeParcelable(this.f224055e, i12);
    }
}
