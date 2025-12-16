package com.avito.android.safedeal.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SafeDealPaymentBlockResponse.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockResponse;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockAddressCard;", "addressCard", "Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockBankButton;", "bankButton", "Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockSlider;", "slider", "Lcom/avito/android/remote/model/text/AttributedText;", "deliveryPolicy", "Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockEvents;", "events", "<init>", "(Ljava/lang/String;Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockAddressCard;Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockBankButton;Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockSlider;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockEvents;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockAddressCard;", "c", "()Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockAddressCard;", "Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockBankButton;", "d", "()Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockBankButton;", "Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockSlider;", "g", "()Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockSlider;", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockEvents;", "f", "()Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockEvents;", "_avito-discouraged_avito-api_safedeal"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SafeDealPaymentBlockResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<SafeDealPaymentBlockResponse> CREATOR = new a();

    @c("addressCard")
    @k
    private final SafeDealPaymentBlockAddressCard addressCard;

    @c("bankButton")
    @k
    private final SafeDealPaymentBlockBankButton bankButton;

    @c("bottomAttributedText")
    @k
    private final AttributedText deliveryPolicy;

    @c("events")
    @l
    private final SafeDealPaymentBlockEvents events;

    @c("slider")
    @k
    private final SafeDealPaymentBlockSlider slider;

    @c("title")
    @k
    private final String title;

    /* compiled from: SafeDealPaymentBlockResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SafeDealPaymentBlockResponse> {
        @Override // android.os.Parcelable.Creator
        public final SafeDealPaymentBlockResponse createFromParcel(Parcel parcel) {
            return new SafeDealPaymentBlockResponse(parcel.readString(), SafeDealPaymentBlockAddressCard.CREATOR.createFromParcel(parcel), SafeDealPaymentBlockBankButton.CREATOR.createFromParcel(parcel), SafeDealPaymentBlockSlider.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(SafeDealPaymentBlockResponse.class.getClassLoader()), parcel.readInt() == 0 ? null : SafeDealPaymentBlockEvents.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SafeDealPaymentBlockResponse[] newArray(int i12) {
            return new SafeDealPaymentBlockResponse[i12];
        }
    }

    public SafeDealPaymentBlockResponse(@k String str, @k SafeDealPaymentBlockAddressCard safeDealPaymentBlockAddressCard, @k SafeDealPaymentBlockBankButton safeDealPaymentBlockBankButton, @k SafeDealPaymentBlockSlider safeDealPaymentBlockSlider, @k AttributedText attributedText, @l SafeDealPaymentBlockEvents safeDealPaymentBlockEvents) {
        this.title = str;
        this.addressCard = safeDealPaymentBlockAddressCard;
        this.bankButton = safeDealPaymentBlockBankButton;
        this.slider = safeDealPaymentBlockSlider;
        this.deliveryPolicy = attributedText;
        this.events = safeDealPaymentBlockEvents;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final SafeDealPaymentBlockAddressCard getAddressCard() {
        return this.addressCard;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final SafeDealPaymentBlockBankButton getBankButton() {
        return this.bankButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getDeliveryPolicy() {
        return this.deliveryPolicy;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SafeDealPaymentBlockResponse)) {
            return false;
        }
        SafeDealPaymentBlockResponse safeDealPaymentBlockResponse = (SafeDealPaymentBlockResponse) obj;
        return L.f(this.title, safeDealPaymentBlockResponse.title) && L.f(this.addressCard, safeDealPaymentBlockResponse.addressCard) && L.f(this.bankButton, safeDealPaymentBlockResponse.bankButton) && L.f(this.slider, safeDealPaymentBlockResponse.slider) && L.f(this.deliveryPolicy, safeDealPaymentBlockResponse.deliveryPolicy) && L.f(this.events, safeDealPaymentBlockResponse.events);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final SafeDealPaymentBlockEvents getEvents() {
        return this.events;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final SafeDealPaymentBlockSlider getSlider() {
        return this.slider;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b((this.slider.hashCode() + ((this.bankButton.hashCode() + ((this.addressCard.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.deliveryPolicy);
        SafeDealPaymentBlockEvents safeDealPaymentBlockEvents = this.events;
        return iB2 + (safeDealPaymentBlockEvents == null ? 0 : safeDealPaymentBlockEvents.hashCode());
    }

    @k
    public final String toString() {
        return "SafeDealPaymentBlockResponse(title=" + this.title + ", addressCard=" + this.addressCard + ", bankButton=" + this.bankButton + ", slider=" + this.slider + ", deliveryPolicy=" + this.deliveryPolicy + ", events=" + this.events + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        this.addressCard.writeToParcel(parcel, i12);
        this.bankButton.writeToParcel(parcel, i12);
        this.slider.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.deliveryPolicy, i12);
        SafeDealPaymentBlockEvents safeDealPaymentBlockEvents = this.events;
        if (safeDealPaymentBlockEvents == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            safeDealPaymentBlockEvents.writeToParcel(parcel, i12);
        }
    }
}
