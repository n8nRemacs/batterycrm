package com.avito.android.sales_items;

import android.annotation.SuppressLint;
import com.avito.android.ab_tests.groups.SimpleTestGroup;
import com.avito.android.account.E;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import hz.InterfaceC41196a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41986s0;
import iz.C42140a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.rx3.y;
import l41.r;
import t3.InterfaceC48488t;

/* compiled from: FavoriteSalesCounterInteractor.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sales_items/b;", "Lcom/avito/android/sales_items/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"CheckResult"})
/* loaded from: classes3.dex */
public final class b implements com.avito.android.sales_items.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f258207a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f258208b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final I30.d f258209c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f258210d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final j f258211e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final m f258212f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final u3.h<SimpleTestGroup> f258213g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Integer> f258214h = com.jakewharton.rxrelay3.b.N0(0);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Boolean> f258215i;

    /* renamed from: j, reason: collision with root package name */
    public long f258216j;

    /* compiled from: FavoriteSalesCounterInteractor.kt */
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
            if (bVar.f258214h.f364266b.get() != null) {
                return i.f258235a < System.currentTimeMillis() - bVar.f258216j;
            }
            return true;
        }
    }

    /* compiled from: FavoriteSalesCounterInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/G0;", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.sales_items.b$b, reason: collision with other inner class name */
    public static final class C7752b<T, R> implements l41.o {
        public C7752b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            b bVar = b.this;
            return new io.reactivex.rxjava3.internal.operators.mixed.a(new C41986s0(bVar.f258208b.o().p(new com.avito.android.sales_items.c(bVar)).I(com.avito.android.sales_items.d.f258224b).l0(com.avito.android.sales_items.e.f258225b).J(io.reactivex.rxjava3.internal.functions.a.f401993c, new com.avito.android.sales_items.f(bVar)).K(new g(bVar))), z.c0(G0.f406611a));
        }
    }

    /* compiled from: FavoriteSalesCounterInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f258219b = new c<>();

        @Override // l41.g
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* compiled from: FavoriteSalesCounterInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f258220b = new d<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    /* compiled from: FavoriteSalesCounterInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljz/b;", "it", "Lkotlin/G0;", "accept", "(Ljz/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.this.c(true);
        }
    }

    /* compiled from: FavoriteSalesCounterInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T> f258222b = new f<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    @Inject
    public b(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k E e12, @Y61.k I30.d dVar, @Y61.k InterfaceC41196a interfaceC41196a, @Y61.k j jVar, @Y61.k m mVar, @InterfaceC48488t @Y61.k u3.h<SimpleTestGroup> hVar) {
        this.f258207a = interfaceC35745a5;
        this.f258208b = e12;
        this.f258209c = dVar;
        this.f258210d = interfaceC41196a;
        this.f258211e = jVar;
        this.f258212f = mVar;
        this.f258213g = hVar;
        com.jakewharton.rxrelay3.c<Boolean> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f258215i = cVar;
        cVar.N(new a()).u(new C7752b()).x0(interfaceC35745a5.a()).u0(c.f258219b, d.f258220b);
        y.b(interfaceC41196a.g(new C42140a(false, false, 3, null))).j0(interfaceC35745a5.e()).u0(new e(), f.f258222b);
    }

    @Override // com.avito.android.sales_items.a
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final com.jakewharton.rxrelay3.b getF258214h() {
        return this.f258214h;
    }

    @Override // com.avito.android.sales_items.a
    public final void b() {
        m mVar;
        String strD;
        Integer num = this.f258214h.f364266b.get();
        if ((num != null && num.intValue() == 0) || (strD = (mVar = this.f258212f).d()) == null) {
            return;
        }
        mVar.c(strD);
        this.f258215i.accept(Boolean.TRUE);
    }

    @Override // com.avito.android.sales_items.a
    public final void c(boolean z12) {
        this.f258215i.accept(Boolean.valueOf(z12));
    }
}
