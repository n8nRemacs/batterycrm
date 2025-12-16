package ru.avito.messenger.internal.state_machine;

import Y61.k;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.operators.flowable.S;
import io.reactivex.rxjava3.internal.operators.observable.L;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.Objects;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;
import l41.o;
import m91.InterfaceC43936c;
import ru.avito.messenger.internal.state_machine.g;

/* compiled from: SequentialStateMachine.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/messenger/internal/state_machine/e;", "", "S", "Lru/avito/messenger/internal/state_machine/g;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class e<S> implements g<S> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f431781a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final H f431782b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC43936c f431783c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.d<S> f431784d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.d<g.a<S>> f431785e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f431786f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f431787g;

    /* compiled from: SequentialStateMachine.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "S", "Lru/avito/messenger/internal/state_machine/g$a;", "mutator", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lru/avito/messenger/internal/state_machine/g$a;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e<S> f431788b;

        public a(e<S> eVar) {
            this.f431788b = eVar;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            e<S> eVar = this.f431788b;
            C42026y c42026yN = eVar.f431784d.S().n(new ru.avito.messenger.internal.state_machine.b((g.a) obj, eVar));
            final com.jakewharton.rxrelay3.d<S> dVar = eVar.f431784d;
            return c42026yN.k(new l41.g() { // from class: ru.avito.messenger.internal.state_machine.c
                @Override // l41.g
                public final void accept(@k Object obj2) {
                    dVar.accept(obj2);
                }
            }).k(new d(eVar));
        }
    }

    /* compiled from: SequentialStateMachine.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "S", "", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e<S> f431789b;

        public b(e<S> eVar) {
            this.f431789b = eVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            e<S> eVar = this.f431789b;
            eVar.f431783c.e(eVar.f431786f, "Mutator handling terminated with error", (Throwable) obj);
        }
    }

    public e(@k S s5, @k InterfaceC43936c interfaceC43936c, @k H h12, @k String str) {
        this.f431781a = new Object();
        this.f431785e = C31685o.m();
        this.f431787g = new io.reactivex.rxjava3.disposables.c();
        this.f431782b = h12;
        this.f431783c = interfaceC43936c;
        this.f431786f = str;
        this.f431784d = (com.jakewharton.rxrelay3.d<S>) com.jakewharton.rxrelay3.b.N0(s5).M0();
    }

    @Override // ru.avito.messenger.internal.state_machine.g
    @k
    public final L M0() {
        return this.f431784d.B(f.f431790a);
    }

    @Override // ru.avito.messenger.internal.state_machine.g
    public final void a(@k g.a<S> aVar) {
        synchronized (this.f431781a) {
            try {
                if (this.f431787g.f401978c) {
                    this.f431783c.a(this.f431786f, "Already shut down, command won't be processed.", null);
                } else if (this.f431787g.g() < 1) {
                    throw new IllegalStateException("State machine has not been started");
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f431785e.accept(aVar);
    }

    @Override // ru.avito.messenger.internal.state_machine.g
    public final void start() {
        synchronized (this.f431781a) {
            if (this.f431787g.f401978c) {
                throw new IllegalStateException("State machine has already been shut down");
            }
            this.f431787g.e();
            AbstractC41777j<T> abstractC41777jG0 = this.f431785e.x0(this.f431782b).j0(this.f431782b).G0(BackpressureStrategy.f401953b);
            a aVar = new a(this);
            io.reactivex.rxjava3.internal.functions.b.a(2, "prefetch");
            io.reactivex.rxjava3.internal.operators.mixed.h hVar = new io.reactivex.rxjava3.internal.operators.mixed.h(abstractC41777jG0, aVar, ErrorMode.f404819b);
            b bVar = new b(this);
            l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
            InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
            Objects.requireNonNull(gVar, "onNext is null");
            Objects.requireNonNull(interfaceC43543a, "onComplete is null");
            this.f431787g.b(new S(hVar, gVar, bVar, interfaceC43543a, interfaceC43543a).p(gVar, io.reactivex.rxjava3.internal.functions.a.f401996f, interfaceC43543a));
            this.f431783c.a(this.f431786f, "Started", null);
            G0 g02 = G0.f406611a;
        }
    }

    public e(Object obj, InterfaceC43936c interfaceC43936c, H h12, String str, int i12, C42822w c42822w) {
        this(obj, interfaceC43936c, (i12 & 4) != 0 ? new hu.akarnokd.rxjava3.schedulers.c(io.reactivex.rxjava3.schedulers.b.f404943c) : h12, (i12 & 8) != 0 ? "StateMachine" : str);
    }

    public e(InterfaceC43936c interfaceC43936c, H h12, String str, int i12, C42822w c42822w) {
        h12 = (i12 & 2) != 0 ? new hu.akarnokd.rxjava3.schedulers.c(io.reactivex.rxjava3.schedulers.b.f404943c) : h12;
        str = (i12 & 4) != 0 ? "StateMachine" : str;
        this.f431781a = new Object();
        this.f431785e = C31685o.m();
        this.f431787g = new io.reactivex.rxjava3.disposables.c();
        this.f431782b = h12;
        this.f431783c = interfaceC43936c;
        this.f431786f = str;
        this.f431784d = (com.jakewharton.rxrelay3.d<S>) new com.jakewharton.rxrelay3.b().M0();
    }
}
