package com.avito.android.str_seller_orders.strsellerordersrange.mvi.entity;

import Fz0.c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.StrSellerOrder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersRangeState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/entity/StrSellerOrdersRangeState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "LoadingState", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StrSellerOrdersRangeState extends q {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f290277j = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f290278b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f290279c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f290280d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f290281e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<StrSellerOrder> f290282f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Throwable f290283g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final c f290284h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final LoadingState f290285i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StrSellerOrdersRangeState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/entity/StrSellerOrdersRangeState$LoadingState;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingState {

        /* renamed from: b, reason: collision with root package name */
        public static final LoadingState f290286b;

        /* renamed from: c, reason: collision with root package name */
        public static final LoadingState f290287c;

        /* renamed from: d, reason: collision with root package name */
        public static final LoadingState f290288d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ LoadingState[] f290289e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f290290f;

        static {
            LoadingState loadingState = new LoadingState("LOADING", 0);
            f290286b = loadingState;
            LoadingState loadingState2 = new LoadingState("LOADED", 1);
            f290287c = loadingState2;
            LoadingState loadingState3 = new LoadingState("ERROR", 2);
            f290288d = loadingState3;
            LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3};
            f290289e = loadingStateArr;
            f290290f = kotlin.enums.c.a(loadingStateArr);
        }

        public LoadingState() {
            throw null;
        }

        public static LoadingState valueOf(String str) {
            return (LoadingState) Enum.valueOf(LoadingState.class, str);
        }

        public static LoadingState[] values() {
            return (LoadingState[]) f290289e.clone();
        }
    }

    /* compiled from: StrSellerOrdersRangeState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/entity/StrSellerOrdersRangeState$a;", "", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public StrSellerOrdersRangeState(@k String str, @k String str2, @k String str3, @l String str4, @k List<StrSellerOrder> list, @l Throwable th2, @l c cVar, @k LoadingState loadingState) {
        this.f290278b = str;
        this.f290279c = str2;
        this.f290280d = str3;
        this.f290281e = str4;
        this.f290282f = list;
        this.f290283g = th2;
        this.f290284h = cVar;
        this.f290285i = loadingState;
    }

    public static StrSellerOrdersRangeState a(StrSellerOrdersRangeState strSellerOrdersRangeState, String str, List list, Throwable th2, c cVar, LoadingState loadingState, int i12) {
        String str2 = strSellerOrdersRangeState.f290278b;
        String str3 = strSellerOrdersRangeState.f290279c;
        String str4 = strSellerOrdersRangeState.f290280d;
        if ((i12 & 8) != 0) {
            str = strSellerOrdersRangeState.f290281e;
        }
        String str5 = str;
        if ((i12 & 16) != 0) {
            list = strSellerOrdersRangeState.f290282f;
        }
        List list2 = list;
        if ((i12 & 32) != 0) {
            th2 = strSellerOrdersRangeState.f290283g;
        }
        Throwable th3 = th2;
        if ((i12 & 64) != 0) {
            cVar = strSellerOrdersRangeState.f290284h;
        }
        c cVar2 = cVar;
        if ((i12 & 128) != 0) {
            loadingState = strSellerOrdersRangeState.f290285i;
        }
        strSellerOrdersRangeState.getClass();
        return new StrSellerOrdersRangeState(str2, str3, str4, str5, list2, th3, cVar2, loadingState);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrSellerOrdersRangeState)) {
            return false;
        }
        StrSellerOrdersRangeState strSellerOrdersRangeState = (StrSellerOrdersRangeState) obj;
        return L.f(this.f290278b, strSellerOrdersRangeState.f290278b) && L.f(this.f290279c, strSellerOrdersRangeState.f290279c) && L.f(this.f290280d, strSellerOrdersRangeState.f290280d) && L.f(this.f290281e, strSellerOrdersRangeState.f290281e) && L.f(this.f290282f, strSellerOrdersRangeState.f290282f) && L.f(this.f290283g, strSellerOrdersRangeState.f290283g) && L.f(this.f290284h, strSellerOrdersRangeState.f290284h) && this.f290285i == strSellerOrdersRangeState.f290285i;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f290278b.hashCode() * 31, 31, this.f290279c), 31, this.f290280d);
        String str = this.f290281e;
        int iE2 = H.e((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f290282f);
        Throwable th2 = this.f290283g;
        int iHashCode = (iE2 + (th2 == null ? 0 : th2.hashCode())) * 31;
        c cVar = this.f290284h;
        return this.f290285i.hashCode() + ((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "StrSellerOrdersRangeState(startDate=" + this.f290278b + ", endDate=" + this.f290279c + ", itemId=" + this.f290280d + ", title=" + this.f290281e + ", loadedOrders=" + this.f290282f + ", error=" + this.f290283g + ", viewState=" + this.f290284h + ", loadingState=" + this.f290285i + ')';
    }
}
