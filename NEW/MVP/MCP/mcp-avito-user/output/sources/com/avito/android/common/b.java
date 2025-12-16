package com.avito.android.common;

import A3.a;
import com.avito.android.account.E;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import hz.InterfaceC41196a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41986s0;
import iz.C42140a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.rx3.y;
import l41.InterfaceC43543a;
import l41.o;
import l41.r;

/* compiled from: CounterInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/common/b;", "Lcom/avito/android/common/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.common.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f123746a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final j f123747b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f123748c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final I30.d f123749d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f123750e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Integer> f123751f = com.jakewharton.rxrelay3.b.N0(0);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Boolean> f123752g;

    /* renamed from: h, reason: collision with root package name */
    public long f123753h;

    /* compiled from: CounterInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "test", "(Ljava/lang/Boolean;)Z"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            b bVar = b.this;
            if (zBooleanValue) {
                bVar.getClass();
                return true;
            }
            if (bVar.f123751f.f364266b.get() != null) {
                return i.f123765a < System.currentTimeMillis() - bVar.f123753h;
            }
            return true;
        }
    }

    /* compiled from: CounterInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/G0;", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.common.b$b, reason: collision with other inner class name */
    public static final class C3698b<T, R> implements o {
        public C3698b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return new io.reactivex.rxjava3.internal.operators.mixed.a(b.this.a(), z.c0(G0.f406611a));
        }
    }

    /* compiled from: CounterInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f123756b = new c<>();

        @Override // l41.g
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* compiled from: CounterInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f123757b = new d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    /* compiled from: CounterInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljz/b;", "it", "Lkotlin/G0;", "accept", "(Ljz/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.this.c(true);
        }
    }

    /* compiled from: CounterInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T> f123759b = new f<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    @Inject
    public b(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k j jVar, @Y61.k E e12, @Y61.k I30.d dVar, @Y61.k InterfaceC41196a interfaceC41196a) {
        this.f123746a = interfaceC35745a5;
        this.f123747b = jVar;
        this.f123748c = e12;
        this.f123749d = dVar;
        this.f123750e = interfaceC41196a;
        com.jakewharton.rxrelay3.c<Boolean> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f123752g = cVar;
        io.reactivex.rxjava3.disposables.c cVar2 = new io.reactivex.rxjava3.disposables.c();
        z<R> zVarU = cVar.N(new a()).u(new C3698b());
        l41.g gVar = c.f123756b;
        l41.g<? super Throwable> gVar2 = d.f123757b;
        zVarU.getClass();
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        cVar2.b(zVarU.v0(gVar, gVar2, interfaceC43543a));
        cVar2.b(y.b(interfaceC41196a.g(new C42140a(false, false, 3, null))).j0(interfaceC35745a5.e()).v0(new e(), f.f123759b, interfaceC43543a));
    }

    public final C41986s0 a() {
        return new C41986s0(this.f123748c.o().p(new com.avito.android.common.c(this)).I(com.avito.android.common.d.f123761b).l0(com.avito.android.common.e.f123762b).J(io.reactivex.rxjava3.internal.functions.a.f401993c, new com.avito.android.common.f(this)).K(new g(this)));
    }

    @Override // com.avito.android.common.a
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final com.jakewharton.rxrelay3.b getF123751f() {
        return this.f123751f;
    }

    @Override // com.avito.android.common.a
    public final void c(boolean z12) {
        this.f123752g.accept(Boolean.valueOf(z12));
    }

    public final void f() {
        c(true);
    }

    @Override // A3.b
    public final void i(@Y61.k a.b bVar) {
        f();
    }

    @Override // A3.b
    public final void l(@Y61.k a.InterfaceC0003a.b bVar) {
        f();
    }

    @Override // com.avito.android.common.a
    @Y61.k
    public final C41986s0 q() {
        return a();
    }

    @Override // com.avito.android.common.a
    public final void reset() {
        this.f123751f.accept(0);
    }

    @Override // A3.b
    public final void d(@Y61.k a.InterfaceC0003a.C0004a c0004a) {
    }

    @Override // A3.b
    public final void e(@Y61.k a.InterfaceC0003a.c cVar) {
    }

    @Override // A3.b
    public final void p(@Y61.k a.InterfaceC0003a.d dVar) {
    }

    @Override // A3.b
    public final void m(@Y61.l Boolean bool, @Y61.k String str) {
    }
}
