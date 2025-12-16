package com.avito.android.user_advert.advert.items.fill_parameters_banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.O0;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FillParametersBannerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/fill_parameters_banner/FillParametersBannerItem;", "Lcom/avito/android/serp/adapter/O0;", "Landroid/os/Parcelable;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FillParametersBannerItem implements O0, Parcelable {

    @k
    public static final Parcelable.Creator<FillParametersBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309387b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f309388c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f309389d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f309390e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f309391f;

    /* renamed from: g, reason: collision with root package name */
    public final int f309392g;

    /* compiled from: FillParametersBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FillParametersBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final FillParametersBannerItem createFromParcel(Parcel parcel) {
            return new FillParametersBannerItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(FillParametersBannerItem.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final FillParametersBannerItem[] newArray(int i12) {
            return new FillParametersBannerItem[i12];
        }
    }

    public FillParametersBannerItem(@k String str, @l String str2, @l String str3, @l String str4, @l DeepLink deepLink, int i12) {
        this.f309387b = str;
        this.f309388c = str2;
        this.f309389d = str3;
        this.f309390e = str4;
        this.f309391f = deepLink;
        this.f309392g = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF273471h() {
        return this.f309392g;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF302516b() {
        return this.f309387b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f309387b);
        parcel.writeString(this.f309388c);
        parcel.writeString(this.f309389d);
        parcel.writeString(this.f309390e);
        parcel.writeParcelable(this.f309391f, i12);
        parcel.writeInt(this.f309392g);
    }

    public /* synthetic */ FillParametersBannerItem(String str, String str2, String str3, String str4, DeepLink deepLink, int i12, int i13, C42822w c42822w) {
        this(str, str2, str3, str4, deepLink, (i13 & 32) != 0 ? 1 : i12);
    }
}
