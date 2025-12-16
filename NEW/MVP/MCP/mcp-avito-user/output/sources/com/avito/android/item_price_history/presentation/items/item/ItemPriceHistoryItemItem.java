package com.avito.android.item_price_history.presentation.items.item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ItemPriceHistoryItemItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_price_history/presentation/items/item/ItemPriceHistoryItemItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_item-price-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ItemPriceHistoryItemItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ItemPriceHistoryItemItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f173753b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f173754c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f173755d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AttributedText f173756e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f173757f;

    /* compiled from: ItemPriceHistoryItemItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemPriceHistoryItemItem> {
        @Override // android.os.Parcelable.Creator
        public final ItemPriceHistoryItemItem createFromParcel(Parcel parcel) {
            return new ItemPriceHistoryItemItem(parcel.readString(), (AttributedText) parcel.readParcelable(ItemPriceHistoryItemItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(ItemPriceHistoryItemItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(ItemPriceHistoryItemItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(ItemPriceHistoryItemItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ItemPriceHistoryItemItem[] newArray(int i12) {
            return new ItemPriceHistoryItemItem[i12];
        }
    }

    public ItemPriceHistoryItemItem(@k String str, @k AttributedText attributedText, @l AttributedText attributedText2, @k AttributedText attributedText3, @l AttributedText attributedText4) {
        this.f173753b = str;
        this.f173754c = attributedText;
        this.f173755d = attributedText2;
        this.f173756e = attributedText3;
        this.f173757f = attributedText4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemPriceHistoryItemItem)) {
            return false;
        }
        ItemPriceHistoryItemItem itemPriceHistoryItemItem = (ItemPriceHistoryItemItem) obj;
        return L.f(this.f173753b, itemPriceHistoryItemItem.f173753b) && L.f(this.f173754c, itemPriceHistoryItemItem.f173754c) && L.f(this.f173755d, itemPriceHistoryItemItem.f173755d) && L.f(this.f173756e, itemPriceHistoryItemItem.f173756e) && L.f(this.f173757f, itemPriceHistoryItemItem.f173757f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162223b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF163001b() {
        return this.f173753b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.f173753b.hashCode() * 31, 31, this.f173754c);
        AttributedText attributedText = this.f173755d;
        int iB3 = com.avito.android.actions_sheet.a.b((iB2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f173756e);
        AttributedText attributedText2 = this.f173757f;
        return iB3 + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemPriceHistoryItemItem(stringId=");
        sb2.append(this.f173753b);
        sb2.append(", date=");
        sb2.append(this.f173754c);
        sb2.append(", description=");
        sb2.append(this.f173755d);
        sb2.append(", price=");
        sb2.append(this.f173756e);
        sb2.append(", priceDelta=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f173757f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f173753b);
        parcel.writeParcelable(this.f173754c, i12);
        parcel.writeParcelable(this.f173755d, i12);
        parcel.writeParcelable(this.f173756e, i12);
        parcel.writeParcelable(this.f173757f, i12);
    }

    public /* synthetic */ ItemPriceHistoryItemItem(String str, AttributedText attributedText, AttributedText attributedText2, AttributedText attributedText3, AttributedText attributedText4, int i12, C42822w c42822w) {
        this(str, attributedText, (i12 & 4) != 0 ? null : attributedText2, attributedText3, (i12 & 16) != 0 ? null : attributedText4);
    }
}
