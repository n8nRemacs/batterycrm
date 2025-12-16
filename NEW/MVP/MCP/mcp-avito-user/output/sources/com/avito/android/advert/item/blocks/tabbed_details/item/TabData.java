package com.avito.android.advert.item.blocks.tabbed_details.item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TabData.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/tabbed_details/item/TabData;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TabData implements Parcelable {

    @k
    public static final Parcelable.Creator<TabData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f74093b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public List<? extends PersistableSpannedItem> f74094c;

    /* compiled from: TabData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TabData> {
        @Override // android.os.Parcelable.Creator
        public final TabData createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(TabData.class, parcel, arrayList, iL2, 1);
            }
            return new TabData(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final TabData[] newArray(int i12) {
            return new TabData[i12];
        }
    }

    public TabData(@k String str, @k List<? extends PersistableSpannedItem> list) {
        this.f74093b = str;
        this.f74094c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabData)) {
            return false;
        }
        TabData tabData = (TabData) obj;
        return L.f(this.f74093b, tabData.f74093b) && L.f(this.f74094c, tabData.f74094c);
    }

    public final int hashCode() {
        return this.f74094c.hashCode() + (this.f74093b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TabData(title=");
        sb2.append(this.f74093b);
        sb2.append(", tabContent=");
        return H.p(sb2, this.f74094c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f74093b);
        Iterator itJ = C0.j(this.f74094c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }
}
