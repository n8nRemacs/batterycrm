package com.avito.android.favorite_sellers;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RecommendationItem.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite_sellers/RecommendationItem;", "Lcom/avito/android/favorite_sellers/FavoriteSellersItem;", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public class RecommendationItem implements FavoriteSellersItem, PersistableSpannedItem {

    @Y61.k
    public static final Parcelable.Creator<RecommendationItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f155459b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<RecommendationCarouselItem> f155460c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f155461d;

    /* renamed from: e, reason: collision with root package name */
    public final int f155462e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Parcelable f155463f;

    /* compiled from: RecommendationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecommendationItem> {
        @Override // android.os.Parcelable.Creator
        public final RecommendationItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(RecommendationItem.class, parcel, arrayList, iL2, 1);
            }
            return new RecommendationItem(string, arrayList, parcel.readString(), parcel.readInt(), parcel.readParcelable(RecommendationItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RecommendationItem[] newArray(int i12) {
            return new RecommendationItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendationItem(@Y61.k String str, @Y61.k List<? extends RecommendationCarouselItem> list, @Y61.l String str2, int i12, @Y61.l Parcelable parcelable) {
        this.f155459b = str;
        this.f155460c = list;
        this.f155461d = str2;
        this.f155462e = i12;
        this.f155463f = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272342b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF155462e() {
        return this.f155462e;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF155459b() {
        return this.f155459b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f155459b);
        Iterator itJ = C0.j(this.f155460c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f155461d);
        parcel.writeInt(this.f155462e);
        parcel.writeParcelable(this.f155463f, i12);
    }

    public /* synthetic */ RecommendationItem(String str, List list, String str2, int i12, Parcelable parcelable, int i13, C42822w c42822w) {
        this(str, list, str2, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? null : parcelable);
    }
}
