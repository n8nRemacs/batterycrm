package androidx.compose.material3;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20318t;
import androidx.compose.foundation.interaction.d;
import androidx.compose.foundation.interaction.g;
import androidx.compose.foundation.interaction.o;
import androidx.compose.runtime.C22082i3;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", f = "Button.kt", i = {}, l = {952, 960}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class Z1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f35960q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20268c<androidx.compose.ui.unit.h, C20318t> f35961r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f35962s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f35963t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C21440a2 f35964u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.j f35965v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z1(C20268c<androidx.compose.ui.unit.h, C20318t> c20268c, float f12, boolean z12, C21440a2 c21440a2, androidx.compose.foundation.interaction.j jVar, Continuation<? super Z1> continuation) {
        super(2, continuation);
        this.f35961r = c20268c;
        this.f35962s = f12;
        this.f35963t = z12;
        this.f35964u = c21440a2;
        this.f35965v = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new Z1(this.f35961r, this.f35962s, this.f35963t, this.f35964u, this.f35965v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((Z1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f35960q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C20268c<androidx.compose.ui.unit.h, C20318t> c20268c = this.f35961r;
            float f12 = ((androidx.compose.ui.unit.h) ((C22082i3) c20268c.f26227f).getF42167b()).f42852b;
            float f13 = this.f35962s;
            if (!androidx.compose.ui.unit.h.b(f12, f13)) {
                if (this.f35963t) {
                    float f14 = ((androidx.compose.ui.unit.h) ((C22082i3) c20268c.f26227f).getF42167b()).f42852b;
                    C21440a2 c21440a2 = this.f35964u;
                    androidx.compose.foundation.interaction.j aVar = null;
                    if (androidx.compose.ui.unit.h.b(f14, c21440a2.f36012b)) {
                        l0.g.f413384b.getClass();
                        aVar = new o.b(0L, null);
                    } else if (androidx.compose.ui.unit.h.b(f14, c21440a2.f36014d)) {
                        aVar = new g.a();
                    } else if (androidx.compose.ui.unit.h.b(f14, c21440a2.f36013c)) {
                        aVar = new d.a();
                    }
                    this.f35960q = 2;
                    if (X6.a(c20268c, f13, aVar, this.f35965v, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    androidx.compose.ui.unit.h hVarA = androidx.compose.ui.unit.h.a(f13);
                    this.f35960q = 1;
                    if (c20268c.h(hVarA, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
