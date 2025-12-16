package com.avito.android.advert.item.realty_usp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RealtyUspItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/realty_usp/RealtyUspItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "UspChipData", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class RealtyUspItem implements BlockItem {

    @Y61.k
    public static final Parcelable.Creator<RealtyUspItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f78384b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f78385c;

    /* renamed from: d, reason: collision with root package name */
    public final int f78386d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<UspChipData> f78387e;

    /* renamed from: f, reason: collision with root package name */
    public final int f78388f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f78389g;

    /* compiled from: RealtyUspItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/realty_usp/RealtyUspItem$UspChipData;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class UspChipData implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<UspChipData> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AttributedText f78390b;

        /* compiled from: RealtyUspItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UspChipData> {
            @Override // android.os.Parcelable.Creator
            public final UspChipData createFromParcel(Parcel parcel) {
                return new UspChipData((AttributedText) parcel.readParcelable(UspChipData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final UspChipData[] newArray(int i12) {
                return new UspChipData[i12];
            }
        }

        public UspChipData(@Y61.k AttributedText attributedText) {
            this.f78390b = attributedText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UspChipData) && L.f(this.f78390b, ((UspChipData) obj).f78390b);
        }

        public final int hashCode() {
            return this.f78390b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("UspChipData(text="), this.f78390b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f78390b, i12);
        }
    }

    /* compiled from: RealtyUspItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RealtyUspItem> {
        @Override // android.os.Parcelable.Creator
        public final RealtyUspItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(UspChipData.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new RealtyUspItem(j12, string, i12, arrayList, parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RealtyUspItem[] newArray(int i12) {
            return new RealtyUspItem[i12];
        }
    }

    public RealtyUspItem(long j12, @Y61.k String str, int i12, @Y61.k List<UspChipData> list, int i13, @Y61.k String str2) {
        this.f78384b = j12;
        this.f78385c = str;
        this.f78386d = i12;
        this.f78387e = list;
        this.f78388f = i13;
        this.f78389g = str2;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        return new RealtyUspItem(this.f78384b, this.f78385c, i12, this.f78387e, this.f78388f, this.f78389g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealtyUspItem)) {
            return false;
        }
        RealtyUspItem realtyUspItem = (RealtyUspItem) obj;
        return this.f78384b == realtyUspItem.f78384b && L.f(this.f78385c, realtyUspItem.f78385c) && this.f78386d == realtyUspItem.f78386d && L.f(this.f78387e, realtyUspItem.f78387e) && this.f78388f == realtyUspItem.f78388f && L.f(this.f78389g, realtyUspItem.f78389g);
    }

    @Override // TV0.a
    public final long getId() {
        return this.f78384b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270704j() {
        return this.f78386d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF243076b() {
        return this.f78385c;
    }

    public final int hashCode() {
        return this.f78389g.hashCode() + r.e(this.f78388f, H.e(r.e(this.f78386d, H.d(Long.hashCode(this.f78384b) * 31, 31, this.f78385c), 31), 31, this.f78387e), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RealtyUspItem(id=");
        sb2.append(this.f78384b);
        sb2.append(", stringId=");
        sb2.append(this.f78385c);
        sb2.append(", spanCount=");
        sb2.append(this.f78386d);
        sb2.append(", data=");
        sb2.append(this.f78387e);
        sb2.append(", collapsedMaxLines=");
        sb2.append(this.f78388f);
        sb2.append(", advertId=");
        return C22026a.c(sb2, this.f78389g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f78384b);
        parcel.writeString(this.f78385c);
        parcel.writeInt(this.f78386d);
        Iterator itJ = C0.j(this.f78387e, parcel);
        while (itJ.hasNext()) {
            ((UspChipData) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f78388f);
        parcel.writeString(this.f78389g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RealtyUspItem(long j12, String str, int i12, List list, int i13, String str2, int i14, C42822w c42822w) {
        long j13;
        if ((i14 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 43;
        } else {
            j13 = j12;
        }
        this(j13, (i14 & 2) != 0 ? String.valueOf(j13) : str, i12, list, i13, str2);
    }
}
