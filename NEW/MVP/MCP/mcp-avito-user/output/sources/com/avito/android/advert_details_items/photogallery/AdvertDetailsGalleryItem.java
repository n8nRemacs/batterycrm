package com.avito.android.advert_details_items.photogallery;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.CarouselGalleryGroup;
import com.avito.android.remote.model.GalleryButton;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.autotekateaser.AutotekaCpoTeaser;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.beduin_teaser.BeduinItemTeaser;
import com.avito.android.remote.model.gallery.GalleryConfig;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: AdvertDetailsGalleryItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/photogallery/AdvertDetailsGalleryItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsGalleryItem implements BlockItem, Q, l1 {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsGalleryItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f85003b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f85004c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final List<Image> f85005d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<Image> f85006e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final List<Integer> f85007f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Map<Integer, Image> f85008g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Video f85009h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final NativeVideo f85010i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final AutotekaCpoTeaser f85011j;

    /* renamed from: k, reason: collision with root package name */
    public int f85012k;

    /* renamed from: l, reason: collision with root package name */
    public final long f85013l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final String f85014m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f85015n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final GalleryConfig f85016o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f85017p;

    /* renamed from: q, reason: collision with root package name */
    public final int f85018q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f85019r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f85020s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final AutotekaTeaserResult f85021t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final GalleryTeaser f85022u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final List<BeduinItemTeaser> f85023v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f85024w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final CarouselGalleryGroup f85025x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final List<GalleryButton> f85026y;

    /* compiled from: AdvertDetailsGalleryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsGalleryItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsGalleryItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            LinkedHashMap linkedHashMap;
            long j12;
            ArrayList arrayList4;
            ArrayList arrayList5;
            long j13 = parcel.readLong();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsGalleryItem.class, parcel, arrayList6, iL2, 1);
                }
                arrayList = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(AdvertDetailsGalleryItem.class, parcel, arrayList2, iL3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                arrayList3 = new ArrayList(i14);
                int iD2 = 0;
                while (iD2 != i14) {
                    iD2 = com.avito.android.advert.item.delivery_suggests.l.d(parcel, arrayList3, iD2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i15 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    linkedHashMap.put(Integer.valueOf(parcel.readInt()), parcel.readParcelable(AdvertDetailsGalleryItem.class.getClassLoader()));
                }
            }
            Video video = (Video) parcel.readParcelable(AdvertDetailsGalleryItem.class.getClassLoader());
            NativeVideo nativeVideo = (NativeVideo) parcel.readParcelable(AdvertDetailsGalleryItem.class.getClassLoader());
            AutotekaCpoTeaser autotekaCpoTeaser = (AutotekaCpoTeaser) parcel.readParcelable(AdvertDetailsGalleryItem.class.getClassLoader());
            int i17 = parcel.readInt();
            long j14 = parcel.readLong();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            GalleryConfig galleryConfig = (GalleryConfig) parcel.readParcelable(AdvertDetailsGalleryItem.class.getClassLoader());
            boolean z13 = parcel.readInt() != 0;
            int i18 = parcel.readInt();
            SerpDisplayType serpDisplayTypeValueOf = SerpDisplayType.valueOf(parcel.readString());
            SerpViewType serpViewTypeValueOf = SerpViewType.valueOf(parcel.readString());
            AutotekaTeaserResult autotekaTeaserResult = (AutotekaTeaserResult) parcel.readParcelable(AdvertDetailsGalleryItem.class.getClassLoader());
            GalleryTeaser galleryTeaser = (GalleryTeaser) parcel.readParcelable(AdvertDetailsGalleryItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                j12 = j14;
                arrayList4 = null;
            } else {
                int i19 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i19);
                j12 = j14;
                int iL4 = 0;
                while (iL4 != i19) {
                    iL4 = com.avito.android.actions_sheet.a.l(AdvertDetailsGalleryItem.class, parcel, arrayList7, iL4, 1);
                    i19 = i19;
                }
                arrayList4 = arrayList7;
            }
            boolean z14 = parcel.readInt() != 0;
            CarouselGalleryGroup carouselGalleryGroupValueOf = parcel.readInt() == 0 ? null : CarouselGalleryGroup.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int i22 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i22);
                int iL5 = 0;
                while (iL5 != i22) {
                    iL5 = com.avito.android.actions_sheet.a.l(AdvertDetailsGalleryItem.class, parcel, arrayList8, iL5, 1);
                    i22 = i22;
                }
                arrayList5 = arrayList8;
            }
            return new AdvertDetailsGalleryItem(j13, string, arrayList, arrayList2, arrayList3, linkedHashMap, video, nativeVideo, autotekaCpoTeaser, i17, j12, string2, z12, galleryConfig, z13, i18, serpDisplayTypeValueOf, serpViewTypeValueOf, autotekaTeaserResult, galleryTeaser, arrayList4, z14, carouselGalleryGroupValueOf, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsGalleryItem[] newArray(int i12) {
            return new AdvertDetailsGalleryItem[i12];
        }
    }

    public AdvertDetailsGalleryItem(long j12, @Y61.k String str, @Y61.l List<Image> list, @Y61.l List<Image> list2, @Y61.l List<Integer> list3, @Y61.l Map<Integer, Image> map, @Y61.l Video video, @Y61.l NativeVideo nativeVideo, @Y61.l AutotekaCpoTeaser autotekaCpoTeaser, int i12, long j13, @Y61.k String str2, boolean z12, @Y61.l GalleryConfig galleryConfig, boolean z13, int i13, @Y61.k SerpDisplayType serpDisplayType, @Y61.k SerpViewType serpViewType, @Y61.l AutotekaTeaserResult autotekaTeaserResult, @Y61.l GalleryTeaser galleryTeaser, @Y61.l List<BeduinItemTeaser> list4, boolean z14, @Y61.l CarouselGalleryGroup carouselGalleryGroup, @Y61.l List<GalleryButton> list5) {
        this.f85003b = j12;
        this.f85004c = str;
        this.f85005d = list;
        this.f85006e = list2;
        this.f85007f = list3;
        this.f85008g = map;
        this.f85009h = video;
        this.f85010i = nativeVideo;
        this.f85011j = autotekaCpoTeaser;
        this.f85012k = i12;
        this.f85013l = j13;
        this.f85014m = str2;
        this.f85015n = z12;
        this.f85016o = galleryConfig;
        this.f85017p = z13;
        this.f85018q = i13;
        this.f85019r = serpDisplayType;
        this.f85020s = serpViewType;
        this.f85021t = autotekaTeaserResult;
        this.f85022u = galleryTeaser;
        this.f85023v = list4;
        this.f85024w = z14;
        this.f85025x = carouselGalleryGroup;
        this.f85026y = list5;
    }

    public static AdvertDetailsGalleryItem b(AdvertDetailsGalleryItem advertDetailsGalleryItem, int i12, int i13, int i14) {
        long j12 = advertDetailsGalleryItem.f85003b;
        String str = advertDetailsGalleryItem.f85004c;
        List<Image> list = advertDetailsGalleryItem.f85005d;
        List<Image> list2 = advertDetailsGalleryItem.f85006e;
        List<Integer> list3 = advertDetailsGalleryItem.f85007f;
        Map<Integer, Image> map = advertDetailsGalleryItem.f85008g;
        Video video = advertDetailsGalleryItem.f85009h;
        NativeVideo nativeVideo = advertDetailsGalleryItem.f85010i;
        AutotekaCpoTeaser autotekaCpoTeaser = advertDetailsGalleryItem.f85011j;
        int i15 = (i14 & 512) != 0 ? advertDetailsGalleryItem.f85012k : i12;
        long j13 = advertDetailsGalleryItem.f85013l;
        String str2 = advertDetailsGalleryItem.f85014m;
        boolean z12 = advertDetailsGalleryItem.f85015n;
        GalleryConfig galleryConfig = advertDetailsGalleryItem.f85016o;
        boolean z13 = advertDetailsGalleryItem.f85017p;
        int i16 = (i14 & 32768) != 0 ? advertDetailsGalleryItem.f85018q : i13;
        SerpDisplayType serpDisplayType = advertDetailsGalleryItem.f85019r;
        SerpViewType serpViewType = advertDetailsGalleryItem.f85020s;
        AutotekaTeaserResult autotekaTeaserResult = advertDetailsGalleryItem.f85021t;
        GalleryTeaser galleryTeaser = advertDetailsGalleryItem.f85022u;
        List<BeduinItemTeaser> list4 = advertDetailsGalleryItem.f85023v;
        boolean z14 = advertDetailsGalleryItem.f85024w;
        CarouselGalleryGroup carouselGalleryGroup = advertDetailsGalleryItem.f85025x;
        List<GalleryButton> list5 = advertDetailsGalleryItem.f85026y;
        advertDetailsGalleryItem.getClass();
        return new AdvertDetailsGalleryItem(j12, str, list, list2, list3, map, video, nativeVideo, autotekaCpoTeaser, i15, j13, str2, z12, galleryConfig, z13, i16, serpDisplayType, serpViewType, autotekaTeaserResult, galleryTeaser, list4, z14, carouselGalleryGroup, list5);
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @Y61.k
    public final BlockItem K5(int i12) {
        return b(this, 0, i12, 16744447);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f85019r = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsGalleryItem)) {
            return false;
        }
        AdvertDetailsGalleryItem advertDetailsGalleryItem = (AdvertDetailsGalleryItem) obj;
        return this.f85003b == advertDetailsGalleryItem.f85003b && L.f(this.f85004c, advertDetailsGalleryItem.f85004c) && L.f(this.f85005d, advertDetailsGalleryItem.f85005d) && L.f(this.f85006e, advertDetailsGalleryItem.f85006e) && L.f(this.f85007f, advertDetailsGalleryItem.f85007f) && L.f(this.f85008g, advertDetailsGalleryItem.f85008g) && L.f(this.f85009h, advertDetailsGalleryItem.f85009h) && L.f(this.f85010i, advertDetailsGalleryItem.f85010i) && L.f(this.f85011j, advertDetailsGalleryItem.f85011j) && this.f85012k == advertDetailsGalleryItem.f85012k && this.f85013l == advertDetailsGalleryItem.f85013l && L.f(this.f85014m, advertDetailsGalleryItem.f85014m) && this.f85015n == advertDetailsGalleryItem.f85015n && L.f(this.f85016o, advertDetailsGalleryItem.f85016o) && this.f85017p == advertDetailsGalleryItem.f85017p && this.f85018q == advertDetailsGalleryItem.f85018q && this.f85019r == advertDetailsGalleryItem.f85019r && this.f85020s == advertDetailsGalleryItem.f85020s && L.f(this.f85021t, advertDetailsGalleryItem.f85021t) && L.f(this.f85022u, advertDetailsGalleryItem.f85022u) && L.f(this.f85023v, advertDetailsGalleryItem.f85023v) && this.f85024w == advertDetailsGalleryItem.f85024w && this.f85025x == advertDetailsGalleryItem.f85025x && L.f(this.f85026y, advertDetailsGalleryItem.f85026y);
    }

    /* renamed from: f, reason: from getter */
    public final boolean getF85024w() {
        return this.f85024w;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF72905b() {
        return this.f85003b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF72909f() {
        return this.f85018q;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF72906c() {
        return this.f85004c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF72911h() {
        return this.f85020s;
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f85003b) * 31, 31, this.f85004c);
        List<Image> list = this.f85005d;
        int iHashCode = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Image> list2 = this.f85006e;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.f85007f;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Map<Integer, Image> map = this.f85008g;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Video video = this.f85009h;
        int iHashCode5 = (iHashCode4 + (video == null ? 0 : video.hashCode())) * 31;
        NativeVideo nativeVideo = this.f85010i;
        int iHashCode6 = (iHashCode5 + (nativeVideo == null ? 0 : nativeVideo.hashCode())) * 31;
        AutotekaCpoTeaser autotekaCpoTeaser = this.f85011j;
        int i12 = r.i(H.d(r.g(r.e(this.f85012k, (iHashCode6 + (autotekaCpoTeaser == null ? 0 : autotekaCpoTeaser.hashCode())) * 31, 31), 31, this.f85013l), 31, this.f85014m), 31, this.f85015n);
        GalleryConfig galleryConfig = this.f85016o;
        int iJ2 = com.avito.android.actions_sheet.a.j(this.f85020s, com.avito.android.actions_sheet.a.h(this.f85019r, r.e(this.f85018q, r.i((i12 + (galleryConfig == null ? 0 : galleryConfig.hashCode())) * 31, 31, this.f85017p), 31), 31), 31);
        AutotekaTeaserResult autotekaTeaserResult = this.f85021t;
        int iHashCode7 = (iJ2 + (autotekaTeaserResult == null ? 0 : autotekaTeaserResult.hashCode())) * 31;
        GalleryTeaser galleryTeaser = this.f85022u;
        int iHashCode8 = (iHashCode7 + (galleryTeaser == null ? 0 : galleryTeaser.hashCode())) * 31;
        List<BeduinItemTeaser> list4 = this.f85023v;
        int i13 = r.i((iHashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31, 31, this.f85024w);
        CarouselGalleryGroup carouselGalleryGroup = this.f85025x;
        int iHashCode9 = (i13 + (carouselGalleryGroup == null ? 0 : carouselGalleryGroup.hashCode())) * 31;
        List<GalleryButton> list5 = this.f85026y;
        return iHashCode9 + (list5 != null ? list5.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsGalleryItem(id=");
        sb2.append(this.f85003b);
        sb2.append(", stringId=");
        sb2.append(this.f85004c);
        sb2.append(", images=");
        sb2.append(this.f85005d);
        sb2.append(", realtyLayouts=");
        sb2.append(this.f85006e);
        sb2.append(", realtyLayoutIndexes=");
        sb2.append(this.f85007f);
        sb2.append(", realtyAiDesignInfo=");
        sb2.append(this.f85008g);
        sb2.append(", video=");
        sb2.append(this.f85009h);
        sb2.append(", nativeVideo=");
        sb2.append(this.f85010i);
        sb2.append(", cpoTeaser=");
        sb2.append(this.f85011j);
        sb2.append(", currentPosition=");
        sb2.append(this.f85012k);
        sb2.append(", stateId=");
        sb2.append(this.f85013l);
        sb2.append(", advertId=");
        sb2.append(this.f85014m);
        sb2.append(", isActive=");
        sb2.append(this.f85015n);
        sb2.append(", galleryConfig=");
        sb2.append(this.f85016o);
        sb2.append(", withBottomDivider=");
        sb2.append(this.f85017p);
        sb2.append(", spanCount=");
        sb2.append(this.f85018q);
        sb2.append(", displayType=");
        sb2.append(this.f85019r);
        sb2.append(", viewType=");
        sb2.append(this.f85020s);
        sb2.append(", autotekaTeaser=");
        sb2.append(this.f85021t);
        sb2.append(", galleryItem=");
        sb2.append(this.f85022u);
        sb2.append(", beduinTeasers=");
        sb2.append(this.f85023v);
        sb2.append(", shouldShowCarousel=");
        sb2.append(this.f85024w);
        sb2.append(", carouselGalleryGroup=");
        sb2.append(this.f85025x);
        sb2.append(", galleryButtons=");
        return H.p(sb2, this.f85026y, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f85003b);
        parcel.writeString(this.f85004c);
        List<Image> list = this.f85005d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        List<Image> list2 = this.f85006e;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        List<Integer> list3 = this.f85007f;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeInt(((Number) itA3.next()).intValue());
            }
        }
        Map<Integer, Image> map = this.f85008g;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeInt(((Number) entry.getKey()).intValue());
                parcel.writeParcelable((Parcelable) entry.getValue(), i12);
            }
        }
        parcel.writeParcelable(this.f85009h, i12);
        parcel.writeParcelable(this.f85010i, i12);
        parcel.writeParcelable(this.f85011j, i12);
        parcel.writeInt(this.f85012k);
        parcel.writeLong(this.f85013l);
        parcel.writeString(this.f85014m);
        parcel.writeInt(this.f85015n ? 1 : 0);
        parcel.writeParcelable(this.f85016o, i12);
        parcel.writeInt(this.f85017p ? 1 : 0);
        parcel.writeInt(this.f85018q);
        parcel.writeString(this.f85019r.name());
        parcel.writeString(this.f85020s.name());
        parcel.writeParcelable(this.f85021t, i12);
        parcel.writeParcelable(this.f85022u, i12);
        List<BeduinItemTeaser> list4 = this.f85023v;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA4 = com.avito.android.actions_sheet.a.A(list4, parcel, 1);
            while (itA4.hasNext()) {
                parcel.writeParcelable((Parcelable) itA4.next(), i12);
            }
        }
        parcel.writeInt(this.f85024w ? 1 : 0);
        CarouselGalleryGroup carouselGalleryGroup = this.f85025x;
        if (carouselGalleryGroup == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(carouselGalleryGroup.name());
        }
        List<GalleryButton> list5 = this.f85026y;
        if (list5 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA5 = com.avito.android.actions_sheet.a.A(list5, parcel, 1);
        while (itA5.hasNext()) {
            parcel.writeParcelable((Parcelable) itA5.next(), i12);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AdvertDetailsGalleryItem(long j12, String str, List list, List list2, List list3, Map map, Video video, NativeVideo nativeVideo, AutotekaCpoTeaser autotekaCpoTeaser, int i12, long j13, String str2, boolean z12, GalleryConfig galleryConfig, boolean z13, int i13, SerpDisplayType serpDisplayType, SerpViewType serpViewType, AutotekaTeaserResult autotekaTeaserResult, GalleryTeaser galleryTeaser, List list4, boolean z14, CarouselGalleryGroup carouselGalleryGroup, List list5, int i14, C42822w c42822w) {
        long j14;
        if ((i14 & 1) != 0) {
            AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
            j14 = 0;
        } else {
            j14 = j12;
        }
        this(j14, (i14 & 2) != 0 ? String.valueOf(j14) : str, list, (i14 & 8) != 0 ? null : list2, (i14 & 16) != 0 ? null : list3, (i14 & 32) != 0 ? null : map, video, nativeVideo, (i14 & 256) != 0 ? null : autotekaCpoTeaser, (i14 & 512) != 0 ? 0 : i12, (i14 & 1024) != 0 ? 0L : j13, str2, (i14 & 4096) != 0 ? true : z12, (i14 & 8192) != 0 ? null : galleryConfig, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? true : z13, i13, (65536 & i14) != 0 ? SerpDisplayType.Grid : serpDisplayType, (131072 & i14) != 0 ? SerpViewType.f268585e : serpViewType, (262144 & i14) != 0 ? null : autotekaTeaserResult, (524288 & i14) != 0 ? null : galleryTeaser, (1048576 & i14) != 0 ? null : list4, (2097152 & i14) != 0 ? false : z14, (4194304 & i14) != 0 ? null : carouselGalleryGroup, (i14 & 8388608) != 0 ? null : list5);
    }
}
