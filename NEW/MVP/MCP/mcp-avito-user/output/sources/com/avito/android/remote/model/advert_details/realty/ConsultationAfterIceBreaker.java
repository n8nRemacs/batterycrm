package com.avito.android.remote.model.advert_details.realty;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.ButtonAction;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u008e\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b&\u0010\u001dJ\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020'HÖ\u0001¢\u0006\u0004\b/\u0010)J \u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020'HÖ\u0001¢\u0006\u0004\b4\u00105R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b@\u0010\u001dR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\bC\u0010\u001dR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\bD\u0010\u001dR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\bE\u0010\u001d¨\u0006F"}, d2 = {"Lcom/avito/android/remote/model/advert_details/realty/ConsultationAfterIceBreaker;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/advert_details/realty/SuperFormInfo;", RequestReviewResultKt.INFO_TYPE, "infoV2", "infoV3", "Lcom/avito/android/remote/model/advert_details/realty/SuperFormV4;", "infoV4", "Lcom/avito/android/remote/model/ButtonAction;", "button", "", "title", "description", "Lcom/avito/android/remote/model/text/AttributedText;", ServiceTransportationWidget.DisclaimerField.TYPE, "requestType", "formPage", "nodeType", "<init>", "(Lcom/avito/android/remote/model/advert_details/realty/SuperFormInfo;Lcom/avito/android/remote/model/advert_details/realty/SuperFormInfo;Lcom/avito/android/remote/model/advert_details/realty/SuperFormInfo;Lcom/avito/android/remote/model/advert_details/realty/SuperFormV4;Lcom/avito/android/remote/model/ButtonAction;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/advert_details/realty/SuperFormInfo;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/advert_details/realty/SuperFormV4;", "component5", "()Lcom/avito/android/remote/model/ButtonAction;", "component6", "()Ljava/lang/String;", "component7", "component8", "()Lcom/avito/android/remote/model/text/AttributedText;", "component9", "component10", "component11", "copy", "(Lcom/avito/android/remote/model/advert_details/realty/SuperFormInfo;Lcom/avito/android/remote/model/advert_details/realty/SuperFormInfo;Lcom/avito/android/remote/model/advert_details/realty/SuperFormInfo;Lcom/avito/android/remote/model/advert_details/realty/SuperFormV4;Lcom/avito/android/remote/model/ButtonAction;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/advert_details/realty/ConsultationAfterIceBreaker;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/advert_details/realty/SuperFormInfo;", "getInfo", "getInfoV2", "getInfoV3", "Lcom/avito/android/remote/model/advert_details/realty/SuperFormV4;", "getInfoV4", "Lcom/avito/android/remote/model/ButtonAction;", "getButton", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/avito/android/remote/model/text/AttributedText;", "getDisclaimer", "getRequestType", "getFormPage", "getNodeType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ConsultationAfterIceBreaker implements Parcelable {

    @k
    public static final Parcelable.Creator<ConsultationAfterIceBreaker> CREATOR = new Creator();

    @c("button")
    @k
    private final ButtonAction button;

    @c("description")
    @l
    private final String description;

    @c(ServiceTransportationWidget.DisclaimerField.TYPE)
    @k
    private final AttributedText disclaimer;

    @c("from_page")
    @l
    private final String formPage;

    @c(RequestReviewResultKt.INFO_TYPE)
    @l
    private final SuperFormInfo info;

    @c("infoV2")
    @l
    private final SuperFormInfo infoV2;

    @c("infoV3")
    @l
    private final SuperFormInfo infoV3;

    @c("infoV4")
    @l
    private final SuperFormV4 infoV4;

    @c("nodeType")
    @l
    private final String nodeType;

    @c("requestType")
    @l
    private final String requestType;

    @c("title")
    @k
    private final String title;

    /* compiled from: DevelopmentsAdvice.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ConsultationAfterIceBreaker> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ConsultationAfterIceBreaker createFromParcel(@k Parcel parcel) {
            return new ConsultationAfterIceBreaker(parcel.readInt() == 0 ? null : SuperFormInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperFormInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SuperFormInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SuperFormV4.CREATOR.createFromParcel(parcel) : null, ButtonAction.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(ConsultationAfterIceBreaker.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ConsultationAfterIceBreaker[] newArray(int i12) {
            return new ConsultationAfterIceBreaker[i12];
        }
    }

    public ConsultationAfterIceBreaker(@l SuperFormInfo superFormInfo, @l SuperFormInfo superFormInfo2, @l SuperFormInfo superFormInfo3, @l SuperFormV4 superFormV4, @k ButtonAction buttonAction, @k String str, @l String str2, @k AttributedText attributedText, @l String str3, @l String str4, @l String str5) {
        this.info = superFormInfo;
        this.infoV2 = superFormInfo2;
        this.infoV3 = superFormInfo3;
        this.infoV4 = superFormV4;
        this.button = buttonAction;
        this.title = str;
        this.description = str2;
        this.disclaimer = attributedText;
        this.requestType = str3;
        this.formPage = str4;
        this.nodeType = str5;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final SuperFormInfo getInfo() {
        return this.info;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final String getFormPage() {
        return this.formPage;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String getNodeType() {
        return this.nodeType;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final SuperFormInfo getInfoV2() {
        return this.infoV2;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final SuperFormInfo getInfoV3() {
        return this.infoV3;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final SuperFormV4 getInfoV4() {
        return this.infoV4;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component8, reason: from getter */
    public final AttributedText getDisclaimer() {
        return this.disclaimer;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getRequestType() {
        return this.requestType;
    }

    @k
    public final ConsultationAfterIceBreaker copy(@l SuperFormInfo info, @l SuperFormInfo infoV2, @l SuperFormInfo infoV3, @l SuperFormV4 infoV4, @k ButtonAction button, @k String title, @l String description, @k AttributedText disclaimer, @l String requestType, @l String formPage, @l String nodeType) {
        return new ConsultationAfterIceBreaker(info, infoV2, infoV3, infoV4, button, title, description, disclaimer, requestType, formPage, nodeType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsultationAfterIceBreaker)) {
            return false;
        }
        ConsultationAfterIceBreaker consultationAfterIceBreaker = (ConsultationAfterIceBreaker) other;
        return L.f(this.info, consultationAfterIceBreaker.info) && L.f(this.infoV2, consultationAfterIceBreaker.infoV2) && L.f(this.infoV3, consultationAfterIceBreaker.infoV3) && L.f(this.infoV4, consultationAfterIceBreaker.infoV4) && L.f(this.button, consultationAfterIceBreaker.button) && L.f(this.title, consultationAfterIceBreaker.title) && L.f(this.description, consultationAfterIceBreaker.description) && L.f(this.disclaimer, consultationAfterIceBreaker.disclaimer) && L.f(this.requestType, consultationAfterIceBreaker.requestType) && L.f(this.formPage, consultationAfterIceBreaker.formPage) && L.f(this.nodeType, consultationAfterIceBreaker.nodeType);
    }

    @k
    public final ButtonAction getButton() {
        return this.button;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @k
    public final AttributedText getDisclaimer() {
        return this.disclaimer;
    }

    @l
    public final String getFormPage() {
        return this.formPage;
    }

    @l
    public final SuperFormInfo getInfo() {
        return this.info;
    }

    @l
    public final SuperFormInfo getInfoV2() {
        return this.infoV2;
    }

    @l
    public final SuperFormInfo getInfoV3() {
        return this.infoV3;
    }

    @l
    public final SuperFormV4 getInfoV4() {
        return this.infoV4;
    }

    @l
    public final String getNodeType() {
        return this.nodeType;
    }

    @l
    public final String getRequestType() {
        return this.requestType;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        SuperFormInfo superFormInfo = this.info;
        int iHashCode = (superFormInfo == null ? 0 : superFormInfo.hashCode()) * 31;
        SuperFormInfo superFormInfo2 = this.infoV2;
        int iHashCode2 = (iHashCode + (superFormInfo2 == null ? 0 : superFormInfo2.hashCode())) * 31;
        SuperFormInfo superFormInfo3 = this.infoV3;
        int iHashCode3 = (iHashCode2 + (superFormInfo3 == null ? 0 : superFormInfo3.hashCode())) * 31;
        SuperFormV4 superFormV4 = this.infoV4;
        int iD2 = H.d((this.button.hashCode() + ((iHashCode3 + (superFormV4 == null ? 0 : superFormV4.hashCode())) * 31)) * 31, 31, this.title);
        String str = this.description;
        int iB2 = a.b((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.disclaimer);
        String str2 = this.requestType;
        int iHashCode4 = (iB2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.formPage;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nodeType;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConsultationAfterIceBreaker(info=");
        sb2.append(this.info);
        sb2.append(", infoV2=");
        sb2.append(this.infoV2);
        sb2.append(", infoV3=");
        sb2.append(this.infoV3);
        sb2.append(", infoV4=");
        sb2.append(this.infoV4);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", disclaimer=");
        sb2.append(this.disclaimer);
        sb2.append(", requestType=");
        sb2.append(this.requestType);
        sb2.append(", formPage=");
        sb2.append(this.formPage);
        sb2.append(", nodeType=");
        return C22026a.c(sb2, this.nodeType, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        SuperFormInfo superFormInfo = this.info;
        if (superFormInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superFormInfo.writeToParcel(parcel, flags);
        }
        SuperFormInfo superFormInfo2 = this.infoV2;
        if (superFormInfo2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superFormInfo2.writeToParcel(parcel, flags);
        }
        SuperFormInfo superFormInfo3 = this.infoV3;
        if (superFormInfo3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superFormInfo3.writeToParcel(parcel, flags);
        }
        SuperFormV4 superFormV4 = this.infoV4;
        if (superFormV4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superFormV4.writeToParcel(parcel, flags);
        }
        this.button.writeToParcel(parcel, flags);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.disclaimer, flags);
        parcel.writeString(this.requestType);
        parcel.writeString(this.formPage);
        parcel.writeString(this.nodeType);
    }

    public /* synthetic */ ConsultationAfterIceBreaker(SuperFormInfo superFormInfo, SuperFormInfo superFormInfo2, SuperFormInfo superFormInfo3, SuperFormV4 superFormV4, ButtonAction buttonAction, String str, String str2, AttributedText attributedText, String str3, String str4, String str5, int i12, C42822w c42822w) {
        this(superFormInfo, superFormInfo2, superFormInfo3, superFormV4, buttonAction, str, (i12 & 64) != 0 ? null : str2, attributedText, (i12 & 256) != 0 ? null : str3, (i12 & 512) != 0 ? null : str4, (i12 & 1024) != 0 ? null : str5);
    }
}
