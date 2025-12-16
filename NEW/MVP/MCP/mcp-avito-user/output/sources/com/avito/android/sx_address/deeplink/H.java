package com.avito.android.sx_address.deeplink;

import com.avito.android.SxAddressRevalidateLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.sx_address.SxAddressRevalidateResult;
import com.avito.android.util.C35936s;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: SxAddressRevalidateDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.deeplink.SxAddressRevalidateDeeplinkHandler$doHandle$1", f = "SxAddressRevalidateDeeplinkHandler.kt", i = {}, l = {30, 31}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class H extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f292787q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ J f292788r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SxAddressRevalidateLink f292789s;

    /* compiled from: SxAddressRevalidateDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sx_address.deeplink.SxAddressRevalidateDeeplinkHandler$doHandle$1$1", f = "SxAddressRevalidateDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ QA0.a f292790q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ J f292791r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(QA0.a aVar, J j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f292790q = aVar;
            this.f292791r = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f292790q, this.f292791r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            QA0.a aVar = this.f292790q;
            String error = aVar.getError();
            J j12 = this.f292791r;
            if (error == null || C43066x.K(error)) {
                j12.j(SxAddressRevalidateResult.Success.f292544b);
            } else {
                j12.j(new SxAddressRevalidateResult.Failure(C35936s.a(new ApiError.Failure(aVar.getError()), null)));
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(J j12, SxAddressRevalidateLink sxAddressRevalidateLink, Continuation<? super H> continuation) {
        super(2, continuation);
        this.f292788r = j12;
        this.f292789s = sxAddressRevalidateLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new H(this.f292788r, this.f292789s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((H) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f292787q;
        J j12 = this.f292788r;
        if (i12 == 0) {
            C42729a0.b(obj);
            long j13 = this.f292789s.f67563b;
            this.f292787q = 1;
            obj = j12.f292793f.c(j13, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
        }
        AbstractC43129d1 abstractC43129d1B = j12.f292794g.b();
        a aVar = new a((QA0.a) obj, j12, null);
        this.f292787q = 2;
        if (C43259k.g(abstractC43129d1B, aVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
