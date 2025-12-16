package ru.cyberity.cbr.core.data.source.dynamic;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC43136a;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import ru.cyberity.log.logger.Logger;

/* compiled from: SuspendableFlow.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0013\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005J!\u0010\t\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lru/cyberity/cbr/core/data/source/dynamic/f;", "T", "Lkotlinx/coroutines/flow/a;", "Lkotlin/G0;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lkotlinx/coroutines/flow/j;", "collector", "collectSafely", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/i;", MessageBody.SystemMessageBody.Platform.FLOW, "Lkotlinx/coroutines/flow/Z1;", "", "Lkotlinx/coroutines/flow/Z1;", "pause", "Ljava/util/concurrent/atomic/AtomicInteger;", "c", "Ljava/util/concurrent/atomic/AtomicInteger;", "atomicInt", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class f<T> extends AbstractC43136a<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC43160i<T> flow;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final Z1<Boolean> pause;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final AtomicInteger atomicInt;

    /* compiled from: SuspendableFlow.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.SuspendableFlow$collectSafely$2", f = "SuspendableFlow.kt", i = {0, 0}, l = {43, 44}, m = "invokeSuspend", n = {"$this$transformLatest", "it"}, s = {"L$0", "L$1"})
    public static final class a extends SuspendLambda implements q<InterfaceC43172j<? super T>, T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f433849a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f433850b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f433851c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f<T> f433852d;

        /* compiled from: SuspendableFlow.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "", "isPaused", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.SuspendableFlow$collectSafely$2$1", f = "SuspendableFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: ru.cyberity.cbr.core.data.source.dynamic.f$a$a, reason: collision with other inner class name */
        public static final class C12479a extends SuspendLambda implements p<Boolean, Continuation<? super Boolean>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f433853a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ boolean f433854b;

            public C12479a(Continuation<? super C12479a> continuation) {
                super(2, continuation);
            }

            @l
            public final Object a(boolean z12, @l Continuation<? super Boolean> continuation) {
                return ((C12479a) create(Boolean.valueOf(z12), continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                C12479a c12479a = new C12479a(continuation);
                c12479a.f433854b = ((Boolean) obj).booleanValue();
                return c12479a;
            }

            @Override // Y41.p
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
                return a(bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f433853a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return Boxing.boxBoolean(!this.f433854b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f<T> fVar, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f433852d = fVar;
        }

        @Override // Y41.q
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k InterfaceC43172j<? super T> interfaceC43172j, T t12, @l Continuation<? super G0> continuation) {
            a aVar = new a(this.f433852d, continuation);
            aVar.f433850b = interfaceC43172j;
            aVar.f433851c = t12;
            return aVar.invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object obj2;
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f433849a;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f433850b;
                obj2 = this.f433851c;
                Z1 z12 = ((f) this.f433852d).pause;
                C12479a c12479a = new C12479a(null);
                this.f433850b = interfaceC43172j2;
                this.f433851c = obj2;
                this.f433849a = 1;
                if (C43175k.x(z12, c12479a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43172j = interfaceC43172j2;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                obj2 = this.f433851c;
                InterfaceC43172j interfaceC43172j3 = (InterfaceC43172j) this.f433850b;
                C42729a0.b(obj);
                interfaceC43172j = interfaceC43172j3;
            }
            this.f433850b = null;
            this.f433851c = null;
            this.f433849a = 2;
            if (interfaceC43172j.emit(obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SuspendableFlow.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.cbr.core.data.source.dynamic.SuspendableFlow", f = "SuspendableFlow.kt", i = {0, 1, 1}, l = {AvailableCode.HMS_IS_SPOOF, 33}, m = "resume", n = {"this", "this", "value"}, s = {"L$0", "L$0", "I$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f433855a;

        /* renamed from: b, reason: collision with root package name */
        int f433856b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f433857c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f<T> f433858d;

        /* renamed from: e, reason: collision with root package name */
        int f433859e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f<T> fVar, Continuation<? super b> continuation) {
            super(continuation);
            this.f433858d = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f433857c = obj;
            this.f433859e |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f433858d.a(this);
        }
    }

    @l
    public final Object b(@k Continuation<? super G0> continuation) {
        Logger.i$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), AK.c.g(this.atomicInt.incrementAndGet(), "Suspendable flow suspend, value = "), null, 4, null);
        Object objEmit = this.pause.emit(Boxing.boxBoolean(true), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    @Override // kotlinx.coroutines.flow.AbstractC43136a
    @l
    public Object collectSafely(@k InterfaceC43172j<? super T> interfaceC43172j, @k Continuation<? super G0> continuation) {
        Object objCollect = C43175k.Y(this.flow, new a(this, null)).collect(interfaceC43172j, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof ru.cyberity.cbr.core.data.source.dynamic.f.b
            if (r0 == 0) goto L13
            r0 = r12
            ru.cyberity.cbr.core.data.source.dynamic.f$b r0 = (ru.cyberity.cbr.core.data.source.dynamic.f.b) r0
            int r1 = r0.f433859e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f433859e = r1
            goto L18
        L13:
            ru.cyberity.cbr.core.data.source.dynamic.f$b r0 = new ru.cyberity.cbr.core.data.source.dynamic.f$b
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f433857c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f433859e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            int r1 = r0.f433856b
            java.lang.Object r0 = r0.f433855a
            ru.cyberity.cbr.core.data.source.dynamic.f r0 = (ru.cyberity.cbr.core.data.source.dynamic.f) r0
            kotlin.C42729a0.b(r12)
            goto L83
        L33:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3b:
            java.lang.Object r2 = r0.f433855a
            ru.cyberity.cbr.core.data.source.dynamic.f r2 = (ru.cyberity.cbr.core.data.source.dynamic.f) r2
            kotlin.C42729a0.b(r12)
            goto L54
        L43:
            kotlin.C42729a0.b(r12)
            r0.f433855a = r11
            r0.f433859e = r5
            r5 = 100
            java.lang.Object r12 = kotlinx.coroutines.C43131e0.b(r5, r0)
            if (r12 != r1) goto L53
            return r1
        L53:
            r2 = r11
        L54:
            java.util.concurrent.atomic.AtomicInteger r12 = r2.atomicInt
            int r12 = r12.decrementAndGet()
            ru.cyberity.log.a r5 = ru.cyberity.log.a.f436064a
            java.lang.String r6 = ru.cyberity.log.c.a(r2)
            java.lang.String r7 = "Suspendable flow resume, value = "
            java.lang.String r7 = AK.c.g(r12, r7)
            r9 = 4
            r10 = 0
            r8 = 0
            ru.cyberity.log.logger.Logger.i$default(r5, r6, r7, r8, r9, r10)
            if (r12 > 0) goto L81
            kotlinx.coroutines.flow.Z1<java.lang.Boolean> r5 = r2.pause
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            r0.f433855a = r2
            r0.f433856b = r12
            r0.f433859e = r4
            java.lang.Object r0 = r5.emit(r6, r0)
            if (r0 != r1) goto L81
            return r1
        L81:
            r1 = r12
            r0 = r2
        L83:
            if (r1 >= 0) goto L8a
            java.util.concurrent.atomic.AtomicInteger r12 = r0.atomicInt
            r12.set(r3)
        L8a:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.source.dynamic.f.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
