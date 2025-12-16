package androidx.compose.material3;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", i = {}, l = {440}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material3.kg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21683kg extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f36759q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C20268c<Float, C20318t> f36760r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f36761s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.animation.core.G1 f36762t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f36763u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21683kg(C20268c c20268c, boolean z12, androidx.compose.animation.core.G1 g12, Y41.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f36760r = c20268c;
        this.f36761s = z12;
        this.f36762t = g12;
        this.f36763u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C21683kg(this.f36760r, this.f36761s, this.f36762t, this.f36763u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C21683kg) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f36759q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Float fBoxFloat = Boxing.boxFloat(this.f36761s ? 1.0f : 0.0f);
            this.f36759q = 1;
            if (C20268c.c(this.f36760r, fBoxFloat, this.f36762t, null, null, this, 12) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        this.f36763u.invoke();
        return kotlin.G0.f406611a;
    }
}
