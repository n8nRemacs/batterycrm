package com.avito.android.analytics.inhouse_transport;

import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.observable.U;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ClickStreamPendingTimer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/inhouse_transport/a;", "Lcom/avito/android/analytics/inhouse_transport/o;", "_common_analytics-transport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.inhouse_transport.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28458a implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f90180a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f90181b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public N f90182c;

    /* renamed from: d, reason: collision with root package name */
    public long f90183d = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f90184e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public io.reactivex.rxjava3.core.z<Long> f90185f = U.f403867b;

    /* compiled from: ClickStreamPendingTimer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.analytics.inhouse_transport.a$a, reason: collision with other inner class name */
    public static final class C2673a<T> implements l41.g {
        public C2673a() {
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            ((Number) obj).longValue();
            ?? r12 = C28458a.this.f90182c;
            if (r12 != 0) {
                r12.invoke();
            }
        }
    }

    /* compiled from: ClickStreamPendingTimer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.analytics.inhouse_transport.a$b */
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", C28458a.this.getClass().getSimpleName(), (Throwable) obj);
        }
    }

    /* compiled from: ClickStreamPendingTimer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.analytics.inhouse_transport.a$c */
    public static final class c<T> implements l41.g {
        public c() {
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            ((Number) obj).longValue();
            ?? r12 = C28458a.this.f90182c;
            if (r12 != 0) {
                r12.invoke();
            }
        }
    }

    /* compiled from: ClickStreamPendingTimer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.analytics.inhouse_transport.a$d */
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("DEFAULT_TAG", C28458a.this.getClass().getSimpleName(), (Throwable) obj);
        }
    }

    @Inject
    public C28458a(@Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f90180a = interfaceC35745a5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.analytics.inhouse_transport.o
    public final void a(long j12, @Y61.k Y41.a<G0> aVar) {
        io.reactivex.rxjava3.internal.observers.y yVar;
        AtomicBoolean atomicBoolean = this.f90184e;
        if (atomicBoolean.get() && (yVar = this.f90181b) != null) {
            DisposableHelper.a(yVar);
        }
        atomicBoolean.set(true);
        this.f90182c = (N) aVar;
        this.f90183d = j12;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a5 = this.f90180a;
        C41982q1 c41982q1X0 = io.reactivex.rxjava3.core.z.a0(j12, j12, timeUnit, interfaceC35745a5.c()).x0(interfaceC35745a5.c());
        this.f90185f = c41982q1X0;
        this.f90181b = (io.reactivex.rxjava3.internal.observers.y) c41982q1X0.v0(new c(), new d(), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.analytics.inhouse_transport.o
    public final boolean isRunning() {
        return this.f90184e.get();
    }

    @Override // com.avito.android.analytics.inhouse_transport.o
    public final void reset() {
        if (this.f90182c == null) {
            return;
        }
        io.reactivex.rxjava3.internal.observers.y yVar = this.f90181b;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        io.reactivex.rxjava3.core.z<Long> zVar = this.f90185f;
        zVar.getClass();
        io.reactivex.rxjava3.core.z zVarQ = io.reactivex.rxjava3.core.z.q(io.reactivex.rxjava3.core.z.c0(0L), zVar);
        long j12 = this.f90183d;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zVarQ.getClass();
        this.f90181b = (io.reactivex.rxjava3.internal.observers.y) zVarQ.z(j12, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).v0(new C2673a(), new b(), io.reactivex.rxjava3.internal.functions.a.f401993c);
        this.f90184e.set(true);
    }

    @Override // com.avito.android.analytics.inhouse_transport.o
    public final void shutdown() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f90181b;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f90184e.set(false);
    }
}
