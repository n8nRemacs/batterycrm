package com.avito.android.lib.beduin_v2.repository.cart_total_quantity;

import Lm.C14411b;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.Z0;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.K5;
import com.avito.android.util.V2;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import l41.InterfaceC43543a;

/* compiled from: CartMenuIconViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/N;", "Landroidx/lifecycle/M0;", "_design-modules_beduin-v2_interactions_repository_domain_cart-total-quantity_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class N extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f176458E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final C31174q f176459J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public AtomicReference f176460K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public AtomicReference f176461L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f176462M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final C23038g0<InterfaceC31171n> f176463N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f176464O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public String f176465P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public List<String> f176466Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public String f176467R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final List<String> f176468S;

    /* compiled from: CartMenuIconViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/l;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/l;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<C31169l, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C31169l c31169l) {
            C31169l c31169l2 = c31169l;
            if (c31169l2.f176505b) {
                Integer num = c31169l2.f176504a;
                N.this.pe(num != null ? num.intValue() : 0);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CartMenuIconViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LLm/b;", "iconInfo", "", "pointWasClicked", "Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;", "apply", "(LLm/b;Z)Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T1, T2, R> implements l41.c {
        public b() {
        }

        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            C14411b c14411b = (C14411b) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            List<String> listB = c14411b.b();
            N n12 = N.this;
            n12.f176466Q = listB;
            Integer quantity = c14411b.getQuantity();
            return N.ke(n12, quantity != null ? quantity.intValue() : 0, zBooleanValue);
        }
    }

    /* compiled from: CartMenuIconViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;", "iconState", "Lkotlin/G0;", "accept", "(Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            N.this.f176463N.postValue((InterfaceC31171n) obj);
        }
    }

    /* compiled from: CartMenuIconViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC31171n value;
            Throwable th2 = (Throwable) obj;
            boolean zA2 = K5.a(th2);
            N n12 = N.this;
            if (zA2) {
                value = InterfaceC31171n.c.f176508a;
            } else {
                V2.f318762a.f(th2);
                value = n12.f176463N.getValue();
                if (value == null) {
                    value = InterfaceC31171n.c.f176508a;
                }
            }
            n12.f176463N.postValue(value);
        }
    }

    /* compiled from: CartMenuIconViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends kotlin.jvm.internal.H implements Y41.l<Throwable, G0> {
        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            ((V2) this.receiver).f(th2);
            return G0.f406611a;
        }
    }

    /* compiled from: CartMenuIconViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f176474c;

        public f(int i12) {
            this.f176474c = i12;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            N n12 = N.this;
            n12.f176463N.postValue(N.ke(n12, this.f176474c, zBooleanValue));
        }
    }

    /* compiled from: CartMenuIconViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends kotlin.jvm.internal.H implements Y41.l<Throwable, G0> {
        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            ((V2) this.receiver).f(th2);
            return G0.f406611a;
        }
    }

    public N(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C31174q c31174q, @Y61.k InterfaceC31164g interfaceC31164g, @Y61.k Z0 z02) {
        this.f176458E = interfaceC35745a5;
        this.f176459J = c31174q;
        Runnable runnable = io.reactivex.rxjava3.internal.functions.a.f401992b;
        this.f176460K = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(runnable);
        this.f176461L = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(runnable);
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f176462M = cVar;
        C23038g0<InterfaceC31171n> c23038g0 = new C23038g0<>();
        this.f176463N = c23038g0;
        this.f176464O = c23038g0;
        this.f176468S = C42745f0.U("cross_category_vacancies_for_student", "cross_category_vacancies_for_office");
        z02.getClass();
        kotlin.reflect.n<Object> nVar = Z0.f67595D[24];
        if (((Boolean) z02.f67596A.a().invoke()).booleanValue()) {
            cVar.b(A1.h(interfaceC31164g.a(), null, new a(), 3));
        }
    }

    public static final InterfaceC31171n ke(N n12, int i12, boolean z12) {
        return !n12.me(n12.f176465P, n12.f176467R) ? InterfaceC31171n.b.f176507a : i12 == 0 ? z12 ? InterfaceC31171n.c.f176508a : InterfaceC31171n.d.f176509a : new InterfaceC31171n.a(i12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void le() {
        this.f176460K.dispose();
        C31174q c31174q = this.f176459J;
        C42026y c42026yA = g1.a(c31174q.b());
        F f12 = c31174q.f176514b;
        f12.getClass();
        this.f176460K = (AtomicReference) io.reactivex.rxjava3.core.I.G(c42026yA, new io.reactivex.rxjava3.internal.operators.single.G(new CallableC31181y(f12, 2)), new b()).z(this.f176458E.a()).x(new c(), new d());
    }

    public final boolean me(String str, String str2) {
        List<String> list;
        List<String> list2 = this.f176466Q;
        return (str == null || (list = list2) == null || list.isEmpty() || list2.contains(str)) && !C42745f0.r(this.f176468S, str2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void ne() {
        this.f176461L.dispose();
        final F f12 = this.f176459J.f176514b;
        f12.getClass();
        this.f176461L = (AtomicReference) A1.f(new C41826q(new InterfaceC43543a() { // from class: com.avito.android.lib.beduin_v2.repository.cart_total_quantity.A
            @Override // l41.InterfaceC43543a
            public final void run() {
                f12.f176446a.putBoolean("cart_icon_click", true);
            }
        }).x(this.f176458E.a()), new e(1, V2.f318762a, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), null, 2);
    }

    public final void oe(@Y61.l String str, @Y61.l String str2) {
        if (kotlin.jvm.internal.L.f(str, this.f176465P) && kotlin.jvm.internal.L.f(str2, this.f176467R)) {
            return;
        }
        this.f176465P = str;
        this.f176467R = str2;
        if (me(str, str2)) {
            le();
        } else {
            this.f176463N.setValue(InterfaceC31171n.b.f176507a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // androidx.view.M0
    public final void onCleared() {
        this.f176460K.dispose();
        this.f176461L.dispose();
        this.f176462M.e();
    }

    public final void pe(int i12) {
        F f12 = this.f176459J.f176514b;
        f12.getClass();
        io.reactivex.rxjava3.internal.operators.single.W wZ2 = new io.reactivex.rxjava3.internal.operators.single.G(new CallableC31181y(f12, 2)).z(this.f176458E.a());
        f fVar = new f(i12);
        final V2 v22 = V2.f318762a;
        this.f176462M.b(wZ2.x(fVar, new l41.g() { // from class: com.avito.android.lib.beduin_v2.repository.cart_total_quantity.N.g
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }));
    }

    public final void qe(int i12) {
        this.f176462M.b(A1.f(this.f176459J.f176513a.a(Integer.valueOf(i12)).x(this.f176458E.a()), new h(1, V2.f318762a, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), null, 2));
        pe(i12);
    }
}
