package com.avito.android.remote.model.advert_details.realty;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DevelopmentsAdvice.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b!\u0010\u001eJx\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b,\u0010&J \u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b1\u00102R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b6\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b@\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\bA\u0010\u001e¨\u0006B"}, d2 = {"Lcom/avito/android/remote/model/advert_details/realty/DevelopmentsAdviceView;", "Landroid/os/Parcelable;", "", "title", "description", "buttonTitle", "", "buttonStyle", "Lcom/avito/android/remote/model/advert_details/realty/ContactBarButtonData;", "contactBarButton", "Lcom/avito/android/remote/model/advert_details/realty/LandingInfo;", "mainTextLink", "Lcom/avito/android/deep_linking/links/DeepLink;", "buttonUri", "Lcom/avito/android/remote/model/advert_details/realty/IncomingLineButton;", "incomingLineButton", "entryPointShowEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/advert_details/realty/ContactBarButtonData;Lcom/avito/android/remote/model/advert_details/realty/LandingInfo;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/advert_details/realty/IncomingLineButton;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "()Lcom/avito/android/remote/model/advert_details/realty/ContactBarButtonData;", "component6", "()Lcom/avito/android/remote/model/advert_details/realty/LandingInfo;", "component7", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component8", "()Lcom/avito/android/remote/model/advert_details/realty/IncomingLineButton;", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/advert_details/realty/ContactBarButtonData;Lcom/avito/android/remote/model/advert_details/realty/LandingInfo;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/advert_details/realty/IncomingLineButton;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/advert_details/realty/DevelopmentsAdviceView;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "getButtonTitle", "Ljava/lang/Integer;", "getButtonStyle", "Lcom/avito/android/remote/model/advert_details/realty/ContactBarButtonData;", "getContactBarButton", "Lcom/avito/android/remote/model/advert_details/realty/LandingInfo;", "getMainTextLink", "Lcom/avito/android/deep_linking/links/DeepLink;", "getButtonUri", "Lcom/avito/android/remote/model/advert_details/realty/IncomingLineButton;", "getIncomingLineButton", "getEntryPointShowEvent", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DevelopmentsAdviceView implements Parcelable {

    @k
    public static final Parcelable.Creator<DevelopmentsAdviceView> CREATOR = new Creator();

    @c("buttonStyle")
    @l
    private final Integer buttonStyle;

    @c("buttonTitle")
    @k
    private final String buttonTitle;

    @c("buttonUri")
    @l
    private final DeepLink buttonUri;

    @c("contactBarButton")
    @l
    private final ContactBarButtonData contactBarButton;

    @c("description")
    @k
    private final String description;

    @c("entryPointShowEvent")
    @l
    private final DeepLink entryPointShowEvent;

    @c("incomingLineButton")
    @l
    private final IncomingLineButton incomingLineButton;

    @c("mainTextLink")
    @l
    private final LandingInfo mainTextLink;

    @c("title")
    @l
    private final String title;

    /* compiled from: DevelopmentsAdvice.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DevelopmentsAdviceView> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DevelopmentsAdviceView createFromParcel(@k Parcel parcel) {
            return new DevelopmentsAdviceView(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : ContactBarButtonData.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LandingInfo.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(DevelopmentsAdviceView.class.getClassLoader()), parcel.readInt() != 0 ? IncomingLineButton.CREATOR.createFromParcel(parcel) : null, (DeepLink) parcel.readParcelable(DevelopmentsAdviceView.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DevelopmentsAdviceView[] newArray(int i12) {
            return new DevelopmentsAdviceView[i12];
        }
    }

    public DevelopmentsAdviceView(@l String str, @k String str2, @k String str3, @l Integer num, @l ContactBarButtonData contactBarButtonData, @l LandingInfo landingInfo, @l DeepLink deepLink, @l IncomingLineButton incomingLineButton, @l DeepLink deepLink2) {
        this.title = str;
        this.description = str2;
        this.buttonTitle = str3;
        this.buttonStyle = num;
        this.contactBarButton = contactBarButtonData;
        this.mainTextLink = landingInfo;
        this.buttonUri = deepLink;
        this.incomingLineButton = incomingLineButton;
        this.entryPointShowEvent = deepLink2;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Integer getButtonStyle() {
        return this.buttonStyle;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final ContactBarButtonData getContactBarButton() {
        return this.contactBarButton;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final LandingInfo getMainTextLink() {
        return this.mainTextLink;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final DeepLink getButtonUri() {
        return this.buttonUri;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final IncomingLineButton getIncomingLineButton() {
        return this.incomingLineButton;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final DeepLink getEntryPointShowEvent() {
        return this.entryPointShowEvent;
    }

    @k
    public final DevelopmentsAdviceView copy(@l String title, @k String description, @k String buttonTitle, @l Integer buttonStyle, @l ContactBarButtonData contactBarButton, @l LandingInfo mainTextLink, @l DeepLink buttonUri, @l IncomingLineButton incomingLineButton, @l DeepLink entryPointShowEvent) {
        return new DevelopmentsAdviceView(title, description, buttonTitle, buttonStyle, contactBarButton, mainTextLink, buttonUri, incomingLineButton, entryPointShowEvent);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevelopmentsAdviceView)) {
            return false;
        }
        DevelopmentsAdviceView developmentsAdviceView = (DevelopmentsAdviceView) other;
        return L.f(this.title, developmentsAdviceView.title) && L.f(this.description, developmentsAdviceView.description) && L.f(this.buttonTitle, developmentsAdviceView.buttonTitle) && L.f(this.buttonStyle, developmentsAdviceView.buttonStyle) && L.f(this.contactBarButton, developmentsAdviceView.contactBarButton) && L.f(this.mainTextLink, developmentsAdviceView.mainTextLink) && L.f(this.buttonUri, developmentsAdviceView.buttonUri) && L.f(this.incomingLineButton, developmentsAdviceView.incomingLineButton) && L.f(this.entryPointShowEvent, developmentsAdviceView.entryPointShowEvent);
    }

    @l
    public final Integer getButtonStyle() {
        return this.buttonStyle;
    }

    @k
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @l
    public final DeepLink getButtonUri() {
        return this.buttonUri;
    }

    @l
    public final ContactBarButtonData getContactBarButton() {
        return this.contactBarButton;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @l
    public final DeepLink getEntryPointShowEvent() {
        return this.entryPointShowEvent;
    }

    @l
    public final IncomingLineButton getIncomingLineButton() {
        return this.incomingLineButton;
    }

    @l
    public final LandingInfo getMainTextLink() {
        return this.mainTextLink;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iD2 = H.d(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.description), 31, this.buttonTitle);
        Integer num = this.buttonStyle;
        int iHashCode = (iD2 + (num == null ? 0 : num.hashCode())) * 31;
        ContactBarButtonData contactBarButtonData = this.contactBarButton;
        int iHashCode2 = (iHashCode + (contactBarButtonData == null ? 0 : contactBarButtonData.hashCode())) * 31;
        LandingInfo landingInfo = this.mainTextLink;
        int iHashCode3 = (iHashCode2 + (landingInfo == null ? 0 : landingInfo.hashCode())) * 31;
        DeepLink deepLink = this.buttonUri;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        IncomingLineButton incomingLineButton = this.incomingLineButton;
        int iHashCode5 = (iHashCode4 + (incomingLineButton == null ? 0 : incomingLineButton.hashCode())) * 31;
        DeepLink deepLink2 = this.entryPointShowEvent;
        return iHashCode5 + (deepLink2 != null ? deepLink2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DevelopmentsAdviceView(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", buttonTitle=");
        sb2.append(this.buttonTitle);
        sb2.append(", buttonStyle=");
        sb2.append(this.buttonStyle);
        sb2.append(", contactBarButton=");
        sb2.append(this.contactBarButton);
        sb2.append(", mainTextLink=");
        sb2.append(this.mainTextLink);
        sb2.append(", buttonUri=");
        sb2.append(this.buttonUri);
        sb2.append(", incomingLineButton=");
        sb2.append(this.incomingLineButton);
        sb2.append(", entryPointShowEvent=");
        return a.v(sb2, this.entryPointShowEvent, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.buttonTitle);
        Integer num = this.buttonStyle;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        ContactBarButtonData contactBarButtonData = this.contactBarButton;
        if (contactBarButtonData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contactBarButtonData.writeToParcel(parcel, flags);
        }
        LandingInfo landingInfo = this.mainTextLink;
        if (landingInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            landingInfo.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.buttonUri, flags);
        IncomingLineButton incomingLineButton = this.incomingLineButton;
        if (incomingLineButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            incomingLineButton.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.entryPointShowEvent, flags);
    }

    public /* synthetic */ DevelopmentsAdviceView(String str, String str2, String str3, Integer num, ContactBarButtonData contactBarButtonData, LandingInfo landingInfo, DeepLink deepLink, IncomingLineButton incomingLineButton, DeepLink deepLink2, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : num, (i12 & 16) != 0 ? null : contactBarButtonData, (i12 & 32) != 0 ? null : landingInfo, (i12 & 64) != 0 ? null : deepLink, (i12 & 128) != 0 ? null : incomingLineButton, (i12 & 256) != 0 ? null : deepLink2);
    }
}
