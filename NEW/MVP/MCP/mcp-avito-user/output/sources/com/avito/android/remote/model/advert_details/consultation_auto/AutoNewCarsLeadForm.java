package com.avito.android.remote.model.advert_details.consultation_auto;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoNewCarsLeadForm.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u000eR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0015¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/advert_details/consultation_auto/AutoNewCarsLeadForm;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/remote/model/UniversalImage;", "icon", "callToActionText", "submitButtonText", "Lcom/avito/android/remote/model/text/AttributedText;", "userAgreement", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/UniversalImage;", "component4", "component5", "component6", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/advert_details/consultation_auto/AutoNewCarsLeadForm;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/UniversalImage;", "getIcon", "getCallToActionText", "getSubmitButtonText", "Lcom/avito/android/remote/model/text/AttributedText;", "getUserAgreement", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutoNewCarsLeadForm implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoNewCarsLeadForm> CREATOR = new Creator();

    @c("callToActionText")
    @k
    private final String callToActionText;

    @c("image")
    @k
    private final UniversalImage icon;

    @c("submitButtonText")
    @k
    private final String submitButtonText;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    @c("userAgreement")
    @k
    private final AttributedText userAgreement;

    /* compiled from: AutoNewCarsLeadForm.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoNewCarsLeadForm> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoNewCarsLeadForm createFromParcel(@k Parcel parcel) {
            return new AutoNewCarsLeadForm(parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(AutoNewCarsLeadForm.class.getClassLoader()), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(AutoNewCarsLeadForm.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutoNewCarsLeadForm[] newArray(int i12) {
            return new AutoNewCarsLeadForm[i12];
        }
    }

    public AutoNewCarsLeadForm(@k String str, @k String str2, @k UniversalImage universalImage, @k String str3, @k String str4, @k AttributedText attributedText) {
        this.title = str;
        this.subtitle = str2;
        this.icon = universalImage;
        this.callToActionText = str3;
        this.submitButtonText = str4;
        this.userAgreement = attributedText;
    }

    public static /* synthetic */ AutoNewCarsLeadForm copy$default(AutoNewCarsLeadForm autoNewCarsLeadForm, String str, String str2, UniversalImage universalImage, String str3, String str4, AttributedText attributedText, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = autoNewCarsLeadForm.title;
        }
        if ((i12 & 2) != 0) {
            str2 = autoNewCarsLeadForm.subtitle;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            universalImage = autoNewCarsLeadForm.icon;
        }
        UniversalImage universalImage2 = universalImage;
        if ((i12 & 8) != 0) {
            str3 = autoNewCarsLeadForm.callToActionText;
        }
        String str6 = str3;
        if ((i12 & 16) != 0) {
            str4 = autoNewCarsLeadForm.submitButtonText;
        }
        String str7 = str4;
        if ((i12 & 32) != 0) {
            attributedText = autoNewCarsLeadForm.userAgreement;
        }
        return autoNewCarsLeadForm.copy(str, str5, universalImage2, str6, str7, attributedText);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final UniversalImage getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getCallToActionText() {
        return this.callToActionText;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getSubmitButtonText() {
        return this.submitButtonText;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final AttributedText getUserAgreement() {
        return this.userAgreement;
    }

    @k
    public final AutoNewCarsLeadForm copy(@k String title, @k String subtitle, @k UniversalImage icon, @k String callToActionText, @k String submitButtonText, @k AttributedText userAgreement) {
        return new AutoNewCarsLeadForm(title, subtitle, icon, callToActionText, submitButtonText, userAgreement);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoNewCarsLeadForm)) {
            return false;
        }
        AutoNewCarsLeadForm autoNewCarsLeadForm = (AutoNewCarsLeadForm) other;
        return L.f(this.title, autoNewCarsLeadForm.title) && L.f(this.subtitle, autoNewCarsLeadForm.subtitle) && L.f(this.icon, autoNewCarsLeadForm.icon) && L.f(this.callToActionText, autoNewCarsLeadForm.callToActionText) && L.f(this.submitButtonText, autoNewCarsLeadForm.submitButtonText) && L.f(this.userAgreement, autoNewCarsLeadForm.userAgreement);
    }

    @k
    public final String getCallToActionText() {
        return this.callToActionText;
    }

    @k
    public final UniversalImage getIcon() {
        return this.icon;
    }

    @k
    public final String getSubmitButtonText() {
        return this.submitButtonText;
    }

    @k
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final AttributedText getUserAgreement() {
        return this.userAgreement;
    }

    public int hashCode() {
        return this.userAgreement.hashCode() + H.d(H.d(a.a(H.d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.icon), 31, this.callToActionText), 31, this.submitButtonText);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AutoNewCarsLeadForm(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", callToActionText=");
        sb2.append(this.callToActionText);
        sb2.append(", submitButtonText=");
        sb2.append(this.submitButtonText);
        sb2.append(", userAgreement=");
        return a.w(sb2, this.userAgreement, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.icon, flags);
        parcel.writeString(this.callToActionText);
        parcel.writeString(this.submitButtonText);
        parcel.writeParcelable(this.userAgreement, flags);
    }
}
