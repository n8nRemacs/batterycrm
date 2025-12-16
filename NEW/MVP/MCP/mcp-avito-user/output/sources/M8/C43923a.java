package m8;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: ItemAddedToCart.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lm8/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: m8.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C43923a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f414328b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f414329c;

    /* renamed from: d, reason: collision with root package name */
    public final int f414330d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f414331e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f414332f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Boolean f414333g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f414334h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414335i;

    public C43923a(@k String str, @k String str2, int i12, @l String str3, @k String str4, @l Boolean bool, @l String str5) {
        this.f414328b = str;
        this.f414329c = str2;
        this.f414330d = i12;
        this.f414331e = str3;
        this.f414332f = str4;
        this.f414333g = bool;
        this.f414334h = str5;
        this.f414335i = new ParametrizedClickStreamEvent(5942, 11, "Avito.Marketplace / Корзина/ Добавление объявления в корзину", C35755b0.c(P0.g(new Q("cart_added_item_num", Integer.valueOf(i12)), new Q("iid", str2), new Q("uid", str), new Q("x", str3), new Q("from_page", str4), new Q("safedeal_services", "[delivery]"), new Q("is_multiitems_variation", bool), new Q("from_space", str5))));
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43923a)) {
            return false;
        }
        C43923a c43923a = (C43923a) obj;
        return L.f(this.f414328b, c43923a.f414328b) && L.f(this.f414329c, c43923a.f414329c) && this.f414330d == c43923a.f414330d && L.f(this.f414331e, c43923a.f414331e) && L.f(this.f414332f, c43923a.f414332f) && L.f(this.f414333g, c43923a.f414333g) && L.f(this.f414334h, c43923a.f414334h);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f414335i.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414335i.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f414335i.f90248c;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f414330d, H.d(this.f414328b.hashCode() * 31, 31, this.f414329c), 31);
        String str = this.f414331e;
        int iD2 = H.d((iE2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f414332f);
        Boolean bool = this.f414333g;
        int iHashCode = (iD2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f414334h;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemAddedToCart(userId=");
        sb2.append(this.f414328b);
        sb2.append(", itemId=");
        sb2.append(this.f414329c);
        sb2.append(", quantity=");
        sb2.append(this.f414330d);
        sb2.append(", xHash=");
        sb2.append(this.f414331e);
        sb2.append(", fromPage=");
        sb2.append(this.f414332f);
        sb2.append(", isMultiItemsVariation=");
        sb2.append(this.f414333g);
        sb2.append(", fromSpace=");
        return C22026a.c(sb2, this.f414334h, ')');
    }
}
