package com.avito.android.success.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuccessDataResponse.kt */
@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/success/models/CharitySignBlock;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_success_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CharitySignBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<CharitySignBlock> CREATOR = new a();

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deeplink;

    @c("image")
    @l
    private final UniversalImage image;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: SuccessDataResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CharitySignBlock> {
        @Override // android.os.Parcelable.Creator
        public final CharitySignBlock createFromParcel(Parcel parcel) {
            return new CharitySignBlock((AttributedText) parcel.readParcelable(CharitySignBlock.class.getClassLoader()), (AttributedText) parcel.readParcelable(CharitySignBlock.class.getClassLoader()), (UniversalImage) parcel.readParcelable(CharitySignBlock.class.getClassLoader()), (DeepLink) parcel.readParcelable(CharitySignBlock.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CharitySignBlock[] newArray(int i12) {
            return new CharitySignBlock[i12];
        }
    }

    public CharitySignBlock(@k AttributedText attributedText, @l AttributedText attributedText2, @l UniversalImage universalImage, @k DeepLink deepLink) {
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.image = universalImage;
        this.deeplink = deepLink;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CharitySignBlock)) {
            return false;
        }
        CharitySignBlock charitySignBlock = (CharitySignBlock) obj;
        return L.f(this.title, charitySignBlock.title) && L.f(this.subtitle, charitySignBlock.subtitle) && L.f(this.image, charitySignBlock.image) && L.f(this.deeplink, charitySignBlock.deeplink);
    }

    @k
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AttributedText attributedText = this.subtitle;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        return this.deeplink.hashCode() + ((iHashCode2 + (universalImage != null ? universalImage.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CharitySignBlock(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.deeplink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        parcel.writeParcelable(this.subtitle, i12);
        parcel.writeParcelable(this.image, i12);
        parcel.writeParcelable(this.deeplink, i12);
    }
}
