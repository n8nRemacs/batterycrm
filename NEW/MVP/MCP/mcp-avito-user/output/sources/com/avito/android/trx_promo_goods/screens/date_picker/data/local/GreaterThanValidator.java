package com.avito.android.trx_promo_goods.screens.date_picker.data.local;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsDatePickerValidator.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/data/local/GreaterThanValidator;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/data/local/TrxPromoGoodsDatePickerValidator;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GreaterThanValidator extends TrxPromoGoodsDatePickerValidator {

    @k
    public static final Parcelable.Creator<GreaterThanValidator> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LocalDate f303655b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f303656c;

    /* compiled from: TrxPromoGoodsDatePickerValidator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GreaterThanValidator> {
        @Override // android.os.Parcelable.Creator
        public final GreaterThanValidator createFromParcel(Parcel parcel) {
            return new GreaterThanValidator((LocalDate) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GreaterThanValidator[] newArray(int i12) {
            return new GreaterThanValidator[i12];
        }
    }

    public GreaterThanValidator(@k LocalDate localDate, @k String str) {
        this.f303655b = localDate;
        this.f303656c = str;
    }

    @Override // com.avito.android.trx_promo_goods.screens.date_picker.data.local.TrxPromoGoodsDatePickerValidator
    public final boolean a(@k LocalDate localDate) {
        return localDate.compareTo((ChronoLocalDate) this.f303655b) > 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GreaterThanValidator)) {
            return false;
        }
        GreaterThanValidator greaterThanValidator = (GreaterThanValidator) obj;
        return L.f(this.f303655b, greaterThanValidator.f303655b) && L.f(this.f303656c, greaterThanValidator.f303656c);
    }

    @Override // com.avito.android.trx_promo_goods.screens.date_picker.data.local.TrxPromoGoodsDatePickerValidator
    @k
    /* renamed from: getMessage, reason: from getter */
    public final String getF303658c() {
        return this.f303656c;
    }

    public final int hashCode() {
        return this.f303656c.hashCode() + (this.f303655b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GreaterThanValidator(value=");
        sb2.append(this.f303655b);
        sb2.append(", message=");
        return C22026a.c(sb2, this.f303656c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f303655b);
        parcel.writeString(this.f303656c);
    }
}
