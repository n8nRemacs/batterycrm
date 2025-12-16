package ru.cyberity.ml.core;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.AbstractC43313y0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43315z0;
import kotlinx.coroutines.T;
import org.tensorflow.lite.InterpreterApi;
import ru.cyberity.cbr.core.analytics.Action;
import ru.cyberity.cbr.core.common.z0;
import ru.cyberity.ml.core.b;
import ru.cyberity.ml.core.d;

/* compiled from: MlSolution.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u0000 \r*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00028\u0000H$¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bH$¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\t\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH$¢\u0006\u0004\b\t\u0010\u0011J!\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u0006\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0013J\u0013\u0010\t\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0014H\u0004¢\u0006\u0004\b\u0016\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\t\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\t\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\t\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010\u0005R\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\u00020\u000f8\u0014X\u0094D¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R#\u0010/\u001a\n +*\u0004\u0018\u00010*0*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010,\u001a\u0004\b-\u0010.R\u001b\u00103\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b#\u00102R$\u00109\u001a\u0002042\u0006\u00105\u001a\u0002048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R\u0014\u0010<\u001a\u00020:8$X¤\u0004¢\u0006\u0006\u001a\u0004\b1\u0010;R\u0014\u0010@\u001a\u00020=8$X¤\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006A"}, d2 = {"Lru/cyberity/ml/core/b;", "Input", "Output", "Lru/cyberity/ml/core/d;", "<init>", "()V", "input", "", "", "a", "(Ljava/lang/Object;)[Ljava/lang/Object;", "", "", "g", "()Ljava/util/Map;", "", "executionTimeMs", "(Ljava/lang/Object;J)Ljava/lang/Object;", "Lru/cyberity/ml/core/d$a;", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/G0;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finalize", "Lorg/tensorflow/lite/InterpreterApi;", "interpreterApi", "(Lorg/tensorflow/lite/InterpreterApi;)V", "Lorg/tensorflow/lite/InterpreterApi$Options;", "d", "()Lorg/tensorflow/lite/InterpreterApi$Options;", "()Lorg/tensorflow/lite/InterpreterApi;", "j", "k", "Lru/cyberity/cbr/core/common/z0;", "Lru/cyberity/cbr/core/common/z0;", "timeMeasure", "b", "Lorg/tensorflow/lite/InterpreterApi;", "interpreter", "c", "J", "()J", "executionTimeoutMs", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "Lkotlin/C;", "i", "()Ljava/util/concurrent/ExecutorService;", "workExecutor", "Lkotlinx/coroutines/y0;", "e", "()Lkotlinx/coroutines/y0;", "coroutineDispatcher", "", "<set-?>", "f", "Z", "()Z", "modelLoadError", "Lru/cyberity/ml/core/a;", "()Lru/cyberity/ml/core/a;", "mlModel", "", "h", "()Ljava/lang/String;", "solutionName", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public abstract class b<Input, Output> implements ru.cyberity.ml.core.d<Input, Output> {

    /* renamed from: g, reason: collision with root package name */
    @k
    private static final a f436170g = new a(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private InterpreterApi interpreter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long executionTimeoutMs;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean modelLoadError;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final z0 timeMeasure = new z0();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C workExecutor = C42727D.c(new h(this));

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C coroutineDispatcher = C42727D.c(new d(this));

    /* compiled from: MlSolution.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/cyberity/ml/core/b$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: MlSolution.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.ml.core.MlSolution", f = "MlSolution.kt", i = {0}, l = {95}, m = "close$suspendImpl", n = {"$this"}, s = {"L$0"})
    /* renamed from: ru.cyberity.ml.core.b$b, reason: collision with other inner class name */
    public static final class C12568b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f436177a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f436178b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b<Input, Output> f436179c;

        /* renamed from: d, reason: collision with root package name */
        int f436180d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12568b(b<Input, Output> bVar, Continuation<? super C12568b> continuation) {
            super(continuation);
            this.f436179c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f436178b = obj;
            this.f436180d |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.a((b) this.f436179c, (Continuation) this);
        }
    }

    /* compiled from: MlSolution.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Input", "Output", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.ml.core.MlSolution$close$2", f = "MlSolution.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f436181a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b<Input, Output> f436182b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b<Input, Output> bVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f436182b = bVar;
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new c(this.f436182b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) throws IOException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f436181a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            this.f436182b.k();
            InterpreterApi interpreterApi = ((b) this.f436182b).interpreter;
            if (interpreterApi != null) {
                interpreterApi.close();
            }
            ((b) this.f436182b).interpreter = null;
            this.f436182b.b().close();
            return G0.f406611a;
        }
    }

    /* compiled from: MlSolution.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Input", "Output", "Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.ml.core.MlSolution$finalize$1", f = "MlSolution.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f436184a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b<Input, Output> f436185b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b<Input, Output> bVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f436185b = bVar;
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new e(this.f436185b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f436184a;
            if (i12 == 0) {
                C42729a0.b(obj);
                b<Input, Output> bVar = this.f436185b;
                this.f436184a = 1;
                if (bVar.a((Continuation<? super G0>) this) == coroutine_suspended) {
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

    /* compiled from: MlSolution.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class f extends H implements p<T, Continuation<? super d.a<Output>>, Object>, SuspendFunction {
        public f(Object obj) {
            super(2, obj, L.a.class, "suspendConversion0", "run$suspendConversion0(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @k Continuation<? super d.a<Output>> continuation) {
            return b.b((Y41.l) this.receiver, t12, continuation);
        }
    }

    /* compiled from: MlSolution.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Input", "Output", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 7, 1})
    public static final class h extends N implements Y41.a<ExecutorService> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b<Input, Output> f436190a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b<Input, Output> bVar) {
            super(0);
            this.f436190a = bVar;
        }

        @Override // Y41.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor(new ru.cyberity.ml.core.e(this.f436190a, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Thread a(b bVar, Runnable runnable) {
            return new Thread(runnable, bVar.getSolutionName() + "Thread");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExecutorService i() {
        return (ExecutorService) this.workExecutor.getValue();
    }

    private final InterpreterApi j() {
        return InterpreterApi.create(e().a(), d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        ru.cyberity.cbr.core.analytics.l.a(ru.cyberity.cbr.core.analytics.f.a(0L, 1, null).a(Action.MlModelExecution).e().a(new Q("name", getSolutionName()), new Q("average", this.timeMeasure.a()), new Q("median", Long.valueOf(this.timeMeasure.c())), new Q("p99", Long.valueOf(this.timeMeasure.e())), new Q("p100", Long.valueOf(this.timeMeasure.d()))), false, 1, null);
        this.timeMeasure.f();
    }

    public abstract Output a(Input input, long executionTimeMs);

    @Override // ru.cyberity.ml.core.d
    @l
    public Object a(Input input, @k Continuation<? super d.a<Output>> continuation) {
        return a(this, input, continuation);
    }

    @k
    public abstract Object[] a(Input input);

    @k
    public abstract ru.cyberity.ml.core.a e();

    public final void finalize() throws Throwable {
        C43259k.e(EmptyCoroutineContext.INSTANCE, new e(this, null));
    }

    @k
    public abstract Map<Integer, Object> g();

    @k
    /* renamed from: h */
    public abstract String getSolutionName();

    /* compiled from: MlSolution.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Input", "Output", "Lkotlinx/coroutines/y0;", "a", "()Lkotlinx/coroutines/y0;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends N implements Y41.a<AbstractC43313y0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b<Input, Output> f436183a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b<Input, Output> bVar) {
            super(0);
            this.f436183a = bVar;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC43313y0 invoke() {
            return new C43315z0(Executors.newSingleThreadExecutor(new ru.cyberity.ml.core.e(this.f436183a, 0)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Thread a(b bVar, Runnable runnable) {
            return new Thread(runnable, bVar.getSolutionName() + "CoroutineThread");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC43313y0 b() {
        return (AbstractC43313y0) this.coroutineDispatcher.getValue();
    }

    @l
    public Object a(@k Continuation<? super G0> continuation) {
        return a((b) this, (Continuation) continuation);
    }

    /* renamed from: c, reason: from getter */
    public long getExecutionTimeoutMs() {
        return this.executionTimeoutMs;
    }

    @k
    public InterpreterApi.Options d() {
        InterpreterApi.Options options = new InterpreterApi.Options();
        options.setNumThreads(-1);
        options.setCancellable(true);
        return options;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getModelLoadError() {
        return this.modelLoadError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object b(Y41.l lVar, T t12, Continuation continuation) {
        return lVar.invoke(t12);
    }

    public void a(@k InterpreterApi interpreterApi) {
    }

    /* compiled from: MlSolution.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Input", "Output", "Lkotlinx/coroutines/T;", "Lru/cyberity/ml/core/d$a;", "a", "(Lkotlinx/coroutines/T;)Lru/cyberity/ml/core/d$a;"}, k = 3, mv = {1, 7, 1})
    public static final class g extends N implements Y41.l<T, d.a<Output>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b<Input, Output> f436186a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Input f436187b;

        /* compiled from: MlSolution.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Input", "Output", "Lkotlin/G0;", "a", "()V"}, k = 3, mv = {1, 7, 1})
        public static final class a extends N implements Y41.a<G0> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b<Input, Output> f436188a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Input f436189b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b<Input, Output> bVar, Input input) {
                super(0);
                this.f436188a = bVar;
                this.f436189b = input;
            }

            public final void a() {
                this.f436188a.a().runForMultipleInputsOutputs(this.f436188a.a((b<Input, Output>) this.f436189b), this.f436188a.g());
            }

            @Override // Y41.a
            public /* bridge */ /* synthetic */ G0 invoke() {
                a();
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b<Input, Output> bVar, Input input) {
            super(1);
            this.f436186a = bVar;
            this.f436187b = input;
        }

        @Override // Y41.l
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d.a<Output> invoke(@k T t12) {
            ExecutorService executorServiceI = this.f436186a.i();
            final b<Input, Output> bVar = this.f436186a;
            final Input input = this.f436187b;
            Future futureSubmit = executorServiceI.submit(new Callable() { // from class: ru.cyberity.ml.core.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return b.g.a(bVar, input);
                }
            });
            if (this.f436186a.getExecutionTimeoutMs() <= 0) {
                return (d.a) futureSubmit.get();
            }
            try {
                return (d.a) futureSubmit.get(this.f436186a.getExecutionTimeoutMs(), TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                ru.cyberity.log.b.b(ru.cyberity.log.a.f436064a, "MlSolution", "MlSolution timeout (" + this.f436186a.getSolutionName() + ')', null, 4, null);
                return new d.a.C12571d();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d.a a(b bVar, Object obj) {
            try {
                return new d.a.c(bVar.a((b) obj, bVar.timeMeasure.a(new a(bVar, obj))));
            } catch (UnsatisfiedLinkError e12) {
                bVar.modelLoadError = true;
                ru.cyberity.log.b.b(ru.cyberity.log.a.f436064a, "MlSolution", "Error while loading TF library", e12);
                return new d.a.C12570a(e12);
            } catch (ru.cyberity.ml.core.c e13) {
                bVar.modelLoadError = true;
                ru.cyberity.log.b.b(ru.cyberity.log.a.f436064a, "MlSolution", "Error while executing ML model", e13);
                return new d.a.C12570a(e13);
            } catch (Throwable th2) {
                ru.cyberity.log.b.b(ru.cyberity.log.a.f436064a, "MlSolution", "Error while executing ML model", th2);
                return new d.a.C12570a(th2);
            }
        }
    }

    public static /* synthetic */ Object a(b bVar, Object obj, Continuation continuation) {
        return C43259k.g(bVar.b(), new f(new g(bVar, obj)), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(ru.cyberity.ml.core.b r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof ru.cyberity.ml.core.b.C12568b
            if (r0 == 0) goto L13
            r0 = r6
            ru.cyberity.ml.core.b$b r0 = (ru.cyberity.ml.core.b.C12568b) r0
            int r1 = r0.f436180d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f436180d = r1
            goto L18
        L13:
            ru.cyberity.ml.core.b$b r0 = new ru.cyberity.ml.core.b$b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f436178b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f436180d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f436177a
            ru.cyberity.ml.core.b r5 = (ru.cyberity.ml.core.b) r5
            kotlin.C42729a0.b(r6)
            goto L4d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C42729a0.b(r6)
            kotlinx.coroutines.y0 r6 = r5.b()
            ru.cyberity.ml.core.b$c r2 = new ru.cyberity.ml.core.b$c
            r4 = 0
            r2.<init>(r5, r4)
            r0.f436177a = r5
            r0.f436180d = r3
            java.lang.Object r6 = kotlinx.coroutines.C43259k.g(r6, r2, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            java.util.concurrent.ExecutorService r5 = r5.i()
            r5.shutdown()
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.ml.core.b.a(ru.cyberity.ml.core.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterpreterApi a() {
        InterpreterApi interpreterApi = this.interpreter;
        if (interpreterApi != null) {
            return interpreterApi;
        }
        InterpreterApi interpreterApiJ = j();
        this.interpreter = interpreterApiJ;
        a(interpreterApiJ);
        return interpreterApiJ;
    }
}
