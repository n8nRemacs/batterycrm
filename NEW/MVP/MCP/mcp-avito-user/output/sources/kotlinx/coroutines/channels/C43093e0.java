package kotlinx.coroutines.channels;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "R", "Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {351, 352, 352}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
/* renamed from: kotlinx.coroutines.channels.e0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43093e0 extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43125y f410885q;

    /* renamed from: r, reason: collision with root package name */
    public int f410886r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f410887s;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C43093e0) create((I0) obj, (Continuation) obj2)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43125y interfaceC43125y;
        I0 i02;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f410886r;
        if (i12 == 0) {
            C42729a0.b(obj);
            throw null;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                interfaceC43125y = this.f410885q;
                I0 i03 = (I0) this.f410887s;
                C42729a0.b(obj);
                this.f410887s = i03;
                this.f410885q = interfaceC43125y;
                this.f410886r = 3;
                if (D.b((K0) obj, i03, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i02 = i03;
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC43125y = this.f410885q;
                i02 = (I0) this.f410887s;
                C42729a0.b(obj);
            }
            this.f410887s = i02;
            this.f410885q = interfaceC43125y;
            this.f410886r = 1;
            obj = interfaceC43125y.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            interfaceC43125y = this.f410885q;
            i02 = (I0) this.f410887s;
            C42729a0.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            return kotlin.G0.f406611a;
        }
        interfaceC43125y.next();
        this.f410887s = i02;
        this.f410885q = interfaceC43125y;
        this.f410886r = 2;
        throw null;
    }
}
