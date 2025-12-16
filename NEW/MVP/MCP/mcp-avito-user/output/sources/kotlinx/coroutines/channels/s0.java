package kotlinx.coroutines.channels;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"E", "Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {299, 300, 301}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
/* loaded from: classes8.dex */
final class s0 extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43125y f410987q;

    /* renamed from: r, reason: collision with root package name */
    public Object f410988r;

    /* renamed from: s, reason: collision with root package name */
    public int f410989s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f410990t;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((I0) obj, (Continuation) obj2)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43125y interfaceC43125y;
        I0 i02;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f410989s;
        if (i12 == 0) {
            C42729a0.b(obj);
            throw null;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                Object obj2 = this.f410988r;
                InterfaceC43125y interfaceC43125y2 = this.f410987q;
                I0 i03 = (I0) this.f410990t;
                C42729a0.b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return kotlin.G0.f406611a;
                }
                this.f410990t = i03;
                this.f410987q = interfaceC43125y2;
                this.f410988r = null;
                this.f410989s = 3;
                if (i03.send(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43125y = interfaceC43125y2;
                i02 = i03;
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC43125y = this.f410987q;
                i02 = (I0) this.f410990t;
                C42729a0.b(obj);
            }
            this.f410990t = i02;
            this.f410987q = interfaceC43125y;
            this.f410989s = 1;
            obj = interfaceC43125y.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            interfaceC43125y = this.f410987q;
            i02 = (I0) this.f410990t;
            C42729a0.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            return kotlin.G0.f406611a;
        }
        Object next = interfaceC43125y.next();
        this.f410990t = i02;
        this.f410987q = interfaceC43125y;
        this.f410988r = next;
        this.f410989s = 2;
        throw null;
    }
}
