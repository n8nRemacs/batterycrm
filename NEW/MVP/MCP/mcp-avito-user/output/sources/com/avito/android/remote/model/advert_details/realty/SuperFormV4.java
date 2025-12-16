package com.avito.android.remote.model.advert_details.realty;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.FormInput;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DevelopmentsAdvice.kt */
@d
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0017J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0017J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0017J \u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0017J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020+HÖ\u0001¢\u0006\u0004\b3\u0010-J \u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020+HÖ\u0001¢\u0006\u0004\b8\u00109R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010:\u001a\u0004\b<\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b=\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bA\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bC\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bF\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\bI\u0010\u0017R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\bJ\u0010\u0017R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010:\u001a\u0004\bK\u0010\u0017¨\u0006L"}, d2 = {"Lcom/avito/android/remote/model/advert_details/realty/SuperFormV4;", "Landroid/os/Parcelable;", "", "title", "description", "formTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "entryPointShowEvent", "Lcom/avito/android/remote/model/advert_details/realty/ConsultationButton;", "button", "Lcom/avito/android/remote/model/advert_details/realty/NonNdFormInfo;", RequestReviewResultKt.INFO_TYPE, "Lcom/avito/android/remote/model/text/AttributedText;", ServiceTransportationWidget.DisclaimerField.TYPE, "landing", "Lcom/avito/android/remote/model/FormInput;", "questionInput", "requestType", "formPage", "nodeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/advert_details/realty/ConsultationButton;Lcom/avito/android/remote/model/advert_details/realty/NonNdFormInfo;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/FormInput;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component5", "()Lcom/avito/android/remote/model/advert_details/realty/ConsultationButton;", "component6", "()Lcom/avito/android/remote/model/advert_details/realty/NonNdFormInfo;", "component7", "()Lcom/avito/android/remote/model/text/AttributedText;", "component8", "component9", "()Lcom/avito/android/remote/model/FormInput;", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/advert_details/realty/ConsultationButton;Lcom/avito/android/remote/model/advert_details/realty/NonNdFormInfo;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/FormInput;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/advert_details/realty/SuperFormV4;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "getFormTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getEntryPointShowEvent", "Lcom/avito/android/remote/model/advert_details/realty/ConsultationButton;", "getButton", "Lcom/avito/android/remote/model/advert_details/realty/NonNdFormInfo;", "getInfo", "Lcom/avito/android/remote/model/text/AttributedText;", "getDisclaimer", "getLanding", "Lcom/avito/android/remote/model/FormInput;", "getQuestionInput", "getRequestType", "getFormPage", "getNodeType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SuperFormV4 implements Parcelable {

    @k
    public static final Parcelable.Creator<SuperFormV4> CREATOR = new Creator();

    @c("button")
    @l
    private final ConsultationButton button;

    @c("description")
    @l
    private final String description;

    @c(ServiceTransportationWidget.DisclaimerField.TYPE)
    @l
    private final AttributedText disclaimer;

    @c("entryPointShowEvent")
    @l
    private final DeepLink entryPointShowEvent;

    @c("from_page")
    @l
    private final String formPage;

    @c("formTitle")
    @l
    private final String formTitle;

    @c(RequestReviewResultKt.INFO_TYPE)
    @l
    private final NonNdFormInfo info;

    @c("landing")
    @l
    private final AttributedText landing;

    @c("node_type")
    @l
    private final String nodeType;

    @c("questionInput")
    @l
    private final FormInput questionInput;

    @c("request_type")
    @l
    private final String requestType;

    @c("title")
    @l
    private final String title;

    /* compiled from: DevelopmentsAdvice.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SuperFormV4> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SuperFormV4 createFromParcel(@k Parcel parcel) {
            return new SuperFormV4(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(SuperFormV4.class.getClassLoader()), parcel.readInt() == 0 ? null : ConsultationButton.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : NonNdFormInfo.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(SuperFormV4.class.getClassLoader()), (AttributedText) parcel.readParcelable(SuperFormV4.class.getClassLoader()), parcel.readInt() != 0 ? FormInput.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SuperFormV4[] newArray(int i12) {
            return new SuperFormV4[i12];
        }
    }

    public SuperFormV4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final String getRequestType() {
        return this.requestType;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String getFormPage() {
        return this.formPage;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final String getNodeType() {
        return this.nodeType;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getFormTitle() {
        return this.formTitle;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DeepLink getEntryPointShowEvent() {
        return this.entryPointShowEvent;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final ConsultationButton getButton() {
        return this.button;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final NonNdFormInfo getInfo() {
        return this.info;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final AttributedText getDisclaimer() {
        return this.disclaimer;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final AttributedText getLanding() {
        return this.landing;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final FormInput getQuestionInput() {
        return this.questionInput;
    }

    @k
    public final SuperFormV4 copy(@l String title, @l String description, @l String formTitle, @l DeepLink entryPointShowEvent, @l ConsultationButton button, @l NonNdFormInfo info, @l AttributedText disclaimer, @l AttributedText landing, @l FormInput questionInput, @l String requestType, @l String formPage, @l String nodeType) {
        return new SuperFormV4(title, description, formTitle, entryPointShowEvent, button, info, disclaimer, landing, questionInput, requestType, formPage, nodeType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuperFormV4)) {
            return false;
        }
        SuperFormV4 superFormV4 = (SuperFormV4) other;
        return L.f(this.title, superFormV4.title) && L.f(this.description, superFormV4.description) && L.f(this.formTitle, superFormV4.formTitle) && L.f(this.entryPointShowEvent, superFormV4.entryPointShowEvent) && L.f(this.button, superFormV4.button) && L.f(this.info, superFormV4.info) && L.f(this.disclaimer, superFormV4.disclaimer) && L.f(this.landing, superFormV4.landing) && L.f(this.questionInput, superFormV4.questionInput) && L.f(this.requestType, superFormV4.requestType) && L.f(this.formPage, superFormV4.formPage) && L.f(this.nodeType, superFormV4.nodeType);
    }

    @l
    public final ConsultationButton getButton() {
        return this.button;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final AttributedText getDisclaimer() {
        return this.disclaimer;
    }

    @l
    public final DeepLink getEntryPointShowEvent() {
        return this.entryPointShowEvent;
    }

    @l
    public final String getFormPage() {
        return this.formPage;
    }

    @l
    public final String getFormTitle() {
        return this.formTitle;
    }

    @l
    public final NonNdFormInfo getInfo() {
        return this.info;
    }

    @l
    public final AttributedText getLanding() {
        return this.landing;
    }

    @l
    public final String getNodeType() {
        return this.nodeType;
    }

    @l
    public final FormInput getQuestionInput() {
        return this.questionInput;
    }

    @l
    public final String getRequestType() {
        return this.requestType;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.formTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DeepLink deepLink = this.entryPointShowEvent;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        ConsultationButton consultationButton = this.button;
        int iHashCode5 = (iHashCode4 + (consultationButton == null ? 0 : consultationButton.hashCode())) * 31;
        NonNdFormInfo nonNdFormInfo = this.info;
        int iHashCode6 = (iHashCode5 + (nonNdFormInfo == null ? 0 : nonNdFormInfo.hashCode())) * 31;
        AttributedText attributedText = this.disclaimer;
        int iHashCode7 = (iHashCode6 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.landing;
        int iHashCode8 = (iHashCode7 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        FormInput formInput = this.questionInput;
        int iHashCode9 = (iHashCode8 + (formInput == null ? 0 : formInput.hashCode())) * 31;
        String str4 = this.requestType;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.formPage;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.nodeType;
        return iHashCode11 + (str6 != null ? str6.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SuperFormV4(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", formTitle=");
        sb2.append(this.formTitle);
        sb2.append(", entryPointShowEvent=");
        sb2.append(this.entryPointShowEvent);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", info=");
        sb2.append(this.info);
        sb2.append(", disclaimer=");
        sb2.append(this.disclaimer);
        sb2.append(", landing=");
        sb2.append(this.landing);
        sb2.append(", questionInput=");
        sb2.append(this.questionInput);
        sb2.append(", requestType=");
        sb2.append(this.requestType);
        sb2.append(", formPage=");
        sb2.append(this.formPage);
        sb2.append(", nodeType=");
        return C22026a.c(sb2, this.nodeType, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.formTitle);
        parcel.writeParcelable(this.entryPointShowEvent, flags);
        ConsultationButton consultationButton = this.button;
        if (consultationButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            consultationButton.writeToParcel(parcel, flags);
        }
        NonNdFormInfo nonNdFormInfo = this.info;
        if (nonNdFormInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nonNdFormInfo.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.disclaimer, flags);
        parcel.writeParcelable(this.landing, flags);
        FormInput formInput = this.questionInput;
        if (formInput == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formInput.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.requestType);
        parcel.writeString(this.formPage);
        parcel.writeString(this.nodeType);
    }

    public SuperFormV4(@l String str, @l String str2, @l String str3, @l DeepLink deepLink, @l ConsultationButton consultationButton, @l NonNdFormInfo nonNdFormInfo, @l AttributedText attributedText, @l AttributedText attributedText2, @l FormInput formInput, @l String str4, @l String str5, @l String str6) {
        this.title = str;
        this.description = str2;
        this.formTitle = str3;
        this.entryPointShowEvent = deepLink;
        this.button = consultationButton;
        this.info = nonNdFormInfo;
        this.disclaimer = attributedText;
        this.landing = attributedText2;
        this.questionInput = formInput;
        this.requestType = str4;
        this.formPage = str5;
        this.nodeType = str6;
    }

    public /* synthetic */ SuperFormV4(String str, String str2, String str3, DeepLink deepLink, ConsultationButton consultationButton, NonNdFormInfo nonNdFormInfo, AttributedText attributedText, AttributedText attributedText2, FormInput formInput, String str4, String str5, String str6, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : deepLink, (i12 & 16) != 0 ? null : consultationButton, (i12 & 32) != 0 ? null : nonNdFormInfo, (i12 & 64) != 0 ? null : attributedText, (i12 & 128) != 0 ? null : attributedText2, (i12 & 256) != 0 ? null : formInput, (i12 & 512) != 0 ? null : str4, (i12 & 1024) != 0 ? null : str5, (i12 & 2048) == 0 ? str6 : null);
    }
}
