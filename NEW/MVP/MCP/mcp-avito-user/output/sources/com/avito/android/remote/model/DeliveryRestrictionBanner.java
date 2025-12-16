package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryRestrictionBanner.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0013¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/DeliveryRestrictionBanner;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/remote/model/BannerButton;", "action", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/BannerButton;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Lcom/avito/android/remote/model/BannerButton;", "component3", "()Lcom/avito/android/remote/model/UniversalImage;", "component4", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/BannerButton;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/DeliveryRestrictionBanner;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "Lcom/avito/android/remote/model/BannerButton;", "getAction", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeliveryRestrictionBanner implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliveryRestrictionBanner> CREATOR = new Creator();

    @c("action")
    @k
    private final BannerButton action;

    @c("backgroundColor")
    @l
    private final UniversalColor backgroundColor;

    @c("image")
    @k
    private final UniversalImage image;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: DeliveryRestrictionBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryRestrictionBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryRestrictionBanner createFromParcel(@k Parcel parcel) {
            return new DeliveryRestrictionBanner((AttributedText) parcel.readParcelable(DeliveryRestrictionBanner.class.getClassLoader()), BannerButton.CREATOR.createFromParcel(parcel), (UniversalImage) parcel.readParcelable(DeliveryRestrictionBanner.class.getClassLoader()), (UniversalColor) parcel.readParcelable(DeliveryRestrictionBanner.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryRestrictionBanner[] newArray(int i12) {
            return new DeliveryRestrictionBanner[i12];
        }
    }

    public DeliveryRestrictionBanner(@k AttributedText attributedText, @k BannerButton bannerButton, @k UniversalImage universalImage, @l UniversalColor universalColor) {
        this.title = attributedText;
        this.action = bannerButton;
        this.image = universalImage;
        this.backgroundColor = universalColor;
    }

    public static /* synthetic */ DeliveryRestrictionBanner copy$default(DeliveryRestrictionBanner deliveryRestrictionBanner, AttributedText attributedText, BannerButton bannerButton, UniversalImage universalImage, UniversalColor universalColor, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = deliveryRestrictionBanner.title;
        }
        if ((i12 & 2) != 0) {
            bannerButton = deliveryRestrictionBanner.action;
        }
        if ((i12 & 4) != 0) {
            universalImage = deliveryRestrictionBanner.image;
        }
        if ((i12 & 8) != 0) {
            universalColor = deliveryRestrictionBanner.backgroundColor;
        }
        return deliveryRestrictionBanner.copy(attributedText, bannerButton, universalImage, universalColor);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final BannerButton getAction() {
        return this.action;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @k
    public final DeliveryRestrictionBanner copy(@k AttributedText title, @k BannerButton action, @k UniversalImage image, @l UniversalColor backgroundColor) {
        return new DeliveryRestrictionBanner(title, action, image, backgroundColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryRestrictionBanner)) {
            return false;
        }
        DeliveryRestrictionBanner deliveryRestrictionBanner = (DeliveryRestrictionBanner) other;
        return L.f(this.title, deliveryRestrictionBanner.title) && L.f(this.action, deliveryRestrictionBanner.action) && L.f(this.image, deliveryRestrictionBanner.image) && L.f(this.backgroundColor, deliveryRestrictionBanner.backgroundColor);
    }

    @k
    public final BannerButton getAction() {
        return this.action;
    }

    @l
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @k
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iA2 = a.a((this.action.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.image);
        UniversalColor universalColor = this.backgroundColor;
        return iA2 + (universalColor == null ? 0 : universalColor.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryRestrictionBanner(title=");
        sb2.append(this.title);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", backgroundColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.backgroundColor, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        this.action.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.image, flags);
        parcel.writeParcelable(this.backgroundColor, flags);
    }
}
