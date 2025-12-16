package com.akita.compose.component.toast_bar;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20318t;
import androidx.compose.animation.core.G1;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: ToastBarHost.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.akita.compose.component.toast_bar.ToastBarHostKt$animatedTranslation$2", f = "ToastBarHost.kt", i = {}, l = {205}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class t extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f63278q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20268c<Float, C20318t> f63279r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f63280s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f63281t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G1 f63282u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f63283v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C20268c c20268c, boolean z12, float f12, G1 g12, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f63279r = c20268c;
        this.f63280s = z12;
        this.f63281t = f12;
        this.f63282u = g12;
        this.f63283v = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        G1 g12 = this.f63282u;
        InterfaceC22204y1 interfaceC22204y1 = this.f63283v;
        return new t(this.f63279r, this.f63280s, this.f63281t, g12, interfaceC22204y1, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((t) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f63278q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Float fBoxFloat = Boxing.boxFloat(this.f63280s ? 0.0f : this.f63281t);
            this.f63278q = 1;
            if (C20268c.c(this.f63279r, fBoxFloat, this.f63282u, null, null, this, 12) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        float f12 = q.f63273a;
        ((Y41.a) this.f63283v.getF42167b()).invoke();
        return G0.f406611a;
    }
}
