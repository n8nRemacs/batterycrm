package com.avito.android.screens.bbip.ui;

import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bbip_common.BbipPerfScreen;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.mnz_common.data.MnzFloatingFooterContacts;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.screens.bbip.ui.items.budget.b;
import com.avito.android.util.ApiException;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;
import np0.InterfaceC44461a;
import op0.C44840b;
import op0.d;
import op0.e;
import op0.g;
import pp0.C47123a;

/* compiled from: BbipViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip/ui/l;", "Lcom/avito/android/screens/bbip/ui/k;", "Landroidx/lifecycle/M0;", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l extends M0 implements com.avito.android.screens.bbip.ui.k {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.screens.bbip.ui.g f260403E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f260404J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44461a f260405K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f260406L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f260407M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final ZK0.a f260408N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public AtomicReference f260409O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public AtomicReference f260410P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public AtomicReference f260411Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f260412R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final C23038g0<op0.e> f260413S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public op0.h f260414T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public C44840b f260415U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.l
    public DeepLink f260416V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.l
    public DeepLink f260417W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.l
    public String f260418X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.l
    public String f260419Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f260420Z;

    /* compiled from: BbipViewModel.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip/ui/l$a;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        l a(@InterfaceC41220a @Y61.k String str, @InterfaceC41220a @Y61.k String str2);
    }

    /* compiled from: BbipViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljh/n;", "result", "Lkotlin/Q;", "", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "apply", "(Ljh/n;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            jh.n nVar = (jh.n) obj;
            l lVar = l.this;
            return new Q(lVar.f260405K.d(lVar.f260414T.f420219a, nVar), nVar.getContact());
        }
    }

    /* compiled from: BbipViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            l lVar = l.this;
            ScreenPerformanceTracker screenPerformanceTracker = lVar.f260406L;
            BbipPerfScreen.f99057d.getClass();
            ScreenPerformanceTracker.a.b(screenPerformanceTracker, BbipPerfScreen.f99058e, 2);
            lVar.f260413S.setValue(new e.b(false, null, 3, null));
        }
    }

    /* compiled from: BbipViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            l lVar = l.this;
            ScreenPerformanceTracker screenPerformanceTracker = lVar.f260406L;
            BbipPerfScreen.f99057d.getClass();
            ScreenPerformanceTracker.a.b(screenPerformanceTracker, BbipPerfScreen.f99059f, 2);
            lVar.f260413S.setValue(new e.b(true, null, 2, null));
        }
    }

    /* compiled from: BbipViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Integer f260429c;

        public i(Integer num) {
            this.f260429c = num;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            l.this.f260413S.setValue(new e.b(false, this.f260429c, 1, null));
        }
    }

    @i31.c
    public l(@InterfaceC41220a @Y61.k String str, @InterfaceC41220a @Y61.k String str2, @Y61.k com.avito.android.screens.bbip.ui.g gVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC44461a interfaceC44461a, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k ZK0.a aVar2) {
        this.f260403E = gVar;
        this.f260404J = interfaceC35745a5;
        this.f260405K = interfaceC44461a;
        this.f260406L = screenPerformanceTracker;
        this.f260407M = aVar;
        this.f260408N = aVar2;
        Runnable runnable = io.reactivex.rxjava3.internal.functions.a.f401992b;
        this.f260409O = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(runnable);
        this.f260410P = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(runnable);
        this.f260411Q = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(runnable);
        this.f260412R = new io.reactivex.rxjava3.disposables.c();
        C23038g0<op0.e> c23038g0 = new C23038g0<>();
        this.f260413S = c23038g0;
        this.f260414T = new op0.h(null, null, null, null, null, null, 63, null);
        this.f260415U = new C44840b(str, str2, null, null, 12, null);
        this.f260420Z = c23038g0;
        le();
    }

    public static boolean ne(List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof com.avito.android.screens.bbip.ui.items.forecast.a) {
                break;
            }
        }
        if (!(next instanceof com.avito.android.screens.bbip.ui.items.forecast.a)) {
            next = null;
        }
        com.avito.android.screens.bbip.ui.items.forecast.a aVar = (com.avito.android.screens.bbip.ui.items.forecast.a) next;
        return ((aVar != null ? aVar.f260375d : null) == null || aVar.f260377f == null) ? false : true;
    }

    @Override // com.avito.android.screens.bbip.ui.k
    public final void Ea(@Y61.k DeepLink deepLink) {
        this.f260408N.a(this.f260419Y);
        b.a.a(this.f260407M, deepLink, null, null, 6);
    }

    @Override // com.avito.android.screens.bbip.ui.k
    public final void F2() {
        if (this.f260414T.f420219a.isEmpty()) {
            return;
        }
        C23038g0<op0.e> c23038g0 = this.f260413S;
        op0.e value = c23038g0.getValue();
        e.a aVar = value instanceof e.a ? (e.a) value : null;
        if (!((aVar != null ? aVar.f420205a : null) instanceof d.c)) {
            c23038g0.setValue(new e.c(this.f260414T));
        } else if (c23038g0.getValue() instanceof e.b) {
            c23038g0.setValue(new e.c(this.f260414T));
        }
    }

    @Override // com.avito.android.screens.bbip.ui.k
    public final void M5(@Y61.k op0.d dVar) {
        if (dVar instanceof d.c) {
            le();
        } else if (dVar instanceof d.a) {
            ke();
        }
    }

    @Override // com.avito.android.screens.bbip.ui.k
    public final void O8() {
        DeepLink deepLink = this.f260416V;
        if (deepLink != null) {
            b.a.a(this.f260407M, deepLink, null, null, 6);
        }
    }

    @Override // com.avito.android.screens.bbip.ui.k
    public final void Sc() {
        DeepLink deepLink = this.f260417W;
        if (deepLink != null) {
            b.a.a(this.f260407M, deepLink, null, null, 6);
        }
    }

    @Override // com.avito.android.screens.bbip.ui.k
    public final void a(@Y61.k Set<? extends TV0.d<?, ?>> set) {
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            boolean z12 = dVar instanceof com.avito.android.screens.bbip.ui.items.budget.e;
            InterfaceC35745a5 interfaceC35745a5 = this.f260404J;
            io.reactivex.rxjava3.disposables.c cVar = this.f260412R;
            if (z12) {
                io.reactivex.rxjava3.subjects.e f260321c = ((com.avito.android.screens.bbip.ui.items.budget.e) dVar).getF260321c();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                f260321c.getClass();
                C41982q1 c41982q1X0 = f260321c.y(100L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).x0(interfaceC35745a5.a());
                final InterfaceC44461a interfaceC44461a = this.f260405K;
                cVar.b(c41982q1X0.d0(new l41.o() { // from class: com.avito.android.screens.bbip.ui.m
                    @Override // l41.o
                    public final Object apply(Object obj) {
                        return interfaceC44461a.e((b.a) obj);
                    }
                }).j0(interfaceC35745a5.e()).t0(new n(this)));
            } else if (dVar instanceof com.avito.android.screens.bbip.ui.items.duration.e) {
                io.reactivex.rxjava3.subjects.e f260358c = ((com.avito.android.screens.bbip.ui.items.duration.e) dVar).getF260358c();
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                f260358c.getClass();
                cVar.b(f260358c.y(100L, timeUnit2, io.reactivex.rxjava3.schedulers.b.f404942b).x0(interfaceC35745a5.a()).d0(new o(this)).j0(interfaceC35745a5.e()).t0(new p(this)));
            }
        }
    }

    @Override // com.avito.android.screens.bbip.ui.k
    @Y61.k
    public final AbstractC22991Y<op0.e> getState() {
        return this.f260420Z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void ke() {
        this.f260410P.dispose();
        B0 b0D0 = this.f260403E.b(this.f260415U).d0(new b());
        c cVar = new c();
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        this.f260410P = (AtomicReference) b0D0.J(interfaceC43543a, cVar).j0(this.f260404J.e()).v0(new l41.g() { // from class: com.avito.android.screens.bbip.ui.l.d
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l41.g
            public final void accept(Object obj) {
                Q q12 = (Q) obj;
                l lVar = l.this;
                lVar.getClass();
                BbipPerfScreen.f99057d.getClass();
                String str = BbipPerfScreen.f99058e;
                ScreenPerformanceTracker.a.d(lVar.f260406L, str, null, null, null, 14);
                ScreenPerformanceTracker screenPerformanceTracker = lVar.f260406L;
                screenPerformanceTracker.m(str);
                lVar.me((List) q12.f406619b);
                MnzFloatingFooterContact mnzFloatingFooterContact = (MnzFloatingFooterContact) q12.f406620c;
                op0.h hVar = lVar.f260414T;
                MnzFloatingFooter mnzFloatingFooter = hVar.f420224f;
                if (mnzFloatingFooter != null) {
                    MnzFloatingFooterContacts contacts = mnzFloatingFooter.getContacts();
                    lVar.f260414T = op0.h.a(hVar, null, null, null, null, null, MnzFloatingFooter.a(mnzFloatingFooter, contacts != null ? MnzFloatingFooterContacts.a(contacts, mnzFloatingFooterContact) : null), 31);
                    C23038g0<op0.e> c23038g0 = lVar.f260413S;
                    c23038g0.getValue();
                    c23038g0.setValue(new e.c(lVar.f260414T));
                }
                ScreenPerformanceTracker.a.c(screenPerformanceTracker, str, null, null, 6);
            }
        }, new l41.g() { // from class: com.avito.android.screens.bbip.ui.l.e
            @Override // l41.g
            public final void accept(Object obj) {
                Throwable th2 = (Throwable) obj;
                l lVar = l.this;
                lVar.getClass();
                V2.f318762a.f(th2);
                BbipPerfScreen.f99057d.getClass();
                String str = BbipPerfScreen.f99058e;
                ScreenPerformanceTracker.a.d(lVar.f260406L, str, null, new J.a(th2), null, 10);
                ScreenPerformanceTracker screenPerformanceTracker = lVar.f260406L;
                screenPerformanceTracker.m(str);
                ApiException apiException = th2 instanceof ApiException ? (ApiException) th2 : null;
                lVar.f260413S.setValue((apiException != null ? apiException.f318522b : null) instanceof ApiError.InternalError ? op0.f.a(th2.getMessage()) : new e.a(new d.c(null, 0, 2, null)));
                ScreenPerformanceTracker.a.c(screenPerformanceTracker, str, new J.a(th2), null, 4);
            }
        }, interfaceC43543a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void le() {
        this.f260409O.dispose();
        B0 b0A = this.f260403E.a(this.f260415U);
        f fVar = new f();
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        this.f260409O = (AtomicReference) b0A.J(interfaceC43543a, fVar).j0(this.f260404J.e()).v0(new l41.g() { // from class: com.avito.android.screens.bbip.ui.l.g
            @Override // l41.g
            public final void accept(Object obj) {
                op0.g gVar = (op0.g) obj;
                l lVar = l.this;
                lVar.getClass();
                BbipPerfScreen.f99057d.getClass();
                String str = BbipPerfScreen.f99059f;
                ScreenPerformanceTracker.a.d(lVar.f260406L, str, null, null, null, 14);
                ScreenPerformanceTracker screenPerformanceTracker = lVar.f260406L;
                screenPerformanceTracker.m(str);
                g.a aVar = gVar.f420210b;
                DeepLink deepLink = aVar.f420218b;
                lVar.f260416V = deepLink;
                g.a aVar2 = gVar.f420212d;
                lVar.f260417W = aVar2.f420218b;
                lVar.f260418X = gVar.f420215g;
                lVar.f260419Y = gVar.f420216h;
                lVar.f260415U = gVar.f420213e;
                lVar.f260414T = op0.h.a(lVar.f260414T, null, null, deepLink == null ? null : aVar.f420217a, gVar.f420211c.f420217a, aVar2.f420217a, gVar.f420214f, 3);
                ArrayList arrayList = gVar.f420209a;
                lVar.me(arrayList);
                ScreenPerformanceTracker.a.c(screenPerformanceTracker, str, null, null, 6);
                if (l.ne(arrayList)) {
                    return;
                }
                lVar.ke();
            }
        }, new l41.g() { // from class: com.avito.android.screens.bbip.ui.l.h
            @Override // l41.g
            public final void accept(Object obj) {
                Throwable th2 = (Throwable) obj;
                l lVar = l.this;
                lVar.getClass();
                V2.f318762a.f(th2);
                BbipPerfScreen.f99057d.getClass();
                String str = BbipPerfScreen.f99059f;
                ScreenPerformanceTracker.a.d(lVar.f260406L, str, null, new J.a(th2), null, 10);
                ScreenPerformanceTracker screenPerformanceTracker = lVar.f260406L;
                screenPerformanceTracker.m(str);
                lVar.f260413S.setValue(new e.a(new d.c(null, 0, 2, null)));
                ScreenPerformanceTracker.a.c(screenPerformanceTracker, str, new J.a(th2), null, 4);
            }
        }, interfaceC43543a);
    }

    public final void me(List<? extends com.avito.conveyor_item.a> list) {
        op0.h hVarA = op0.h.a(this.f260414T, list, C23424o.a(new C47123a(this.f260414T.f420219a, list), true), null, null, null, null, 60);
        this.f260414T = hVarA;
        this.f260413S.setValue(new e.c(hVarA));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r0v2, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // androidx.view.M0
    public final void onCleared() {
        this.f260409O.dispose();
        this.f260410P.dispose();
        this.f260411Q.dispose();
        this.f260412R.dispose();
        super.onCleared();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // com.avito.android.screens.bbip.ui.k
    public final void vc(@Y61.l Integer num) {
        if (!ne(this.f260414T.f420219a)) {
            this.f260413S.setValue(op0.f.a(null));
            return;
        }
        this.f260411Q.dispose();
        z<DeepLinkResponse> zVarC = this.f260403E.c(this.f260415U);
        i iVar = new i(num);
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        this.f260411Q = (AtomicReference) zVarC.J(interfaceC43543a, iVar).j0(this.f260404J.e()).v0(new l41.g() { // from class: com.avito.android.screens.bbip.ui.l.j
            @Override // l41.g
            public final void accept(Object obj) {
                l lVar = l.this;
                lVar.f260408N.a(lVar.f260418X);
                b.a.a(lVar.f260407M, ((DeepLinkResponse) obj).getDeepLink(), null, null, 6);
            }
        }, new l41.g() { // from class: com.avito.android.screens.bbip.ui.l.k
            @Override // l41.g
            public final void accept(Object obj) {
                e.a aVarA;
                Throwable th2 = (Throwable) obj;
                l lVar = l.this;
                lVar.getClass();
                V2.f318762a.f(th2);
                ApiException apiException = th2 instanceof ApiException ? (ApiException) th2 : null;
                ApiError apiError = apiException != null ? apiException.f318522b : null;
                C23038g0<op0.e> c23038g0 = lVar.f260413S;
                if (apiError instanceof ApiError.InternalError) {
                    String message = th2.getMessage();
                    if (message == null || message.length() == 0) {
                        message = null;
                    }
                    aVarA = new e.a(new d.b(message, 0, 2, null));
                } else {
                    aVarA = apiError instanceof ApiError.IncorrectData ? op0.f.a(th2.getMessage()) : new e.a(new d.c(null, 0, 2, null));
                }
                c23038g0.setValue(aVarA);
            }
        }, interfaceC43543a);
    }
}
