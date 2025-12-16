package kotlinx.coroutines.flow;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Zip.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/R1"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class K1 extends SuspendLambda implements Y41.p<InterfaceC43172j<Object>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f411153q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f411154r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i[] f411155s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.r f411156t;

    /* compiled from: Zip.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V", "kotlinx/coroutines/flow/R1$a"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1", f = "Zip.kt", i = {}, l = {329}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC43172j<Object>, Object[], Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f411157q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f411158r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object[] f411159s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.r f411160t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Continuation continuation, Y41.r rVar) {
            super(3, continuation);
            this.f411160t = rVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<Object> interfaceC43172j, Object[] objArr, Continuation<? super kotlin.G0> continuation) {
            a aVar = new a(continuation, this.f411160t);
            aVar.f411158r = interfaceC43172j;
            aVar.f411159s = objArr;
            return aVar.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f411157q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f411158r;
                Object[] objArr = this.f411159s;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f411157q = 1;
                if (this.f411160t.invoke(interfaceC43172j, obj2, obj3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K1(InterfaceC43160i[] interfaceC43160iArr, Continuation continuation, Y41.r rVar) {
        super(2, continuation);
        this.f411155s = interfaceC43160iArr;
        this.f411156t = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        K1 k12 = new K1(this.f411155s, continuation, this.f411156t);
        k12.f411154r = obj;
        return k12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<Object> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((K1) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f411153q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f411154r;
            U1 u12 = U1.f411276l;
            a aVar = new a(null, this.f411156t);
            this.f411153q = 1;
            if (kotlinx.coroutines.flow.internal.n.a(u12, aVar, this, interfaceC43172j, this.f411155s) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
