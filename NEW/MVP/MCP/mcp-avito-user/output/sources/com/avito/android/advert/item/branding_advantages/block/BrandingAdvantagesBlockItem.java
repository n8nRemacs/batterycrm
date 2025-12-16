package com.avito.android.advert.item.branding_advantages.block;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.branding_advantages.block_element.BrandingAdvantagesBlockElementItem;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BrandingAdvantagesBlockItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/branding_advantages/block/BrandingAdvantagesBlockItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Description", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class BrandingAdvantagesBlockItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<BrandingAdvantagesBlockItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f74168b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Description f74169c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final List<BrandingAdvantagesBlockElementItem> f74170d;

    /* renamed from: e, reason: collision with root package name */
    public final long f74171e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f74172f;

    /* renamed from: g, reason: collision with root package name */
    public final int f74173g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public SerpDisplayType f74174h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final SerpViewType f74175i;

    /* compiled from: BrandingAdvantagesBlockItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/branding_advantages/block/BrandingAdvantagesBlockItem$Description;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Description implements Parcelable {

        @k
        public static final Parcelable.Creator<Description> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f74176b;

        /* renamed from: c, reason: collision with root package name */
        public final int f74177c;

        /* compiled from: BrandingAdvantagesBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Description> {
            @Override // android.os.Parcelable.Creator
            public final Description createFromParcel(Parcel parcel) {
                return new Description(parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Description[] newArray(int i12) {
                return new Description[i12];
            }
        }

        public Description(@k String str, int i12) {
            this.f74176b = str;
            this.f74177c = i12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Description)) {
                return false;
            }
            Description description = (Description) obj;
            return L.f(this.f74176b, description.f74176b) && this.f74177c == description.f74177c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f74177c) + (this.f74176b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Description(text=");
            sb2.append(this.f74176b);
            sb2.append(", maxLines=");
            return r.t(sb2, this.f74177c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f74176b);
            parcel.writeInt(this.f74177c);
        }
    }

    /* compiled from: BrandingAdvantagesBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BrandingAdvantagesBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final BrandingAdvantagesBlockItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            ArrayList arrayList = null;
            Description descriptionCreateFromParcel = parcel.readInt() == 0 ? null : Description.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(BrandingAdvantagesBlockElementItem.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new BrandingAdvantagesBlockItem(string, descriptionCreateFromParcel, arrayList, parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BrandingAdvantagesBlockItem[] newArray(int i12) {
            return new BrandingAdvantagesBlockItem[i12];
        }
    }

    public BrandingAdvantagesBlockItem(@k String str, @l Description description, @l List<BrandingAdvantagesBlockElementItem> list, long j12, @k String str2, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f74168b = str;
        this.f74169c = description;
        this.f74170d = list;
        this.f74171e = j12;
        this.f74172f = str2;
        this.f74173g = i12;
        this.f74174h = serpDisplayType;
        this.f74175i = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new BrandingAdvantagesBlockItem(this.f74168b, this.f74169c, this.f74170d, this.f74171e, this.f74172f, i12, this.f74174h, this.f74175i);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f74174h = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandingAdvantagesBlockItem)) {
            return false;
        }
        BrandingAdvantagesBlockItem brandingAdvantagesBlockItem = (BrandingAdvantagesBlockItem) obj;
        return L.f(this.f74168b, brandingAdvantagesBlockItem.f74168b) && L.f(this.f74169c, brandingAdvantagesBlockItem.f74169c) && L.f(this.f74170d, brandingAdvantagesBlockItem.f74170d) && this.f74171e == brandingAdvantagesBlockItem.f74171e && L.f(this.f74172f, brandingAdvantagesBlockItem.f74172f) && this.f74173g == brandingAdvantagesBlockItem.f74173g && this.f74174h == brandingAdvantagesBlockItem.f74174h && this.f74175i == brandingAdvantagesBlockItem.f74175i;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF74201e() {
        return this.f74171e;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75425n() {
        return this.f74173g;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF74202f() {
        return this.f74172f;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF75427p() {
        return this.f74175i;
    }

    public final int hashCode() {
        int iHashCode = this.f74168b.hashCode() * 31;
        Description description = this.f74169c;
        int iHashCode2 = (iHashCode + (description == null ? 0 : description.hashCode())) * 31;
        List<BrandingAdvantagesBlockElementItem> list = this.f74170d;
        return this.f74175i.hashCode() + com.avito.android.actions_sheet.a.h(this.f74174h, r.e(this.f74173g, H.d(r.g((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.f74171e), 31, this.f74172f), 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrandingAdvantagesBlockItem(title=");
        sb2.append(this.f74168b);
        sb2.append(", description=");
        sb2.append(this.f74169c);
        sb2.append(", items=");
        sb2.append(this.f74170d);
        sb2.append(", id=");
        sb2.append(this.f74171e);
        sb2.append(", stringId=");
        sb2.append(this.f74172f);
        sb2.append(", spanCount=");
        sb2.append(this.f74173g);
        sb2.append(", displayType=");
        sb2.append(this.f74174h);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f74175i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f74168b);
        Description description = this.f74169c;
        if (description == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            description.writeToParcel(parcel, i12);
        }
        List<BrandingAdvantagesBlockElementItem> list = this.f74170d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((BrandingAdvantagesBlockElementItem) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeLong(this.f74171e);
        parcel.writeString(this.f74172f);
        parcel.writeInt(this.f74173g);
        parcel.writeString(this.f74174h.name());
        parcel.writeString(this.f74175i.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BrandingAdvantagesBlockItem(String str, Description description, List list, long j12, String str2, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 8) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 204;
        } else {
            j13 = j12;
        }
        this(str, description, list, j13, (i13 & 16) != 0 ? String.valueOf(j13) : str2, i12, (i13 & 64) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 128) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
