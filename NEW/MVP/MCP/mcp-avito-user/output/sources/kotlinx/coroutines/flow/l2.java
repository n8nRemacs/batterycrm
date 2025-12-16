package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: SharingStarted.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/flow/l2;", "Lkotlinx/coroutines/flow/i2;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class l2 implements i2 {

    /* compiled from: SharingStarted.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lkotlinx/coroutines/flow/SharingCommand;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SharingCommand>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f411609q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f411610r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ n2<Integer> f411611s;

        /* compiled from: SharingStarted.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "count", "Lkotlin/G0;", "emit", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: kotlinx.coroutines.flow.l2$a$a, reason: collision with other inner class name */
        public static final class C11728a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0.a f411612b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<SharingCommand> f411613c;

            /* compiled from: SharingStarted.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", i = {}, l = {154}, m = "emit", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.l2$a$a$a, reason: collision with other inner class name */
            public static final class C11729a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f411614q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ C11728a<T> f411615r;

                /* renamed from: s, reason: collision with root package name */
                public int f411616s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C11729a(C11728a<? super T> c11728a, Continuation<? super C11729a> continuation) {
                    super(continuation);
                    this.f411615r = c11728a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f411614q = obj;
                    this.f411616s |= BeduinInputModel.MIN_TEXT_VERSION;
                    return this.f411615r.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C11728a(l0.a aVar, InterfaceC43172j<? super SharingCommand> interfaceC43172j) {
                this.f411612b = aVar;
                this.f411613c = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(int r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.l2.a.C11728a.C11729a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.l2$a$a$a r0 = (kotlinx.coroutines.flow.l2.a.C11728a.C11729a) r0
                    int r1 = r0.f411616s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f411616s = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.l2$a$a$a r0 = new kotlinx.coroutines.flow.l2$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f411614q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f411616s
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    if (r5 <= 0) goto L4e
                    kotlin.jvm.internal.l0$a r5 = r4.f411612b
                    boolean r6 = r5.f406838b
                    if (r6 != 0) goto L4e
                    r5.f406838b = r3
                    kotlinx.coroutines.flow.SharingCommand r5 = kotlinx.coroutines.flow.SharingCommand.f411255b
                    r0.f411616s = r3
                    kotlinx.coroutines.flow.j<kotlinx.coroutines.flow.SharingCommand> r6 = r4.f411613c
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                L4e:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.l2.a.C11728a.a(int, kotlin.coroutines.Continuation):java.lang.Object");
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Number) obj).intValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n2<Integer> n2Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f411611s = n2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f411611s, continuation);
            aVar.f411610r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SharingCommand> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f411609q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C11728a c11728a = new C11728a(new l0.a(), (InterfaceC43172j) this.f411610r);
                this.f411609q = 1;
                if (this.f411611s.collect(c11728a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.coroutines.flow.i2
    @Y61.k
    public final InterfaceC43160i<SharingCommand> a(@Y61.k n2<Integer> n2Var) {
        return new c2(new a(n2Var, null));
    }

    @Y61.k
    public final String toString() {
        return "SharingStarted.Lazily";
    }
}
