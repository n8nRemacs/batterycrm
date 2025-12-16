package com.avito.android.credman;

import com.avito.android.credman.f;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: CredmanRx.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/credman/f$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/credman/f$a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.credman.CredmanLoaderRxImpl$load$1", f = "CredmanRx.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class j extends SuspendLambda implements Y41.p<T, Continuation<? super f.a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f129097q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f129098r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f129098r = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new j(this.f129098r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super f.a> continuation) {
        return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f129097q;
        if (i12 == 0) {
            C42729a0.b(obj);
            f fVar = this.f129098r.f129099a;
            this.f129097q = 1;
            obj = fVar.a(this);
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
