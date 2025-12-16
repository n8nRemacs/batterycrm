package kotlinx.coroutines.debug.internal;

import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.X;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;

/* compiled from: DebugProbesImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000b\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004R\u000b\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/debug/internal/i;", "", "<init>", "()V", "Lkotlinx/atomicfu/AtomicInt;", "installations", "Lkotlinx/atomicfu/AtomicLong;", "sequenceNumber", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final i f411072a = new i();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.debug.internal.b<a<?>, Boolean> f411073b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public static final Y41.l<Boolean, G0> f411074c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final kotlinx.coroutines.debug.internal.b<CoroutineStackFrame, g> f411075d;

    /* compiled from: DebugProbesImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/debug/internal/i$a;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements Continuation<T>, CoroutineStackFrame {
        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Y61.l
        public final CoroutineStackFrame getCallerFrame() {
            throw null;
        }

        @Override // kotlin.coroutines.Continuation
        @Y61.k
        /* renamed from: getContext */
        public final CoroutineContext getF411447c() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        @Y61.l
        public final StackTraceElement getStackTraceElement() {
            throw null;
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(@Y61.k Object obj) {
            i.f411072a.getClass();
            i.f411073b.remove(this);
            throw null;
        }

        @Y61.k
        public final String toString() {
            throw null;
        }
    }

    /* compiled from: DebugProbesImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        private volatile /* synthetic */ int installations$volatile;
        private volatile /* synthetic */ long sequenceNumber$volatile;

        static {
            AtomicIntegerFieldUpdater.newUpdater(b.class, "installations$volatile");
            AtomicLongFieldUpdater.newUpdater(b.class, "sequenceNumber$volatile");
        }

        public b() {
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }
    }

    static {
        Object bVar;
        new _COROUTINE.a();
        _COROUTINE.a.b();
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        C42822w c42822w = null;
        f411073b = new kotlinx.coroutines.debug.internal.b<>(false, 1, c42822w);
        try {
            int i12 = Z.f406624c;
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
            v0.e(1, objNewInstance);
            bVar = (Y41.l) objNewInstance;
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (bVar instanceof Z.b) {
            bVar = null;
        }
        f411074c = (Y41.l) bVar;
        f411075d = new kotlinx.coroutines.debug.internal.b<>(true);
        new b(c42822w);
    }
}
