package androidx.compose.material3;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20318t;
import androidx.compose.foundation.interaction.a;
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

/* compiled from: Card.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.CardElevation$animateElevation$2$1", f = "Card.kt", i = {}, l = {732, 741}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material3.t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21875t2 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f37290q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20268c<androidx.compose.ui.unit.h, C20318t> f37291r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f37292s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f37293t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C21897u2 f37294u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.j f37295v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21875t2(C20268c<androidx.compose.ui.unit.h, C20318t> c20268c, float f12, boolean z12, C21897u2 c21897u2, androidx.compose.foundation.interaction.j jVar, Continuation<? super C21875t2> continuation) {
        super(2, continuation);
        this.f37291r = c20268c;
        this.f37292s = f12;
        this.f37293t = z12;
        this.f37294u = c21897u2;
        this.f37295v = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C21875t2(this.f37291r, this.f37292s, this.f37293t, this.f37294u, this.f37295v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C21875t2) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f37290q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C20268c<androidx.compose.ui.unit.h, C20318t> c20268c = this.f37291r;
            float f12 = ((androidx.compose.ui.unit.h) ((C22082i3) c20268c.f26227f).getF42167b()).f42852b;
            float f13 = this.f37292s;
            if (!androidx.compose.ui.unit.h.b(f12, f13)) {
                if (this.f37293t) {
                    float f14 = ((androidx.compose.ui.unit.h) ((C22082i3) c20268c.f26227f).getF42167b()).f42852b;
                    C21897u2 c21897u2 = this.f37294u;
                    androidx.compose.foundation.interaction.j bVar = null;
                    if (androidx.compose.ui.unit.h.b(f14, c21897u2.f37394b)) {
                        l0.g.f413384b.getClass();
                        bVar = new o.b(0L, null);
                    } else if (androidx.compose.ui.unit.h.b(f14, c21897u2.f37396d)) {
                        bVar = new g.a();
                    } else if (androidx.compose.ui.unit.h.b(f14, c21897u2.f37395c)) {
                        bVar = new d.a();
                    } else if (androidx.compose.ui.unit.h.b(f14, c21897u2.f37397e)) {
                        bVar = new a.b();
                    }
                    this.f37290q = 2;
                    if (X6.a(c20268c, f13, bVar, this.f37295v, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    androidx.compose.ui.unit.h hVarA = androidx.compose.ui.unit.h.a(f13);
                    this.f37290q = 1;
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
