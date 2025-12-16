package kotlinx.coroutines.flow;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.C43302t;
import kotlinx.coroutines.InterfaceC43268o0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC43163a;
import kotlinx.coroutines.flow.internal.AbstractC43165c;
import kotlinx.coroutines.flow.internal.C43164b;

/* compiled from: SharedFlow.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/flow/e2;", "T", "Lkotlinx/coroutines/flow/internal/a;", "Lkotlinx/coroutines/flow/g2;", "Lkotlinx/coroutines/flow/Y1;", "Lkotlinx/coroutines/flow/c;", "Lkotlinx/coroutines/flow/internal/w;", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class e2<T> extends AbstractC43163a<g2> implements Y1<T>, InterfaceC43142c<T>, kotlinx.coroutines.flow.internal.w<T> {

    /* renamed from: f, reason: collision with root package name */
    public final int f411362f;

    /* renamed from: g, reason: collision with root package name */
    public final int f411363g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final BufferOverflow f411364h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Object[] f411365i;

    /* renamed from: j, reason: collision with root package name */
    public long f411366j;

    /* renamed from: k, reason: collision with root package name */
    public long f411367k;

    /* renamed from: l, reason: collision with root package name */
    public int f411368l;

    /* renamed from: m, reason: collision with root package name */
    public int f411369m;

    /* compiled from: SharedFlow.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/flow/e2$a;", "Lkotlinx/coroutines/o0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43268o0 {

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final e2<?> f411370b;

        /* renamed from: c, reason: collision with root package name */
        @X41.f
        public final long f411371c;

        /* renamed from: d, reason: collision with root package name */
        @X41.f
        @Y61.l
        public final Object f411372d;

        /* renamed from: e, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final kotlinx.coroutines.r f411373e;

        public a(@Y61.k e2 e2Var, long j12, @Y61.l Object obj, @Y61.k kotlinx.coroutines.r rVar) {
            this.f411370b = e2Var;
            this.f411371c = j12;
            this.f411372d = obj;
            this.f411373e = rVar;
        }

        @Override // kotlinx.coroutines.InterfaceC43268o0
        public final void dispose() {
            e2<?> e2Var = this.f411370b;
            synchronized (e2Var) {
                if (this.f411371c < e2Var.k()) {
                    return;
                }
                Object[] objArr = e2Var.f411365i;
                long j12 = this.f411371c;
                if (objArr[((int) j12) & (objArr.length - 1)] != this) {
                    return;
                }
                f2.c(objArr, j12, f2.f411393a);
                e2Var.f();
                kotlin.G0 g02 = kotlin.G0.f406611a;
            }
        }
    }

    /* compiled from: SharedFlow.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BufferOverflow bufferOverflow = BufferOverflow.f410777b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BufferOverflow bufferOverflow2 = BufferOverflow.f410777b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: SharedFlow.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {382, 389, 392}, m = "collect$suspendImpl", n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class c<T> extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public e2 f411374q;

        /* renamed from: r, reason: collision with root package name */
        public InterfaceC43172j f411375r;

        /* renamed from: s, reason: collision with root package name */
        public g2 f411376s;

        /* renamed from: t, reason: collision with root package name */
        public kotlinx.coroutines.N0 f411377t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f411378u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ e2<T> f411379v;

        /* renamed from: w, reason: collision with root package name */
        public int f411380w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e2<T> e2Var, Continuation<? super c> continuation) {
            super(continuation);
            this.f411379v = e2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f411378u = obj;
            this.f411380w |= BeduinInputModel.MIN_TEXT_VERSION;
            return e2.g(this.f411379v, null, this);
        }
    }

    public e2(int i12, int i13, @Y61.k BufferOverflow bufferOverflow) {
        this.f411362f = i12;
        this.f411363g = i13;
        this.f411364h = bufferOverflow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.lang.Object g(kotlinx.coroutines.flow.e2<T> r8, kotlinx.coroutines.flow.InterfaceC43172j<? super T> r9, kotlin.coroutines.Continuation<?> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.e2.g(kotlinx.coroutines.flow.e2, kotlinx.coroutines.flow.j, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.internal.w
    @Y61.k
    public final InterfaceC43160i<T> Bc(@Y61.k CoroutineContext coroutineContext, int i12, @Y61.k BufferOverflow bufferOverflow) {
        return f2.d(this, coroutineContext, i12, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.d2
    @Y61.k
    public final List<T> E3() {
        synchronized (this) {
            int iK2 = (int) ((k() + this.f411368l) - this.f411366j);
            if (iK2 == 0) {
                return C42784z0.f406748b;
            }
            ArrayList arrayList = new ArrayList(iK2);
            Object[] objArr = this.f411365i;
            for (int i12 = 0; i12 < iK2; i12++) {
                arrayList.add(objArr[((int) (this.f411366j + i12)) & (objArr.length - 1)]);
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.Y1
    public final boolean K5(T t12) {
        int i12;
        boolean z12;
        Continuation<kotlin.G0>[] continuationArrJ = C43164b.f411458a;
        synchronized (this) {
            if (m(t12)) {
                continuationArrJ = j(continuationArrJ);
                z12 = true;
            } else {
                z12 = false;
            }
        }
        for (Continuation<kotlin.G0> continuation : continuationArrJ) {
            if (continuation != null) {
                int i13 = kotlin.Z.f406624c;
                continuation.resumeWith(kotlin.G0.f406611a);
            }
        }
        return z12;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43163a
    public final AbstractC43165c b() {
        return new g2();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC43163a
    public final AbstractC43165c[] c() {
        return new g2[2];
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super T> interfaceC43172j, @Y61.k Continuation<?> continuation) {
        return g(this, interfaceC43172j, continuation);
    }

    public final Object e(g2 g2Var, Continuation<? super kotlin.G0> continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        synchronized (this) {
            if (n(g2Var) < 0) {
                g2Var.f411407b = rVar;
            } else {
                int i12 = kotlin.Z.f406624c;
                rVar.resumeWith(kotlin.G0.f406611a);
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : kotlin.G0.f406611a;
    }

    @Override // kotlinx.coroutines.flow.Y1, kotlinx.coroutines.flow.InterfaceC43172j
    @Y61.l
    public final Object emit(T t12, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Continuation<kotlin.G0>[] continuationArrJ;
        a aVar;
        if (K5(t12)) {
            return kotlin.G0.f406611a;
        }
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        Continuation<kotlin.G0>[] continuationArrJ2 = C43164b.f411458a;
        synchronized (this) {
            try {
                if (m(t12)) {
                    int i12 = kotlin.Z.f406624c;
                    rVar.resumeWith(kotlin.G0.f406611a);
                    continuationArrJ = j(continuationArrJ2);
                    aVar = null;
                } else {
                    a aVar2 = new a(this, this.f411368l + this.f411369m + k(), t12, rVar);
                    i(aVar2);
                    this.f411369m++;
                    if (this.f411363g == 0) {
                        continuationArrJ2 = j(continuationArrJ2);
                    }
                    continuationArrJ = continuationArrJ2;
                    aVar = aVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (aVar != null) {
            C43302t.a(rVar, aVar);
        }
        for (Continuation<kotlin.G0> continuation2 : continuationArrJ) {
            if (continuation2 != null) {
                int i13 = kotlin.Z.f406624c;
                continuation2.resumeWith(kotlin.G0.f406611a);
            }
        }
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (objO != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objO = kotlin.G0.f406611a;
        }
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : kotlin.G0.f406611a;
    }

    public final void f() {
        if (this.f411363g != 0 || this.f411369m > 1) {
            Object[] objArr = this.f411365i;
            while (this.f411369m > 0) {
                long jK2 = k();
                int i12 = this.f411368l;
                int i13 = this.f411369m;
                if (objArr[((int) ((jK2 + (i12 + i13)) - 1)) & (objArr.length - 1)] != f2.f411393a) {
                    return;
                }
                this.f411369m = i13 - 1;
                f2.c(objArr, k() + this.f411368l + this.f411369m, null);
            }
        }
    }

    public final void h() {
        Object[] objArr;
        f2.c(this.f411365i, k(), null);
        this.f411368l--;
        long jK2 = k() + 1;
        if (this.f411366j < jK2) {
            this.f411366j = jK2;
        }
        if (this.f411367k < jK2) {
            if (this.f411455c != 0 && (objArr = this.f411454b) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        g2 g2Var = (g2) obj;
                        long j12 = g2Var.f411406a;
                        if (j12 >= 0 && j12 < jK2) {
                            g2Var.f411406a = jK2;
                        }
                    }
                }
            }
            this.f411367k = jK2;
        }
    }

    @Override // kotlinx.coroutines.flow.Y1
    public final void h4() {
        synchronized (this) {
            p(k() + this.f411368l, this.f411367k, k() + this.f411368l, k() + this.f411368l + this.f411369m);
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }

    public final void i(Object obj) {
        int i12 = this.f411368l + this.f411369m;
        Object[] objArrL = this.f411365i;
        if (objArrL == null) {
            objArrL = l(0, 2, null);
        } else if (i12 >= objArrL.length) {
            objArrL = l(i12, objArrL.length * 2, objArrL);
        }
        f2.c(objArrL, k() + i12, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Continuation<kotlin.G0>[] j(Continuation<kotlin.G0>[] continuationArr) {
        Object[] objArr;
        g2 g2Var;
        kotlinx.coroutines.r rVar;
        int length = continuationArr.length;
        if (this.f411455c != 0 && (objArr = this.f411454b) != null) {
            int length2 = objArr.length;
            int i12 = 0;
            continuationArr = continuationArr;
            while (i12 < length2) {
                Object obj = objArr[i12];
                if (obj != null && (rVar = (g2Var = (g2) obj).f411407b) != null && n(g2Var) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        continuationArr = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                    }
                    continuationArr[length] = rVar;
                    g2Var.f411407b = null;
                    length++;
                }
                i12++;
                continuationArr = continuationArr;
            }
        }
        return continuationArr;
    }

    public final long k() {
        return Math.min(this.f411367k, this.f411366j);
    }

    public final Object[] l(int i12, int i13, Object[] objArr) {
        if (i13 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i13];
        this.f411365i = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jK2 = k();
        for (int i14 = 0; i14 < i12; i14++) {
            long j12 = i14 + jK2;
            f2.c(objArr2, j12, objArr[((int) j12) & (objArr.length - 1)]);
        }
        return objArr2;
    }

    public final boolean m(T t12) {
        int i12 = this.f411455c;
        int i13 = this.f411362f;
        if (i12 == 0) {
            if (i13 != 0) {
                i(t12);
                int i14 = this.f411368l + 1;
                this.f411368l = i14;
                if (i14 > i13) {
                    h();
                }
                this.f411367k = k() + this.f411368l;
            }
            return true;
        }
        int i15 = this.f411368l;
        int i16 = this.f411363g;
        if (i15 >= i16 && this.f411367k <= this.f411366j) {
            int iOrdinal = this.f411364h.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 2) {
                return true;
            }
        }
        i(t12);
        int i17 = this.f411368l + 1;
        this.f411368l = i17;
        if (i17 > i16) {
            h();
        }
        long jK2 = k() + this.f411368l;
        long j12 = this.f411366j;
        if (((int) (jK2 - j12)) > i13) {
            p(j12 + 1, this.f411367k, k() + this.f411368l, k() + this.f411368l + this.f411369m);
        }
        return true;
    }

    public final long n(g2 g2Var) {
        long j12 = g2Var.f411406a;
        if (j12 < k() + this.f411368l) {
            return j12;
        }
        if (this.f411363g <= 0 && j12 <= k() && this.f411369m != 0) {
            return j12;
        }
        return -1L;
    }

    public final Object o(g2 g2Var) {
        Object obj;
        Continuation<kotlin.G0>[] continuationArrQ = C43164b.f411458a;
        synchronized (this) {
            try {
                long jN2 = n(g2Var);
                if (jN2 < 0) {
                    obj = f2.f411393a;
                } else {
                    long j12 = g2Var.f411406a;
                    Object obj2 = this.f411365i[((int) jN2) & (r0.length - 1)];
                    if (obj2 instanceof a) {
                        obj2 = ((a) obj2).f411372d;
                    }
                    g2Var.f411406a = jN2 + 1;
                    Object obj3 = obj2;
                    continuationArrQ = q(j12);
                    obj = obj3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Continuation<kotlin.G0> continuation : continuationArrQ) {
            if (continuation != null) {
                int i12 = kotlin.Z.f406624c;
                continuation.resumeWith(kotlin.G0.f406611a);
            }
        }
        return obj;
    }

    public final void p(long j12, long j13, long j14, long j15) {
        long jMin = Math.min(j13, j12);
        for (long jK2 = k(); jK2 < jMin; jK2++) {
            f2.c(this.f411365i, jK2, null);
        }
        this.f411366j = j12;
        this.f411367k = j13;
        this.f411368l = (int) (j14 - jMin);
        this.f411369m = (int) (j15 - j14);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.coroutines.Continuation<kotlin.G0>[] q(long r23) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.e2.q(long):kotlin.coroutines.Continuation[]");
    }
}
