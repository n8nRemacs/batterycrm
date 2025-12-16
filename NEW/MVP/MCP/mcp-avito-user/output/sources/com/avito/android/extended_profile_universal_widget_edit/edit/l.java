package com.avito.android.extended_profile_universal_widget_edit.edit;

import Y41.p;
import jB.InterfaceC42227a;
import jB.InterfaceC42229c;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.i2;

/* compiled from: UniversalWidgetEditViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit/l;", "Lcom/avito/android/arch/mvi/android/j;", "LjB/a;", "LjB/d;", "LjB/c;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l extends com.avito.android.arch.mvi.android.j<InterfaceC42227a, jB.d, InterfaceC42229c> {

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_universal_widget_edit.edit.interactor.a f153927N;

    /* compiled from: UniversalWidgetEditViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile_universal_widget_edit.edit.UniversalWidgetEditViewModel$onCleared$1", f = "UniversalWidgetEditViewModel.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f153928q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return l.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f153928q;
            if (i12 == 0) {
                C42729a0.b(obj);
                l lVar = l.this;
                this.f153928q = 1;
                if (lVar.f153927N.c(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public l(@Y61.k com.avito.android.extended_profile_universal_widget_edit.edit.mvi.g gVar, @Y61.k com.avito.android.extended_profile_universal_widget_edit.edit.interactor.a aVar) {
        super(gVar, i2.a.f411433c);
        i2.f411430a.getClass();
        this.f153927N = aVar;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        C43259k.d(U.a(Q0.a()), null, null, new a(null), 3);
    }
}
