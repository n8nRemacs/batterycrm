package kotlinx.coroutines.flow.internal;

import com.facebook.imageutils.JfifUtil;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.internal.g0;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/internal/I;", "T", "Lkotlinx/coroutines/flow/j;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class I<T> implements InterfaceC43172j<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f411448b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f411449c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.p<T, Continuation<? super G0>, Object> f411450d;

    /* compiled from: ChannelFlow.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", i = {}, l = {JfifUtil.MARKER_RST0}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f411451q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f411452r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<T> f411453s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43172j<? super T> interfaceC43172j, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f411453s = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f411453s, continuation);
            aVar.f411452r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Continuation<? super G0> continuation) {
            return ((a) create(obj, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f411451q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Object obj2 = this.f411452r;
                this.f411451q = 1;
                if (this.f411453s.emit(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    public I(@Y61.k InterfaceC43172j<? super T> interfaceC43172j, @Y61.k CoroutineContext coroutineContext) {
        this.f411448b = coroutineContext;
        this.f411449c = coroutineContext.fold(0, g0.f411899b);
        this.f411450d = new a(interfaceC43172j, null);
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    public final Object emit(T t12, @Y61.k Continuation<? super G0> continuation) {
        Object objA = C43169g.a(this.f411448b, t12, this.f411449c, this.f411450d, continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }
}
