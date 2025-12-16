package com.avito.android.remote.model.auto_select;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectNoClickContact.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0003:;<B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJV\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b'\u0010!J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u0019R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010\u001b¨\u0006="}, d2 = {"Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$NoClickContactCard;", "leftCard", "rightCard", "inputTitle", "Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$ButtonParams;", "submitButton", "Lcom/avito/android/remote/model/text/AttributedText;", ServiceTransportationWidget.DisclaimerField.TYPE, "Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$Analytics;", "analytics", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$NoClickContactCard;Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$NoClickContactCard;Ljava/lang/String;Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$ButtonParams;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$Analytics;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$NoClickContactCard;", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$ButtonParams;", "component6", "()Lcom/avito/android/remote/model/text/AttributedText;", "component7", "()Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$Analytics;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$NoClickContactCard;Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$NoClickContactCard;Ljava/lang/String;Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$ButtonParams;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$Analytics;)Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$NoClickContactCard;", "getLeftCard", "getRightCard", "getInputTitle", "Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$ButtonParams;", "getSubmitButton", "Lcom/avito/android/remote/model/text/AttributedText;", "getDisclaimer", "Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$Analytics;", "getAnalytics", "Analytics", "ButtonParams", "NoClickContactCard", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutoSelectNoClickContact implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoSelectNoClickContact> CREATOR = new Creator();

    @c("analytics")
    @k
    private final Analytics analytics;

    @c(ServiceTransportationWidget.DisclaimerField.TYPE)
    @k
    private final AttributedText disclaimer;

    @c("inputTitle")
    @k
    private final String inputTitle;

    @c("leftCard")
    @k
    private final NoClickContactCard leftCard;

    @c("rightCard")
    @k
    private final NoClickContactCard rightCard;

    @c("submitButton")
    @k
    private final ButtonParams submitButton;

    @c("title")
    @k
    private final String title;

    /* compiled from: AutoSelectNoClickContact.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$Analytics;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", "onShowForm", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$Analytics;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnShowForm", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Analytics implements Parcelable {

        @k
        public static final Parcelable.Creator<Analytics> CREATOR = new Creator();

        @c("onShowForm")
        @k
        private final DeepLink onShowForm;

        /* compiled from: AutoSelectNoClickContact.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Analytics> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Analytics createFromParcel(@k Parcel parcel) {
                return new Analytics((DeepLink) parcel.readParcelable(Analytics.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Analytics[] newArray(int i12) {
                return new Analytics[i12];
            }
        }

        public Analytics(@k DeepLink deepLink) {
            this.onShowForm = deepLink;
        }

        public static /* synthetic */ Analytics copy$default(Analytics analytics, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                deepLink = analytics.onShowForm;
            }
            return analytics.copy(deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final DeepLink getOnShowForm() {
            return this.onShowForm;
        }

        @k
        public final Analytics copy(@k DeepLink onShowForm) {
            return new Analytics(onShowForm);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Analytics) && L.f(this.onShowForm, ((Analytics) other).onShowForm);
        }

        @k
        public final DeepLink getOnShowForm() {
            return this.onShowForm;
        }

        public int hashCode() {
            return this.onShowForm.hashCode();
        }

        @k
        public String toString() {
            return a.v(new StringBuilder("Analytics(onShowForm="), this.onShowForm, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.onShowForm, flags);
        }
    }

    /* compiled from: AutoSelectNoClickContact.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoSelectNoClickContact> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoSelectNoClickContact createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            Parcelable.Creator<NoClickContactCard> creator = NoClickContactCard.CREATOR;
            return new AutoSelectNoClickContact(string, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString(), ButtonParams.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(AutoSelectNoClickContact.class.getClassLoader()), Analytics.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoSelectNoClickContact[] newArray(int i12) {
            return new AutoSelectNoClickContact[i12];
        }
    }

    public AutoSelectNoClickContact(@k String str, @k NoClickContactCard noClickContactCard, @k NoClickContactCard noClickContactCard2, @k String str2, @k ButtonParams buttonParams, @k AttributedText attributedText, @k Analytics analytics) {
        this.title = str;
        this.leftCard = noClickContactCard;
        this.rightCard = noClickContactCard2;
        this.inputTitle = str2;
        this.submitButton = buttonParams;
        this.disclaimer = attributedText;
        this.analytics = analytics;
    }

    public static /* synthetic */ AutoSelectNoClickContact copy$default(AutoSelectNoClickContact autoSelectNoClickContact, String str, NoClickContactCard noClickContactCard, NoClickContactCard noClickContactCard2, String str2, ButtonParams buttonParams, AttributedText attributedText, Analytics analytics, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = autoSelectNoClickContact.title;
        }
        if ((i12 & 2) != 0) {
            noClickContactCard = autoSelectNoClickContact.leftCard;
        }
        NoClickContactCard noClickContactCard3 = noClickContactCard;
        if ((i12 & 4) != 0) {
            noClickContactCard2 = autoSelectNoClickContact.rightCard;
        }
        NoClickContactCard noClickContactCard4 = noClickContactCard2;
        if ((i12 & 8) != 0) {
            str2 = autoSelectNoClickContact.inputTitle;
        }
        String str3 = str2;
        if ((i12 & 16) != 0) {
            buttonParams = autoSelectNoClickContact.submitButton;
        }
        ButtonParams buttonParams2 = buttonParams;
        if ((i12 & 32) != 0) {
            attributedText = autoSelectNoClickContact.disclaimer;
        }
        AttributedText attributedText2 = attributedText;
        if ((i12 & 64) != 0) {
            analytics = autoSelectNoClickContact.analytics;
        }
        return autoSelectNoClickContact.copy(str, noClickContactCard3, noClickContactCard4, str3, buttonParams2, attributedText2, analytics);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final NoClickContactCard getLeftCard() {
        return this.leftCard;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final NoClickContactCard getRightCard() {
        return this.rightCard;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getInputTitle() {
        return this.inputTitle;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final ButtonParams getSubmitButton() {
        return this.submitButton;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final AttributedText getDisclaimer() {
        return this.disclaimer;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @k
    public final AutoSelectNoClickContact copy(@k String title, @k NoClickContactCard leftCard, @k NoClickContactCard rightCard, @k String inputTitle, @k ButtonParams submitButton, @k AttributedText disclaimer, @k Analytics analytics) {
        return new AutoSelectNoClickContact(title, leftCard, rightCard, inputTitle, submitButton, disclaimer, analytics);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoSelectNoClickContact)) {
            return false;
        }
        AutoSelectNoClickContact autoSelectNoClickContact = (AutoSelectNoClickContact) other;
        return L.f(this.title, autoSelectNoClickContact.title) && L.f(this.leftCard, autoSelectNoClickContact.leftCard) && L.f(this.rightCard, autoSelectNoClickContact.rightCard) && L.f(this.inputTitle, autoSelectNoClickContact.inputTitle) && L.f(this.submitButton, autoSelectNoClickContact.submitButton) && L.f(this.disclaimer, autoSelectNoClickContact.disclaimer) && L.f(this.analytics, autoSelectNoClickContact.analytics);
    }

    @k
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @k
    public final AttributedText getDisclaimer() {
        return this.disclaimer;
    }

    @k
    public final String getInputTitle() {
        return this.inputTitle;
    }

    @k
    public final NoClickContactCard getLeftCard() {
        return this.leftCard;
    }

    @k
    public final NoClickContactCard getRightCard() {
        return this.rightCard;
    }

    @k
    public final ButtonParams getSubmitButton() {
        return this.submitButton;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.analytics.hashCode() + a.b((this.submitButton.hashCode() + H.d((this.rightCard.hashCode() + ((this.leftCard.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31, 31, this.inputTitle)) * 31, 31, this.disclaimer);
    }

    @k
    public String toString() {
        return "AutoSelectNoClickContact(title=" + this.title + ", leftCard=" + this.leftCard + ", rightCard=" + this.rightCard + ", inputTitle=" + this.inputTitle + ", submitButton=" + this.submitButton + ", disclaimer=" + this.disclaimer + ", analytics=" + this.analytics + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        this.leftCard.writeToParcel(parcel, flags);
        this.rightCard.writeToParcel(parcel, flags);
        parcel.writeString(this.inputTitle);
        this.submitButton.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.disclaimer, flags);
        this.analytics.writeToParcel(parcel, flags);
    }

    /* compiled from: AutoSelectNoClickContact.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$NoClickContactCard;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Lcom/avito/android/remote/model/UniversalImage;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$NoClickContactCard;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NoClickContactCard implements Parcelable {

        @k
        public static final Parcelable.Creator<NoClickContactCard> CREATOR = new Creator();

        @c("image")
        @l
        private final UniversalImage image;

        @c("text")
        @k
        private final AttributedText text;

        /* compiled from: AutoSelectNoClickContact.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NoClickContactCard> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final NoClickContactCard createFromParcel(@k Parcel parcel) {
                return new NoClickContactCard((UniversalImage) parcel.readParcelable(NoClickContactCard.class.getClassLoader()), (AttributedText) parcel.readParcelable(NoClickContactCard.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final NoClickContactCard[] newArray(int i12) {
                return new NoClickContactCard[i12];
            }
        }

        public NoClickContactCard(@l UniversalImage universalImage, @k AttributedText attributedText) {
            this.image = universalImage;
            this.text = attributedText;
        }

        public static /* synthetic */ NoClickContactCard copy$default(NoClickContactCard noClickContactCard, UniversalImage universalImage, AttributedText attributedText, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalImage = noClickContactCard.image;
            }
            if ((i12 & 2) != 0) {
                attributedText = noClickContactCard.text;
            }
            return noClickContactCard.copy(universalImage, attributedText);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }

        @k
        public final NoClickContactCard copy(@l UniversalImage image, @k AttributedText text) {
            return new NoClickContactCard(image, text);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoClickContactCard)) {
                return false;
            }
            NoClickContactCard noClickContactCard = (NoClickContactCard) other;
            return L.f(this.image, noClickContactCard.image) && L.f(this.text, noClickContactCard.text);
        }

        @l
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        public final AttributedText getText() {
            return this.text;
        }

        public int hashCode() {
            UniversalImage universalImage = this.image;
            return this.text.hashCode() + ((universalImage == null ? 0 : universalImage.hashCode()) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("NoClickContactCard(image=");
            sb2.append(this.image);
            sb2.append(", text=");
            return a.w(sb2, this.text, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.image, flags);
            parcel.writeParcelable(this.text, flags);
        }

        public /* synthetic */ NoClickContactCard(UniversalImage universalImage, AttributedText attributedText, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : universalImage, attributedText);
        }
    }

    /* compiled from: AutoSelectNoClickContact.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$ButtonParams;", "Landroid/os/Parcelable;", "", "text", ContextActionHandler.Link.DEEPLINK, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/auto_select/AutoSelectNoClickContact$ButtonParams;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getDeepLink", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ButtonParams implements Parcelable {

        @k
        public static final Parcelable.Creator<ButtonParams> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final String deepLink;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("title")
        @k
        private final String text;

        /* compiled from: AutoSelectNoClickContact.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonParams> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ButtonParams createFromParcel(@k Parcel parcel) {
                return new ButtonParams(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ButtonParams[] newArray(int i12) {
                return new ButtonParams[i12];
            }
        }

        public ButtonParams(@k String str, @k String str2, @l String str3) {
            this.text = str;
            this.deepLink = str2;
            this.style = str3;
        }

        public static /* synthetic */ ButtonParams copy$default(ButtonParams buttonParams, String str, String str2, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = buttonParams.text;
            }
            if ((i12 & 2) != 0) {
                str2 = buttonParams.deepLink;
            }
            if ((i12 & 4) != 0) {
                str3 = buttonParams.style;
            }
            return buttonParams.copy(str, str2, str3);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        public final ButtonParams copy(@k String text, @k String deepLink, @l String style) {
            return new ButtonParams(text, deepLink, style);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonParams)) {
                return false;
            }
            ButtonParams buttonParams = (ButtonParams) other;
            return L.f(this.text, buttonParams.text) && L.f(this.deepLink, buttonParams.deepLink) && L.f(this.style, buttonParams.style);
        }

        @k
        public final String getDeepLink() {
            return this.deepLink;
        }

        @l
        public final String getStyle() {
            return this.style;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iD2 = H.d(this.text.hashCode() * 31, 31, this.deepLink);
            String str = this.style;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ButtonParams(text=");
            sb2.append(this.text);
            sb2.append(", deepLink=");
            sb2.append(this.deepLink);
            sb2.append(", style=");
            return C22026a.c(sb2, this.style, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeString(this.deepLink);
            parcel.writeString(this.style);
        }

        public /* synthetic */ ButtonParams(String str, String str2, String str3, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : str3);
        }
    }
}
