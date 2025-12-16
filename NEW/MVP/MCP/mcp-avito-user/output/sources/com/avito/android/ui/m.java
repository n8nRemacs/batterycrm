package com.avito.android.ui;

import cK.InterfaceC27058a;
import com.avito.android.account.G;
import com.avito.android.di.InterfaceC29975l;
import com.avito.android.remote.notification.M;
import com.avito.android.saved_searches.model.SubscriptionUnreadCount;
import com.avito.android.util.rx3.C35896f0;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.C41988t;
import io.reactivex.rxjava3.internal.operators.observable.U;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.rx3.y;
import vm.InterfaceC49346a;

/* compiled from: UserProfileStatusDataProviderImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/m;", "Lcom/avito/android/ui/i;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public class m implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final G f304632a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final M f304633b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.common.a f304634c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.notification_center.counter.f f304635d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.calltracking_core.f f304636e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27058a f304637f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final W40.a f304638g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49346a f304639h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sales_items.a f304640i;

    /* renamed from: j, reason: collision with root package name */
    public long f304641j;

    /* compiled from: Observables.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\t\u0010\t\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com/avito/android/util/rx3/J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T1, T2, R> implements l41.c {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.c
        @Y61.k
        public final R apply(@Y61.k T1 t12, @Y61.k T2 t22) {
            return (R) Integer.valueOf(((Number) t12).intValue() + ((Number) t22).intValue());
        }
    }

    public m(@Y61.k G g12, @Y61.k M m12, @InterfaceC29975l @Y61.k com.avito.android.common.a aVar, @Y61.k com.avito.android.notification_center.counter.f fVar, @Y61.k com.avito.android.calltracking_core.f fVar2, @Y61.k InterfaceC27058a interfaceC27058a, @Y61.k W40.a aVar2, @Y61.k InterfaceC49346a interfaceC49346a, @Y61.k com.avito.android.sales_items.a aVar3) {
        this.f304632a = g12;
        this.f304633b = m12;
        this.f304634c = aVar;
        this.f304635d = fVar;
        this.f304636e = fVar2;
        this.f304637f = interfaceC27058a;
        this.f304638g = aVar2;
        this.f304639h = interfaceC49346a;
        this.f304640i = aVar3;
    }

    @Override // com.avito.android.ui.i
    @Y61.k
    public final B0 a() {
        return this.f304633b.c().d0(n.f304642b);
    }

    @Override // com.avito.android.ui.i
    @Y61.k
    public final B0 b() {
        return this.f304633b.b().d0(j.f304629b);
    }

    @Override // com.avito.android.ui.i
    public final void c() {
        this.f304640i.c(false);
    }

    @Override // com.avito.android.ui.i
    public final boolean d() {
        return this.f304632a.i().f68044a.b();
    }

    @Override // com.avito.android.ui.i
    @Y61.k
    public final z<Integer> e() {
        return this.f304638g.a();
    }

    @Override // com.avito.android.ui.i
    @Y61.k
    public final z<Integer> f() {
        return z.k(this.f304636e.b(), y.b(this.f304637f.a()), new a());
    }

    @Override // com.avito.android.ui.i
    @Y61.k
    public final B0 g() {
        return this.f304635d.getCount().d0(o.f304643b);
    }

    @Override // com.avito.android.ui.i
    @Y61.k
    public final z<Integer> h() {
        return this.f304639h.a();
    }

    @Override // com.avito.android.ui.i
    public final void i() {
        this.f304633b.a();
    }

    @Override // com.avito.android.ui.i
    @Y61.k
    public final z<SubscriptionUnreadCount> j() {
        this.f304634c.c(false);
        if (System.currentTimeMillis() - this.f304641j <= p.f304644a || !this.f304632a.b()) {
            return U.f403867b;
        }
        this.f304641j = System.currentTimeMillis();
        return this.f304633b.d();
    }

    @Override // com.avito.android.ui.i
    @Y61.k
    public final C41988t k() {
        return C35896f0.a(k.f304630l, C42745f0.j(this.f304633b.e().d0(l.f304631b), this.f304634c.getF123751f(), this.f304640i.getF258214h()));
    }
}
