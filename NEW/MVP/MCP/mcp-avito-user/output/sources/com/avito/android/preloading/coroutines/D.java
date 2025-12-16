package com.avito.android.preloading.coroutines;

import com.avito.android.preloading.coroutines.G;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Utils.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/preloading/coroutines/G;", "vc", "", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/preloading/coroutines/G;)Z"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.preloading.coroutines.UtilsKt$dematerializeCompletion$1", f = "Utils.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class D extends SuspendLambda implements Y41.q<InterfaceC43172j<Object>, G<Object>, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f221789q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f221790r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ G f221791s;

    public D() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<Object> interfaceC43172j, G<Object> g12, Continuation<? super Boolean> continuation) {
        D d12 = new D(3, continuation);
        d12.f221790r = interfaceC43172j;
        d12.f221791s = g12;
        return d12.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f221789q;
        boolean z12 = true;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f221790r;
            G g12 = this.f221791s;
            if (g12 instanceof G.b) {
                T t12 = ((G.b) g12).f221797a;
                this.f221790r = null;
                this.f221789q = 1;
                if (interfaceC43172j.emit(t12, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(g12 instanceof G.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Throwable th2 = ((G.a) g12).f221796a;
                if (th2 != null) {
                    throw th2;
                }
                z12 = false;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return Boxing.boxBoolean(z12);
    }
}
