package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhoneResponse.kt */
@d
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BC\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJX\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020#HÖ\u0001¢\u0006\u0004\b+\u0010%J \u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020#HÖ\u0001¢\u0006\u0004\b0\u00101R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010\u001d¨\u0006>"}, d2 = {"Lcom/avito/android/remote/model/SuccessPhoneResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/PhoneResponse;", "Lcom/avito/android/remote/model/NotificationToastResponse;", "Lcom/avito/android/remote/model/NotificationToast;", "notificationToast", "Lcom/avito/android/remote/model/Action;", "action", "Lcom/avito/android/remote/model/AnonymousPhoneNumberResponse;", "anonymousNumberModal", "Lcom/avito/android/deep_linking/links/DeepLink;", "redirectUri", "Lcom/avito/android/remote/model/IacPhoneResponse;", "iac", "Lcom/avito/android/remote/model/SellerSurveyResponse;", "showSurveyAfterCall", "<init>", "(Lcom/avito/android/remote/model/NotificationToast;Lcom/avito/android/remote/model/Action;Lcom/avito/android/remote/model/AnonymousPhoneNumberResponse;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/IacPhoneResponse;Lcom/avito/android/remote/model/SellerSurveyResponse;)V", "component1", "()Lcom/avito/android/remote/model/NotificationToast;", "component2", "()Lcom/avito/android/remote/model/Action;", "component3", "()Lcom/avito/android/remote/model/AnonymousPhoneNumberResponse;", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component5", "()Lcom/avito/android/remote/model/IacPhoneResponse;", "component6", "()Lcom/avito/android/remote/model/SellerSurveyResponse;", "copy", "(Lcom/avito/android/remote/model/NotificationToast;Lcom/avito/android/remote/model/Action;Lcom/avito/android/remote/model/AnonymousPhoneNumberResponse;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/IacPhoneResponse;Lcom/avito/android/remote/model/SellerSurveyResponse;)Lcom/avito/android/remote/model/SuccessPhoneResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/NotificationToast;", "getNotificationToast", "Lcom/avito/android/remote/model/Action;", "getAction", "Lcom/avito/android/remote/model/AnonymousPhoneNumberResponse;", "getAnonymousNumberModal", "Lcom/avito/android/deep_linking/links/DeepLink;", "getRedirectUri", "Lcom/avito/android/remote/model/IacPhoneResponse;", "getIac", "Lcom/avito/android/remote/model/SellerSurveyResponse;", "getShowSurveyAfterCall", "_avito-discouraged_avito-api_async-phone"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SuccessPhoneResponse extends PhoneResponse implements Parcelable, NotificationToastResponse {

    @k
    public static final Parcelable.Creator<SuccessPhoneResponse> CREATOR = new Creator();

    @c("action")
    @l
    private final Action action;

    @c("anonymousNumberModal")
    @l
    private final AnonymousPhoneNumberResponse anonymousNumberModal;

    @c("iac")
    @l
    private final IacPhoneResponse iac;

    @c("notificationToast")
    @l
    private final NotificationToast notificationToast;

    @c("redirectUri")
    @l
    private final DeepLink redirectUri;

    @c("showSurveyAfterCall")
    @l
    private final SellerSurveyResponse showSurveyAfterCall;

    /* compiled from: PhoneResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SuccessPhoneResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SuccessPhoneResponse createFromParcel(@k Parcel parcel) {
            return new SuccessPhoneResponse(parcel.readInt() == 0 ? null : NotificationToast.CREATOR.createFromParcel(parcel), (Action) parcel.readParcelable(SuccessPhoneResponse.class.getClassLoader()), parcel.readInt() == 0 ? null : AnonymousPhoneNumberResponse.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(SuccessPhoneResponse.class.getClassLoader()), parcel.readInt() == 0 ? null : IacPhoneResponse.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SellerSurveyResponse.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SuccessPhoneResponse[] newArray(int i12) {
            return new SuccessPhoneResponse[i12];
        }
    }

    public SuccessPhoneResponse(@l NotificationToast notificationToast, @l Action action, @l AnonymousPhoneNumberResponse anonymousPhoneNumberResponse, @l DeepLink deepLink, @l IacPhoneResponse iacPhoneResponse, @l SellerSurveyResponse sellerSurveyResponse) {
        super(null);
        this.notificationToast = notificationToast;
        this.action = action;
        this.anonymousNumberModal = anonymousPhoneNumberResponse;
        this.redirectUri = deepLink;
        this.iac = iacPhoneResponse;
        this.showSurveyAfterCall = sellerSurveyResponse;
    }

    public static /* synthetic */ SuccessPhoneResponse copy$default(SuccessPhoneResponse successPhoneResponse, NotificationToast notificationToast, Action action, AnonymousPhoneNumberResponse anonymousPhoneNumberResponse, DeepLink deepLink, IacPhoneResponse iacPhoneResponse, SellerSurveyResponse sellerSurveyResponse, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            notificationToast = successPhoneResponse.notificationToast;
        }
        if ((i12 & 2) != 0) {
            action = successPhoneResponse.action;
        }
        Action action2 = action;
        if ((i12 & 4) != 0) {
            anonymousPhoneNumberResponse = successPhoneResponse.anonymousNumberModal;
        }
        AnonymousPhoneNumberResponse anonymousPhoneNumberResponse2 = anonymousPhoneNumberResponse;
        if ((i12 & 8) != 0) {
            deepLink = successPhoneResponse.redirectUri;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 16) != 0) {
            iacPhoneResponse = successPhoneResponse.iac;
        }
        IacPhoneResponse iacPhoneResponse2 = iacPhoneResponse;
        if ((i12 & 32) != 0) {
            sellerSurveyResponse = successPhoneResponse.showSurveyAfterCall;
        }
        return successPhoneResponse.copy(notificationToast, action2, anonymousPhoneNumberResponse2, deepLink2, iacPhoneResponse2, sellerSurveyResponse);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final NotificationToast getNotificationToast() {
        return this.notificationToast;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AnonymousPhoneNumberResponse getAnonymousNumberModal() {
        return this.anonymousNumberModal;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DeepLink getRedirectUri() {
        return this.redirectUri;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final IacPhoneResponse getIac() {
        return this.iac;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final SellerSurveyResponse getShowSurveyAfterCall() {
        return this.showSurveyAfterCall;
    }

    @k
    public final SuccessPhoneResponse copy(@l NotificationToast notificationToast, @l Action action, @l AnonymousPhoneNumberResponse anonymousNumberModal, @l DeepLink redirectUri, @l IacPhoneResponse iac, @l SellerSurveyResponse showSurveyAfterCall) {
        return new SuccessPhoneResponse(notificationToast, action, anonymousNumberModal, redirectUri, iac, showSurveyAfterCall);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuccessPhoneResponse)) {
            return false;
        }
        SuccessPhoneResponse successPhoneResponse = (SuccessPhoneResponse) other;
        return L.f(this.notificationToast, successPhoneResponse.notificationToast) && L.f(this.action, successPhoneResponse.action) && L.f(this.anonymousNumberModal, successPhoneResponse.anonymousNumberModal) && L.f(this.redirectUri, successPhoneResponse.redirectUri) && L.f(this.iac, successPhoneResponse.iac) && L.f(this.showSurveyAfterCall, successPhoneResponse.showSurveyAfterCall);
    }

    @l
    public final Action getAction() {
        return this.action;
    }

    @l
    public final AnonymousPhoneNumberResponse getAnonymousNumberModal() {
        return this.anonymousNumberModal;
    }

    @l
    public final IacPhoneResponse getIac() {
        return this.iac;
    }

    @Override // com.avito.android.remote.model.NotificationToastResponse
    @l
    public NotificationToast getNotificationToast() {
        return this.notificationToast;
    }

    @l
    public final DeepLink getRedirectUri() {
        return this.redirectUri;
    }

    @l
    public final SellerSurveyResponse getShowSurveyAfterCall() {
        return this.showSurveyAfterCall;
    }

    public int hashCode() {
        NotificationToast notificationToast = this.notificationToast;
        int iHashCode = (notificationToast == null ? 0 : notificationToast.hashCode()) * 31;
        Action action = this.action;
        int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
        AnonymousPhoneNumberResponse anonymousPhoneNumberResponse = this.anonymousNumberModal;
        int iHashCode3 = (iHashCode2 + (anonymousPhoneNumberResponse == null ? 0 : anonymousPhoneNumberResponse.hashCode())) * 31;
        DeepLink deepLink = this.redirectUri;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        IacPhoneResponse iacPhoneResponse = this.iac;
        int iHashCode5 = (iHashCode4 + (iacPhoneResponse == null ? 0 : iacPhoneResponse.hashCode())) * 31;
        SellerSurveyResponse sellerSurveyResponse = this.showSurveyAfterCall;
        return iHashCode5 + (sellerSurveyResponse != null ? sellerSurveyResponse.hashCode() : 0);
    }

    @k
    public String toString() {
        return "SuccessPhoneResponse(notificationToast=" + this.notificationToast + ", action=" + this.action + ", anonymousNumberModal=" + this.anonymousNumberModal + ", redirectUri=" + this.redirectUri + ", iac=" + this.iac + ", showSurveyAfterCall=" + this.showSurveyAfterCall + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        NotificationToast notificationToast = this.notificationToast;
        if (notificationToast == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            notificationToast.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.action, flags);
        AnonymousPhoneNumberResponse anonymousPhoneNumberResponse = this.anonymousNumberModal;
        if (anonymousPhoneNumberResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            anonymousPhoneNumberResponse.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.redirectUri, flags);
        IacPhoneResponse iacPhoneResponse = this.iac;
        if (iacPhoneResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iacPhoneResponse.writeToParcel(parcel, flags);
        }
        SellerSurveyResponse sellerSurveyResponse = this.showSurveyAfterCall;
        if (sellerSurveyResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerSurveyResponse.writeToParcel(parcel, flags);
        }
    }
}
