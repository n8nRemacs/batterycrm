package io.ktor.client.plugins.logging;

import io.ktor.utils.io.C41619a;
import io.ktor.utils.io.core.S;
import java.nio.charset.Charset;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: Logging.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.client.plugins.logging.Logging$logRequestBody$2", f = "Logging.kt", i = {0}, l = {268}, m = "invokeSuspend", n = {"charset$iv"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class l extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Charset f399532q;

    /* renamed from: r, reason: collision with root package name */
    public int f399533r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C41619a f399534s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Charset f399535t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ StringBuilder f399536u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C41619a c41619a, Charset charset, StringBuilder sb2, Continuation continuation) {
        super(2, continuation);
        this.f399534s = c41619a;
        this.f399535t = charset;
        this.f399536u = sb2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new l(this.f399534s, this.f399535t, this.f399536u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((l) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String strC;
        Charset charset;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f399533r;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                C41619a c41619a = this.f399534s;
                Charset charset2 = this.f399535t;
                this.f399532q = charset2;
                this.f399533r = 1;
                obj = c41619a.I(Long.MAX_VALUE, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                charset = charset2;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                charset = this.f399532q;
                C42729a0.b(obj);
            }
            strC = S.c((io.ktor.utils.io.core.x) obj, charset);
        } catch (Throwable unused) {
            strC = null;
        }
        if (strC == null) {
            strC = "[request body omitted]";
        }
        StringBuilder sb2 = this.f399536u;
        sb2.append("BODY START");
        sb2.append('\n');
        sb2.append(strC);
        sb2.append('\n');
        sb2.append("BODY END");
        return G0.f406611a;
    }
}
