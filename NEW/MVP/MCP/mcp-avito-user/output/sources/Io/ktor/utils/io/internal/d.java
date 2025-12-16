package io.ktor.utils.io.internal;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.InterfaceC43268o0;
import kotlinx.coroutines.N0;

/* compiled from: CancellableReusableContinuation.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/internal/d;", "", "T", "Lkotlin/coroutines/Continuation;", "<init>", "()V", "a", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d<T> implements Continuation<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f401023b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, VoiceInfo.STATE);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f401024c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "jobCancellationHandler");

    @Y61.k
    private volatile /* synthetic */ Object state = null;

    @Y61.k
    private volatile /* synthetic */ Object jobCancellationHandler = null;

    /* compiled from: CancellableReusableContinuation.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007¨\u0006\b"}, d2 = {"Lio/ktor/utils/io/internal/d$a;", "Lkotlin/Function1;", "", "Lkotlin/S;", "name", "cause", "Lkotlin/G0;", "Lkotlinx/coroutines/CompletionHandler;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class a implements Y41.l<Throwable, G0> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final N0 f401025b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public InterfaceC43268o0 f401026c;

        public a(@Y61.k N0 n02) {
            this.f401025b = n02;
            InterfaceC43268o0 interfaceC43268o0Q = n02.Q(true, true, this);
            if (n02.isActive()) {
                this.f401026c = interfaceC43268o0Q;
            }
        }

        public final void a() {
            InterfaceC43268o0 interfaceC43268o0 = this.f401026c;
            if (interfaceC43268o0 != null) {
                this.f401026c = null;
                interfaceC43268o0.dispose();
            }
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
            Throwable th3 = th2;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d.f401023b;
            d<T> dVar = d.this;
            dVar.getClass();
            do {
                atomicReferenceFieldUpdater = d.f401024c;
                if (atomicReferenceFieldUpdater.compareAndSet(dVar, this, null)) {
                    break;
                }
            } while (atomicReferenceFieldUpdater.get(dVar) == this);
            a();
            if (th3 != null) {
                d.a(dVar, this.f401025b, th3);
            }
            return G0.f406611a;
        }
    }

    public static final void a(d dVar, N0 n02, Throwable th2) {
        while (true) {
            Object obj = dVar.state;
            if (obj instanceof Continuation) {
                Continuation continuation = (Continuation) obj;
                if (continuation.getF411960f().get(N0.f410716u2) != n02) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f401023b;
                while (!atomicReferenceFieldUpdater.compareAndSet(dVar, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(dVar) != obj) {
                        break;
                    }
                }
                int i12 = Z.f406624c;
                continuation.resumeWith(new Z.b(th2));
                return;
            }
            return;
        }
    }

    public final void b(@Y61.k Boolean bool) {
        int i12 = Z.f406624c;
        resumeWith(bool);
        a aVar = (a) f401024c.getAndSet(this, null);
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void c(@Y61.k Throwable th2) {
        int i12 = Z.f406624c;
        resumeWith(new Z.b(th2));
        a aVar = (a) f401024c.getAndSet(this, null);
        if (aVar != null) {
            aVar.a();
        }
    }

    @Y61.k
    public final Object d(@Y61.k Continuation<? super T> continuation) {
        while (true) {
            Object obj = this.state;
            if (obj != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f401023b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (obj instanceof Throwable) {
                    throw ((Throwable) obj);
                }
                return obj;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f401023b;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, continuation)) {
                if (atomicReferenceFieldUpdater2.get(this) != null) {
                    break;
                }
            }
            N0 n02 = (N0) continuation.getF411960f().get(N0.f410716u2);
            a aVar = (a) this.jobCancellationHandler;
            if ((aVar != null ? aVar.f401025b : null) != n02) {
                if (n02 == null) {
                    a aVar2 = (a) f401024c.getAndSet(this, null);
                    if (aVar2 != null) {
                        aVar2.a();
                    }
                } else {
                    a aVar3 = new a(n02);
                    while (true) {
                        Object obj2 = this.jobCancellationHandler;
                        a aVar4 = (a) obj2;
                        if (aVar4 != null && aVar4.f401025b == n02) {
                            aVar3.a();
                            break;
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f401024c;
                        while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj2, aVar3)) {
                            if (atomicReferenceFieldUpdater3.get(this) != obj2) {
                                break;
                            }
                        }
                        if (aVar4 != null) {
                            aVar4.a();
                        }
                    }
                }
            }
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
    }

    @Override // kotlin.coroutines.Continuation
    @Y61.k
    /* renamed from: getContext */
    public final CoroutineContext getF411960f() {
        CoroutineContext f411960f;
        Object obj = this.state;
        Continuation continuation = obj instanceof Continuation ? (Continuation) obj : null;
        return (continuation == null || (f411960f = continuation.getF411960f()) == null) ? EmptyCoroutineContext.INSTANCE : f411960f;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@Y61.k Object obj) {
        Object objB;
        while (true) {
            Object obj2 = this.state;
            if (obj2 == null) {
                objB = Z.b(obj);
                if (objB == null) {
                    C42729a0.b(obj);
                    objB = obj;
                }
            } else if (!(obj2 instanceof Continuation)) {
                return;
            } else {
                objB = null;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f401023b;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objB)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (obj2 instanceof Continuation) {
                ((Continuation) obj2).resumeWith(obj);
                return;
            }
            return;
        }
    }
}
