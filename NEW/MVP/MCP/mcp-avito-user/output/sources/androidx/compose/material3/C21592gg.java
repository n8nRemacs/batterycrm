package androidx.compose.material3;

import androidx.compose.ui.platform.InterfaceC22458c;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", i = {}, l = {234}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material3.gg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21592gg extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f36443q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Xf f36444r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22458c f36445s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21592gg(Xf xf2, InterfaceC22458c interfaceC22458c, Continuation<? super C21592gg> continuation) {
        super(2, continuation);
        this.f36444r = xf2;
        this.f36445s = interfaceC22458c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C21592gg(this.f36444r, this.f36445s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C21592gg) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        long jA2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f36443q;
        Xf xf2 = this.f36444r;
        if (i12 == 0) {
            C42729a0.b(obj);
            if (xf2 != null) {
                SnackbarDuration f36845b = xf2.getF36842a().getF36845b();
                boolean z12 = xf2.getF36842a().a() != null;
                int iOrdinal = f36845b.ordinal();
                if (iOrdinal == 0) {
                    jA2 = 4000;
                } else if (iOrdinal == 1) {
                    jA2 = 10000;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jA2 = Long.MAX_VALUE;
                }
                InterfaceC22458c interfaceC22458c = this.f36445s;
                if (interfaceC22458c != null) {
                    jA2 = interfaceC22458c.a(jA2, z12);
                }
                this.f36443q = 1;
                if (C43131e0.b(jA2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.G0.f406611a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        xf2.dismiss();
        return kotlin.G0.f406611a;
    }
}
