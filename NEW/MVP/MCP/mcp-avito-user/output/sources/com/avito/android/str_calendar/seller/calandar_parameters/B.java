package com.avito.android.str_calendar.seller.calandar_parameters;

import Gy0.d;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: StrCalendarParametersFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$handleEvent$1", f = "StrCalendarParametersFragment.kt", i = {}, l = {275}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class B extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f286665q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ StrCalendarParametersFragment f286666r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Gy0.d f286667s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(StrCalendarParametersFragment strCalendarParametersFragment, Gy0.d dVar, Continuation<? super B> continuation) {
        super(2, continuation);
        this.f286666r = strCalendarParametersFragment;
        this.f286667s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new B(this.f286666r, this.f286667s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((B) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f286665q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.str_calendar.seller.core.c cVar = this.f286666r.f286692q0;
            if (cVar == null) {
                cVar = null;
            }
            String str = ((d.f) this.f286667s).f6861a;
            this.f286665q = 1;
            if (cVar.c(str, this) == coroutine_suspended) {
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
