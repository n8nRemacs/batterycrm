package com.avito.beduin.v2.handler.flow.processor;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.exception.EngineBeduinException;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.handler.flow.j;
import com.facebook.imageutils.JfifUtil;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.m;

/* compiled from: InteractionsProcessor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.handler.flow.processor.InteractionsProcessor$handle$1", f = "InteractionsProcessor.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class g extends SuspendLambda implements p<InterfaceC43172j<? super dU0.f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f337228q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f337229r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f337230s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f337231t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36238a f337232u;

    /* compiled from: InteractionsProcessor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LdU0/f;", "wrapper", "Lkotlin/G0;", "emit", "(LdU0/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.handler.flow.processor.b f337233b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC36238a f337234c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<dU0.f> f337235d;

        /* compiled from: InteractionsProcessor.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.beduin.v2.handler.flow.processor.InteractionsProcessor$handle$1$1$chainInteractionsFlow$1", f = "InteractionsProcessor.kt", i = {}, l = {205}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.beduin.v2.handler.flow.processor.g$a$a, reason: collision with other inner class name */
        public static final class C10450a extends SuspendLambda implements q<InterfaceC43172j<? super dU0.f>, Throwable, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f337236q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ dU0.f f337237r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.avito.beduin.v2.handler.flow.processor.b f337238s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10450a(dU0.f fVar, com.avito.beduin.v2.handler.flow.processor.b bVar, Continuation<? super C10450a> continuation) {
                super(3, continuation);
                this.f337237r = fVar;
                this.f337238s = bVar;
            }

            @Override // Y41.q
            public final Object invoke(InterfaceC43172j<? super dU0.f> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
                return new C10450a(this.f337237r, this.f337238s, continuation).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Y41.a<dU0.f> aVarC;
                dU0.f fVarInvoke;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f337236q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    dU0.b bVar = this.f337237r.f393891b;
                    if ((bVar instanceof com.avito.beduin.v2.handler.flow.actions.b) && (aVarC = ((com.avito.beduin.v2.handler.flow.actions.b) bVar).c()) != null && (fVarInvoke = aVarC.invoke()) != null) {
                        this.f337236q = 1;
                        if (this.f337238s.a(fVarInvoke, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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

        /* compiled from: InteractionsProcessor.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.beduin.v2.handler.flow.processor.InteractionsProcessor$handle$1$1$chainInteractionsFlow$2", f = "InteractionsProcessor.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super dU0.f>, Throwable, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f337239q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ InterfaceC43172j f337240r;

            /* renamed from: s, reason: collision with root package name */
            public /* synthetic */ Throwable f337241s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ dU0.f f337242t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ com.avito.beduin.v2.handler.flow.processor.b f337243u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(dU0.f fVar, com.avito.beduin.v2.handler.flow.processor.b bVar, Continuation<? super b> continuation) {
                super(3, continuation);
                this.f337242t = fVar;
                this.f337243u = bVar;
            }

            @Override // Y41.q
            public final Object invoke(InterfaceC43172j<? super dU0.f> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
                b bVar = new b(this.f337242t, this.f337243u, continuation);
                bVar.f337240r = interfaceC43172j;
                bVar.f337241s = th2;
                return bVar.invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) throws BeduinPropertyException {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f337239q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43172j interfaceC43172j = this.f337240r;
                    Throwable th2 = this.f337241s;
                    EngineBeduinException.InteractionException.a aVar = EngineBeduinException.InteractionException.f336727i;
                    String str = this.f337242t.f393890a;
                    aVar.getClass();
                    EngineBeduinException.InteractionException interactionExceptionA = EngineBeduinException.InteractionException.a.a(str, th2);
                    com.avito.beduin.v2.handler.flow.processor.b bVar = this.f337243u;
                    InterfaceC36274k interfaceC36274k = bVar.f337173e;
                    com.avito.beduin.v2.engine.utils.e.b(interactionExceptionA, "InteractionsProcessor", null);
                    interfaceC36274k.y(interactionExceptionA);
                    z zVarI = bVar.f337173e.i();
                    dU0.f fVarA = ((j) bVar.f337177i.getValue()).getF337164b().a(zVarI, com.avito.beduin.v2.engine.utils.e.d(zVarI, interactionExceptionA.f336728g, interactionExceptionA.f336729h, interactionExceptionA));
                    this.f337240r = null;
                    this.f337239q = 1;
                    if (interfaceC43172j.emit(fVarA, this) == coroutine_suspended) {
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

        /* compiled from: InteractionsProcessor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.beduin.v2.handler.flow.processor.InteractionsProcessor$handle$1$1", f = "InteractionsProcessor.kt", i = {1, 1, 2, 2, 3}, l = {JfifUtil.MARKER_APP1, 239, 243, 264, 276}, m = "emit", n = {"this", "wrapper", "this", "wrapper", "this"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
        public static final class c extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public Object f337244q;

            /* renamed from: r, reason: collision with root package name */
            public dU0.f f337245r;

            /* renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f337246s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ a<T> f337247t;

            /* renamed from: u, reason: collision with root package name */
            public int f337248u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(a<? super T> aVar, Continuation<? super c> continuation) {
                super(continuation);
                this.f337247t = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f337246s = obj;
                this.f337248u |= BeduinInputModel.MIN_TEXT_VERSION;
                return this.f337247t.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(com.avito.beduin.v2.handler.flow.processor.b bVar, InterfaceC36238a interfaceC36238a, InterfaceC43172j<? super dU0.f> interfaceC43172j) {
            this.f337233b = bVar;
            this.f337234c = interfaceC36238a;
            this.f337235d = interfaceC43172j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:57:0x017a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01cb  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0217  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0244  */
        /* JADX WARN: Type inference failed for: r5v0, types: [int] */
        /* JADX WARN: Type inference failed for: r5v11 */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(@Y61.k dU0.f r17, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r18) {
            /*
                Method dump skipped, instructions count: 830
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.handler.flow.processor.g.a.emit(dU0.f, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m mVar, b bVar, InterfaceC36238a interfaceC36238a, Continuation continuation) {
        super(2, continuation);
        this.f337230s = mVar;
        this.f337231t = bVar;
        this.f337232u = interfaceC36238a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        g gVar = new g(this.f337230s, this.f337231t, this.f337232u, continuation);
        gVar.f337229r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super dU0.f> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f337228q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f337231t, this.f337232u, (InterfaceC43172j) this.f337229r);
            this.f337228q = 1;
            if (this.f337230s.collect(aVar, this) == coroutine_suspended) {
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
