package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C42833p;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43302t;
import kotlinx.coroutines.H1;
import kotlinx.coroutines.InterfaceC43271q;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.internal.C43235e;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

/* compiled from: BufferedChannel.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0010\u0011R\u0013\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004R\u000b\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004R\u0017\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00038\u0002X\u0082\u0004R\u0013\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004R\u000b\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004R\u0017\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00038\u0002X\u0082\u0004R\u000b\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004R\u0017\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00038\u0002X\u0082\u0004R\u000b\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/m;", "E", "Lkotlinx/coroutines/channels/w;", "Lkotlinx/atomicfu/AtomicRef;", "", "_closeCause", "Lkotlinx/atomicfu/AtomicLong;", "bufferEnd", "Lkotlinx/coroutines/channels/C;", "bufferEndSegment", "closeHandler", "completedExpandBuffersAndPauseFlag", "receiveSegment", "receivers", "sendSegment", "sendersAndCloseStatus", "a", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.channels.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43108m<E> implements InterfaceC43123w<E> {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f410934e = AtomicLongFieldUpdater.newUpdater(C43108m.class, "sendersAndCloseStatus$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f410935f = AtomicLongFieldUpdater.newUpdater(C43108m.class, "receivers$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f410936g = AtomicLongFieldUpdater.newUpdater(C43108m.class, "bufferEnd$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f410937h = AtomicLongFieldUpdater.newUpdater(C43108m.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f410938i = AtomicReferenceFieldUpdater.newUpdater(C43108m.class, Object.class, "sendSegment$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f410939j = AtomicReferenceFieldUpdater.newUpdater(C43108m.class, Object.class, "receiveSegment$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f410940k = AtomicReferenceFieldUpdater.newUpdater(C43108m.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f410941l = AtomicReferenceFieldUpdater.newUpdater(C43108m.class, Object.class, "_closeCause$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f410942m = AtomicReferenceFieldUpdater.newUpdater(C43108m.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: b, reason: collision with root package name */
    public final int f410943b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.l
    public final Y41.l<E, kotlin.G0> f410944c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.q<kotlinx.coroutines.selects.r<?>, Object, Object, Y41.l<Throwable, kotlin.G0>> f410945d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* compiled from: BufferedChannel.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/channels/m$a;", "Lkotlinx/coroutines/channels/y;", "Lkotlinx/coroutines/H1;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.channels.m$a */
    public final class a implements InterfaceC43125y<E>, H1 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public Object f410946b = C43122v.f411017p;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public kotlinx.coroutines.r<? super Boolean> f410947c;

        public a() {
        }

        @Override // kotlinx.coroutines.channels.InterfaceC43125y
        @Y61.l
        public final Object a(@Y61.k Continuation<? super Boolean> continuation) throws Throwable {
            kotlinx.coroutines.r<? super Boolean> rVar;
            Boolean boolBoxBoolean;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C43108m.f410939j;
            C43108m<E> c43108m = C43108m.this;
            C<E> c12 = (C) atomicReferenceFieldUpdater.get(c43108m);
            while (!c43108m.D()) {
                long andIncrement = C43108m.f410935f.getAndIncrement(c43108m);
                long j12 = C43122v.f411003b;
                long j13 = andIncrement / j12;
                int i12 = (int) (andIncrement % j12);
                if (c12.f411887d != j13) {
                    C<E> cT2 = c43108m.t(j13, c12);
                    if (cT2 == null) {
                        continue;
                    } else {
                        c12 = cT2;
                    }
                }
                Object objY = c43108m.Y(c12, i12, andIncrement, null);
                kotlinx.coroutines.internal.a0 a0Var = C43122v.f411014m;
                if (objY == a0Var) {
                    throw new IllegalStateException("unreachable");
                }
                kotlinx.coroutines.internal.a0 a0Var2 = C43122v.f411016o;
                if (objY != a0Var2) {
                    if (objY != C43122v.f411015n) {
                        c12.b();
                        this.f410946b = objY;
                        return Boxing.boxBoolean(true);
                    }
                    C43108m<E> c43108m2 = C43108m.this;
                    kotlinx.coroutines.r<? super Boolean> rVarB = C43302t.b(IntrinsicsKt.intercepted(continuation));
                    try {
                        this.f410947c = rVarB;
                        rVar = rVarB;
                    } catch (Throwable th2) {
                        th = th2;
                        rVar = rVarB;
                    }
                    try {
                        Object objY2 = c43108m2.Y(c12, i12, andIncrement, this);
                        if (objY2 == a0Var) {
                            c43108m2.O();
                            c(c12, i12);
                        } else {
                            Y41.l<Throwable, kotlin.G0> lVarA = null;
                            CoroutineContext coroutineContext = rVar.f411960f;
                            Y41.l<E, kotlin.G0> lVar = c43108m2.f410944c;
                            if (objY2 == a0Var2) {
                                if (andIncrement < c43108m2.z()) {
                                    c12.b();
                                }
                                C<E> c13 = (C) C43108m.f410939j.get(c43108m2);
                                while (true) {
                                    if (c43108m2.D()) {
                                        kotlinx.coroutines.r<? super Boolean> rVar2 = this.f410947c;
                                        this.f410947c = null;
                                        this.f410946b = C43122v.f411013l;
                                        Throwable thU = c43108m.u();
                                        if (thU == null) {
                                            int i13 = kotlin.Z.f406624c;
                                            rVar2.resumeWith(Boolean.FALSE);
                                        } else {
                                            int i14 = kotlin.Z.f406624c;
                                            rVar2.resumeWith(new Z.b(thU));
                                        }
                                    } else {
                                        long andIncrement2 = C43108m.f410935f.getAndIncrement(c43108m2);
                                        long j14 = C43122v.f411003b;
                                        long j15 = andIncrement2 / j14;
                                        int i15 = (int) (andIncrement2 % j14);
                                        if (c13.f411887d != j15) {
                                            C<E> cT3 = c43108m2.t(j15, c13);
                                            if (cT3 != null) {
                                                c13 = cT3;
                                            }
                                        }
                                        Y41.l<E, kotlin.G0> lVar2 = lVar;
                                        Object objY3 = c43108m2.Y(c13, i15, andIncrement2, this);
                                        if (objY3 == C43122v.f411014m) {
                                            c43108m2.O();
                                            c(c13, i15);
                                            break;
                                        }
                                        if (objY3 == C43122v.f411016o) {
                                            if (andIncrement2 < c43108m2.z()) {
                                                c13.b();
                                            }
                                            lVar = lVar2;
                                        } else {
                                            if (objY3 == C43122v.f411015n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            c13.b();
                                            this.f410946b = objY3;
                                            this.f410947c = null;
                                            boolBoxBoolean = Boxing.boxBoolean(true);
                                            if (lVar2 != null) {
                                                lVarA = kotlinx.coroutines.internal.Q.a(lVar2, objY3, coroutineContext);
                                            }
                                        }
                                    }
                                }
                            } else {
                                c12.b();
                                this.f410946b = objY2;
                                this.f410947c = null;
                                boolBoxBoolean = Boxing.boxBoolean(true);
                                if (lVar != null) {
                                    lVarA = kotlinx.coroutines.internal.Q.a(lVar, objY2, coroutineContext);
                                }
                            }
                            rVar.C(lVarA, boolBoxBoolean);
                        }
                        Object objO = rVar.o();
                        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(continuation);
                        }
                        return objO;
                    } catch (Throwable th3) {
                        th = th3;
                        rVar.z();
                        throw th;
                    }
                }
                if (andIncrement < c43108m.z()) {
                    c12.b();
                }
            }
            this.f410946b = C43122v.f411013l;
            Throwable thU2 = c43108m.u();
            if (thU2 == null) {
                return Boxing.boxBoolean(false);
            }
            int i16 = kotlinx.coroutines.internal.Z.f411889a;
            throw thU2;
        }

        @Override // kotlinx.coroutines.H1
        public final void c(@Y61.k kotlinx.coroutines.internal.X<?> x12, int i12) {
            kotlinx.coroutines.r<? super Boolean> rVar = this.f410947c;
            if (rVar != null) {
                rVar.c(x12, i12);
            }
        }

        @Override // kotlinx.coroutines.channels.InterfaceC43125y
        public final E next() throws Throwable {
            E e12 = (E) this.f410946b;
            kotlinx.coroutines.internal.a0 a0Var = C43122v.f411017p;
            if (e12 == a0Var) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f410946b = a0Var;
            if (e12 != C43122v.f411013l) {
                return e12;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = C43108m.f410934e;
            Throwable thX = C43108m.this.x();
            int i12 = kotlinx.coroutines.internal.Z.f411889a;
            throw thX;
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/channels/m$b;", "Lkotlinx/coroutines/H1;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.channels.m$b */
    public static final class b implements H1 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final kotlinx.coroutines.r f410949b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.r<Boolean> f410950c;

        public b(@Y61.k kotlinx.coroutines.r rVar) {
            this.f410949b = rVar;
            this.f410950c = rVar;
        }

        @Override // kotlinx.coroutines.H1
        public final void c(@Y61.k kotlinx.coroutines.internal.X<?> x12, int i12) {
            this.f410950c.c(x12, i12);
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.channels.m$c */
    public /* synthetic */ class c extends kotlin.jvm.internal.H implements Y41.q<C43108m<?>, kotlinx.coroutines.selects.r<?>, Object, kotlin.G0> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f410951b = new c();

        public c() {
            super(3, C43108m.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(C43108m<?> c43108m, kotlinx.coroutines.selects.r<?> rVar, Object obj) {
            C43108m.i(c43108m, rVar);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.channels.m$d */
    public /* synthetic */ class d extends kotlin.jvm.internal.H implements Y41.q<C43108m<?>, Object, Object, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f410952b = new d();

        public d() {
            super(3, C43108m.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // Y41.q
        public final Object invoke(C43108m<?> c43108m, Object obj, Object obj2) throws Throwable {
            C43108m<?> c43108m2 = c43108m;
            AtomicLongFieldUpdater atomicLongFieldUpdater = C43108m.f410934e;
            c43108m2.getClass();
            if (obj2 != C43122v.f411013l) {
                return obj2;
            }
            throw c43108m2.x();
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.channels.m$e */
    public /* synthetic */ class e extends kotlin.jvm.internal.H implements Y41.q<C43108m<?>, kotlinx.coroutines.selects.r<?>, Object, kotlin.G0> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f410953b = new e();

        public e() {
            super(3, C43108m.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(C43108m<?> c43108m, kotlinx.coroutines.selects.r<?> rVar, Object obj) {
            C43108m.i(c43108m, rVar);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.channels.m$f */
    public /* synthetic */ class f extends kotlin.jvm.internal.H implements Y41.q<C43108m<?>, Object, Object, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f410954b = new f();

        public f() {
            super(3, C43108m.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // Y41.q
        public final Object invoke(C43108m<?> c43108m, Object obj, Object obj2) {
            C43108m<?> c43108m2 = c43108m;
            AtomicLongFieldUpdater atomicLongFieldUpdater = C43108m.f410934e;
            c43108m2.getClass();
            if (obj2 == C43122v.f411013l) {
                B.b bVar = B.f410772b;
                Throwable thU = c43108m2.u();
                bVar.getClass();
                obj2 = B.b.a(thU);
            } else {
                B.f410772b.getClass();
            }
            return B.a(obj2);
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.channels.m$g */
    final /* synthetic */ class g extends kotlin.jvm.internal.H implements Y41.q<C43108m<?>, kotlinx.coroutines.selects.r<?>, Object, kotlin.G0> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f410955b = new g();

        public g() {
            super(3, C43108m.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(C43108m<?> c43108m, kotlinx.coroutines.selects.r<?> rVar, Object obj) {
            c43108m.S(rVar, obj);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.channels.m$h */
    final /* synthetic */ class h extends kotlin.jvm.internal.H implements Y41.q<C43108m<?>, Object, Object, Object> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f410956b = new h();

        public h() {
            super(3, C43108m.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // Y41.q
        public final Object invoke(C43108m<?> c43108m, Object obj, Object obj2) throws Throwable {
            C43108m<?> c43108m2 = c43108m;
            AtomicLongFieldUpdater atomicLongFieldUpdater = C43108m.f410934e;
            c43108m2.getClass();
            if (obj2 != C43122v.f411013l) {
                return c43108m2;
            }
            throw c43108m2.y();
        }
    }

    /* compiled from: BufferedChannel.kt */
    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\"\u0004\b\u0000\u0010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"E", "Lkotlinx/coroutines/selects/r;", "select", "", "<anonymous parameter 1>", "element", "Lkotlin/Function1;", "", "Lkotlin/G0;", "invoke", "(Lkotlinx/coroutines/selects/r;Ljava/lang/Object;Ljava/lang/Object;)LY41/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlinx.coroutines.channels.m$i */
    public static final class i extends kotlin.jvm.internal.N implements Y41.q<kotlinx.coroutines.selects.r<?>, Object, Object, Y41.l<? super Throwable, ? extends kotlin.G0>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C43108m<E> f410957l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C43108m<E> c43108m) {
            super(3);
            this.f410957l = c43108m;
        }

        @Override // Y41.q
        public final Y41.l<? super Throwable, ? extends kotlin.G0> invoke(kotlinx.coroutines.selects.r<?> rVar, Object obj, Object obj2) {
            return new C43114p(obj2, this.f410957l, rVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43108m(int i12, @Y61.l Y41.l<? super E, kotlin.G0> lVar) {
        this.f410943b = i12;
        this.f410944c = lVar;
        if (i12 < 0) {
            throw new IllegalArgumentException(androidx.camera.camera2.internal.G.e(i12, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        C<Object> c12 = C43122v.f411002a;
        this.bufferEnd$volatile = i12 != 0 ? i12 != Integer.MAX_VALUE ? i12 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f410936g.get(this);
        C<Object> c13 = new C<>(0L, null, this, 3);
        this.sendSegment$volatile = c13;
        this.receiveSegment$volatile = c13;
        this.bufferEndSegment$volatile = G() ? C43122v.f411002a : c13;
        this.f410945d = lVar != 0 ? new i(this) : null;
        this._closeCause$volatile = C43122v.f411020s;
    }

    public static void B(C43108m c43108m) {
        c43108m.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f410937h;
        if ((atomicLongFieldUpdater.addAndGet(c43108m, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c43108m) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object Q(kotlinx.coroutines.channels.C43108m r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.C43116q
            if (r0 == 0) goto L14
            r0 = r14
            kotlinx.coroutines.channels.q r0 = (kotlinx.coroutines.channels.C43116q) r0
            int r1 = r0.f410975s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f410975s = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            kotlinx.coroutines.channels.q r0 = new kotlinx.coroutines.channels.q
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f410973q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f410975s
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            kotlin.C42729a0.b(r14)
            kotlinx.coroutines.channels.B r14 = (kotlinx.coroutines.channels.B) r14
            java.lang.Object r13 = r14.f410774a
            goto La8
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L38:
            kotlin.C42729a0.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = kotlinx.coroutines.channels.C43108m.f410939j
            java.lang.Object r14 = r14.get(r13)
            kotlinx.coroutines.channels.C r14 = (kotlinx.coroutines.channels.C) r14
        L43:
            boolean r1 = r13.D()
            if (r1 == 0) goto L57
            kotlinx.coroutines.channels.B$b r14 = kotlinx.coroutines.channels.B.f410772b
            java.lang.Throwable r13 = r13.u()
            r14.getClass()
            kotlinx.coroutines.channels.B$a r13 = kotlinx.coroutines.channels.B.b.a(r13)
            goto La8
        L57:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.C43108m.f410935f
            long r4 = r1.getAndIncrement(r13)
            int r1 = kotlinx.coroutines.channels.C43122v.f411003b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.f411887d
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L73
            kotlinx.coroutines.channels.C r1 = r13.t(r9, r14)
            if (r1 != 0) goto L72
            goto L43
        L72:
            r14 = r1
        L73:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = r7.Y(r8, r9, r10, r12)
            kotlinx.coroutines.internal.a0 r7 = kotlinx.coroutines.channels.C43122v.f411014m
            if (r1 == r7) goto La9
            kotlinx.coroutines.internal.a0 r7 = kotlinx.coroutines.channels.C43122v.f411016o
            if (r1 != r7) goto L90
            long r7 = r13.z()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L43
            r14.b()
            goto L43
        L90:
            kotlinx.coroutines.internal.a0 r7 = kotlinx.coroutines.channels.C43122v.f411015n
            if (r1 != r7) goto L9f
            r6.f410975s = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.R(r2, r3, r4, r6)
            if (r13 != r0) goto La8
            return r0
        L9f:
            r14.b()
            kotlinx.coroutines.channels.B$b r13 = kotlinx.coroutines.channels.B.f410772b
            r13.getClass()
            r13 = r1
        La8:
            return r13
        La9:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C43108m.Q(kotlinx.coroutines.channels.m, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final C a(C43108m c43108m, long j12, C c12) {
        Object objA;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j13;
        long j14;
        c43108m.getClass();
        C<Object> c13 = C43122v.f411002a;
        C43121u c43121u = C43121u.f410996b;
        loop0: while (true) {
            objA = C43235e.a(c12, j12, c43121u);
            if (!kotlinx.coroutines.internal.Y.b(objA)) {
                kotlinx.coroutines.internal.X xA2 = kotlinx.coroutines.internal.Y.a(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f410938i;
                    kotlinx.coroutines.internal.X x12 = (kotlinx.coroutines.internal.X) atomicReferenceFieldUpdater.get(c43108m);
                    if (x12.f411887d >= xA2.f411887d) {
                        break loop0;
                    }
                    if (!xA2.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c43108m, x12, xA2)) {
                        if (atomicReferenceFieldUpdater.get(c43108m) != x12) {
                            if (xA2.f()) {
                                xA2.e();
                            }
                        }
                    }
                    if (x12.f()) {
                        x12.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zB2 = kotlinx.coroutines.internal.Y.b(objA);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f410935f;
        if (zB2) {
            c43108m.l();
            if (c12.f411887d * C43122v.f411003b >= atomicLongFieldUpdater2.get(c43108m)) {
                return null;
            }
            c12.b();
            return null;
        }
        C c14 = (C) kotlinx.coroutines.internal.Y.a(objA);
        long j15 = c14.f411887d;
        if (j15 <= j12) {
            return c14;
        }
        long j16 = C43122v.f411003b * j15;
        do {
            atomicLongFieldUpdater = f410934e;
            j13 = atomicLongFieldUpdater.get(c43108m);
            j14 = 1152921504606846975L & j13;
            if (j14 >= j16) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(c43108m, j13, j14 + (((int) (j13 >> 60)) << 60)));
        if (j15 * C43122v.f411003b >= atomicLongFieldUpdater2.get(c43108m)) {
            return null;
        }
        c14.b();
        return null;
    }

    public static final void d(C43108m c43108m, Object obj, kotlinx.coroutines.r rVar) {
        Y41.l<E, kotlin.G0> lVar = c43108m.f410944c;
        if (lVar != null) {
            kotlinx.coroutines.internal.Q.b(lVar, obj, rVar.getF411960f());
        }
        Throwable thY = c43108m.y();
        int i12 = kotlin.Z.f406624c;
        rVar.resumeWith(new Z.b(thY));
    }

    public static final void f(C43108m c43108m, H1 h12, C c12, int i12) {
        c43108m.getClass();
        h12.c(c12, i12 + C43122v.f411003b);
    }

    public static final void i(C43108m c43108m, kotlinx.coroutines.selects.r rVar) {
        c43108m.getClass();
        C<E> c12 = (C) f410939j.get(c43108m);
        while (!c43108m.D()) {
            long andIncrement = f410935f.getAndIncrement(c43108m);
            long j12 = C43122v.f411003b;
            long j13 = andIncrement / j12;
            int i12 = (int) (andIncrement % j12);
            if (c12.f411887d != j13) {
                C<E> cT2 = c43108m.t(j13, c12);
                if (cT2 == null) {
                    continue;
                } else {
                    c12 = cT2;
                }
            }
            Object objY = c43108m.Y(c12, i12, andIncrement, rVar);
            if (objY == C43122v.f411014m) {
                H1 h12 = rVar instanceof H1 ? (H1) rVar : null;
                if (h12 != null) {
                    c43108m.O();
                    h12.c(c12, i12);
                    return;
                }
                return;
            }
            if (objY != C43122v.f411016o) {
                if (objY == C43122v.f411015n) {
                    throw new IllegalStateException("unexpected");
                }
                c12.b();
                rVar.d(objY);
                return;
            }
            if (andIncrement < c43108m.z()) {
                c12.b();
            }
        }
        rVar.d(C43122v.f411013l);
    }

    public static final int j(C43108m c43108m, C c12, int i12, Object obj, long j12, Object obj2, boolean z12) {
        c43108m.getClass();
        c12.n(i12, obj);
        if (z12) {
            return c43108m.Z(c12, i12, obj, j12, obj2, z12);
        }
        Object objL = c12.l(i12);
        if (objL == null) {
            if (c43108m.k(j12)) {
                if (c12.k(i12, null, C43122v.f411005d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c12.k(i12, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof H1) {
            c12.n(i12, null);
            if (c43108m.W(objL, obj)) {
                c12.o(i12, C43122v.f411010i);
                c43108m.N();
                return 0;
            }
            kotlinx.coroutines.internal.a0 a0Var = C43122v.f411012k;
            if (c12.f410783g.getAndSet((i12 * 2) + 1, a0Var) != a0Var) {
                c12.m(i12, true);
            }
            return 5;
        }
        return c43108m.Z(c12, i12, obj, j12, obj2, z12);
    }

    public final boolean A() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f410939j;
            C<E> cT2 = (C) atomicReferenceFieldUpdater.get(this);
            AtomicLongFieldUpdater atomicLongFieldUpdater = f410935f;
            long j12 = atomicLongFieldUpdater.get(this);
            if (z() <= j12) {
                return false;
            }
            int i12 = C43122v.f411003b;
            long j13 = j12 / i12;
            if (cT2.f411887d == j13 || (cT2 = t(j13, cT2)) != null) {
                cT2.b();
                int i13 = (int) (j12 % i12);
                while (true) {
                    Object objL = cT2.l(i13);
                    if (objL == null || objL == C43122v.f411006e) {
                        if (cT2.k(i13, objL, C43122v.f411009h)) {
                            q();
                            break;
                        }
                    } else {
                        if (objL == C43122v.f411005d) {
                            return true;
                        }
                        if (objL != C43122v.f411011j && objL != C43122v.f411013l && objL != C43122v.f411010i && objL != C43122v.f411009h) {
                            if (objL == C43122v.f411008g) {
                                return true;
                            }
                            if (objL != C43122v.f411007f && j12 == atomicLongFieldUpdater.get(this)) {
                                return true;
                            }
                        }
                    }
                }
                f410935f.compareAndSet(this, j12, j12 + 1);
            } else if (((C) atomicReferenceFieldUpdater.get(this)).f411887d < j13) {
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c3, code lost:
    
        r1 = (kotlinx.coroutines.channels.C) ((kotlinx.coroutines.internal.AbstractC43236f) kotlinx.coroutines.internal.AbstractC43236f.f411897c.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C43108m.C(long, boolean):boolean");
    }

    public final boolean D() {
        return C(f410934e.get(this), true);
    }

    @Override // kotlinx.coroutines.channels.K0
    @Y61.k
    public final kotlinx.coroutines.selects.j<B<E>> E() {
        e eVar = e.f410953b;
        kotlin.jvm.internal.v0.e(3, eVar);
        f fVar = f.f410954b;
        kotlin.jvm.internal.v0.e(3, fVar);
        return new kotlinx.coroutines.selects.k(this, eVar, fVar, this.f410945d);
    }

    public boolean F() {
        return false;
    }

    public final boolean G() {
        long j12 = f410936g.get(this);
        return j12 == 0 || j12 == Long.MAX_VALUE;
    }

    @Override // kotlinx.coroutines.channels.K0
    @Y61.k
    public final Object H() {
        C<E> c12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f410935f;
        long j12 = atomicLongFieldUpdater.get(this);
        long j13 = f410934e.get(this);
        if (C(j13, true)) {
            B.b bVar = B.f410772b;
            Throwable thU = u();
            bVar.getClass();
            return B.b.a(thU);
        }
        if (j12 >= (j13 & 1152921504606846975L)) {
            B.f410772b.getClass();
            return B.f410773c;
        }
        Object obj = C43122v.f411012k;
        C<E> c13 = (C) f410939j.get(this);
        while (!D()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j14 = C43122v.f411003b;
            long j15 = andIncrement / j14;
            int i12 = (int) (andIncrement % j14);
            if (c13.f411887d != j15) {
                C<E> cT2 = t(j15, c13);
                if (cT2 == null) {
                    continue;
                } else {
                    c12 = cT2;
                }
            } else {
                c12 = c13;
            }
            Object objY = Y(c12, i12, andIncrement, obj);
            if (objY == C43122v.f411014m) {
                H1 h12 = obj instanceof H1 ? (H1) obj : null;
                if (h12 != null) {
                    O();
                    h12.c(c12, i12);
                }
                a0(andIncrement);
                c12.i();
                B.f410772b.getClass();
                return B.f410773c;
            }
            if (objY != C43122v.f411016o) {
                if (objY == C43122v.f411015n) {
                    throw new IllegalStateException("unexpected");
                }
                c12.b();
                B.f410772b.getClass();
                return objY;
            }
            if (andIncrement < z()) {
                c12.b();
            }
            c13 = c12;
        }
        B.b bVar2 = B.f410772b;
        Throwable thU2 = u();
        bVar2.getClass();
        return B.b.a(thU2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(long r5, kotlinx.coroutines.channels.C<E> r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f411887d
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            kotlinx.coroutines.internal.f r0 = r7.c()
            kotlinx.coroutines.channels.C r0 = (kotlinx.coroutines.channels.C) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            kotlinx.coroutines.internal.f r5 = r7.c()
            kotlinx.coroutines.channels.C r5 = (kotlinx.coroutines.channels.C) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.channels.C43108m.f410940k
            java.lang.Object r6 = r5.get(r4)
            kotlinx.coroutines.internal.X r6 = (kotlinx.coroutines.internal.X) r6
            long r0 = r6.f411887d
            long r2 = r7.f411887d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.f()
            if (r5 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C43108m.I(long, kotlinx.coroutines.channels.C):void");
    }

    public final Object L(E e12, Continuation<? super kotlin.G0> continuation) {
        UndeliveredElementException undeliveredElementExceptionC;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        Y41.l<E, kotlin.G0> lVar = this.f410944c;
        if (lVar == null || (undeliveredElementExceptionC = kotlinx.coroutines.internal.Q.c(lVar, e12, null)) == null) {
            Throwable thY = y();
            int i12 = kotlin.Z.f406624c;
            rVar.resumeWith(new Z.b(thY));
        } else {
            C42833p.a(undeliveredElementExceptionC, y());
            int i13 = kotlin.Z.f406624c;
            rVar.resumeWith(new Z.b(undeliveredElementExceptionC));
        }
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : kotlin.G0.f406611a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [kotlinx.coroutines.r] */
    /* JADX WARN: Type inference failed for: r13v6 */
    @Override // kotlinx.coroutines.channels.K0
    @Y61.l
    public final Object M(@Y61.k Continuation<? super E> continuation) throws Throwable {
        C<E> c12;
        ?? r13;
        Object objY;
        kotlinx.coroutines.r rVar;
        Y41.l<Throwable, kotlin.G0> lVarA;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f410939j;
        C<E> c13 = (C) atomicReferenceFieldUpdater.get(this);
        while (!D()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f410935f;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j12 = C43122v.f411003b;
            long j13 = andIncrement / j12;
            int i12 = (int) (andIncrement % j12);
            if (c13.f411887d != j13) {
                C<E> cT2 = t(j13, c13);
                if (cT2 == null) {
                    continue;
                } else {
                    c12 = cT2;
                }
            } else {
                c12 = c13;
            }
            Object objY2 = Y(c12, i12, andIncrement, null);
            kotlinx.coroutines.internal.a0 a0Var = C43122v.f411014m;
            if (objY2 == a0Var) {
                throw new IllegalStateException("unexpected");
            }
            kotlinx.coroutines.internal.a0 a0Var2 = C43122v.f411016o;
            if (objY2 != a0Var2) {
                if (objY2 == C43122v.f411015n) {
                    kotlinx.coroutines.r rVarB = C43302t.b(IntrinsicsKt.intercepted(continuation));
                    try {
                        objY = Y(c12, i12, andIncrement, rVarB);
                    } catch (Throwable th2) {
                        th = th2;
                        r13 = rVarB;
                    }
                    try {
                        if (objY == a0Var) {
                            O();
                            rVar = rVarB;
                            rVar.c(c12, i12);
                        } else {
                            rVar = rVarB;
                            Y41.l<E, kotlin.G0> lVar = this.f410944c;
                            CoroutineContext coroutineContext = rVar.f411960f;
                            if (objY == a0Var2) {
                                if (andIncrement < z()) {
                                    c12.b();
                                }
                                C<E> c14 = (C) atomicReferenceFieldUpdater.get(this);
                                while (true) {
                                    if (D()) {
                                        int i13 = kotlin.Z.f406624c;
                                        rVar.resumeWith(new Z.b(x()));
                                        break;
                                    }
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j14 = C43122v.f411003b;
                                    long j15 = andIncrement2 / j14;
                                    int i14 = (int) (andIncrement2 % j14);
                                    if (c14.f411887d != j15) {
                                        C<E> cT3 = t(j15, c14);
                                        if (cT3 != null) {
                                            c14 = cT3;
                                        }
                                    }
                                    CoroutineContext coroutineContext2 = coroutineContext;
                                    Y41.l<E, kotlin.G0> lVar2 = lVar;
                                    objY = Y(c14, i14, andIncrement2, rVar);
                                    if (objY == C43122v.f411014m) {
                                        O();
                                        rVar.c(c14, i14);
                                        break;
                                    }
                                    if (objY == C43122v.f411016o) {
                                        if (andIncrement2 < z()) {
                                            c14.b();
                                        }
                                        coroutineContext = coroutineContext2;
                                        lVar = lVar2;
                                    } else {
                                        if (objY == C43122v.f411015n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        c14.b();
                                        lVarA = lVar2 != null ? kotlinx.coroutines.internal.Q.a(lVar2, objY, coroutineContext2) : null;
                                    }
                                }
                            } else {
                                c12.b();
                                lVarA = lVar != null ? kotlinx.coroutines.internal.Q.a(lVar, objY, coroutineContext) : null;
                            }
                            rVar.C(lVarA, objY);
                        }
                        objY2 = rVar.o();
                        if (objY2 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(continuation);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r13 = a0Var;
                        r13.z();
                        throw th;
                    }
                } else {
                    c12.b();
                }
                return objY2;
            }
            if (andIncrement < z()) {
                c12.b();
            }
            c13 = c12;
        }
        Throwable thX = x();
        int i15 = kotlinx.coroutines.internal.Z.f411889a;
        throw thX;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R(kotlinx.coroutines.channels.C r17, int r18, long r19, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C43108m.R(kotlinx.coroutines.channels.C, int, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
    
        r18.d(kotlin.G0.f406611a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S(@Y61.k kotlinx.coroutines.selects.r<?> r18, @Y61.l java.lang.Object r19) {
        /*
            r17 = this;
            r8 = r17
            r9 = r18
            r10 = r19
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.C43108m.f410938i
            java.lang.Object r0 = r0.get(r8)
            kotlinx.coroutines.channels.C r0 = (kotlinx.coroutines.channels.C) r0
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.C43108m.f410934e
            long r1 = r1.getAndIncrement(r8)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r11 = r1 & r3
            r3 = 0
            boolean r13 = r8.C(r1, r3)
            int r1 = kotlinx.coroutines.channels.C43122v.f411003b
            long r1 = (long) r1
            long r3 = r11 / r1
            long r1 = r11 % r1
            int r14 = (int) r1
            long r1 = r0.f411887d
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            Y41.l<E, kotlin.G0> r15 = r8.f410944c
            if (r1 == 0) goto L4a
            kotlinx.coroutines.channels.C r1 = a(r8, r3, r0)
            if (r1 != 0) goto L48
            if (r13 == 0) goto Le
            if (r15 == 0) goto L41
            kotlin.coroutines.CoroutineContext r0 = r18.getF412215b()
            kotlinx.coroutines.internal.Q.b(r15, r10, r0)
        L41:
            kotlinx.coroutines.internal.a0 r0 = kotlinx.coroutines.channels.C43122v.f411013l
            r9.d(r0)
            goto Lbe
        L48:
            r7 = r1
            goto L4b
        L4a:
            r7 = r0
        L4b:
            r0 = r17
            r1 = r7
            r2 = r14
            r3 = r19
            r4 = r11
            r6 = r18
            r16 = r7
            r7 = r13
            int r0 = j(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb8
            r1 = 1
            if (r0 == r1) goto Lb2
            r1 = 2
            if (r0 == r1) goto L92
            r1 = 3
            if (r0 == r1) goto L8a
            r1 = 4
            if (r0 == r1) goto L73
            r1 = 5
            if (r0 == r1) goto L6d
            goto L70
        L6d:
            r16.b()
        L70:
            r0 = r16
            goto Le
        L73:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.C43108m.f410935f
            long r0 = r0.get(r8)
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 >= 0) goto L80
            r16.b()
        L80:
            if (r15 == 0) goto L41
            kotlin.coroutines.CoroutineContext r0 = r18.getF412215b()
            kotlinx.coroutines.internal.Q.b(r15, r10, r0)
            goto L41
        L8a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected"
            r0.<init>(r1)
            throw r0
        L92:
            if (r13 == 0) goto La1
            r16.i()
            if (r15 == 0) goto L41
            kotlin.coroutines.CoroutineContext r0 = r18.getF412215b()
            kotlinx.coroutines.internal.Q.b(r15, r10, r0)
            goto L41
        La1:
            boolean r0 = r9 instanceof kotlinx.coroutines.H1
            if (r0 == 0) goto La9
            r0 = r9
            kotlinx.coroutines.H1 r0 = (kotlinx.coroutines.H1) r0
            goto Laa
        La9:
            r0 = 0
        Laa:
            if (r0 == 0) goto Lbe
            r1 = r16
            f(r8, r0, r1, r14)
            goto Lbe
        Lb2:
            kotlin.G0 r0 = kotlin.G0.f406611a
            r9.d(r0)
            goto Lbe
        Lb8:
            r1 = r16
            r1.b()
            goto Lb2
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C43108m.S(kotlinx.coroutines.selects.r, java.lang.Object):void");
    }

    public final void T(H1 h12, boolean z12) {
        if (h12 instanceof b) {
            kotlinx.coroutines.r rVar = ((b) h12).f410949b;
            int i12 = kotlin.Z.f406624c;
            rVar.resumeWith(Boolean.FALSE);
            return;
        }
        if (h12 instanceof InterfaceC43271q) {
            Continuation continuation = (Continuation) h12;
            int i13 = kotlin.Z.f406624c;
            continuation.resumeWith(new Z.b(z12 ? x() : y()));
            return;
        }
        if (h12 instanceof J0) {
            kotlinx.coroutines.r<B<? extends E>> rVar2 = ((J0) h12).f410807b;
            int i14 = kotlin.Z.f406624c;
            B.b bVar = B.f410772b;
            Throwable thU = u();
            bVar.getClass();
            rVar2.resumeWith(B.a(B.b.a(thU)));
            return;
        }
        if (!(h12 instanceof a)) {
            if (h12 instanceof kotlinx.coroutines.selects.r) {
                ((kotlinx.coroutines.selects.r) h12).e(this, C43122v.f411013l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + h12).toString());
            }
        }
        a aVar = (a) h12;
        kotlinx.coroutines.r<? super Boolean> rVar3 = aVar.f410947c;
        aVar.f410947c = null;
        aVar.f410946b = C43122v.f411013l;
        Throwable thU2 = C43108m.this.u();
        if (thU2 == null) {
            int i15 = kotlin.Z.f406624c;
            rVar3.resumeWith(Boolean.FALSE);
        } else {
            int i16 = kotlin.Z.f406624c;
            rVar3.resumeWith(new Z.b(thU2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        r0 = kotlin.Z.f406624c;
        r9.resumeWith(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
     */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object U(E r19, @Y61.k kotlin.coroutines.Continuation<? super java.lang.Boolean> r20) {
        /*
            r18 = this;
            r8 = r18
            kotlinx.coroutines.r r9 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r20)
            r10 = 1
            r9.<init>(r10, r0)
            r9.p()
            Y41.l<E, kotlin.G0> r0 = r8.f410944c
            if (r0 != 0) goto Lc0
            kotlinx.coroutines.channels.m$b r11 = new kotlinx.coroutines.channels.m$b
            r11.<init>(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.C43108m.f410938i
            java.lang.Object r0 = r0.get(r8)
            kotlinx.coroutines.channels.C r0 = (kotlinx.coroutines.channels.C) r0
        L20:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.C43108m.f410934e
            long r1 = r1.getAndIncrement(r8)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r12 = r1 & r3
            r14 = 0
            boolean r15 = r8.C(r1, r14)
            int r1 = kotlinx.coroutines.channels.C43122v.f411003b
            long r1 = (long) r1
            long r3 = r12 / r1
            long r1 = r12 % r1
            int r7 = (int) r1
            long r1 = r0.f411887d
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L55
            kotlinx.coroutines.channels.C r1 = a(r8, r3, r0)
            if (r1 != 0) goto L53
            if (r15 == 0) goto L20
        L48:
            int r0 = kotlin.Z.f406624c
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r14)
            r9.resumeWith(r0)
            goto Lb2
        L53:
            r6 = r1
            goto L56
        L55:
            r6 = r0
        L56:
            r0 = r18
            r1 = r6
            r2 = r7
            r3 = r19
            r4 = r12
            r16 = r6
            r6 = r11
            r17 = r7
            r7 = r15
            int r0 = j(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lac
            if (r0 == r10) goto La2
            r1 = 2
            if (r0 == r1) goto L94
            r1 = 3
            if (r0 == r1) goto L8c
            r1 = 4
            if (r0 == r1) goto L7e
            r1 = 5
            if (r0 == r1) goto L78
            goto L7b
        L78:
            r16.b()
        L7b:
            r0 = r16
            goto L20
        L7e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.C43108m.f410935f
            long r0 = r0.get(r8)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 >= 0) goto L48
            r16.b()
            goto L48
        L8c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected"
            r0.<init>(r1)
            throw r0
        L94:
            if (r15 == 0) goto L9a
            r16.i()
            goto L48
        L9a:
            r1 = r16
            r0 = r17
            f(r8, r11, r1, r0)
            goto Lb2
        La2:
            int r0 = kotlin.Z.f406624c
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r10)
            r9.resumeWith(r0)
            goto Lb2
        Lac:
            r1 = r16
            r1.b()
            goto La2
        Lb2:
            java.lang.Object r0 = r9.o()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto Lbf
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r20)
        Lbf:
            return r0
        Lc0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C43108m.U(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean V() {
        if (C(f410934e.get(this), false)) {
            return false;
        }
        return !k(r0 & 1152921504606846975L);
    }

    public final boolean W(Object obj, E e12) {
        if (obj instanceof kotlinx.coroutines.selects.r) {
            return ((kotlinx.coroutines.selects.r) obj).e(this, e12);
        }
        boolean z12 = obj instanceof J0;
        Y41.l<E, kotlin.G0> lVar = this.f410944c;
        if (z12) {
            J0 j02 = (J0) obj;
            kotlinx.coroutines.r<B<? extends E>> rVar = j02.f410807b;
            B.f410772b.getClass();
            return C43122v.a(rVar, B.a(e12), lVar != null ? kotlinx.coroutines.internal.Q.a(lVar, e12, j02.f410807b.f411960f) : null);
        }
        if (!(obj instanceof a)) {
            if (obj instanceof InterfaceC43271q) {
                InterfaceC43271q interfaceC43271q = (InterfaceC43271q) obj;
                return C43122v.a(interfaceC43271q, e12, lVar != null ? kotlinx.coroutines.internal.Q.a(lVar, e12, interfaceC43271q.getF411960f()) : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        a aVar = (a) obj;
        kotlinx.coroutines.r<? super Boolean> rVar2 = aVar.f410947c;
        aVar.f410947c = null;
        aVar.f410946b = e12;
        Boolean bool = Boolean.TRUE;
        Y41.l<E, kotlin.G0> lVar2 = C43108m.this.f410944c;
        return C43122v.a(rVar2, bool, lVar2 != null ? kotlinx.coroutines.internal.Q.a(lVar2, e12, rVar2.f411960f) : null);
    }

    public final boolean X(Object obj, C<E> c12, int i12) {
        if (obj instanceof InterfaceC43271q) {
            return C43122v.a((InterfaceC43271q) obj, kotlin.G0.f406611a, null);
        }
        if (obj instanceof kotlinx.coroutines.selects.r) {
            TrySelectDetailedResult trySelectDetailedResultL = ((kotlinx.coroutines.selects.o) obj).l(this, kotlin.G0.f406611a);
            if (trySelectDetailedResultL == TrySelectDetailedResult.f412193c) {
                c12.n(i12, null);
            }
            return trySelectDetailedResultL == TrySelectDetailedResult.f412192b;
        }
        if (obj instanceof b) {
            return C43122v.a(((b) obj).f410949b, Boolean.TRUE, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final Object Y(C<E> c12, int i12, long j12, Object obj) {
        Object objL = c12.l(i12);
        AtomicReferenceArray atomicReferenceArray = c12.f410783g;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f410934e;
        if (objL == null) {
            if (j12 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return C43122v.f411015n;
                }
                if (c12.k(i12, objL, obj)) {
                    q();
                    return C43122v.f411014m;
                }
            }
        } else if (objL == C43122v.f411005d && c12.k(i12, objL, C43122v.f411010i)) {
            q();
            Object obj2 = atomicReferenceArray.get(i12 * 2);
            c12.n(i12, null);
            return obj2;
        }
        while (true) {
            Object objL2 = c12.l(i12);
            if (objL2 == null || objL2 == C43122v.f411006e) {
                if (j12 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c12.k(i12, objL2, C43122v.f411009h)) {
                        q();
                        return C43122v.f411016o;
                    }
                } else {
                    if (obj == null) {
                        return C43122v.f411015n;
                    }
                    if (c12.k(i12, objL2, obj)) {
                        q();
                        return C43122v.f411014m;
                    }
                }
            } else if (objL2 != C43122v.f411005d) {
                kotlinx.coroutines.internal.a0 a0Var = C43122v.f411011j;
                if (objL2 == a0Var) {
                    return C43122v.f411016o;
                }
                if (objL2 == C43122v.f411009h) {
                    return C43122v.f411016o;
                }
                if (objL2 == C43122v.f411013l) {
                    q();
                    return C43122v.f411016o;
                }
                if (objL2 != C43122v.f411008g && c12.k(i12, objL2, C43122v.f411007f)) {
                    boolean z12 = objL2 instanceof R0;
                    if (z12) {
                        objL2 = ((R0) objL2).f410836a;
                    }
                    if (X(objL2, c12, i12)) {
                        c12.o(i12, C43122v.f411010i);
                        q();
                        Object obj3 = atomicReferenceArray.get(i12 * 2);
                        c12.n(i12, null);
                        return obj3;
                    }
                    c12.o(i12, a0Var);
                    c12.i();
                    if (z12) {
                        q();
                    }
                    return C43122v.f411016o;
                }
            } else if (c12.k(i12, objL2, C43122v.f411010i)) {
                q();
                Object obj4 = atomicReferenceArray.get(i12 * 2);
                c12.n(i12, null);
                return obj4;
            }
        }
    }

    public final int Z(C<E> c12, int i12, E e12, long j12, Object obj, boolean z12) {
        while (true) {
            Object objL = c12.l(i12);
            if (objL == null) {
                if (!k(j12) || z12) {
                    if (z12) {
                        if (c12.k(i12, null, C43122v.f411011j)) {
                            c12.i();
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (c12.k(i12, null, obj)) {
                            return 2;
                        }
                    }
                } else if (c12.k(i12, null, C43122v.f411005d)) {
                    return 1;
                }
            } else {
                if (objL != C43122v.f411006e) {
                    kotlinx.coroutines.internal.a0 a0Var = C43122v.f411012k;
                    if (objL == a0Var) {
                        c12.n(i12, null);
                        return 5;
                    }
                    if (objL == C43122v.f411009h) {
                        c12.n(i12, null);
                        return 5;
                    }
                    if (objL == C43122v.f411013l) {
                        c12.n(i12, null);
                        l();
                        return 4;
                    }
                    c12.n(i12, null);
                    if (objL instanceof R0) {
                        objL = ((R0) objL).f410836a;
                    }
                    if (W(objL, e12)) {
                        c12.o(i12, C43122v.f411010i);
                        N();
                        return 0;
                    }
                    if (c12.f410783g.getAndSet((i12 * 2) + 1, a0Var) == a0Var) {
                        return 5;
                    }
                    c12.m(i12, true);
                    return 5;
                }
                if (c12.k(i12, objL, C43122v.f411005d)) {
                    return 1;
                }
            }
        }
    }

    public final void a0(long j12) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j13;
        long j14;
        if (G()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f410936g;
        } while (atomicLongFieldUpdater.get(this) <= j12);
        int i12 = C43122v.f411004c;
        int i13 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f410937h;
            if (i13 >= i12) {
                do {
                    j13 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j13, 4611686018427387904L + (j13 & 4611686018427387903L)));
                while (true) {
                    long j15 = atomicLongFieldUpdater.get(this);
                    long j16 = atomicLongFieldUpdater2.get(this);
                    long j17 = j16 & 4611686018427387903L;
                    boolean z12 = (j16 & 4611686018427387904L) != 0;
                    if (j15 == j17 && j15 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z12) {
                        atomicLongFieldUpdater2.compareAndSet(this, j16, j17 + 4611686018427387904L);
                    }
                }
                do {
                    j14 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j14, j14 & 4611686018427387903L));
                return;
            }
            long j18 = atomicLongFieldUpdater.get(this);
            if (j18 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j18 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i13++;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.K0
    public final void c(@Y61.l CancellationException cancellationException) {
        m(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.M0
    public final void g(@Y61.k Y41.l<? super Throwable, kotlin.G0> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f410942m;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, lVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            kotlinx.coroutines.internal.a0 a0Var = C43122v.f411018q;
            if (obj != a0Var) {
                if (obj == C43122v.f411019r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            kotlinx.coroutines.internal.a0 a0Var2 = C43122v.f411019r;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, a0Var, a0Var2)) {
                if (atomicReferenceFieldUpdater.get(this) != a0Var) {
                    break;
                }
            }
            lVar.invoke(u());
            return;
        }
    }

    @Override // kotlinx.coroutines.channels.M0
    public boolean h(@Y61.l Throwable th2) {
        return n(th2, false);
    }

    @Override // kotlinx.coroutines.channels.K0
    @Y61.k
    public final InterfaceC43125y<E> iterator() {
        return new a();
    }

    public final boolean k(long j12) {
        return j12 < f410936g.get(this) || j12 < f410935f.get(this) + ((long) this.f410943b);
    }

    @Override // kotlinx.coroutines.channels.M0
    public boolean l() {
        return C(f410934e.get(this), false);
    }

    public boolean m(@Y61.l CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        return n(cancellationException, true);
    }

    public final boolean n(@Y61.l Throwable th2, boolean z12) {
        boolean z13;
        long j12;
        long j13;
        long j14;
        Object obj;
        long j15;
        long j16;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f410934e;
        if (z12) {
            do {
                j16 = atomicLongFieldUpdater.get(this);
                if (((int) (j16 >> 60)) != 0) {
                    break;
                }
                C<Object> c12 = C43122v.f411002a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j16, (1 << 60) + (j16 & 1152921504606846975L)));
        }
        kotlinx.coroutines.internal.a0 a0Var = C43122v.f411020s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f410941l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, a0Var, th2)) {
                z13 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != a0Var) {
                z13 = false;
                break;
            }
        }
        if (z12) {
            do {
                j15 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j15, (3 << 60) + (j15 & 1152921504606846975L)));
        } else {
            do {
                j12 = atomicLongFieldUpdater.get(this);
                int i12 = (int) (j12 >> 60);
                if (i12 == 0) {
                    j13 = j12 & 1152921504606846975L;
                    j14 = 2;
                } else {
                    if (i12 != 1) {
                        break;
                    }
                    j13 = j12 & 1152921504606846975L;
                    j14 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j12, (j14 << 60) + j13));
        }
        l();
        J();
        if (z13) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f410942m;
                obj = atomicReferenceFieldUpdater2.get(this);
                kotlinx.coroutines.internal.a0 a0Var2 = obj == null ? C43122v.f411018q : C43122v.f411019r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, a0Var2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                kotlin.jvm.internal.v0.e(1, obj);
                ((Y41.l) obj).invoke(u());
            }
        }
        return z13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r1 = (kotlinx.coroutines.channels.C) ((kotlinx.coroutines.internal.AbstractC43236f) kotlinx.coroutines.internal.AbstractC43236f.f411897c.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.channels.C<E> o(long r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C43108m.o(long):kotlinx.coroutines.channels.C");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNext(@Y61.k Object obj) {
        w(obj);
    }

    public final void p(long j12) {
        UndeliveredElementException undeliveredElementExceptionC;
        C<E> c12 = (C) f410939j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f410935f;
            long j13 = atomicLongFieldUpdater.get(this);
            if (j12 < Math.max(this.f410943b + j13, f410936g.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j13, j13 + 1)) {
                long j14 = C43122v.f411003b;
                long j15 = j13 / j14;
                int i12 = (int) (j13 % j14);
                if (c12.f411887d != j15) {
                    C<E> cT2 = t(j15, c12);
                    if (cT2 == null) {
                        continue;
                    } else {
                        c12 = cT2;
                    }
                }
                Object objY = Y(c12, i12, j13, null);
                if (objY != C43122v.f411016o) {
                    c12.b();
                    Y41.l<E, kotlin.G0> lVar = this.f410944c;
                    if (lVar != null && (undeliveredElementExceptionC = kotlinx.coroutines.internal.Q.c(lVar, objY, null)) != null) {
                        throw undeliveredElementExceptionC;
                    }
                } else if (j13 < z()) {
                    c12.b();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0195, code lost:
    
        B(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0198, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C43108m.q():void");
    }

    @Override // kotlinx.coroutines.channels.K0
    @Y61.l
    public final Object s(@Y61.k ContinuationImpl continuationImpl) {
        return Q(this, continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01e1, code lost:
    
        return kotlin.G0.f406611a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
    
        r7 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ea, code lost:
    
        d(r23, r24, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ed, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f1, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0135, code lost:
    
        if (r21 >= r5.get(r23)) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0137, code lost:
    
        r17.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x013a, code lost:
    
        r1 = r20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    @Override // kotlinx.coroutines.channels.M0
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object send(E r24, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C43108m.send(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final C<E> t(long j12, C<E> c12) {
        Object objA;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j13;
        C<Object> c13 = C43122v.f411002a;
        C43121u c43121u = C43121u.f410996b;
        loop0: while (true) {
            objA = C43235e.a(c12, j12, c43121u);
            if (!kotlinx.coroutines.internal.Y.b(objA)) {
                kotlinx.coroutines.internal.X xA2 = kotlinx.coroutines.internal.Y.a(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f410939j;
                    kotlinx.coroutines.internal.X x12 = (kotlinx.coroutines.internal.X) atomicReferenceFieldUpdater.get(this);
                    if (x12.f411887d >= xA2.f411887d) {
                        break loop0;
                    }
                    if (!xA2.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, x12, xA2)) {
                        if (atomicReferenceFieldUpdater.get(this) != x12) {
                            if (xA2.f()) {
                                xA2.e();
                            }
                        }
                    }
                    if (x12.f()) {
                        x12.e();
                    }
                }
            } else {
                break;
            }
        }
        if (kotlinx.coroutines.internal.Y.b(objA)) {
            l();
            if (c12.f411887d * C43122v.f411003b >= z()) {
                return null;
            }
            c12.b();
            return null;
        }
        C<E> c14 = (C) kotlinx.coroutines.internal.Y.a(objA);
        boolean zG2 = G();
        long j14 = c14.f411887d;
        if (!zG2 && j12 <= f410936g.get(this) / C43122v.f411003b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f410940k;
                kotlinx.coroutines.internal.X x13 = (kotlinx.coroutines.internal.X) atomicReferenceFieldUpdater2.get(this);
                if (x13.f411887d >= j14 || !c14.j()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, x13, c14)) {
                    if (atomicReferenceFieldUpdater2.get(this) != x13) {
                        if (c14.f()) {
                            c14.e();
                        }
                    }
                }
                if (x13.f()) {
                    x13.e();
                }
            }
        }
        if (j14 <= j12) {
            return c14;
        }
        long j15 = C43122v.f411003b * j14;
        do {
            atomicLongFieldUpdater = f410935f;
            j13 = atomicLongFieldUpdater.get(this);
            if (j13 >= j15) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j13, j15));
        if (j14 * C43122v.f411003b >= z()) {
            return null;
        }
        c14.b();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c6, code lost:
    
        r3 = (kotlinx.coroutines.channels.C) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cd, code lost:
    
        if (r3 != null) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C43108m.toString():java.lang.String");
    }

    @Y61.l
    public final Throwable u() {
        return (Throwable) f410941l.get(this);
    }

    @Override // kotlinx.coroutines.channels.K0
    @Y61.k
    public final kotlinx.coroutines.selects.j<E> v() {
        c cVar = c.f410951b;
        kotlin.jvm.internal.v0.e(3, cVar);
        d dVar = d.f410952b;
        kotlin.jvm.internal.v0.e(3, dVar);
        return new kotlinx.coroutines.selects.k(this, cVar, dVar, this.f410945d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c6, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return r1;
     */
    @Override // kotlinx.coroutines.channels.M0
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(E r20) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C43108m.w(java.lang.Object):java.lang.Object");
    }

    public final Throwable x() {
        Throwable thU = u();
        return thU == null ? new ClosedReceiveChannelException("Channel was closed") : thU;
    }

    @Y61.k
    public final Throwable y() {
        Throwable thU = u();
        return thU == null ? new ClosedSendChannelException("Channel was closed") : thU;
    }

    public final long z() {
        return f410934e.get(this) & 1152921504606846975L;
    }

    public void J() {
    }

    public void N() {
    }

    public void O() {
    }

    public /* synthetic */ C43108m(int i12, Y41.l lVar, int i13, C42822w c42822w) {
        this(i12, (i13 & 2) != 0 ? null : lVar);
    }
}
