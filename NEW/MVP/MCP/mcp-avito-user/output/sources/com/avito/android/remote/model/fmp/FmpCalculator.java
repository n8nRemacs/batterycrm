package com.avito.android.remote.model.fmp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.fmp.util.FmpAnalyticsEvent;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FmpCalculator.kt */
@d
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b*\u0010!J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b+\u0010%J\u0018\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b,\u0010%J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001cJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b.\u0010/JÊ\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b2\u0010\u001fJ\u0010\u00103\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b:\u00104J \u0010?\u001a\u00020>2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b?\u0010@R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010A\u001a\u0004\bC\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010D\u001a\u0004\bE\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010F\u001a\u0004\bG\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010F\u001a\u0004\bH\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bI\u0010\u001fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010J\u001a\u0004\bK\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010L\u001a\u0004\bM\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010N\u001a\u0004\bO\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010F\u001a\u0004\bP\u0010!R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010J\u001a\u0004\bQ\u0010%R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010J\u001a\u0004\bR\u0010%R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bS\u0010\u001cR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010T\u001a\u0004\bU\u0010/¨\u0006V"}, d2 = {"Lcom/avito/android/remote/model/fmp/FmpCalculator;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "promoTitle", "", "inputValue", "", "minLoanValue", "maxLoanValue", "inputDescription", "", "Lcom/avito/android/remote/model/fmp/LoanPeriod;", "loanPeriods", "Lcom/avito/android/remote/model/fmp/PaymentTitle;", "paymentTitle", "Lcom/avito/android/remote/model/fmp/CalculatorButton;", "button", "promoPeriod", "Lcom/avito/android/remote/model/fmp/util/FmpAnalyticsEvent;", "onChipsClicked", "onAppear", "legal", "", "rate", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/fmp/PaymentTitle;Lcom/avito/android/remote/model/fmp/CalculatorButton;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Double;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "()Lcom/avito/android/remote/model/fmp/PaymentTitle;", "component9", "()Lcom/avito/android/remote/model/fmp/CalculatorButton;", "component10", "component11", "component12", "component13", "component14", "()Ljava/lang/Double;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/fmp/PaymentTitle;Lcom/avito/android/remote/model/fmp/CalculatorButton;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Double;)Lcom/avito/android/remote/model/fmp/FmpCalculator;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getPromoTitle", "Ljava/lang/String;", "getInputValue", "Ljava/lang/Integer;", "getMinLoanValue", "getMaxLoanValue", "getInputDescription", "Ljava/util/List;", "getLoanPeriods", "Lcom/avito/android/remote/model/fmp/PaymentTitle;", "getPaymentTitle", "Lcom/avito/android/remote/model/fmp/CalculatorButton;", "getButton", "getPromoPeriod", "getOnChipsClicked", "getOnAppear", "getLegal", "Ljava/lang/Double;", "getRate", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FmpCalculator implements Parcelable {

    @k
    public static final Parcelable.Creator<FmpCalculator> CREATOR = new Creator();

    @c("button")
    @l
    private final CalculatorButton button;

    @c("inputDescription")
    @l
    private final String inputDescription;

    @c("inputValue")
    @l
    private final String inputValue;

    @c("legal")
    @l
    private final AttributedText legal;

    @c("loanPeriods")
    @l
    private final List<LoanPeriod> loanPeriods;

    @c("maxLoanValue")
    @l
    private final Integer maxLoanValue;

    @c("minLoanValue")
    @l
    private final Integer minLoanValue;

    @c("onAppear")
    @l
    private final List<FmpAnalyticsEvent> onAppear;

    @c("onChipsClicked")
    @l
    private final List<FmpAnalyticsEvent> onChipsClicked;

    @c("paymentTitle")
    @l
    private final PaymentTitle paymentTitle;

    @c("promoPeriod")
    @l
    private final Integer promoPeriod;

    @c("promoTitle")
    @l
    private final AttributedText promoTitle;

    @c("dailyRate")
    @l
    private final Double rate;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: FmpCalculator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FmpCalculator> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FmpCalculator createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(FmpCalculator.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(FmpCalculator.class.getClassLoader());
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(LoanPeriod.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            PaymentTitle paymentTitleCreateFromParcel = parcel.readInt() == 0 ? null : PaymentTitle.CREATOR.createFromParcel(parcel);
            CalculatorButton calculatorButtonCreateFromParcel = parcel.readInt() == 0 ? null : CalculatorButton.CREATOR.createFromParcel(parcel);
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = a.c(FmpAnalyticsEvent.CREATOR, parcel, arrayList5, iC3, 1);
                    i13 = i13;
                }
                arrayList2 = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList2;
                arrayList4 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i14);
                int iC4 = 0;
                while (iC4 != i14) {
                    iC4 = a.c(FmpAnalyticsEvent.CREATOR, parcel, arrayList6, iC4, 1);
                    i14 = i14;
                    arrayList2 = arrayList2;
                }
                arrayList3 = arrayList2;
                arrayList4 = arrayList6;
            }
            return new FmpCalculator(attributedText, attributedText2, string, numValueOf, numValueOf2, string2, arrayList, paymentTitleCreateFromParcel, calculatorButtonCreateFromParcel, numValueOf3, arrayList3, arrayList4, (AttributedText) parcel.readParcelable(FmpCalculator.class.getClassLoader()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FmpCalculator[] newArray(int i12) {
            return new FmpCalculator[i12];
        }
    }

    public FmpCalculator(@l AttributedText attributedText, @l AttributedText attributedText2, @l String str, @l Integer num, @l Integer num2, @l String str2, @l List<LoanPeriod> list, @l PaymentTitle paymentTitle, @l CalculatorButton calculatorButton, @l Integer num3, @l List<FmpAnalyticsEvent> list2, @l List<FmpAnalyticsEvent> list3, @l AttributedText attributedText3, @l Double d12) {
        this.title = attributedText;
        this.promoTitle = attributedText2;
        this.inputValue = str;
        this.minLoanValue = num;
        this.maxLoanValue = num2;
        this.inputDescription = str2;
        this.loanPeriods = list;
        this.paymentTitle = paymentTitle;
        this.button = calculatorButton;
        this.promoPeriod = num3;
        this.onChipsClicked = list2;
        this.onAppear = list3;
        this.legal = attributedText3;
        this.rate = d12;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Integer getPromoPeriod() {
        return this.promoPeriod;
    }

    @l
    public final List<FmpAnalyticsEvent> component11() {
        return this.onChipsClicked;
    }

    @l
    public final List<FmpAnalyticsEvent> component12() {
        return this.onAppear;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final AttributedText getLegal() {
        return this.legal;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final Double getRate() {
        return this.rate;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getPromoTitle() {
        return this.promoTitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getInputValue() {
        return this.inputValue;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Integer getMinLoanValue() {
        return this.minLoanValue;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Integer getMaxLoanValue() {
        return this.maxLoanValue;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getInputDescription() {
        return this.inputDescription;
    }

    @l
    public final List<LoanPeriod> component7() {
        return this.loanPeriods;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final PaymentTitle getPaymentTitle() {
        return this.paymentTitle;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final CalculatorButton getButton() {
        return this.button;
    }

    @k
    public final FmpCalculator copy(@l AttributedText title, @l AttributedText promoTitle, @l String inputValue, @l Integer minLoanValue, @l Integer maxLoanValue, @l String inputDescription, @l List<LoanPeriod> loanPeriods, @l PaymentTitle paymentTitle, @l CalculatorButton button, @l Integer promoPeriod, @l List<FmpAnalyticsEvent> onChipsClicked, @l List<FmpAnalyticsEvent> onAppear, @l AttributedText legal, @l Double rate) {
        return new FmpCalculator(title, promoTitle, inputValue, minLoanValue, maxLoanValue, inputDescription, loanPeriods, paymentTitle, button, promoPeriod, onChipsClicked, onAppear, legal, rate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FmpCalculator)) {
            return false;
        }
        FmpCalculator fmpCalculator = (FmpCalculator) other;
        return L.f(this.title, fmpCalculator.title) && L.f(this.promoTitle, fmpCalculator.promoTitle) && L.f(this.inputValue, fmpCalculator.inputValue) && L.f(this.minLoanValue, fmpCalculator.minLoanValue) && L.f(this.maxLoanValue, fmpCalculator.maxLoanValue) && L.f(this.inputDescription, fmpCalculator.inputDescription) && L.f(this.loanPeriods, fmpCalculator.loanPeriods) && L.f(this.paymentTitle, fmpCalculator.paymentTitle) && L.f(this.button, fmpCalculator.button) && L.f(this.promoPeriod, fmpCalculator.promoPeriod) && L.f(this.onChipsClicked, fmpCalculator.onChipsClicked) && L.f(this.onAppear, fmpCalculator.onAppear) && L.f(this.legal, fmpCalculator.legal) && L.f(this.rate, fmpCalculator.rate);
    }

    @l
    public final CalculatorButton getButton() {
        return this.button;
    }

    @l
    public final String getInputDescription() {
        return this.inputDescription;
    }

    @l
    public final String getInputValue() {
        return this.inputValue;
    }

    @l
    public final AttributedText getLegal() {
        return this.legal;
    }

    @l
    public final List<LoanPeriod> getLoanPeriods() {
        return this.loanPeriods;
    }

    @l
    public final Integer getMaxLoanValue() {
        return this.maxLoanValue;
    }

    @l
    public final Integer getMinLoanValue() {
        return this.minLoanValue;
    }

    @l
    public final List<FmpAnalyticsEvent> getOnAppear() {
        return this.onAppear;
    }

    @l
    public final List<FmpAnalyticsEvent> getOnChipsClicked() {
        return this.onChipsClicked;
    }

    @l
    public final PaymentTitle getPaymentTitle() {
        return this.paymentTitle;
    }

    @l
    public final Integer getPromoPeriod() {
        return this.promoPeriod;
    }

    @l
    public final AttributedText getPromoTitle() {
        return this.promoTitle;
    }

    @l
    public final Double getRate() {
        return this.rate;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        AttributedText attributedText = this.title;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.promoTitle;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        String str = this.inputValue;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.minLoanValue;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxLoanValue;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.inputDescription;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<LoanPeriod> list = this.loanPeriods;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        PaymentTitle paymentTitle = this.paymentTitle;
        int iHashCode8 = (iHashCode7 + (paymentTitle == null ? 0 : paymentTitle.hashCode())) * 31;
        CalculatorButton calculatorButton = this.button;
        int iHashCode9 = (iHashCode8 + (calculatorButton == null ? 0 : calculatorButton.hashCode())) * 31;
        Integer num3 = this.promoPeriod;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<FmpAnalyticsEvent> list2 = this.onChipsClicked;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<FmpAnalyticsEvent> list3 = this.onAppear;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        AttributedText attributedText3 = this.legal;
        int iHashCode13 = (iHashCode12 + (attributedText3 == null ? 0 : attributedText3.hashCode())) * 31;
        Double d12 = this.rate;
        return iHashCode13 + (d12 != null ? d12.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FmpCalculator(title=");
        sb2.append(this.title);
        sb2.append(", promoTitle=");
        sb2.append(this.promoTitle);
        sb2.append(", inputValue=");
        sb2.append(this.inputValue);
        sb2.append(", minLoanValue=");
        sb2.append(this.minLoanValue);
        sb2.append(", maxLoanValue=");
        sb2.append(this.maxLoanValue);
        sb2.append(", inputDescription=");
        sb2.append(this.inputDescription);
        sb2.append(", loanPeriods=");
        sb2.append(this.loanPeriods);
        sb2.append(", paymentTitle=");
        sb2.append(this.paymentTitle);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", promoPeriod=");
        sb2.append(this.promoPeriod);
        sb2.append(", onChipsClicked=");
        sb2.append(this.onChipsClicked);
        sb2.append(", onAppear=");
        sb2.append(this.onAppear);
        sb2.append(", legal=");
        sb2.append(this.legal);
        sb2.append(", rate=");
        return b.h(sb2, this.rate, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.promoTitle, flags);
        parcel.writeString(this.inputValue);
        Integer num = this.minLoanValue;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.maxLoanValue;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        parcel.writeString(this.inputDescription);
        List<LoanPeriod> list = this.loanPeriods;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((LoanPeriod) itA.next()).writeToParcel(parcel, flags);
            }
        }
        PaymentTitle paymentTitle = this.paymentTitle;
        if (paymentTitle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentTitle.writeToParcel(parcel, flags);
        }
        CalculatorButton calculatorButton = this.button;
        if (calculatorButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            calculatorButton.writeToParcel(parcel, flags);
        }
        Integer num3 = this.promoPeriod;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num3);
        }
        List<FmpAnalyticsEvent> list2 = this.onChipsClicked;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((FmpAnalyticsEvent) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        List<FmpAnalyticsEvent> list3 = this.onAppear;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                ((FmpAnalyticsEvent) itA3.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeParcelable(this.legal, flags);
        Double d12 = this.rate;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
        }
    }
}
