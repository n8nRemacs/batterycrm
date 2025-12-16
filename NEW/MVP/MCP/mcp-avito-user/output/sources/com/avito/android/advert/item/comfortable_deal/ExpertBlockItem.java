package com.avito.android.advert.item.comfortable_deal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.Benefit;
import com.avito.android.remote.model.BottomSheetContent;
import com.avito.android.remote.model.ButtonInfo;
import com.avito.android.remote.model.ExpertBlock;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.konveyor.item_visibility_tracker.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExpertBlockItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/comfortable_deal/ExpertBlockItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ExpertBlockItem implements BlockItem, Q, l1, b.InterfaceC10495b {

    @Y61.k
    public static final Parcelable.Creator<ExpertBlockItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f74281b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f74282c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f74283d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f74284e;

    /* renamed from: f, reason: collision with root package name */
    public final int f74285f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f74286g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ExpertBlock f74287h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final List<Benefit> f74288i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ButtonInfo f74289j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final BottomSheetContent f74290k;

    /* renamed from: l, reason: collision with root package name */
    public final long f74291l;

    /* compiled from: ExpertBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExpertBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final ExpertBlockItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            SerpDisplayType serpDisplayTypeValueOf = SerpDisplayType.valueOf(parcel.readString());
            SerpViewType serpViewTypeValueOf = SerpViewType.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            ExpertBlock expertBlock = (ExpertBlock) parcel.readParcelable(ExpertBlockItem.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iL2 = 0;
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(ExpertBlockItem.class, parcel, arrayList, iL2, 1);
            }
            return new ExpertBlockItem(j12, string, serpDisplayTypeValueOf, serpViewTypeValueOf, i12, string2, expertBlock, arrayList, (ButtonInfo) parcel.readParcelable(ExpertBlockItem.class.getClassLoader()), (BottomSheetContent) parcel.readParcelable(ExpertBlockItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ExpertBlockItem[] newArray(int i12) {
            return new ExpertBlockItem[i12];
        }
    }

    public ExpertBlockItem(long j12, @Y61.k String str, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType, int i12, @Y61.k String str2, @Y61.k ExpertBlock expertBlock, @Y61.k List<Benefit> list, @Y61.k ButtonInfo buttonInfo, @Y61.k BottomSheetContent bottomSheetContent) {
        this.f74281b = j12;
        this.f74282c = str;
        this.f74283d = serpDisplayType;
        this.f74284e = serpViewType;
        this.f74285f = i12;
        this.f74286g = str2;
        this.f74287h = expertBlock;
        this.f74288i = list;
        this.f74289j = buttonInfo;
        this.f74290k = bottomSheetContent;
        this.f74291l = j12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new ExpertBlockItem(this.f74281b, this.f74282c, this.f74283d, this.f74284e, i12, this.f74286g, this.f74287h, this.f74288i, this.f74289j, this.f74290k);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f74283d = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpertBlockItem)) {
            return false;
        }
        ExpertBlockItem expertBlockItem = (ExpertBlockItem) obj;
        return this.f74281b == expertBlockItem.f74281b && L.f(this.f74282c, expertBlockItem.f74282c) && this.f74283d == expertBlockItem.f74283d && this.f74284e == expertBlockItem.f74284e && this.f74285f == expertBlockItem.f74285f && L.f(this.f74286g, expertBlockItem.f74286g) && L.f(this.f74287h, expertBlockItem.f74287h) && L.f(this.f74288i, expertBlockItem.f74288i) && L.f(this.f74289j, expertBlockItem.f74289j) && L.f(this.f74290k, expertBlockItem.f74290k);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF76203b() {
        return this.f74281b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF252243n() {
        return this.f74285f;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF252231b() {
        return this.f74282c;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF252241l() {
        return this.f74291l;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF252242m() {
        return this.f74284e;
    }

    public final int hashCode() {
        return this.f74290k.hashCode() + ((this.f74289j.hashCode() + H.e((this.f74287h.hashCode() + H.d(r.e(this.f74285f, com.avito.android.actions_sheet.a.j(this.f74284e, com.avito.android.actions_sheet.a.h(this.f74283d, H.d(Long.hashCode(this.f74281b) * 31, 31, this.f74282c), 31), 31), 31), 31, this.f74286g)) * 31, 31, this.f74288i)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "ExpertBlockItem(id=" + this.f74281b + ", stringId=" + this.f74282c + ", displayType=" + this.f74283d + ", viewType=" + this.f74284e + ", spanCount=" + this.f74285f + ", title=" + this.f74286g + ", expertBlock=" + this.f74287h + ", benefits=" + this.f74288i + ", button=" + this.f74289j + ", bottomSheetInfo=" + this.f74290k + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f74281b);
        parcel.writeString(this.f74282c);
        parcel.writeString(this.f74283d.name());
        parcel.writeString(this.f74284e.name());
        parcel.writeInt(this.f74285f);
        parcel.writeString(this.f74286g);
        parcel.writeParcelable(this.f74287h, i12);
        Iterator itJ = C0.j(this.f74288i, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f74289j, i12);
        parcel.writeParcelable(this.f74290k, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ExpertBlockItem(long j12, String str, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i12, String str2, ExpertBlock expertBlock, List list, ButtonInfo buttonInfo, BottomSheetContent bottomSheetContent, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 214;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, (i13 & 4) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 8) != 0 ? SerpViewType.f268585e : serpViewType, i12, str2, expertBlock, list, buttonInfo, bottomSheetContent);
    }
}
