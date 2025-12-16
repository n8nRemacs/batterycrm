package pz0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import pz0.InterfaceC47171b;
import pz0.e;

/* compiled from: StrOrdersBuyerState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lpz0/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pz0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C47173d extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f428930d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C47173d f428931e = new C47173d(InterfaceC47171b.c.f428927a, e.c.f428937a);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC47171b f428932b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e f428933c;

    /* compiled from: StrOrdersBuyerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpz0/d$a;", "", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pz0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C47173d(@k InterfaceC47171b interfaceC47171b, @k e eVar) {
        this.f428932b = interfaceC47171b;
        this.f428933c = eVar;
    }

    public static C47173d a(C47173d c47173d, InterfaceC47171b interfaceC47171b, e eVar, int i12) {
        if ((i12 & 1) != 0) {
            interfaceC47171b = c47173d.f428932b;
        }
        if ((i12 & 2) != 0) {
            eVar = c47173d.f428933c;
        }
        c47173d.getClass();
        return new C47173d(interfaceC47171b, eVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47173d)) {
            return false;
        }
        C47173d c47173d = (C47173d) obj;
        return L.f(this.f428932b, c47173d.f428932b) && L.f(this.f428933c, c47173d.f428933c);
    }

    public final int hashCode() {
        return this.f428933c.hashCode() + (this.f428932b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "StrOrdersBuyerState(domainState=" + this.f428932b + ", viewState=" + this.f428933c + ')';
    }
}
