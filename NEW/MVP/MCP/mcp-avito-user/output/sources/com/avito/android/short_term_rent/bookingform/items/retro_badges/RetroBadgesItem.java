package com.avito.android.short_term_rent.bookingform.items.retro_badges;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItem;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RetroBadgesItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/retro_badges/RetroBadgesItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RetroBadgesItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<RetroBadgesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f281621b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<List<RetroBadgeItem>> f281622c;

    /* compiled from: RetroBadgesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RetroBadgesItem> {
        @Override // android.os.Parcelable.Creator
        public final RetroBadgesItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList2.add(parcel.readInt() == 0 ? null : RetroBadgeItem.CREATOR.createFromParcel(parcel));
                }
                arrayList.add(arrayList2);
            }
            return new RetroBadgesItem(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RetroBadgesItem[] newArray(int i12) {
            return new RetroBadgesItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RetroBadgesItem(@k String str, @k List<? extends List<RetroBadgeItem>> list) {
        this.f281621b = str;
        this.f281622c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RetroBadgesItem)) {
            return false;
        }
        RetroBadgesItem retroBadgesItem = (RetroBadgesItem) obj;
        return L.f(this.f281621b, retroBadgesItem.f281621b) && L.f(this.f281622c, retroBadgesItem.f281622c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123950b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF2713d() {
        return this.f281621b;
    }

    public final int hashCode() {
        return this.f281622c.hashCode() + (this.f281621b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RetroBadgesItem(stringId=");
        sb2.append(this.f281621b);
        sb2.append(", items=");
        return H.p(sb2, this.f281622c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f281621b);
        Iterator itJ = C0.j(this.f281622c, parcel);
        while (itJ.hasNext()) {
            Iterator itJ2 = C0.j((List) itJ.next(), parcel);
            while (itJ2.hasNext()) {
                RetroBadgeItem retroBadgeItem = (RetroBadgeItem) itJ2.next();
                if (retroBadgeItem == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    retroBadgeItem.writeToParcel(parcel, i12);
                }
            }
        }
    }
}
