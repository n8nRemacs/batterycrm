package kotlinx.coroutines.channels;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Deprecated.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "R", "Lkotlinx/coroutines/channels/I0;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {374, 375, 375}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
/* renamed from: kotlinx.coroutines.channels.k0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43105k0 extends SuspendLambda implements Y41.p<I0<Object>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43125y f410923q;

    /* renamed from: r, reason: collision with root package name */
    public I0 f410924r;

    /* renamed from: s, reason: collision with root package name */
    public int f410925s;

    /* renamed from: t, reason: collision with root package name */
    public int f410926t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f410927u;

    public C43105k0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        throw null;
    }

    @Override // Y41.p
    public final Object invoke(I0<Object> i02, Continuation<? super kotlin.G0> continuation) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        int i12;
        InterfaceC43125y interfaceC43125y;
        I0 i02;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = this.f410926t;
        if (i13 == 0) {
            C42729a0.b(obj);
            throw null;
        }
        if (i13 != 1) {
            if (i13 == 2) {
                i12 = this.f410925s;
                I0 i03 = this.f410924r;
                InterfaceC43125y interfaceC43125y2 = this.f410923q;
                I0 i04 = (I0) this.f410927u;
                C42729a0.b(obj);
                this.f410927u = i04;
                this.f410923q = interfaceC43125y2;
                this.f410924r = null;
                this.f410925s = i12;
                this.f410926t = 3;
                if (i03.send(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43125y = interfaceC43125y2;
                i02 = i04;
            } else {
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i12 = this.f410925s;
                interfaceC43125y = this.f410923q;
                i02 = (I0) this.f410927u;
                C42729a0.b(obj);
            }
            this.f410927u = i02;
            this.f410923q = interfaceC43125y;
            this.f410925s = i12;
            this.f410926t = 1;
            obj = interfaceC43125y.a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            i12 = this.f410925s;
            interfaceC43125y = this.f410923q;
            i02 = (I0) this.f410927u;
            C42729a0.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            return kotlin.G0.f406611a;
        }
        interfaceC43125y.next();
        Boxing.boxInt(i12);
        this.f410927u = i02;
        this.f410923q = interfaceC43125y;
        this.f410924r = i02;
        this.f410925s = i12 + 1;
        this.f410926t = 2;
        throw null;
    }
}
