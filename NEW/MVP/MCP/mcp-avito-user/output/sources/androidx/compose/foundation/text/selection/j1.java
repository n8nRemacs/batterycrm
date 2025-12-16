package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.i3;
import androidx.compose.ui.text.C22602e;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TextFieldSelectionManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", f = "TextFieldSelectionManager.kt", i = {}, l = {647}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class j1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f32047q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C21011f1 f32048r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(C21011f1 c21011f1, Continuation<? super j1> continuation) {
        super(2, continuation);
        this.f32048r = c21011f1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new j1(this.f32048r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((j1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C22602e c22602eB;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f32047q;
        C21011f1 c21011f1 = this.f32048r;
        if (i12 == 0) {
            C42729a0.b(obj);
            androidx.compose.ui.platform.M0 m02 = c21011f1.f31990h;
            if (m02 != null) {
                this.f32047q = 1;
                obj = m02.a();
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.G0.f406611a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        androidx.compose.ui.platform.K0 k02 = (androidx.compose.ui.platform.K0) obj;
        if (k02 != null && (c22602eB = androidx.compose.foundation.internal.b.b(k02)) != null) {
            C22602e.b bVar = new C22602e.b(androidx.compose.ui.text.input.X.c(c21011f1.m(), c21011f1.m().f42383a.f42127c.length()));
            bVar.d(c22602eB);
            C22602e c22602eM = bVar.m();
            C22602e c22602eB2 = androidx.compose.ui.text.input.X.b(c21011f1.m(), c21011f1.m().f42383a.f42127c.length());
            C22602e.b bVar2 = new C22602e.b(c22602eM);
            bVar2.d(c22602eB2);
            C22602e c22602eM2 = bVar2.m();
            int length = c22602eB.f42127c.length() + androidx.compose.ui.text.v0.g(c21011f1.m().f42384b);
            c21011f1.f31985c.invoke(C21011f1.e(c22602eM2, androidx.compose.ui.text.w0.a(length, length)));
            c21011f1.r(HandleState.f30333b);
            i3 i3Var = c21011f1.f31983a;
            if (i3Var != null) {
                i3Var.f30751f = true;
            }
            return kotlin.G0.f406611a;
        }
        return kotlin.G0.f406611a;
    }
}
