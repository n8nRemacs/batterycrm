package com.avito.android.extended_profile_widgets.adapter.badge_bar_v3;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.android.remote.model.Action;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BadgeBarV3Item.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/badge_bar_v3/BadgeBarV3Item;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BadgeBarV3Item implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<BadgeBarV3Item> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154219b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154220c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<BadgeItem> f154221d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f154222e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Action f154223f;

    /* compiled from: BadgeBarV3Item.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BadgeBarV3Item> {
        @Override // android.os.Parcelable.Creator
        public final BadgeBarV3Item createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            GridElementType gridElementType = (GridElementType) parcel.readParcelable(BadgeBarV3Item.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(BadgeBarV3Item.class, parcel, arrayList, iL2, 1);
            }
            return new BadgeBarV3Item(string, gridElementType, arrayList, parcel.readString(), (Action) parcel.readParcelable(BadgeBarV3Item.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BadgeBarV3Item[] newArray(int i12) {
            return new BadgeBarV3Item[i12];
        }
    }

    public BadgeBarV3Item(@k String str, @k GridElementType gridElementType, @k List<BadgeItem> list, @l String str2, @l Action action) {
        this.f154219b = str;
        this.f154220c = gridElementType;
        this.f154221d = list;
        this.f154222e = str2;
        this.f154223f = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgeBarV3Item)) {
            return false;
        }
        BadgeBarV3Item badgeBarV3Item = (BadgeBarV3Item) obj;
        return L.f(this.f154219b, badgeBarV3Item.f154219b) && L.f(this.f154220c, badgeBarV3Item.f154220c) && L.f(this.f154221d, badgeBarV3Item.f154221d) && L.f(this.f154222e, badgeBarV3Item.f154222e) && L.f(this.f154223f, badgeBarV3Item.f154223f);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154735c() {
        return this.f154220c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85764e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF245148b() {
        return this.f154219b;
    }

    public final int hashCode() {
        int iE2 = H.e(com.avito.android.bxcontent.mvi.entity.f.b(this.f154220c, this.f154219b.hashCode() * 31, 31), 31, this.f154221d);
        String str = this.f154222e;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        Action action = this.f154223f;
        return iHashCode + (action != null ? action.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "BadgeBarV3Item(stringId=" + this.f154219b + ", gridType=" + this.f154220c + ", badges=" + this.f154221d + ", showMoreTitle=" + this.f154222e + ", action=" + this.f154223f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154219b);
        parcel.writeParcelable(this.f154220c, i12);
        Iterator itJ = C0.j(this.f154221d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f154222e);
        parcel.writeParcelable(this.f154223f, i12);
    }

    public /* synthetic */ BadgeBarV3Item(String str, GridElementType gridElementType, List list, String str2, Action action, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, list, str2, action);
    }
}
