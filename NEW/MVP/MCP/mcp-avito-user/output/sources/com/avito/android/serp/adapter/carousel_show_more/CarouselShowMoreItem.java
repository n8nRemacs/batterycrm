package com.avito.android.serp.adapter.carousel_show_more;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.inset.AdditionalItem;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import java.util.UUID;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CarouselShowMoreItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_show_more/CarouselShowMoreItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CarouselShowMoreItem implements PersistableSerpItem {

    @k
    public static final Parcelable.Creator<CarouselShowMoreItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f269137b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f269138c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AdditionalItem.ShowMore f269139d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpDisplayType f269140e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f269141f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Y41.l<? super String, G0> f269142g;

    /* compiled from: CarouselShowMoreItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CarouselShowMoreItem> {
        @Override // android.os.Parcelable.Creator
        public final CarouselShowMoreItem createFromParcel(Parcel parcel) {
            return new CarouselShowMoreItem(parcel.readInt(), parcel.readString(), (AdditionalItem.ShowMore) parcel.readParcelable(CarouselShowMoreItem.class.getClassLoader()), SerpDisplayType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final CarouselShowMoreItem[] newArray(int i12) {
            return new CarouselShowMoreItem[i12];
        }
    }

    public CarouselShowMoreItem(int i12, @k String str, @k AdditionalItem.ShowMore showMore, @k SerpDisplayType serpDisplayType) {
        this.f269137b = i12;
        this.f269138c = str;
        this.f269139d = showMore;
        this.f269140e = serpDisplayType;
        this.f269141f = SerpViewType.f268585e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselShowMoreItem)) {
            return false;
        }
        CarouselShowMoreItem carouselShowMoreItem = (CarouselShowMoreItem) obj;
        return this.f269137b == carouselShowMoreItem.f269137b && L.f(this.f269138c, carouselShowMoreItem.f269138c) && L.f(this.f269139d, carouselShowMoreItem.f269139d) && this.f269140e == carouselShowMoreItem.f269140e;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272887i() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74796b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF74798d() {
        return this.f269137b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF265059b() {
        return this.f269138c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF78594d() {
        return this.f269141f;
    }

    public final int hashCode() {
        return this.f269140e.hashCode() + ((this.f269139d.hashCode() + H.d(Integer.hashCode(this.f269137b) * 31, 31, this.f269138c)) * 31);
    }

    @k
    public final String toString() {
        return "CarouselShowMoreItem(spanCount=" + this.f269137b + ", stringId=" + this.f269138c + ", value=" + this.f269139d + ", displayType=" + this.f269140e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f269137b);
        parcel.writeString(this.f269138c);
        parcel.writeParcelable(this.f269139d, i12);
        parcel.writeString(this.f269140e.name());
    }

    public /* synthetic */ CarouselShowMoreItem(int i12, String str, AdditionalItem.ShowMore showMore, SerpDisplayType serpDisplayType, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 1 : i12, (i13 & 2) != 0 ? UUID.randomUUID().toString() : str, showMore, serpDisplayType);
    }
}
