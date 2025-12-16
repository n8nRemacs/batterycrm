package com.avito.android.remote.model.badge_bar;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SerpBadge.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJV\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010\u001f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010 J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010\u001b¨\u00069"}, d2 = {"Lcom/avito/android/remote/model/badge_bar/SerpBadge;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeType;", "type", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/badge_bar/SerpBadgeStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/badge_bar/SerpBadgeIcon;", "icon", "", "version", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/badge_bar/SerpBadgeType;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/badge_bar/SerpBadgeStyle;Lcom/avito/android/remote/model/badge_bar/SerpBadgeIcon;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/badge_bar/SerpBadgeType;", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "()Lcom/avito/android/remote/model/badge_bar/SerpBadgeStyle;", "component5", "()Lcom/avito/android/remote/model/badge_bar/SerpBadgeIcon;", "component6", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/badge_bar/SerpBadgeType;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/badge_bar/SerpBadgeStyle;Lcom/avito/android/remote/model/badge_bar/SerpBadgeIcon;Ljava/lang/Integer;)Lcom/avito/android/remote/model/badge_bar/SerpBadge;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeType;", "getType", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeStyle;", "getStyle", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeIcon;", "getIcon", "Ljava/lang/Integer;", "getVersion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SerpBadge implements Parcelable {

    @k
    public static final Parcelable.Creator<SerpBadge> CREATOR = new Creator();

    @c("tooltipUri")
    @l
    private final DeepLink deeplink;

    @c("icon")
    @l
    private final SerpBadgeIcon icon;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final SerpBadgeStyle style;

    @c("title")
    @k
    private final String title;

    @c("type")
    @l
    private final SerpBadgeType type;

    @c("version")
    @l
    private final Integer version;

    /* compiled from: SerpBadge.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SerpBadge> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SerpBadge createFromParcel(@k Parcel parcel) {
            return new SerpBadge(parcel.readString(), parcel.readInt() == 0 ? null : SerpBadgeType.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(SerpBadge.class.getClassLoader()), parcel.readInt() == 0 ? null : SerpBadgeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SerpBadgeIcon.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SerpBadge[] newArray(int i12) {
            return new SerpBadge[i12];
        }
    }

    public SerpBadge(@k String str, @l SerpBadgeType serpBadgeType, @l DeepLink deepLink, @l SerpBadgeStyle serpBadgeStyle, @l SerpBadgeIcon serpBadgeIcon, @l Integer num) {
        this.title = str;
        this.type = serpBadgeType;
        this.deeplink = deepLink;
        this.style = serpBadgeStyle;
        this.icon = serpBadgeIcon;
        this.version = num;
    }

    public static /* synthetic */ SerpBadge copy$default(SerpBadge serpBadge, String str, SerpBadgeType serpBadgeType, DeepLink deepLink, SerpBadgeStyle serpBadgeStyle, SerpBadgeIcon serpBadgeIcon, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = serpBadge.title;
        }
        if ((i12 & 2) != 0) {
            serpBadgeType = serpBadge.type;
        }
        SerpBadgeType serpBadgeType2 = serpBadgeType;
        if ((i12 & 4) != 0) {
            deepLink = serpBadge.deeplink;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 8) != 0) {
            serpBadgeStyle = serpBadge.style;
        }
        SerpBadgeStyle serpBadgeStyle2 = serpBadgeStyle;
        if ((i12 & 16) != 0) {
            serpBadgeIcon = serpBadge.icon;
        }
        SerpBadgeIcon serpBadgeIcon2 = serpBadgeIcon;
        if ((i12 & 32) != 0) {
            num = serpBadge.version;
        }
        return serpBadge.copy(str, serpBadgeType2, deepLink2, serpBadgeStyle2, serpBadgeIcon2, num);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final SerpBadgeType getType() {
        return this.type;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final SerpBadgeStyle getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final SerpBadgeIcon getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    @k
    public final SerpBadge copy(@k String title, @l SerpBadgeType type, @l DeepLink deeplink, @l SerpBadgeStyle style, @l SerpBadgeIcon icon, @l Integer version) {
        return new SerpBadge(title, type, deeplink, style, icon, version);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SerpBadge)) {
            return false;
        }
        SerpBadge serpBadge = (SerpBadge) other;
        return L.f(this.title, serpBadge.title) && this.type == serpBadge.type && L.f(this.deeplink, serpBadge.deeplink) && L.f(this.style, serpBadge.style) && L.f(this.icon, serpBadge.icon) && L.f(this.version, serpBadge.version);
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final SerpBadgeIcon getIcon() {
        return this.icon;
    }

    @l
    public final SerpBadgeStyle getStyle() {
        return this.style;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final SerpBadgeType getType() {
        return this.type;
    }

    @l
    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        SerpBadgeType serpBadgeType = this.type;
        int iHashCode2 = (iHashCode + (serpBadgeType == null ? 0 : serpBadgeType.hashCode())) * 31;
        DeepLink deepLink = this.deeplink;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        SerpBadgeStyle serpBadgeStyle = this.style;
        int iHashCode4 = (iHashCode3 + (serpBadgeStyle == null ? 0 : serpBadgeStyle.hashCode())) * 31;
        SerpBadgeIcon serpBadgeIcon = this.icon;
        int iHashCode5 = (iHashCode4 + (serpBadgeIcon == null ? 0 : serpBadgeIcon.hashCode())) * 31;
        Integer num = this.version;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SerpBadge(title=");
        sb2.append(this.title);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", deeplink=");
        sb2.append(this.deeplink);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", version=");
        return s.j(sb2, this.version, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        SerpBadgeType serpBadgeType = this.type;
        if (serpBadgeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(serpBadgeType.name());
        }
        parcel.writeParcelable(this.deeplink, flags);
        SerpBadgeStyle serpBadgeStyle = this.style;
        if (serpBadgeStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serpBadgeStyle.writeToParcel(parcel, flags);
        }
        SerpBadgeIcon serpBadgeIcon = this.icon;
        if (serpBadgeIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serpBadgeIcon.writeToParcel(parcel, flags);
        }
        Integer num = this.version;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
    }

    public /* synthetic */ SerpBadge(String str, SerpBadgeType serpBadgeType, DeepLink deepLink, SerpBadgeStyle serpBadgeStyle, SerpBadgeIcon serpBadgeIcon, Integer num, int i12, C42822w c42822w) {
        this(str, serpBadgeType, deepLink, serpBadgeStyle, (i12 & 16) != 0 ? null : serpBadgeIcon, (i12 & 32) != 0 ? null : num);
    }
}
