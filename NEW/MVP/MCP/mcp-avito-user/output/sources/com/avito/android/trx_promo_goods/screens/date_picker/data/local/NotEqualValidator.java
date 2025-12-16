package com.avito.android.trx_promo_goods.screens.date_picker.data.local;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsDatePickerValidator.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/data/local/NotEqualValidator;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/data/local/TrxPromoGoodsDatePickerValidator;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NotEqualValidator extends TrxPromoGoodsDatePickerValidator {

    @k
    public static final Parcelable.Creator<NotEqualValidator> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LocalDate f303661b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f303662c;

    /* compiled from: TrxPromoGoodsDatePickerValidator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NotEqualValidator> {
        @Override // android.os.Parcelable.Creator
        public final NotEqualValidator createFromParcel(Parcel parcel) {
            return new NotEqualValidator((LocalDate) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NotEqualValidator[] newArray(int i12) {
            return new NotEqualValidator[i12];
        }
    }

    public NotEqualValidator(@k LocalDate localDate, @k String str) {
        this.f303661b = localDate;
        this.f303662c = str;
    }

    @Override // com.avito.android.trx_promo_goods.screens.date_picker.data.local.TrxPromoGoodsDatePickerValidator
    public final boolean a(@k LocalDate localDate) {
        return !localDate.equals(this.f303661b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotEqualValidator)) {
            return false;
        }
        NotEqualValidator notEqualValidator = (NotEqualValidator) obj;
        return L.f(this.f303661b, notEqualValidator.f303661b) && L.f(this.f303662c, notEqualValidator.f303662c);
    }

    @Override // com.avito.android.trx_promo_goods.screens.date_picker.data.local.TrxPromoGoodsDatePickerValidator
    @k
    /* renamed from: getMessage, reason: from getter */
    public final String getF303662c() {
        return this.f303662c;
    }

    public final int hashCode() {
        return this.f303662c.hashCode() + (this.f303661b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotEqualValidator(value=");
        sb2.append(this.f303661b);
        sb2.append(", message=");
        return C22026a.c(sb2, this.f303662c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f303661b);
        parcel.writeString(this.f303662c);
    }
}
