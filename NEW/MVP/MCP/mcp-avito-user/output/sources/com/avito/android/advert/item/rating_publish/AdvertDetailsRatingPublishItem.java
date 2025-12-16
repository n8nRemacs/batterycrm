package com.avito.android.advert.item.rating_publish;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.AdvertDetailsItem;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsRatingPublishItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/rating_publish/AdvertDetailsRatingPublishItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsRatingPublishItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsRatingPublishItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f78298b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Action f78299c;

    /* renamed from: d, reason: collision with root package name */
    public final long f78300d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f78301e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f78302f;

    /* compiled from: AdvertDetailsRatingPublishItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsRatingPublishItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsRatingPublishItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsRatingPublishItem(parcel.readInt(), (Action) parcel.readParcelable(AdvertDetailsRatingPublishItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsRatingPublishItem[] newArray(int i12) {
            return new AdvertDetailsRatingPublishItem[i12];
        }
    }

    public AdvertDetailsRatingPublishItem(int i12, @k Action action) {
        this.f78298b = i12;
        this.f78299c = action;
        AdvertDetailsItem advertDetailsItem = AdvertDetailsItem.f82525b;
        long j12 = 72;
        this.f78300d = j12;
        this.f78301e = String.valueOf(j12);
        SerpDisplayType.Companion companion = SerpDisplayType.INSTANCE;
        this.f78302f = SerpViewType.f268585e;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsRatingPublishItem(i12, this.f78299c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsRatingPublishItem)) {
            return false;
        }
        AdvertDetailsRatingPublishItem advertDetailsRatingPublishItem = (AdvertDetailsRatingPublishItem) obj;
        return this.f78298b == advertDetailsRatingPublishItem.f78298b && L.f(this.f78299c, advertDetailsRatingPublishItem.f78299c);
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF428153b() {
        return this.f78300d;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85018q() {
        return this.f78298b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281482b() {
        return this.f78301e;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF85020s() {
        return this.f78302f;
    }

    public final int hashCode() {
        return this.f78299c.hashCode() + (Integer.hashCode(this.f78298b) * 31);
    }

    @k
    public final String toString() {
        return "AdvertDetailsRatingPublishItem(spanCount=" + this.f78298b + ", action=" + this.f78299c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f78298b);
        parcel.writeParcelable(this.f78299c, i12);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
    }
}
