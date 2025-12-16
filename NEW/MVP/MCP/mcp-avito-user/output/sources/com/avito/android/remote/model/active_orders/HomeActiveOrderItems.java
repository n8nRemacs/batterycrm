package com.avito.android.remote.model.active_orders;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: HomeActiveOrderItems.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002$%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/active_orders/HomeActiveOrderItems;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/active_orders/HomeActiveOrderItems$ItemType;", "type", "Lcom/avito/android/remote/model/active_orders/HomeActiveOrderItems$ItemContent;", "content", "<init>", "(Lcom/avito/android/remote/model/active_orders/HomeActiveOrderItems$ItemType;Lcom/avito/android/remote/model/active_orders/HomeActiveOrderItems$ItemContent;)V", "component1", "()Lcom/avito/android/remote/model/active_orders/HomeActiveOrderItems$ItemType;", "component2", "()Lcom/avito/android/remote/model/active_orders/HomeActiveOrderItems$ItemContent;", "copy", "(Lcom/avito/android/remote/model/active_orders/HomeActiveOrderItems$ItemType;Lcom/avito/android/remote/model/active_orders/HomeActiveOrderItems$ItemContent;)Lcom/avito/android/remote/model/active_orders/HomeActiveOrderItems;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/active_orders/HomeActiveOrderItems$ItemType;", "getType", "Lcom/avito/android/remote/model/active_orders/HomeActiveOrderItems$ItemContent;", "getContent", "ItemContent", "ItemType", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class HomeActiveOrderItems implements Parcelable {

    @k
    public static final Parcelable.Creator<HomeActiveOrderItems> CREATOR = new Creator();

    @c("content")
    @k
    private final ItemContent content;

    @c("type")
    @k
    private final ItemType type;

    /* compiled from: HomeActiveOrderItems.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HomeActiveOrderItems> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final HomeActiveOrderItems createFromParcel(@k Parcel parcel) {
            return new HomeActiveOrderItems(ItemType.valueOf(parcel.readString()), ItemContent.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final HomeActiveOrderItems[] newArray(int i12) {
            return new HomeActiveOrderItems[i12];
        }
    }

    /* compiled from: HomeActiveOrderItems.kt */
    @d
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JL\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b\t\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u0017¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/active_orders/HomeActiveOrderItems$ItemContent;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "onTapDeepLink", "", "isMultipleItems", "Lcom/avito/android/remote/model/Image;", "image", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Lcom/avito/android/remote/model/Image;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "()Ljava/lang/Boolean;", "component5", "()Lcom/avito/android/remote/model/Image;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Lcom/avito/android/remote/model/Image;)Lcom/avito/android/remote/model/active_orders/HomeActiveOrderItems$ItemContent;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnTapDeepLink", "Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/Image;", "getImage", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemContent implements Parcelable {

        @k
        public static final Parcelable.Creator<ItemContent> CREATOR = new Creator();

        @c("image")
        @l
        private final Image image;

        @c("isMultipleItems")
        @l
        private final Boolean isMultipleItems;

        @c("onTapDeepLink")
        @l
        private final DeepLink onTapDeepLink;

        @c("subtitle")
        @l
        private final AttributedText subtitle;

        @c("title")
        @l
        private final String title;

        /* compiled from: HomeActiveOrderItems.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ItemContent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ItemContent createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                AttributedText attributedText = (AttributedText) parcel.readParcelable(ItemContent.class.getClassLoader());
                DeepLink deepLink = (DeepLink) parcel.readParcelable(ItemContent.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new ItemContent(string, attributedText, deepLink, boolValueOf, (Image) parcel.readParcelable(ItemContent.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ItemContent[] newArray(int i12) {
                return new ItemContent[i12];
            }
        }

        public ItemContent(@l String str, @l AttributedText attributedText, @l DeepLink deepLink, @l Boolean bool, @l Image image) {
            this.title = str;
            this.subtitle = attributedText;
            this.onTapDeepLink = deepLink;
            this.isMultipleItems = bool;
            this.image = image;
        }

        public static /* synthetic */ ItemContent copy$default(ItemContent itemContent, String str, AttributedText attributedText, DeepLink deepLink, Boolean bool, Image image, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = itemContent.title;
            }
            if ((i12 & 2) != 0) {
                attributedText = itemContent.subtitle;
            }
            AttributedText attributedText2 = attributedText;
            if ((i12 & 4) != 0) {
                deepLink = itemContent.onTapDeepLink;
            }
            DeepLink deepLink2 = deepLink;
            if ((i12 & 8) != 0) {
                bool = itemContent.isMultipleItems;
            }
            Boolean bool2 = bool;
            if ((i12 & 16) != 0) {
                image = itemContent.image;
            }
            return itemContent.copy(str, attributedText2, deepLink2, bool2, image);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final DeepLink getOnTapDeepLink() {
            return this.onTapDeepLink;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Boolean getIsMultipleItems() {
            return this.isMultipleItems;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @k
        public final ItemContent copy(@l String title, @l AttributedText subtitle, @l DeepLink onTapDeepLink, @l Boolean isMultipleItems, @l Image image) {
            return new ItemContent(title, subtitle, onTapDeepLink, isMultipleItems, image);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemContent)) {
                return false;
            }
            ItemContent itemContent = (ItemContent) other;
            return L.f(this.title, itemContent.title) && L.f(this.subtitle, itemContent.subtitle) && L.f(this.onTapDeepLink, itemContent.onTapDeepLink) && L.f(this.isMultipleItems, itemContent.isMultipleItems) && L.f(this.image, itemContent.image);
        }

        @l
        public final Image getImage() {
            return this.image;
        }

        @l
        public final DeepLink getOnTapDeepLink() {
            return this.onTapDeepLink;
        }

        @l
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AttributedText attributedText = this.subtitle;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            DeepLink deepLink = this.onTapDeepLink;
            int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Boolean bool = this.isMultipleItems;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Image image = this.image;
            return iHashCode4 + (image != null ? image.hashCode() : 0);
        }

        @l
        public final Boolean isMultipleItems() {
            return this.isMultipleItems;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ItemContent(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", onTapDeepLink=");
            sb2.append(this.onTapDeepLink);
            sb2.append(", isMultipleItems=");
            sb2.append(this.isMultipleItems);
            sb2.append(", image=");
            return AK.c.o(sb2, this.image, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.subtitle, flags);
            parcel.writeParcelable(this.onTapDeepLink, flags);
            Boolean bool = this.isMultipleItems;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeParcelable(this.image, flags);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HomeActiveOrderItems.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/active_orders/HomeActiveOrderItems$ItemType;", "", "(Ljava/lang/String;I)V", "GOODS_ORDER", "SHOW_ALL", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ItemType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ItemType[] $VALUES;

        @c("goodsOrder")
        public static final ItemType GOODS_ORDER = new ItemType("GOODS_ORDER", 0);

        @c("showAll")
        public static final ItemType SHOW_ALL = new ItemType("SHOW_ALL", 1);

        private static final /* synthetic */ ItemType[] $values() {
            return new ItemType[]{GOODS_ORDER, SHOW_ALL};
        }

        static {
            ItemType[] itemTypeArr$values = $values();
            $VALUES = itemTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(itemTypeArr$values);
        }

        private ItemType(String str, int i12) {
        }

        @k
        public static a<ItemType> getEntries() {
            return $ENTRIES;
        }

        public static ItemType valueOf(String str) {
            return (ItemType) Enum.valueOf(ItemType.class, str);
        }

        public static ItemType[] values() {
            return (ItemType[]) $VALUES.clone();
        }
    }

    public HomeActiveOrderItems(@k ItemType itemType, @k ItemContent itemContent) {
        this.type = itemType;
        this.content = itemContent;
    }

    public static /* synthetic */ HomeActiveOrderItems copy$default(HomeActiveOrderItems homeActiveOrderItems, ItemType itemType, ItemContent itemContent, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            itemType = homeActiveOrderItems.type;
        }
        if ((i12 & 2) != 0) {
            itemContent = homeActiveOrderItems.content;
        }
        return homeActiveOrderItems.copy(itemType, itemContent);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final ItemType getType() {
        return this.type;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final ItemContent getContent() {
        return this.content;
    }

    @k
    public final HomeActiveOrderItems copy(@k ItemType type, @k ItemContent content) {
        return new HomeActiveOrderItems(type, content);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeActiveOrderItems)) {
            return false;
        }
        HomeActiveOrderItems homeActiveOrderItems = (HomeActiveOrderItems) other;
        return this.type == homeActiveOrderItems.type && L.f(this.content, homeActiveOrderItems.content);
    }

    @k
    public final ItemContent getContent() {
        return this.content;
    }

    @k
    public final ItemType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.content.hashCode() + (this.type.hashCode() * 31);
    }

    @k
    public String toString() {
        return "HomeActiveOrderItems(type=" + this.type + ", content=" + this.content + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.type.name());
        this.content.writeToParcel(parcel, flags);
    }
}
