package com.avito.android.lib.compose.design.shared.benchmark;

import android.os.Bundle;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.compose.q;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.ServiceLoader;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BenchmarkComposeActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/compose/design/shared/benchmark/BenchmarkComposeActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_design-modules_compose_shared_benchmark_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BenchmarkComposeActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final a f177609p = new a(null);

    /* renamed from: n, reason: collision with root package name */
    public ScreenPerformanceTracker f177611n;

    /* renamed from: m, reason: collision with root package name */
    public final ServiceLoader<U2.b> f177610m = ServiceLoader.load(U2.b.class);

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f177612o = C42727D.c(new b());

    /* compiled from: BenchmarkComposeActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/compose/design/shared/benchmark/BenchmarkComposeActivity$a;", "", "<init>", "()V", "", "COMPONENT_NAME_EXTRA", "Ljava/lang/String;", "_design-modules_compose_shared_benchmark_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BenchmarkComposeActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = BenchmarkComposeActivity.this.f177611n;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: BenchmarkComposeActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List<U2.b> f177615m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C42784z0 f177616n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, C42784z0 c42784z0) {
            super(2);
            this.f177615m = list;
            this.f177616n = c42784z0;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                q.b((com.avito.android.analytics.screens.compose.a) BenchmarkComposeActivity.this.f177612o.getValue(), r.c(-953572879, new com.avito.android.lib.compose.design.shared.benchmark.a(this.f177615m, this.f177616n), a13), a13, 48);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BenchmarkComposeActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ U2.b f177618m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C42784z0 f177619n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f177620o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(U2.b bVar, C42784z0 c42784z0, String str) {
            super(2);
            this.f177618m = bVar;
            this.f177619n = c42784z0;
            this.f177620o = str;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                q.b((com.avito.android.analytics.screens.compose.a) BenchmarkComposeActivity.this.f177612o.getValue(), r.c(-564582136, new com.avito.android.lib.compose.design.shared.benchmark.b(this.f177618m, this.f177620o, this.f177619n), a13), a13, 48);
            }
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.analytics.screens.tracker.F fA3 = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b().a(new C28478k(BenchmarkComposeScreen.f177622d, s.a(this), null, 4, null));
        this.f177611n = fA3;
        fA3.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker = this.f177611n;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.c(this, Q1());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f177611n;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        String stringExtra = getIntent().getStringExtra("component_name");
        C42784z0 c42784z0 = C42784z0.f406748b;
        ServiceLoader<U2.b> serviceLoader = this.f177610m;
        if (stringExtra != null) {
            Iterator<U2.b> it = serviceLoader.iterator();
            while (it.hasNext()) {
                U2.b next = it.next();
                if (L.f(next.d(), stringExtra)) {
                    androidx.view.compose.j.a(this, new C22096n(2074413672, new d(next, c42784z0, stringExtra), true));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        androidx.view.compose.j.a(this, new C22096n(1090693969, new c(C42745f0.M0(serviceLoader), c42784z0), true));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f177611n;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }
}
