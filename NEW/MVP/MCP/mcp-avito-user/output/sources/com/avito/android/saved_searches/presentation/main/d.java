package com.avito.android.saved_searches.presentation.main;

import Y41.p;
import Y61.l;
import android.view.View;
import com.avito.android.util.D6;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;

/* compiled from: SavedSearchMainView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.saved_searches.presentation.main.SavedSearchMainView$delayHeaderAlphaInvalidation$1", f = "SavedSearchMainView.kt", i = {0}, l = {145}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f258598q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f258599r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f258600s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f258600s = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f258600s, continuation);
        dVar.f258599r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        T t12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f258598q;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t13 = (T) this.f258599r;
            this.f258599r = t13;
            this.f258598q = 1;
            if (C43131e0.b(200L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            t12 = t13;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t12 = (T) this.f258599r;
            C42729a0.b(obj);
        }
        if (U.e(t12)) {
            h hVar = this.f258600s;
            float fComputeVerticalScrollOffset = hVar.f258609e.computeVerticalScrollOffset();
            float f12 = hVar.f258614j;
            float f13 = fComputeVerticalScrollOffset > f12 ? 1.0f : fComputeVerticalScrollOffset / f12;
            View view = hVar.f258613i;
            view.setAlpha(f13);
            D6.H(view);
        }
        return G0.f406611a;
    }
}
