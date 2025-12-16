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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0007\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b&\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b*\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b1\u00100R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b2\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b6\u00100R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b7\u00100R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\b;\u00100R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010?\u001a\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/TinkoffAutoLoansProduct;", "Lcom/avito/android/remote/model/credit_broker/CreditBrokerProduct;", "", "title", "subtitle", "Lcom/avito/android/remote/model/credit_broker/EntryPoint;", EntryPointParameter.TYPE, "analyticsSlug", "", "creditRate", "", "initialFee", "term", "buttonTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "agreementInfo", "minCreditAmount", "maxCreditAmount", "Landroid/net/Uri;", ContextActionHandler.Link.URL, "maxTerm", "Lcom/avito/android/remote/model/credit_broker/ExternalAppData;", "externalAppData", "Lcom/avito/android/remote/model/credit_broker/Contest;", "contest", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/credit_broker/EntryPoint;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/net/Uri;Ljava/lang/Integer;Lcom/avito/android/remote/model/credit_broker/ExternalAppData;Lcom/avito/android/remote/model/credit_broker/Contest;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Lcom/avito/android/remote/model/credit_broker/EntryPoint;", "getEntryPoint", "()Lcom/avito/android/remote/model/credit_broker/EntryPoint;", "getAnalyticsSlug", "Ljava/lang/Float;", "getCreditRate", "()Ljava/lang/Float;", "Ljava/lang/Integer;", "getInitialFee", "()Ljava/lang/Integer;", "getTerm", "getButtonTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getAgreementInfo", "()Lcom/avito/android/remote/model/text/AttributedText;", "getMinCreditAmount", "getMaxCreditAmount", "Landroid/net/Uri;", "getUrl", "()Landroid/net/Uri;", "getMaxTerm", "Lcom/avito/android/remote/model/credit_broker/ExternalAppData;", "getExternalAppData", "()Lcom/avito/android/remote/model/credit_broker/ExternalAppData;", "Lcom/avito/android/remote/model/credit_broker/Contest;", "getContest", "()Lcom/avito/android/remote/model/credit_broker/Contest;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TinkoffAutoLoansProduct implements CreditBrokerProduct {

    @k
    public static final Parcelable.Creator<TinkoffAutoLoansProduct> CREATOR = new Creator();

    @c("agreementInfo")
    @l
    private final AttributedText agreementInfo;

    @c("analyticsSlug")
    @l
    private final String analyticsSlug;

    @c("buttonTitle")
    @l
    private final String buttonTitle;

    @c("contest")
    @l
    private final Contest contest;

    @c("creditRate")
    @l
    private final Float creditRate;

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
    public static final class Creator implements Parcelable.Creator<TinkoffAutoLoansProduct> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TinkoffAutoLoansProduct createFromParcel(@k Parcel parcel) {
            return new TinkoffAutoLoansProduct(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EntryPoint.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (AttributedText) parcel.readParcelable(TinkoffAutoLoansProduct.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Uri) parcel.readParcelable(TinkoffAutoLoansProduct.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : ExternalAppData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Contest.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TinkoffAutoLoansProduct[] newArray(int i12) {
            return new TinkoffAutoLoansProduct[i12];
        }
    }

    public TinkoffAutoLoansProduct(@l String str, @l String str2, @l EntryPoint entryPoint, @l String str3, @l Float f12, @l Integer num, @l Integer num2, @l String str4, @l AttributedText attributedText, @l Integer num3, @l Integer num4, @l Uri uri, @l Integer num5, @l ExternalAppData externalAppData, @l Contest contest) {
        this.title = str;
        this.subtitle = str2;
        this.entryPoint = entryPoint;
        this.analyticsSlug = str3;
        this.creditRate = f12;
        this.initialFee = num;
        this.term = num2;
        this.buttonTitle = str4;
        this.agreementInfo = attributedText;
        this.minCreditAmount = num3;
        this.maxCreditAmount = num4;
        this.url = uri;
        this.maxTerm = num5;
        this.externalAppData = externalAppData;
        this.contest = contest;
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
    public final Contest getContest() {
        return this.contest;
    }

    @l
    public final Float getCreditRate() {
        return this.creditRate;
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
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        EntryPoint entryPoint = this.entryPoint;
        if (entryPoint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            entryPoint.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.analyticsSlug);
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
        Integer num3 = this.minCreditAmount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num3);
        }
        Integer num4 = this.maxCreditAmount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num4);
        }
        parcel.writeParcelable(this.url, flags);
        Integer num5 = this.maxTerm;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num5);
        }
        ExternalAppData externalAppData = this.externalAppData;
        if (externalAppData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            externalAppData.writeToParcel(parcel, flags);
        }
        Contest contest = this.contest;
        if (contest == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contest.writeToParcel(parcel, flags);
        }
    }
}
