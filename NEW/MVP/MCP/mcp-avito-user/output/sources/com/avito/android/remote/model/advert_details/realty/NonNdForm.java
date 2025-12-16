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
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0018J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0018J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u0018J \u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u0018J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020-HÖ\u0001¢\u0006\u0004\b5\u0010/J \u0010:\u001a\u0002092\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020-HÖ\u0001¢\u0006\u0004\b:\u0010;R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b>\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b?\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\bG\u0010\"R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bI\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\bK\u0010&R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\bL\u0010\u0018R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010<\u001a\u0004\bM\u0010\u0018R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010<\u001a\u0004\bN\u0010\u0018¨\u0006O"}, d2 = {"Lcom/avito/android/remote/model/advert_details/realty/NonNdForm;", "Landroid/os/Parcelable;", "", "title", "description", "formTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "entryPointShowEvent", "Lcom/avito/android/remote/model/advert_details/realty/ConsultationButton;", "button", "Lcom/avito/android/remote/model/advert_details/realty/NonNdFormInfo;", RequestReviewResultKt.INFO_TYPE, "Lcom/avito/android/remote/model/text/AttributedText;", ServiceTransportationWidget.DisclaimerField.TYPE, "Lcom/avito/android/remote/model/advert_details/realty/Landing;", "landing", "Lcom/avito/android/remote/model/FormInput;", "questionInput", "requestType", "formPage", "nodeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/advert_details/realty/ConsultationButton;Lcom/avito/android/remote/model/advert_details/realty/NonNdFormInfo;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/advert_details/realty/Landing;Lcom/avito/android/remote/model/FormInput;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component5", "()Lcom/avito/android/remote/model/advert_details/realty/ConsultationButton;", "component6", "()Lcom/avito/android/remote/model/advert_details/realty/NonNdFormInfo;", "component7", "()Lcom/avito/android/remote/model/text/AttributedText;", "component8", "()Lcom/avito/android/remote/model/advert_details/realty/Landing;", "component9", "()Lcom/avito/android/remote/model/FormInput;", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/advert_details/realty/ConsultationButton;Lcom/avito/android/remote/model/advert_details/realty/NonNdFormInfo;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/advert_details/realty/Landing;Lcom/avito/android/remote/model/FormInput;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/advert_details/realty/NonNdForm;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "getFormTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getEntryPointShowEvent", "Lcom/avito/android/remote/model/advert_details/realty/ConsultationButton;", "getButton", "Lcom/avito/android/remote/model/advert_details/realty/NonNdFormInfo;", "getInfo", "Lcom/avito/android/remote/model/text/AttributedText;", "getDisclaimer", "Lcom/avito/android/remote/model/advert_details/realty/Landing;", "getLanding", "Lcom/avito/android/remote/model/FormInput;", "getQuestionInput", "getRequestType", "getFormPage", "getNodeType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NonNdForm implements Parcelable {

    @k
    public static final Parcelable.Creator<NonNdForm> CREATOR = new Creator();

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
    private final Landing landing;

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
    public static final class Creator implements Parcelable.Creator<NonNdForm> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NonNdForm createFromParcel(@k Parcel parcel) {
            return new NonNdForm(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(NonNdForm.class.getClassLoader()), parcel.readInt() == 0 ? null : ConsultationButton.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : NonNdFormInfo.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(NonNdForm.class.getClassLoader()), parcel.readInt() == 0 ? null : Landing.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? FormInput.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NonNdForm[] newArray(int i12) {
            return new NonNdForm[i12];
        }
    }

    public NonNdForm() {
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
    public final Landing getLanding() {
        return this.landing;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final FormInput getQuestionInput() {
        return this.questionInput;
    }

    @k
    public final NonNdForm copy(@l String title, @l String description, @l String formTitle, @l DeepLink entryPointShowEvent, @l ConsultationButton button, @l NonNdFormInfo info, @l AttributedText disclaimer, @l Landing landing, @l FormInput questionInput, @l String requestType, @l String formPage, @l String nodeType) {
        return new NonNdForm(title, description, formTitle, entryPointShowEvent, button, info, disclaimer, landing, questionInput, requestType, formPage, nodeType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NonNdForm)) {
            return false;
        }
        NonNdForm nonNdForm = (NonNdForm) other;
        return L.f(this.title, nonNdForm.title) && L.f(this.description, nonNdForm.description) && L.f(this.formTitle, nonNdForm.formTitle) && L.f(this.entryPointShowEvent, nonNdForm.entryPointShowEvent) && L.f(this.button, nonNdForm.button) && L.f(this.info, nonNdForm.info) && L.f(this.disclaimer, nonNdForm.disclaimer) && L.f(this.landing, nonNdForm.landing) && L.f(this.questionInput, nonNdForm.questionInput) && L.f(this.requestType, nonNdForm.requestType) && L.f(this.formPage, nonNdForm.formPage) && L.f(this.nodeType, nonNdForm.nodeType);
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
    public final Landing getLanding() {
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
        Landing landing = this.landing;
        int iHashCode8 = (iHashCode7 + (landing == null ? 0 : landing.hashCode())) * 31;
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
        StringBuilder sb2 = new StringBuilder("NonNdForm(title=");
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
        Landing landing = this.landing;
        if (landing == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            landing.writeToParcel(parcel, flags);
        }
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

    public NonNdForm(@l String str, @l String str2, @l String str3, @l DeepLink deepLink, @l ConsultationButton consultationButton, @l NonNdFormInfo nonNdFormInfo, @l AttributedText attributedText, @l Landing landing, @l FormInput formInput, @l String str4, @l String str5, @l String str6) {
        this.title = str;
        this.description = str2;
        this.formTitle = str3;
        this.entryPointShowEvent = deepLink;
        this.button = consultationButton;
        this.info = nonNdFormInfo;
        this.disclaimer = attributedText;
        this.landing = landing;
        this.questionInput = formInput;
        this.requestType = str4;
        this.formPage = str5;
        this.nodeType = str6;
    }

    public /* synthetic */ NonNdForm(String str, String str2, String str3, DeepLink deepLink, ConsultationButton consultationButton, NonNdFormInfo nonNdFormInfo, AttributedText attributedText, Landing landing, FormInput formInput, String str4, String str5, String str6, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : deepLink, (i12 & 16) != 0 ? null : consultationButton, (i12 & 32) != 0 ? null : nonNdFormInfo, (i12 & 64) != 0 ? null : attributedText, (i12 & 128) != 0 ? null : landing, (i12 & 256) != 0 ? null : formInput, (i12 & 512) != 0 ? null : str4, (i12 & 1024) != 0 ? null : str5, (i12 & 2048) == 0 ? str6 : null);
    }
}
