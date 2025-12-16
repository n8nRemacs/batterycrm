package com.avito.android.str_seller_orders.orders_seller.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.a;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import sz0.C48445f;

/* compiled from: StrSellerOrdersState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "LoadingState", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StrSellerOrdersState extends q {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final b f289574j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final StrSellerOrdersState f289575k;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C48445f f289576b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f289577c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f289578d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LoadingState f289579e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a f289580f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Map<String, String> f289581g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<TV0.a> f289582h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.str_seller_orders.orders_seller.mvi.entity.b f289583i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StrSellerOrdersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersState$LoadingState;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingState {

        /* renamed from: b, reason: collision with root package name */
        public static final LoadingState f289584b;

        /* renamed from: c, reason: collision with root package name */
        public static final LoadingState f289585c;

        /* renamed from: d, reason: collision with root package name */
        public static final LoadingState f289586d;

        /* renamed from: e, reason: collision with root package name */
        public static final LoadingState f289587e;

        /* renamed from: f, reason: collision with root package name */
        public static final LoadingState f289588f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ LoadingState[] f289589g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f289590h;

        static {
            LoadingState loadingState = new LoadingState("LOADING", 0);
            f289584b = loadingState;
            LoadingState loadingState2 = new LoadingState("SILENT_LOADING", 1);
            f289585c = loadingState2;
            LoadingState loadingState3 = new LoadingState("PAGINATION_LOADING", 2);
            f289586d = loadingState3;
            LoadingState loadingState4 = new LoadingState("LOADED", 3);
            f289587e = loadingState4;
            LoadingState loadingState5 = new LoadingState("ERROR", 4);
            f289588f = loadingState5;
            LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3, loadingState4, loadingState5};
            f289589g = loadingStateArr;
            f289590h = c.a(loadingStateArr);
        }

        public LoadingState() {
            throw null;
        }

        public static LoadingState valueOf(String str) {
            return (LoadingState) Enum.valueOf(LoadingState.class, str);
        }

        public static LoadingState[] values() {
            return (LoadingState[]) f289589g.clone();
        }
    }

    /* compiled from: StrSellerOrdersState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersState$a;", "", "a", "b", "c", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersState$a$a;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersState$a$b;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersState$a$c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: StrSellerOrdersState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersState$a$a;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersState$a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersState$a$a, reason: collision with other inner class name */
        public static final /* data */ class C8724a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C8724a f289591a = new C8724a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C8724a);
            }

            public final int hashCode() {
                return -1070480653;
            }

            @k
            public final String toString() {
                return "Error";
            }
        }

        /* compiled from: StrSellerOrdersState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersState$a$b;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersState$a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final BF0.a f289592a;

            public b(@l BF0.a aVar) {
                this.f289592a = aVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f289592a, ((b) obj).f289592a);
            }

            public final int hashCode() {
                BF0.a aVar = this.f289592a;
                if (aVar == null) {
                    return 0;
                }
                return aVar.hashCode();
            }

            @k
            public final String toString() {
                return "Loaded(banner=" + this.f289592a + ')';
            }
        }

        /* compiled from: StrSellerOrdersState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersState$a$c;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersState$a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f289593a = new c();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -419085465;
            }

            @k
            public final String toString() {
                return "Loading";
            }
        }
    }

    /* compiled from: StrSellerOrdersState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersState$b;", "", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        LoadingState loadingState = LoadingState.f289584b;
        a.c cVar = a.c.f289593a;
        Map mapC = P0.c();
        C42784z0 c42784z0 = C42784z0.f406748b;
        f289575k = new StrSellerOrdersState(null, false, true, loadingState, cVar, mapC, c42784z0, new b.a(a.b.f289595a, c42784z0));
    }

    public StrSellerOrdersState(@l C48445f c48445f, boolean z12, boolean z13, @k LoadingState loadingState, @k a aVar, @k Map map, @k List list, @k com.avito.android.str_seller_orders.orders_seller.mvi.entity.b bVar) {
        this.f289576b = c48445f;
        this.f289577c = z12;
        this.f289578d = z13;
        this.f289579e = loadingState;
        this.f289580f = aVar;
        this.f289581g = map;
        this.f289582h = list;
        this.f289583i = bVar;
    }

    public static StrSellerOrdersState a(StrSellerOrdersState strSellerOrdersState, C48445f c48445f, boolean z12, boolean z13, LoadingState loadingState, a aVar, Map map, ArrayList arrayList, com.avito.android.str_seller_orders.orders_seller.mvi.entity.b bVar, int i12) {
        C48445f c48445f2 = (i12 & 1) != 0 ? strSellerOrdersState.f289576b : c48445f;
        boolean z14 = (i12 & 2) != 0 ? strSellerOrdersState.f289577c : z12;
        boolean z15 = (i12 & 4) != 0 ? strSellerOrdersState.f289578d : z13;
        strSellerOrdersState.getClass();
        LoadingState loadingState2 = (i12 & 16) != 0 ? strSellerOrdersState.f289579e : loadingState;
        a aVar2 = (i12 & 32) != 0 ? strSellerOrdersState.f289580f : aVar;
        Map map2 = (i12 & 64) != 0 ? strSellerOrdersState.f289581g : map;
        List<TV0.a> list = (i12 & 128) != 0 ? strSellerOrdersState.f289582h : arrayList;
        com.avito.android.str_seller_orders.orders_seller.mvi.entity.b bVar2 = (i12 & 256) != 0 ? strSellerOrdersState.f289583i : bVar;
        strSellerOrdersState.getClass();
        return new StrSellerOrdersState(c48445f2, z14, z15, loadingState2, aVar2, map2, list, bVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrSellerOrdersState)) {
            return false;
        }
        StrSellerOrdersState strSellerOrdersState = (StrSellerOrdersState) obj;
        return L.f(this.f289576b, strSellerOrdersState.f289576b) && this.f289577c == strSellerOrdersState.f289577c && this.f289578d == strSellerOrdersState.f289578d && L.f(null, null) && this.f289579e == strSellerOrdersState.f289579e && L.f(this.f289580f, strSellerOrdersState.f289580f) && L.f(this.f289581g, strSellerOrdersState.f289581g) && L.f(this.f289582h, strSellerOrdersState.f289582h) && L.f(this.f289583i, strSellerOrdersState.f289583i);
    }

    public final int hashCode() {
        C48445f c48445f = this.f289576b;
        return this.f289583i.hashCode() + H.e(AK.c.c((this.f289580f.hashCode() + ((this.f289579e.hashCode() + r.i(r.i((c48445f == null ? 0 : c48445f.hashCode()) * 31, 31, this.f289577c), 961, this.f289578d)) * 31)) * 31, 31, this.f289581g), 31, this.f289582h);
    }

    @k
    public final String toString() {
        return "StrSellerOrdersState(data=" + this.f289576b + ", isToolbarVisible=" + this.f289577c + ", isInitial=" + this.f289578d + ", lastApiError=null, loadingState=" + this.f289579e + ", bannerState=" + this.f289580f + ", filterParams=" + this.f289581g + ", mainItems=" + this.f289582h + ", viewState=" + this.f289583i + ')';
    }
}
