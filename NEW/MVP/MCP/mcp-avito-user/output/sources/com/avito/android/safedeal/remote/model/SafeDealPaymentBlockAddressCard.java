package com.avito.android.safedeal.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SafeDealPaymentBlockResponse.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockAddressCard;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockAddressCard$Background;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/deep_linking/links/DeepLink;", "onTapDeepLink", "<init>", "(Ljava/lang/String;Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockAddressCard$Background;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockAddressCard$Background;", "getBackground", "()Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockAddressCard$Background;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Background", "_avito-discouraged_avito-api_safedeal"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SafeDealPaymentBlockAddressCard implements Parcelable {

    @k
    public static final Parcelable.Creator<SafeDealPaymentBlockAddressCard> CREATOR = new a();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
    @k
    private final Background background;

    @c("onTapDeepLink")
    @l
    private final DeepLink onTapDeepLink;

    @c("title")
    @k
    private final String title;

    /* compiled from: SafeDealPaymentBlockResponse.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockAddressCard$Background;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "color", "highlightedColor", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getHighlightedColor", "_avito-discouraged_avito-api_safedeal"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Background implements Parcelable {

        @k
        public static final Parcelable.Creator<Background> CREATOR = new a();

        @c("color")
        @k
        private final UniversalColor color;

        @c("highlightedColor")
        @k
        private final UniversalColor highlightedColor;

        /* compiled from: SafeDealPaymentBlockResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Background> {
            @Override // android.os.Parcelable.Creator
            public final Background createFromParcel(Parcel parcel) {
                return new Background((UniversalColor) parcel.readParcelable(Background.class.getClassLoader()), (UniversalColor) parcel.readParcelable(Background.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Background[] newArray(int i12) {
                return new Background[i12];
            }
        }

        public Background(@k UniversalColor universalColor, @k UniversalColor universalColor2) {
            this.color = universalColor;
            this.highlightedColor = universalColor2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Background)) {
                return false;
            }
            Background background = (Background) obj;
            return L.f(this.color, background.color) && L.f(this.highlightedColor, background.highlightedColor);
        }

        public final int hashCode() {
            return this.highlightedColor.hashCode() + (this.color.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Background(color=");
            sb2.append(this.color);
            sb2.append(", highlightedColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.highlightedColor, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.color, i12);
            parcel.writeParcelable(this.highlightedColor, i12);
        }
    }

    /* compiled from: SafeDealPaymentBlockResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SafeDealPaymentBlockAddressCard> {
        @Override // android.os.Parcelable.Creator
        public final SafeDealPaymentBlockAddressCard createFromParcel(Parcel parcel) {
            return new SafeDealPaymentBlockAddressCard(parcel.readString(), Background.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(SafeDealPaymentBlockAddressCard.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SafeDealPaymentBlockAddressCard[] newArray(int i12) {
            return new SafeDealPaymentBlockAddressCard[i12];
        }
    }

    public SafeDealPaymentBlockAddressCard(@k String str, @k Background background, @l DeepLink deepLink) {
        this.title = str;
        this.background = background;
        this.onTapDeepLink = deepLink;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final DeepLink getOnTapDeepLink() {
        return this.onTapDeepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SafeDealPaymentBlockAddressCard)) {
            return false;
        }
        SafeDealPaymentBlockAddressCard safeDealPaymentBlockAddressCard = (SafeDealPaymentBlockAddressCard) obj;
        return L.f(this.title, safeDealPaymentBlockAddressCard.title) && L.f(this.background, safeDealPaymentBlockAddressCard.background) && L.f(this.onTapDeepLink, safeDealPaymentBlockAddressCard.onTapDeepLink);
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = (this.background.hashCode() + (this.title.hashCode() * 31)) * 31;
        DeepLink deepLink = this.onTapDeepLink;
        return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SafeDealPaymentBlockAddressCard(title=");
        sb2.append(this.title);
        sb2.append(", background=");
        sb2.append(this.background);
        sb2.append(", onTapDeepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.onTapDeepLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        this.background.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.onTapDeepLink, i12);
    }
}
