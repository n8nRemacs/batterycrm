package com.avito.android.credits.landing;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: CreditProductsLandingFragment.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/landing/CreditProductsLandingArguments;", "Lcom/avito/android/util/OpenParams;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CreditProductsLandingArguments implements OpenParams {

    @k
    public static final Parcelable.Creator<CreditProductsLandingArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Uri f128879b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f128880c;

    /* compiled from: CreditProductsLandingFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreditProductsLandingArguments> {
        @Override // android.os.Parcelable.Creator
        public final CreditProductsLandingArguments createFromParcel(Parcel parcel) {
            return new CreditProductsLandingArguments((Uri) parcel.readParcelable(CreditProductsLandingArguments.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CreditProductsLandingArguments[] newArray(int i12) {
            return new CreditProductsLandingArguments[i12];
        }
    }

    public CreditProductsLandingArguments(@k Uri uri, @l String str) {
        this.f128879b = uri;
        this.f128880c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f128879b, i12);
        parcel.writeString(this.f128880c);
    }
}
