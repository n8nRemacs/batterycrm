package com.avito.android.advert.item.short_term_rent.payment_toggles;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert.item.short_term_rent.payment_toggles.toggle.AdvertDetailsTravelPaymentToggleItem;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import pb.InterfaceC47047c;

/* compiled from: AdvertDetailsTravelPaymentTogglesItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/short_term_rent/payment_toggles/AdvertDetailsTravelPaymentTogglesItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lpb/c;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsTravelPaymentTogglesItem implements BlockItem, InterfaceC47047c, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsTravelPaymentTogglesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f80070b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f80071c;

    /* renamed from: d, reason: collision with root package name */
    public final int f80072d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SerpDisplayType f80073e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f80074f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final AttributedText f80075g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final List<AdvertDetailsTravelPaymentToggleItem> f80076h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Parcelable f80077i;

    /* compiled from: AdvertDetailsTravelPaymentTogglesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsTravelPaymentTogglesItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsTravelPaymentTogglesItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            int i12 = parcel.readInt();
            SerpDisplayType serpDisplayTypeValueOf = SerpDisplayType.valueOf(parcel.readString());
            SerpViewType serpViewTypeValueOf = SerpViewType.valueOf(parcel.readString());
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AdvertDetailsTravelPaymentTogglesItem.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(AdvertDetailsTravelPaymentToggleItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new AdvertDetailsTravelPaymentTogglesItem(j12, string, i12, serpDisplayTypeValueOf, serpViewTypeValueOf, attributedText, arrayList, parcel.readParcelable(AdvertDetailsTravelPaymentTogglesItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsTravelPaymentTogglesItem[] newArray(int i12) {
            return new AdvertDetailsTravelPaymentTogglesItem[i12];
        }
    }

    public AdvertDetailsTravelPaymentTogglesItem(long j12, @Y61.k String str, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType, @Y61.l AttributedText attributedText, @Y61.k List<AdvertDetailsTravelPaymentToggleItem> list, @Y61.l Parcelable parcelable) {
        this.f80070b = j12;
        this.f80071c = str;
        this.f80072d = i12;
        this.f80073e = serpDisplayType;
        this.f80074f = serpViewType;
        this.f80075g = attributedText;
        this.f80076h = list;
        this.f80077i = parcelable;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsTravelPaymentTogglesItem(this.f80070b, this.f80071c, i12, this.f80073e, this.f80074f, this.f80075g, this.f80076h, this.f80077i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsTravelPaymentTogglesItem)) {
            return false;
        }
        AdvertDetailsTravelPaymentTogglesItem advertDetailsTravelPaymentTogglesItem = (AdvertDetailsTravelPaymentTogglesItem) obj;
        return this.f80070b == advertDetailsTravelPaymentTogglesItem.f80070b && L.f(this.f80071c, advertDetailsTravelPaymentTogglesItem.f80071c) && this.f80072d == advertDetailsTravelPaymentTogglesItem.f80072d && this.f80073e == advertDetailsTravelPaymentTogglesItem.f80073e && this.f80074f == advertDetailsTravelPaymentTogglesItem.f80074f && L.f(this.f80075g, advertDetailsTravelPaymentTogglesItem.f80075g) && L.f(this.f80076h, advertDetailsTravelPaymentTogglesItem.f80076h) && L.f(this.f80077i, advertDetailsTravelPaymentTogglesItem.f80077i);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF123950b() {
        return this.f80070b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF84838g() {
        return this.f80072d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF262689b() {
        return this.f80071c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84840i() {
        return this.f80074f;
    }

    public final int hashCode() {
        int iJ2 = com.avito.android.actions_sheet.a.j(this.f80074f, com.avito.android.actions_sheet.a.h(this.f80073e, r.e(this.f80072d, H.d(Long.hashCode(this.f80070b) * 31, 31, this.f80071c), 31), 31), 31);
        AttributedText attributedText = this.f80075g;
        int iE2 = H.e((iJ2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f80076h);
        Parcelable parcelable = this.f80077i;
        return iE2 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsTravelPaymentTogglesItem(id=");
        sb2.append(this.f80070b);
        sb2.append(", stringId=");
        sb2.append(this.f80071c);
        sb2.append(", spanCount=");
        sb2.append(this.f80072d);
        sb2.append(", displayType=");
        sb2.append(this.f80073e);
        sb2.append(", viewType=");
        sb2.append(this.f80074f);
        sb2.append(", title=");
        sb2.append(this.f80075g);
        sb2.append(", toggles=");
        sb2.append(this.f80076h);
        sb2.append(", listState=");
        return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f80077i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f80070b);
        parcel.writeString(this.f80071c);
        parcel.writeInt(this.f80072d);
        parcel.writeString(this.f80073e.name());
        parcel.writeString(this.f80074f.name());
        parcel.writeParcelable(this.f80075g, i12);
        Iterator itJ = C0.j(this.f80076h, parcel);
        while (itJ.hasNext()) {
            ((AdvertDetailsTravelPaymentToggleItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f80077i, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsTravelPaymentTogglesItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, AttributedText attributedText, List list, Parcelable parcelable, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 210;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, attributedText, list, (i13 & 128) != 0 ? null : parcelable);
    }
}
