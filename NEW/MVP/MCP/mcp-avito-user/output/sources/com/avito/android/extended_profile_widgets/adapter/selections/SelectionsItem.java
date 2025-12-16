package com.avito.android.extended_profile_widgets.adapter.selections;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.extended_profile_widgets.adapter.selections.adapter.SelectionItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectionsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/selections/SelectionsItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SelectionsItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<SelectionsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154864b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154865c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f154866d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<SelectionItem> f154867e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Parcelable f154868f;

    /* compiled from: SelectionsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectionsItem> {
        @Override // android.os.Parcelable.Creator
        public final SelectionsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            GridElementType gridElementType = (GridElementType) parcel.readParcelable(SelectionsItem.class.getClassLoader());
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(SelectionItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new SelectionsItem(string, gridElementType, string2, arrayList, parcel.readParcelable(SelectionsItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SelectionsItem[] newArray(int i12) {
            return new SelectionsItem[i12];
        }
    }

    public SelectionsItem(@k String str, @k GridElementType gridElementType, @k String str2, @k List<SelectionItem> list, @l Parcelable parcelable) {
        this.f154864b = str;
        this.f154865c = gridElementType;
        this.f154866d = str2;
        this.f154867e = list;
        this.f154868f = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionsItem)) {
            return false;
        }
        SelectionsItem selectionsItem = (SelectionsItem) obj;
        return L.f(this.f154864b, selectionsItem.f154864b) && L.f(this.f154865c, selectionsItem.f154865c) && L.f(this.f154866d, selectionsItem.f154866d) && L.f(this.f154867e, selectionsItem.f154867e) && L.f(this.f154868f, selectionsItem.f154868f);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154966c() {
        return this.f154865c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF284485b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154965b() {
        return this.f154864b;
    }

    public final int hashCode() {
        int iE2 = H.e(H.d(com.avito.android.bxcontent.mvi.entity.f.b(this.f154865c, this.f154864b.hashCode() * 31, 31), 31, this.f154866d), 31, this.f154867e);
        Parcelable parcelable = this.f154868f;
        return iE2 + (parcelable == null ? 0 : parcelable.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionsItem(stringId=");
        sb2.append(this.f154864b);
        sb2.append(", gridType=");
        sb2.append(this.f154865c);
        sb2.append(", title=");
        sb2.append(this.f154866d);
        sb2.append(", items=");
        sb2.append(this.f154867e);
        sb2.append(", scrollState=");
        return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f154868f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154864b);
        parcel.writeParcelable(this.f154865c, i12);
        parcel.writeString(this.f154866d);
        Iterator itJ = C0.j(this.f154867e, parcel);
        while (itJ.hasNext()) {
            ((SelectionItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f154868f, i12);
    }

    public /* synthetic */ SelectionsItem(String str, GridElementType gridElementType, String str2, List list, Parcelable parcelable, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, str2, list, (i12 & 16) != 0 ? null : parcelable);
    }
}
