package com.avito.android.safedeal.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SafeDealPaymentBlockResponse.kt */
@d
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockBankButton;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/UniversalColor;", "textColor", "iconName", "iconColor", "Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockBankButton$Background;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/deep_linking/links/DeepLink;", "onTapDeepLink", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockBankButton$Background;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/UniversalColor;", "f", "()Lcom/avito/android/remote/model/UniversalColor;", "d", "getIconColor", "Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockBankButton$Background;", "c", "()Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockBankButton$Background;", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Background", "_avito-discouraged_avito-api_safedeal"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SafeDealPaymentBlockBankButton implements Parcelable {

    @k
    public static final Parcelable.Creator<SafeDealPaymentBlockBankButton> CREATOR = new a();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
    @k
    private final Background background;

    @c("iconColor")
    @l
    private final UniversalColor iconColor;

    @c("icon")
    @k
    private final String iconName;

    @c("onTapDeepLink")
    @l
    private final DeepLink onTapDeepLink;

    @c("textColor")
    @l
    private final UniversalColor textColor;

    @c("title")
    @l
    private final String title;

    /* compiled from: SafeDealPaymentBlockResponse.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/safedeal/remote/model/SafeDealPaymentBlockBankButton$Background;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "color", "highlightedColor", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "Lcom/avito/android/remote/model/UniversalColor;", "c", "()Lcom/avito/android/remote/model/UniversalColor;", "d", "_avito-discouraged_avito-api_safedeal"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        @k
        /* renamed from: c, reason: from getter */
        public final UniversalColor getColor() {
            return this.color;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final UniversalColor getHighlightedColor() {
            return this.highlightedColor;
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
    public static final class a implements Parcelable.Creator<SafeDealPaymentBlockBankButton> {
        @Override // android.os.Parcelable.Creator
        public final SafeDealPaymentBlockBankButton createFromParcel(Parcel parcel) {
            return new SafeDealPaymentBlockBankButton(parcel.readString(), (UniversalColor) parcel.readParcelable(SafeDealPaymentBlockBankButton.class.getClassLoader()), parcel.readString(), (UniversalColor) parcel.readParcelable(SafeDealPaymentBlockBankButton.class.getClassLoader()), Background.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(SafeDealPaymentBlockBankButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SafeDealPaymentBlockBankButton[] newArray(int i12) {
            return new SafeDealPaymentBlockBankButton[i12];
        }
    }

    public SafeDealPaymentBlockBankButton(@l String str, @l UniversalColor universalColor, @k String str2, @l UniversalColor universalColor2, @k Background background, @l DeepLink deepLink) {
        this.title = str;
        this.textColor = universalColor;
        this.iconName = str2;
        this.iconColor = universalColor2;
        this.background = background;
        this.onTapDeepLink = deepLink;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Background getBackground() {
        return this.background;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final DeepLink getOnTapDeepLink() {
        return this.onTapDeepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SafeDealPaymentBlockBankButton)) {
            return false;
        }
        SafeDealPaymentBlockBankButton safeDealPaymentBlockBankButton = (SafeDealPaymentBlockBankButton) obj;
        return L.f(this.title, safeDealPaymentBlockBankButton.title) && L.f(this.textColor, safeDealPaymentBlockBankButton.textColor) && L.f(this.iconName, safeDealPaymentBlockBankButton.iconName) && L.f(this.iconColor, safeDealPaymentBlockBankButton.iconColor) && L.f(this.background, safeDealPaymentBlockBankButton.background) && L.f(this.onTapDeepLink, safeDealPaymentBlockBankButton.onTapDeepLink);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final UniversalColor getTextColor() {
        return this.textColor;
    }

    @l
    public final UniversalColor getIconColor() {
        return this.iconColor;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UniversalColor universalColor = this.textColor;
        int iD2 = H.d((iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31, 31, this.iconName);
        UniversalColor universalColor2 = this.iconColor;
        int iHashCode2 = (this.background.hashCode() + ((iD2 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31)) * 31;
        DeepLink deepLink = this.onTapDeepLink;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SafeDealPaymentBlockBankButton(title=");
        sb2.append(this.title);
        sb2.append(", textColor=");
        sb2.append(this.textColor);
        sb2.append(", iconName=");
        sb2.append(this.iconName);
        sb2.append(", iconColor=");
        sb2.append(this.iconColor);
        sb2.append(", background=");
        sb2.append(this.background);
        sb2.append(", onTapDeepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.onTapDeepLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.textColor, i12);
        parcel.writeString(this.iconName);
        parcel.writeParcelable(this.iconColor, i12);
        this.background.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.onTapDeepLink, i12);
    }
}
