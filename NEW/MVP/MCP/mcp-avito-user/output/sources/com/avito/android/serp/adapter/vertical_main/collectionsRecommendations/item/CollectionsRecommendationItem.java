package com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CollectionsRecommendationItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/collectionsRecommendations/item/CollectionsRecommendationItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CollectionsRecommendationItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<CollectionsRecommendationItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f272718b;

    /* renamed from: c, reason: collision with root package name */
    public final int f272719c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f272720d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DeepLink f272721e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Image f272722f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Analytics f272723g;

    /* compiled from: CollectionsRecommendationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CollectionsRecommendationItem> {
        @Override // android.os.Parcelable.Creator
        public final CollectionsRecommendationItem createFromParcel(Parcel parcel) {
            return new CollectionsRecommendationItem(parcel.readString(), parcel.readInt(), parcel.readString(), (DeepLink) parcel.readParcelable(CollectionsRecommendationItem.class.getClassLoader()), (Image) parcel.readParcelable(CollectionsRecommendationItem.class.getClassLoader()), (Analytics) parcel.readParcelable(CollectionsRecommendationItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CollectionsRecommendationItem[] newArray(int i12) {
            return new CollectionsRecommendationItem[i12];
        }
    }

    public CollectionsRecommendationItem(@k String str, int i12, @k String str2, @k DeepLink deepLink, @l Image image, @l Analytics analytics) {
        this.f272718b = str;
        this.f272719c = i12;
        this.f272720d = str2;
        this.f272721e = deepLink;
        this.f272722f = image;
        this.f272723g = analytics;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CollectionsRecommendationItem)) {
            return false;
        }
        CollectionsRecommendationItem collectionsRecommendationItem = (CollectionsRecommendationItem) obj;
        return L.f(this.f272718b, collectionsRecommendationItem.f272718b) && this.f272719c == collectionsRecommendationItem.f272719c && L.f(this.f272720d, collectionsRecommendationItem.f272720d) && L.f(this.f272721e, collectionsRecommendationItem.f272721e) && L.f(this.f272722f, collectionsRecommendationItem.f272722f) && L.f(this.f272723g, collectionsRecommendationItem.f272723g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85532b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154734b() {
        return this.f272718b;
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f272721e, H.d(r.e(this.f272719c, this.f272718b.hashCode() * 31, 31), 31, this.f272720d), 31);
        Image image = this.f272722f;
        int iHashCode = (iE2 + (image == null ? 0 : image.hashCode())) * 31;
        Analytics analytics = this.f272723g;
        return iHashCode + (analytics != null ? analytics.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CollectionsRecommendationItem(stringId=" + this.f272718b + ", widgetPosition=" + this.f272719c + ", title=" + this.f272720d + ", deepLink=" + this.f272721e + ", image=" + this.f272722f + ", analytics=" + this.f272723g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f272718b);
        parcel.writeInt(this.f272719c);
        parcel.writeString(this.f272720d);
        parcel.writeParcelable(this.f272721e, i12);
        parcel.writeParcelable(this.f272722f, i12);
        parcel.writeParcelable(this.f272723g, i12);
    }
}
