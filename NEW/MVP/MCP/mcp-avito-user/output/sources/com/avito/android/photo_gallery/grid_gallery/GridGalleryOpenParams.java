package com.avito.android.photo_gallery.grid_gallery;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.photo_gallery.nav_bar.PhotoGalleryNavBar;
import com.avito.android.remote.model.AddedByAvitoParams;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.advert_details.GalleryBuyButtonData;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.beduin_teaser.BeduinTeaser;
import com.avito.android.remote.model.grid_gallery.GridGallery;
import com.avito.android.remote.model.images_groups.ImageGroup;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: GridGalleryOpenParams.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/GridGalleryOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class GridGalleryOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<GridGalleryOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GridGallery f217124b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<Image> f217125c;

    /* renamed from: d, reason: collision with root package name */
    public final int f217126d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<Integer> f217127e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final List<Image> f217128f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Boolean f217129g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Video f217130h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final NativeVideo f217131i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f217132j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f217133k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final TreeClickStreamParent f217134l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final AdvertActions f217135m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final ContactBarData f217136n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final GalleryBuyButtonData f217137o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final Long f217138p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final String f217139q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final AutotekaTeaserResult f217140r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final GalleryTeaser f217141s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final List<BeduinTeaser> f217142t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f217143u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final AddedByAvitoParams f217144v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final List<ImageGroup> f217145w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final PhotoGalleryNavBar f217146x;

    /* compiled from: GridGalleryOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GridGalleryOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final GridGalleryOpenParams createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean boolValueOf;
            ArrayList arrayList3;
            ArrayList arrayList4;
            GridGallery gridGallery = (GridGallery) parcel.readParcelable(GridGalleryOpenParams.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(GridGalleryOpenParams.class, parcel, arrayList5, iL2, 1);
            }
            int i13 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i14);
                int iD2 = 0;
                while (iD2 != i14) {
                    iD2 = com.avito.android.advert.item.delivery_suggests.l.d(parcel, arrayList6, iD2, 1);
                }
                arrayList = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i15);
                int iL3 = 0;
                while (iL3 != i15) {
                    iL3 = com.avito.android.actions_sheet.a.l(GridGalleryOpenParams.class, parcel, arrayList7, iL3, 1);
                }
                arrayList2 = arrayList7;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Video video = (Video) parcel.readParcelable(GridGalleryOpenParams.class.getClassLoader());
            NativeVideo nativeVideo = (NativeVideo) parcel.readParcelable(GridGalleryOpenParams.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            TreeClickStreamParent treeClickStreamParent = (TreeClickStreamParent) parcel.readParcelable(GridGalleryOpenParams.class.getClassLoader());
            AdvertActions advertActions = (AdvertActions) parcel.readParcelable(GridGalleryOpenParams.class.getClassLoader());
            ContactBarData contactBarData = (ContactBarData) parcel.readParcelable(GridGalleryOpenParams.class.getClassLoader());
            GalleryBuyButtonData galleryBuyButtonData = (GalleryBuyButtonData) parcel.readParcelable(GridGalleryOpenParams.class.getClassLoader());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string3 = parcel.readString();
            AutotekaTeaserResult autotekaTeaserResult = (AutotekaTeaserResult) parcel.readParcelable(GridGalleryOpenParams.class.getClassLoader());
            GalleryTeaser galleryTeaser = (GalleryTeaser) parcel.readParcelable(GridGalleryOpenParams.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i16);
                int iL4 = 0;
                while (iL4 != i16) {
                    iL4 = com.avito.android.actions_sheet.a.l(GridGalleryOpenParams.class, parcel, arrayList8, iL4, 1);
                }
                arrayList3 = arrayList8;
            }
            boolean z12 = parcel.readInt() != 0;
            AddedByAvitoParams addedByAvitoParams = (AddedByAvitoParams) parcel.readParcelable(GridGalleryOpenParams.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i17 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i17);
                int iL5 = 0;
                while (iL5 != i17) {
                    iL5 = com.avito.android.actions_sheet.a.l(GridGalleryOpenParams.class, parcel, arrayList9, iL5, 1);
                    i17 = i17;
                }
                arrayList4 = arrayList9;
            }
            return new GridGalleryOpenParams(i13, treeClickStreamParent, (PhotoGalleryNavBar) parcel.readParcelable(GridGalleryOpenParams.class.getClassLoader()), addedByAvitoParams, advertActions, nativeVideo, video, contactBarData, galleryBuyButtonData, autotekaTeaserResult, gridGallery, galleryTeaser, boolValueOf, lValueOf, string, string2, string3, arrayList5, arrayList, arrayList2, arrayList3, arrayList4, z12);
        }

        @Override // android.os.Parcelable.Creator
        public final GridGalleryOpenParams[] newArray(int i12) {
            return new GridGalleryOpenParams[i12];
        }
    }

    public GridGalleryOpenParams(int i12, @Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.l PhotoGalleryNavBar photoGalleryNavBar, @Y61.l AddedByAvitoParams addedByAvitoParams, @Y61.l AdvertActions advertActions, @Y61.l NativeVideo nativeVideo, @Y61.l Video video, @Y61.l ContactBarData contactBarData, @Y61.l GalleryBuyButtonData galleryBuyButtonData, @Y61.l AutotekaTeaserResult autotekaTeaserResult, @Y61.k GridGallery gridGallery, @Y61.l GalleryTeaser galleryTeaser, @Y61.l Boolean bool, @Y61.l Long l12, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.k List list, @Y61.l List list2, @Y61.l List list3, @Y61.l List list4, @Y61.l List list5, boolean z12) {
        this.f217124b = gridGallery;
        this.f217125c = list;
        this.f217126d = i12;
        this.f217127e = list2;
        this.f217128f = list3;
        this.f217129g = bool;
        this.f217130h = video;
        this.f217131i = nativeVideo;
        this.f217132j = str;
        this.f217133k = str2;
        this.f217134l = treeClickStreamParent;
        this.f217135m = advertActions;
        this.f217136n = contactBarData;
        this.f217137o = galleryBuyButtonData;
        this.f217138p = l12;
        this.f217139q = str3;
        this.f217140r = autotekaTeaserResult;
        this.f217141s = galleryTeaser;
        this.f217142t = list4;
        this.f217143u = z12;
        this.f217144v = addedByAvitoParams;
        this.f217145w = list5;
        this.f217146x = photoGalleryNavBar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridGalleryOpenParams)) {
            return false;
        }
        GridGalleryOpenParams gridGalleryOpenParams = (GridGalleryOpenParams) obj;
        return L.f(this.f217124b, gridGalleryOpenParams.f217124b) && L.f(this.f217125c, gridGalleryOpenParams.f217125c) && this.f217126d == gridGalleryOpenParams.f217126d && L.f(this.f217127e, gridGalleryOpenParams.f217127e) && L.f(this.f217128f, gridGalleryOpenParams.f217128f) && L.f(this.f217129g, gridGalleryOpenParams.f217129g) && L.f(this.f217130h, gridGalleryOpenParams.f217130h) && L.f(this.f217131i, gridGalleryOpenParams.f217131i) && L.f(this.f217132j, gridGalleryOpenParams.f217132j) && L.f(this.f217133k, gridGalleryOpenParams.f217133k) && L.f(this.f217134l, gridGalleryOpenParams.f217134l) && L.f(this.f217135m, gridGalleryOpenParams.f217135m) && L.f(this.f217136n, gridGalleryOpenParams.f217136n) && L.f(this.f217137o, gridGalleryOpenParams.f217137o) && L.f(this.f217138p, gridGalleryOpenParams.f217138p) && L.f(this.f217139q, gridGalleryOpenParams.f217139q) && L.f(this.f217140r, gridGalleryOpenParams.f217140r) && L.f(this.f217141s, gridGalleryOpenParams.f217141s) && L.f(this.f217142t, gridGalleryOpenParams.f217142t) && this.f217143u == gridGalleryOpenParams.f217143u && L.f(this.f217144v, gridGalleryOpenParams.f217144v) && L.f(this.f217145w, gridGalleryOpenParams.f217145w) && L.f(this.f217146x, gridGalleryOpenParams.f217146x);
    }

    public final int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.f217126d, H.e(this.f217124b.hashCode() * 31, 31, this.f217125c), 31);
        List<Integer> list = this.f217127e;
        int iHashCode = (iE2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Image> list2 = this.f217128f;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f217129g;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Video video = this.f217130h;
        int iHashCode4 = (iHashCode3 + (video == null ? 0 : video.hashCode())) * 31;
        NativeVideo nativeVideo = this.f217131i;
        int iHashCode5 = (iHashCode4 + (nativeVideo == null ? 0 : nativeVideo.hashCode())) * 31;
        String str = this.f217132j;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f217133k;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TreeClickStreamParent treeClickStreamParent = this.f217134l;
        int iHashCode8 = (iHashCode7 + (treeClickStreamParent == null ? 0 : treeClickStreamParent.hashCode())) * 31;
        AdvertActions advertActions = this.f217135m;
        int iHashCode9 = (iHashCode8 + (advertActions == null ? 0 : advertActions.hashCode())) * 31;
        ContactBarData contactBarData = this.f217136n;
        int iHashCode10 = (iHashCode9 + (contactBarData == null ? 0 : contactBarData.hashCode())) * 31;
        GalleryBuyButtonData galleryBuyButtonData = this.f217137o;
        int iHashCode11 = (iHashCode10 + (galleryBuyButtonData == null ? 0 : galleryBuyButtonData.hashCode())) * 31;
        Long l12 = this.f217138p;
        int iHashCode12 = (iHashCode11 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str3 = this.f217139q;
        int iHashCode13 = (iHashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AutotekaTeaserResult autotekaTeaserResult = this.f217140r;
        int iHashCode14 = (iHashCode13 + (autotekaTeaserResult == null ? 0 : autotekaTeaserResult.hashCode())) * 31;
        GalleryTeaser galleryTeaser = this.f217141s;
        int iHashCode15 = (iHashCode14 + (galleryTeaser == null ? 0 : galleryTeaser.hashCode())) * 31;
        List<BeduinTeaser> list3 = this.f217142t;
        int i12 = androidx.appcompat.app.r.i((iHashCode15 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.f217143u);
        AddedByAvitoParams addedByAvitoParams = this.f217144v;
        int iHashCode16 = (i12 + (addedByAvitoParams == null ? 0 : addedByAvitoParams.hashCode())) * 31;
        List<ImageGroup> list4 = this.f217145w;
        int iHashCode17 = (iHashCode16 + (list4 == null ? 0 : list4.hashCode())) * 31;
        PhotoGalleryNavBar photoGalleryNavBar = this.f217146x;
        return iHashCode17 + (photoGalleryNavBar != null ? photoGalleryNavBar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "GridGalleryOpenParams(gridGallery=" + this.f217124b + ", images=" + this.f217125c + ", position=" + this.f217126d + ", realtyLayoutIndexes=" + this.f217127e + ", advertRealtyLayouts=" + this.f217128f + ", startInRealtyLayoutsMode=" + this.f217129g + ", video=" + this.f217130h + ", nativeVideo=" + this.f217131i + ", advertId=" + this.f217132j + ", categoryId=" + this.f217133k + ", treeParent=" + this.f217134l + ", actions=" + this.f217135m + ", contactBarData=" + this.f217136n + ", galleryBuyButtonData=" + this.f217137o + ", stateId=" + this.f217138p + ", searchContext=" + this.f217139q + ", autotekaTeaser=" + this.f217140r + ", teaser=" + this.f217141s + ", beduinTeasersAll=" + this.f217142t + ", useCarouselPhotoGalleryConverter=" + this.f217143u + ", addedByAvitoParams=" + this.f217144v + ", galleryImagesGroups=" + this.f217145w + ", navBarData=" + this.f217146x + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f217124b, i12);
        Iterator itJ = C0.j(this.f217125c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f217126d);
        List<Integer> list = this.f217127e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeInt(((Number) itA.next()).intValue());
            }
        }
        List<Image> list2 = this.f217128f;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        Boolean bool = this.f217129g;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.f217130h, i12);
        parcel.writeParcelable(this.f217131i, i12);
        parcel.writeString(this.f217132j);
        parcel.writeString(this.f217133k);
        parcel.writeParcelable(this.f217134l, i12);
        parcel.writeParcelable(this.f217135m, i12);
        parcel.writeParcelable(this.f217136n, i12);
        parcel.writeParcelable(this.f217137o, i12);
        Long l12 = this.f217138p;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.f217139q);
        parcel.writeParcelable(this.f217140r, i12);
        parcel.writeParcelable(this.f217141s, i12);
        List<BeduinTeaser> list3 = this.f217142t;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), i12);
            }
        }
        parcel.writeInt(this.f217143u ? 1 : 0);
        parcel.writeParcelable(this.f217144v, i12);
        List<ImageGroup> list4 = this.f217145w;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA4 = com.avito.android.actions_sheet.a.A(list4, parcel, 1);
            while (itA4.hasNext()) {
                parcel.writeParcelable((Parcelable) itA4.next(), i12);
            }
        }
        parcel.writeParcelable(this.f217146x, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GridGalleryOpenParams(GridGallery gridGallery, List list, int i12, List list2, List list3, Boolean bool, Video video, NativeVideo nativeVideo, String str, String str2, TreeClickStreamParent treeClickStreamParent, AdvertActions advertActions, ContactBarData contactBarData, GalleryBuyButtonData galleryBuyButtonData, Long l12, String str3, AutotekaTeaserResult autotekaTeaserResult, GalleryTeaser galleryTeaser, List list4, boolean z12, AddedByAvitoParams addedByAvitoParams, List list5, PhotoGalleryNavBar photoGalleryNavBar, int i13, C42822w c42822w) {
        Long l13 = (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? -1L : l12;
        this(i12, treeClickStreamParent, photoGalleryNavBar, (1048576 & i13) != 0 ? null : addedByAvitoParams, advertActions, nativeVideo, video, contactBarData, galleryBuyButtonData, autotekaTeaserResult, gridGallery, (131072 & i13) != 0 ? null : galleryTeaser, bool, l13, str, str2, str3, list, list2, list3, list4, (i13 & 2097152) != 0 ? null : list5, z12);
    }
}
