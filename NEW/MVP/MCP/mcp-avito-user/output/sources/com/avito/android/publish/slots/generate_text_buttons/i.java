package com.avito.android.publish.slots.generate_text_buttons;

import Y41.p;
import dl0.InterfaceC39749a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: GenerateTextButtonsSlotWrapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.slots.generate_text_buttons.GenerateTextButtonsSlotWrapper$sendAnalytics$1", f = "GenerateTextButtonsSlotWrapper.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class i extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f243975q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f243976r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f243976r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new i(this.f243976r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((i) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f243975q;
        if (i12 == 0) {
            C42729a0.b(obj);
            c cVar = this.f243976r;
            synchronized (cVar) {
                if (cVar.f243956m) {
                    return G0.f406611a;
                }
                cVar.f243956m = true;
                G0 g02 = G0.f406611a;
                c cVar2 = this.f243976r;
                InterfaceC39749a interfaceC39749a = cVar2.f243946c;
                boolean z12 = !cVar2.f243957n.isEmpty();
                c cVar3 = this.f243976r;
                boolean z13 = !C42745f0.r(cVar3.f243957n, cVar3.f243950g.getValue());
                this.f243975q = 1;
                if (interfaceC39749a.m(z12, z13, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
