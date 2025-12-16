package com.avito.android.credits.credit_partner_screen;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: CreditPartnerFragment.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/credit_partner_screen/CreditPartnerFragmentParams;", "Lcom/avito/android/util/OpenParams;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CreditPartnerFragmentParams implements OpenParams {

    @k
    public static final Parcelable.Creator<CreditPartnerFragmentParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f128764b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Uri f128765c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f128766d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f128767e;

    /* compiled from: CreditPartnerFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreditPartnerFragmentParams> {
        @Override // android.os.Parcelable.Creator
        public final CreditPartnerFragmentParams createFromParcel(Parcel parcel) {
            return new CreditPartnerFragmentParams((Uri) parcel.readParcelable(CreditPartnerFragmentParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CreditPartnerFragmentParams[] newArray(int i12) {
            return new CreditPartnerFragmentParams[i12];
        }
    }

    public CreditPartnerFragmentParams(@l Uri uri, @l String str, @l String str2, @l String str3) {
        this.f128764b = str;
        this.f128765c = uri;
        this.f128766d = str2;
        this.f128767e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f128764b);
        parcel.writeParcelable(this.f128765c, i12);
        parcel.writeString(this.f128766d);
        parcel.writeString(this.f128767e);
    }
}
