package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.d2;
import androidx.compose.foundation.gestures.F1;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TextFieldCoreModifier.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode$updateScrollState$1", f = "TextFieldCoreModifier.kt", i = {}, l = {447, 450}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class P0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f30894q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ O0 f30895r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f30896s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0.j f30897t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(O0 o02, float f12, l0.j jVar, Continuation<? super P0> continuation) {
        super(2, continuation);
        this.f30895r = o02;
        this.f30896s = f12;
        this.f30897t = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new P0(this.f30895r, this.f30896s, this.f30897t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((P0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f30894q;
        O0 o02 = this.f30895r;
        if (i12 == 0) {
            C42729a0.b(obj);
            d2 d2Var = o02.f30881y;
            float f12 = L0.f30854a;
            float fCeil = this.f30896s;
            if (!Float.isNaN(fCeil) && !Float.isInfinite(fCeil)) {
                fCeil = (float) (fCeil > 0.0f ? Math.ceil(fCeil) : Math.floor(fCeil));
            }
            this.f30894q = 1;
            if (F1.b(d2Var, fCeil, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return kotlin.G0.f406611a;
            }
            C42729a0.b(obj);
        }
        androidx.compose.foundation.relocation.a aVar = o02.f30876t.f31206g;
        this.f30894q = 2;
        if (aVar.a(this.f30897t, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.G0.f406611a;
    }
}
