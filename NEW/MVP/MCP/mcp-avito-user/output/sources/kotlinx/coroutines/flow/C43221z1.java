package kotlinx.coroutines.flow;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/S1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.flow.z1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43221z1 implements InterfaceC43160i<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i[] f411846b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f411847c;

    /* compiled from: Zip.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkotlin/Array;)V", "kotlinx/coroutines/flow/T1"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", i = {}, l = {329, 258}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.z1$a */
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC43172j<Object>, Object[], Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f411848q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f411849r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object[] f411850s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Object f411851t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Continuation continuation, Y41.r rVar) {
            super(3, continuation);
            this.f411851t = rVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.r, java.lang.Object] */
        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<Object> interfaceC43172j, Object[] objArr, Continuation<? super kotlin.G0> continuation) {
            a aVar = new a(continuation, this.f411851t);
            aVar.f411849r = interfaceC43172j;
            aVar.f411850s = objArr;
            return aVar.invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [Y41.r, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f411848q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = this.f411849r;
                Object[] objArr = this.f411850s;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                this.f411849r = interfaceC43172j;
                this.f411848q = 1;
                obj = this.f411851t.invoke(obj2, obj3, obj4, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return kotlin.G0.f406611a;
                }
                interfaceC43172j = this.f411849r;
                C42729a0.b(obj);
            }
            this.f411849r = null;
            this.f411848q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.G0.f406611a;
        }
    }

    public C43221z1(InterfaceC43160i[] interfaceC43160iArr, Y41.r rVar) {
        this.f411846b = interfaceC43160iArr;
        this.f411847c = rVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.r, java.lang.Object] */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objA = kotlinx.coroutines.flow.internal.n.a(U1.f411276l, new a(null, this.f411847c), continuation, interfaceC43172j, this.f411846b);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : kotlin.G0.f406611a;
    }
}
