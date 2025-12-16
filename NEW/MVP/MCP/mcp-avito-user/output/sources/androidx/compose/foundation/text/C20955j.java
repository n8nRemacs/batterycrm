package androidx.compose.foundation.text;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: BasicSecureTextField.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.BasicSecureTextFieldKt$BasicSecureTextField$1$1", f = "BasicSecureTextField.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.foundation.text.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20955j extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f31535q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ M1 f31536r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20955j(M1 m12, Continuation<? super C20955j> continuation) {
        super(2, continuation);
        this.f31536r = m12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new C20955j(this.f31536r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C20955j) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f31535q;
        if (i12 == 0) {
            C42729a0.b(obj);
            this.f31535q = 1;
            M1 m12 = this.f31536r;
            m12.getClass();
            Object objJ = C43175k.j(C43175k.m(null), new K1(m12, null), this);
            if (objJ != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objJ = kotlin.G0.f406611a;
            }
            if (objJ == coroutine_suspended) {
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
