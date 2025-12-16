package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsPriceDescriptionButton.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/AdvertDetailsPriceDescriptionButton;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "", "text", "Lcom/avito/android/remote/model/AdvertDetailsPriceDescriptionButton$IconType;", "leftIconType", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertDetailsPriceDescriptionButton$IconType;)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/AdvertDetailsPriceDescriptionButton$IconType;", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertDetailsPriceDescriptionButton$IconType;)Lcom/avito/android/remote/model/AdvertDetailsPriceDescriptionButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/AdvertDetailsPriceDescriptionButton$IconType;", "getLeftIconType", "IconType", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertDetailsPriceDescriptionButton implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertDetailsPriceDescriptionButton> CREATOR = new Creator();

    @c("leftIconType")
    @l
    private final IconType leftIconType;

    @c("text")
    @l
    private final String text;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    /* compiled from: AdvertDetailsPriceDescriptionButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertDetailsPriceDescriptionButton> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDetailsPriceDescriptionButton createFromParcel(@k Parcel parcel) {
            return new AdvertDetailsPriceDescriptionButton((DeepLink) parcel.readParcelable(AdvertDetailsPriceDescriptionButton.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : IconType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDetailsPriceDescriptionButton[] newArray(int i12) {
            return new AdvertDetailsPriceDescriptionButton[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdvertDetailsPriceDescriptionButton.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/model/AdvertDetailsPriceDescriptionButton$IconType;", "", "(Ljava/lang/String;I)V", "BUYER_BONUSES", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IconType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconType[] $VALUES;

        @c("buyerBonuses")
        public static final IconType BUYER_BONUSES = new IconType("BUYER_BONUSES", 0);

        private static final /* synthetic */ IconType[] $values() {
            return new IconType[]{BUYER_BONUSES};
        }

        static {
            IconType[] iconTypeArr$values = $values();
            $VALUES = iconTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(iconTypeArr$values);
        }

        private IconType(String str, int i12) {
        }

        @k
        public static a<IconType> getEntries() {
            return $ENTRIES;
        }

        public static IconType valueOf(String str) {
            return (IconType) Enum.valueOf(IconType.class, str);
        }

        public static IconType[] values() {
            return (IconType[]) $VALUES.clone();
        }
    }

    public AdvertDetailsPriceDescriptionButton(@l DeepLink deepLink, @l String str, @l IconType iconType) {
        this.uri = deepLink;
        this.text = str;
        this.leftIconType = iconType;
    }

    public static /* synthetic */ AdvertDetailsPriceDescriptionButton copy$default(AdvertDetailsPriceDescriptionButton advertDetailsPriceDescriptionButton, DeepLink deepLink, String str, IconType iconType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            deepLink = advertDetailsPriceDescriptionButton.uri;
        }
        if ((i12 & 2) != 0) {
            str = advertDetailsPriceDescriptionButton.text;
        }
        if ((i12 & 4) != 0) {
            iconType = advertDetailsPriceDescriptionButton.leftIconType;
        }
        return advertDetailsPriceDescriptionButton.copy(deepLink, str, iconType);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final IconType getLeftIconType() {
        return this.leftIconType;
    }

    @k
    public final AdvertDetailsPriceDescriptionButton copy(@l DeepLink uri, @l String text, @l IconType leftIconType) {
        return new AdvertDetailsPriceDescriptionButton(uri, text, leftIconType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertDetailsPriceDescriptionButton)) {
            return false;
        }
        AdvertDetailsPriceDescriptionButton advertDetailsPriceDescriptionButton = (AdvertDetailsPriceDescriptionButton) other;
        return L.f(this.uri, advertDetailsPriceDescriptionButton.uri) && L.f(this.text, advertDetailsPriceDescriptionButton.text) && this.leftIconType == advertDetailsPriceDescriptionButton.leftIconType;
    }

    @l
    public final IconType getLeftIconType() {
        return this.leftIconType;
    }

    @l
    public final String getText() {
        return this.text;
    }

    @l
    public final DeepLink getUri() {
        return this.uri;
    }

    public int hashCode() {
        DeepLink deepLink = this.uri;
        int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        IconType iconType = this.leftIconType;
        return iHashCode2 + (iconType != null ? iconType.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AdvertDetailsPriceDescriptionButton(uri=" + this.uri + ", text=" + this.text + ", leftIconType=" + this.leftIconType + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.uri, flags);
        parcel.writeString(this.text);
        IconType iconType = this.leftIconType;
        if (iconType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iconType.name());
        }
    }
}
