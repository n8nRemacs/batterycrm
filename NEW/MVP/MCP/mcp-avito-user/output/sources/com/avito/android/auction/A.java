package com.avito.android.auction;

import com.avito.android.auction.remote.model.AuctionSendingResult;
import com.avito.android.deep_linking.links.AuctionAddLink;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
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
import sj0.InterfaceC48373a;
import tj0.C48679a;

/* compiled from: SendDraftToAuctionInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/auction/remote/model/AuctionSendingResult;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.auction.SendDraftToAuctionInteractorImpl$sendDraftToAuctionViaContracts$1", f = "SendDraftToAuctionInteractor.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class A extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<AuctionSendingResult>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f92301q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B f92302r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AuctionAddLink.Arguments f92303s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b12, AuctionAddLink.Arguments arguments, Continuation<? super A> continuation) {
        super(2, continuation);
        this.f92302r = b12;
        this.f92303s = arguments;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new A(this.f92302r, this.f92303s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<AuctionSendingResult>> continuation) {
        return ((A) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f92301q;
        B b12 = this.f92302r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC48373a interfaceC48373a = b12.f92308b;
            AuctionAddLink.Arguments arguments = this.f92303s;
            this.f92301q = 1;
            obj = interfaceC48373a.c(arguments.f133015c, arguments.f133014b, arguments.f133016d, this);
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
            return new TypedResult.Success(new AuctionSendingResult(b12.f92311e.b(((C48679a) ((TypedResult.Success) typedResult).getResult()).getDeepLinkUri())));
        }
        if (!(typedResult instanceof TypedResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        TypedResult.Error error = (TypedResult.Error) typedResult;
        C35936s.a(error.getError(), error.getCause());
        return error;
    }
}
