package com.avito.android.auction.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuctionOfferResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/avito/android/auction/remote/model/AuctionFooter;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "faq", "terms", "Lcom/avito/android/auction/remote/model/Button;", "applyButton", "cancelButton", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/auction/remote/model/Button;Lcom/avito/android/auction/remote/model/Button;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "f", "Lcom/avito/android/auction/remote/model/Button;", "c", "()Lcom/avito/android/auction/remote/model/Button;", "d", "_avito-discouraged_avito-api_auction"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AuctionFooter implements Parcelable {

    @k
    public static final Parcelable.Creator<AuctionFooter> CREATOR = new a();

    @c("applyButton")
    @l
    private final Button applyButton;

    @c("cancelButton")
    @l
    private final Button cancelButton;

    @c("faq")
    @l
    private final AttributedText faq;

    @c("terms")
    @l
    private final AttributedText terms;

    /* compiled from: AuctionOfferResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AuctionFooter> {
        @Override // android.os.Parcelable.Creator
        public final AuctionFooter createFromParcel(Parcel parcel) {
            return new AuctionFooter((AttributedText) parcel.readParcelable(AuctionFooter.class.getClassLoader()), (AttributedText) parcel.readParcelable(AuctionFooter.class.getClassLoader()), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AuctionFooter[] newArray(int i12) {
            return new AuctionFooter[i12];
        }
    }

    public AuctionFooter(@l AttributedText attributedText, @l AttributedText attributedText2, @l Button button, @l Button button2) {
        this.faq = attributedText;
        this.terms = attributedText2;
        this.applyButton = button;
        this.cancelButton = button2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Button getApplyButton() {
        return this.applyButton;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Button getCancelButton() {
        return this.cancelButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final AttributedText getFaq() {
        return this.faq;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuctionFooter)) {
            return false;
        }
        AuctionFooter auctionFooter = (AuctionFooter) obj;
        return L.f(this.faq, auctionFooter.faq) && L.f(this.terms, auctionFooter.terms) && L.f(this.applyButton, auctionFooter.applyButton) && L.f(this.cancelButton, auctionFooter.cancelButton);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final AttributedText getTerms() {
        return this.terms;
    }

    public final int hashCode() {
        AttributedText attributedText = this.faq;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.terms;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        Button button = this.applyButton;
        int iHashCode3 = (iHashCode2 + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.cancelButton;
        return iHashCode3 + (button2 != null ? button2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AuctionFooter(faq=" + this.faq + ", terms=" + this.terms + ", applyButton=" + this.applyButton + ", cancelButton=" + this.cancelButton + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.faq, i12);
        parcel.writeParcelable(this.terms, i12);
        Button button = this.applyButton;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, i12);
        }
        Button button2 = this.cancelButton;
        if (button2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button2.writeToParcel(parcel, i12);
        }
    }
}
