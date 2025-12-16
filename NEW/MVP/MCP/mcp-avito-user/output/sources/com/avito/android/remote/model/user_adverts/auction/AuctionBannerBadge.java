package com.avito.android.remote.model.user_adverts.auction;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AuctionBannerBadge.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/user_adverts/auction/AuctionBannerBadge;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/UniversalColor;", "universalTitleColor", "universalBackgroundColor", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/user_adverts/auction/AuctionBannerBadge;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/UniversalColor;", "getUniversalTitleColor", "getUniversalBackgroundColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AuctionBannerBadge implements Parcelable {

    @k
    public static final Parcelable.Creator<AuctionBannerBadge> CREATOR = new Creator();

    @c("text")
    @k
    private final String title;

    @c("color")
    @l
    private final UniversalColor universalBackgroundColor;

    @c("textColor")
    @l
    private final UniversalColor universalTitleColor;

    /* compiled from: AuctionBannerBadge.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AuctionBannerBadge> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AuctionBannerBadge createFromParcel(@k Parcel parcel) {
            return new AuctionBannerBadge(parcel.readString(), (UniversalColor) parcel.readParcelable(AuctionBannerBadge.class.getClassLoader()), (UniversalColor) parcel.readParcelable(AuctionBannerBadge.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AuctionBannerBadge[] newArray(int i12) {
            return new AuctionBannerBadge[i12];
        }
    }

    public AuctionBannerBadge(@k String str, @l UniversalColor universalColor, @l UniversalColor universalColor2) {
        this.title = str;
        this.universalTitleColor = universalColor;
        this.universalBackgroundColor = universalColor2;
    }

    public static /* synthetic */ AuctionBannerBadge copy$default(AuctionBannerBadge auctionBannerBadge, String str, UniversalColor universalColor, UniversalColor universalColor2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = auctionBannerBadge.title;
        }
        if ((i12 & 2) != 0) {
            universalColor = auctionBannerBadge.universalTitleColor;
        }
        if ((i12 & 4) != 0) {
            universalColor2 = auctionBannerBadge.universalBackgroundColor;
        }
        return auctionBannerBadge.copy(str, universalColor, universalColor2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
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
    public final AuctionBannerBadge copy(@k String title, @l UniversalColor universalTitleColor, @l UniversalColor universalBackgroundColor) {
        return new AuctionBannerBadge(title, universalTitleColor, universalBackgroundColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuctionBannerBadge)) {
            return false;
        }
        AuctionBannerBadge auctionBannerBadge = (AuctionBannerBadge) other;
        return L.f(this.title, auctionBannerBadge.title) && L.f(this.universalTitleColor, auctionBannerBadge.universalTitleColor) && L.f(this.universalBackgroundColor, auctionBannerBadge.universalBackgroundColor);
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final UniversalColor getUniversalBackgroundColor() {
        return this.universalBackgroundColor;
    }

    @l
    public final UniversalColor getUniversalTitleColor() {
        return this.universalTitleColor;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        UniversalColor universalColor = this.universalTitleColor;
        int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UniversalColor universalColor2 = this.universalBackgroundColor;
        return iHashCode2 + (universalColor2 != null ? universalColor2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AuctionBannerBadge(title=");
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

    public /* synthetic */ AuctionBannerBadge(String str, UniversalColor universalColor, UniversalColor universalColor2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : universalColor, (i12 & 4) != 0 ? null : universalColor2);
    }
}
