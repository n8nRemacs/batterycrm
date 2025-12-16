package com.avito.android.advert.item.modelSpecs.link;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.modelSpecs.ModelSpecsItem;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.model_card.ModelCardInfo;
import com.avito.android.serp.adapter.SerpViewType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ModelSpecsLinkItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/modelSpecs/link/ModelSpecsLinkItem;", "Lcom/avito/android/advert/item/modelSpecs/ModelSpecsItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ModelSpecsLinkItem implements ModelSpecsItem {

    @k
    public static final Parcelable.Creator<ModelSpecsLinkItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f77630b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f77631c;

    /* renamed from: d, reason: collision with root package name */
    public final int f77632d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ModelCardInfo f77633e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f77634f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f77635g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f77636h;

    /* compiled from: ModelSpecsLinkItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ModelSpecsLinkItem> {
        @Override // android.os.Parcelable.Creator
        public final ModelSpecsLinkItem createFromParcel(Parcel parcel) {
            return new ModelSpecsLinkItem(parcel.readLong(), parcel.readString(), parcel.readInt(), (ModelCardInfo) parcel.readParcelable(ModelSpecsLinkItem.class.getClassLoader()), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ModelSpecsLinkItem[] newArray(int i12) {
            return new ModelSpecsLinkItem[i12];
        }
    }

    public ModelSpecsLinkItem(long j12, @k String str, int i12, @k ModelCardInfo modelCardInfo, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, boolean z12) {
        this.f77630b = j12;
        this.f77631c = str;
        this.f77632d = i12;
        this.f77633e = modelCardInfo;
        this.f77634f = serpDisplayType;
        this.f77635g = serpViewType;
        this.f77636h = z12;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new ModelSpecsLinkItem(this.f77630b, this.f77631c, i12, this.f77633e, this.f77634f, this.f77635g, this.f77636h);
    }

    @Override // com.avito.android.advert.item.modelSpecs.ModelSpecsItem
    @k
    /* renamed from: S, reason: from getter */
    public final ModelCardInfo getF77633e() {
        return this.f77633e;
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f77634f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelSpecsLinkItem)) {
            return false;
        }
        ModelSpecsLinkItem modelSpecsLinkItem = (ModelSpecsLinkItem) obj;
        return this.f77630b == modelSpecsLinkItem.f77630b && L.f(this.f77631c, modelSpecsLinkItem.f77631c) && this.f77632d == modelSpecsLinkItem.f77632d && L.f(this.f77633e, modelSpecsLinkItem.f77633e) && this.f77634f == modelSpecsLinkItem.f77634f && this.f77635g == modelSpecsLinkItem.f77635g && this.f77636h == modelSpecsLinkItem.f77636h;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF78464b() {
        return this.f77630b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78465c() {
        return this.f77632d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF78466d() {
        return this.f77631c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF78467e() {
        return this.f77635g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f77636h) + com.avito.android.actions_sheet.a.j(this.f77635g, com.avito.android.actions_sheet.a.h(this.f77634f, (this.f77633e.hashCode() + r.e(this.f77632d, H.d(Long.hashCode(this.f77630b) * 31, 31, this.f77631c), 31)) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModelSpecsLinkItem(id=");
        sb2.append(this.f77630b);
        sb2.append(", stringId=");
        sb2.append(this.f77631c);
        sb2.append(", spanCount=");
        sb2.append(this.f77632d);
        sb2.append(", model=");
        sb2.append(this.f77633e);
        sb2.append(", displayType=");
        sb2.append(this.f77634f);
        sb2.append(", viewType=");
        sb2.append(this.f77635g);
        sb2.append(", isRestyle=");
        return r.x(sb2, this.f77636h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f77630b);
        parcel.writeString(this.f77631c);
        parcel.writeInt(this.f77632d);
        parcel.writeParcelable(this.f77633e, i12);
        parcel.writeString(this.f77634f.name());
        parcel.writeString(this.f77635g.name());
        parcel.writeInt(this.f77636h ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ModelSpecsLinkItem(long j12, String str, int i12, ModelCardInfo modelCardInfo, SerpDisplayType serpDisplayType, SerpViewType serpViewType, boolean z12, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 107;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, modelCardInfo, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 64) != 0 ? false : z12);
    }
}
