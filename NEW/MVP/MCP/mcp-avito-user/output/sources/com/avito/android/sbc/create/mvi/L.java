package com.avito.android.sbc.create.mvi;

import Uo0.e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CreateDiscountDispatchActor.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u008a@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/avito/android/arch/mvi/utils/l;", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState;", "Lkotlin/Function2;", "LUo0/f;", "Lkotlin/coroutines/Continuation;", "Lkotlin/G0;", "", "it", "<anonymous>", "(Lcom/avito/android/arch/mvi/utils/l;LY41/p;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$handle$7", f = "CreateDiscountDispatchActor.kt", i = {}, l = {1426}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class L extends SuspendLambda implements Y41.q<com.avito.android.arch.mvi.utils.l<CreateDiscountDispatchState>, Y41.p<? super Uo0.f, ? super Continuation<? super kotlin.G0>, ? extends Object>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f259317q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ com.avito.android.arch.mvi.utils.l f259318r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Y41.p f259319s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34469a f259320t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e.C15547a f259321u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(C34469a c34469a, e.C15547a c15547a, Continuation<? super L> continuation) {
        super(3, continuation);
        this.f259320t = c34469a;
        this.f259321u = c15547a;
    }

    @Override // Y41.q
    public final Object invoke(com.avito.android.arch.mvi.utils.l<CreateDiscountDispatchState> lVar, Y41.p<? super Uo0.f, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, Continuation<? super kotlin.G0> continuation) {
        L l12 = new L(this.f259320t, this.f259321u, continuation);
        l12.f259318r = lVar;
        l12.f259319s = pVar;
        return l12.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f259317q;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.arch.mvi.utils.l lVar = this.f259318r;
            Y41.p pVar = this.f259319s;
            DeepLink deepLink = this.f259321u.f16619a;
            this.f259318r = null;
            this.f259317q = 1;
            if (C34469a.f(this.f259320t, lVar, deepLink, pVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
