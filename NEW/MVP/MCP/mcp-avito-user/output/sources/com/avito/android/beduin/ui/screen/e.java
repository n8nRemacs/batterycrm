package com.avito.android.beduin.ui.screen;

import Y61.k;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.remote.error.j;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.operators.flowable.C41892v;
import java.util.Objects;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l41.o;
import qi.InterfaceC47401b;

/* compiled from: ScreenRootViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/e;", "Landroidx/lifecycle/M0;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.domain.screen.a f104108E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final BeduinScreenRootOpenParams f104109J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final C23038g0<P2<G0>> f104110K = new C23038g0<>();

    /* renamed from: L, reason: collision with root package name */
    @k
    public final D<InterfaceC47401b> f104111L = new D<>();

    /* renamed from: M, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f104112M = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ScreenRootViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lqi/b;", "it", "Lkotlin/G0;", "apply", "(Lcom/avito/android/util/P2;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            P2 p22 = (P2) obj;
            if (p22 instanceof P2.b) {
                e.this.f104111L.postValue(((P2.b) p22).f318720a);
                return new P2.b(G0.f406611a);
            }
            if ((p22 instanceof P2.a) || (p22 instanceof P2.c)) {
                return p22;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: ScreenRootViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2;", "Lkotlin/G0;", "it", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            e.this.f104110K.postValue((P2) obj);
        }
    }

    /* compiled from: ScreenRootViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
            e.this.f104110K.postValue(new P2.a(j.b()));
        }
    }

    public e(@k com.avito.android.beduin.domain.screen.a aVar, @k BeduinScreenRootOpenParams beduinScreenRootOpenParams) {
        this.f104108E = aVar;
        this.f104109J = beduinScreenRootOpenParams;
        ke();
    }

    public final void ke() {
        org.reactivestreams.c cVarD = this.f104108E.b(this.f104109J.f104094b).r(new a()).D();
        P2.c cVar = P2.c.f318721a;
        Objects.requireNonNull(cVar, "item is null");
        this.f104112M.b(new C41892v(new org.reactivestreams.c[]{AbstractC41777j.j(cVar), cVarD}).p(new b(), new c(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f104112M.dispose();
    }
}
