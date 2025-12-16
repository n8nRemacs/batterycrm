package com.akita.compose.component.badge;

import Y41.p;
import Y61.l;
import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20310q;
import androidx.compose.animation.core.C20318t;
import androidx.compose.animation.core.InterfaceC20307p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: Badge.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.akita.compose.component.badge.BadgeKt$Badge$3$1", f = "Badge.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f60343q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20268c<Float, C20318t> f60344r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i f60345s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f60346t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C20268c<Float, C20318t> c20268c, i iVar, boolean z12, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f60344r = c20268c;
        this.f60345s = iVar;
        this.f60346t = z12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        return new b(this.f60344r, this.f60345s, this.f60346t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f60343q;
        if (i12 == 0) {
            C42729a0.b(obj);
            i iVar = this.f60345s;
            h hVar = iVar.f60414o;
            Float fBoxFloat = Boxing.boxFloat(1.0f);
            h hVar2 = iVar.f60414o;
            InterfaceC20307p interfaceC20307pC = (hVar2 == null || !this.f60346t) ? C20310q.c() : C20310q.e(300, 0, hVar2.f60399a, 2);
            this.f60343q = 1;
            if (C20268c.c(this.f60344r, fBoxFloat, interfaceC20307pC, null, null, this, 12) == coroutine_suspended) {
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
