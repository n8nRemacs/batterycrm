package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConsultationFormData.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b*\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b+\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b,\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b-\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/avito/android/remote/model/ConsultationFormData;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedSubtitle", "Lcom/avito/android/remote/model/FormInput;", "nameInput", "phoneInput", "questionInput", "policy", "buttonTitle", "Lcom/avito/android/remote/model/SuccessAction;", "successAction", "Lcom/avito/android/remote/model/FormCategory;", "category", "Lcom/avito/android/remote/model/AnalyticsData;", "analyticsData", "Lcom/avito/android/remote/model/LandingInfo;", "landing", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/FormInput;Lcom/avito/android/remote/model/FormInput;Lcom/avito/android/remote/model/FormInput;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/SuccessAction;Lcom/avito/android/remote/model/FormCategory;Lcom/avito/android/remote/model/AnalyticsData;Lcom/avito/android/remote/model/LandingInfo;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/FormInput;", "getNameInput", "()Lcom/avito/android/remote/model/FormInput;", "getPhoneInput", "getQuestionInput", "getPolicy", "getButtonTitle", "Lcom/avito/android/remote/model/SuccessAction;", "getSuccessAction", "()Lcom/avito/android/remote/model/SuccessAction;", "Lcom/avito/android/remote/model/FormCategory;", "getCategory", "()Lcom/avito/android/remote/model/FormCategory;", "Lcom/avito/android/remote/model/AnalyticsData;", "getAnalyticsData", "()Lcom/avito/android/remote/model/AnalyticsData;", "Lcom/avito/android/remote/model/LandingInfo;", "getLanding", "()Lcom/avito/android/remote/model/LandingInfo;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConsultationFormData implements Parcelable {

    @k
    public static final Parcelable.Creator<ConsultationFormData> CREATOR = new Creator();

    @l
    private final AnalyticsData analyticsData;

    @l
    private final AttributedText attributedSubtitle;

    @l
    private final String buttonTitle;

    @l
    private final FormCategory category;

    @l
    private final LandingInfo landing;

    @l
    private final FormInput nameInput;

    @l
    private final FormInput phoneInput;

    @l
    private final AttributedText policy;

    @l
    private final FormInput questionInput;

    @l
    private final String subtitle;

    @l
    private final SuccessAction successAction;

    @l
    private final String title;

    /* compiled from: ConsultationFormData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConsultationFormData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ConsultationFormData createFromParcel(@k Parcel parcel) {
            return new ConsultationFormData(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(ConsultationFormData.class.getClassLoader()), parcel.readInt() == 0 ? null : FormInput.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FormInput.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FormInput.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(ConsultationFormData.class.getClassLoader()), parcel.readString(), (SuccessAction) parcel.readParcelable(ConsultationFormData.class.getClassLoader()), parcel.readInt() == 0 ? null : FormCategory.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : AnalyticsData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LandingInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ConsultationFormData[] newArray(int i12) {
            return new ConsultationFormData[i12];
        }
    }

    public ConsultationFormData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final AnalyticsData getAnalyticsData() {
        return this.analyticsData;
    }

    @l
    public final AttributedText getAttributedSubtitle() {
        return this.attributedSubtitle;
    }

    @l
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @l
    public final FormCategory getCategory() {
        return this.category;
    }

    @l
    public final LandingInfo getLanding() {
        return this.landing;
    }

    @l
    public final FormInput getNameInput() {
        return this.nameInput;
    }

    @l
    public final FormInput getPhoneInput() {
        return this.phoneInput;
    }

    @l
    public final AttributedText getPolicy() {
        return this.policy;
    }

    @l
    public final FormInput getQuestionInput() {
        return this.questionInput;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final SuccessAction getSuccessAction() {
        return this.successAction;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.attributedSubtitle, flags);
        FormInput formInput = this.nameInput;
        if (formInput == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formInput.writeToParcel(parcel, flags);
        }
        FormInput formInput2 = this.phoneInput;
        if (formInput2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formInput2.writeToParcel(parcel, flags);
        }
        FormInput formInput3 = this.questionInput;
        if (formInput3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formInput3.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.policy, flags);
        parcel.writeString(this.buttonTitle);
        parcel.writeParcelable(this.successAction, flags);
        FormCategory formCategory = this.category;
        if (formCategory == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(formCategory.name());
        }
        AnalyticsData analyticsData = this.analyticsData;
        if (analyticsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analyticsData.writeToParcel(parcel, flags);
        }
        LandingInfo landingInfo = this.landing;
        if (landingInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            landingInfo.writeToParcel(parcel, flags);
        }
    }

    public ConsultationFormData(@l String str, @l String str2, @l AttributedText attributedText, @l FormInput formInput, @l FormInput formInput2, @l FormInput formInput3, @l AttributedText attributedText2, @l String str3, @l SuccessAction successAction, @l FormCategory formCategory, @l AnalyticsData analyticsData, @l LandingInfo landingInfo) {
        this.title = str;
        this.subtitle = str2;
        this.attributedSubtitle = attributedText;
        this.nameInput = formInput;
        this.phoneInput = formInput2;
        this.questionInput = formInput3;
        this.policy = attributedText2;
        this.buttonTitle = str3;
        this.successAction = successAction;
        this.category = formCategory;
        this.analyticsData = analyticsData;
        this.landing = landingInfo;
    }

    public /* synthetic */ ConsultationFormData(String str, String str2, AttributedText attributedText, FormInput formInput, FormInput formInput2, FormInput formInput3, AttributedText attributedText2, String str3, SuccessAction successAction, FormCategory formCategory, AnalyticsData analyticsData, LandingInfo landingInfo, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : attributedText, (i12 & 8) != 0 ? null : formInput, (i12 & 16) != 0 ? null : formInput2, (i12 & 32) != 0 ? null : formInput3, (i12 & 64) != 0 ? null : attributedText2, (i12 & 128) != 0 ? null : str3, (i12 & 256) != 0 ? null : successAction, (i12 & 512) != 0 ? null : formCategory, (i12 & 1024) != 0 ? null : analyticsData, (i12 & 2048) == 0 ? landingInfo : null);
    }
}
