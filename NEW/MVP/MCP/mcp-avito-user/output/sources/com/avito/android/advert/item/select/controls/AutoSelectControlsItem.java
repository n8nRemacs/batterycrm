package com.avito.android.advert.item.select.controls;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.auto_select.AutoSelectContactMeModel;
import com.avito.android.remote.model.auto_select.AutoSelectControls;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectControlsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/select/controls/AutoSelectControlsItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AutoSelectControlsItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AutoSelectControlsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f79389b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f79390c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f79391d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f79392e;

    /* renamed from: f, reason: collision with root package name */
    public final int f79393f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AutoSelectControls f79394g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final AutoSelectContactMeModel f79395h;

    /* compiled from: AutoSelectControlsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectControlsItem> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectControlsItem createFromParcel(Parcel parcel) {
            return new AutoSelectControlsItem(parcel.readLong(), parcel.readString(), SerpViewType.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()), parcel.readInt(), (AutoSelectControls) parcel.readParcelable(AutoSelectControlsItem.class.getClassLoader()), (AutoSelectContactMeModel) parcel.readParcelable(AutoSelectControlsItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectControlsItem[] newArray(int i12) {
            return new AutoSelectControlsItem[i12];
        }
    }

    public AutoSelectControlsItem(long j12, @Y61.k String str, @Y61.k SerpViewType serpViewType, @Y61.k SerpDisplayType serpDisplayType, int i12, @Y61.k AutoSelectControls autoSelectControls, @Y61.l AutoSelectContactMeModel autoSelectContactMeModel) {
        this.f79389b = j12;
        this.f79390c = str;
        this.f79391d = serpViewType;
        this.f79392e = serpDisplayType;
        this.f79393f = i12;
        this.f79394g = autoSelectControls;
        this.f79395h = autoSelectContactMeModel;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new AutoSelectControlsItem(this.f79389b, this.f79390c, this.f79391d, this.f79392e, i12, this.f79394g, this.f79395h);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f79392e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoSelectControlsItem)) {
            return false;
        }
        AutoSelectControlsItem autoSelectControlsItem = (AutoSelectControlsItem) obj;
        return this.f79389b == autoSelectControlsItem.f79389b && L.f(this.f79390c, autoSelectControlsItem.f79390c) && this.f79391d == autoSelectControlsItem.f79391d && this.f79392e == autoSelectControlsItem.f79392e && this.f79393f == autoSelectControlsItem.f79393f && L.f(this.f79394g, autoSelectControlsItem.f79394g) && L.f(this.f79395h, autoSelectControlsItem.f79395h);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF76078b() {
        return this.f79389b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF76082f() {
        return this.f79393f;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF324780b() {
        return this.f79390c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF76080d() {
        return this.f79391d;
    }

    public final int hashCode() {
        int iHashCode = (this.f79394g.hashCode() + r.e(this.f79393f, com.avito.android.actions_sheet.a.h(this.f79392e, com.avito.android.actions_sheet.a.j(this.f79391d, H.d(Long.hashCode(this.f79389b) * 31, 31, this.f79390c), 31), 31), 31)) * 31;
        AutoSelectContactMeModel autoSelectContactMeModel = this.f79395h;
        return iHashCode + (autoSelectContactMeModel == null ? 0 : autoSelectContactMeModel.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "AutoSelectControlsItem(id=" + this.f79389b + ", stringId=" + this.f79390c + ", viewType=" + this.f79391d + ", displayType=" + this.f79392e + ", spanCount=" + this.f79393f + ", controls=" + this.f79394g + ", contactMe=" + this.f79395h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f79389b);
        parcel.writeString(this.f79390c);
        parcel.writeString(this.f79391d.name());
        parcel.writeString(this.f79392e.name());
        parcel.writeInt(this.f79393f);
        parcel.writeParcelable(this.f79394g, i12);
        parcel.writeParcelable(this.f79395h, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AutoSelectControlsItem(long j12, String str, SerpViewType serpViewType, SerpDisplayType serpDisplayType, int i12, AutoSelectControls autoSelectControls, AutoSelectContactMeModel autoSelectContactMeModel, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 128;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, (i13 & 4) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, i12, autoSelectControls, (i13 & 64) != 0 ? null : autoSelectContactMeModel);
    }
}
