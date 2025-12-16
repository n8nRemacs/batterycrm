package kotlinx.coroutines.channels;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.B;

/* compiled from: BroadcastChannel.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/e;", "E", "Lkotlinx/coroutines/channels/m;", "Lkotlinx/coroutines/channels/d;", "a", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.channels.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43092e<E> extends C43108m<E> implements InterfaceC43090d<E> {

    /* renamed from: n, reason: collision with root package name */
    public final int f410874n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final ReentrantLock f410875o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public Object f410876p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public Object f410877q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final HashMap<kotlinx.coroutines.selects.r<?>, Object> f410878r;

    /* compiled from: BroadcastChannel.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/channels/e$a;", "Lkotlinx/coroutines/channels/m;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.channels.e$a */
    public final class a extends C43108m<E> {
        @Override // kotlinx.coroutines.channels.C43108m
        public final boolean m(CancellationException cancellationException) {
            throw null;
        }
    }

    /* compiled from: BroadcastChannel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/channels/e$b;", "Lkotlinx/coroutines/channels/B0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.channels.e$b */
    public final class b extends B0<E> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.channels.C43108m
        public final boolean m(CancellationException cancellationException) {
            C43092e c43092e = null;
            ReentrantLock reentrantLock = c43092e.f410875o;
            reentrantLock.lock();
            try {
                Iterable iterable = (Iterable) c43092e.f410876p;
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (((C43108m) obj) != this) {
                        arrayList.add(obj);
                    }
                }
                c43092e.f410876p = arrayList;
                kotlin.G0 g02 = kotlin.G0.f406611a;
                reentrantLock.unlock();
                return super.m(cancellationException);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    /* compiled from: BroadcastChannel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastChannelImpl", f = "BroadcastChannel.kt", i = {0, 0}, l = {227}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.channels.e$c */
    public static final class c extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public C43092e f410879q;

        /* renamed from: r, reason: collision with root package name */
        public Object f410880r;

        /* renamed from: s, reason: collision with root package name */
        public Iterator f410881s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f410882t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C43092e<E> f410883u;

        /* renamed from: v, reason: collision with root package name */
        public int f410884v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C43092e<E> c43092e, Continuation<? super c> continuation) {
            super(continuation);
            this.f410883u = c43092e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f410882t = obj;
            this.f410884v |= BeduinInputModel.MIN_TEXT_VERSION;
            return this.f410883u.send(null, this);
        }
    }

    public C43092e() {
        super(0, null);
        this.f410874n = -1;
        this.f410875o = new ReentrantLock();
        this.f410876p = C42784z0.f406748b;
        this.f410877q = C43096g.f410897a;
        this.f410878r = new HashMap<>();
    }

    @Override // kotlinx.coroutines.channels.C43108m
    public final void S(@Y61.k kotlinx.coroutines.selects.r<?> rVar, @Y61.l Object obj) {
        ReentrantLock reentrantLock = this.f410875o;
        reentrantLock.lock();
        try {
            Object objRemove = this.f410878r.remove(rVar);
            if (objRemove != null) {
                rVar.d(objRemove);
                return;
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
            reentrantLock.unlock();
            C43259k.d(kotlinx.coroutines.U.a(rVar.getF412215b()), null, CoroutineStart.f410683e, new C43094f(this, obj, rVar, null), 1);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.C43108m, kotlinx.coroutines.channels.M0
    public final boolean h(@Y61.l Throwable th2) {
        ReentrantLock reentrantLock = this.f410875o;
        reentrantLock.lock();
        try {
            Iterator it = ((Iterable) this.f410876p).iterator();
            while (it.hasNext()) {
                ((C43108m) it.next()).h(th2);
            }
            Iterable iterable = (Iterable) this.f410876p;
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (((C43108m) obj).A()) {
                    arrayList.add(obj);
                }
            }
            this.f410876p = arrayList;
            boolean zN2 = n(th2, false);
            reentrantLock.unlock();
            return zN2;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    @Override // kotlinx.coroutines.channels.C43108m, kotlinx.coroutines.channels.M0
    public final boolean l() {
        ReentrantLock reentrantLock = this.f410875o;
        reentrantLock.lock();
        try {
            return super.l();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.C43108m
    public final boolean m(@Y61.l CancellationException cancellationException) {
        ReentrantLock reentrantLock = this.f410875o;
        reentrantLock.lock();
        try {
            Iterator it = ((Iterable) this.f410876p).iterator();
            while (it.hasNext()) {
                ((C43108m) it.next()).m(cancellationException);
            }
            this.f410877q = C43096g.f410897a;
            boolean zM2 = super.m(cancellationException);
            reentrantLock.unlock();
            return zM2;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0079 -> B:30:0x007c). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.channels.C43108m, kotlinx.coroutines.channels.M0
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object send(E r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.C43092e.c
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.channels.e$c r0 = (kotlinx.coroutines.channels.C43092e.c) r0
            int r1 = r0.f410884v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f410884v = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.e$c r0 = new kotlinx.coroutines.channels.e$c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f410882t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f410884v
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.util.Iterator r7 = r0.f410881s
            java.lang.Object r2 = r0.f410880r
            kotlinx.coroutines.channels.e r4 = r0.f410879q
            kotlin.C42729a0.b(r8)
            goto L7c
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.C42729a0.b(r8)
            java.util.concurrent.locks.ReentrantLock r8 = r6.f410875o
            r8.lock()
            boolean r2 = r6.l()     // Catch: java.lang.Throwable -> L4d
            if (r2 != 0) goto L95
            int r2 = r6.f410874n     // Catch: java.lang.Throwable -> L4d
            r4 = -1
            if (r2 != r4) goto L4f
            r6.f410877q = r7     // Catch: java.lang.Throwable -> L4d
            goto L4f
        L4d:
            r7 = move-exception
            goto L9a
        L4f:
            java.lang.Object r2 = r6.f410876p     // Catch: java.lang.Throwable -> L4d
            r8.unlock()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r8 = r2.iterator()
            r4 = r6
            r5 = r8
            r8 = r7
            r7 = r5
        L5e:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L92
            java.lang.Object r2 = r7.next()
            kotlinx.coroutines.channels.m r2 = (kotlinx.coroutines.channels.C43108m) r2
            r0.f410879q = r4
            r0.f410880r = r8
            r0.f410881s = r7
            r0.f410884v = r3
            java.lang.Object r2 = r2.U(r8, r0)
            if (r2 != r1) goto L79
            return r1
        L79:
            r5 = r2
            r2 = r8
            r8 = r5
        L7c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L90
            boolean r8 = r4.l()
            if (r8 != 0) goto L8b
            goto L90
        L8b:
            java.lang.Throwable r7 = r4.y()
            throw r7
        L90:
            r8 = r2
            goto L5e
        L92:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L95:
            java.lang.Throwable r7 = r6.y()     // Catch: java.lang.Throwable -> L4d
            throw r7     // Catch: java.lang.Throwable -> L4d
        L9a:
            r8.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.C43092e.send(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.C43108m
    @Y61.k
    public final String toString() {
        String strO;
        StringBuilder sb2 = new StringBuilder();
        if (this.f410877q != C43096g.f410897a) {
            strO = androidx.appcompat.app.r.o(this.f410877q, "; ", new StringBuilder("CONFLATED_ELEMENT="));
        } else {
            strO = "";
        }
        sb2.append(strO);
        sb2.append("BROADCAST=<");
        sb2.append(super.toString());
        sb2.append(">; SUBSCRIBERS=");
        sb2.append(C42745f0.O((Iterable) this.f410876p, ";", "<", ">", null, 56));
        return sb2.toString();
    }

    @Override // kotlinx.coroutines.channels.C43108m, kotlinx.coroutines.channels.M0
    @Y61.k
    public final Object w(E e12) {
        ReentrantLock reentrantLock = this.f410875o;
        reentrantLock.lock();
        try {
            if (l()) {
                return super.w(e12);
            }
            Iterable iterable = (Iterable) this.f410876p;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (((C43108m) it.next()).V()) {
                        B.f410772b.getClass();
                        return B.f410773c;
                    }
                }
            }
            if (this.f410874n == -1) {
                this.f410877q = e12;
            }
            Iterator it2 = ((Iterable) this.f410876p).iterator();
            while (it2.hasNext()) {
                ((C43108m) it2.next()).w(e12);
            }
            B.b bVar = B.f410772b;
            kotlin.G0 g02 = kotlin.G0.f406611a;
            bVar.getClass();
            return g02;
        } finally {
            reentrantLock.unlock();
        }
    }
}
