package com.avito.android.remote.model.user_adverts.auction;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AuctionButton.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/user_adverts/auction/AuctionButton;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/UniversalColor;", "titleColor", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "color", "highlightedColor", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/UniversalColor;", "getTitleColor", "()Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getColor", "getHighlightedColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AuctionButton implements Parcelable {

    @k
    public static final Parcelable.Creator<AuctionButton> CREATOR = new Creator();

    @c("color")
    @l
    private final UniversalColor color;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deeplink;

    @c("highlightedColor")
    @l
    private final UniversalColor highlightedColor;

    @c("title")
    @k
    private final String title;

    @c("titleColor")
    @l
    private final UniversalColor titleColor;

    /* compiled from: AuctionButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AuctionButton> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AuctionButton createFromParcel(@k Parcel parcel) {
            return new AuctionButton(parcel.readString(), (UniversalColor) parcel.readParcelable(AuctionButton.class.getClassLoader()), (DeepLink) parcel.readParcelable(AuctionButton.class.getClassLoader()), (UniversalColor) parcel.readParcelable(AuctionButton.class.getClassLoader()), (UniversalColor) parcel.readParcelable(AuctionButton.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AuctionButton[] newArray(int i12) {
            return new AuctionButton[i12];
        }
    }

    public AuctionButton(@k String str, @l UniversalColor universalColor, @k DeepLink deepLink, @l UniversalColor universalColor2, @l UniversalColor universalColor3) {
        this.title = str;
        this.titleColor = universalColor;
        this.deeplink = deepLink;
        this.color = universalColor2;
        this.highlightedColor = universalColor3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final UniversalColor getColor() {
        return this.color;
    }

    @k
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final UniversalColor getHighlightedColor() {
        return this.highlightedColor;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final UniversalColor getTitleColor() {
        return this.titleColor;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.titleColor, flags);
        parcel.writeParcelable(this.deeplink, flags);
        parcel.writeParcelable(this.color, flags);
        parcel.writeParcelable(this.highlightedColor, flags);
    }

    public /* synthetic */ AuctionButton(String str, UniversalColor universalColor, DeepLink deepLink, UniversalColor universalColor2, UniversalColor universalColor3, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : universalColor, deepLink, (i12 & 8) != 0 ? null : universalColor2, (i12 & 16) != 0 ? null : universalColor3);
    }
}
