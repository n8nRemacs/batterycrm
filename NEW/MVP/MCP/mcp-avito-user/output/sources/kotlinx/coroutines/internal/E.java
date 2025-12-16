package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43132e1;
import kotlinx.coroutines.F0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.U0;

/* compiled from: LockFreeLinkedList.kt */
@s0
@I0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004R\u0011\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0002X\u0082\u0004R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0082\u0004¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/internal/E;", "", "<init>", "()V", "Lkotlinx/atomicfu/AtomicRef;", "_next", "_prev", "Lkotlinx/coroutines/internal/U;", "_removedRef", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public class E {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f411862b = AtomicReferenceFieldUpdater.newUpdater(E.class, Object.class, "_next$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f411863c = AtomicReferenceFieldUpdater.newUpdater(E.class, Object.class, "_prev$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f411864d = AtomicReferenceFieldUpdater.newUpdater(E.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/internal/E$a;", "Lkotlinx/coroutines/internal/b;", "Lkotlinx/coroutines/internal/E;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.X
    public static abstract class a extends AbstractC43232b<E> {

        /* renamed from: b, reason: collision with root package name */
        @X41.f
        @Y61.k
        public final U0 f411865b;

        /* renamed from: c, reason: collision with root package name */
        @X41.f
        @Y61.l
        public C43132e1 f411866c;

        public a(@Y61.k U0 u02) {
            this.f411865b = u02;
        }

        @Override // kotlinx.coroutines.internal.AbstractC43232b
        public final void b(E e12, Object obj) {
            E e13 = e12;
            boolean z12 = obj == null;
            U0 u02 = this.f411865b;
            F0 f02 = z12 ? u02 : this.f411866c;
            if (f02 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E.f411862b;
                while (!atomicReferenceFieldUpdater.compareAndSet(e13, this, f02)) {
                    if (atomicReferenceFieldUpdater.get(e13) != this) {
                        return;
                    }
                }
                if (z12) {
                    u02.e(this.f411866c);
                }
            }
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends kotlin.jvm.internal.f0 {
        @Override // kotlin.jvm.internal.f0, kotlin.reflect.o
        @Y61.l
        public final Object get() {
            return this.receiver.getClass().getSimpleName();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        r6 = ((kotlinx.coroutines.internal.U) r6).f411884a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.internal.E d() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.E.f411863c
            java.lang.Object r1 = r0.get(r9)
            kotlinx.coroutines.internal.E r1 = (kotlinx.coroutines.internal.E) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.E.f411862b
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.i()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
            return r3
        L2e:
            boolean r7 = r6 instanceof kotlinx.coroutines.internal.S
            if (r7 == 0) goto L38
            kotlinx.coroutines.internal.S r6 = (kotlinx.coroutines.internal.S) r6
            r6.a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof kotlinx.coroutines.internal.U
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            kotlinx.coroutines.internal.U r6 = (kotlinx.coroutines.internal.U) r6
            kotlinx.coroutines.internal.E r6 = r6.f411884a
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            kotlinx.coroutines.internal.E r3 = (kotlinx.coroutines.internal.E) r3
            goto Lb
        L58:
            r4 = r6
            kotlinx.coroutines.internal.E r4 = (kotlinx.coroutines.internal.E) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.E.d():kotlinx.coroutines.internal.E");
    }

    public void dispose() {
        j();
    }

    public final void e(E e12) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f411863c;
            E e13 = (E) atomicReferenceFieldUpdater.get(e12);
            if (f() != e12) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(e12, e13, this)) {
                if (atomicReferenceFieldUpdater.get(e12) != e13) {
                    break;
                }
            }
            if (i()) {
                e12.d();
                return;
            }
            return;
        }
    }

    @Y61.k
    public final Object f() {
        while (true) {
            Object obj = f411862b.get(this);
            if (!(obj instanceof S)) {
                return obj;
            }
            ((S) obj).a(this);
        }
    }

    @Y61.k
    public final E g() {
        E e12;
        Object objF = f();
        U u12 = objF instanceof U ? (U) objF : null;
        return (u12 == null || (e12 = u12.f411884a) == null) ? (E) objF : e12;
    }

    @Y61.k
    public final E h() {
        E eD2 = d();
        if (eD2 == null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f411863c;
            Object obj = atomicReferenceFieldUpdater.get(this);
            while (true) {
                eD2 = (E) obj;
                if (!eD2.i()) {
                    break;
                }
                obj = atomicReferenceFieldUpdater.get(eD2);
            }
        }
        return eD2;
    }

    public boolean i() {
        return f() instanceof U;
    }

    public final void j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            Object objF = f();
            if (objF instanceof U) {
                E e12 = ((U) objF).f411884a;
                return;
            }
            if (objF == this) {
                return;
            }
            E e13 = (E) objF;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f411864d;
            U u12 = (U) atomicReferenceFieldUpdater2.get(e13);
            if (u12 == null) {
                u12 = new U(e13);
                atomicReferenceFieldUpdater2.set(e13, u12);
            }
            do {
                atomicReferenceFieldUpdater = f411862b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, objF, u12)) {
                    e13.d();
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == objF);
        }
    }

    @Y61.k
    public String toString() {
        return new b(this, kotlinx.coroutines.X.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + kotlinx.coroutines.X.a(this);
    }
}
