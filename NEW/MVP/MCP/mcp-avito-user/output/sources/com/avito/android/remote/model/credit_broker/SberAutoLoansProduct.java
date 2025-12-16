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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b#\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b'\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b(\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b2\u00101R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b3\u00101R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b4\u00101R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/SberAutoLoansProduct;", "Lcom/avito/android/remote/model/credit_broker/CreditBrokerProduct;", "", "title", "subtitle", "Lcom/avito/android/remote/model/credit_broker/EntryPoint;", EntryPointParameter.TYPE, "buttonTitle", "analyticsSlug", "Lcom/avito/android/remote/model/text/AttributedText;", "agreementInfo", "", "creditRate", "", "minCreditAmount", "maxCreditAmount", "maxTerm", "term", "Landroid/net/Uri;", ContextActionHandler.Link.URL, "Lcom/avito/android/remote/model/credit_broker/IconName;", "iconName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/credit_broker/EntryPoint;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/net/Uri;Lcom/avito/android/remote/model/credit_broker/IconName;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Lcom/avito/android/remote/model/credit_broker/EntryPoint;", "getEntryPoint", "()Lcom/avito/android/remote/model/credit_broker/EntryPoint;", "getButtonTitle", "getAnalyticsSlug", "Lcom/avito/android/remote/model/text/AttributedText;", "getAgreementInfo", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/Float;", "getCreditRate", "()Ljava/lang/Float;", "Ljava/lang/Integer;", "getMinCreditAmount", "()Ljava/lang/Integer;", "getMaxCreditAmount", "getMaxTerm", "getTerm", "Landroid/net/Uri;", "getUrl", "()Landroid/net/Uri;", "Lcom/avito/android/remote/model/credit_broker/IconName;", "getIconName", "()Lcom/avito/android/remote/model/credit_broker/IconName;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SberAutoLoansProduct implements CreditBrokerProduct {

    @k
    public static final Parcelable.Creator<SberAutoLoansProduct> CREATOR = new Creator();

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

    @c(EntryPointParameter.TYPE)
    @l
    private final EntryPoint entryPoint;

    @c("iconName")
    @l
    private final IconName iconName;

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
    public static final class Creator implements Parcelable.Creator<SberAutoLoansProduct> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SberAutoLoansProduct createFromParcel(@k Parcel parcel) {
            return new SberAutoLoansProduct(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EntryPoint.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(SberAutoLoansProduct.class.getClassLoader()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Uri) parcel.readParcelable(SberAutoLoansProduct.class.getClassLoader()), parcel.readInt() == 0 ? null : IconName.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SberAutoLoansProduct[] newArray(int i12) {
            return new SberAutoLoansProduct[i12];
        }
    }

    public SberAutoLoansProduct(@l String str, @l String str2, @l EntryPoint entryPoint, @l String str3, @l String str4, @l AttributedText attributedText, @l Float f12, @l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l Uri uri, @l IconName iconName) {
        this.title = str;
        this.subtitle = str2;
        this.entryPoint = entryPoint;
        this.buttonTitle = str3;
        this.analyticsSlug = str4;
        this.agreementInfo = attributedText;
        this.creditRate = f12;
        this.minCreditAmount = num;
        this.maxCreditAmount = num2;
        this.maxTerm = num3;
        this.term = num4;
        this.url = uri;
        this.iconName = iconName;
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
    public final EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    @l
    public final IconName getIconName() {
        return this.iconName;
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
        parcel.writeString(this.buttonTitle);
        parcel.writeString(this.analyticsSlug);
        parcel.writeParcelable(this.agreementInfo, flags);
        Float f12 = this.creditRate;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f12);
        }
        Integer num = this.minCreditAmount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.maxCreditAmount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        Integer num3 = this.maxTerm;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num3);
        }
        Integer num4 = this.term;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num4);
        }
        parcel.writeParcelable(this.url, flags);
        IconName iconName = this.iconName;
        if (iconName == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iconName.name());
        }
    }
}
