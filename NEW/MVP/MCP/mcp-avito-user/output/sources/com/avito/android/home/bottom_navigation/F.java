package com.avito.android.home.bottom_navigation;

import androidx.view.C23034e0;
import androidx.view.C23038g0;
import androidx.view.H0;
import androidx.view.M0;
import com.avito.android.bottom_navigation.J;
import com.avito.android.bottom_navigation.T;
import com.avito.android.home.TooltipVisibility;
import com.avito.android.util.InterfaceC35745a5;
import hz.InterfaceC41196a;
import io.reactivex.rxjava3.kotlin.A1;
import iz.C42140a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Y;
import kotlinx.coroutines.rx3.K;

/* compiled from: BottomNavigationViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/bottom_navigation/F;", "Landroidx/lifecycle/M0;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class F extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f162312E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.passport_lib.a f162313J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.home.B f162314K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final s90.b f162315L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f162316M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.home.p f162317N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f162318O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C23038g0<J> f162319P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final C23034e0 f162320Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f162321R;

    /* compiled from: BottomNavigationViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\t\u0018\u00010\u0000¢\u0006\u0002\b\u00012\r\u0010\u0002\u001a\t\u0018\u00010\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bottom_navigation/T;", "LX41/o;", "it", "invoke", "(Lcom/avito/android/bottom_navigation/T;)Lcom/avito/android/bottom_navigation/T;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<T, T> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final T invoke(T t12) {
            T t13 = t12;
            F.this.f162314K.a(t13 != null ? TooltipVisibility.f162192b : TooltipVisibility.f162193c);
            return t13;
        }
    }

    @Inject
    public F(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.passport_lib.a aVar, @Y61.k com.avito.android.home.B b12, @Y61.k s90.b bVar, @Y61.k gD.f fVar, @Y61.k InterfaceC41196a interfaceC41196a, @Y61.k com.avito.android.home.p pVar) {
        this.f162312E = interfaceC35745a5;
        this.f162313J = aVar;
        this.f162314K = b12;
        this.f162315L = bVar;
        this.f162316M = interfaceC41196a;
        this.f162317N = pVar;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f162318O = cVar;
        final C23038g0 c23038g0 = new C23038g0(null);
        C23038g0<J> c23038g02 = new C23038g0<>(new J.a(false));
        this.f162319P = c23038g02;
        this.f162320Q = H0.a(c23038g0, new a());
        this.f162321R = c23038g02;
        fVar.getClass();
        kotlin.reflect.n<Object> nVar = gD.f.f396389r[9];
        if (((Boolean) fVar.f396398j.a().invoke()).booleanValue()) {
            cVar.b(A1.h(aVar.a().D(io.reactivex.rxjava3.internal.functions.a.f401991a).y0(new l41.o() { // from class: com.avito.android.home.bottom_navigation.B
                @Override // l41.o
                public final Object apply(Object obj) {
                    F f12 = this.f162242b;
                    f12.getClass();
                    return io.reactivex.rxjava3.core.z.k(K.a(EmptyCoroutineContext.INSTANCE, new y(f12, null)), kotlinx.coroutines.rx3.y.b(new Y(new x(2, null), new v(f12.f162316M.g(new C42140a(true, false, 2, null))))), new w((com.avito.android.passport_lib.u) obj));
                }
            }).x(C.f162309b).x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()), null, new D(this), 3));
        } else {
            cVar.b(A1.h(aVar.a().x(z.f162374b).j0(interfaceC35745a5.e()), null, new A(this), 3));
        }
        cVar.b(kotlinx.coroutines.rx3.y.b(pVar.getF162473a()).t0(new l41.g() { // from class: com.avito.android.home.bottom_navigation.E
            @Override // l41.g
            public final void accept(Object obj) {
                c23038g0.postValue((T) obj);
            }
        }));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f162318O.e();
    }
}
