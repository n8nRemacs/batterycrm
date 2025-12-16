package com.avito.android.advert_core.blocks;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.AdvertDetailsBlockId;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsBlockItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/blocks/AdvertDetailsBlockItem;", "Landroid/os/Parcelable;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsBlockItem implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertDetailsBlockItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AdvertDetailsBlockId f83011b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f83012c;

    /* compiled from: AdvertDetailsBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsBlockItem createFromParcel(Parcel parcel) {
            AdvertDetailsBlockId advertDetailsBlockIdValueOf = AdvertDetailsBlockId.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsBlockItem.class, parcel, arrayList, iL2, 1);
            }
            return new AdvertDetailsBlockItem(advertDetailsBlockIdValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsBlockItem[] newArray(int i12) {
            return new AdvertDetailsBlockItem[i12];
        }
    }

    public AdvertDetailsBlockItem(@k AdvertDetailsBlockId advertDetailsBlockId, @k List<? extends PersistableSpannedItem> list) {
        this.f83011b = advertDetailsBlockId;
        this.f83012c = list;
    }

    public static AdvertDetailsBlockItem a(AdvertDetailsBlockItem advertDetailsBlockItem, List list) {
        AdvertDetailsBlockId advertDetailsBlockId = advertDetailsBlockItem.f83011b;
        advertDetailsBlockItem.getClass();
        return new AdvertDetailsBlockItem(advertDetailsBlockId, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsBlockItem)) {
            return false;
        }
        AdvertDetailsBlockItem advertDetailsBlockItem = (AdvertDetailsBlockItem) obj;
        return this.f83011b == advertDetailsBlockItem.f83011b && L.f(this.f83012c, advertDetailsBlockItem.f83012c);
    }

    public final int hashCode() {
        return this.f83012c.hashCode() + (this.f83011b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsBlockItem(id=");
        sb2.append(this.f83011b);
        sb2.append(", items=");
        return H.n(sb2, this.f83012c, ')');
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f83011b.name());
        ?? r02 = this.f83012c;
        parcel.writeInt(r02.size());
        Iterator it = r02.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i12);
        }
    }
}
