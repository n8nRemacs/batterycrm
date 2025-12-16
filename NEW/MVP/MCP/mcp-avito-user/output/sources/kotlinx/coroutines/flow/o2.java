package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC43163a;
import kotlinx.coroutines.flow.internal.AbstractC43165c;

/* compiled from: StateFlow.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006R\u0011\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/flow/o2;", "T", "Lkotlinx/coroutines/flow/internal/a;", "Lkotlinx/coroutines/flow/q2;", "Lkotlinx/coroutines/flow/Z1;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/internal/w;", "Lkotlinx/atomicfu/AtomicRef;", "", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class o2<T> extends AbstractC43163a<q2> implements Z1<T>, InterfaceC43142c<T>, kotlinx.coroutines.flow.internal.w<T> {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f411660g = AtomicReferenceFieldUpdater.newUpdater(o2.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: f, reason: collision with root package name */
    public int f411661f;

    /* compiled from: StateFlow.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {384, 396, 401}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public Object f411662q;

        /* renamed from: r, reason: collision with root package name */
        public InterfaceC43172j f411663r;

        /* renamed from: s, reason: collision with root package name */
        public Object f411664s;

        /* renamed from: t, reason: collision with root package name */
        public kotlinx.coroutines.N0 f411665t;

        /* renamed from: u, reason: collision with root package name */
        public Object f411666u;

        /* renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f411667v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ o2<T> f411668w;

        /* renamed from: x, reason: collision with root package name */
        public int f411669x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o2<T> o2Var, Continuation<? super a> continuation) {
            super(continuation);
            this.f411668w = o2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411667v = obj;
            this.f411669x |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f411668w.collect(null, this);
        }
    }

    public o2(@Y61.k Object obj) {
        this._state$volatile = obj;
    }

    @Override // kotlinx.coroutines.flow.internal.w
    @Y61.k
    public final InterfaceC43160i<T> Bc(@Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow) {
        return (((i12 < 0 || i12 >= 2) && i12 != -2) || bufferOverflow != BufferOverflow.f410778c) ? f2.d(this, coroutineContext, i12, bufferOverflow) : this;
    }

    @Override // kotlinx.coroutines.flow.d2
    @Y61.k
    public final List<T> E3() {
        return Collections.singletonList(getValue());
    }

    @Override // kotlinx.coroutines.flow.Y1
    public final boolean K5(T t12) {
        setValue(t12);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.coroutines.internal.a0] */
    @Override // kotlinx.coroutines.flow.Z1
    public final boolean N3(T t12, T t13) {
        ?? r02 = kotlinx.coroutines.flow.internal.z.f411583a;
        if (t12 == null) {
            t12 = r02;
        }
        if (t13 == null) {
            t13 = r02;
        }
        return e(t12, t13);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43163a
    public final AbstractC43165c b() {
        return new q2();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43163a
    public final AbstractC43165c[] c() {
        return new q2[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:45:0x00b8, B:47:0x00be], limit reached: 62 */
    /* JADX WARN: Path cross not found for [B:47:0x00be, B:45:0x00b8], limit reached: 62 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x003a, B:37:0x00a2, B:39:0x00aa, B:42:0x00b1, B:43:0x00b5, B:45:0x00b8, B:55:0x00d9, B:58:0x00e6, B:47:0x00be, B:51:0x00c5, B:21:0x0057, B:24:0x0068, B:36:0x0093), top: B:63:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x003a, B:37:0x00a2, B:39:0x00aa, B:42:0x00b1, B:43:0x00b5, B:45:0x00b8, B:55:0x00d9, B:58:0x00e6, B:47:0x00be, B:51:0x00c5, B:21:0x0057, B:24:0x0068, B:36:0x0093), top: B:63:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e6 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x003a, B:37:0x00a2, B:39:0x00aa, B:42:0x00b1, B:43:0x00b5, B:45:0x00b8, B:55:0x00d9, B:58:0x00e6, B:47:0x00be, B:51:0x00c5, B:21:0x0057, B:24:0x0068, B:36:0x0093), top: B:63:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlinx.coroutines.flow.internal.c] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00e5 -> B:37:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00f6 -> B:37:0x00a2). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(@Y61.k kotlinx.coroutines.flow.InterfaceC43172j<? super T> r11, @Y61.k kotlin.coroutines.Continuation<?> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.o2.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean e(Object obj, Object obj2) {
        int i12;
        Object obj3;
        kotlinx.coroutines.internal.a0 a0Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f411660g;
            Object obj4 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.L.f(obj4, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.L.f(obj4, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i13 = this.f411661f;
            if ((i13 & 1) != 0) {
                this.f411661f = i13 + 2;
                return true;
            }
            int i14 = i13 + 1;
            this.f411661f = i14;
            Object obj5 = this.f411454b;
            kotlin.G0 g02 = kotlin.G0.f406611a;
            while (true) {
                q2[] q2VarArr = (q2[]) obj5;
                if (q2VarArr != null) {
                    for (q2 q2Var : q2VarArr) {
                        if (q2Var != null) {
                            AtomicReference<Object> atomicReference = q2Var.f411698a;
                            while (true) {
                                Object obj6 = atomicReference.get();
                                if (obj6 != null && obj6 != (a0Var = p2.f411686b)) {
                                    kotlinx.coroutines.internal.a0 a0Var2 = p2.f411685a;
                                    if (obj6 != a0Var2) {
                                        while (!atomicReference.compareAndSet(obj6, a0Var2)) {
                                            if (atomicReference.get() != obj6) {
                                                break;
                                            }
                                        }
                                        int i15 = kotlin.Z.f406624c;
                                        ((kotlinx.coroutines.r) obj6).resumeWith(kotlin.G0.f406611a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj6, a0Var)) {
                                        if (atomicReference.get() != obj6) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i12 = this.f411661f;
                    if (i12 == i14) {
                        this.f411661f = i14 + 1;
                        return true;
                    }
                    obj3 = this.f411454b;
                    kotlin.G0 g03 = kotlin.G0.f406611a;
                }
                obj5 = obj3;
                i14 = i12;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.Y1, kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    public final Object emit(T t12, @Y61.k Continuation<? super kotlin.G0> continuation) {
        setValue(t12);
        return kotlin.G0.f406611a;
    }

    @Override // kotlinx.coroutines.flow.Z1, kotlinx.coroutines.flow.n2
    public final T getValue() {
        kotlinx.coroutines.internal.a0 a0Var = kotlinx.coroutines.flow.internal.z.f411583a;
        T t12 = (T) f411660g.get(this);
        if (t12 == a0Var) {
            return null;
        }
        return t12;
    }

    @Override // kotlinx.coroutines.flow.Y1
    public final void h4() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.Z1
    public final void setValue(T t12) {
        if (t12 == null) {
            t12 = (T) kotlinx.coroutines.flow.internal.z.f411583a;
        }
        e(null, t12);
    }
}
