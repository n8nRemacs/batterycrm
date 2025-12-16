package com.avito.android.advert.item.modelSpecs.button;

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

/* compiled from: ModelSpecsButtonItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/modelSpecs/button/ModelSpecsButtonItem;", "Lcom/avito/android/advert/item/modelSpecs/ModelSpecsItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ModelSpecsButtonItem implements ModelSpecsItem {

    @k
    public static final Parcelable.Creator<ModelSpecsButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f77616b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f77617c;

    /* renamed from: d, reason: collision with root package name */
    public final int f77618d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ModelCardInfo f77619e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public SerpDisplayType f77620f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f77621g;

    /* compiled from: ModelSpecsButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ModelSpecsButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final ModelSpecsButtonItem createFromParcel(Parcel parcel) {
            return new ModelSpecsButtonItem(parcel.readLong(), parcel.readString(), parcel.readInt(), (ModelCardInfo) parcel.readParcelable(ModelSpecsButtonItem.class.getClassLoader()), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ModelSpecsButtonItem[] newArray(int i12) {
            return new ModelSpecsButtonItem[i12];
        }
    }

    public ModelSpecsButtonItem(long j12, @k String str, int i12, @k ModelCardInfo modelCardInfo, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType) {
        this.f77616b = j12;
        this.f77617c = str;
        this.f77618d = i12;
        this.f77619e = modelCardInfo;
        this.f77620f = serpDisplayType;
        this.f77621g = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new ModelSpecsButtonItem(this.f77616b, this.f77617c, i12, this.f77619e, this.f77620f, this.f77621g);
    }

    @Override // com.avito.android.advert.item.modelSpecs.ModelSpecsItem
    @k
    /* renamed from: S, reason: from getter */
    public final ModelCardInfo getF77633e() {
        return this.f77619e;
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f77620f = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelSpecsButtonItem)) {
            return false;
        }
        ModelSpecsButtonItem modelSpecsButtonItem = (ModelSpecsButtonItem) obj;
        return this.f77616b == modelSpecsButtonItem.f77616b && L.f(this.f77617c, modelSpecsButtonItem.f77617c) && this.f77618d == modelSpecsButtonItem.f77618d && L.f(this.f77619e, modelSpecsButtonItem.f77619e) && this.f77620f == modelSpecsButtonItem.f77620f && this.f77621g == modelSpecsButtonItem.f77621g;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF78464b() {
        return this.f77616b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78465c() {
        return this.f77618d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF78466d() {
        return this.f77617c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF78467e() {
        return this.f77621g;
    }

    public final int hashCode() {
        return this.f77621g.hashCode() + com.avito.android.actions_sheet.a.h(this.f77620f, (this.f77619e.hashCode() + r.e(this.f77618d, H.d(Long.hashCode(this.f77616b) * 31, 31, this.f77617c), 31)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModelSpecsButtonItem(id=");
        sb2.append(this.f77616b);
        sb2.append(", stringId=");
        sb2.append(this.f77617c);
        sb2.append(", spanCount=");
        sb2.append(this.f77618d);
        sb2.append(", model=");
        sb2.append(this.f77619e);
        sb2.append(", displayType=");
        sb2.append(this.f77620f);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f77621g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f77616b);
        parcel.writeString(this.f77617c);
        parcel.writeInt(this.f77618d);
        parcel.writeParcelable(this.f77619e, i12);
        parcel.writeString(this.f77620f.name());
        parcel.writeString(this.f77621g.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ModelSpecsButtonItem(long j12, String str, int i12, ModelCardInfo modelCardInfo, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 107;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, modelCardInfo, (i13 & 16) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
