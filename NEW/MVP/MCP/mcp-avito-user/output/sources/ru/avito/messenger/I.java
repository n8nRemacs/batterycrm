package ru.avito.messenger;

import com.avito.android.remote.model.TypedResult;
import e91.C39974c;
import e91.C39975d;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MessengerClientFacade.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Le91/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ru.avito.messenger.MessengerClientFacadeImpl$getUsers$forceAlternativeImpl$1$1", f = "MessengerClientFacade.kt", i = {}, l = {386}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class I extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super TypedResult<C39975d>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f430659q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D f430660r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f430661s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List<String> f430662t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(D d12, String str, List<String> list, Continuation<? super I> continuation) {
        super(2, continuation);
        this.f430660r = d12;
        this.f430661s = str;
        this.f430662t = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new I(this.f430660r, this.f430661s, this.f430662t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super TypedResult<C39975d>> continuation) {
        return ((I) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f430659q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Z81.a aVar = this.f430660r.f430604b.get();
            C39974c c39974c = new C39974c(this.f430661s, this.f430662t);
            this.f430659q = 1;
            obj = aVar.b(c39974c, this);
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
