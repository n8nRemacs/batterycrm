package androidx.compose.foundation.text;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", i = {}, l = {330}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class M0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f30478q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.relocation.a f30479r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.W f30480s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C20985q1 f30481t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Q2 f30482u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.L f30483v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(androidx.compose.foundation.relocation.a aVar, androidx.compose.ui.text.input.W w12, C20985q1 c20985q1, Q2 q22, androidx.compose.ui.text.input.L l12, Continuation<? super M0> continuation) {
        super(2, continuation);
        this.f30479r = aVar;
        this.f30480s = w12;
        this.f30481t = c20985q1;
        this.f30482u = q22;
        this.f30483v = l12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new M0(this.f30479r, this.f30480s, this.f30481t, this.f30482u, this.f30483v, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((M0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l0.j jVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f30478q;
        if (i12 == 0) {
            C42729a0.b(obj);
            U1 u12 = this.f30481t.f31778a;
            Q2 q22 = this.f30482u;
            this.f30478q = 1;
            int iB2 = this.f30483v.b(androidx.compose.ui.text.v0.f(this.f30480s.f42384b));
            androidx.compose.ui.text.o0 o0Var = q22.f30513a;
            if (iB2 < o0Var.f42526a.f42506a.f42127c.length()) {
                jVar = o0Var.b(iB2);
            } else if (iB2 != 0) {
                jVar = o0Var.b(iB2 - 1);
            } else {
                jVar = new l0.j(0.0f, 0.0f, 1.0f, (int) (C20866f2.a(u12.f30562b, u12.f30567g, u12.f30568h, C20866f2.f30708a, 1) & 4294967295L));
            }
            Object objA = this.f30479r.a(jVar, this);
            if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objA = kotlin.G0.f406611a;
            }
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
