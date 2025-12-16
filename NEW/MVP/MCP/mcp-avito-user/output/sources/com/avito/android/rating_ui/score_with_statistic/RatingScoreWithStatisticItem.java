package com.avito.android.rating_ui.score_with_statistic;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.rating_stat.RatingStatEntry;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingScoreWithStatisticItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/score_with_statistic/RatingScoreWithStatisticItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingScoreWithStatisticItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<RatingScoreWithStatisticItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f250406b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Float f250407c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Float f250408d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f250409e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f250410f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Integer f250411g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final List<RatingStatEntry> f250412h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f250413i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final RatingItemsMarginHorizontal f250414j;

    /* compiled from: RatingScoreWithStatisticItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingScoreWithStatisticItem> {
        @Override // android.os.Parcelable.Creator
        public final RatingScoreWithStatisticItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            ArrayList arrayList = null;
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(RatingScoreWithStatisticItem.class, parcel, arrayList, iL2, 1);
                }
            }
            return new RatingScoreWithStatisticItem(string, fValueOf, fValueOf2, string2, string3, numValueOf, arrayList, parcel.readInt() != 0, (RatingItemsMarginHorizontal) parcel.readParcelable(RatingScoreWithStatisticItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RatingScoreWithStatisticItem[] newArray(int i12) {
            return new RatingScoreWithStatisticItem[i12];
        }
    }

    public RatingScoreWithStatisticItem(@k String str, @l Float f12, @l Float f13, @l String str2, @l String str3, @l Integer num, @l List<RatingStatEntry> list, boolean z12, @k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        this.f250406b = str;
        this.f250407c = f12;
        this.f250408d = f13;
        this.f250409e = str2;
        this.f250410f = str3;
        this.f250411g = num;
        this.f250412h = list;
        this.f250413i = z12;
        this.f250414j = ratingItemsMarginHorizontal;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingScoreWithStatisticItem)) {
            return false;
        }
        RatingScoreWithStatisticItem ratingScoreWithStatisticItem = (RatingScoreWithStatisticItem) obj;
        return L.f(this.f250406b, ratingScoreWithStatisticItem.f250406b) && L.f(this.f250407c, ratingScoreWithStatisticItem.f250407c) && L.f(this.f250408d, ratingScoreWithStatisticItem.f250408d) && L.f(this.f250409e, ratingScoreWithStatisticItem.f250409e) && L.f(this.f250410f, ratingScoreWithStatisticItem.f250410f) && L.f(this.f250411g, ratingScoreWithStatisticItem.f250411g) && L.f(this.f250412h, ratingScoreWithStatisticItem.f250412h) && this.f250413i == ratingScoreWithStatisticItem.f250413i && L.f(this.f250414j, ratingScoreWithStatisticItem.f250414j);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80616b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF242945b() {
        return this.f250406b;
    }

    public final int hashCode() {
        int iHashCode = this.f250406b.hashCode() * 31;
        Float f12 = this.f250407c;
        int iHashCode2 = (iHashCode + (f12 == null ? 0 : f12.hashCode())) * 31;
        Float f13 = this.f250408d;
        int iHashCode3 = (iHashCode2 + (f13 == null ? 0 : f13.hashCode())) * 31;
        String str = this.f250409e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f250410f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f250411g;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<RatingStatEntry> list = this.f250412h;
        return this.f250414j.hashCode() + r.i((iHashCode6 + (list != null ? list.hashCode() : 0)) * 31, 31, this.f250413i);
    }

    @k
    public final String toString() {
        return "RatingScoreWithStatisticItem(stringId=" + this.f250406b + ", score=" + this.f250407c + ", scoreFloat=" + this.f250408d + ", title=" + this.f250409e + ", subtitle=" + this.f250410f + ", reviewCount=" + this.f250411g + ", ratingStatistics=" + this.f250412h + ", isCompact=" + this.f250413i + ", marginHorizontal=" + this.f250414j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f250406b);
        Float f12 = this.f250407c;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        Float f13 = this.f250408d;
        if (f13 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f13);
        }
        parcel.writeString(this.f250409e);
        parcel.writeString(this.f250410f);
        Integer num = this.f250411g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        List<RatingStatEntry> list = this.f250412h;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeInt(this.f250413i ? 1 : 0);
        parcel.writeParcelable(this.f250414j, i12);
    }

    public /* synthetic */ RatingScoreWithStatisticItem(String str, Float f12, Float f13, String str2, String str3, Integer num, List list, boolean z12, RatingItemsMarginHorizontal ratingItemsMarginHorizontal, int i12, C42822w c42822w) {
        this(str, f12, f13, str2, str3, num, list, (i12 & 128) != 0 ? false : z12, (i12 & 256) != 0 ? RatingItemsMarginHorizontal.MarginLarge.f249853b : ratingItemsMarginHorizontal);
    }
}
