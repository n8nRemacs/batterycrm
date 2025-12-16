package androidx.work.multiprocess;

import android.os.IInterface;
import com.google.common.util.concurrent.D0;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: RemoteExecute.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/os/IInterface;", "T", "Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)[B"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.work.multiprocess.RemoteExecuteKt$execute$1", f = "RemoteExecute.kt", i = {}, l = {43, 50}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class k extends SuspendLambda implements Y41.p<T, Continuation<? super byte[]>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f56164q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D0<IInterface> f56165r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC23629j<IInterface> f56166s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(D0<IInterface> d02, InterfaceC23629j<IInterface> interfaceC23629j, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f56165r = d02;
        this.f56166s = interfaceC23629j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new k(this.f56165r, this.f56166s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super byte[]> continuation) {
        return ((k) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f56164q;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                D0<IInterface> d02 = this.f56165r;
                this.f56164q = 1;
                obj = androidx.concurrent.futures.d.a(d02, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 == 2) {
                        C42729a0.b(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            IInterface iInterface = (IInterface) obj;
            this.f56164q = 2;
            obj = o.a(iInterface, this.f56166s, this);
            return obj == coroutine_suspended ? coroutine_suspended : obj;
        } catch (Throwable th2) {
            if (!(th2 instanceof CancellationException)) {
                androidx.work.G gA2 = androidx.work.G.a();
                int i13 = C23625f.f56154e;
                gA2.getClass();
            }
            throw th2;
        }
    }
}
