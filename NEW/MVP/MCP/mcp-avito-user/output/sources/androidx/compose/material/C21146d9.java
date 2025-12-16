package androidx.compose.material;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.material.d9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21146d9 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f33531q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ U8 f33532r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22458c f33533s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21146d9(U8 u82, InterfaceC22458c interfaceC22458c, Continuation<? super C21146d9> continuation) {
        super(2, continuation);
        this.f33532r = u82;
        this.f33533s = interfaceC22458c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new C21146d9(this.f33532r, this.f33533s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C21146d9) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long jA2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f33531q;
        U8 u82 = this.f33532r;
        if (i12 == 0) {
            C42729a0.b(obj);
            if (u82 != null) {
                SnackbarDuration duration = u82.getDuration();
                boolean z12 = u82.a() != null;
                int iOrdinal = duration.ordinal();
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
                InterfaceC22458c interfaceC22458c = this.f33533s;
                if (interfaceC22458c != null) {
                    jA2 = interfaceC22458c.a(jA2, z12);
                }
                this.f33531q = 1;
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
        u82.dismiss();
        return kotlin.G0.f406611a;
    }
}
