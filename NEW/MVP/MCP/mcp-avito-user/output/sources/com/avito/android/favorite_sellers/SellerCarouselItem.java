package com.avito.android.favorite_sellers;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SellerCarouselItem.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite_sellers/SellerCarouselItem;", "Lcom/avito/android/favorite_sellers/RecommendationCarouselItem;", "Advert", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerCarouselItem implements RecommendationCarouselItem {

    @Y61.k
    public static final Parcelable.Creator<SellerCarouselItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f155464b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f155465c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f155466d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f155467e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f155468f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Image f155469g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f155470h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final List<Advert> f155471i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final DeepLink f155472j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f155473k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f155474l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public Boolean f155475m;

    /* compiled from: SellerCarouselItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SellerCarouselItem> {
        @Override // android.os.Parcelable.Creator
        public final SellerCarouselItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Image image = (Image) parcel.readParcelable(SellerCarouselItem.class.getClassLoader());
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Advert.CREATOR, parcel, arrayList, iC2, 1);
            }
            DeepLink deepLink = (DeepLink) parcel.readParcelable(SellerCarouselItem.class.getClassLoader());
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SellerCarouselItem(string, string2, string3, string4, string5, image, z12, arrayList, deepLink, z13, z14, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final SellerCarouselItem[] newArray(int i12) {
            return new SellerCarouselItem[i12];
        }
    }

    public SellerCarouselItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.l String str5, @Y61.l Image image, boolean z12, @Y61.k List<Advert> list, @Y61.l DeepLink deepLink, boolean z13, boolean z14, @Y61.l Boolean bool) {
        this.f155464b = str;
        this.f155465c = str2;
        this.f155466d = str3;
        this.f155467e = str4;
        this.f155468f = str5;
        this.f155469g = image;
        this.f155470h = z12;
        this.f155471i = list;
        this.f155472j = deepLink;
        this.f155473k = z13;
        this.f155474l = z14;
        this.f155475m = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223150b() {
        return this.f155464b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f155464b);
        parcel.writeString(this.f155465c);
        parcel.writeString(this.f155466d);
        parcel.writeString(this.f155467e);
        parcel.writeString(this.f155468f);
        parcel.writeParcelable(this.f155469g, i12);
        parcel.writeInt(this.f155470h ? 1 : 0);
        Iterator itJ = C0.j(this.f155471i, parcel);
        while (itJ.hasNext()) {
            ((Advert) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f155472j, i12);
        parcel.writeInt(this.f155473k ? 1 : 0);
        parcel.writeInt(this.f155474l ? 1 : 0);
        Boolean bool = this.f155475m;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    /* compiled from: SellerCarouselItem.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/SellerCarouselItem$Advert;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class Advert implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Advert> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Image f155476b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f155477c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f155478d;

        /* compiled from: SellerCarouselItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Advert> {
            @Override // android.os.Parcelable.Creator
            public final Advert createFromParcel(Parcel parcel) {
                return new Advert((Image) parcel.readParcelable(Advert.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Advert[] newArray(int i12) {
                return new Advert[i12];
            }
        }

        public Advert(@Y61.l Image image, @Y61.l String str, @Y61.l String str2) {
            this.f155476b = image;
            this.f155477c = str;
            this.f155478d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f155476b, i12);
            parcel.writeString(this.f155477c);
            parcel.writeString(this.f155478d);
        }

        public /* synthetic */ Advert(Image image, String str, String str2, int i12, C42822w c42822w) {
            this(image, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2);
        }
    }

    public /* synthetic */ SellerCarouselItem(String str, String str2, String str3, String str4, String str5, Image image, boolean z12, List list, DeepLink deepLink, boolean z13, boolean z14, Boolean bool, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, str5, image, z12, list, deepLink, (i12 & 512) != 0 ? false : z13, (i12 & 1024) != 0 ? false : z14, (i12 & 2048) != 0 ? null : bool);
    }
}
