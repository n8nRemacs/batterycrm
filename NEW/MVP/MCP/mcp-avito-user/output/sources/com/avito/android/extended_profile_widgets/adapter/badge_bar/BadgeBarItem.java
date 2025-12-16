package com.avito.android.extended_profile_widgets.adapter.badge_bar;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BadgeBarItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/badge_bar/BadgeBarItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BadgeBarItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<BadgeBarItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154208b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154209c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<BadgeItem> f154210d;

    /* compiled from: BadgeBarItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BadgeBarItem> {
        @Override // android.os.Parcelable.Creator
        public final BadgeBarItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            GridElementType gridElementType = (GridElementType) parcel.readParcelable(BadgeBarItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(BadgeBarItem.class, parcel, arrayList, iL2, 1);
            }
            return new BadgeBarItem(string, gridElementType, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BadgeBarItem[] newArray(int i12) {
            return new BadgeBarItem[i12];
        }
    }

    public BadgeBarItem(@k String str, @k GridElementType gridElementType, @k List<BadgeItem> list) {
        this.f154208b = str;
        this.f154209c = gridElementType;
        this.f154210d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgeBarItem)) {
            return false;
        }
        BadgeBarItem badgeBarItem = (BadgeBarItem) obj;
        return L.f(this.f154208b, badgeBarItem.f154208b) && L.f(this.f154209c, badgeBarItem.f154209c) && L.f(this.f154210d, badgeBarItem.f154210d);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154543c() {
        return this.f154209c;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF138406b() {
        return this.f154208b;
    }

    public final int hashCode() {
        return this.f154210d.hashCode() + com.avito.android.bxcontent.mvi.entity.f.b(this.f154209c, this.f154208b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BadgeBarItem(stringId=");
        sb2.append(this.f154208b);
        sb2.append(", gridType=");
        sb2.append(this.f154209c);
        sb2.append(", badges=");
        return H.p(sb2, this.f154210d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154208b);
        parcel.writeParcelable(this.f154209c, i12);
        Iterator itJ = C0.j(this.f154210d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }

    public /* synthetic */ BadgeBarItem(String str, GridElementType gridElementType, List list, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, list);
    }
}
