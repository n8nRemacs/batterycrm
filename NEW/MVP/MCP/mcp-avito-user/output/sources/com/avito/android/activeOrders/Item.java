package com.avito.android.activeOrders;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrdersNeedActionResponse.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/activeOrders/Item;", "Landroid/os/Parcelable;", "Lcom/avito/android/activeOrders/ItemType;", "type", "Lcom/avito/android/activeOrders/ItemContent;", "content", "<init>", "(Lcom/avito/android/activeOrders/ItemType;Lcom/avito/android/activeOrders/ItemContent;)V", "Lcom/avito/android/activeOrders/ItemType;", "d", "()Lcom/avito/android/activeOrders/ItemType;", "Lcom/avito/android/activeOrders/ItemContent;", "c", "()Lcom/avito/android/activeOrders/ItemContent;", "_avito_active-orders_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Item implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<Item> CREATOR = new a();

    @com.google.gson.annotations.c("content")
    @Y61.k
    private final ItemContent content;

    @com.google.gson.annotations.c("type")
    @Y61.k
    private final ItemType type;

    /* compiled from: OrdersNeedActionResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Item> {
        @Override // android.os.Parcelable.Creator
        public final Item createFromParcel(Parcel parcel) {
            return new Item(ItemType.valueOf(parcel.readString()), ItemContent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Item[] newArray(int i12) {
            return new Item[i12];
        }
    }

    public Item(@Y61.k ItemType itemType, @Y61.k ItemContent itemContent) {
        this.type = itemType;
        this.content = itemContent;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final ItemContent getContent() {
        return this.content;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final ItemType getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        return this.type == item.type && L.f(this.content, item.content);
    }

    public final int hashCode() {
        return this.content.hashCode() + (this.type.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "Item(type=" + this.type + ", content=" + this.content + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.type.name());
        this.content.writeToParcel(parcel, i12);
    }
}
