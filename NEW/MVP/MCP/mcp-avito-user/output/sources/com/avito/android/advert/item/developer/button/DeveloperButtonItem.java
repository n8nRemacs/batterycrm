package com.avito.android.advert.item.developer.button;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DeveloperButtonItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/developer/button/DeveloperButtonItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DeveloperButtonItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<DeveloperButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f75164b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f75165c;

    /* renamed from: d, reason: collision with root package name */
    public final int f75166d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public SerpDisplayType f75167e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f75168f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ButtonAction f75169g;

    /* compiled from: DeveloperButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeveloperButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final DeveloperButtonItem createFromParcel(Parcel parcel) {
            return new DeveloperButtonItem(parcel.readLong(), parcel.readString(), parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), (ButtonAction) parcel.readParcelable(DeveloperButtonItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DeveloperButtonItem[] newArray(int i12) {
            return new DeveloperButtonItem[i12];
        }
    }

    public DeveloperButtonItem(long j12, @k String str, int i12, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @l ButtonAction buttonAction) {
        this.f75164b = j12;
        this.f75165c = str;
        this.f75166d = i12;
        this.f75167e = serpDisplayType;
        this.f75168f = serpViewType;
        this.f75169g = buttonAction;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    public final BlockItem K5(int i12) {
        return new DeveloperButtonItem(this.f75164b, this.f75165c, i12, this.f75167e, this.f75168f, this.f75169g);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f75167e = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeveloperButtonItem)) {
            return false;
        }
        DeveloperButtonItem developerButtonItem = (DeveloperButtonItem) obj;
        return this.f75164b == developerButtonItem.f75164b && L.f(this.f75165c, developerButtonItem.f75165c) && this.f75166d == developerButtonItem.f75166d && this.f75167e == developerButtonItem.f75167e && this.f75168f == developerButtonItem.f75168f && L.f(this.f75169g, developerButtonItem.f75169g);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF85650b() {
        return this.f75164b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85652d() {
        return this.f75166d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF85651c() {
        return this.f75165c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF85654f() {
        return this.f75168f;
    }

    public final int hashCode() {
        int iJ2 = com.avito.android.actions_sheet.a.j(this.f75168f, com.avito.android.actions_sheet.a.h(this.f75167e, r.e(this.f75166d, H.d(Long.hashCode(this.f75164b) * 31, 31, this.f75165c), 31), 31), 31);
        ButtonAction buttonAction = this.f75169g;
        return iJ2 + (buttonAction == null ? 0 : buttonAction.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeveloperButtonItem(id=");
        sb2.append(this.f75164b);
        sb2.append(", stringId=");
        sb2.append(this.f75165c);
        sb2.append(", spanCount=");
        sb2.append(this.f75166d);
        sb2.append(", displayType=");
        sb2.append(this.f75167e);
        sb2.append(", viewType=");
        sb2.append(this.f75168f);
        sb2.append(", button=");
        return com.avito.android.advert.item.delivery_suggests.l.p(sb2, this.f75169g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f75164b);
        parcel.writeString(this.f75165c);
        parcel.writeInt(this.f75166d);
        parcel.writeString(this.f75167e.name());
        parcel.writeString(this.f75168f.name());
        parcel.writeParcelable(this.f75169g, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DeveloperButtonItem(long j12, String str, int i12, SerpDisplayType serpDisplayType, SerpViewType serpViewType, ButtonAction buttonAction, int i13, C42822w c42822w) {
        long j13;
        if ((i13 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j13 = 94;
        } else {
            j13 = j12;
        }
        this(j13, (i13 & 2) != 0 ? String.valueOf(j13) : str, i12, (i13 & 8) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, buttonAction);
    }
}
