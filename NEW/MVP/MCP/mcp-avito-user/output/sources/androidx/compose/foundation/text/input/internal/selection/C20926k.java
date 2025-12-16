package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20321u;
import androidx.compose.animation.core.R0;
import androidx.compose.foundation.text.selection.C21031p0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AndroidTextFieldMagnifier.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28$restartAnimationJob$1$2$1", f = "AndroidTextFieldMagnifier.android.kt", i = {}, l = {160}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.foundation.text.input.internal.selection.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20926k extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f31390q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20925j f31391r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f31392s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20926k(C20925j c20925j, long j12, Continuation<? super C20926k> continuation) {
        super(2, continuation);
        this.f31391r = c20925j;
        this.f31392s = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new C20926k(this.f31391r, this.f31392s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C20926k) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f31390q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C20268c<l0.g, C20321u> c20268c = this.f31391r.f31379w;
            l0.g gVarA = l0.g.a(this.f31392s);
            R0<l0.g> r02 = C21031p0.f32103d;
            this.f31390q = 1;
            if (C20268c.c(c20268c, gVarA, r02, null, null, this, 12) == coroutine_suspended) {
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
