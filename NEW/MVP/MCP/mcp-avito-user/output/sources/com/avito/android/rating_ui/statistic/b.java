package com.avito.android.rating_ui.statistic;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingStatisticItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/statistic/b;", "Lcom/avito/android/rating_ui/statistic/a;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class b implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f250470b;

    /* renamed from: c, reason: collision with root package name */
    public final int f250471c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<RatingStatisticRow> f250472d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RatingItemsMarginHorizontal f250473e;

    public b(@k String str, int i12, @k List<RatingStatisticRow> list, @k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        this.f250470b = str;
        this.f250471c = i12;
        this.f250472d = list;
        this.f250473e = ratingItemsMarginHorizontal;
    }

    @Override // com.avito.android.rating_ui.statistic.a
    @k
    /* renamed from: c, reason: from getter */
    public final RatingItemsMarginHorizontal getF250473e() {
        return this.f250473e;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f250470b, bVar.f250470b) && this.f250471c == bVar.f250471c && L.f(this.f250472d, bVar.f250472d) && L.f(this.f250473e, bVar.f250473e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207391e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF171602b() {
        return this.f250470b;
    }

    public final int hashCode() {
        return this.f250473e.hashCode() + H.e(r.e(this.f250471c, this.f250470b.hashCode() * 31, 31), 31, this.f250472d);
    }

    @k
    public final String toString() {
        return "RatingStatisticItem(stringId=" + this.f250470b + ", reviewCount=" + this.f250471c + ", ratingStatistics=" + this.f250472d + ", marginHorizontal=" + this.f250473e + ')';
    }

    @Override // com.avito.android.rating_ui.statistic.a
    @k
    public final List<RatingStatisticRow> z() {
        return this.f250472d;
    }

    public /* synthetic */ b(String str, int i12, List list, RatingItemsMarginHorizontal ratingItemsMarginHorizontal, int i13, C42822w c42822w) {
        this(str, i12, list, (i13 & 8) != 0 ? RatingItemsMarginHorizontal.MarginLarge.f249853b : ratingItemsMarginHorizontal);
    }
}
