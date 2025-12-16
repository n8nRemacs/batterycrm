package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C42822w;

/* compiled from: Effects.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/D2;", "Lkotlinx/coroutines/T;", "Landroidx/compose/runtime/B2;", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D2 implements kotlinx.coroutines.T, B2 {

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final CoroutineContext f37952f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f37953b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final EmptyCoroutineContext f37954c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final D2 f37955d = this;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public volatile CoroutineContext f37956e;

    /* compiled from: Effects.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/D2$a;", "", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "CancelledCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f37952f = new C22122m();
    }

    public D2(@Y61.k CoroutineContext coroutineContext, @Y61.k EmptyCoroutineContext emptyCoroutineContext) {
        this.f37953b = coroutineContext;
        this.f37954c = emptyCoroutineContext;
    }

    @Override // androidx.compose.runtime.B2
    public final void b() {
        f();
    }

    @Override // androidx.compose.runtime.B2
    public final void e() {
        f();
    }

    public final void f() {
        synchronized (this.f37955d) {
            try {
                CoroutineContext coroutineContext = this.f37956e;
                if (coroutineContext == null) {
                    this.f37956e = f37952f;
                } else {
                    kotlinx.coroutines.Q0.b(coroutineContext, new A0());
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getF400145h() {
        CoroutineContext coroutineContextPlus;
        CoroutineContext coroutineContext = this.f37956e;
        if (coroutineContext != null && coroutineContext != f37952f) {
            return coroutineContext;
        }
        synchronized (this.f37955d) {
            try {
                coroutineContextPlus = this.f37956e;
                if (coroutineContextPlus == null) {
                    CoroutineContext coroutineContext2 = this.f37953b;
                    coroutineContextPlus = coroutineContext2.plus(new kotlinx.coroutines.P0((kotlinx.coroutines.N0) coroutineContext2.get(kotlinx.coroutines.N0.f410716u2))).plus(this.f37954c);
                } else if (coroutineContextPlus == f37952f) {
                    CoroutineContext coroutineContext3 = this.f37953b;
                    kotlinx.coroutines.P0 p02 = new kotlinx.coroutines.P0((kotlinx.coroutines.N0) coroutineContext3.get(kotlinx.coroutines.N0.f410716u2));
                    p02.V(new A0());
                    coroutineContextPlus = coroutineContext3.plus(p02).plus(this.f37954c);
                }
                this.f37956e = coroutineContextPlus;
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return coroutineContextPlus;
    }

    @Override // androidx.compose.runtime.B2
    public final void c() {
    }
}
