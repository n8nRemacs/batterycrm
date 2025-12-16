package com.avito.android.remote.model.credit_broker;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.EntryPointParameter;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: CreditBrokerProduct.kt */
@d
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001B§\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b*\u0010)R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b+\u0010)R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b2\u00101R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b3\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b7\u00101R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b8\u00101R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b9\u00101R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010/\u001a\u0004\b=\u00101R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010A\u001a\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/TinkoffCashLoansProduct;", "Lcom/avito/android/remote/model/credit_broker/CreditBrokerProduct;", "Lcom/avito/android/remote/model/credit_broker/EntryPoint;", EntryPointParameter.TYPE, "", "analyticsSlug", "title", "subtitle", "", "creditRate", "", "initialFee", "term", "buttonTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "agreementInfo", "defaultCreditAmount", "minCreditAmount", "maxCreditAmount", "Landroid/net/Uri;", ContextActionHandler.Link.URL, "maxTerm", "Lcom/avito/android/remote/model/credit_broker/ExternalAppData;", "externalAppData", "Lcom/avito/android/remote/model/credit_broker/CalculatorPosition;", "position", "<init>", "(Lcom/avito/android/remote/model/credit_broker/EntryPoint;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/net/Uri;Ljava/lang/Integer;Lcom/avito/android/remote/model/credit_broker/ExternalAppData;Lcom/avito/android/remote/model/credit_broker/CalculatorPosition;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/credit_broker/EntryPoint;", "getEntryPoint", "()Lcom/avito/android/remote/model/credit_broker/EntryPoint;", "Ljava/lang/String;", "getAnalyticsSlug", "()Ljava/lang/String;", "getTitle", "getSubtitle", "Ljava/lang/Float;", "getCreditRate", "()Ljava/lang/Float;", "Ljava/lang/Integer;", "getInitialFee", "()Ljava/lang/Integer;", "getTerm", "getButtonTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getAgreementInfo", "()Lcom/avito/android/remote/model/text/AttributedText;", "getDefaultCreditAmount", "getMinCreditAmount", "getMaxCreditAmount", "Landroid/net/Uri;", "getUrl", "()Landroid/net/Uri;", "getMaxTerm", "Lcom/avito/android/remote/model/credit_broker/ExternalAppData;", "getExternalAppData", "()Lcom/avito/android/remote/model/credit_broker/ExternalAppData;", "Lcom/avito/android/remote/model/credit_broker/CalculatorPosition;", "getPosition", "()Lcom/avito/android/remote/model/credit_broker/CalculatorPosition;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TinkoffCashLoansProduct implements CreditBrokerProduct {

    @k
    public static final Parcelable.Creator<TinkoffCashLoansProduct> CREATOR = new Creator();

    @c("agreementInfo")
    @l
    private final AttributedText agreementInfo;

    @c("analyticsSlug")
    @l
    private final String analyticsSlug;

    @c("buttonTitle")
    @l
    private final String buttonTitle;

    @c("creditRate")
    @l
    private final Float creditRate;

    @c("defaultCreditAmount")
    @l
    private final Integer defaultCreditAmount;

    @c(EntryPointParameter.TYPE)
    @l
    private final EntryPoint entryPoint;

    @c("externalAppData")
    @l
    private final ExternalAppData externalAppData;

    @c("initialFee")
    @l
    private final Integer initialFee;

    @c("maxCreditAmount")
    @l
    private final Integer maxCreditAmount;

    @c("maxTerm")
    @l
    private final Integer maxTerm;

    @c("minCreditAmount")
    @l
    private final Integer minCreditAmount;

    @c("position")
    @l
    private final CalculatorPosition position;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("term")
    @l
    private final Integer term;

    @c("title")
    @l
    private final String title;

    @c(ContextActionHandler.Link.URL)
    @l
    private final Uri url;

    /* compiled from: CreditBrokerProduct.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TinkoffCashLoansProduct> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TinkoffCashLoansProduct createFromParcel(@k Parcel parcel) {
            return new TinkoffCashLoansProduct(parcel.readInt() == 0 ? null : EntryPoint.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (AttributedText) parcel.readParcelable(TinkoffCashLoansProduct.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Uri) parcel.readParcelable(TinkoffCashLoansProduct.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : ExternalAppData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CalculatorPosition.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TinkoffCashLoansProduct[] newArray(int i12) {
            return new TinkoffCashLoansProduct[i12];
        }
    }

    public TinkoffCashLoansProduct(@l EntryPoint entryPoint, @l String str, @l String str2, @l String str3, @l Float f12, @l Integer num, @l Integer num2, @l String str4, @l AttributedText attributedText, @l Integer num3, @l Integer num4, @l Integer num5, @l Uri uri, @l Integer num6, @l ExternalAppData externalAppData, @l CalculatorPosition calculatorPosition) {
        this.entryPoint = entryPoint;
        this.analyticsSlug = str;
        this.title = str2;
        this.subtitle = str3;
        this.creditRate = f12;
        this.initialFee = num;
        this.term = num2;
        this.buttonTitle = str4;
        this.agreementInfo = attributedText;
        this.defaultCreditAmount = num3;
        this.minCreditAmount = num4;
        this.maxCreditAmount = num5;
        this.url = uri;
        this.maxTerm = num6;
        this.externalAppData = externalAppData;
        this.position = calculatorPosition;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final AttributedText getAgreementInfo() {
        return this.agreementInfo;
    }

    @l
    public final String getAnalyticsSlug() {
        return this.analyticsSlug;
    }

    @l
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @l
    public final Float getCreditRate() {
        return this.creditRate;
    }

    @l
    public final Integer getDefaultCreditAmount() {
        return this.defaultCreditAmount;
    }

    @l
    public final EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    @l
    public final ExternalAppData getExternalAppData() {
        return this.externalAppData;
    }

    @l
    public final Integer getInitialFee() {
        return this.initialFee;
    }

    @l
    public final Integer getMaxCreditAmount() {
        return this.maxCreditAmount;
    }

    @l
    public final Integer getMaxTerm() {
        return this.maxTerm;
    }

    @l
    public final Integer getMinCreditAmount() {
        return this.minCreditAmount;
    }

    @l
    public final CalculatorPosition getPosition() {
        return this.position;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final Integer getTerm() {
        return this.term;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final Uri getUrl() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        EntryPoint entryPoint = this.entryPoint;
        if (entryPoint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            entryPoint.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.analyticsSlug);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Float f12 = this.creditRate;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f12);
        }
        Integer num = this.initialFee;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.term;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        parcel.writeString(this.buttonTitle);
        parcel.writeParcelable(this.agreementInfo, flags);
        Integer num3 = this.defaultCreditAmount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num3);
        }
        Integer num4 = this.minCreditAmount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num4);
        }
        Integer num5 = this.maxCreditAmount;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num5);
        }
        parcel.writeParcelable(this.url, flags);
        Integer num6 = this.maxTerm;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num6);
        }
        ExternalAppData externalAppData = this.externalAppData;
        if (externalAppData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            externalAppData.writeToParcel(parcel, flags);
        }
        CalculatorPosition calculatorPosition = this.position;
        if (calculatorPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(calculatorPosition.name());
        }
    }
}
