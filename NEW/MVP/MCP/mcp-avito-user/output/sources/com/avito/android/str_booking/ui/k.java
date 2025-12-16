package com.avito.android.str_booking.ui;

import Y41.p;
import com.avito.android.str_booking.mvi.entity.a;
import com.avito.android.str_booking.network.models.sections.UpdatedTimeContent;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;

/* compiled from: StrBookingView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_booking.ui.StrBookingViewImpl$startPolling$1", f = "StrBookingView.kt", i = {}, l = {250}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class k extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f286093q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UpdatedTimeContent f286094r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f286095s;

    /* compiled from: StrBookingView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f286096l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar) {
            super(0);
            this.f286096l = fVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f286096l.f286019f.accept(a.k.f285793a);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(UpdatedTimeContent updatedTimeContent, f fVar, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f286094r = updatedTimeContent;
        this.f286095s = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new k(this.f286094r, this.f286095s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f286093q;
        if (i12 == 0) {
            C42729a0.b(obj);
            UpdatedTimeContent updatedTimeContent = this.f286094r;
            if (updatedTimeContent != null) {
                f fVar = this.f286095s;
                a aVar = new a(fVar);
                this.f286093q = 1;
                if (fVar.f286021h.a(updatedTimeContent, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
