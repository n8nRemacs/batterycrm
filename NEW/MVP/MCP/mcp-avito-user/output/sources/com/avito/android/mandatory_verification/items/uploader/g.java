package com.avito.android.mandatory_verification.items.uploader;

import Y41.p;
import com.avito.android.mandatory_verification.items.uploader.a;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.e2;

/* compiled from: MandatoryVerificationUploaderItemPresenterImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mandatory_verification.items.uploader.MandatoryVerificationUploaderItemPresenterImpl$bindView$1$1", f = "MandatoryVerificationUploaderItemPresenterImpl.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f184694q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f184695r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List<String> f184696s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, List<String> list, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f184695r = kVar;
        this.f184696s = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new g(this.f184695r, this.f184696s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f184694q;
        if (i12 == 0) {
            C42729a0.b(obj);
            e2 e2Var = this.f184695r.f184703b;
            a.b bVar = new a.b(this.f184696s);
            this.f184694q = 1;
            if (e2Var.emit(bVar, this) == coroutine_suspended) {
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
