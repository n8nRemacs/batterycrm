package com.avito.android.favorites.adapter.promo;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.favorites.adapter.FavoriteListItem;
import com.avito.android.lib.util.groupable_item.GroupingOutput;
import com.avito.android.remote.model.vertical_main.MovableImage;
import com.avito.android.remote.model.vertical_main.PromoAction;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FavoritesPromoItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorites/adapter/promo/FavoritesPromoItem;", "Lcom/avito/android/lib/util/groupable_item/a;", "Lcom/avito/android/favorites/adapter/FavoriteListItem;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FavoritesPromoItem implements com.avito.android.lib.util.groupable_item.a, FavoriteListItem {

    @Y61.k
    public static final Parcelable.Creator<FavoritesPromoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f156645b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f156646c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f156647d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<PromoAction> f156648e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final PromoStyle f156649f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f156650g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final MovableImage f156651h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f156652i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f156653j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final GroupingOutput f156654k;

    /* compiled from: FavoritesPromoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FavoritesPromoItem> {
        @Override // android.os.Parcelable.Creator
        public final FavoritesPromoItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(FavoritesPromoItem.class, parcel, arrayList, iL2, 1);
                }
            }
            return new FavoritesPromoItem(string, string2, string3, arrayList, (PromoStyle) parcel.readParcelable(FavoritesPromoItem.class.getClassLoader()), parcel.readString(), (MovableImage) parcel.readParcelable(FavoritesPromoItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final FavoritesPromoItem[] newArray(int i12) {
            return new FavoritesPromoItem[i12];
        }
    }

    public FavoritesPromoItem(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l List<PromoAction> list, @Y61.k PromoStyle promoStyle, @Y61.l String str4, @Y61.l MovableImage movableImage, @Y61.l String str5, boolean z12) {
        this.f156645b = str;
        this.f156646c = str2;
        this.f156647d = str3;
        this.f156648e = list;
        this.f156649f = promoStyle;
        this.f156650g = str4;
        this.f156651h = movableImage;
        this.f156652i = str5;
        this.f156653j = z12;
        this.f156654k = new GroupingOutput();
    }

    @Override // com.avito.android.lib.util.groupable_item.a
    /* renamed from: W, reason: from getter */
    public final boolean getF124955n() {
        return this.f156653j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.lib.util.groupable_item.a
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final GroupingOutput getF124956o() {
        return this.f156654k;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154808b() {
        return this.f156645b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f156645b);
        parcel.writeString(this.f156646c);
        parcel.writeString(this.f156647d);
        List<PromoAction> list = this.f156648e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f156649f, i12);
        parcel.writeString(this.f156650g);
        parcel.writeParcelable(this.f156651h, i12);
        parcel.writeString(this.f156652i);
        parcel.writeInt(this.f156653j ? 1 : 0);
    }

    public /* synthetic */ FavoritesPromoItem(String str, String str2, String str3, List list, PromoStyle promoStyle, String str4, MovableImage movableImage, String str5, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, str3, list, promoStyle, str4, (i12 & 64) != 0 ? null : movableImage, (i12 & 128) != 0 ? null : str5, (i12 & 256) != 0 ? false : z12);
    }
}
