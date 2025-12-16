package androidx.compose.material;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20318t;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.SnackbarHostKt$animatedScale$1$1", f = "SnackbarHost.kt", i = {}, l = {354}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material.i9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21211i9 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f33655q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20268c<Float, C20318t> f33656r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f33657s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.animation.core.G1 f33658t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21211i9(C20268c c20268c, boolean z12, androidx.compose.animation.core.G1 g12, Continuation continuation) {
        super(2, continuation);
        this.f33656r = c20268c;
        this.f33657s = z12;
        this.f33658t = g12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new C21211i9(this.f33656r, this.f33657s, this.f33658t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C21211i9) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f33655q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Float fBoxFloat = Boxing.boxFloat(this.f33657s ? 1.0f : 0.8f);
            this.f33655q = 1;
            if (C20268c.c(this.f33656r, fBoxFloat, this.f33658t, null, null, this, 12) == coroutine_suspended) {
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
