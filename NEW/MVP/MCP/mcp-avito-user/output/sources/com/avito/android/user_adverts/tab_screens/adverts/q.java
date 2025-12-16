package com.avito.android.user_adverts.tab_screens.adverts;

import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: UserAdvertsListMviFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$collectActions$1", f = "UserAdvertsListMviFragment.kt", i = {}, l = {699}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class q extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315531q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsListMviFragment f315532r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f315533s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f315534t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(UserAdvertsListMviFragment userAdvertsListMviFragment, Lifecycle.State state, Y41.p<? super T, ? super Continuation<? super G0>, ? extends Object> pVar, Continuation<? super q> continuation) {
        super(2, continuation);
        this.f315532r = userAdvertsListMviFragment;
        this.f315533s = state;
        this.f315534t = (SuspendLambda) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new q(this.f315532r, this.f315533s, this.f315534t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((q) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315531q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f315531q = 1;
            if (C23056p0.b(this.f315532r, this.f315533s, this.f315534t, this) == coroutine_suspended) {
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
