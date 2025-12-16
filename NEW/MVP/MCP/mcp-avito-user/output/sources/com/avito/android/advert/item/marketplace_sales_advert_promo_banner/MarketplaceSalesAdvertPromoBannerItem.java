package com.avito.android.advert.item.marketplace_sales_advert_promo_banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.sales.utils.Timer;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.konveyor.item_visibility_tracker.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MarketplaceSalesAdvertPromoBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/advert/item/marketplace_sales_advert_promo_banner/MarketplaceSalesAdvertPromoBannerItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "AdvertPromoBanner", "AdvertPromoBannerPrice", "AdvertPromoBannerPriceBlock", "FrontImage", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MarketplaceSalesAdvertPromoBannerItem implements BlockItem, Q, l1, b.InterfaceC10495b {

    @k
    public static final Parcelable.Creator<MarketplaceSalesAdvertPromoBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f77493b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f77494c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AdvertPromoBanner f77495d;

    /* renamed from: e, reason: collision with root package name */
    public final int f77496e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f77497f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f77498g;

    /* renamed from: h, reason: collision with root package name */
    public final long f77499h;

    /* compiled from: MarketplaceSalesAdvertPromoBannerItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/marketplace_sales_advert_promo_banner/MarketplaceSalesAdvertPromoBannerItem$AdvertPromoBanner;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class AdvertPromoBanner implements Parcelable {

        @k
        public static final Parcelable.Creator<AdvertPromoBanner> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AdvertPromoBannerPriceBlock f77500b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final UniversalImage f77501c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final FrontImage f77502d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Timer f77503e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final AttributedText f77504f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final AttributedText f77505g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final String f77506h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final String f77507i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final String f77508j;

        /* compiled from: MarketplaceSalesAdvertPromoBannerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AdvertPromoBanner> {
            @Override // android.os.Parcelable.Creator
            public final AdvertPromoBanner createFromParcel(Parcel parcel) {
                return new AdvertPromoBanner(parcel.readInt() == 0 ? null : AdvertPromoBannerPriceBlock.CREATOR.createFromParcel(parcel), (UniversalImage) parcel.readParcelable(AdvertPromoBanner.class.getClassLoader()), FrontImage.CREATOR.createFromParcel(parcel), (Timer) parcel.readParcelable(AdvertPromoBanner.class.getClassLoader()), (AttributedText) parcel.readParcelable(AdvertPromoBanner.class.getClassLoader()), (AttributedText) parcel.readParcelable(AdvertPromoBanner.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AdvertPromoBanner[] newArray(int i12) {
                return new AdvertPromoBanner[i12];
            }
        }

        public AdvertPromoBanner(@l AdvertPromoBannerPriceBlock advertPromoBannerPriceBlock, @k UniversalImage universalImage, @k FrontImage frontImage, @l Timer timer, @l AttributedText attributedText, @l AttributedText attributedText2, @k String str, @l String str2, @l String str3) {
            this.f77500b = advertPromoBannerPriceBlock;
            this.f77501c = universalImage;
            this.f77502d = frontImage;
            this.f77503e = timer;
            this.f77504f = attributedText;
            this.f77505g = attributedText2;
            this.f77506h = str;
            this.f77507i = str2;
            this.f77508j = str3;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final AdvertPromoBannerPriceBlock getF77500b() {
            return this.f77500b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdvertPromoBanner)) {
                return false;
            }
            AdvertPromoBanner advertPromoBanner = (AdvertPromoBanner) obj;
            return L.f(this.f77500b, advertPromoBanner.f77500b) && L.f(this.f77501c, advertPromoBanner.f77501c) && L.f(this.f77502d, advertPromoBanner.f77502d) && L.f(this.f77503e, advertPromoBanner.f77503e) && L.f(this.f77504f, advertPromoBanner.f77504f) && L.f(this.f77505g, advertPromoBanner.f77505g) && L.f(this.f77506h, advertPromoBanner.f77506h) && L.f(this.f77507i, advertPromoBanner.f77507i) && L.f(this.f77508j, advertPromoBanner.f77508j);
        }

        public final int hashCode() {
            AdvertPromoBannerPriceBlock advertPromoBannerPriceBlock = this.f77500b;
            int iA2 = com.avito.android.actions_sheet.a.a(com.avito.android.actions_sheet.a.a((advertPromoBannerPriceBlock == null ? 0 : advertPromoBannerPriceBlock.hashCode()) * 31, 31, this.f77501c), 31, this.f77502d.f77517b);
            Timer timer = this.f77503e;
            int iHashCode = (iA2 + (timer == null ? 0 : timer.hashCode())) * 31;
            AttributedText attributedText = this.f77504f;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            AttributedText attributedText2 = this.f77505g;
            int iD2 = H.d((iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31, 31, this.f77506h);
            String str = this.f77507i;
            int iHashCode3 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f77508j;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertPromoBanner(advertPromoBannerPrice=");
            sb2.append(this.f77500b);
            sb2.append(", backgroundImage=");
            sb2.append(this.f77501c);
            sb2.append(", frontImage=");
            sb2.append(this.f77502d);
            sb2.append(", timer=");
            sb2.append(this.f77503e);
            sb2.append(", title=");
            sb2.append(this.f77504f);
            sb2.append(", subtitle=");
            sb2.append(this.f77505g);
            sb2.append(", itemId=");
            sb2.append(this.f77506h);
            sb2.append(", categoryId=");
            sb2.append(this.f77507i);
            sb2.append(", microCategoryId=");
            return C22026a.c(sb2, this.f77508j, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            AdvertPromoBannerPriceBlock advertPromoBannerPriceBlock = this.f77500b;
            if (advertPromoBannerPriceBlock == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                advertPromoBannerPriceBlock.writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.f77501c, i12);
            this.f77502d.writeToParcel(parcel, i12);
            parcel.writeParcelable(this.f77503e, i12);
            parcel.writeParcelable(this.f77504f, i12);
            parcel.writeParcelable(this.f77505g, i12);
            parcel.writeString(this.f77506h);
            parcel.writeString(this.f77507i);
            parcel.writeString(this.f77508j);
        }
    }

    /* compiled from: MarketplaceSalesAdvertPromoBannerItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/marketplace_sales_advert_promo_banner/MarketplaceSalesAdvertPromoBannerItem$AdvertPromoBannerPrice;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class AdvertPromoBannerPrice implements Parcelable {

        @k
        public static final Parcelable.Creator<AdvertPromoBannerPrice> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f77509b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f77510c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final UniversalColor f77511d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final UniversalColor f77512e;

        /* compiled from: MarketplaceSalesAdvertPromoBannerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AdvertPromoBannerPrice> {
            @Override // android.os.Parcelable.Creator
            public final AdvertPromoBannerPrice createFromParcel(Parcel parcel) {
                return new AdvertPromoBannerPrice(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UniversalColor) parcel.readParcelable(AdvertPromoBannerPrice.class.getClassLoader()), (UniversalColor) parcel.readParcelable(AdvertPromoBannerPrice.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final AdvertPromoBannerPrice[] newArray(int i12) {
                return new AdvertPromoBannerPrice[i12];
            }
        }

        public AdvertPromoBannerPrice(@k String str, @l Integer num, @l UniversalColor universalColor, @l UniversalColor universalColor2) {
            this.f77509b = str;
            this.f77510c = num;
            this.f77511d = universalColor;
            this.f77512e = universalColor2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdvertPromoBannerPrice)) {
                return false;
            }
            AdvertPromoBannerPrice advertPromoBannerPrice = (AdvertPromoBannerPrice) obj;
            return L.f(this.f77509b, advertPromoBannerPrice.f77509b) && L.f(this.f77510c, advertPromoBannerPrice.f77510c) && L.f(this.f77511d, advertPromoBannerPrice.f77511d) && L.f(this.f77512e, advertPromoBannerPrice.f77512e);
        }

        public final int hashCode() {
            int iHashCode = this.f77509b.hashCode() * 31;
            Integer num = this.f77510c;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            UniversalColor universalColor = this.f77511d;
            int iHashCode3 = (iHashCode2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            UniversalColor universalColor2 = this.f77512e;
            return iHashCode3 + (universalColor2 != null ? universalColor2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertPromoBannerPrice(price=");
            sb2.append(this.f77509b);
            sb2.append(", style=");
            sb2.append(this.f77510c);
            sb2.append(", color=");
            sb2.append(this.f77511d);
            sb2.append(", strikethroughColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f77512e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f77509b);
            Integer num = this.f77510c;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeParcelable(this.f77511d, i12);
            parcel.writeParcelable(this.f77512e, i12);
        }
    }

    /* compiled from: MarketplaceSalesAdvertPromoBannerItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/marketplace_sales_advert_promo_banner/MarketplaceSalesAdvertPromoBannerItem$AdvertPromoBannerPriceBlock;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class AdvertPromoBannerPriceBlock implements Parcelable {

        @k
        public static final Parcelable.Creator<AdvertPromoBannerPriceBlock> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AdvertPromoBannerPrice f77513b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedText f77514c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final AdvertPromoBannerPrice f77515d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final AdvertPromoBannerPrice f77516e;

        /* compiled from: MarketplaceSalesAdvertPromoBannerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AdvertPromoBannerPriceBlock> {
            @Override // android.os.Parcelable.Creator
            public final AdvertPromoBannerPriceBlock createFromParcel(Parcel parcel) {
                Parcelable.Creator<AdvertPromoBannerPrice> creator = AdvertPromoBannerPrice.CREATOR;
                return new AdvertPromoBannerPriceBlock(creator.createFromParcel(parcel), (AttributedText) parcel.readParcelable(AdvertPromoBannerPriceBlock.class.getClassLoader()), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final AdvertPromoBannerPriceBlock[] newArray(int i12) {
                return new AdvertPromoBannerPriceBlock[i12];
            }
        }

        public AdvertPromoBannerPriceBlock(@k AdvertPromoBannerPrice advertPromoBannerPrice, @l AttributedText attributedText, @k AdvertPromoBannerPrice advertPromoBannerPrice2, @l AdvertPromoBannerPrice advertPromoBannerPrice3) {
            this.f77513b = advertPromoBannerPrice;
            this.f77514c = attributedText;
            this.f77515d = advertPromoBannerPrice2;
            this.f77516e = advertPromoBannerPrice3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdvertPromoBannerPriceBlock)) {
                return false;
            }
            AdvertPromoBannerPriceBlock advertPromoBannerPriceBlock = (AdvertPromoBannerPriceBlock) obj;
            return L.f(this.f77513b, advertPromoBannerPriceBlock.f77513b) && L.f(this.f77514c, advertPromoBannerPriceBlock.f77514c) && L.f(this.f77515d, advertPromoBannerPriceBlock.f77515d) && L.f(this.f77516e, advertPromoBannerPriceBlock.f77516e);
        }

        public final int hashCode() {
            int iHashCode = this.f77513b.hashCode() * 31;
            AttributedText attributedText = this.f77514c;
            int iHashCode2 = (this.f77515d.hashCode() + ((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31;
            AdvertPromoBannerPrice advertPromoBannerPrice = this.f77516e;
            return iHashCode2 + (advertPromoBannerPrice != null ? advertPromoBannerPrice.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "AdvertPromoBannerPriceBlock(priceWithStyle=" + this.f77513b + ", attributedPrice=" + this.f77514c + ", oldPriceWithStyle=" + this.f77515d + ", oldPriceHintWithStyle=" + this.f77516e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f77513b.writeToParcel(parcel, i12);
            parcel.writeParcelable(this.f77514c, i12);
            this.f77515d.writeToParcel(parcel, i12);
            AdvertPromoBannerPrice advertPromoBannerPrice = this.f77516e;
            if (advertPromoBannerPrice == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                advertPromoBannerPrice.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: MarketplaceSalesAdvertPromoBannerItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/marketplace_sales_advert_promo_banner/MarketplaceSalesAdvertPromoBannerItem$FrontImage;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class FrontImage implements Parcelable {

        @k
        public static final Parcelable.Creator<FrontImage> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UniversalImage f77517b;

        /* compiled from: MarketplaceSalesAdvertPromoBannerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FrontImage> {
            @Override // android.os.Parcelable.Creator
            public final FrontImage createFromParcel(Parcel parcel) {
                return new FrontImage((UniversalImage) parcel.readParcelable(FrontImage.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final FrontImage[] newArray(int i12) {
                return new FrontImage[i12];
            }
        }

        public FrontImage(@k UniversalImage universalImage) {
            this.f77517b = universalImage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FrontImage) && L.f(this.f77517b, ((FrontImage) obj).f77517b);
        }

        public final int hashCode() {
            return this.f77517b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.s(new StringBuilder("FrontImage(image="), this.f77517b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f77517b, i12);
        }
    }

    /* compiled from: MarketplaceSalesAdvertPromoBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MarketplaceSalesAdvertPromoBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final MarketplaceSalesAdvertPromoBannerItem createFromParcel(Parcel parcel) {
            return new MarketplaceSalesAdvertPromoBannerItem(parcel.readLong(), parcel.readString(), AdvertPromoBanner.CREATOR.createFromParcel(parcel), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketplaceSalesAdvertPromoBannerItem[] newArray(int i12) {
            return new MarketplaceSalesAdvertPromoBannerItem[i12];
        }
    }

    public MarketplaceSalesAdvertPromoBannerItem(long j12, @k String str, @k AdvertPromoBanner advertPromoBanner, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f77493b = j12;
        this.f77494c = str;
        this.f77495d = advertPromoBanner;
        this.f77496e = i12;
        this.f77497f = serpDisplayType;
        this.f77498g = serpViewType;
        this.f77499h = j12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new MarketplaceSalesAdvertPromoBannerItem(this.f77493b, this.f77494c, this.f77495d, i12, this.f77497f, this.f77498g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f77497f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketplaceSalesAdvertPromoBannerItem)) {
            return false;
        }
        MarketplaceSalesAdvertPromoBannerItem marketplaceSalesAdvertPromoBannerItem = (MarketplaceSalesAdvertPromoBannerItem) obj;
        return this.f77493b == marketplaceSalesAdvertPromoBannerItem.f77493b && L.f(this.f77494c, marketplaceSalesAdvertPromoBannerItem.f77494c) && L.f(this.f77495d, marketplaceSalesAdvertPromoBannerItem.f77495d) && this.f77496e == marketplaceSalesAdvertPromoBannerItem.f77496e && this.f77497f == marketplaceSalesAdvertPromoBannerItem.f77497f && this.f77498g == marketplaceSalesAdvertPromoBannerItem.f77498g;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final AdvertPromoBanner getF77495d() {
        return this.f77495d;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF79389b() {
        return this.f77493b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF264887c() {
        return this.f77496e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283255b() {
        return this.f77494c;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF77262i() {
        return this.f77499h;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF82956h() {
        return this.f77498g;
    }

    public final int hashCode() {
        return this.f77498g.hashCode() + com.avito.android.actions_sheet.a.h(this.f77497f, r.e(this.f77496e, (this.f77495d.hashCode() + H.d(Long.hashCode(this.f77493b) * 31, 31, this.f77494c)) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MarketplaceSalesAdvertPromoBannerItem(id=");
        sb2.append(this.f77493b);
        sb2.append(", stringId=");
        sb2.append(this.f77494c);
        sb2.append(", salesAdvertPromoBanner=");
        sb2.append(this.f77495d);
        sb2.append(", spanCount=");
        sb2.append(this.f77496e);
        sb2.append(", displayType=");
        sb2.append(this.f77497f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f77498g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f77493b);
        parcel.writeString(this.f77494c);
        this.f77495d.writeToParcel(parcel, i12);
        parcel.writeInt(this.f77496e);
        parcel.writeString(this.f77497f.name());
        parcel.writeString(this.f77498g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MarketplaceSalesAdvertPromoBannerItem(long j12, String str, AdvertPromoBanner advertPromoBanner, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 82;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, advertPromoBanner, i12, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
