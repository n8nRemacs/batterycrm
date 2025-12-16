package com.avito.android.short_term_rent.promo_codes.ui;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.short_term_rent.common.entity.PromoCode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrSoftBookingPromoCodesDialogResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/ui/StrSoftBookingPromoCodesDialogResult;", "Landroid/os/Parcelable;", "()V", "Apply", "Disable", "Dismiss", "Select", "Lcom/avito/android/short_term_rent/promo_codes/ui/StrSoftBookingPromoCodesDialogResult$Apply;", "Lcom/avito/android/short_term_rent/promo_codes/ui/StrSoftBookingPromoCodesDialogResult$Disable;", "Lcom/avito/android/short_term_rent/promo_codes/ui/StrSoftBookingPromoCodesDialogResult$Dismiss;", "Lcom/avito/android/short_term_rent/promo_codes/ui/StrSoftBookingPromoCodesDialogResult$Select;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class StrSoftBookingPromoCodesDialogResult implements Parcelable {

    /* compiled from: StrSoftBookingPromoCodesDialogResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/ui/StrSoftBookingPromoCodesDialogResult$Apply;", "Lcom/avito/android/short_term_rent/promo_codes/ui/StrSoftBookingPromoCodesDialogResult;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Apply extends StrSoftBookingPromoCodesDialogResult {

        @k
        public static final Parcelable.Creator<Apply> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f282506b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f282507c;

        /* compiled from: StrSoftBookingPromoCodesDialogResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Apply> {
            @Override // android.os.Parcelable.Creator
            public final Apply createFromParcel(Parcel parcel) {
                return new Apply(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Apply[] newArray(int i12) {
                return new Apply[i12];
            }
        }

        public Apply(@l String str, @l String str2) {
            super(null);
            this.f282506b = str;
            this.f282507c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Apply)) {
                return false;
            }
            Apply apply = (Apply) obj;
            return L.f(this.f282506b, apply.f282506b) && L.f(this.f282507c, apply.f282507c);
        }

        public final int hashCode() {
            String str = this.f282506b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f282507c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Apply(code=");
            sb2.append(this.f282506b);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f282507c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f282506b);
            parcel.writeString(this.f282507c);
        }
    }

    /* compiled from: StrSoftBookingPromoCodesDialogResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/ui/StrSoftBookingPromoCodesDialogResult$Disable;", "Lcom/avito/android/short_term_rent/promo_codes/ui/StrSoftBookingPromoCodesDialogResult;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Disable extends StrSoftBookingPromoCodesDialogResult {

        @k
        public static final Parcelable.Creator<Disable> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f282508b;

        /* compiled from: StrSoftBookingPromoCodesDialogResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Disable> {
            @Override // android.os.Parcelable.Creator
            public final Disable createFromParcel(Parcel parcel) {
                return new Disable((PrintableText) parcel.readParcelable(Disable.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Disable[] newArray(int i12) {
                return new Disable[i12];
            }
        }

        public Disable(@l PrintableText printableText) {
            super(null);
            this.f282508b = printableText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Disable) && L.f(this.f282508b, ((Disable) obj).f282508b);
        }

        public final int hashCode() {
            PrintableText printableText = this.f282508b;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("Disable(message="), this.f282508b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f282508b, i12);
        }
    }

    /* compiled from: StrSoftBookingPromoCodesDialogResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/ui/StrSoftBookingPromoCodesDialogResult$Dismiss;", "Lcom/avito/android/short_term_rent/promo_codes/ui/StrSoftBookingPromoCodesDialogResult;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Dismiss extends StrSoftBookingPromoCodesDialogResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Dismiss f282509b = new Dismiss();

        @k
        public static final Parcelable.Creator<Dismiss> CREATOR = new a();

        /* compiled from: StrSoftBookingPromoCodesDialogResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Dismiss> {
            @Override // android.os.Parcelable.Creator
            public final Dismiss createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Dismiss.f282509b;
            }

            @Override // android.os.Parcelable.Creator
            public final Dismiss[] newArray(int i12) {
                return new Dismiss[i12];
            }
        }

        public Dismiss() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return -234076888;
        }

        @k
        public final String toString() {
            return "Dismiss";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: StrSoftBookingPromoCodesDialogResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/promo_codes/ui/StrSoftBookingPromoCodesDialogResult$Select;", "Lcom/avito/android/short_term_rent/promo_codes/ui/StrSoftBookingPromoCodesDialogResult;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Select extends StrSoftBookingPromoCodesDialogResult {

        @k
        public static final Parcelable.Creator<Select> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PromoCode f282510b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f282511c;

        /* compiled from: StrSoftBookingPromoCodesDialogResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Select> {
            @Override // android.os.Parcelable.Creator
            public final Select createFromParcel(Parcel parcel) {
                return new Select(PromoCode.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Select[] newArray(int i12) {
                return new Select[i12];
            }
        }

        public Select(@k PromoCode promoCode, @l String str) {
            super(null);
            this.f282510b = promoCode;
            this.f282511c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Select)) {
                return false;
            }
            Select select = (Select) obj;
            return L.f(this.f282510b, select.f282510b) && L.f(this.f282511c, select.f282511c);
        }

        public final int hashCode() {
            int iHashCode = this.f282510b.hashCode() * 31;
            String str = this.f282511c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Select(promoCode=");
            sb2.append(this.f282510b);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f282511c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f282510b.writeToParcel(parcel, i12);
            parcel.writeString(this.f282511c);
        }
    }

    public /* synthetic */ StrSoftBookingPromoCodesDialogResult(C42822w c42822w) {
        this();
    }

    public StrSoftBookingPromoCodesDialogResult() {
    }
}
