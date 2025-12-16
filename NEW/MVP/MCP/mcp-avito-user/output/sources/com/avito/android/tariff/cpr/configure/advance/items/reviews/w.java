package com.avito.android.tariff.cpr.configure.advance.items.reviews;

import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CprConfigureAdvanceReviewsItemViewState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/items/reviews/w;", "", "a", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class w {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f295315c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final w f295316d = new w(C42784z0.f406748b, null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f295317a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f295318b;

    /* compiled from: CprConfigureAdvanceReviewsItemViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/items/reviews/w$a;", "", "<init>", "()V", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public w(@Y61.k List<? extends x> list, @Y61.l Integer num) {
        this.f295317a = list;
        this.f295318b = num;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return L.f(this.f295317a, wVar.f295317a) && L.f(this.f295318b, wVar.f295318b);
    }

    public final int hashCode() {
        int iHashCode = this.f295317a.hashCode() * 31;
        Integer num = this.f295318b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CprConfigureAdvanceReviewsItemViewState(reviews=");
        sb2.append(this.f295317a);
        sb2.append(", indexToScroll=");
        return com.akita.compose.component.accordion.s.j(sb2, this.f295318b, ')');
    }
}
