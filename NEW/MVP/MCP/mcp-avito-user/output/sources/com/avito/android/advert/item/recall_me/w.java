package com.avito.android.advert.item.recall_me;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: RecallMeBlockPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.recall_me.RecallMeBlockPresenterImpl$verifyPhone$2", f = "RecallMeBlockPresenter.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class w extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f78551q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f78552r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f78553s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(o oVar, String str, Continuation<? super w> continuation) {
        super(1, continuation);
        this.f78552r = oVar;
        this.f78553s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
        return new w(this.f78552r, this.f78553s, continuation);
    }

    @Override // Y41.l
    public final Object invoke(Continuation<? super G0> continuation) {
        return ((w) create(continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f78551q;
        if (i12 == 0) {
            C42729a0.b(obj);
            o oVar = this.f78552r;
            this.f78551q = 1;
            if (oVar.f78488f.g(this.f78553s, this) == coroutine_suspended) {
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
