package androidx.compose.material3;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20318t;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Chip.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.SelectableChipElevation$animateElevation$2$1", f = "Chip.kt", i = {}, l = {2329, 2331}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class Ae extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f34511q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20268c<androidx.compose.ui.unit.h, C20318t> f34512r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f34513s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f34514t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.j f34515u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<androidx.compose.foundation.interaction.j> f34516v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ae(C20268c<androidx.compose.ui.unit.h, C20318t> c20268c, float f12, boolean z12, androidx.compose.foundation.interaction.j jVar, InterfaceC22204y1<androidx.compose.foundation.interaction.j> interfaceC22204y1, Continuation<? super Ae> continuation) {
        super(2, continuation);
        this.f34512r = c20268c;
        this.f34513s = f12;
        this.f34514t = z12;
        this.f34515u = jVar;
        this.f34516v = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new Ae(this.f34512r, this.f34513s, this.f34514t, this.f34515u, this.f34516v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((Ae) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f34511q;
        androidx.compose.foundation.interaction.j jVar = this.f34515u;
        InterfaceC22204y1<androidx.compose.foundation.interaction.j> interfaceC22204y1 = this.f34516v;
        if (i12 == 0) {
            C42729a0.b(obj);
            C20268c<androidx.compose.ui.unit.h, C20318t> c20268c = this.f34512r;
            float f12 = ((androidx.compose.ui.unit.h) ((C22082i3) c20268c.f26227f).getF42167b()).f42852b;
            float f13 = this.f34513s;
            if (!androidx.compose.ui.unit.h.b(f12, f13)) {
                if (this.f34514t) {
                    androidx.compose.foundation.interaction.j f42167b = interfaceC22204y1.getF42167b();
                    this.f34511q = 2;
                    if (X6.a(c20268c, f13, f42167b, jVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    androidx.compose.ui.unit.h hVarA = androidx.compose.ui.unit.h.a(f13);
                    this.f34511q = 1;
                    if (c20268c.h(hVarA, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return kotlin.G0.f406611a;
        }
        if (i12 != 1 && i12 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        interfaceC22204y1.setValue(jVar);
        return kotlin.G0.f406611a;
    }
}
