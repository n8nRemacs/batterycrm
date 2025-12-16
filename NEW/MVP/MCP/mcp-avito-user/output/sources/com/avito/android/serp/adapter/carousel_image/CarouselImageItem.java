package com.avito.android.serp.adapter.carousel_image;

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

/* compiled from: CarouselImageItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_image/CarouselImageItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CarouselImageItem implements PersistableSerpItem {

    @k
    public static final Parcelable.Creator<CarouselImageItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f269108b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f269109c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AdditionalItem.Image f269110d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpDisplayType f269111e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f269112f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Y41.a<G0> f269113g;

    /* compiled from: CarouselImageItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CarouselImageItem> {
        @Override // android.os.Parcelable.Creator
        public final CarouselImageItem createFromParcel(Parcel parcel) {
            return new CarouselImageItem(parcel.readInt(), parcel.readString(), (AdditionalItem.Image) parcel.readParcelable(CarouselImageItem.class.getClassLoader()), SerpDisplayType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final CarouselImageItem[] newArray(int i12) {
            return new CarouselImageItem[i12];
        }
    }

    public CarouselImageItem(int i12, @k String str, @k AdditionalItem.Image image, @k SerpDisplayType serpDisplayType) {
        this.f269108b = i12;
        this.f269109c = str;
        this.f269110d = image;
        this.f269111e = serpDisplayType;
        this.f269112f = SerpViewType.f268585e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselImageItem)) {
            return false;
        }
        CarouselImageItem carouselImageItem = (CarouselImageItem) obj;
        return this.f269108b == carouselImageItem.f269108b && L.f(this.f269109c, carouselImageItem.f269109c) && L.f(this.f269110d, carouselImageItem.f269110d) && this.f269111e == carouselImageItem.f269111e;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272887i() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80616b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF84867b() {
        return this.f269108b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF251986b() {
        return this.f269109c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84870e() {
        return this.f269112f;
    }

    public final int hashCode() {
        return this.f269111e.hashCode() + ((this.f269110d.hashCode() + H.d(Integer.hashCode(this.f269108b) * 31, 31, this.f269109c)) * 31);
    }

    @k
    public final String toString() {
        return "CarouselImageItem(spanCount=" + this.f269108b + ", stringId=" + this.f269109c + ", value=" + this.f269110d + ", displayType=" + this.f269111e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f269108b);
        parcel.writeString(this.f269109c);
        parcel.writeParcelable(this.f269110d, i12);
        parcel.writeString(this.f269111e.name());
    }

    public /* synthetic */ CarouselImageItem(int i12, String str, AdditionalItem.Image image, SerpDisplayType serpDisplayType, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 1 : i12, (i13 & 2) != 0 ? UUID.randomUUID().toString() : str, image, serpDisplayType);
    }
}
