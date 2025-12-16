package com.avito.android.serp.adapter.screen_map_banner;

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

/* compiled from: ScreenMapBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/screen_map_banner/ScreenMapBannerItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScreenMapBannerItem implements PersistableSerpItem {

    @k
    public static final Parcelable.Creator<ScreenMapBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f271560b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f271561c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f271562d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalImage f271563e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f271564f;

    /* compiled from: ScreenMapBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ScreenMapBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final ScreenMapBannerItem createFromParcel(Parcel parcel) {
            return new ScreenMapBannerItem(parcel.readInt(), parcel.readString(), (DeepLink) parcel.readParcelable(ScreenMapBannerItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(ScreenMapBannerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ScreenMapBannerItem[] newArray(int i12) {
            return new ScreenMapBannerItem[i12];
        }
    }

    public ScreenMapBannerItem(int i12, @k String str, @l DeepLink deepLink, @l UniversalImage universalImage) {
        this.f271560b = i12;
        this.f271561c = str;
        this.f271562d = deepLink;
        this.f271563e = universalImage;
        this.f271564f = SerpViewType.f268585e;
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
        return this.f271560b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF258422b() {
        return this.f271561c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF85690g() {
        return this.f271564f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f271560b);
        parcel.writeString(this.f271561c);
        parcel.writeParcelable(this.f271562d, i12);
        parcel.writeParcelable(this.f271563e, i12);
    }

    public /* synthetic */ ScreenMapBannerItem(int i12, String str, DeepLink deepLink, UniversalImage universalImage, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? UUID.randomUUID().toString() : str, (i13 & 4) != 0 ? null : deepLink, (i13 & 8) != 0 ? null : universalImage);
    }
}
