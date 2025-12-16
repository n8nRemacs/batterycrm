package com.avito.android.advert_details_items.carousel_photogallery;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.Video;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CarouselPhotoGalleryItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/carousel_photogallery/CarouselPhotoGalleryItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CarouselPhotoGalleryItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<CarouselPhotoGalleryItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f84530b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f84531c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final List<Image> f84532d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Video f84533e;

    /* renamed from: f, reason: collision with root package name */
    public int f84534f;

    /* renamed from: g, reason: collision with root package name */
    public final long f84535g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f84536h;

    /* renamed from: i, reason: collision with root package name */
    public final int f84537i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f84538j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f84539k;

    /* compiled from: CarouselPhotoGalleryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CarouselPhotoGalleryItem> {
        @Override // android.os.Parcelable.Creator
        public final CarouselPhotoGalleryItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(CarouselPhotoGalleryItem.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new CarouselPhotoGalleryItem(j12, string, arrayList, (Video) parcel.readParcelable(CarouselPhotoGalleryItem.class.getClassLoader()), parcel.readInt(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final CarouselPhotoGalleryItem[] newArray(int i12) {
            return new CarouselPhotoGalleryItem[i12];
        }
    }

    public CarouselPhotoGalleryItem(long j12, @Y61.k String str, @Y61.l List<Image> list, @Y61.l Video video, int i12, long j13, boolean z12, int i13, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType) {
        this.f84530b = j12;
        this.f84531c = str;
        this.f84532d = list;
        this.f84533e = video;
        this.f84534f = i12;
        this.f84535g = j13;
        this.f84536h = z12;
        this.f84537i = i13;
        this.f84538j = serpDisplayType;
        this.f84539k = serpViewType;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return new CarouselPhotoGalleryItem(this.f84530b, this.f84531c, this.f84532d, this.f84533e, this.f84534f, this.f84535g, this.f84536h, i12, this.f84538j, this.f84539k);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f84538j = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselPhotoGalleryItem)) {
            return false;
        }
        CarouselPhotoGalleryItem carouselPhotoGalleryItem = (CarouselPhotoGalleryItem) obj;
        return this.f84530b == carouselPhotoGalleryItem.f84530b && L.f(this.f84531c, carouselPhotoGalleryItem.f84531c) && L.f(this.f84532d, carouselPhotoGalleryItem.f84532d) && L.f(this.f84533e, carouselPhotoGalleryItem.f84533e) && this.f84534f == carouselPhotoGalleryItem.f84534f && this.f84535g == carouselPhotoGalleryItem.f84535g && this.f84536h == carouselPhotoGalleryItem.f84536h && this.f84537i == carouselPhotoGalleryItem.f84537i && this.f84538j == carouselPhotoGalleryItem.f84538j && this.f84539k == carouselPhotoGalleryItem.f84539k;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF182874b() {
        return this.f84530b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79129d() {
        return this.f84537i;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79127b() {
        return this.f84531c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79132g() {
        return this.f84539k;
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f84530b) * 31, 31, this.f84531c);
        List<Image> list = this.f84532d;
        int iHashCode = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
        Video video = this.f84533e;
        return this.f84539k.hashCode() + com.avito.android.actions_sheet.a.h(this.f84538j, r.e(this.f84537i, r.i(r.g(r.e(this.f84534f, (iHashCode + (video != null ? video.hashCode() : 0)) * 31, 31), 31, this.f84535g), 31, this.f84536h), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CarouselPhotoGalleryItem(id=");
        sb2.append(this.f84530b);
        sb2.append(", stringId=");
        sb2.append(this.f84531c);
        sb2.append(", images=");
        sb2.append(this.f84532d);
        sb2.append(", video=");
        sb2.append(this.f84533e);
        sb2.append(", currentPosition=");
        sb2.append(this.f84534f);
        sb2.append(", stateId=");
        sb2.append(this.f84535g);
        sb2.append(", isRedesign=");
        sb2.append(this.f84536h);
        sb2.append(", spanCount=");
        sb2.append(this.f84537i);
        sb2.append(", displayType=");
        sb2.append(this.f84538j);
        sb2.append(", viewType=");
        return com.avito.android.actions_sheet.a.x(sb2, this.f84539k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f84530b);
        parcel.writeString(this.f84531c);
        List<Image> list = this.f84532d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f84533e, i12);
        parcel.writeInt(this.f84534f);
        parcel.writeLong(this.f84535g);
        parcel.writeInt(this.f84536h ? 1 : 0);
        parcel.writeInt(this.f84537i);
        parcel.writeString(this.f84538j.name());
        parcel.writeString(this.f84539k.name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CarouselPhotoGalleryItem(long j12, String str, List list, Video video, int i12, long j13, boolean z12, int i13, SerpDisplayType serpDisplayType, SerpViewType serpViewType, int i14, C42822w c42822w) {
        long j14;
        if ((i14 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j14 = 0;
        } else {
            j14 = j12;
        }
        this(j14, (i14 & 2) != 0 ? String.valueOf(j14) : str, list, video, (i14 & 16) != 0 ? 0 : i12, (i14 & 32) != 0 ? 0L : j13, (i14 & 64) != 0 ? false : z12, i13, (i14 & 256) != 0 ? SerpDisplayType.Grid : serpDisplayType, (i14 & 512) != 0 ? SerpViewType.f268585e : serpViewType);
    }
}
