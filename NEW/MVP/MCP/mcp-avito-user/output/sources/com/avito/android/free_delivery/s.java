package com.avito.android.free_delivery;

import androidx.compose.foundation.MutatePriority;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.D1;
import kotlinx.coroutines.T;

/* compiled from: FreeDeliveryBottomSheetRedesign.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.free_delivery.FreeDeliveryBottomSheetRedesignKt$HandleEvents$1$1$2", f = "FreeDeliveryBottomSheetRedesign.kt", i = {}, l = {82, 84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class s extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f158856q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.tooltip.t f158857r;

    /* compiled from: FreeDeliveryBottomSheetRedesign.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.free_delivery.FreeDeliveryBottomSheetRedesignKt$HandleEvents$1$1$2$1", f = "FreeDeliveryBottomSheetRedesign.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f158858q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.tooltip.t f158859r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.akita.compose.component.tooltip.t tVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f158859r = tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f158859r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f158858q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f158858q = 1;
                if (this.f158859r.a(MutatePriority.f26797b, this) == coroutine_suspended) {
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
    public s(com.akita.compose.component.tooltip.t tVar, Continuation<? super s> continuation) {
        super(2, continuation);
        this.f158857r = tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new s(this.f158857r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((s) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f158856q;
        com.akita.compose.component.tooltip.t tVar = this.f158857r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f158856q = 1;
                if (C43131e0.b(20L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    tVar.dismiss();
                    return G0.f406611a;
                }
                C42729a0.b(obj);
            }
            a aVar = new a(tVar, null);
            this.f158856q = 2;
            if (D1.b(2000L, aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            tVar.dismiss();
            return G0.f406611a;
        } catch (Throwable th2) {
            tVar.dismiss();
            throw th2;
        }
    }
}
