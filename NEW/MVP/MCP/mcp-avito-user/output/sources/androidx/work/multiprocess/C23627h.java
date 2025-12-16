package androidx.work.multiprocess;

import com.google.common.util.concurrent.D0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: RemoteClientUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"I", "O", "Lkotlinx/coroutines/T;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.work.multiprocess.RemoteClientUtilsKt$map$1", f = "RemoteClientUtils.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.work.multiprocess.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C23627h extends SuspendLambda implements Y41.p<T, Continuation<Object>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public androidx.camera.core.processing.j f56160q;

    /* renamed from: r, reason: collision with root package name */
    public int f56161r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.processing.j f56162s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ D0<Object> f56163t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23627h(androidx.camera.core.processing.j jVar, D0 d02, Continuation continuation) {
        super(2, continuation);
        this.f56162s = jVar;
        this.f56163t = d02;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new C23627h(this.f56162s, this.f56163t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<Object> continuation) {
        return ((C23627h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        androidx.camera.core.processing.j jVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f56161r;
        if (i12 == 0) {
            C42729a0.b(obj);
            androidx.camera.core.processing.j jVar2 = this.f56162s;
            this.f56160q = jVar2;
            this.f56161r = 1;
            Object objA = androidx.concurrent.futures.d.a(this.f56163t, this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = jVar2;
            obj = objA;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = this.f56160q;
            C42729a0.b(obj);
        }
        return jVar.apply(obj);
    }
}
