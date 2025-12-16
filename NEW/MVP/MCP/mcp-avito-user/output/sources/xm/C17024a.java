package Xm;

import Y61.k;
import Y61.l;
import Ym.C18298a;
import Ym.C18299b;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.cart_recommendations.model.FromPage;
import com.avito.android.cart_recommendations.model.Srcp;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.util.C35755b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CartRecommendationsDisplayedEvent.kt */
@s0
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LXm/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "LYm/a;", "advertId", "LYm/b;", ChannelContext.Item.USER_ID, "", "recommendedIds", "Lcom/avito/android/cart_recommendations/model/Srcp;", "srcp", "Lcom/avito/android/cart_recommendations/model/FromPage;", "fromPage", "", "feedTitle", "", "itemsNum", "", "", "extraParameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/cart_recommendations/model/Srcp;Lcom/avito/android/cart_recommendations/model/FromPage;Ljava/lang/String;ILjava/util/Map;Lkotlin/jvm/internal/w;)V", "_avito_cart-recommendations_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xm.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C17024a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f19056b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f19057c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<C18298a> f19058d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Srcp f19059e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final FromPage f19060f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f19061g;

    /* renamed from: h, reason: collision with root package name */
    public final int f19062h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Map<String, Object> f19063i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f19064j;

    public C17024a() {
        throw null;
    }

    public C17024a(String str, String str2, List list, Srcp srcp, FromPage fromPage, String str3, int i12, Map map, C42822w c42822w) {
        this.f19056b = str;
        this.f19057c = str2;
        this.f19058d = list;
        this.f19059e = srcp;
        this.f19060f = fromPage;
        this.f19061g = str3;
        this.f19062h = i12;
        this.f19063i = map;
        Q q12 = new Q("iid", str);
        Q q13 = new Q("uid", str2 == null ? null : str2);
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C18298a) it.next()).f19646a);
        }
        this.f19064j = new ParametrizedClickStreamEvent(9344, 5, "Avito.Marketplace / Корзина / Рекомендательная выдача", C35755b0.c(P0.k(P0.g(q12, q13, new Q("iids", arrayList), new Q("srcp", srcp != null ? srcp.f115338b : null), new Q("from_page", fromPage.f115334b), new Q("title", str3), new Q("items_num", Integer.valueOf(i12))), map)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(@Y61.l java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof Xm.C17024a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Xm.a r5 = (Xm.C17024a) r5
            java.lang.String r1 = r5.f19056b
            java.lang.String r3 = r4.f19056b
            boolean r1 = kotlin.jvm.internal.L.f(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f19057c
            java.lang.String r3 = r5.f19057c
            if (r1 != 0) goto L23
            if (r3 != 0) goto L21
            r1 = r0
            goto L2a
        L21:
            r1 = r2
            goto L2a
        L23:
            if (r3 != 0) goto L26
            goto L21
        L26:
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
        L2a:
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.util.List<Ym.a> r1 = r4.f19058d
            java.util.List<Ym.a> r3 = r5.f19058d
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            com.avito.android.cart_recommendations.model.Srcp r1 = r4.f19059e
            com.avito.android.cart_recommendations.model.Srcp r3 = r5.f19059e
            if (r1 == r3) goto L3f
            return r2
        L3f:
            com.avito.android.cart_recommendations.model.FromPage r1 = r4.f19060f
            com.avito.android.cart_recommendations.model.FromPage r3 = r5.f19060f
            if (r1 == r3) goto L46
            return r2
        L46:
            java.lang.String r1 = r4.f19061g
            java.lang.String r3 = r5.f19061g
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
            if (r1 != 0) goto L51
            return r2
        L51:
            int r1 = r4.f19062h
            int r3 = r5.f19062h
            if (r1 == r3) goto L58
            return r2
        L58:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.f19063i
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f19063i
            boolean r5 = kotlin.jvm.internal.L.f(r1, r5)
            if (r5 != 0) goto L63
            return r2
        L63:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Xm.C17024a.equals(java.lang.Object):boolean");
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90129b() {
        return this.f19064j.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f19064j.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90130c() {
        return this.f19064j.f90248c;
    }

    public final int hashCode() {
        int iHashCode = this.f19056b.hashCode() * 31;
        String str = this.f19057c;
        int iE2 = H.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f19058d);
        Srcp srcp = this.f19059e;
        return this.f19063i.hashCode() + r.e(this.f19062h, H.d((this.f19060f.hashCode() + ((iE2 + (srcp != null ? srcp.hashCode() : 0)) * 31)) * 31, 31, this.f19061g), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CartRecommendationsDisplayedEvent(advertId=");
        sb2.append((Object) C18298a.b(this.f19056b));
        sb2.append(", userId=");
        String str = this.f19057c;
        sb2.append((Object) (str == null ? "null" : C18299b.a(str)));
        sb2.append(", recommendedIds=");
        sb2.append(this.f19058d);
        sb2.append(", srcp=");
        sb2.append(this.f19059e);
        sb2.append(", fromPage=");
        sb2.append(this.f19060f);
        sb2.append(", feedTitle=");
        sb2.append(this.f19061g);
        sb2.append(", itemsNum=");
        sb2.append(this.f19062h);
        sb2.append(", extraParameters=");
        return r.w(sb2, this.f19063i, ')');
    }
}
