package io.reactivex.rxjava3.kotlin;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.operators.maybe.C41910d;
import j41.InterfaceC42196c;
import kotlin.Metadata;
import l41.InterfaceC43543a;

/* compiled from: subscribers.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"rxkotlin"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes8.dex */
public final class A1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Y41.l<Object, kotlin.G0> f404841a = c.f404846l;

    /* renamed from: b, reason: collision with root package name */
    public static final Y41.l<Throwable, kotlin.G0> f404842b = b.f404845l;

    /* renamed from: c, reason: collision with root package name */
    public static final Y41.a<kotlin.G0> f404843c = a.f404844l;

    /* compiled from: subscribers.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f404844l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke() {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: subscribers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f404845l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(Throwable th2) {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: subscribers.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Object, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f404846l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(Object obj) {
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.kotlin.C1] */
    public static final <T> l41.g<T> a(Y41.l<? super T, kotlin.G0> lVar) {
        if (lVar == f404841a) {
            return (l41.g<T>) io.reactivex.rxjava3.internal.functions.a.f401994d;
        }
        if (lVar != null) {
            lVar = new C1(lVar);
        }
        return (l41.g) lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.kotlin.B1] */
    public static final InterfaceC43543a b(Y41.a<kotlin.G0> aVar) {
        if (aVar == f404843c) {
            return io.reactivex.rxjava3.internal.functions.a.f401993c;
        }
        if (aVar != null) {
            aVar = new B1(aVar);
        }
        return (InterfaceC43543a) aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.kotlin.C1] */
    public static final l41.g<Throwable> c(Y41.l<? super Throwable, kotlin.G0> lVar) {
        if (lVar == f404842b) {
            return io.reactivex.rxjava3.internal.functions.a.f401996f;
        }
        if (lVar != null) {
            lVar = new C1(lVar);
        }
        return (l41.g) lVar;
    }

    @Y61.k
    @InterfaceC42196c
    @j41.g
    public static final io.reactivex.rxjava3.disposables.d d(@Y61.k AbstractC41768a abstractC41768a, @Y61.k Y41.l<? super Throwable, kotlin.G0> lVar, @Y61.k Y41.a<kotlin.G0> aVar) {
        Y41.l<Throwable, kotlin.G0> lVar2 = f404842b;
        return (lVar == lVar2 && aVar == f404843c) ? abstractC41768a.u() : lVar == lVar2 ? abstractC41768a.v(new B1(aVar), io.reactivex.rxjava3.internal.functions.a.f401996f) : abstractC41768a.v(b(aVar), new C1(lVar));
    }

    @Y61.k
    @InterfaceC42196c
    @j41.g
    public static final io.reactivex.rxjava3.internal.observers.m e(@Y61.k io.reactivex.rxjava3.core.I i12, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2) {
        return (io.reactivex.rxjava3.internal.observers.m) i12.x(a(lVar2), c(lVar));
    }

    public static /* synthetic */ io.reactivex.rxjava3.disposables.d f(AbstractC41768a abstractC41768a, Y41.l lVar, Y41.a aVar, int i12) {
        if ((i12 & 1) != 0) {
            lVar = f404842b;
        }
        if ((i12 & 2) != 0) {
            aVar = f404843c;
        }
        return d(abstractC41768a, lVar, aVar);
    }

    public static /* synthetic */ io.reactivex.rxjava3.internal.observers.m g(io.reactivex.rxjava3.core.I i12, Y41.l lVar, Y41.l lVar2, int i13) {
        if ((i13 & 1) != 0) {
            lVar = f404842b;
        }
        if ((i13 & 2) != 0) {
            lVar2 = f404841a;
        }
        return e(i12, lVar, lVar2);
    }

    public static io.reactivex.rxjava3.internal.observers.y h(io.reactivex.rxjava3.core.z zVar, Y41.l lVar, Y41.l lVar2, int i12) {
        if ((i12 & 1) != 0) {
            lVar = f404842b;
        }
        Y41.a<kotlin.G0> aVar = f404843c;
        if ((i12 & 4) != 0) {
            lVar2 = f404841a;
        }
        return (io.reactivex.rxjava3.internal.observers.y) zVar.v0(a(lVar2), c(lVar), b(aVar));
    }

    public static C41910d i(io.reactivex.rxjava3.core.q qVar, Y41.l lVar, Y41.l lVar2, int i12) {
        if ((i12 & 1) != 0) {
            lVar = f404842b;
        }
        return (C41910d) qVar.n(a(lVar2), c(lVar), b(f404843c));
    }

    public static io.reactivex.rxjava3.internal.subscribers.n j(AbstractC41777j abstractC41777j, Y41.l lVar, Y41.l lVar2, int i12) {
        if ((i12 & 1) != 0) {
            lVar = f404842b;
        }
        return (io.reactivex.rxjava3.internal.subscribers.n) abstractC41777j.p(a(lVar2), c(lVar), b(f404843c));
    }
}
