package com.avito.android.beduin.context;

import Gh.C13880a;
import Ju.InterfaceC14249c;
import Ui.InterfaceC15522a;
import Ui.InterfaceC15523b;
import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.view.C23034e0;
import androidx.view.InterfaceC23040h0;
import cj.InterfaceC27204b;
import cj.InterfaceC27205c;
import cj.InterfaceC27207e;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.actionhandler.Q0;
import com.avito.android.beduin.common.actionhandler.S0;
import com.avito.android.beduin.common.analytics.f;
import com.avito.android.beduin.common.utils.l;
import com.avito.android.beduin.context.di.i;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.action.custom.BeduinScrollPosition;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.SearchParams;
import dj.InterfaceC39736a;
import dj.InterfaceC39737b;
import gj.C40692c;
import gj.InterfaceC40691b;
import gj.j;
import hj.AbstractC40946b;
import hj.InterfaceC40947c;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import ji.InterfaceC42385a;
import kj.C42699b;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kv.C43501a;
import l41.g;
import l41.o;
import lj.InterfaceC43779a;
import mj.InterfaceC44087a;
import nj.InterfaceC44433a;
import oj.InterfaceC44784a;
import pj.C47101d;
import pj.InterfaceC47100c;

/* compiled from: BeduinContextImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/context/c;", "Lgj/b;", "Lcom/avito/android/beduin/common/analytics/f;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements InterfaceC40691b, f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC47100c f103555a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f103556b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.context.di.a f103557c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Provider<InterfaceC43779a> f103558d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f103559e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC44784a<BeduinModel> f103560f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.a f103561g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC39737b f103562h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Set<InterfaceC42385a> f103563i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final InterfaceC44433a f103564j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.form.store.b f103565k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final lj.c f103566l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final InterfaceC15522a f103567m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final InterfaceC44087a f103568n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final InterfaceC27205c f103569o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final InterfaceC27207e f103570p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final InterfaceC27204b f103571q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public C47101d f103572r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final z<com.avito.android.beduin_shared.model.action.custom.d> f103573s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.deeplink_processor.e f103574t;

    /* compiled from: BeduinContextImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            List<InterfaceC43779a> listV;
            InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
            if (interfaceC14249c instanceof InterfaceC40947c) {
                AbstractC40946b abstractC40946bA = ((InterfaceC40947c) interfaceC14249c).a();
                c cVar = c.this;
                com.avito.android.beduin.common.form.store.b bVar = cVar.f103565k;
                if (abstractC40946bA instanceof AbstractC40946b.a) {
                    cVar.o(null);
                    return;
                }
                if (abstractC40946bA instanceof AbstractC40946b.C11269b) {
                    throw null;
                }
                if (abstractC40946bA instanceof AbstractC40946b.c) {
                    AbstractC40946b.c cVar2 = (AbstractC40946b.c) abstractC40946bA;
                    AbstractC40946b.c.a.C11270a c11270a = AbstractC40946b.c.a.C11270a.f397376a;
                    AbstractC40946b.c.a.C11271b c11271b = cVar2.f397374b;
                    if (L.f(c11271b, c11270a)) {
                        listV = bVar.getAll();
                    } else {
                        if (c11271b == null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        listV = C42745f0.V(bVar.get(c11271b.f397377a));
                    }
                    Iterator<T> it = listV.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC43779a) it.next()).h(cVar2.f397375c);
                    }
                }
            }
        }
    }

    /* compiled from: BeduinContextImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f103576b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l lVar) {
            this.f103576b = (N) lVar;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f103576b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f103576b;
        }

        public final int hashCode() {
            return this.f103576b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f103576b.invoke(obj);
        }
    }

    /* compiled from: BeduinContextImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/Q0$a;", "it", "Lcom/avito/android/beduin_shared/model/action/custom/e;", "apply", "(Lcom/avito/android/beduin/common/actionhandler/Q0$a;)Lcom/avito/android/beduin_shared/model/action/custom/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.beduin.context.c$c, reason: collision with other inner class name */
    public static final class C3105c<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final C3105c<T, R> f103577b = new C3105c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            BeduinScrollPosition beduinScrollPosition;
            Q0.a aVar = (Q0.a) obj;
            switch (l.a.f103528a[aVar.f100121d.ordinal()]) {
                case 1:
                    beduinScrollPosition = BeduinScrollPosition.f105279b;
                    break;
                case 2:
                    beduinScrollPosition = BeduinScrollPosition.f105280c;
                    break;
                case 3:
                    beduinScrollPosition = BeduinScrollPosition.f105281d;
                    break;
                case 4:
                    beduinScrollPosition = BeduinScrollPosition.f105282e;
                    break;
                case 5:
                    beduinScrollPosition = BeduinScrollPosition.f105283f;
                    break;
                case 6:
                    beduinScrollPosition = BeduinScrollPosition.f105284g;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return new com.avito.android.beduin_shared.model.action.custom.e(aVar.f100118a, aVar.f100119b, aVar.f100120c, beduinScrollPosition, aVar.f100122e);
        }
    }

    /* compiled from: BeduinContextImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/S0$a;", "it", "Lcom/avito/android/beduin_shared/model/action/custom/f;", "apply", "(Lcom/avito/android/beduin/common/actionhandler/S0$a;)Lcom/avito/android/beduin_shared/model/action/custom/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T, R> f103578b = new d<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            S0.a aVar = (S0.a) obj;
            return new com.avito.android.beduin_shared.model.action.custom.f(aVar.f100129a, aVar.f100130b, aVar.f100131c);
        }
    }

    public c(@k InterfaceC47100c interfaceC47100c, @k com.avito.android.beduin.context.di.b bVar, @k Set<? extends gj.f<?>> set, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k a.b bVar2, @k C40692c c40692c, @Y61.l SearchParams searchParams, @k C42699b c42699b) {
        this.f103555a = interfaceC47100c;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f103556b = cVar;
        com.avito.android.beduin.context.di.a aVarA = i.a().a(bVar, set, aVar, bVar2, this, cVar, c40692c, searchParams, new C13880a(bVar.Se(), c42699b));
        this.f103557c = aVarA;
        this.f103558d = aVarA.n();
        this.f103559e = aVarA.f();
        this.f103560f = aVarA.x();
        this.f103561g = aVarA.m();
        this.f103562h = aVarA.w();
        this.f103563i = aVarA.k();
        com.avito.android.beduin.common.form.actionbus.b bVarB = aVarA.b();
        this.f103564j = bVarB;
        this.f103565k = aVarA.p();
        this.f103566l = aVarA.h();
        this.f103567m = aVarA.e();
        this.f103568n = aVarA.i();
        this.f103569o = aVarA.d();
        this.f103570p = aVarA.c();
        this.f103571q = aVarA.s();
        this.f103573s = z.g0(aVarA.q().f100117b.d0(C3105c.f103577b), aVarA.v().f100128c.d0(d.f103578b));
        this.f103574t = new com.avito.android.beduin.common.deeplink_processor.e(aVarA.f(), aVarA.j(), aVarA.t(), aVarA.o(), aVarA.u());
        bVarB.f103325b.b(bVarB.f103329f);
        cVar.b(aVarA.j().d9().t0(new a()));
    }

    @Override // gj.InterfaceC40691b
    @k
    public final InterfaceC39736a B0() {
        return this.f103562h.F();
    }

    @Override // gj.InterfaceC40691b
    @k
    public final j a() {
        return this.f103557c.a();
    }

    @Override // gj.InterfaceC40691b
    @k
    /* renamed from: b, reason: from getter */
    public final InterfaceC44433a getF103564j() {
        return this.f103564j;
    }

    @Override // gj.InterfaceC40691b
    @k
    /* renamed from: c, reason: from getter */
    public final InterfaceC27207e getF103570p() {
        return this.f103570p;
    }

    @Override // gj.InterfaceC40691b
    @k
    /* renamed from: d, reason: from getter */
    public final InterfaceC27205c getF103569o() {
        return this.f103569o;
    }

    @Override // gj.InterfaceC40691b
    @k
    /* renamed from: e, reason: from getter */
    public final InterfaceC15522a getF103567m() {
        return this.f103567m;
    }

    @Override // gj.InterfaceC40691b
    @k
    public final InterfaceC15523b<BeduinAction> f() {
        return this.f103559e;
    }

    @Override // gj.InterfaceC40691b
    public final void g(@k Screen screen) {
        this.f103562h.g(screen);
    }

    @Override // gj.InterfaceC40691b
    @k
    /* renamed from: h, reason: from getter */
    public final lj.c getF103566l() {
        return this.f103566l;
    }

    @Override // gj.InterfaceC40691b
    @k
    /* renamed from: i, reason: from getter */
    public final InterfaceC44087a getF103568n() {
        return this.f103568n;
    }

    @Override // gj.InterfaceC40691b
    @k
    public final InterfaceC43779a j() {
        return this.f103558d.get();
    }

    @Override // gj.InterfaceC40691b
    @k
    public final z<com.avito.android.beduin_shared.model.action.custom.d> k() {
        return this.f103573s;
    }

    @Override // com.avito.android.beduin.common.analytics.f
    @k
    public final InterfaceC47100c l() {
        C47101d c47101d = this.f103572r;
        return c47101d == null ? this.f103555a : c47101d;
    }

    @Override // oj.InterfaceC44784a
    @k
    public final Map<String, Object> m(@k BeduinModel beduinModel) {
        return this.f103560f.m(beduinModel);
    }

    @Override // com.avito.android.beduin.common.analytics.f
    public final void n(@k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f103572r = new C47101d(screenPerformanceTracker);
    }

    @Override // Ui.InterfaceC15523b
    public final void o(@k BeduinAction beduinAction) {
        this.f103559e.o(beduinAction);
    }

    @Override // gj.InterfaceC40691b
    public final void onCleared() {
        this.f103564j.b();
        this.f103561g.dispose();
        this.f103574t.onCleared();
        Iterator<T> it = this.f103563i.iterator();
        while (it.hasNext()) {
            ((InterfaceC42385a) it.next()).onCleared();
        }
        this.f103556b.e();
    }

    @Override // gj.InterfaceC40691b
    /* renamed from: p, reason: from getter */
    public final com.avito.android.beduin.common.deeplink_processor.e getF103574t() {
        return this.f103574t;
    }

    @Override // gj.InterfaceC40691b
    @k
    public final C41981q0 q() {
        return this.f103561g.f99962l;
    }

    @Override // gj.InterfaceC40691b
    /* renamed from: r, reason: from getter */
    public final com.avito.android.beduin.common.form.store.b getF103565k() {
        return this.f103565k;
    }

    @Override // gj.InterfaceC40691b
    @k
    public final C23034e0 s(@k Context context) {
        C23034e0 c23034e0 = new C23034e0();
        com.avito.android.beduin.context.di.a aVar = this.f103557c;
        c23034e0.a(aVar.r().f100199b, new b(new com.avito.android.beduin.context.d(c23034e0)));
        c23034e0.a(aVar.l().f100202b, new b(new e(c23034e0, context, this)));
        return c23034e0;
    }
}
