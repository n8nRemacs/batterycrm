package com.avito.android.bottom_sheet_group.items.checkable_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BottomSheetGroupCheckableItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bottom_sheet_group/items/checkable_item/BottomSheetGroupCheckableItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BottomSheetGroupCheckableItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<BottomSheetGroupCheckableItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f107341b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f107342c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f107343d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f107344e;

    /* compiled from: BottomSheetGroupCheckableItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BottomSheetGroupCheckableItem> {
        @Override // android.os.Parcelable.Creator
        public final BottomSheetGroupCheckableItem createFromParcel(Parcel parcel) {
            return new BottomSheetGroupCheckableItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BottomSheetGroupCheckableItem[] newArray(int i12) {
            return new BottomSheetGroupCheckableItem[i12];
        }
    }

    public BottomSheetGroupCheckableItem(@k String str, @k String str2, @k String str3, boolean z12) {
        this.f107341b = str;
        this.f107342c = str2;
        this.f107343d = str3;
        this.f107344e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomSheetGroupCheckableItem)) {
            return false;
        }
        BottomSheetGroupCheckableItem bottomSheetGroupCheckableItem = (BottomSheetGroupCheckableItem) obj;
        return L.f(this.f107341b, bottomSheetGroupCheckableItem.f107341b) && L.f(this.f107342c, bottomSheetGroupCheckableItem.f107342c) && L.f(this.f107343d, bottomSheetGroupCheckableItem.f107343d) && this.f107344e == bottomSheetGroupCheckableItem.f107344e;
    }

    @Override // TV0.a
    public final long getId() {
        return getF100325b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF100325b() {
        return this.f107341b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f107344e) + H.d(H.d(this.f107341b.hashCode() * 31, 31, this.f107342c), 31, this.f107343d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BottomSheetGroupCheckableItem(stringId=");
        sb2.append(this.f107341b);
        sb2.append(", paramId=");
        sb2.append(this.f107342c);
        sb2.append(", title=");
        sb2.append(this.f107343d);
        sb2.append(", selected=");
        return r.x(sb2, this.f107344e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f107341b);
        parcel.writeString(this.f107342c);
        parcel.writeString(this.f107343d);
        parcel.writeInt(this.f107344e ? 1 : 0);
    }
}
