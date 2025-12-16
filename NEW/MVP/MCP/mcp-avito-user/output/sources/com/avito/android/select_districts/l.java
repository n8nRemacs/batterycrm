package com.avito.android.select_districts;

import androidx.view.N0;
import com.avito.android.select_districts.domain.a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import pq0.InterfaceC47130a;

/* compiled from: SelectDistrictsViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/select_districts/l;", "Lcom/avito/android/arch/mvi/android/j;", "Lpq0/a;", "Lpq0/c;", "Lpq0/b;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l extends com.avito.android.arch.mvi.android.j<InterfaceC47130a, pq0.c, pq0.b> {

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final T f267006N;

    /* compiled from: SelectDistrictsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/select_districts/domain/a;", "result", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/select_districts/domain/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.select_districts.SelectDistrictsViewModel$1", f = "SelectDistrictsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<com.avito.android.select_districts.domain.a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f267007q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = l.this.new a(continuation);
            aVar.f267007q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(com.avito.android.select_districts.domain.a aVar, Continuation<? super G0> continuation) {
            return ((a) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.select_districts.domain.a aVar = (com.avito.android.select_districts.domain.a) this.f267007q;
            boolean zF2 = L.f(aVar, a.C7962a.f266915a);
            l lVar = l.this;
            if (zF2) {
                lVar.accept(InterfaceC47130a.j.f428806a);
            } else if (aVar instanceof a.b) {
                lVar.accept(new InterfaceC47130a.e(((a.b) aVar).f266916a));
            } else if (L.f(aVar, a.c.f266917a)) {
                lVar.accept(InterfaceC47130a.g.f428803a);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public l(@Y61.k com.avito.android.select_districts.mvi.q qVar, @Y61.k com.avito.android.select_districts.domain.o oVar, @Y61.k T t12) {
        super(qVar, null, 2, null);
        this.f267006N = t12;
        C43175k.K(new C43197r1(new a(null), oVar.b()), N0.a(this));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        U.b(this.f267006N, null);
    }
}
