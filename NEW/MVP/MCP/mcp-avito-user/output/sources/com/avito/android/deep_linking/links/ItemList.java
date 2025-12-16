package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DetailsSheetLink.kt */
@K51.d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/avito/android/deep_linking/links/ItemList;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/ItemList$Style;", "_style", "", "Lcom/avito/android/deep_linking/links/ItemList$Item;", "items", "<init>", "(Lcom/avito/android/deep_linking/links/ItemList$Style;Ljava/util/List;)V", "Lcom/avito/android/deep_linking/links/ItemList$Style;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Item", "Style", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ItemList implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ItemList> CREATOR = new a();

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @Y61.l
    private final Style _style;

    @com.google.gson.annotations.c("items")
    @Y61.k
    private final List<Item> items;

    /* compiled from: DetailsSheetLink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/deep_linking/links/ItemList$Item;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Item implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Item> CREATOR = new a();

        @com.google.gson.annotations.c("text")
        @Y61.l
        private final AttributedText text;

        /* compiled from: DetailsSheetLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Item> {
            @Override // android.os.Parcelable.Creator
            public final Item createFromParcel(Parcel parcel) {
                return new Item((AttributedText) parcel.readParcelable(Item.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Item[] newArray(int i12) {
                return new Item[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Item() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Item) && kotlin.jvm.internal.L.f(this.text, ((Item) obj).text);
        }

        public final int hashCode() {
            AttributedText attributedText = this.text;
            if (attributedText == null) {
                return 0;
            }
            return attributedText.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("Item(text="), this.text, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.text, i12);
        }

        public Item(@Y61.l AttributedText attributedText) {
            this.text = attributedText;
        }

        public /* synthetic */ Item(AttributedText attributedText, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : attributedText);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DetailsSheetLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/ItemList$Style;", "", "(Ljava/lang/String;I)V", "DASHED", "POINTED", "NUMERIC", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        @com.google.gson.annotations.c("dash")
        public static final Style DASHED;

        @com.google.gson.annotations.c("number")
        public static final Style NUMERIC;

        @com.google.gson.annotations.c("point")
        public static final Style POINTED;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Style[] f133397b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f133398c;

        static {
            Style style = new Style("DASHED", 0);
            DASHED = style;
            Style style2 = new Style("POINTED", 1);
            POINTED = style2;
            Style style3 = new Style("NUMERIC", 2);
            NUMERIC = style3;
            Style[] styleArr = {style, style2, style3};
            f133397b = styleArr;
            f133398c = kotlin.enums.c.a(styleArr);
        }

        private Style(String str, int i12) {
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f133397b.clone();
        }
    }

    /* compiled from: DetailsSheetLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemList> {
        @Override // android.os.Parcelable.Creator
        public final ItemList createFromParcel(Parcel parcel) {
            Style styleValueOf = parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Item.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ItemList(styleValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ItemList[] newArray(int i12) {
            return new ItemList[i12];
        }
    }

    public ItemList(@Y61.l Style style, @Y61.k List<Item> list) {
        this._style = style;
        this.items = list;
    }

    @Y61.k
    public final Style c() {
        Style style = this._style;
        return style == null ? Style.DASHED : style;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemList)) {
            return false;
        }
        ItemList itemList = (ItemList) obj;
        return this._style == itemList._style && kotlin.jvm.internal.L.f(this.items, itemList.items);
    }

    @Y61.k
    public final List<Item> getItems() {
        return this.items;
    }

    public final int hashCode() {
        Style style = this._style;
        return this.items.hashCode() + ((style == null ? 0 : style.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemList(_style=");
        sb2.append(this._style);
        sb2.append(", items=");
        return androidx.compose.foundation.H.p(sb2, this.items, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Style style = this._style;
        if (style == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(style.name());
        }
        Iterator itJ = C0.j(this.items, parcel);
        while (itJ.hasNext()) {
            ((Item) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
