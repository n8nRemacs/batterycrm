package com.avito.android.multi_message_send.domain;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: SendMultiMessagePopupClosedRequestUseCaseImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/multi_message_send/domain/o;", "Lcom/avito/android/multi_message_send/domain/n;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A20.a f206728a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f206729b;

    /* compiled from: SendMultiMessagePopupClosedRequestUseCaseImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LB20/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.multi_message_send.domain.SendMultiMessagePopupClosedRequestUseCaseImpl$invoke$2", f = "SendMultiMessagePopupClosedRequestUseCaseImpl.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<B20.a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f206730q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f206732s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f206732s = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return o.this.new a(this.f206732s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<B20.a>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f206730q;
            if (i12 == 0) {
                C42729a0.b(obj);
                A20.a aVar = o.this.f206728a;
                B20.b bVar = new B20.b(this.f206732s);
                this.f206730q = 1;
                obj = aVar.d(bVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    @Inject
    public o(@Y61.k A20.a aVar, @Y61.k R0 r02) {
        this.f206728a = aVar;
        this.f206729b = r02;
    }

    @Override // com.avito.android.multi_message_send.domain.n
    @Y61.l
    public final Object a(long j12, @Y61.k Continuation<? super G0> continuation) {
        Object objG = C43259k.g(this.f206729b.a(), new a(j12, null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }
}
