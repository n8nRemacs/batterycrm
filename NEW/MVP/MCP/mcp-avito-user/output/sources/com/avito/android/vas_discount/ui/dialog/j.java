package com.avito.android.vas_discount.ui.dialog;

import Y61.k;
import Y61.l;
import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.deep_linking.K;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.U;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.avito.android.vas_discount.remote.model.DiscountResponse;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.single.G;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.h0;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;

/* compiled from: DiscountPickerViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_discount/ui/dialog/j;", "Lcom/avito/android/vas_discount/ui/dialog/e;", "Landroidx/lifecycle/M0;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j extends M0 implements e {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final DiscountResponse f319703E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final com.avito.android.vas_discount.business.d f319704J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f319705K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public final C23038g0<List<com.avito.conveyor_item.a>> f319706L;

    /* renamed from: M, reason: collision with root package name */
    @k
    public final C23038g0<DeepLink> f319707M;

    /* renamed from: N, reason: collision with root package name */
    @k
    public final C23038g0<Throwable> f319708N;

    /* renamed from: O, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f319709O;

    /* renamed from: P, reason: collision with root package name */
    @k
    public AtomicReference f319710P;

    /* renamed from: Q, reason: collision with root package name */
    @k
    public final C23038g0 f319711Q;

    /* renamed from: R, reason: collision with root package name */
    @k
    public final C23038g0 f319712R;

    /* renamed from: S, reason: collision with root package name */
    @k
    public final C23038g0 f319713S;

    /* compiled from: DiscountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            j.this.f319707M.postValue((DeepLink) obj);
        }
    }

    /* compiled from: DiscountPickerViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f319715b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    public j(@k DiscountResponse discountResponse, @k com.avito.android.vas_discount.business.d dVar, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f319703E = discountResponse;
        this.f319704J = dVar;
        this.f319705K = interfaceC35745a5;
        C23038g0<List<com.avito.conveyor_item.a>> c23038g0 = new C23038g0<>();
        this.f319706L = c23038g0;
        C23038g0<DeepLink> c23038g02 = new C23038g0<>();
        this.f319707M = c23038g02;
        C23038g0<Throwable> c23038g03 = new C23038g0<>();
        this.f319708N = c23038g03;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f319709O = cVar;
        this.f319710P = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);
        cVar.b(new G(new U(this, 4)).x(new h(this), new i(this)));
        this.f319711Q = c23038g0;
        this.f319712R = c23038g02;
        this.f319713S = c23038g03;
    }

    @Override // com.avito.android.vas_discount.ui.dialog.e
    @k
    /* renamed from: K, reason: from getter */
    public final C23038g0 getF319711Q() {
        return this.f319711Q;
    }

    @Override // com.avito.android.vas_discount.ui.dialog.e
    @k
    public final AbstractC22991Y<DeepLink> k0() {
        return this.f319712R;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f319709O.e();
    }

    @Override // com.avito.android.vas_discount.ui.dialog.e
    @k
    /* renamed from: x1, reason: from getter */
    public final C23038g0 getF319713S() {
        return this.f319713S;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // com.avito.android.vas_discount.ui.dialog.e
    public final void z(@k Set<TV0.d<?, ?>> set) {
        List listD = C43033p.D(new o0(C43033p.k(new C42770s0(set), K.class), new h0() { // from class: com.avito.android.vas_discount.ui.dialog.j.c
            @Override // kotlin.jvm.internal.h0, kotlin.reflect.p
            @l
            public final Object get(@l Object obj) {
                return ((K) obj).k();
            }
        }));
        this.f319710P.dispose();
        z zVarH0 = z.h0(listD);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zVarH0.getClass();
        io.reactivex.rxjava3.disposables.d dVarV0 = zVarH0.C0(100L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).x0(this.f319705K.e()).v0(new a(), b.f319715b, io.reactivex.rxjava3.internal.functions.a.f401993c);
        this.f319710P = (AtomicReference) dVarV0;
        this.f319709O.b(dVarV0);
    }
}
