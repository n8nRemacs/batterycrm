package com.avito.android.remote.anchors;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AnchorTrustFactors.kt */
@d
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bB3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/anchors/AnchorTrustFactors;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/anchors/AnchorTrustFactors$ExpandConfig;", "expandConfig", "", "Lcom/avito/android/remote/anchors/AnchorTrustFactors$Item;", "items", "Lcom/avito/android/remote/anchors/AnchorTrustFactors$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "isFloatingAnchorsEnabled", "<init>", "(Lcom/avito/android/remote/anchors/AnchorTrustFactors$ExpandConfig;Ljava/util/List;Lcom/avito/android/remote/anchors/AnchorTrustFactors$Style;Ljava/lang/Boolean;)V", "Lcom/avito/android/remote/anchors/AnchorTrustFactors$ExpandConfig;", "c", "()Lcom/avito/android/remote/anchors/AnchorTrustFactors$ExpandConfig;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lcom/avito/android/remote/anchors/AnchorTrustFactors$Style;", "d", "()Lcom/avito/android/remote/anchors/AnchorTrustFactors$Style;", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "ExpandConfig", "Item", "Style", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AnchorTrustFactors implements Parcelable {

    @k
    public static final Parcelable.Creator<AnchorTrustFactors> CREATOR = new a();

    @c("expandConfig")
    @l
    private final ExpandConfig expandConfig;

    @c("isFloatingAnchorsEnabled")
    @l
    private final Boolean isFloatingAnchorsEnabled;

    @c("items")
    @l
    private final List<Item> items;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @k
    private final Style style;

    /* compiled from: AnchorTrustFactors.kt */
    @d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/anchors/AnchorTrustFactors$ExpandConfig;", "Landroid/os/Parcelable;", "", "maxLines", "Lcom/avito/android/remote/anchors/AnchorTrustFactors$Item;", "expandItem", "<init>", "(ILcom/avito/android/remote/anchors/AnchorTrustFactors$Item;)V", "I", "d", "()I", "Lcom/avito/android/remote/anchors/AnchorTrustFactors$Item;", "c", "()Lcom/avito/android/remote/anchors/AnchorTrustFactors$Item;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ExpandConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<ExpandConfig> CREATOR = new a();

        @c("expandItem")
        @k
        private final Item expandItem;

        @c("maxLines")
        private final int maxLines;

        /* compiled from: AnchorTrustFactors.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ExpandConfig> {
            @Override // android.os.Parcelable.Creator
            public final ExpandConfig createFromParcel(Parcel parcel) {
                return new ExpandConfig(parcel.readInt(), Item.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ExpandConfig[] newArray(int i12) {
                return new ExpandConfig[i12];
            }
        }

        public ExpandConfig(int i12, @k Item item) {
            this.maxLines = i12;
            this.expandItem = item;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final Item getExpandItem() {
            return this.expandItem;
        }

        /* renamed from: d, reason: from getter */
        public final int getMaxLines() {
            return this.maxLines;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExpandConfig)) {
                return false;
            }
            ExpandConfig expandConfig = (ExpandConfig) obj;
            return this.maxLines == expandConfig.maxLines && L.f(this.expandItem, expandConfig.expandItem);
        }

        public final int hashCode() {
            return this.expandItem.hashCode() + (Integer.hashCode(this.maxLines) * 31);
        }

        @k
        public final String toString() {
            return "ExpandConfig(maxLines=" + this.maxLines + ", expandItem=" + this.expandItem + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.maxLines);
            this.expandItem.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: AnchorTrustFactors.kt */
    @d
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/anchors/AnchorTrustFactors$Item;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", "onTapDeepLink", "", "blockIdentifier", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Item implements Parcelable {

        @k
        public static final Parcelable.Creator<Item> CREATOR = new a();

        @c("blockIdentifier")
        @l
        private final String blockIdentifier;

        @c("onTapDeepLink")
        @l
        private final DeepLink onTapDeepLink;

        @c("title")
        @k
        private final AttributedText title;

        /* compiled from: AnchorTrustFactors.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Item> {
            @Override // android.os.Parcelable.Creator
            public final Item createFromParcel(Parcel parcel) {
                return new Item((AttributedText) parcel.readParcelable(Item.class.getClassLoader()), (DeepLink) parcel.readParcelable(Item.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Item[] newArray(int i12) {
                return new Item[i12];
            }
        }

        public Item(@k AttributedText attributedText, @l DeepLink deepLink, @l String str) {
            this.title = attributedText;
            this.onTapDeepLink = deepLink;
            this.blockIdentifier = str;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getBlockIdentifier() {
            return this.blockIdentifier;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final DeepLink getOnTapDeepLink() {
            return this.onTapDeepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final AttributedText getTitle() {
            return this.title;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return L.f(this.title, item.title) && L.f(this.onTapDeepLink, item.onTapDeepLink) && L.f(this.blockIdentifier, item.blockIdentifier);
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            DeepLink deepLink = this.onTapDeepLink;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            String str = this.blockIdentifier;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Item(title=");
            sb2.append(this.title);
            sb2.append(", onTapDeepLink=");
            sb2.append(this.onTapDeepLink);
            sb2.append(", blockIdentifier=");
            return C22026a.c(sb2, this.blockIdentifier, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.title, i12);
            parcel.writeParcelable(this.onTapDeepLink, i12);
            parcel.writeString(this.blockIdentifier);
        }
    }

    /* compiled from: AnchorTrustFactors.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/anchors/AnchorTrustFactors$Style;", "Landroid/os/Parcelable;", "", "normalButtonStyle", "selectedButtonStyle", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "getTheme", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Style implements Parcelable {

        @k
        public static final Parcelable.Creator<Style> CREATOR = new a();

        @c("normalButtonStyle")
        @k
        private final String normalButtonStyle;

        @c("selectedButtonStyle")
        @k
        private final String selectedButtonStyle;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
        @l
        private final String theme;

        /* compiled from: AnchorTrustFactors.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Style> {
            @Override // android.os.Parcelable.Creator
            public final Style createFromParcel(Parcel parcel) {
                return new Style(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Style[] newArray(int i12) {
                return new Style[i12];
            }
        }

        public Style(@k String str, @k String str2, @l String str3) {
            this.normalButtonStyle = str;
            this.selectedButtonStyle = str2;
            this.theme = str3;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getNormalButtonStyle() {
            return this.normalButtonStyle;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final String getSelectedButtonStyle() {
            return this.selectedButtonStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Style)) {
                return false;
            }
            Style style = (Style) obj;
            return L.f(this.normalButtonStyle, style.normalButtonStyle) && L.f(this.selectedButtonStyle, style.selectedButtonStyle) && L.f(this.theme, style.theme);
        }

        @l
        public final String getTheme() {
            return this.theme;
        }

        public final int hashCode() {
            int iD2 = H.d(this.normalButtonStyle.hashCode() * 31, 31, this.selectedButtonStyle);
            String str = this.theme;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Style(normalButtonStyle=");
            sb2.append(this.normalButtonStyle);
            sb2.append(", selectedButtonStyle=");
            sb2.append(this.selectedButtonStyle);
            sb2.append(", theme=");
            return C22026a.c(sb2, this.theme, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.normalButtonStyle);
            parcel.writeString(this.selectedButtonStyle);
            parcel.writeString(this.theme);
        }
    }

    /* compiled from: AnchorTrustFactors.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AnchorTrustFactors> {
        @Override // android.os.Parcelable.Creator
        public final AnchorTrustFactors createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf = null;
            ExpandConfig expandConfigCreateFromParcel = parcel.readInt() == 0 ? null : ExpandConfig.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Item.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            Style styleCreateFromParcel = Style.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AnchorTrustFactors(expandConfigCreateFromParcel, arrayList, styleCreateFromParcel, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final AnchorTrustFactors[] newArray(int i12) {
            return new AnchorTrustFactors[i12];
        }
    }

    public AnchorTrustFactors(@l ExpandConfig expandConfig, @l List<Item> list, @k Style style, @l Boolean bool) {
        this.expandConfig = expandConfig;
        this.items = list;
        this.style = style;
        this.isFloatingAnchorsEnabled = bool;
    }

    public static AnchorTrustFactors a(AnchorTrustFactors anchorTrustFactors) {
        return new AnchorTrustFactors(null, anchorTrustFactors.items, anchorTrustFactors.style, anchorTrustFactors.isFloatingAnchorsEnabled);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ExpandConfig getExpandConfig() {
        return this.expandConfig;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Boolean getIsFloatingAnchorsEnabled() {
        return this.isFloatingAnchorsEnabled;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorTrustFactors)) {
            return false;
        }
        AnchorTrustFactors anchorTrustFactors = (AnchorTrustFactors) obj;
        return L.f(this.expandConfig, anchorTrustFactors.expandConfig) && L.f(this.items, anchorTrustFactors.items) && L.f(this.style, anchorTrustFactors.style) && L.f(this.isFloatingAnchorsEnabled, anchorTrustFactors.isFloatingAnchorsEnabled);
    }

    @l
    public final List<Item> getItems() {
        return this.items;
    }

    public final int hashCode() {
        ExpandConfig expandConfig = this.expandConfig;
        int iHashCode = (expandConfig == null ? 0 : expandConfig.hashCode()) * 31;
        List<Item> list = this.items;
        int iHashCode2 = (this.style.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        Boolean bool = this.isFloatingAnchorsEnabled;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnchorTrustFactors(expandConfig=");
        sb2.append(this.expandConfig);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", isFloatingAnchorsEnabled=");
        return C0.g(sb2, this.isFloatingAnchorsEnabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        ExpandConfig expandConfig = this.expandConfig;
        if (expandConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            expandConfig.writeToParcel(parcel, i12);
        }
        List<Item> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Item) itA.next()).writeToParcel(parcel, i12);
            }
        }
        this.style.writeToParcel(parcel, i12);
        Boolean bool = this.isFloatingAnchorsEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
