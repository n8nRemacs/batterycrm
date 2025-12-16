package com.avito.android.extended_profile_serp;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ExtendedProfileSerpView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_serp.ExtendedProfileSerpView$initInlineFilters$8", f = "ExtendedProfileSerpView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class Q extends SuspendLambda implements Y41.p<Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f152569q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F f152570r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(F f12, Continuation<? super Q> continuation) {
        super(2, continuation);
        this.f152570r = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        Q q12 = new Q(this.f152570r, continuation);
        q12.f152569q = obj;
        return q12;
    }

    @Override // Y41.p
    public final Object invoke(Throwable th2, Continuation<? super G0> continuation) {
        return ((Q) create(th2, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Throwable th2 = (Throwable) this.f152569q;
        F f12 = this.f152570r;
        f12.getClass();
        com.avito.android.extended_profile_ui_components.p.c(com.avito.android.extended_profile_ui_components.p.f153373a, f12.f152525b, th2, f12.f152541r, null);
        return G0.f406611a;
    }
}
