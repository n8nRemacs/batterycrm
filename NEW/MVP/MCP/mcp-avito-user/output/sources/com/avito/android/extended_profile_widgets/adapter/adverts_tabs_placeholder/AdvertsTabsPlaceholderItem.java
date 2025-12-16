package com.avito.android.extended_profile_widgets.adapter.adverts_tabs_placeholder;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertsTabsPlaceholderItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/adverts_tabs_placeholder/AdvertsTabsPlaceholderItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AdvertsTabsPlaceholderItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<AdvertsTabsPlaceholderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154199b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154200c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f154201d;

    /* compiled from: AdvertsTabsPlaceholderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertsTabsPlaceholderItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertsTabsPlaceholderItem createFromParcel(Parcel parcel) {
            return new AdvertsTabsPlaceholderItem(parcel.readString(), (GridElementType) parcel.readParcelable(AdvertsTabsPlaceholderItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertsTabsPlaceholderItem[] newArray(int i12) {
            return new AdvertsTabsPlaceholderItem[i12];
        }
    }

    public AdvertsTabsPlaceholderItem(@k String str, @k GridElementType gridElementType, @l String str2) {
        this.f154199b = str;
        this.f154200c = gridElementType;
        this.f154201d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154989c() {
        return this.f154200c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF152636b() {
        return this.f154199b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154199b);
        parcel.writeParcelable(this.f154200c, i12);
        parcel.writeString(this.f154201d);
    }

    public /* synthetic */ AdvertsTabsPlaceholderItem(String str, GridElementType gridElementType, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, str2);
    }
}
