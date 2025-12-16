package com.avito.android.mortgage.deeplink.domain;

import Y41.p;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.TypedResult;
import i00.InterfaceC41203a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import s00.C47950a;
import s00.C47951b;

/* compiled from: MortgageApplicationEntryPointUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.deeplink.domain.MortgageApplicationEntryPointUseCase$invoke$2", f = "MortgageApplicationEntryPointUseCase.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super TypedResult<DeepLink>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f198822q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f198823r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f198824s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f198825t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f198823r = gVar;
        this.f198824s = str;
        this.f198825t = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        return new f(this.f198823r, this.f198824s, this.f198825t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<DeepLink>> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f198822q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC41203a interfaceC41203a = this.f198823r.f198826a.get();
            C47951b c47951b = new C47951b(this.f198824s, null, null, this.f198825t, null);
            this.f198822q = 1;
            obj = interfaceC41203a.i(c47951b, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            return new TypedResult.Success(((C47950a) ((TypedResult.Success) typedResult).getResult()).getEntryPoint());
        }
        if (typedResult instanceof TypedResult.Error) {
            return typedResult;
        }
        throw new NoWhenBranchMatchedException();
    }
}
