package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: LockFreeTaskQueue.kt */
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\n\u000bR%\u0010\u0005\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00040\u00038\u0002X\u0082\u0004R\u000b\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004R\u0013\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b8\u0002X\u0082\u0004¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/H;", "", "E", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/Core;", "_next", "Lkotlinx/atomicfu/AtomicLong;", "_state", "Lkotlinx/atomicfu/AtomicArray;", "array", "a", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class H<E> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f411868e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f411869f = AtomicReferenceFieldUpdater.newUpdater(H.class, Object.class, "_next$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f411870g = AtomicLongFieldUpdater.newUpdater(H.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final a0 f411871h = new a0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f411872a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f411873b;

    /* renamed from: c, reason: collision with root package name */
    public final int f411874c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f411875d;

    /* compiled from: LockFreeTaskQueue.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/internal/H$a;", "", "<init>", "()V", "", "ADD_CLOSED", "I", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "", "CLOSED_MASK", "J", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "Lkotlinx/coroutines/internal/a0;", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/a0;", "TAIL_MASK", "TAIL_SHIFT", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/internal/H$b;", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        public final int f411876a;

        public b(int i12) {
            this.f411876a = i12;
        }
    }

    public H(int i12, boolean z12) {
        this.f411872a = i12;
        this.f411873b = z12;
        int i13 = i12 - 1;
        this.f411874c = i13;
        this.f411875d = new AtomicReferenceArray(i12);
        if (i13 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i12 & i13) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(@Y61.k java.lang.Runnable r15) {
        /*
            r14 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = kotlinx.coroutines.internal.H.f411870g
            long r2 = r6.get(r14)
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r7 = 0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            r1 = 1
            kotlinx.coroutines.internal.H$a r4 = kotlinx.coroutines.internal.H.f411868e
            if (r0 == 0) goto L1e
            r4.getClass()
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r2 & r4
            int r15 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r15 == 0) goto L1d
            r1 = 2
        L1d:
            return r1
        L1e:
            r9 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r9 = r9 & r2
            int r0 = (int) r9
            r9 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r9 = r9 & r2
            r5 = 30
            long r9 = r9 >> r5
            int r9 = (int) r9
            int r10 = r9 + 2
            int r11 = r14.f411874c
            r10 = r10 & r11
            r12 = r0 & r11
            if (r10 != r12) goto L37
            return r1
        L37:
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r14.f411875d
            boolean r12 = r14.f411873b
            r13 = 1073741823(0x3fffffff, float:1.9999999)
            if (r12 != 0) goto L56
            r12 = r9 & r11
            java.lang.Object r12 = r10.get(r12)
            if (r12 == 0) goto L56
            r2 = 1024(0x400, float:1.435E-42)
            int r3 = r14.f411872a
            if (r3 < r2) goto L55
            int r9 = r9 - r0
            r0 = r9 & r13
            int r2 = r3 >> 1
            if (r0 <= r2) goto L0
        L55:
            return r1
        L56:
            int r0 = r9 + 1
            r0 = r0 & r13
            r4.getClass()
            r12 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r12 = r12 & r2
            long r0 = (long) r0
            long r0 = r0 << r5
            long r4 = r12 | r0
            r0 = r6
            r1 = r14
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            r0 = r9 & r11
            r10.set(r0, r15)
            r0 = r14
        L74:
            long r1 = r6.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L9d
            kotlinx.coroutines.internal.H r0 = r0.c()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f411875d
            int r2 = r0.f411874c
            r2 = r2 & r9
            java.lang.Object r3 = r1.get(r2)
            boolean r4 = r3 instanceof kotlinx.coroutines.internal.H.b
            if (r4 == 0) goto L9a
            kotlinx.coroutines.internal.H$b r3 = (kotlinx.coroutines.internal.H.b) r3
            int r3 = r3.f411876a
            if (r3 != r9) goto L9a
            r1.set(r2, r15)
            goto L9b
        L9a:
            r0 = 0
        L9b:
            if (r0 != 0) goto L74
        L9d:
            r15 = 0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.H.a(java.lang.Runnable):int");
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j12;
        do {
            atomicLongFieldUpdater = f411870g;
            j12 = atomicLongFieldUpdater.get(this);
            if ((j12 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j12) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j12, 2305843009213693952L | j12));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final H<E> c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j12;
        while (true) {
            atomicLongFieldUpdater = f411870g;
            j12 = atomicLongFieldUpdater.get(this);
            if ((j12 & 1152921504606846976L) != 0) {
                break;
            }
            long j13 = j12 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j12, j13)) {
                j12 = j13;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f411869f;
            H<E> h12 = (H) atomicReferenceFieldUpdater.get(this);
            if (h12 != null) {
                return h12;
            }
            H h13 = new H(this.f411872a * 2, this.f411873b);
            int i12 = (int) (1073741823 & j12);
            int i13 = (int) ((1152921503533105152L & j12) >> 30);
            while (true) {
                int i14 = this.f411874c;
                int i15 = i12 & i14;
                if (i15 == (i14 & i13)) {
                    break;
                }
                Object bVar = this.f411875d.get(i15);
                if (bVar == null) {
                    bVar = new b(i12);
                }
                h13.f411875d.set(h13.f411874c & i12, bVar);
                i12++;
            }
            f411868e.getClass();
            atomicLongFieldUpdater.set(h13, (-1152921504606846977L) & j12);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, h13) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    @Y61.l
    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f411870g;
            long j12 = atomicLongFieldUpdater.get(this);
            if ((j12 & 1152921504606846976L) != 0) {
                return f411871h;
            }
            int i12 = (int) (j12 & 1073741823);
            int i13 = this.f411874c;
            int i14 = i12 & i13;
            if ((((int) ((1152921503533105152L & j12) >> 30)) & i13) == i14) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f411875d;
            Object obj = atomicReferenceArray.get(i14);
            boolean z12 = this.f411873b;
            if (obj == null) {
                if (z12) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                f411868e.getClass();
                long j13 = (i12 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j12, (j12 & (-1073741824)) | j13)) {
                    atomicReferenceArray.set(i14, null);
                    return obj;
                }
                if (z12) {
                    H<E> hC2 = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f411870g;
                        long j14 = atomicLongFieldUpdater2.get(hC2);
                        int i15 = (int) (j14 & 1073741823);
                        if ((j14 & 1152921504606846976L) != 0) {
                            hC2 = hC2.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(hC2, j14, (j14 & (-1073741824)) | j13)) {
                                hC2.f411875d.set(hC2.f411874c & i15, null);
                                hC2 = null;
                            } else {
                                continue;
                            }
                        }
                        if (hC2 == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
