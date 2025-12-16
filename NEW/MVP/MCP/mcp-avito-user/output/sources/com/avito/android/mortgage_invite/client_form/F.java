package com.avito.android.mortgage_invite.client_form;

import U10.b;
import androidx.compose.foundation.lazy.w0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ApplicationClientFormScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.client_form.ApplicationClientFormScreenKt$ApplicationClientFormScreen$1$1$2", f = "ApplicationClientFormScreen.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class F extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f205045q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w0 f205046r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ U10.b f205047s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(w0 w0Var, U10.b bVar, Continuation<? super F> continuation) {
        super(2, continuation);
        this.f205046r = w0Var;
        this.f205047s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new F(this.f205046r, this.f205047s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((F) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f205045q;
        if (i12 == 0) {
            C42729a0.b(obj);
            int i13 = ((b.e) this.f205047s).f16105a;
            this.f205045q = 1;
            w0.c cVar = w0.f29712w;
            if (this.f205046r.f(i13, 0, this) == coroutine_suspended) {
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
