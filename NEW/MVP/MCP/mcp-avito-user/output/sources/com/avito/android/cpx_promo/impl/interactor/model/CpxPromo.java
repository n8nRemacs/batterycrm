package com.avito.android.cpx_promo.impl.interactor.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: CpxPromo.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpx_promo/impl/interactor/model/CpxPromo;", "Landroid/os/Parcelable;", "Auto", "ErrorTexts", "Manual", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CpxPromo implements Parcelable {

    @k
    public static final Parcelable.Creator<CpxPromo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f127000b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f127001c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final CpxPromoButton f127002d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final CpxPromoButton f127003e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final CpxPromoButton f127004f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final CpxPromoButton f127005g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final CpxPromoBidSelector f127006h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Manual f127007i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Auto f127008j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final ErrorTexts f127009k;

    /* compiled from: CpxPromo.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/impl/interactor/model/CpxPromo$Auto;", "Landroid/os/Parcelable;", "Budget", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Auto implements Parcelable {

        @k
        public static final Parcelable.Creator<Auto> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Budget f127010b;

        /* compiled from: CpxPromo.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/impl/interactor/model/CpxPromo$Auto$Budget;", "Landroid/os/Parcelable;", "Value", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class Budget implements Parcelable {

            @k
            public static final Parcelable.Creator<Budget> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @l
            public final AttributedTextWithIcon f127011b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f127012c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final ArrayList f127013d;

            /* compiled from: CpxPromo.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/interactor/model/CpxPromo$Auto$Budget$Value;", "Landroid/os/Parcelable;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final class Value implements Parcelable {

                @k
                public static final Parcelable.Creator<Value> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f127014b;

                /* renamed from: c, reason: collision with root package name */
                @k
                public final String f127015c;

                /* renamed from: d, reason: collision with root package name */
                @k
                public final CpxPromoSlider f127016d;

                /* compiled from: CpxPromo.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Value> {
                    @Override // android.os.Parcelable.Creator
                    public final Value createFromParcel(Parcel parcel) {
                        return new Value(parcel.readString(), parcel.readString(), CpxPromoSlider.CREATOR.createFromParcel(parcel));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Value[] newArray(int i12) {
                        return new Value[i12];
                    }
                }

                public Value(@k String str, @k String str2, @k CpxPromoSlider cpxPromoSlider) {
                    this.f127014b = str;
                    this.f127015c = str2;
                    this.f127016d = cpxPromoSlider;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeString(this.f127014b);
                    parcel.writeString(this.f127015c);
                    this.f127016d.writeToParcel(parcel, i12);
                }
            }

            /* compiled from: CpxPromo.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Budget> {
                @Override // android.os.Parcelable.Creator
                public final Budget createFromParcel(Parcel parcel) {
                    AttributedTextWithIcon attributedTextWithIconCreateFromParcel = parcel.readInt() == 0 ? null : AttributedTextWithIcon.CREATOR.createFromParcel(parcel);
                    String string = parcel.readString();
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(Value.CREATOR, parcel, arrayList, iC2, 1);
                    }
                    return new Budget(attributedTextWithIconCreateFromParcel, string, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Budget[] newArray(int i12) {
                    return new Budget[i12];
                }
            }

            public Budget(@l AttributedTextWithIcon attributedTextWithIcon, @l String str, @k ArrayList arrayList) {
                this.f127011b = attributedTextWithIcon;
                this.f127012c = str;
                this.f127013d = arrayList;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                AttributedTextWithIcon attributedTextWithIcon = this.f127011b;
                if (attributedTextWithIcon == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    attributedTextWithIcon.writeToParcel(parcel, i12);
                }
                parcel.writeString(this.f127012c);
                Iterator itZ = com.avito.android.actions_sheet.a.z(this.f127013d, parcel);
                while (itZ.hasNext()) {
                    ((Value) itZ.next()).writeToParcel(parcel, i12);
                }
            }
        }

        /* compiled from: CpxPromo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Auto> {
            @Override // android.os.Parcelable.Creator
            public final Auto createFromParcel(Parcel parcel) {
                return new Auto(Budget.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Auto[] newArray(int i12) {
                return new Auto[i12];
            }
        }

        public Auto(@k Budget budget) {
            this.f127010b = budget;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f127010b.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: CpxPromo.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/interactor/model/CpxPromo$ErrorTexts;", "Landroid/os/Parcelable;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class ErrorTexts implements Parcelable {

        @k
        public static final Parcelable.Creator<ErrorTexts> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f127017b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f127018c;

        /* compiled from: CpxPromo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ErrorTexts> {
            @Override // android.os.Parcelable.Creator
            public final ErrorTexts createFromParcel(Parcel parcel) {
                return new ErrorTexts(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ErrorTexts[] newArray(int i12) {
                return new ErrorTexts[i12];
            }
        }

        public ErrorTexts(@k String str, @k String str2) {
            this.f127017b = str;
            this.f127018c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f127017b);
            parcel.writeString(this.f127018c);
        }
    }

    /* compiled from: CpxPromo.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/impl/interactor/model/CpxPromo$Manual;", "Landroid/os/Parcelable;", "ExpenseLimit", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Manual implements Parcelable {

        @k
        public static final Parcelable.Creator<Manual> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CpxPromoSlider f127019b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ExpenseLimit f127020c;

        /* compiled from: CpxPromo.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/interactor/model/CpxPromo$Manual$ExpenseLimit;", "Landroid/os/Parcelable;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class ExpenseLimit implements Parcelable {

            @k
            public static final Parcelable.Creator<ExpenseLimit> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @l
            public final AttributedTextWithIcon f127021b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final Long f127022c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f127023d;

            /* renamed from: e, reason: collision with root package name */
            public final long f127024e;

            /* renamed from: f, reason: collision with root package name */
            public final long f127025f;

            /* renamed from: g, reason: collision with root package name */
            @k
            public final CpxPromoInputSheet f127026g;

            /* compiled from: CpxPromo.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ExpenseLimit> {
                @Override // android.os.Parcelable.Creator
                public final ExpenseLimit createFromParcel(Parcel parcel) {
                    return new ExpenseLimit(parcel.readInt() == 0 ? null : AttributedTextWithIcon.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readLong(), parcel.readLong(), CpxPromoInputSheet.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final ExpenseLimit[] newArray(int i12) {
                    return new ExpenseLimit[i12];
                }
            }

            public ExpenseLimit(@l AttributedTextWithIcon attributedTextWithIcon, @l Long l12, @k String str, long j12, long j13, @k CpxPromoInputSheet cpxPromoInputSheet) {
                this.f127021b = attributedTextWithIcon;
                this.f127022c = l12;
                this.f127023d = str;
                this.f127024e = j12;
                this.f127025f = j13;
                this.f127026g = cpxPromoInputSheet;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                AttributedTextWithIcon attributedTextWithIcon = this.f127021b;
                if (attributedTextWithIcon == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    attributedTextWithIcon.writeToParcel(parcel, i12);
                }
                Long l12 = this.f127022c;
                if (l12 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.m(parcel, 1, l12);
                }
                parcel.writeString(this.f127023d);
                parcel.writeLong(this.f127024e);
                parcel.writeLong(this.f127025f);
                this.f127026g.writeToParcel(parcel, i12);
            }
        }

        /* compiled from: CpxPromo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Manual> {
            @Override // android.os.Parcelable.Creator
            public final Manual createFromParcel(Parcel parcel) {
                return new Manual(CpxPromoSlider.CREATOR.createFromParcel(parcel), ExpenseLimit.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Manual[] newArray(int i12) {
                return new Manual[i12];
            }
        }

        public Manual(@k CpxPromoSlider cpxPromoSlider, @k ExpenseLimit expenseLimit) {
            this.f127019b = cpxPromoSlider;
            this.f127020c = expenseLimit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f127019b.writeToParcel(parcel, i12);
            this.f127020c.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: CpxPromo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CpxPromo> {
        @Override // android.os.Parcelable.Creator
        public final CpxPromo createFromParcel(Parcel parcel) {
            AttributedText attributedText = (AttributedText) parcel.readParcelable(CpxPromo.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(CpxPromo.class.getClassLoader());
            CpxPromoButton cpxPromoButtonCreateFromParcel = parcel.readInt() == 0 ? null : CpxPromoButton.CREATOR.createFromParcel(parcel);
            CpxPromoButton cpxPromoButtonCreateFromParcel2 = parcel.readInt() == 0 ? null : CpxPromoButton.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<CpxPromoButton> creator = CpxPromoButton.CREATOR;
            return new CpxPromo(attributedText, attributedText2, cpxPromoButtonCreateFromParcel, cpxPromoButtonCreateFromParcel2, creator.createFromParcel(parcel), creator.createFromParcel(parcel), CpxPromoBidSelector.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Manual.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Auto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ErrorTexts.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CpxPromo[] newArray(int i12) {
            return new CpxPromo[i12];
        }
    }

    public CpxPromo(@k AttributedText attributedText, @l AttributedText attributedText2, @l CpxPromoButton cpxPromoButton, @l CpxPromoButton cpxPromoButton2, @k CpxPromoButton cpxPromoButton3, @k CpxPromoButton cpxPromoButton4, @k CpxPromoBidSelector cpxPromoBidSelector, @l Manual manual, @l Auto auto, @l ErrorTexts errorTexts) {
        this.f127000b = attributedText;
        this.f127001c = attributedText2;
        this.f127002d = cpxPromoButton;
        this.f127003e = cpxPromoButton2;
        this.f127004f = cpxPromoButton3;
        this.f127005g = cpxPromoButton4;
        this.f127006h = cpxPromoBidSelector;
        this.f127007i = manual;
        this.f127008j = auto;
        this.f127009k = errorTexts;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f127000b, i12);
        parcel.writeParcelable(this.f127001c, i12);
        CpxPromoButton cpxPromoButton = this.f127002d;
        if (cpxPromoButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cpxPromoButton.writeToParcel(parcel, i12);
        }
        CpxPromoButton cpxPromoButton2 = this.f127003e;
        if (cpxPromoButton2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cpxPromoButton2.writeToParcel(parcel, i12);
        }
        this.f127004f.writeToParcel(parcel, i12);
        this.f127005g.writeToParcel(parcel, i12);
        this.f127006h.writeToParcel(parcel, i12);
        Manual manual = this.f127007i;
        if (manual == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            manual.writeToParcel(parcel, i12);
        }
        Auto auto = this.f127008j;
        if (auto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            auto.writeToParcel(parcel, i12);
        }
        ErrorTexts errorTexts = this.f127009k;
        if (errorTexts == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            errorTexts.writeToParcel(parcel, i12);
        }
    }
}
