package com.avito.android.extended_profile_widgets.adapter.universal.two_columns;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetFourBlocksView;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetTwoColumnsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/universal/two_columns/UniversalWidgetTwoColumnsItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UniversalWidgetTwoColumnsItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<UniversalWidgetTwoColumnsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f155015b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f155016c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UniversalWidgetFourBlocksView.UniversalWidgetFourBlocksState f155017d;

    /* compiled from: UniversalWidgetTwoColumnsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalWidgetTwoColumnsItem> {
        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetTwoColumnsItem createFromParcel(Parcel parcel) {
            return new UniversalWidgetTwoColumnsItem(parcel.readString(), (GridElementType) parcel.readParcelable(UniversalWidgetTwoColumnsItem.class.getClassLoader()), (UniversalWidgetFourBlocksView.UniversalWidgetFourBlocksState) parcel.readParcelable(UniversalWidgetTwoColumnsItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetTwoColumnsItem[] newArray(int i12) {
            return new UniversalWidgetTwoColumnsItem[i12];
        }
    }

    public UniversalWidgetTwoColumnsItem(@k String str, @k GridElementType gridElementType, @k UniversalWidgetFourBlocksView.UniversalWidgetFourBlocksState universalWidgetFourBlocksState) {
        this.f155015b = str;
        this.f155016c = gridElementType;
        this.f155017d = universalWidgetFourBlocksState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalWidgetTwoColumnsItem)) {
            return false;
        }
        UniversalWidgetTwoColumnsItem universalWidgetTwoColumnsItem = (UniversalWidgetTwoColumnsItem) obj;
        return L.f(this.f155015b, universalWidgetTwoColumnsItem.f155015b) && L.f(this.f155016c, universalWidgetTwoColumnsItem.f155016c) && L.f(this.f155017d, universalWidgetTwoColumnsItem.f155017d);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154834c() {
        return this.f155016c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123929b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145795b() {
        return this.f155015b;
    }

    public final int hashCode() {
        return this.f155017d.hashCode() + com.avito.android.bxcontent.mvi.entity.f.b(this.f155016c, this.f155015b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        return "UniversalWidgetTwoColumnsItem(stringId=" + this.f155015b + ", gridType=" + this.f155016c + ", state=" + this.f155017d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f155015b);
        parcel.writeParcelable(this.f155016c, i12);
        parcel.writeParcelable(this.f155017d, i12);
    }

    public /* synthetic */ UniversalWidgetTwoColumnsItem(String str, GridElementType gridElementType, UniversalWidgetFourBlocksView.UniversalWidgetFourBlocksState universalWidgetFourBlocksState, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, universalWidgetFourBlocksState);
    }
}
