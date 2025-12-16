package tn;

import Pm.C14806a;
import Pm.C14809d;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import vn.C49355b;

/* compiled from: CartSnippetActionsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Ltn/d;", "", "a", "b", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class d {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f439430i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final d f439431j = new d(false, false, false, null, null, null, false, null, 255, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f439432a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f439433b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f439434c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<C14809d, C14806a> f439435d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final b f439436e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Map<String, Object> f439437f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f439438g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final C49355b f439439h;

    /* compiled from: CartSnippetActionsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltn/d$a;", "", "<init>", "()V", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CartSnippetActionsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltn/d$b;", "", "_avito_cart-snippet-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Map<String, Stepper> f439440a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f439441b;

        public b(@k Map<String, Stepper> map, boolean z12) {
            this.f439440a = map;
            this.f439441b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f439440a.equals(bVar.f439440a) && this.f439441b == bVar.f439441b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f439441b) + (this.f439440a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Stocks(values=");
            sb2.append(this.f439440a);
            sb2.append(", cameFromStorage=");
            return r.x(sb2, this.f439441b, ')');
        }
    }

    public d() {
        this(false, false, false, null, null, null, false, null, 255, null);
    }

    public static d a(d dVar, boolean z12, boolean z13, LinkedHashMap linkedHashMap, b bVar, Map map, boolean z14, C49355b c49355b, int i12) {
        boolean z15 = (i12 & 1) != 0 ? dVar.f439432a : z12;
        boolean z16 = (i12 & 2) != 0 ? dVar.f439433b : z13;
        boolean z17 = (i12 & 4) != 0 ? dVar.f439434c : false;
        Map<C14809d, C14806a> map2 = (i12 & 8) != 0 ? dVar.f439435d : linkedHashMap;
        b bVar2 = (i12 & 16) != 0 ? dVar.f439436e : bVar;
        Map map3 = (i12 & 32) != 0 ? dVar.f439437f : map;
        boolean z18 = (i12 & 64) != 0 ? dVar.f439438g : z14;
        C49355b c49355b2 = (i12 & 128) != 0 ? dVar.f439439h : c49355b;
        dVar.getClass();
        return new d(z15, z16, z17, map2, bVar2, map3, z18, c49355b2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f439432a == dVar.f439432a && this.f439433b == dVar.f439433b && this.f439434c == dVar.f439434c && L.f(this.f439435d, dVar.f439435d) && L.f(this.f439436e, dVar.f439436e) && L.f(this.f439437f, dVar.f439437f) && this.f439438g == dVar.f439438g && L.f(this.f439439h, dVar.f439439h);
    }

    public final int hashCode() {
        int iHashCode = (this.f439436e.hashCode() + AK.c.c(r.i(r.i(Boolean.hashCode(this.f439432a) * 31, 31, this.f439433b), 31, this.f439434c), 31, this.f439435d)) * 31;
        Map<String, Object> map = this.f439437f;
        int i12 = r.i((iHashCode + (map == null ? 0 : map.hashCode())) * 31, 31, this.f439438g);
        C49355b c49355b = this.f439439h;
        return i12 + (c49355b != null ? c49355b.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CartSnippetActionsState(isLoading=" + this.f439432a + ", isLoadingStartingFromDebounce=" + this.f439433b + ", supportBundles=" + this.f439434c + ", bundleInfo=" + this.f439435d + ", stocks=" + this.f439436e + ", analyticsData=" + this.f439437f + ", supportDiscountOnDelivery=" + this.f439438g + ", discountOnDelivery=" + this.f439439h + ')';
    }

    public d(boolean z12, boolean z13, boolean z14, @k Map<C14809d, C14806a> map, @k b bVar, @l Map<String, ? extends Object> map2, boolean z15, @l C49355b c49355b) {
        this.f439432a = z12;
        this.f439433b = z13;
        this.f439434c = z14;
        this.f439435d = map;
        this.f439436e = bVar;
        this.f439437f = map2;
        this.f439438g = z15;
        this.f439439h = c49355b;
    }

    public d(boolean z12, boolean z13, boolean z14, Map map, b bVar, Map map2, boolean z15, C49355b c49355b, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? false : z14, (i12 & 8) != 0 ? P0.c() : map, (i12 & 16) != 0 ? new b(P0.c(), false) : bVar, (i12 & 32) != 0 ? null : map2, (i12 & 64) == 0 ? z15 : false, (i12 & 128) != 0 ? e.f439442a : c49355b);
    }
}
