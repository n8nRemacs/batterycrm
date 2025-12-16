package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PriceBadge.kt */
@d
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u008f\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u0015J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u0015J\u009c\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b%\u0010\u0015J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020&HÖ\u0001¢\u0006\u0004\b.\u0010(J \u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020&HÖ\u0001¢\u0006\u0004\b3\u00104R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b6\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b7\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b:\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b;\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b<\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b=\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b>\u0010\u0015R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b?\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bA\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\bB\u0010\u0015R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\bC\u0010\u0015R\u001a\u0010I\u001a\u00020D8VX\u0096\u0004¢\u0006\f\u0012\u0004\bG\u0010H\u001a\u0004\bE\u0010FR\u001c\u0010L\u001a\u0004\u0018\u00010D8VX\u0096\u0004¢\u0006\f\u0012\u0004\bK\u0010H\u001a\u0004\bJ\u0010F¨\u0006M"}, d2 = {"Lcom/avito/android/remote/model/PriceBadge;", "Lcom/avito/android/remote/model/badge/Badge;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/remote/model/Color;", "titleColor", "titleColorDark", "titleColorName", "backgroundColor", "backgroundColorDark", "backgroundColorName", ContextActionHandler.Link.URL, "Lcom/avito/android/remote/model/MarketPriceImageName;", "image", "marketPrice", "priceType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Color;Lcom/avito/android/remote/model/Color;Ljava/lang/String;Lcom/avito/android/remote/model/Color;Lcom/avito/android/remote/model/Color;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/MarketPriceImageName;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/Color;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Lcom/avito/android/remote/model/MarketPriceImageName;", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Color;Lcom/avito/android/remote/model/Color;Ljava/lang/String;Lcom/avito/android/remote/model/Color;Lcom/avito/android/remote/model/Color;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/MarketPriceImageName;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/PriceBadge;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/Color;", "getTitleColor", "getTitleColorDark", "getTitleColorName", "getBackgroundColor", "getBackgroundColorDark", "getBackgroundColorName", "getUrl", "Lcom/avito/android/remote/model/MarketPriceImageName;", "getImage", "getMarketPrice", "getPriceType", "Lcom/avito/android/remote/model/UniversalColor;", "getUniversalTitleColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getUniversalTitleColor$annotations", "()V", "universalTitleColor", "getUniversalBackgroundColor", "getUniversalBackgroundColor$annotations", "universalBackgroundColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PriceBadge implements com.avito.android.remote.model.badge.Badge, Parcelable {

    @k
    public static final Parcelable.Creator<PriceBadge> CREATOR = new Creator();

    @c("backgroundColor")
    @l
    private final Color backgroundColor;

    @c("backgroundColorDark")
    @l
    private final Color backgroundColorDark;

    @c("backgroundColorName")
    @l
    private final String backgroundColorName;

    @c("image")
    @l
    private final MarketPriceImageName image;

    @c("marketPrice")
    @l
    private final String marketPrice;

    @c("priceType")
    @l
    private final String priceType;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    @c("titleColor")
    @k
    private final Color titleColor;

    @c("titleColorDark")
    @l
    private final Color titleColorDark;

    @c("titleColorName")
    @l
    private final String titleColorName;

    @c(ContextActionHandler.Link.URL)
    @l
    private final String url;

    /* compiled from: PriceBadge.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PriceBadge> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PriceBadge createFromParcel(@k Parcel parcel) {
            return new PriceBadge(parcel.readString(), parcel.readString(), (Color) parcel.readParcelable(PriceBadge.class.getClassLoader()), (Color) parcel.readParcelable(PriceBadge.class.getClassLoader()), parcel.readString(), (Color) parcel.readParcelable(PriceBadge.class.getClassLoader()), (Color) parcel.readParcelable(PriceBadge.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : MarketPriceImageName.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PriceBadge[] newArray(int i12) {
            return new PriceBadge[i12];
        }
    }

    public PriceBadge(@k String str, @l String str2, @k Color color, @l Color color2, @l String str3, @l Color color3, @l Color color4, @l String str4, @l String str5, @l MarketPriceImageName marketPriceImageName, @l String str6, @l String str7) {
        this.title = str;
        this.subtitle = str2;
        this.titleColor = color;
        this.titleColorDark = color2;
        this.titleColorName = str3;
        this.backgroundColor = color3;
        this.backgroundColorDark = color4;
        this.backgroundColorName = str4;
        this.url = str5;
        this.image = marketPriceImageName;
        this.marketPrice = str6;
        this.priceType = str7;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final MarketPriceImageName getImage() {
        return this.image;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String getMarketPrice() {
        return this.marketPrice;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final String getPriceType() {
        return this.priceType;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final Color getTitleColor() {
        return this.titleColor;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Color getTitleColorDark() {
        return this.titleColorDark;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getTitleColorName() {
        return this.titleColorName;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Color getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Color getBackgroundColorDark() {
        return this.backgroundColorDark;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getBackgroundColorName() {
        return this.backgroundColorName;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @k
    public final PriceBadge copy(@k String title, @l String subtitle, @k Color titleColor, @l Color titleColorDark, @l String titleColorName, @l Color backgroundColor, @l Color backgroundColorDark, @l String backgroundColorName, @l String url, @l MarketPriceImageName image, @l String marketPrice, @l String priceType) {
        return new PriceBadge(title, subtitle, titleColor, titleColorDark, titleColorName, backgroundColor, backgroundColorDark, backgroundColorName, url, image, marketPrice, priceType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceBadge)) {
            return false;
        }
        PriceBadge priceBadge = (PriceBadge) other;
        return L.f(this.title, priceBadge.title) && L.f(this.subtitle, priceBadge.subtitle) && L.f(this.titleColor, priceBadge.titleColor) && L.f(this.titleColorDark, priceBadge.titleColorDark) && L.f(this.titleColorName, priceBadge.titleColorName) && L.f(this.backgroundColor, priceBadge.backgroundColor) && L.f(this.backgroundColorDark, priceBadge.backgroundColorDark) && L.f(this.backgroundColorName, priceBadge.backgroundColorName) && L.f(this.url, priceBadge.url) && this.image == priceBadge.image && L.f(this.marketPrice, priceBadge.marketPrice) && L.f(this.priceType, priceBadge.priceType);
    }

    @l
    public final Color getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final Color getBackgroundColorDark() {
        return this.backgroundColorDark;
    }

    @l
    public final String getBackgroundColorName() {
        return this.backgroundColorName;
    }

    @l
    public final MarketPriceImageName getImage() {
        return this.image;
    }

    @l
    public final String getMarketPrice() {
        return this.marketPrice;
    }

    @l
    public final String getPriceType() {
        return this.priceType;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Override // com.avito.android.remote.model.badge.Badge
    @k
    public String getTitle() {
        return this.title;
    }

    @k
    public final Color getTitleColor() {
        return this.titleColor;
    }

    @l
    public final Color getTitleColorDark() {
        return this.titleColorDark;
    }

    @l
    public final String getTitleColorName() {
        return this.titleColorName;
    }

    @Override // com.avito.android.remote.model.badge.Badge
    @l
    /* renamed from: getUniversalBackgroundColor */
    public UniversalColor getF268991d() {
        Color color = this.backgroundColor;
        if (color == null && this.backgroundColorName == null) {
            return null;
        }
        return UniversalColorKt.universalColorOf(this.backgroundColorName, color, this.backgroundColorDark);
    }

    @Override // com.avito.android.remote.model.badge.Badge
    @k
    /* renamed from: getUniversalTitleColor */
    public UniversalColor getF268990c() {
        return UniversalColorKt.universalColorOf(this.titleColorName, this.titleColor, this.titleColorDark);
    }

    @l
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (this.titleColor.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Color color = this.titleColorDark;
        int iHashCode3 = (iHashCode2 + (color == null ? 0 : color.hashCode())) * 31;
        String str2 = this.titleColorName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Color color2 = this.backgroundColor;
        int iHashCode5 = (iHashCode4 + (color2 == null ? 0 : color2.hashCode())) * 31;
        Color color3 = this.backgroundColorDark;
        int iHashCode6 = (iHashCode5 + (color3 == null ? 0 : color3.hashCode())) * 31;
        String str3 = this.backgroundColorName;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MarketPriceImageName marketPriceImageName = this.image;
        int iHashCode9 = (iHashCode8 + (marketPriceImageName == null ? 0 : marketPriceImageName.hashCode())) * 31;
        String str5 = this.marketPrice;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.priceType;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PriceBadge(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", titleColor=");
        sb2.append(this.titleColor);
        sb2.append(", titleColorDark=");
        sb2.append(this.titleColorDark);
        sb2.append(", titleColorName=");
        sb2.append(this.titleColorName);
        sb2.append(", backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", backgroundColorDark=");
        sb2.append(this.backgroundColorDark);
        sb2.append(", backgroundColorName=");
        sb2.append(this.backgroundColorName);
        sb2.append(", url=");
        sb2.append(this.url);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", marketPrice=");
        sb2.append(this.marketPrice);
        sb2.append(", priceType=");
        return C22026a.c(sb2, this.priceType, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.titleColor, flags);
        parcel.writeParcelable(this.titleColorDark, flags);
        parcel.writeString(this.titleColorName);
        parcel.writeParcelable(this.backgroundColor, flags);
        parcel.writeParcelable(this.backgroundColorDark, flags);
        parcel.writeString(this.backgroundColorName);
        parcel.writeString(this.url);
        MarketPriceImageName marketPriceImageName = this.image;
        if (marketPriceImageName == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketPriceImageName.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.marketPrice);
        parcel.writeString(this.priceType);
    }

    public static /* synthetic */ void getUniversalBackgroundColor$annotations() {
    }

    public static /* synthetic */ void getUniversalTitleColor$annotations() {
    }

    public /* synthetic */ PriceBadge(String str, String str2, Color color, Color color2, String str3, Color color3, Color color4, String str4, String str5, MarketPriceImageName marketPriceImageName, String str6, String str7, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, color, (i12 & 8) != 0 ? null : color2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : color3, (i12 & 64) != 0 ? null : color4, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? null : str5, (i12 & 512) != 0 ? null : marketPriceImageName, (i12 & 1024) != 0 ? null : str6, (i12 & 2048) != 0 ? null : str7);
    }
}
