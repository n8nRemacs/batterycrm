package com.avito.android.favorite_comparison.presentation;

import Uq.InterfaceC15558a;
import androidx.view.M0;
import com.avito.android.favorite_comparison.presentation.a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.Metadata;
import l41.InterfaceC43543a;
import sC.AbstractC48027d;
import sC.InterfaceC48028e;

/* compiled from: FavoriteComparisonViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite_comparison/presentation/y;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/favorite_comparison/presentation/o;", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class y extends M0 implements o {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15558a f155377E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite_comparison.presentation.items.comparison_list_item.d f155378J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f155379K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f155380L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f155381M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48028e f155382N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<a> f155383O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.b<f> f155384P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<AbstractC48027d> f155385Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f155386R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f155387S;

    public y(@Y61.k InterfaceC15558a interfaceC15558a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.favorite_comparison.presentation.items.comparison_list_item.d dVar, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC48028e interfaceC48028e) {
        this.f155377E = interfaceC15558a;
        this.f155378J = dVar;
        this.f155379K = fVar;
        this.f155380L = aVar;
        this.f155381M = interfaceC35745a5;
        this.f155382N = interfaceC48028e;
        io.reactivex.rxjava3.subjects.e<a> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f155383O = eVar;
        f fVar2 = new f(true, null, null, null, 14, null);
        final io.reactivex.rxjava3.subjects.b<f> bVarO0 = io.reactivex.rxjava3.subjects.b.O0(fVar2);
        this.f155384P = bVarO0;
        this.f155385Q = new io.reactivex.rxjava3.subjects.e<>();
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f155387S = cVar;
        com.avito.android.analytics.timer.b bVar = new com.avito.android.analytics.timer.b(1);
        z<R> zVarY0 = eVar.k0(a.C4551a.class).y0(new v(this));
        B0 b0K0 = eVar.k0(a.b.class);
        w wVar = new w(this);
        x xVar = new x(this);
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.disposables.d dVarV0 = b0K0.v0(wVar, xVar, interfaceC43543a);
        this.f155386R = (io.reactivex.rxjava3.internal.observers.y) zVarY0.o0(fVar2, bVar).D(io.reactivex.rxjava3.internal.functions.a.f401991a).v0(new l41.g() { // from class: com.avito.android.favorite_comparison.presentation.r
            @Override // l41.g
            public final void accept(Object obj) {
                bVarO0.onNext((f) obj);
            }
        }, new l41.g() { // from class: com.avito.android.favorite_comparison.presentation.s
            @Override // l41.g
            public final void accept(Object obj) {
                this.f155371b.getClass();
                V2.f318762a.e("FavoriteComparisonViewModel", (Throwable) obj);
            }
        }, interfaceC43543a);
        cVar.d(dVarV0);
    }

    @Override // com.avito.android.favorite_comparison.presentation.o
    @Y61.k
    public final C41981q0 ea() {
        io.reactivex.rxjava3.subjects.e<AbstractC48027d> eVar = this.f155385Q;
        eVar.getClass();
        return new C41981q0(eVar);
    }

    @Override // com.avito.android.favorite_comparison.presentation.o
    @Y61.k
    public final C41981q0 getState() {
        io.reactivex.rxjava3.subjects.b<f> bVar = this.f155384P;
        bVar.getClass();
        return new C41981q0(bVar);
    }

    @Override // com.avito.android.favorite_comparison.presentation.o
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<a> m1() {
        return this.f155383O;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f155386R;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f155386R = null;
        this.f155387S.e();
        super.onCleared();
    }
}
