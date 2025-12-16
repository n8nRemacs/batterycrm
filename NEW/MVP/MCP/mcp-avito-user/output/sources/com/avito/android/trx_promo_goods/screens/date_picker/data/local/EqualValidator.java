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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/data/local/EqualValidator;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/data/local/TrxPromoGoodsDatePickerValidator;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EqualValidator extends TrxPromoGoodsDatePickerValidator {

    @k
    public static final Parcelable.Creator<EqualValidator> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LocalDate f303651b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f303652c;

    /* compiled from: TrxPromoGoodsDatePickerValidator.kt */
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
        this.f303651b = localDate;
        this.f303652c = str;
    }

    @Override // com.avito.android.trx_promo_goods.screens.date_picker.data.local.TrxPromoGoodsDatePickerValidator
    public final boolean a(@k LocalDate localDate) {
        return localDate.equals(this.f303651b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EqualValidator)) {
            return false;
        }
        EqualValidator equalValidator = (EqualValidator) obj;
        return L.f(this.f303651b, equalValidator.f303651b) && L.f(this.f303652c, equalValidator.f303652c);
    }

    @Override // com.avito.android.trx_promo_goods.screens.date_picker.data.local.TrxPromoGoodsDatePickerValidator
    @k
    /* renamed from: getMessage, reason: from getter */
    public final String getF303654c() {
        return this.f303652c;
    }

    public final int hashCode() {
        return this.f303652c.hashCode() + (this.f303651b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EqualValidator(value=");
        sb2.append(this.f303651b);
        sb2.append(", message=");
        return C22026a.c(sb2, this.f303652c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f303651b);
        parcel.writeString(this.f303652c);
    }
}
