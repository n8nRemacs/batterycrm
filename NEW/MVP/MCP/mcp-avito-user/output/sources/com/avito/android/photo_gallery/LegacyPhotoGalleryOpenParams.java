package com.avito.android.photo_gallery;

import android.os.Parcel;
import android.os.Parcelable;
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
import com.avito.android.remote.model.beduin_teaser.BeduinItemTeaser;
import com.avito.android.remote.model.images_groups.ImageGroup;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;

/* compiled from: LegacyPhotoGalleryOpenParams.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/LegacyPhotoGalleryOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class LegacyPhotoGalleryOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<LegacyPhotoGalleryOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<Image> f216591b;

    /* renamed from: c, reason: collision with root package name */
    public final int f216592c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final List<Integer> f216593d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<Image> f216594e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Boolean f216595f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Boolean f216596g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Video f216597h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final NativeVideo f216598i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f216599j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f216600k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final TreeClickStreamParent f216601l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final AdvertActions f216602m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final ContactBarData f216603n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final GalleryBuyButtonData f216604o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final Long f216605p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final String f216606q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final AutotekaTeaserResult f216607r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final GalleryTeaser f216608s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final List<BeduinItemTeaser> f216609t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f216610u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final AddedByAvitoParams f216611v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final List<ImageGroup> f216612w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final PhotoGalleryNavBar f216613x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final Map<Integer, Image> f216614y;

    /* compiled from: LegacyPhotoGalleryOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LegacyPhotoGalleryOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final LegacyPhotoGalleryOpenParams createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            TreeClickStreamParent treeClickStreamParent;
            LinkedHashMap linkedHashMap;
            int i12 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(LegacyPhotoGalleryOpenParams.class, parcel, arrayList5, iL2, 1);
            }
            int i13 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iD2 = 0;
                while (iD2 != i14) {
                    iD2 = com.avito.android.advert.item.delivery_suggests.l.d(parcel, arrayList, iD2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                int iL3 = 0;
                while (iL3 != i15) {
                    iL3 = com.avito.android.actions_sheet.a.l(LegacyPhotoGalleryOpenParams.class, parcel, arrayList2, iL3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Video video = (Video) parcel.readParcelable(LegacyPhotoGalleryOpenParams.class.getClassLoader());
            NativeVideo nativeVideo = (NativeVideo) parcel.readParcelable(LegacyPhotoGalleryOpenParams.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            TreeClickStreamParent treeClickStreamParent2 = (TreeClickStreamParent) parcel.readParcelable(LegacyPhotoGalleryOpenParams.class.getClassLoader());
            AdvertActions advertActions = (AdvertActions) parcel.readParcelable(LegacyPhotoGalleryOpenParams.class.getClassLoader());
            ContactBarData contactBarData = (ContactBarData) parcel.readParcelable(LegacyPhotoGalleryOpenParams.class.getClassLoader());
            GalleryBuyButtonData galleryBuyButtonData = (GalleryBuyButtonData) parcel.readParcelable(LegacyPhotoGalleryOpenParams.class.getClassLoader());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string3 = parcel.readString();
            AutotekaTeaserResult autotekaTeaserResult = (AutotekaTeaserResult) parcel.readParcelable(LegacyPhotoGalleryOpenParams.class.getClassLoader());
            GalleryTeaser galleryTeaser = (GalleryTeaser) parcel.readParcelable(LegacyPhotoGalleryOpenParams.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i16);
                int iL4 = 0;
                while (iL4 != i16) {
                    iL4 = com.avito.android.actions_sheet.a.l(LegacyPhotoGalleryOpenParams.class, parcel, arrayList6, iL4, 1);
                    i16 = i16;
                }
                arrayList3 = arrayList6;
            }
            boolean z12 = parcel.readInt() != 0;
            AddedByAvitoParams addedByAvitoParams = (AddedByAvitoParams) parcel.readParcelable(LegacyPhotoGalleryOpenParams.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i17 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i17);
                int iL5 = 0;
                while (iL5 != i17) {
                    iL5 = com.avito.android.actions_sheet.a.l(LegacyPhotoGalleryOpenParams.class, parcel, arrayList7, iL5, 1);
                    i17 = i17;
                }
                arrayList4 = arrayList7;
            }
            PhotoGalleryNavBar photoGalleryNavBar = (PhotoGalleryNavBar) parcel.readParcelable(LegacyPhotoGalleryOpenParams.class.getClassLoader());
            if (parcel.readInt() == 0) {
                treeClickStreamParent = treeClickStreamParent2;
                linkedHashMap = null;
            } else {
                int i18 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i18);
                int i19 = 0;
                while (i19 != i18) {
                    linkedHashMap2.put(Integer.valueOf(parcel.readInt()), parcel.readParcelable(LegacyPhotoGalleryOpenParams.class.getClassLoader()));
                    i19++;
                    treeClickStreamParent2 = treeClickStreamParent2;
                    i18 = i18;
                }
                treeClickStreamParent = treeClickStreamParent2;
                linkedHashMap = linkedHashMap2;
            }
            return new LegacyPhotoGalleryOpenParams(arrayList5, i13, arrayList, arrayList2, boolValueOf, boolValueOf2, video, nativeVideo, string, string2, treeClickStreamParent, advertActions, contactBarData, galleryBuyButtonData, lValueOf, string3, autotekaTeaserResult, galleryTeaser, arrayList3, z12, addedByAvitoParams, arrayList4, photoGalleryNavBar, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final LegacyPhotoGalleryOpenParams[] newArray(int i12) {
            return new LegacyPhotoGalleryOpenParams[i12];
        }
    }

    public LegacyPhotoGalleryOpenParams(@Y61.k List<Image> list, int i12, @Y61.l List<Integer> list2, @Y61.l List<Image> list3, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l Video video, @Y61.l NativeVideo nativeVideo, @Y61.l String str, @Y61.l String str2, @Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.l AdvertActions advertActions, @Y61.l ContactBarData contactBarData, @Y61.l GalleryBuyButtonData galleryBuyButtonData, @Y61.l Long l12, @Y61.l String str3, @Y61.l AutotekaTeaserResult autotekaTeaserResult, @Y61.l GalleryTeaser galleryTeaser, @Y61.l List<BeduinItemTeaser> list4, boolean z12, @Y61.l AddedByAvitoParams addedByAvitoParams, @Y61.l List<ImageGroup> list5, @Y61.l PhotoGalleryNavBar photoGalleryNavBar, @Y61.l Map<Integer, Image> map) {
        this.f216591b = list;
        this.f216592c = i12;
        this.f216593d = list2;
        this.f216594e = list3;
        this.f216595f = bool;
        this.f216596g = bool2;
        this.f216597h = video;
        this.f216598i = nativeVideo;
        this.f216599j = str;
        this.f216600k = str2;
        this.f216601l = treeClickStreamParent;
        this.f216602m = advertActions;
        this.f216603n = contactBarData;
        this.f216604o = galleryBuyButtonData;
        this.f216605p = l12;
        this.f216606q = str3;
        this.f216607r = autotekaTeaserResult;
        this.f216608s = galleryTeaser;
        this.f216609t = list4;
        this.f216610u = z12;
        this.f216611v = addedByAvitoParams;
        this.f216612w = list5;
        this.f216613x = photoGalleryNavBar;
        this.f216614y = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyPhotoGalleryOpenParams)) {
            return false;
        }
        LegacyPhotoGalleryOpenParams legacyPhotoGalleryOpenParams = (LegacyPhotoGalleryOpenParams) obj;
        return kotlin.jvm.internal.L.f(this.f216591b, legacyPhotoGalleryOpenParams.f216591b) && this.f216592c == legacyPhotoGalleryOpenParams.f216592c && kotlin.jvm.internal.L.f(this.f216593d, legacyPhotoGalleryOpenParams.f216593d) && kotlin.jvm.internal.L.f(this.f216594e, legacyPhotoGalleryOpenParams.f216594e) && kotlin.jvm.internal.L.f(this.f216595f, legacyPhotoGalleryOpenParams.f216595f) && kotlin.jvm.internal.L.f(this.f216596g, legacyPhotoGalleryOpenParams.f216596g) && kotlin.jvm.internal.L.f(this.f216597h, legacyPhotoGalleryOpenParams.f216597h) && kotlin.jvm.internal.L.f(this.f216598i, legacyPhotoGalleryOpenParams.f216598i) && kotlin.jvm.internal.L.f(this.f216599j, legacyPhotoGalleryOpenParams.f216599j) && kotlin.jvm.internal.L.f(this.f216600k, legacyPhotoGalleryOpenParams.f216600k) && kotlin.jvm.internal.L.f(this.f216601l, legacyPhotoGalleryOpenParams.f216601l) && kotlin.jvm.internal.L.f(this.f216602m, legacyPhotoGalleryOpenParams.f216602m) && kotlin.jvm.internal.L.f(this.f216603n, legacyPhotoGalleryOpenParams.f216603n) && kotlin.jvm.internal.L.f(this.f216604o, legacyPhotoGalleryOpenParams.f216604o) && kotlin.jvm.internal.L.f(this.f216605p, legacyPhotoGalleryOpenParams.f216605p) && kotlin.jvm.internal.L.f(this.f216606q, legacyPhotoGalleryOpenParams.f216606q) && kotlin.jvm.internal.L.f(this.f216607r, legacyPhotoGalleryOpenParams.f216607r) && kotlin.jvm.internal.L.f(this.f216608s, legacyPhotoGalleryOpenParams.f216608s) && kotlin.jvm.internal.L.f(this.f216609t, legacyPhotoGalleryOpenParams.f216609t) && this.f216610u == legacyPhotoGalleryOpenParams.f216610u && kotlin.jvm.internal.L.f(this.f216611v, legacyPhotoGalleryOpenParams.f216611v) && kotlin.jvm.internal.L.f(this.f216612w, legacyPhotoGalleryOpenParams.f216612w) && kotlin.jvm.internal.L.f(this.f216613x, legacyPhotoGalleryOpenParams.f216613x) && kotlin.jvm.internal.L.f(this.f216614y, legacyPhotoGalleryOpenParams.f216614y);
    }

    public final int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.f216592c, this.f216591b.hashCode() * 31, 31);
        List<Integer> list = this.f216593d;
        int iHashCode = (iE2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Image> list2 = this.f216594e;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f216595f;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f216596g;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Video video = this.f216597h;
        int iHashCode5 = (iHashCode4 + (video == null ? 0 : video.hashCode())) * 31;
        NativeVideo nativeVideo = this.f216598i;
        int iHashCode6 = (iHashCode5 + (nativeVideo == null ? 0 : nativeVideo.hashCode())) * 31;
        String str = this.f216599j;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f216600k;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TreeClickStreamParent treeClickStreamParent = this.f216601l;
        int iHashCode9 = (iHashCode8 + (treeClickStreamParent == null ? 0 : treeClickStreamParent.hashCode())) * 31;
        AdvertActions advertActions = this.f216602m;
        int iHashCode10 = (iHashCode9 + (advertActions == null ? 0 : advertActions.hashCode())) * 31;
        ContactBarData contactBarData = this.f216603n;
        int iHashCode11 = (iHashCode10 + (contactBarData == null ? 0 : contactBarData.hashCode())) * 31;
        GalleryBuyButtonData galleryBuyButtonData = this.f216604o;
        int iHashCode12 = (iHashCode11 + (galleryBuyButtonData == null ? 0 : galleryBuyButtonData.hashCode())) * 31;
        Long l12 = this.f216605p;
        int iHashCode13 = (iHashCode12 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str3 = this.f216606q;
        int iHashCode14 = (iHashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AutotekaTeaserResult autotekaTeaserResult = this.f216607r;
        int iHashCode15 = (iHashCode14 + (autotekaTeaserResult == null ? 0 : autotekaTeaserResult.hashCode())) * 31;
        GalleryTeaser galleryTeaser = this.f216608s;
        int iHashCode16 = (iHashCode15 + (galleryTeaser == null ? 0 : galleryTeaser.hashCode())) * 31;
        List<BeduinItemTeaser> list3 = this.f216609t;
        int i12 = androidx.appcompat.app.r.i((iHashCode16 + (list3 == null ? 0 : list3.hashCode())) * 31, 31, this.f216610u);
        AddedByAvitoParams addedByAvitoParams = this.f216611v;
        int iHashCode17 = (i12 + (addedByAvitoParams == null ? 0 : addedByAvitoParams.hashCode())) * 31;
        List<ImageGroup> list4 = this.f216612w;
        int iHashCode18 = (iHashCode17 + (list4 == null ? 0 : list4.hashCode())) * 31;
        PhotoGalleryNavBar photoGalleryNavBar = this.f216613x;
        int iHashCode19 = (iHashCode18 + (photoGalleryNavBar == null ? 0 : photoGalleryNavBar.hashCode())) * 31;
        Map<Integer, Image> map = this.f216614y;
        return iHashCode19 + (map != null ? map.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LegacyPhotoGalleryOpenParams(images=");
        sb2.append(this.f216591b);
        sb2.append(", position=");
        sb2.append(this.f216592c);
        sb2.append(", realtyLayoutIndexes=");
        sb2.append(this.f216593d);
        sb2.append(", advertRealtyLayouts=");
        sb2.append(this.f216594e);
        sb2.append(", startInRealtyLayoutsMode=");
        sb2.append(this.f216595f);
        sb2.append(", startInAiDesignMode=");
        sb2.append(this.f216596g);
        sb2.append(", video=");
        sb2.append(this.f216597h);
        sb2.append(", nativeVideo=");
        sb2.append(this.f216598i);
        sb2.append(", advertId=");
        sb2.append(this.f216599j);
        sb2.append(", categoryId=");
        sb2.append(this.f216600k);
        sb2.append(", treeParent=");
        sb2.append(this.f216601l);
        sb2.append(", actions=");
        sb2.append(this.f216602m);
        sb2.append(", contactBarData=");
        sb2.append(this.f216603n);
        sb2.append(", galleryBuyButtonData=");
        sb2.append(this.f216604o);
        sb2.append(", stateId=");
        sb2.append(this.f216605p);
        sb2.append(", searchContext=");
        sb2.append(this.f216606q);
        sb2.append(", autotekaTeaser=");
        sb2.append(this.f216607r);
        sb2.append(", teaser=");
        sb2.append(this.f216608s);
        sb2.append(", beduinTeasers=");
        sb2.append(this.f216609t);
        sb2.append(", useCarouselPhotoGalleryConverter=");
        sb2.append(this.f216610u);
        sb2.append(", addedByAvitoParams=");
        sb2.append(this.f216611v);
        sb2.append(", galleryImagesGroups=");
        sb2.append(this.f216612w);
        sb2.append(", navBarData=");
        sb2.append(this.f216613x);
        sb2.append(", realtyAiDesignInfo=");
        return androidx.appcompat.app.r.w(sb2, this.f216614y, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f216591b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f216592c);
        List<Integer> list = this.f216593d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeInt(((Number) itA.next()).intValue());
            }
        }
        List<Image> list2 = this.f216594e;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        Boolean bool = this.f216595f;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.f216596g;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.f216597h, i12);
        parcel.writeParcelable(this.f216598i, i12);
        parcel.writeString(this.f216599j);
        parcel.writeString(this.f216600k);
        parcel.writeParcelable(this.f216601l, i12);
        parcel.writeParcelable(this.f216602m, i12);
        parcel.writeParcelable(this.f216603n, i12);
        parcel.writeParcelable(this.f216604o, i12);
        Long l12 = this.f216605p;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.f216606q);
        parcel.writeParcelable(this.f216607r, i12);
        parcel.writeParcelable(this.f216608s, i12);
        List<BeduinItemTeaser> list3 = this.f216609t;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), i12);
            }
        }
        parcel.writeInt(this.f216610u ? 1 : 0);
        parcel.writeParcelable(this.f216611v, i12);
        List<ImageGroup> list4 = this.f216612w;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA4 = com.avito.android.actions_sheet.a.A(list4, parcel, 1);
            while (itA4.hasNext()) {
                parcel.writeParcelable((Parcelable) itA4.next(), i12);
            }
        }
        parcel.writeParcelable(this.f216613x, i12);
        Map<Integer, Image> map = this.f216614y;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeInt(((Number) entry.getKey()).intValue());
            parcel.writeParcelable((Parcelable) entry.getValue(), i12);
        }
    }

    public /* synthetic */ LegacyPhotoGalleryOpenParams(List list, int i12, List list2, List list3, Boolean bool, Boolean bool2, Video video, NativeVideo nativeVideo, String str, String str2, TreeClickStreamParent treeClickStreamParent, AdvertActions advertActions, ContactBarData contactBarData, GalleryBuyButtonData galleryBuyButtonData, Long l12, String str3, AutotekaTeaserResult autotekaTeaserResult, GalleryTeaser galleryTeaser, List list4, boolean z12, AddedByAvitoParams addedByAvitoParams, List list5, PhotoGalleryNavBar photoGalleryNavBar, Map map, int i13, C42822w c42822w) {
        this(list, i12, list2, list3, bool, (i13 & 32) != 0 ? null : bool2, video, nativeVideo, str, str2, treeClickStreamParent, advertActions, contactBarData, galleryBuyButtonData, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? -1L : l12, str3, autotekaTeaserResult, (131072 & i13) != 0 ? null : galleryTeaser, list4, z12, (1048576 & i13) != 0 ? null : addedByAvitoParams, (2097152 & i13) != 0 ? null : list5, (4194304 & i13) != 0 ? null : photoGalleryNavBar, (i13 & 8388608) != 0 ? null : map);
    }
}
