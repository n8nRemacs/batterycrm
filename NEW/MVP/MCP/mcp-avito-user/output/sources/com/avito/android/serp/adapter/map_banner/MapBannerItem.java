package com.avito.android.serp.adapter.map_banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MapBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/map_banner/MapBannerItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MapBannerItem implements PersistableSerpItem {

    @k
    public static final Parcelable.Creator<MapBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f270284b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f270285c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f270286d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f270287e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f270288f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final UniversalImage f270289g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SerpViewType f270290h;

    /* compiled from: MapBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MapBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final MapBannerItem createFromParcel(Parcel parcel) {
            return new MapBannerItem(parcel.readInt(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(MapBannerItem.class.getClassLoader()), parcel.readString(), (UniversalImage) parcel.readParcelable(MapBannerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MapBannerItem[] newArray(int i12) {
            return new MapBannerItem[i12];
        }
    }

    public MapBannerItem(int i12, @k String str, @l String str2, @l DeepLink deepLink, @l String str3, @l UniversalImage universalImage) {
        this.f270284b = i12;
        this.f270285c = str;
        this.f270286d = str2;
        this.f270287e = deepLink;
        this.f270288f = str3;
        this.f270289g = universalImage;
        this.f270290h = SerpViewType.f268585e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272457h() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85688e() {
        return this.f270284b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF258422b() {
        return this.f270285c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF85690g() {
        return this.f270290h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f270284b);
        parcel.writeString(this.f270285c);
        parcel.writeString(this.f270286d);
        parcel.writeParcelable(this.f270287e, i12);
        parcel.writeString(this.f270288f);
        parcel.writeParcelable(this.f270289g, i12);
    }

    public /* synthetic */ MapBannerItem(int i12, String str, String str2, DeepLink deepLink, String str3, UniversalImage universalImage, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? UUID.randomUUID().toString() : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : deepLink, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : universalImage);
    }
}
