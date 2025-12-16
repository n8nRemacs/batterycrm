package kotlinx.coroutines.rx3;

import androidx.compose.runtime.C22026a;
import io.reactivex.rxjava3.core.H;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: RxScheduler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0004R\u000b\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/rx3/c;", "Lio/reactivex/rxjava3/core/H;", "Lkotlinx/atomicfu/AtomicLong;", "workerCounter", "a", "kotlinx-coroutines-rx3"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.rx3.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43280c extends io.reactivex.rxjava3.core.H {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f412079d = AtomicLongFieldUpdater.newUpdater(C43280c.class, "workerCounter$volatile");
    private volatile /* synthetic */ long workerCounter$volatile;

    /* compiled from: RxScheduler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/rx3/c$a;", "Lio/reactivex/rxjava3/core/H$c;", "kotlinx-coroutines-rx3"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.rx3.c$a */
    public static final class a extends H.c {

        /* renamed from: b, reason: collision with root package name */
        public final long f412080b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final kotlinx.coroutines.C f412081c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final C43238h f412082d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final C43108m f412083e;

        /* compiled from: RxScheduler.kt */
        @s0
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00060\u0005j\u0002`\u00062\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lkotlin/G0;", "", "task", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "invoke", "(LY41/l;)Ljava/lang/Runnable;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: kotlinx.coroutines.rx3.c$a$a, reason: collision with other inner class name */
        public static final class C11736a extends kotlin.jvm.internal.N implements Y41.l<Y41.l<? super Continuation<? super G0>, ? extends Object>, Runnable> {
            public C11736a() {
                super(1);
            }

            @Override // Y41.l
            public final Runnable invoke(Y41.l<? super Continuation<? super G0>, ? extends Object> lVar) {
                return new RunnableC43279b(a.this, lVar);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j12) {
            this.f412080b = j12;
            kotlinx.coroutines.C cA2 = t1.a(null);
            this.f412081c = cA2;
            C43238h c43238hA = kotlinx.coroutines.U.a(CoroutineContext.Element.DefaultImpls.plus((V0) cA2, null));
            this.f412082d = c43238hA;
            this.f412083e = kotlinx.coroutines.channels.A.a(Integer.MAX_VALUE, null, null, 6);
            C43259k.d(c43238hA, null, null, new C43278a(this, null), 3);
        }

        @Override // io.reactivex.rxjava3.core.H.c
        @Y61.k
        public final io.reactivex.rxjava3.disposables.d c(@Y61.k Runnable runnable, long j12, @Y61.k TimeUnit timeUnit) {
            return O.a(this.f412082d, runnable, timeUnit.toMillis(j12), new C11736a());
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public final void dispose() {
            this.f412083e.h(null);
            this.f412081c.c(null);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        /* renamed from: i */
        public final boolean getF318621e() {
            return !kotlinx.coroutines.U.e(this.f412082d);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("null (worker ");
            sb2.append(this.f412080b);
            sb2.append(", ");
            return C22026a.c(sb2, getF318621e() ? "disposed" : "active", ')');
        }
    }

    /* compiled from: RxScheduler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00060\u0005j\u0002`\u00062\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lkotlin/G0;", "", "task", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "invoke", "(LY41/l;)Ljava/lang/Runnable;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlinx.coroutines.rx3.c$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Y41.l<? super Continuation<? super G0>, ? extends Object>, Runnable> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Runnable invoke(Y41.l<? super Continuation<? super G0>, ? extends Object> lVar) {
            return new RunnableC43282e(C43280c.this, lVar);
        }
    }

    @Override // io.reactivex.rxjava3.core.H
    @Y61.k
    public final H.c b() {
        return new a(f412079d.getAndIncrement(this));
    }

    @Override // io.reactivex.rxjava3.core.H
    @Y61.k
    public final io.reactivex.rxjava3.disposables.d e(@Y61.k Runnable runnable, long j12, @Y61.k TimeUnit timeUnit) {
        return O.a(null, runnable, timeUnit.toMillis(j12), new b());
    }

    @Y61.k
    public final String toString() {
        throw null;
    }
}
