package com.avito.android.tariff.cpr.common;

import Y41.l;
import Y41.p;
import Y61.k;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;

/* compiled from: CoroutinesExtensions.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.tariff.cpr.common.CoroutinesExtensionsKt$debounce$1$1", f = "CoroutinesExtensions.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f295135q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l<Object, G0> f295136r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f295137s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0.h<N0> f295138t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(l lVar, Object obj, l0.h hVar, Continuation continuation) {
        super(2, continuation);
        this.f295136r = lVar;
        this.f295137s = obj;
        this.f295138t = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new a(this.f295136r, this.f295137s, this.f295138t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f295135q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f295136r.invoke(this.f295137s);
            this.f295135q = 1;
            if (C43131e0.b(300L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        this.f295138t.f406842b = null;
        return G0.f406611a;
    }
}
