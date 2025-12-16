package com.avito.android.trx_promo_impl.data.local;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;

/* compiled from: TrxPromoDateValidator.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/data/local/EqualValidator;", "Lcom/avito/android/trx_promo_impl/data/local/TrxPromoDateValidator;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EqualValidator extends TrxPromoDateValidator {

    @k
    public static final Parcelable.Creator<EqualValidator> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LocalDate f303927b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f303928c;

    /* compiled from: TrxPromoDateValidator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EqualValidator> {
        @Override // android.os.Parcelable.Creator
        public final EqualValidator createFromParcel(Parcel parcel) {
            return new EqualValidator((LocalDate) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EqualValidator[] newArray(int i12) {
            return new EqualValidator[i12];
        }
    }

    public EqualValidator(@k LocalDate localDate, @k String str) {
        this.f303927b = localDate;
        this.f303928c = str;
    }

    @Override // com.avito.android.trx_promo_impl.data.local.TrxPromoDateValidator
    public final boolean a(@k LocalDate localDate) {
        return localDate.equals(this.f303927b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.trx_promo_impl.data.local.TrxPromoDateValidator
    @k
    /* renamed from: getMessage, reason: from getter */
    public final String getF303934c() {
        return this.f303928c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f303927b);
        parcel.writeString(this.f303928c);
    }
}
