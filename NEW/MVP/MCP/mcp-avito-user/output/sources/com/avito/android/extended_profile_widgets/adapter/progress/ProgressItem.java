package com.avito.android.extended_profile_widgets.adapter.progress;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProgressItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/progress/ProgressItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ProgressItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<ProgressItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154609b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154610c;

    /* compiled from: ProgressItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProgressItem> {
        @Override // android.os.Parcelable.Creator
        public final ProgressItem createFromParcel(Parcel parcel) {
            return new ProgressItem(parcel.readString(), (GridElementType) parcel.readParcelable(ProgressItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProgressItem[] newArray(int i12) {
            return new ProgressItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProgressItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressItem)) {
            return false;
        }
        ProgressItem progressItem = (ProgressItem) obj;
        return L.f(this.f154609b, progressItem.f154609b) && L.f(this.f154610c, progressItem.f154610c);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154200c() {
        return this.f154610c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154199b() {
        return this.f154609b;
    }

    public final int hashCode() {
        return this.f154610c.hashCode() + (this.f154609b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "ProgressItem(stringId=" + this.f154609b + ", gridType=" + this.f154610c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154609b);
        parcel.writeParcelable(this.f154610c, i12);
    }

    public ProgressItem(@k String str, @k GridElementType gridElementType) {
        this.f154609b = str;
        this.f154610c = gridElementType;
    }

    public /* synthetic */ ProgressItem(String str, GridElementType gridElementType, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "progress_item" : str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType);
    }
}
