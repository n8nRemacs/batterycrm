package com.avito.android.early_access.adapter.short_price.carousel;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.early_access.adapter.short_price.element.EarlyAccessShortPriceItem;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessShortPricesCarouselItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/adapter/short_price/carousel/EarlyAccessShortPricesCarouselItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EarlyAccessShortPricesCarouselItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<EarlyAccessShortPricesCarouselItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f145224b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<EarlyAccessShortPriceItem> f145225c;

    /* compiled from: EarlyAccessShortPricesCarouselItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessShortPricesCarouselItem> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessShortPricesCarouselItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(EarlyAccessShortPriceItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new EarlyAccessShortPricesCarouselItem(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessShortPricesCarouselItem[] newArray(int i12) {
            return new EarlyAccessShortPricesCarouselItem[i12];
        }
    }

    public EarlyAccessShortPricesCarouselItem(@k String str, @k List<EarlyAccessShortPriceItem> list) {
        this.f145224b = str;
        this.f145225c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyAccessShortPricesCarouselItem)) {
            return false;
        }
        EarlyAccessShortPricesCarouselItem earlyAccessShortPricesCarouselItem = (EarlyAccessShortPricesCarouselItem) obj;
        return L.f(this.f145224b, earlyAccessShortPricesCarouselItem.f145224b) && L.f(this.f145225c, earlyAccessShortPricesCarouselItem.f145225c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83467b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145164b() {
        return this.f145224b;
    }

    public final int hashCode() {
        return this.f145225c.hashCode() + (this.f145224b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessShortPricesCarouselItem(stringId=");
        sb2.append(this.f145224b);
        sb2.append(", prices=");
        return H.p(sb2, this.f145225c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f145224b);
        Iterator itJ = C0.j(this.f145225c, parcel);
        while (itJ.hasNext()) {
            ((EarlyAccessShortPriceItem) itJ.next()).writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ EarlyAccessShortPricesCarouselItem(String str, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? EarlyAccessShortPricesCarouselItem.class.getName() : str, list);
    }
}
