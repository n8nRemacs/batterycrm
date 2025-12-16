package com.avito.android.serp.adapter.top_sellers_serp.top_sellers_serp_list;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.swipe_sellers.TopSellerSerp;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: TopSellerSerpItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/top_sellers_serp/top_sellers_serp_list/TopSellerSerpItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TopSellerSerpItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<TopSellerSerpItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f272486b;

    /* renamed from: c, reason: collision with root package name */
    public final int f272487c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Image f272488d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f272489e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TopSellerSerp f272490f;

    /* compiled from: TopSellerSerpItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TopSellerSerpItem> {
        @Override // android.os.Parcelable.Creator
        public final TopSellerSerpItem createFromParcel(Parcel parcel) {
            return new TopSellerSerpItem(parcel.readString(), parcel.readInt(), (Image) parcel.readParcelable(TopSellerSerpItem.class.getClassLoader()), parcel.readString(), (TopSellerSerp) parcel.readParcelable(TopSellerSerpItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TopSellerSerpItem[] newArray(int i12) {
            return new TopSellerSerpItem[i12];
        }
    }

    public TopSellerSerpItem(@k String str, int i12, @k Image image, @k String str2, @k TopSellerSerp topSellerSerp) {
        this.f272486b = str;
        this.f272487c = i12;
        this.f272488d = image;
        this.f272489e = str2;
        this.f272490f = topSellerSerp;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78384b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272486b() {
        return this.f272486b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f272486b);
        parcel.writeInt(this.f272487c);
        parcel.writeParcelable(this.f272488d, i12);
        parcel.writeString(this.f272489e);
        parcel.writeParcelable(this.f272490f, i12);
    }
}
