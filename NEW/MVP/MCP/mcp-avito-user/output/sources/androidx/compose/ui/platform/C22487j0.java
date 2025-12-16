package androidx.compose.ui.platform;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* compiled from: AndroidUiFrameClock.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/j0;", "Landroidx/compose/runtime/V0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22487j0 implements androidx.compose.runtime.V0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Choreographer f41471b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final C22475g0 f41472c;

    /* compiled from: AndroidUiFrameClock.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.j0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C22475g0 f41473l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Choreographer.FrameCallback f41474m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C22475g0 c22475g0, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f41473l = c22475g0;
            this.f41474m = frameCallback;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            C22475g0 c22475g0 = this.f41473l;
            Choreographer.FrameCallback frameCallback = this.f41474m;
            synchronized (c22475g0.f41453e) {
                c22475g0.f41455g.remove(frameCallback);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidUiFrameClock.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.j0$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Choreographer.FrameCallback f41476m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f41476m = frameCallback;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Throwable th2) {
            C22487j0.this.f41471b.removeFrameCallback(this.f41476m);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidUiFrameClock.android.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "frameTimeNanos", "Lkotlin/G0;", "doFrame", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.j0$c */
    public static final class c implements Choreographer.FrameCallback {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.r f41477b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Long, R> f41478c;

        public c(kotlinx.coroutines.r rVar, C22487j0 c22487j0, Y41.l lVar) {
            this.f41477b = rVar;
            this.f41478c = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j12) {
            Object bVar;
            Y41.l<Long, R> lVar = this.f41478c;
            try {
                int i12 = kotlin.Z.f406624c;
                bVar = lVar.invoke(Long.valueOf(j12));
            } catch (Throwable th2) {
                int i13 = kotlin.Z.f406624c;
                bVar = new Z.b(th2);
            }
            this.f41477b.resumeWith(bVar);
        }
    }

    public C22487j0(@Y61.k Choreographer choreographer, @Y61.l C22475g0 c22475g0) {
        this.f41471b = choreographer;
        this.f41472c = c22475g0;
    }

    @Override // androidx.compose.runtime.V0
    @Y61.l
    public final <R> Object N(@Y61.k Y41.l<? super Long, ? extends R> lVar, @Y61.k Continuation<? super R> continuation) {
        C22475g0 c22475g0 = this.f41472c;
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(1, IntrinsicsKt.intercepted(continuation));
        rVar.p();
        c cVar = new c(rVar, this, lVar);
        if (kotlin.jvm.internal.L.f(c22475g0.f41451c, this.f41471b)) {
            synchronized (c22475g0.f41453e) {
                try {
                    c22475g0.f41455g.add(cVar);
                    if (!c22475g0.f41458j) {
                        c22475g0.f41458j = true;
                        c22475g0.f41451c.postFrameCallback(c22475g0.f41459k);
                    }
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            rVar.r(new a(c22475g0, cVar));
        } else {
            this.f41471b.postFrameCallback(cVar);
            rVar.r(new b(cVar));
        }
        Object objO = rVar.o();
        if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objO;
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
}
