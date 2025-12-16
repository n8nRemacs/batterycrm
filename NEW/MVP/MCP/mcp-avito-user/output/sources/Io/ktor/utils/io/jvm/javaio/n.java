package io.ktor.utils.io.jvm.javaio;

import com.yandex.metrica.YandexMetricaDefaultValues;
import io.ktor.utils.io.X;
import io.ktor.utils.io.e2;
import io.ktor.utils.io.pool.a;
import java.io.IOException;
import java.io.InputStream;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Reading.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/e2;", "Lkotlin/G0;", "<anonymous>", "(Lio/ktor/utils/io/e2;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$2", f = "Reading.kt", i = {0, 0}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "invokeSuspend", n = {"$this$writer", "buffer"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class n extends SuspendLambda implements Y41.p<e2, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public byte[] f401145q;

    /* renamed from: r, reason: collision with root package name */
    public int f401146r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f401147s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.C11427a f401148t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InputStream f401149u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a.C11427a c11427a, InputStream inputStream, Continuation continuation) {
        super(2, continuation);
        this.f401148t = c11427a;
        this.f401149u = inputStream;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        n nVar = new n(this.f401148t, this.f401149u, continuation);
        nVar.f401147s = obj;
        return nVar;
    }

    @Override // Y41.p
    public final Object invoke(e2 e2Var, Continuation<? super G0> continuation) {
        return ((n) create(e2Var, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws IOException {
        byte[] bArrS2;
        e2 e2Var;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f401146r;
        InputStream inputStream = this.f401149u;
        a.C11427a c11427a = this.f401148t;
        if (i12 == 0) {
            C42729a0.b(obj);
            e2 e2Var2 = (e2) this.f401147s;
            bArrS2 = c11427a.S2();
            e2Var = e2Var2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArrS2 = this.f401145q;
            e2Var = (e2) this.f401147s;
            try {
                C42729a0.b(obj);
            } catch (Throwable th2) {
                try {
                    e2Var.a().h(th2);
                    c11427a.G4(bArrS2);
                } catch (Throwable th3) {
                    c11427a.G4(bArrS2);
                    inputStream.close();
                    throw th3;
                }
            }
        }
        while (true) {
            int i13 = inputStream.read(bArrS2, 0, bArrS2.length);
            if (i13 < 0) {
                c11427a.G4(bArrS2);
                break;
            }
            if (i13 != 0) {
                X xA2 = e2Var.a();
                this.f401147s = e2Var;
                this.f401145q = bArrS2;
                this.f401146r = 1;
                if (xA2.D(bArrS2, 0, i13, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        inputStream.close();
        return G0.f406611a;
    }
}
