package androidx.compose.runtime;

import androidx.compose.runtime.internal.C22083a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.C42822w;

/* compiled from: BroadcastFrameClock.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/l;", "Landroidx/compose/runtime/V0;", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22117l implements V0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.a<kotlin.G0> f38485b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f38486c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Throwable f38487d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public ArrayList f38488e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public ArrayList f38489f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C22083a f38490g;

    /* compiled from: BroadcastFrameClock.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/l$a;", "R", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.l$a */
    public static final class a<R> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Y41.l<Long, R> f38491a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final kotlinx.coroutines.r f38492b;

        public a(@Y61.k Y41.l lVar, @Y61.k kotlinx.coroutines.r rVar) {
            this.f38491a = lVar;
            this.f38492b = rVar;
        }
    }

    /* compiled from: BroadcastFrameClock.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.runtime.l$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a<R> f38494m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a<R> aVar) {
            super(1);
            this.f38494m = aVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            C22117l c22117l = C22117l.this;
            Object obj = c22117l.f38486c;
            Object obj2 = this.f38494m;
            synchronized (obj) {
                c22117l.f38488e.remove(obj2);
                if (c22117l.f38488e.isEmpty()) {
                    c22117l.f38490g.set(0);
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C22117l() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.runtime.V0
    @Y61.l
    public final <R> Object N(@Y61.k Y41.l<? super Long, ? extends R> lVar, @Y61.k Continuation<? super R> continuation) {
        Y41.a<kotlin.G0> aVar;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        a aVar2 = new a(lVar, rVar);
        synchronized (this.f38486c) {
            Throwable th2 = this.f38487d;
            if (th2 != null) {
                int i12 = kotlin.Z.f406624c;
                rVar.resumeWith(new Z.b(th2));
            } else {
                boolean zIsEmpty = this.f38488e.isEmpty();
                this.f38488e.add(aVar2);
                if (zIsEmpty) {
                    this.f38490g.set(1);
                }
                rVar.r(new b(aVar2));
                if (zIsEmpty && (aVar = this.f38485b) != null) {
                    try {
                        aVar.invoke();
                    } catch (Throwable th3) {
                        synchronized (this.f38486c) {
                            try {
                                if (this.f38487d == null) {
                                    this.f38487d = th3;
                                    ArrayList arrayList = this.f38488e;
                                    int size = arrayList.size();
                                    for (int i13 = 0; i13 < size; i13++) {
                                        kotlinx.coroutines.r rVar2 = ((a) arrayList.get(i13)).f38492b;
                                        int i14 = kotlin.Z.f406624c;
                                        rVar2.resumeWith(new Z.b(th3));
                                    }
                                    this.f38488e.clear();
                                    this.f38490g.set(0);
                                    kotlin.G0 g02 = kotlin.G0.f406611a;
                                }
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                    }
                }
            }
        }
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO;
    }

    public final void d(long j12) {
        Object bVar;
        synchronized (this.f38486c) {
            try {
                ArrayList arrayList = this.f38488e;
                this.f38488e = this.f38489f;
                this.f38489f = arrayList;
                this.f38490g.set(0);
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    a aVar = (a) arrayList.get(i12);
                    aVar.getClass();
                    try {
                        int i13 = kotlin.Z.f406624c;
                        bVar = aVar.f38491a.invoke(Long.valueOf(j12));
                    } catch (Throwable th2) {
                        int i14 = kotlin.Z.f406624c;
                        bVar = new Z.b(th2);
                    }
                    aVar.f38492b.resumeWith(bVar);
                }
                arrayList.clear();
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r12, @Y61.k Y41.p<? super R, ? super CoroutineContext.Element, ? extends R> pVar) {
        return (R) CoroutineContext.Element.DefaultImpls.fold(this, r12, pVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Y61.l
    public final <E extends CoroutineContext.Element> E get(@Y61.k CoroutineContext.Key<E> key) {
        return (E) CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Y61.k
    public final CoroutineContext minusKey(@Y61.k CoroutineContext.Key<?> key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Y61.k
    public final CoroutineContext plus(@Y61.k CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }

    public C22117l(@Y61.l Y41.a<kotlin.G0> aVar) {
        this.f38485b = aVar;
        this.f38486c = new Object();
        this.f38488e = new ArrayList();
        this.f38489f = new ArrayList();
        this.f38490g = new C22083a(0);
    }

    public /* synthetic */ C22117l(Y41.a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : aVar);
    }
}
