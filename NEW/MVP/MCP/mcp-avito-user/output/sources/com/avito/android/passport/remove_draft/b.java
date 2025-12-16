package com.avito.android.passport.remove_draft;

import Y41.p;
import com.avito.android.deep_linking.links.PassportRemoveDraftLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: PassportRemoveDraftAsyncDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.remove_draft.PassportRemoveDraftAsyncDeeplinkHandler$doHandle$1", f = "PassportRemoveDraftAsyncDeeplinkHandler.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f213889q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f213890r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PassportRemoveDraftLink f213891s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, PassportRemoveDraftLink passportRemoveDraftLink, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f213890r = aVar;
        this.f213891s = passportRemoveDraftLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f213890r, this.f213891s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f213889q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f213889q = 1;
            if (a.k(this.f213890r, this.f213891s, this) == coroutine_suspended) {
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
