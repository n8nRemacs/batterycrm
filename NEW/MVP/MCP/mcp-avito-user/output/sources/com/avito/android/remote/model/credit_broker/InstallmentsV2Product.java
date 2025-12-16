package com.avito.android.remote.model.credit_broker;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.EntryPointParameter;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CreditBrokerProduct.kt */
@d
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b%\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b&\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b-\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b.\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101R$\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/InstallmentsV2Product;", "Lcom/avito/android/remote/model/credit_broker/CreditBrokerProduct;", "", "planId", "analyticsSlug", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedSubtitle", "Lcom/avito/android/remote/model/credit_broker/EntryPoint;", EntryPointParameter.TYPE, "buttonTitle", "buttonStyle", "Lcom/avito/android/remote/model/credit_broker/CreditProgress;", "progress", "", "Lcom/avito/android/remote/model/credit_broker/OfferDetailsItem;", "offerDetailsItems", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/credit_broker/CalculatorPosition;", "position", "Lcom/avito/android/remote/model/credit_broker/LoanTerms;", "loanTerms", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/credit_broker/EntryPoint;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/credit_broker/CreditProgress;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/credit_broker/CalculatorPosition;Lcom/avito/android/remote/model/credit_broker/LoanTerms;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPlanId", "()Ljava/lang/String;", "getAnalyticsSlug", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/credit_broker/EntryPoint;", "getEntryPoint", "()Lcom/avito/android/remote/model/credit_broker/EntryPoint;", "getButtonTitle", "getButtonStyle", "Lcom/avito/android/remote/model/credit_broker/CreditProgress;", "getProgress", "()Lcom/avito/android/remote/model/credit_broker/CreditProgress;", "Ljava/util/List;", "getOfferDetailsItems", "()Ljava/util/List;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/credit_broker/CalculatorPosition;", "getPosition", "()Lcom/avito/android/remote/model/credit_broker/CalculatorPosition;", "Lcom/avito/android/remote/model/credit_broker/LoanTerms;", "getLoanTerms", "()Lcom/avito/android/remote/model/credit_broker/LoanTerms;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InstallmentsV2Product implements CreditBrokerProduct {

    @k
    public static final Parcelable.Creator<InstallmentsV2Product> CREATOR = new Creator();

    @c("analyticsSlug")
    @l
    private final String analyticsSlug;

    @c("attributedSubtitle")
    @l
    private final AttributedText attributedSubtitle;

    @c("buttonStyle")
    @l
    private final String buttonStyle;

    @c("buttonTitle")
    @l
    private final String buttonTitle;

    @c(ContextActionHandler.Link.DEEPLINK)
    @l
    private final DeepLink deepLink;

    @c(EntryPointParameter.TYPE)
    @l
    private final EntryPoint entryPoint;

    @c("loanTerms")
    @l
    private final LoanTerms loanTerms;

    @c("offerDetailsItems")
    @l
    private final List<OfferDetailsItem> offerDetailsItems;

    @c("planId")
    @l
    private final String planId;

    @c("position")
    @l
    private final CalculatorPosition position;

    @c("progress")
    @l
    private final CreditProgress progress;

    @c("title")
    @l
    private final String title;

    /* compiled from: CreditBrokerProduct.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InstallmentsV2Product> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InstallmentsV2Product createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(InstallmentsV2Product.class.getClassLoader());
            EntryPoint entryPointCreateFromParcel = parcel.readInt() == 0 ? null : EntryPoint.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            CreditProgress creditProgressCreateFromParcel = parcel.readInt() == 0 ? null : CreditProgress.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(parcel.readInt() == 0 ? null : OfferDetailsItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new InstallmentsV2Product(string, string2, string3, attributedText, entryPointCreateFromParcel, string4, string5, creditProgressCreateFromParcel, arrayList, (DeepLink) parcel.readParcelable(InstallmentsV2Product.class.getClassLoader()), parcel.readInt() == 0 ? null : CalculatorPosition.valueOf(parcel.readString()), parcel.readInt() != 0 ? LoanTerms.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InstallmentsV2Product[] newArray(int i12) {
            return new InstallmentsV2Product[i12];
        }
    }

    public InstallmentsV2Product(@l String str, @l String str2, @l String str3, @l AttributedText attributedText, @l EntryPoint entryPoint, @l String str4, @l String str5, @l CreditProgress creditProgress, @l List<OfferDetailsItem> list, @l DeepLink deepLink, @l CalculatorPosition calculatorPosition, @l LoanTerms loanTerms) {
        this.planId = str;
        this.analyticsSlug = str2;
        this.title = str3;
        this.attributedSubtitle = attributedText;
        this.entryPoint = entryPoint;
        this.buttonTitle = str4;
        this.buttonStyle = str5;
        this.progress = creditProgress;
        this.offerDetailsItems = list;
        this.deepLink = deepLink;
        this.position = calculatorPosition;
        this.loanTerms = loanTerms;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getAnalyticsSlug() {
        return this.analyticsSlug;
    }

    @l
    public final AttributedText getAttributedSubtitle() {
        return this.attributedSubtitle;
    }

    @l
    public final String getButtonStyle() {
        return this.buttonStyle;
    }

    @l
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    @l
    public final LoanTerms getLoanTerms() {
        return this.loanTerms;
    }

    @l
    public final List<OfferDetailsItem> getOfferDetailsItems() {
        return this.offerDetailsItems;
    }

    @l
    public final String getPlanId() {
        return this.planId;
    }

    @l
    public final CalculatorPosition getPosition() {
        return this.position;
    }

    @l
    public final CreditProgress getProgress() {
        return this.progress;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.planId);
        parcel.writeString(this.analyticsSlug);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.attributedSubtitle, flags);
        EntryPoint entryPoint = this.entryPoint;
        if (entryPoint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            entryPoint.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.buttonTitle);
        parcel.writeString(this.buttonStyle);
        CreditProgress creditProgress = this.progress;
        if (creditProgress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            creditProgress.writeToParcel(parcel, flags);
        }
        List<OfferDetailsItem> list = this.offerDetailsItems;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                OfferDetailsItem offerDetailsItem = (OfferDetailsItem) itA.next();
                if (offerDetailsItem == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    offerDetailsItem.writeToParcel(parcel, flags);
                }
            }
        }
        parcel.writeParcelable(this.deepLink, flags);
        CalculatorPosition calculatorPosition = this.position;
        if (calculatorPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(calculatorPosition.name());
        }
        LoanTerms loanTerms = this.loanTerms;
        if (loanTerms == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            loanTerms.writeToParcel(parcel, flags);
        }
    }
}
