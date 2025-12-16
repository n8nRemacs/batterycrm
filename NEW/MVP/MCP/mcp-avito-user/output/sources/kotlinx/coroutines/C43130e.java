package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* compiled from: Await.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006R\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/e;", "T", "", "Lkotlinx/atomicfu/AtomicInt;", "notCompletedCount", "a", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43130e<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f411078b = AtomicIntegerFieldUpdater.newUpdater(C43130e.class, "notCompletedCount$volatile");

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43076a0<T>[] f411079a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* compiled from: Await.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001R\u001d\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u00028\u0002X\u0082\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/e$a;", "Lkotlinx/coroutines/U0;", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/e$b;", "Lkotlinx/coroutines/e;", "_disposer", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.e$a */
    public final class a extends U0 {

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f411080i = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final r f411081f;

        /* renamed from: g, reason: collision with root package name */
        public InterfaceC43268o0 f411082g;

        public a(@Y61.k r rVar) {
            this.f411081f = rVar;
        }

        @Override // kotlinx.coroutines.H0
        public final void a(@Y61.l Throwable th2) {
            r rVar = this.f411081f;
            if (th2 != null) {
                rVar.getClass();
                kotlinx.coroutines.internal.a0 a0VarE = rVar.E(null, new E(th2, false, 2, null));
                if (a0VarE != null) {
                    rVar.I(a0VarE);
                    b bVar = (b) f411080i.get(this);
                    if (bVar != null) {
                        bVar.b();
                        return;
                    }
                    return;
                }
                return;
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C43130e.f411078b;
            C43130e<T> c43130e = C43130e.this;
            if (atomicIntegerFieldUpdater.decrementAndGet(c43130e) == 0) {
                InterfaceC43076a0<T>[] interfaceC43076a0Arr = c43130e.f411079a;
                ArrayList arrayList = new ArrayList(interfaceC43076a0Arr.length);
                for (InterfaceC43076a0<T> interfaceC43076a0 : interfaceC43076a0Arr) {
                    arrayList.add(interfaceC43076a0.i());
                }
                int i12 = kotlin.Z.f406624c;
                rVar.resumeWith(arrayList);
            }
        }
    }

    /* compiled from: Await.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/e$b;", "Lkotlinx/coroutines/p;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.e$b */
    public final class b implements InterfaceC43269p {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C43130e<T>.a[] f411084b;

        public b(@Y61.k a[] aVarArr) {
            this.f411084b = aVarArr;
        }

        @Override // kotlinx.coroutines.InterfaceC43269p
        public final void a(@Y61.l Throwable th2) {
            b();
        }

        public final void b() {
            for (C43130e<T>.a aVar : this.f411084b) {
                InterfaceC43268o0 interfaceC43268o0 = aVar.f411082g;
                if (interfaceC43268o0 == null) {
                    interfaceC43268o0 = null;
                }
                interfaceC43268o0.dispose();
            }
        }

        @Y61.k
        public final String toString() {
            return "DisposeHandlersOnCancel[" + this.f411084b + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C43130e(@Y61.k InterfaceC43076a0<? extends T>[] interfaceC43076a0Arr) {
        this.f411079a = interfaceC43076a0Arr;
        this.notCompletedCount$volatile = interfaceC43076a0Arr.length;
    }

    @Y61.l
    public final Object a(@Y61.k Continuation<? super List<? extends T>> continuation) {
        r rVar = new r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        InterfaceC43076a0<T>[] interfaceC43076a0Arr = this.f411079a;
        int length = interfaceC43076a0Arr.length;
        a[] aVarArr = new a[length];
        for (int i12 = 0; i12 < length; i12++) {
            InterfaceC43076a0<T> interfaceC43076a0 = interfaceC43076a0Arr[i12];
            interfaceC43076a0.start();
            a aVar = new a(rVar);
            aVar.f411082g = Q0.g(interfaceC43076a0, aVar, 3);
            kotlin.G0 g02 = kotlin.G0.f406611a;
            aVarArr[i12] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i13 = 0; i13 < length; i13++) {
            a aVar2 = aVarArr[i13];
            aVar2.getClass();
            a.f411080i.set(aVar2, bVar);
        }
        if (rVar.v()) {
            bVar.b();
        } else {
            rVar.s(bVar);
        }
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO;
    }
}
