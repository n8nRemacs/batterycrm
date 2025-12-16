package com.avito.android.publish.params_suggest;

import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import nl0.C44443b;

/* compiled from: ParamsSuggestionsInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "", "Lcom/avito/android/publish/params_suggest/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.params_suggest.ParamsSuggestionsInteractorImpl$getParamsSuggestsV2$1", f = "ParamsSuggestionsInteractor.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class j extends SuspendLambda implements Y41.p<T, Continuation<? super List<? extends d>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f238214q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f238215r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C44443b f238216s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, C44443b c44443b, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f238215r = lVar;
        this.f238216s = c44443b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new j(this.f238215r, this.f238216s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super List<? extends d>> continuation) {
        return ((j) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f238214q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f238214q = 1;
            obj = l.b(this.f238215r, this.f238216s, this);
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
