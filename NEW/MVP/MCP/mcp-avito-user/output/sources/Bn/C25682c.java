package bn;

import Y61.k;
import Y61.l;
import Ym.C18298a;
import Ym.C18299b;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.cart_recommendations.model.Srcp;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: OpenCartAdvertEvent.kt */
@P
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lbn/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "LYm/a;", "advertId", "LYm/b;", ChannelContext.Item.USER_ID, "Lcom/avito/android/cart_recommendations/model/Srcp;", "srcp", "", "position", "", "", "", "extraParameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/cart_recommendations/model/Srcp;ILjava/util/Map;Lkotlin/jvm/internal/w;)V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bn.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C25682c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f57430b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f57431c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Srcp f57432d;

    /* renamed from: e, reason: collision with root package name */
    public final int f57433e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Map<String, Object> f57434f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f57435g;

    public C25682c() {
        throw null;
    }

    public C25682c(String str, String str2, Srcp srcp, int i12, Map map, C42822w c42822w) {
        this.f57430b = str;
        this.f57431c = str2;
        this.f57432d = srcp;
        this.f57433e = i12;
        this.f57434f = map;
        this.f57435g = new ParametrizedClickStreamEvent(6285, 3, "Avito.Marketplace / Корзина / Переход к карточке айтема", C35755b0.c(P0.k(P0.g(new Q("iid", str), new Q("uid", str2 == null ? null : str2), new Q("srcp", srcp != null ? srcp.f115338b : null), new Q("position", Integer.valueOf(i12))), map)));
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
            boolean r1 = r5 instanceof bn.C25682c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            bn.c r5 = (bn.C25682c) r5
            java.lang.String r1 = r5.f57430b
            java.lang.String r3 = r4.f57430b
            boolean r1 = kotlin.jvm.internal.L.f(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f57431c
            java.lang.String r3 = r5.f57431c
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
            com.avito.android.cart_recommendations.model.Srcp r1 = r4.f57432d
            com.avito.android.cart_recommendations.model.Srcp r3 = r5.f57432d
            if (r1 == r3) goto L34
            return r2
        L34:
            int r1 = r4.f57433e
            int r3 = r5.f57433e
            if (r1 == r3) goto L3b
            return r2
        L3b:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.f57434f
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.f57434f
            boolean r5 = kotlin.jvm.internal.L.f(r1, r5)
            if (r5 != 0) goto L46
            return r2
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bn.C25682c.equals(java.lang.Object):boolean");
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f57435g.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f57435g.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f57435g.f90248c;
    }

    public final int hashCode() {
        int iHashCode = this.f57430b.hashCode() * 31;
        String str = this.f57431c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Srcp srcp = this.f57432d;
        return this.f57434f.hashCode() + r.e(this.f57433e, (iHashCode2 + (srcp != null ? srcp.hashCode() : 0)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OpenCartAdvertEvent(advertId=");
        sb2.append((Object) C18298a.b(this.f57430b));
        sb2.append(", userId=");
        String str = this.f57431c;
        sb2.append((Object) (str == null ? "null" : C18299b.a(str)));
        sb2.append(", srcp=");
        sb2.append(this.f57432d);
        sb2.append(", position=");
        sb2.append(this.f57433e);
        sb2.append(", extraParameters=");
        return r.w(sb2, this.f57434f, ')');
    }
}
