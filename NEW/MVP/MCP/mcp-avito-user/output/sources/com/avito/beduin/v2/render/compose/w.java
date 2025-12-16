package com.avito.beduin.v2.render.compose;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;

/* compiled from: RecompositionModifiers.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.render.compose.RecompositionModifiersKt$recomposeModifier$2$1", f = "RecompositionModifiers.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class w extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f338103q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Long> f338104r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Long[] f338105s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(InterfaceC22204y1<Long> interfaceC22204y1, Long[] lArr, Continuation<? super w> continuation) {
        super(2, continuation);
        this.f338104r = interfaceC22204y1;
        this.f338105s = lArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new w(this.f338104r, this.f338105s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((w) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f338103q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f338103q = 1;
            if (C43131e0.b(3000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        this.f338104r.setValue(this.f338105s[0]);
        return G0.f406611a;
    }
}
