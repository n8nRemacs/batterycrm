package com.avito.android.remote.model.category_parameters.slot.market_price;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge.Badge;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MarketPriceResponse.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ0\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b%\u0010\r¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceBadge;", "Lcom/avito/android/remote/model/badge/Badge;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/UniversalColor;", "universalTitleColor", "universalBackgroundColor", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/category_parameters/slot/market_price/MarketPriceBadge;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/UniversalColor;", "getUniversalTitleColor", "getUniversalBackgroundColor", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MarketPriceBadge implements Badge, Parcelable {

    @k
    public static final Parcelable.Creator<MarketPriceBadge> CREATOR = new Creator();

    @c("title")
    @k
    private final String title;

    @c("backgroundColor")
    @l
    private final UniversalColor universalBackgroundColor;

    @c("titleColor")
    @k
    private final UniversalColor universalTitleColor;

    /* compiled from: MarketPriceResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MarketPriceBadge> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MarketPriceBadge createFromParcel(@k Parcel parcel) {
            return new MarketPriceBadge(parcel.readString(), (UniversalColor) parcel.readParcelable(MarketPriceBadge.class.getClassLoader()), (UniversalColor) parcel.readParcelable(MarketPriceBadge.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MarketPriceBadge[] newArray(int i12) {
            return new MarketPriceBadge[i12];
        }
    }

    public MarketPriceBadge(@k String str, @k UniversalColor universalColor, @l UniversalColor universalColor2) {
        this.title = str;
        this.universalTitleColor = universalColor;
        this.universalBackgroundColor = universalColor2;
    }

    public static /* synthetic */ MarketPriceBadge copy$default(MarketPriceBadge marketPriceBadge, String str, UniversalColor universalColor, UniversalColor universalColor2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = marketPriceBadge.title;
        }
        if ((i12 & 2) != 0) {
            universalColor = marketPriceBadge.universalTitleColor;
        }
        if ((i12 & 4) != 0) {
            universalColor2 = marketPriceBadge.universalBackgroundColor;
        }
        return marketPriceBadge.copy(str, universalColor, universalColor2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getUniversalTitleColor() {
        return this.universalTitleColor;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getUniversalBackgroundColor() {
        return this.universalBackgroundColor;
    }

    @k
    public final MarketPriceBadge copy(@k String title, @k UniversalColor universalTitleColor, @l UniversalColor universalBackgroundColor) {
        return new MarketPriceBadge(title, universalTitleColor, universalBackgroundColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketPriceBadge)) {
            return false;
        }
        MarketPriceBadge marketPriceBadge = (MarketPriceBadge) other;
        return L.f(this.title, marketPriceBadge.title) && L.f(this.universalTitleColor, marketPriceBadge.universalTitleColor) && L.f(this.universalBackgroundColor, marketPriceBadge.universalBackgroundColor);
    }

    @Override // com.avito.android.remote.model.badge.Badge
    @k
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.badge.Badge
    @l
    public UniversalColor getUniversalBackgroundColor() {
        return this.universalBackgroundColor;
    }

    @Override // com.avito.android.remote.model.badge.Badge
    @k
    public UniversalColor getUniversalTitleColor() {
        return this.universalTitleColor;
    }

    public int hashCode() {
        int i12 = a.i(this.universalTitleColor, this.title.hashCode() * 31, 31);
        UniversalColor universalColor = this.universalBackgroundColor;
        return i12 + (universalColor == null ? 0 : universalColor.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MarketPriceBadge(title=");
        sb2.append(this.title);
        sb2.append(", universalTitleColor=");
        sb2.append(this.universalTitleColor);
        sb2.append(", universalBackgroundColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.universalBackgroundColor, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeParcelable(this.universalTitleColor, flags);
        parcel.writeParcelable(this.universalBackgroundColor, flags);
    }
}
