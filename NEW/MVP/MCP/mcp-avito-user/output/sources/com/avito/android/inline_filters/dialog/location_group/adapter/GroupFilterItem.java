package com.avito.android.inline_filters.dialog.location_group.adapter;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.search.Filter;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GroupFilterItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/location_group/adapter/GroupFilterItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GroupFilterItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<GroupFilterItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f171703b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public Filter f171704c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ItemType f171705d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f171706e;

    /* compiled from: GroupFilterItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GroupFilterItem> {
        @Override // android.os.Parcelable.Creator
        public final GroupFilterItem createFromParcel(Parcel parcel) {
            return new GroupFilterItem(parcel.readString(), (Filter) parcel.readParcelable(GroupFilterItem.class.getClassLoader()), ItemType.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupFilterItem[] newArray(int i12) {
            return new GroupFilterItem[i12];
        }
    }

    public GroupFilterItem(@k String str, @k Filter filter, @k ItemType itemType, boolean z12) {
        this.f171703b = str;
        this.f171704c = filter;
        this.f171705d = itemType;
        this.f171706e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123929b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF163623b() {
        return this.f171703b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f171703b);
        parcel.writeParcelable(this.f171704c, i12);
        parcel.writeString(this.f171705d.name());
        parcel.writeInt(this.f171706e ? 1 : 0);
    }

    public /* synthetic */ GroupFilterItem(String str, Filter filter, ItemType itemType, boolean z12, int i12, C42822w c42822w) {
        this(str, filter, (i12 & 4) != 0 ? ItemType.f171707b : itemType, (i12 & 8) != 0 ? true : z12);
    }
}
