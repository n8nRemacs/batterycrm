package qz0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.str_seller_orders.orders_filters.domain.models.StrOrdersFiltersItemStyle;
import com.avito.android.str_seller_orders.orders_filters.domain.models.StrOrdersFiltersOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersFiltersState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lqz0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f429547i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final c f429548j = new c(null, null, null, null, null, true, new d(null, null));

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f429549b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<StrOrdersFiltersOption> f429550c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final StrOrdersFiltersItemStyle f429551d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f429552e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f429553f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f429554g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final d f429555h;

    /* compiled from: StrOrdersFiltersState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqz0/c$a;", "", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l String str, @l List<StrOrdersFiltersOption> list, @l StrOrdersFiltersItemStyle strOrdersFiltersItemStyle, @l String str2, @l String str3, boolean z12, @k d dVar) {
        this.f429549b = str;
        this.f429550c = list;
        this.f429551d = strOrdersFiltersItemStyle;
        this.f429552e = str2;
        this.f429553f = str3;
        this.f429554g = z12;
        this.f429555h = dVar;
    }

    public static c a(c cVar, String str, ArrayList arrayList, StrOrdersFiltersItemStyle strOrdersFiltersItemStyle, String str2, String str3, boolean z12, d dVar, int i12) {
        String str4 = (i12 & 1) != 0 ? cVar.f429549b : str;
        List<StrOrdersFiltersOption> list = (i12 & 2) != 0 ? cVar.f429550c : arrayList;
        StrOrdersFiltersItemStyle strOrdersFiltersItemStyle2 = (i12 & 4) != 0 ? cVar.f429551d : strOrdersFiltersItemStyle;
        String str5 = (i12 & 8) != 0 ? cVar.f429552e : str2;
        String str6 = (i12 & 16) != 0 ? cVar.f429553f : str3;
        boolean z13 = (i12 & 32) != 0 ? cVar.f429554g : z12;
        d dVar2 = (i12 & 64) != 0 ? cVar.f429555h : dVar;
        cVar.getClass();
        return new c(str4, list, strOrdersFiltersItemStyle2, str5, str6, z13, dVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f429549b, cVar.f429549b) && L.f(this.f429550c, cVar.f429550c) && this.f429551d == cVar.f429551d && L.f(this.f429552e, cVar.f429552e) && L.f(this.f429553f, cVar.f429553f) && this.f429554g == cVar.f429554g && L.f(this.f429555h, cVar.f429555h);
    }

    public final int hashCode() {
        String str = this.f429549b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<StrOrdersFiltersOption> list = this.f429550c;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        StrOrdersFiltersItemStyle strOrdersFiltersItemStyle = this.f429551d;
        int iHashCode3 = (iHashCode2 + (strOrdersFiltersItemStyle == null ? 0 : strOrdersFiltersItemStyle.hashCode())) * 31;
        String str2 = this.f429552e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f429553f;
        return this.f429555h.hashCode() + r.i((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f429554g);
    }

    @k
    public final String toString() {
        return "StrOrdersFiltersState(filterId=" + this.f429549b + ", options=" + this.f429550c + ", itemStyle=" + this.f429551d + ", headerTitle=" + this.f429552e + ", buttonTitle=" + this.f429553f + ", isMultiselect=" + this.f429554g + ", viewState=" + this.f429555h + ')';
    }
}
