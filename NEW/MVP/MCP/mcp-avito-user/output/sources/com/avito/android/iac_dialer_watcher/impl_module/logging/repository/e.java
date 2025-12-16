package com.avito.android.iac_dialer_watcher.impl_module.logging.repository;

import com.avito.android.analytics.clickstream.D;
import com.avito.android.iac_dialer_watcher.impl_module.db.C;
import com.avito.android.iac_dialer_watcher.impl_module.db.InterfaceC30891a;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.completable.M;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import io.reactivex.rxjava3.internal.operators.single.G;
import io.reactivex.rxjava3.internal.operators.single.O;
import io.reactivex.rxjava3.internal.operators.single.S;
import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacLogRepository.kt */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/e;", "", "a", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f167908g = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30891a f167909a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f167910b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer_watcher.impl_module.logging.q f167911c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AtomicLong f167912d = new AtomicLong(0);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f167913e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorService f167914f = Executors.newSingleThreadExecutor(new D(5));

    /* compiled from: IacLogRepository.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/e$a;", "", "<init>", "()V", "", "MAX_TOTAL_LINES_THRESHOLD", "J", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public e(@Y61.k InterfaceC30891a interfaceC30891a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.iac_dialer_watcher.impl_module.logging.q qVar) {
        this.f167909a = interfaceC30891a;
        this.f167910b = interfaceC35745a5;
        this.f167911c = qVar;
    }

    @Y61.k
    public final C42026y a(long j12) {
        return j(this.f167909a.m(j12)).n(new h(this, j12)).n(new j(this, j12));
    }

    @Y61.k
    public final O b() {
        return k(this.f167909a.c(), (Serializable) P0.c()).r(l.f167923b);
    }

    @Y61.k
    public final O c() {
        return k(this.f167909a.d(), C42784z0.f406748b).r(m.f167924b);
    }

    @Y61.k
    public final O d(long j12) {
        return k(this.f167909a.a(j12), C42784z0.f406748b).r(n.f167925b);
    }

    @Y61.k
    public final O e(long j12) {
        return k(this.f167909a.g(j12), C42784z0.f406748b).r(p.f167927b);
    }

    @Y61.k
    public final O f(long j12, long j13, long j14) {
        return k(this.f167909a.l(j12, j13, j14), C42784z0.f406748b).r(o.f167926b);
    }

    @Y61.k
    public final O g(long j12, long j13, @Y61.k String str) {
        return j(this.f167909a.i(j12, j13, str)).r(new q(this));
    }

    @Y61.k
    public final O h(long j12) {
        C c12 = new C(0L, j12, "", 1, null);
        return (this.f167912d.get() == 0 ? k(this.f167909a.h(), 300000L).r(new t(this)) : I.q(G0.f406611a)).n(new r(this, c12)).r(new s(c12));
    }

    public final boolean i() {
        return this.f167912d.get() >= 300000;
    }

    public final S j(AbstractC41768a abstractC41768a) {
        I iU2;
        boolean z12 = this.f167913e.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f167910b;
        if (z12) {
            iU2 = new G(new c(0));
        } else {
            M mX2 = abstractC41768a.x(interfaceC35745a5.g(this.f167914f));
            G0 g02 = G0.f406611a;
            iU2 = mX2.B(g02).u(new d(0, this, g02));
        }
        return iU2.s(interfaceC35745a5.a());
    }

    public final S k(I i12, Serializable serializable) {
        boolean z12 = this.f167913e.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f167910b;
        return (z12 ? new G(new VH0.c(serializable)) : i12.z(interfaceC35745a5.g(this.f167914f)).u(new d(0, this, serializable))).s(interfaceC35745a5.a());
    }
}
