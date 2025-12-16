package com.avito.android.profile_settings_extended.adapter.badge_bar;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BadgeBarItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/badge_bar/BadgeBarItem;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class BadgeBarItem implements SettingsListItem {

    @k
    public static final Parcelable.Creator<BadgeBarItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229153b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<BadgeItem> f229154c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final GridElementType.FullWidth f229155d;

    /* compiled from: BadgeBarItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BadgeBarItem> {
        @Override // android.os.Parcelable.Creator
        public final BadgeBarItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(BadgeBarItem.class, parcel, arrayList, iL2, 1);
            }
            return new BadgeBarItem(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BadgeBarItem[] newArray(int i12) {
            return new BadgeBarItem[i12];
        }
    }

    public BadgeBarItem(@k String str, @k List<BadgeItem> list) {
        this.f229153b = str;
        this.f229154c = list;
        this.f229155d = GridElementType.FullWidth.f161209b;
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
        return L.f(this.f229153b, badgeBarItem.f229153b) && L.f(this.f229154c, badgeBarItem.f229154c);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public final GridElementType getF154209c() {
        return this.f229155d;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF200029b() {
        return this.f229153b;
    }

    public final int hashCode() {
        return this.f229154c.hashCode() + (this.f229153b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BadgeBarItem(stringId=");
        sb2.append(this.f229153b);
        sb2.append(", badges=");
        return H.p(sb2, this.f229154c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229153b);
        Iterator itJ = C0.j(this.f229154c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }

    public /* synthetic */ BadgeBarItem(String str, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "badge_bar_item" : str, list);
    }
}
