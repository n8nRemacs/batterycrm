package io.ktor.utils.io.jvm.javaio;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.AbstractC43300s0;
import kotlinx.coroutines.InterfaceC43268o0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.w1;

/* compiled from: Blocking.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\"\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/a;", "", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
abstract class a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f401096f = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, VoiceInfo.STATE);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final N0 f401097a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f401098b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final InterfaceC43268o0 f401099c;

    /* renamed from: d, reason: collision with root package name */
    public int f401100d;

    /* renamed from: e, reason: collision with root package name */
    public int f401101e;

    @Y61.k
    volatile /* synthetic */ int result;

    @Y61.k
    volatile /* synthetic */ Object state;

    /* compiled from: Blocking.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "io.ktor.utils.io.jvm.javaio.BlockingAdapter$block$1", f = "Blocking.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.utils.io.jvm.javaio.a$a, reason: collision with other inner class name */
    public static final class C11426a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f401102q;

        public C11426a(Continuation<? super C11426a> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return a.this.new C11426a(continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((C11426a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f401102q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f401102q = 1;
                if (a.this.b(this) == coroutine_suspended) {
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

    /* compiled from: Blocking.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends N implements Y41.l<Throwable, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            Throwable th3 = th2;
            if (th3 != null) {
                c cVar = a.this.f401098b;
                int i12 = Z.f406624c;
                cVar.resumeWith(new Z.b(th3));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: Blocking.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"io/ktor/utils/io/jvm/javaio/a$c", "Lkotlin/coroutines/Continuation;", "Lkotlin/G0;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements Continuation<G0> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final CoroutineContext f401105b;

        public c() {
            N0 n02 = a.this.f401097a;
            this.f401105b = n02 != null ? p.f401150c.plus(n02) : p.f401150c;
        }

        @Override // kotlin.coroutines.Continuation
        @Y61.k
        /* renamed from: getContext, reason: from getter */
        public final CoroutineContext getF411960f() {
            return this.f401105b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(@Y61.k Object obj) {
            Object obj2;
            boolean z12;
            boolean z13;
            Throwable thB;
            N0 n02;
            Object objB = Z.b(obj);
            if (objB == null) {
                objB = G0.f406611a;
            }
            a aVar = a.this;
            do {
                obj2 = aVar.state;
                z12 = obj2 instanceof Thread;
                z13 = true;
                if (!(z12 ? true : obj2 instanceof Continuation ? true : L.f(obj2, this))) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.f401096f;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj2, objB)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(aVar) != obj2) {
                        z13 = false;
                        break;
                    }
                }
            } while (!z13);
            if (z12) {
                j.a().b(obj2);
            } else if ((obj2 instanceof Continuation) && (thB = Z.b(obj)) != null) {
                ((Continuation) obj2).resumeWith(new Z.b(thB));
            }
            if ((obj instanceof Z.b) && !(Z.b(obj) instanceof CancellationException) && (n02 = a.this.f401097a) != null) {
                n02.c(null);
            }
            InterfaceC43268o0 interfaceC43268o0 = a.this.f401099c;
            if (interfaceC43268o0 != null) {
                interfaceC43268o0.dispose();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        Object obj;
        Continuation continuationIntercepted;
        Object obj2 = null;
        while (true) {
            Object obj3 = aVar.state;
            if (obj3 instanceof Thread) {
                continuationIntercepted = IntrinsicsKt.intercepted(continuationImpl);
                obj = obj3;
            } else {
                if (!L.f(obj3, aVar)) {
                    throw new IllegalStateException("Already suspended or in finished state");
                }
                obj = obj2;
                continuationIntercepted = IntrinsicsKt.intercepted(continuationImpl);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f401096f;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, obj3, continuationIntercepted)) {
                if (atomicReferenceFieldUpdater.get(aVar) != obj3) {
                    break;
                }
            }
            if (obj != null) {
                j.a().b(obj);
            }
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
            obj2 = obj;
        }
    }

    @Y61.l
    public abstract Object b(@Y61.k ContinuationImpl continuationImpl);

    public final void c() {
        InterfaceC43268o0 interfaceC43268o0 = this.f401099c;
        if (interfaceC43268o0 != null) {
            interfaceC43268o0.dispose();
        }
        int i12 = Z.f406624c;
        this.f401098b.resumeWith(new Z.b(new CancellationException("Stream closed")));
    }

    public final int d(@Y61.k Object obj) throws Throwable {
        Object noWhenBranchMatchedException;
        Object objCurrentThread = Thread.currentThread();
        Continuation continuation = null;
        while (true) {
            Object obj2 = this.state;
            if (obj2 instanceof Continuation) {
                continuation = (Continuation) obj2;
                noWhenBranchMatchedException = objCurrentThread;
            } else {
                if (obj2 instanceof G0) {
                    return this.result;
                }
                if (obj2 instanceof Throwable) {
                    throw ((Throwable) obj2);
                }
                if (obj2 instanceof Thread) {
                    throw new IllegalStateException("There is already thread owning adapter");
                }
                if (L.f(obj2, this)) {
                    throw new IllegalStateException("Not yet started");
                }
                noWhenBranchMatchedException = new NoWhenBranchMatchedException();
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f401096f;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, noWhenBranchMatchedException)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            int i12 = Z.f406624c;
            continuation.resumeWith(obj);
            if (this.state == objCurrentThread) {
                if (j.a() == k.f401130a) {
                    ((org.slf4j.a) io.ktor.utils.io.jvm.javaio.b.f401107a.getValue()).f("Blocking network thread detected. \nIt can possible lead to a performance decline or even a deadlock.\nPlease make sure you're using blocking IO primitives like InputStream and OutputStream only in \nthe context of Dispatchers.IO:\n```\nwithContext(Dispatchers.IO) {\n    myInputStream.read()\n}\n```");
                }
                while (true) {
                    w1.f412301a.getClass();
                    AbstractC43300s0 abstractC43300s0 = w1.f412302b.get();
                    long jH2 = abstractC43300s0 != null ? abstractC43300s0.H() : Long.MAX_VALUE;
                    if (this.state != objCurrentThread) {
                        break;
                    }
                    if (jH2 > 0) {
                        j.a().a(jH2);
                    }
                }
            }
            Object obj3 = this.state;
            if (obj3 instanceof Throwable) {
                throw ((Throwable) obj3);
            }
            return this.result;
        }
    }

    public a(@Y61.l N0 n02) {
        this.f401097a = n02;
        c cVar = new c();
        this.f401098b = cVar;
        this.state = this;
        this.result = 0;
        this.f401099c = n02 != null ? n02.k(new b()) : null;
        C11426a c11426a = new C11426a(null);
        v0.e(1, c11426a);
        c11426a.invoke(cVar);
        if (this.state == this) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public /* synthetic */ a(N0 n02, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : n02);
    }
}
