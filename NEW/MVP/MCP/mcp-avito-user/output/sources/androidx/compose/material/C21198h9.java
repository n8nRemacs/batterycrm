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
@DebugMetadata(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", i = {}, l = {344}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material.h9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21198h9 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f33621q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20268c<Float, C20318t> f33622r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f33623s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.animation.core.G1 f33624t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f33625u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21198h9(C20268c c20268c, boolean z12, androidx.compose.animation.core.G1 g12, Y41.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f33622r = c20268c;
        this.f33623s = z12;
        this.f33624t = g12;
        this.f33625u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new C21198h9(this.f33622r, this.f33623s, this.f33624t, this.f33625u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C21198h9) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f33621q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Float fBoxFloat = Boxing.boxFloat(this.f33623s ? 1.0f : 0.0f);
            this.f33621q = 1;
            if (C20268c.c(this.f33622r, fBoxFloat, this.f33624t, null, null, this, 12) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        this.f33625u.invoke();
        return kotlin.G0.f406611a;
    }
}
