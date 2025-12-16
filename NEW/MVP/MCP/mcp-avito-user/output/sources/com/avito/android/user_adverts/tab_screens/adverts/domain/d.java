package com.avito.android.user_adverts.tab_screens.adverts.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import eJ0.C40014a;
import eJ0.C40016c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import pI0.j;

/* compiled from: UserAdvertsListInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LeJ0/c;", "<anonymous>", "(Lkotlinx/coroutines/T;)LeJ0/c;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.domain.UserAdvertsListInteractorImpl$userAdverts$2", f = "UserAdvertsListInteractor.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super C40016c>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f314975q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f314976r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C40014a f314977s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, C40014a c40014a, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f314976r = bVar;
        this.f314977s = c40014a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new d(this.f314976r, this.f314977s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super C40016c> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f314975q;
        if (i12 == 0) {
            C42729a0.b(obj);
            b bVar = this.f314976r;
            bVar.getClass();
            C40014a c40014a = this.f314977s;
            bVar.f314965c.c(new j(c40014a.f395093a, c40014a.f395101i));
            this.f314975q = 1;
            obj = U.c(new c(bVar, c40014a, null), this);
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
