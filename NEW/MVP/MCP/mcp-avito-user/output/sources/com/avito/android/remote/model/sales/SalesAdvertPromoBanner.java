package com.avito.android.remote.model.sales;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.sales.utils.Timer;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SalesAdvertPromoBanner.kt */
@d
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0003OPQBa\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010 J|\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020)HÖ\u0001¢\u0006\u0004\b0\u0010+J \u00105\u001a\u0002042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020)HÖ\u0001¢\u0006\u0004\b5\u00106R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b\u0003\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b@\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bD\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bE\u0010 R(\u0010G\u001a\u00020F8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bG\u0010H\u0012\u0004\bM\u0010N\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006R"}, d2 = {"Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner;", "Lcom/avito/android/remote/model/SerpElement;", "", "isPriceInside", "Lcom/avito/android/remote/model/UniversalImage;", "backgroundImage", "Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$AdvertFrontImage;", "frontImage", "Lcom/avito/android/remote/model/sales/utils/Timer;", "timer", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$TextStyle;", "priceStyle", "Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$TextWithStrikethroughStyle;", "oldPriceStyle", "discountStyle", "<init>", "(Ljava/lang/Boolean;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$AdvertFrontImage;Lcom/avito/android/remote/model/sales/utils/Timer;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$TextStyle;Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$TextWithStrikethroughStyle;Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$TextStyle;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Lcom/avito/android/remote/model/UniversalImage;", "component3", "()Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$AdvertFrontImage;", "component4", "()Lcom/avito/android/remote/model/sales/utils/Timer;", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "component6", "component7", "()Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$TextStyle;", "component8", "()Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$TextWithStrikethroughStyle;", "component9", "copy", "(Ljava/lang/Boolean;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$AdvertFrontImage;Lcom/avito/android/remote/model/sales/utils/Timer;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$TextStyle;Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$TextWithStrikethroughStyle;Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$TextStyle;)Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/UniversalImage;", "getBackgroundImage", "Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$AdvertFrontImage;", "getFrontImage", "Lcom/avito/android/remote/model/sales/utils/Timer;", "getTimer", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$TextStyle;", "getPriceStyle", "Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$TextWithStrikethroughStyle;", "getOldPriceStyle", "getDiscountStyle", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "AdvertFrontImage", "TextStyle", "TextWithStrikethroughStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SalesAdvertPromoBanner implements SerpElement {

    @k
    public static final Parcelable.Creator<SalesAdvertPromoBanner> CREATOR = new Creator();

    @c("backgroundImage")
    @l
    private final UniversalImage backgroundImage;

    @c("discountPercentStyle")
    @l
    private final TextStyle discountStyle;

    @c("frontImage")
    @l
    private final AdvertFrontImage frontImage;

    @c("isPriceInside")
    @l
    private final Boolean isPriceInside;

    @c("oldPriceStyle")
    @l
    private final TextWithStrikethroughStyle oldPriceStyle;

    @c("priceStyle")
    @l
    private final TextStyle priceStyle;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("timer")
    @l
    private final Timer timer;

    @c("title")
    @l
    private final AttributedText title;
    private transient long uniqueId;

    /* compiled from: SalesAdvertPromoBanner.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$AdvertFrontImage;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;)V", "component1", "()Lcom/avito/android/remote/model/UniversalImage;", "copy", "(Lcom/avito/android/remote/model/UniversalImage;)Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$AdvertFrontImage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertFrontImage implements Parcelable {

        @k
        public static final Parcelable.Creator<AdvertFrontImage> CREATOR = new Creator();

        @c("image")
        @l
        private final UniversalImage image;

        /* compiled from: SalesAdvertPromoBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AdvertFrontImage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AdvertFrontImage createFromParcel(@k Parcel parcel) {
                return new AdvertFrontImage((UniversalImage) parcel.readParcelable(AdvertFrontImage.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AdvertFrontImage[] newArray(int i12) {
                return new AdvertFrontImage[i12];
            }
        }

        public AdvertFrontImage(@l UniversalImage universalImage) {
            this.image = universalImage;
        }

        public static /* synthetic */ AdvertFrontImage copy$default(AdvertFrontImage advertFrontImage, UniversalImage universalImage, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalImage = advertFrontImage.image;
            }
            return advertFrontImage.copy(universalImage);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        public final AdvertFrontImage copy(@l UniversalImage image) {
            return new AdvertFrontImage(image);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AdvertFrontImage) && L.f(this.image, ((AdvertFrontImage) other).image);
        }

        @l
        public final UniversalImage getImage() {
            return this.image;
        }

        public int hashCode() {
            UniversalImage universalImage = this.image;
            if (universalImage == null) {
                return 0;
            }
            return universalImage.hashCode();
        }

        @k
        public String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.s(new StringBuilder("AdvertFrontImage(image="), this.image, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.image, flags);
        }
    }

    /* compiled from: SalesAdvertPromoBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SalesAdvertPromoBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SalesAdvertPromoBanner createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SalesAdvertPromoBanner(boolValueOf, (UniversalImage) parcel.readParcelable(SalesAdvertPromoBanner.class.getClassLoader()), parcel.readInt() == 0 ? null : AdvertFrontImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Timer.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(SalesAdvertPromoBanner.class.getClassLoader()), (AttributedText) parcel.readParcelable(SalesAdvertPromoBanner.class.getClassLoader()), parcel.readInt() == 0 ? null : TextStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TextWithStrikethroughStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TextStyle.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SalesAdvertPromoBanner[] newArray(int i12) {
            return new SalesAdvertPromoBanner[i12];
        }
    }

    /* compiled from: SalesAdvertPromoBanner.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$TextStyle;", "Landroid/os/Parcelable;", "", "textStyle", "Lcom/avito/android/remote/model/UniversalColor;", "textColor", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$TextStyle;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTextStyle", "Lcom/avito/android/remote/model/UniversalColor;", "getTextColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TextStyle implements Parcelable {

        @k
        public static final Parcelable.Creator<TextStyle> CREATOR = new Creator();

        @c("textColor")
        @l
        private final UniversalColor textColor;

        @c("textStyle")
        @l
        private final String textStyle;

        /* compiled from: SalesAdvertPromoBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TextStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TextStyle createFromParcel(@k Parcel parcel) {
                return new TextStyle(parcel.readString(), (UniversalColor) parcel.readParcelable(TextStyle.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TextStyle[] newArray(int i12) {
                return new TextStyle[i12];
            }
        }

        public TextStyle(@l String str, @l UniversalColor universalColor) {
            this.textStyle = str;
            this.textColor = universalColor;
        }

        public static /* synthetic */ TextStyle copy$default(TextStyle textStyle, String str, UniversalColor universalColor, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = textStyle.textStyle;
            }
            if ((i12 & 2) != 0) {
                universalColor = textStyle.textColor;
            }
            return textStyle.copy(str, universalColor);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTextStyle() {
            return this.textStyle;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getTextColor() {
            return this.textColor;
        }

        @k
        public final TextStyle copy(@l String textStyle, @l UniversalColor textColor) {
            return new TextStyle(textStyle, textColor);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextStyle)) {
                return false;
            }
            TextStyle textStyle = (TextStyle) other;
            return L.f(this.textStyle, textStyle.textStyle) && L.f(this.textColor, textStyle.textColor);
        }

        @l
        public final UniversalColor getTextColor() {
            return this.textColor;
        }

        @l
        public final String getTextStyle() {
            return this.textStyle;
        }

        public int hashCode() {
            String str = this.textStyle;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UniversalColor universalColor = this.textColor;
            return iHashCode + (universalColor != null ? universalColor.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("TextStyle(textStyle=");
            sb2.append(this.textStyle);
            sb2.append(", textColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.textColor, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.textStyle);
            parcel.writeParcelable(this.textColor, flags);
        }
    }

    /* compiled from: SalesAdvertPromoBanner.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$TextWithStrikethroughStyle;", "Landroid/os/Parcelable;", "", "textStyle", "Lcom/avito/android/remote/model/UniversalColor;", "textColor", "strikethroughColor", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/sales/SalesAdvertPromoBanner$TextWithStrikethroughStyle;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTextStyle", "Lcom/avito/android/remote/model/UniversalColor;", "getTextColor", "getStrikethroughColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TextWithStrikethroughStyle implements Parcelable {

        @k
        public static final Parcelable.Creator<TextWithStrikethroughStyle> CREATOR = new Creator();

        @c("strikethroughColor")
        @l
        private final UniversalColor strikethroughColor;

        @c("textColor")
        @l
        private final UniversalColor textColor;

        @c("textStyle")
        @l
        private final String textStyle;

        /* compiled from: SalesAdvertPromoBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TextWithStrikethroughStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TextWithStrikethroughStyle createFromParcel(@k Parcel parcel) {
                return new TextWithStrikethroughStyle(parcel.readString(), (UniversalColor) parcel.readParcelable(TextWithStrikethroughStyle.class.getClassLoader()), (UniversalColor) parcel.readParcelable(TextWithStrikethroughStyle.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TextWithStrikethroughStyle[] newArray(int i12) {
                return new TextWithStrikethroughStyle[i12];
            }
        }

        public TextWithStrikethroughStyle(@l String str, @l UniversalColor universalColor, @l UniversalColor universalColor2) {
            this.textStyle = str;
            this.textColor = universalColor;
            this.strikethroughColor = universalColor2;
        }

        public static /* synthetic */ TextWithStrikethroughStyle copy$default(TextWithStrikethroughStyle textWithStrikethroughStyle, String str, UniversalColor universalColor, UniversalColor universalColor2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = textWithStrikethroughStyle.textStyle;
            }
            if ((i12 & 2) != 0) {
                universalColor = textWithStrikethroughStyle.textColor;
            }
            if ((i12 & 4) != 0) {
                universalColor2 = textWithStrikethroughStyle.strikethroughColor;
            }
            return textWithStrikethroughStyle.copy(str, universalColor, universalColor2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTextStyle() {
            return this.textStyle;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getTextColor() {
            return this.textColor;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final UniversalColor getStrikethroughColor() {
            return this.strikethroughColor;
        }

        @k
        public final TextWithStrikethroughStyle copy(@l String textStyle, @l UniversalColor textColor, @l UniversalColor strikethroughColor) {
            return new TextWithStrikethroughStyle(textStyle, textColor, strikethroughColor);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextWithStrikethroughStyle)) {
                return false;
            }
            TextWithStrikethroughStyle textWithStrikethroughStyle = (TextWithStrikethroughStyle) other;
            return L.f(this.textStyle, textWithStrikethroughStyle.textStyle) && L.f(this.textColor, textWithStrikethroughStyle.textColor) && L.f(this.strikethroughColor, textWithStrikethroughStyle.strikethroughColor);
        }

        @l
        public final UniversalColor getStrikethroughColor() {
            return this.strikethroughColor;
        }

        @l
        public final UniversalColor getTextColor() {
            return this.textColor;
        }

        @l
        public final String getTextStyle() {
            return this.textStyle;
        }

        public int hashCode() {
            String str = this.textStyle;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            UniversalColor universalColor = this.textColor;
            int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            UniversalColor universalColor2 = this.strikethroughColor;
            return iHashCode2 + (universalColor2 != null ? universalColor2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("TextWithStrikethroughStyle(textStyle=");
            sb2.append(this.textStyle);
            sb2.append(", textColor=");
            sb2.append(this.textColor);
            sb2.append(", strikethroughColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.strikethroughColor, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.textStyle);
            parcel.writeParcelable(this.textColor, flags);
            parcel.writeParcelable(this.strikethroughColor, flags);
        }
    }

    public SalesAdvertPromoBanner(@l Boolean bool, @l UniversalImage universalImage, @l AdvertFrontImage advertFrontImage, @l Timer timer, @l AttributedText attributedText, @l AttributedText attributedText2, @l TextStyle textStyle, @l TextWithStrikethroughStyle textWithStrikethroughStyle, @l TextStyle textStyle2) {
        this.isPriceInside = bool;
        this.backgroundImage = universalImage;
        this.frontImage = advertFrontImage;
        this.timer = timer;
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.priceStyle = textStyle;
        this.oldPriceStyle = textWithStrikethroughStyle;
        this.discountStyle = textStyle2;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Boolean getIsPriceInside() {
        return this.isPriceInside;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalImage getBackgroundImage() {
        return this.backgroundImage;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AdvertFrontImage getFrontImage() {
        return this.frontImage;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Timer getTimer() {
        return this.timer;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final TextStyle getPriceStyle() {
        return this.priceStyle;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final TextWithStrikethroughStyle getOldPriceStyle() {
        return this.oldPriceStyle;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final TextStyle getDiscountStyle() {
        return this.discountStyle;
    }

    @k
    public final SalesAdvertPromoBanner copy(@l Boolean isPriceInside, @l UniversalImage backgroundImage, @l AdvertFrontImage frontImage, @l Timer timer, @l AttributedText title, @l AttributedText subtitle, @l TextStyle priceStyle, @l TextWithStrikethroughStyle oldPriceStyle, @l TextStyle discountStyle) {
        return new SalesAdvertPromoBanner(isPriceInside, backgroundImage, frontImage, timer, title, subtitle, priceStyle, oldPriceStyle, discountStyle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SalesAdvertPromoBanner)) {
            return false;
        }
        SalesAdvertPromoBanner salesAdvertPromoBanner = (SalesAdvertPromoBanner) other;
        return L.f(this.isPriceInside, salesAdvertPromoBanner.isPriceInside) && L.f(this.backgroundImage, salesAdvertPromoBanner.backgroundImage) && L.f(this.frontImage, salesAdvertPromoBanner.frontImage) && L.f(this.timer, salesAdvertPromoBanner.timer) && L.f(this.title, salesAdvertPromoBanner.title) && L.f(this.subtitle, salesAdvertPromoBanner.subtitle) && L.f(this.priceStyle, salesAdvertPromoBanner.priceStyle) && L.f(this.oldPriceStyle, salesAdvertPromoBanner.oldPriceStyle) && L.f(this.discountStyle, salesAdvertPromoBanner.discountStyle);
    }

    @l
    public final UniversalImage getBackgroundImage() {
        return this.backgroundImage;
    }

    @l
    public final TextStyle getDiscountStyle() {
        return this.discountStyle;
    }

    @l
    public final AdvertFrontImage getFrontImage() {
        return this.frontImage;
    }

    @l
    public final TextWithStrikethroughStyle getOldPriceStyle() {
        return this.oldPriceStyle;
    }

    @l
    public final TextStyle getPriceStyle() {
        return this.priceStyle;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    public final Timer getTimer() {
        return this.timer;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    /* renamed from: getUniqueId, reason: from getter */
    public long getF107426b() {
        return this.uniqueId;
    }

    public int hashCode() {
        Boolean bool = this.isPriceInside;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        UniversalImage universalImage = this.backgroundImage;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        AdvertFrontImage advertFrontImage = this.frontImage;
        int iHashCode3 = (iHashCode2 + (advertFrontImage == null ? 0 : advertFrontImage.hashCode())) * 31;
        Timer timer = this.timer;
        int iHashCode4 = (iHashCode3 + (timer == null ? 0 : timer.hashCode())) * 31;
        AttributedText attributedText = this.title;
        int iHashCode5 = (iHashCode4 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.subtitle;
        int iHashCode6 = (iHashCode5 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        TextStyle textStyle = this.priceStyle;
        int iHashCode7 = (iHashCode6 + (textStyle == null ? 0 : textStyle.hashCode())) * 31;
        TextWithStrikethroughStyle textWithStrikethroughStyle = this.oldPriceStyle;
        int iHashCode8 = (iHashCode7 + (textWithStrikethroughStyle == null ? 0 : textWithStrikethroughStyle.hashCode())) * 31;
        TextStyle textStyle2 = this.discountStyle;
        return iHashCode8 + (textStyle2 != null ? textStyle2.hashCode() : 0);
    }

    @l
    public final Boolean isPriceInside() {
        return this.isPriceInside;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @k
    public String toString() {
        return "SalesAdvertPromoBanner(isPriceInside=" + this.isPriceInside + ", backgroundImage=" + this.backgroundImage + ", frontImage=" + this.frontImage + ", timer=" + this.timer + ", title=" + this.title + ", subtitle=" + this.subtitle + ", priceStyle=" + this.priceStyle + ", oldPriceStyle=" + this.oldPriceStyle + ", discountStyle=" + this.discountStyle + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Boolean bool = this.isPriceInside;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.backgroundImage, flags);
        AdvertFrontImage advertFrontImage = this.frontImage;
        if (advertFrontImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertFrontImage.writeToParcel(parcel, flags);
        }
        Timer timer = this.timer;
        if (timer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            timer.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.subtitle, flags);
        TextStyle textStyle = this.priceStyle;
        if (textStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textStyle.writeToParcel(parcel, flags);
        }
        TextWithStrikethroughStyle textWithStrikethroughStyle = this.oldPriceStyle;
        if (textWithStrikethroughStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textWithStrikethroughStyle.writeToParcel(parcel, flags);
        }
        TextStyle textStyle2 = this.discountStyle;
        if (textStyle2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textStyle2.writeToParcel(parcel, flags);
        }
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}
