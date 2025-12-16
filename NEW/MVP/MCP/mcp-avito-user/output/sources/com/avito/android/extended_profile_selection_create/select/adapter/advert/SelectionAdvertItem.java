package com.avito.android.extended_profile_selection_create.select.adapter.advert;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.extended_profile_selection_create.select.ExtendedProfileSelectionCreateItem;
import com.avito.android.grid.GridElementType;
import com.avito.android.remote.model.Image;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectionAdvertItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/adapter/advert/SelectionAdvertItem;", "Lcom/avito/android/extended_profile_selection_create/select/ExtendedProfileSelectionCreateItem;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SelectionAdvertItem implements ExtendedProfileSelectionCreateItem {

    @k
    public static final Parcelable.Creator<SelectionAdvertItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f152036b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f152037c;

    /* renamed from: d, reason: collision with root package name */
    public final long f152038d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Image f152039e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f152040f;

    /* renamed from: g, reason: collision with root package name */
    public final long f152041g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f152042h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f152043i;

    /* compiled from: SelectionAdvertItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectionAdvertItem> {
        @Override // android.os.Parcelable.Creator
        public final SelectionAdvertItem createFromParcel(Parcel parcel) {
            return new SelectionAdvertItem(parcel.readString(), (GridElementType) parcel.readParcelable(SelectionAdvertItem.class.getClassLoader()), parcel.readLong(), (Image) parcel.readParcelable(SelectionAdvertItem.class.getClassLoader()), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectionAdvertItem[] newArray(int i12) {
            return new SelectionAdvertItem[i12];
        }
    }

    public SelectionAdvertItem(@k String str, @k GridElementType gridElementType, long j12, @l Image image, @k String str2, long j13, @l String str3, boolean z12) {
        this.f152036b = str;
        this.f152037c = gridElementType;
        this.f152038d = j12;
        this.f152039e = image;
        this.f152040f = str2;
        this.f152041g = j13;
        this.f152042h = str3;
        this.f152043i = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionAdvertItem)) {
            return false;
        }
        SelectionAdvertItem selectionAdvertItem = (SelectionAdvertItem) obj;
        return L.f(this.f152036b, selectionAdvertItem.f152036b) && L.f(this.f152037c, selectionAdvertItem.f152037c) && this.f152038d == selectionAdvertItem.f152038d && L.f(this.f152039e, selectionAdvertItem.f152039e) && L.f(this.f152040f, selectionAdvertItem.f152040f) && this.f152041g == selectionAdvertItem.f152041g && L.f(this.f152042h, selectionAdvertItem.f152042h) && this.f152043i == selectionAdvertItem.f152043i;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154461c() {
        return this.f152037c;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145777b() {
        return this.f152036b;
    }

    public final int hashCode() {
        int iG2 = r.g(com.avito.android.bxcontent.mvi.entity.f.b(this.f152037c, this.f152036b.hashCode() * 31, 31), 31, this.f152038d);
        Image image = this.f152039e;
        int iG3 = r.g(H.d((iG2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f152040f), 31, this.f152041g);
        String str = this.f152042h;
        return Boolean.hashCode(this.f152043i) + ((iG3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionAdvertItem(stringId=");
        sb2.append(this.f152036b);
        sb2.append(", gridType=");
        sb2.append(this.f152037c);
        sb2.append(", advertId=");
        sb2.append(this.f152038d);
        sb2.append(", image=");
        sb2.append(this.f152039e);
        sb2.append(", title=");
        sb2.append(this.f152040f);
        sb2.append(", time=");
        sb2.append(this.f152041g);
        sb2.append(", price=");
        sb2.append(this.f152042h);
        sb2.append(", isSelected=");
        return r.x(sb2, this.f152043i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f152036b);
        parcel.writeParcelable(this.f152037c, i12);
        parcel.writeLong(this.f152038d);
        parcel.writeParcelable(this.f152039e, i12);
        parcel.writeString(this.f152040f);
        parcel.writeLong(this.f152041g);
        parcel.writeString(this.f152042h);
        parcel.writeInt(this.f152043i ? 1 : 0);
    }

    public /* synthetic */ SelectionAdvertItem(String str, GridElementType gridElementType, long j12, Image image, String str2, long j13, String str3, boolean z12, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.SingleSpan.f161210b : gridElementType, j12, image, str2, j13, str3, z12);
    }
}
