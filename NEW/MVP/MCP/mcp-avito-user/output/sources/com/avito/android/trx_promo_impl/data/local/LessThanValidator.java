package com.avito.android.trx_promo_impl.data.local;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import kotlin.Metadata;

/* compiled from: TrxPromoDateValidator.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/data/local/LessThanValidator;", "Lcom/avito/android/trx_promo_impl/data/local/TrxPromoDateValidator;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LessThanValidator extends TrxPromoDateValidator {

    @k
    public static final Parcelable.Creator<LessThanValidator> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LocalDate f303935b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f303936c;

    /* compiled from: TrxPromoDateValidator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LessThanValidator> {
        @Override // android.os.Parcelable.Creator
        public final LessThanValidator createFromParcel(Parcel parcel) {
            return new LessThanValidator((LocalDate) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LessThanValidator[] newArray(int i12) {
            return new LessThanValidator[i12];
        }
    }

    public LessThanValidator(@k LocalDate localDate, @k String str) {
        this.f303935b = localDate;
        this.f303936c = str;
    }

    @Override // com.avito.android.trx_promo_impl.data.local.TrxPromoDateValidator
    public final boolean a(@k LocalDate localDate) {
        return localDate.compareTo((ChronoLocalDate) this.f303935b) < 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.trx_promo_impl.data.local.TrxPromoDateValidator
    @k
    /* renamed from: getMessage, reason: from getter */
    public final String getF303938c() {
        return this.f303936c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f303935b);
        parcel.writeString(this.f303936c);
    }
}
