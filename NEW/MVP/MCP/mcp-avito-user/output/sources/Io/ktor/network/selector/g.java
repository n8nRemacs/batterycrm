package io.ktor.network.selector;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicLong;
import kotlinx.atomicfu.AtomicRef;

/* compiled from: LockFreeMPSCQueue.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/network/selector/g;", "", "E", "b", "c", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
final class g<E> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final b f400175f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final a f400176g = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f400177a;

    /* renamed from: b, reason: collision with root package name */
    public final int f400178b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AtomicRef<g<E>> f400179c = AtomicFU.atomic((Object) null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AtomicLong f400180d = AtomicFU.atomic(0);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AtomicReferenceArray<Object> f400181e;

    /* compiled from: LockFreeMPSCQueue.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"io/ktor/network/selector/g$a", "", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Y61.k
        public final String toString() {
            return "REMOVE_FROZEN";
        }
    }

    /* compiled from: LockFreeMPSCQueue.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006¨\u0006\u0018"}, d2 = {"Lio/ktor/network/selector/g$b;", "", "<init>", "()V", "", "ADD_CLOSED", "I", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "", "CLOSED_MASK", "J", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "REMOVE_FROZEN", "Ljava/lang/Object;", "TAIL_MASK", "TAIL_SHIFT", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public static final int a(b bVar, long j12) {
            bVar.getClass();
            return (j12 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public static final long b(b bVar, long j12, int i12) {
            bVar.getClass();
            return (j12 & (-1073741824)) | i12;
        }

        public static final long c(b bVar, long j12, int i12) {
            bVar.getClass();
            return (j12 & (-1152921503533105153L)) | (i12 << 30);
        }

        public static final long d(b bVar, long j12) {
            bVar.getClass();
            return j12 & (-1152921504606846977L);
        }

        public b() {
        }
    }

    /* compiled from: LockFreeMPSCQueue.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/network/selector/g$c;", "", "ktor-network"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        public final int f400182a;

        public c(int i12) {
            this.f400182a = i12;
        }
    }

    public g(int i12) {
        this.f400177a = i12;
        int i13 = i12 - 1;
        this.f400178b = i13;
        this.f400181e = new AtomicReferenceArray<>(i12);
        if (i13 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i12 & i13) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(@Y61.k i iVar) {
        long value;
        b bVar;
        int i12;
        int i13;
        AtomicLong atomicLong = this.f400180d;
        do {
            value = atomicLong.getValue();
            long j12 = 3458764513820540928L & value;
            bVar = f400175f;
            if (j12 != 0) {
                return b.a(bVar, value);
            }
            int i14 = (int) (1073741823 & value);
            i12 = (int) ((1152921503533105152L & value) >> 30);
            i13 = this.f400178b;
            if (((i12 + 2) & i13) == (i14 & i13)) {
                return 1;
            }
        } while (!this.f400180d.compareAndSet(value, b.c(bVar, value, (i12 + 1) & 1073741823)));
        this.f400181e.set(i12 & i13, iVar);
        g<E> gVarG = this;
        while ((gVarG.f400180d.getValue() & 1152921504606846976L) != 0) {
            gVarG = gVarG.g();
            AtomicReferenceArray<Object> atomicReferenceArray = gVarG.f400181e;
            int i15 = gVarG.f400178b & i12;
            Object obj = atomicReferenceArray.get(i15);
            if ((obj instanceof c) && ((c) obj).f400182a == i12) {
                atomicReferenceArray.set(i15, iVar);
            } else {
                gVarG = null;
            }
            if (gVarG == null) {
                return 0;
            }
        }
        return 0;
    }

    public final g<E> b(long j12) {
        g<E> gVar = new g<>(this.f400177a * 2);
        int i12 = (int) (1073741823 & j12);
        int i13 = (int) ((1152921503533105152L & j12) >> 30);
        while (true) {
            int i14 = this.f400178b;
            int i15 = i12 & i14;
            if (i15 == (i14 & i13)) {
                gVar.f400180d.setValue(b.d(f400175f, j12));
                return gVar;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = gVar.f400181e;
            int i16 = gVar.f400178b & i12;
            Object cVar = this.f400181e.get(i15);
            if (cVar == null) {
                cVar = new c(i12);
            }
            atomicReferenceArray.set(i16, cVar);
            i12++;
        }
    }

    public final g<E> c(long j12) {
        AtomicRef<g<E>> atomicRef = this.f400179c;
        while (true) {
            g<E> gVar = (g) atomicRef.getValue();
            if (gVar != null) {
                return gVar;
            }
            this.f400179c.compareAndSet((Object) null, b(j12));
        }
    }

    public final boolean d() {
        long value;
        AtomicLong atomicLong = this.f400180d;
        do {
            value = atomicLong.getValue();
            if ((value & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & value) != 0) {
                return false;
            }
        } while (!atomicLong.compareAndSet(value, 2305843009213693952L | value));
        return true;
    }

    public final boolean e() {
        long value = this.f400180d.getValue();
        return ((int) (1073741823 & value)) == ((int) ((value & 1152921503533105152L) >> 30));
    }

    public final long f() {
        long value;
        long j12;
        AtomicLong atomicLong = this.f400180d;
        do {
            value = atomicLong.getValue();
            if ((value & 1152921504606846976L) != 0) {
                return value;
            }
            j12 = 1152921504606846976L | value;
        } while (!atomicLong.compareAndSet(value, j12));
        return j12;
    }

    @Y61.k
    public final g<E> g() {
        return c(f());
    }

    @Y61.l
    public final Object h() {
        AtomicReferenceArray<Object> atomicReferenceArray;
        Object obj;
        long value = this.f400180d.getValue();
        if ((1152921504606846976L & value) != 0) {
            return f400176g;
        }
        int i12 = (int) (1073741823 & value);
        int i13 = this.f400178b;
        int i14 = ((int) ((1152921503533105152L & value) >> 30)) & i13;
        int i15 = i13 & i12;
        if (i14 == i15 || (obj = (atomicReferenceArray = this.f400181e).get(i15)) == null || (obj instanceof c)) {
            return null;
        }
        int i16 = (i12 + 1) & 1073741823;
        if (this.f400180d.compareAndSet(value, b.b(f400175f, value, i16))) {
            atomicReferenceArray.set(i15, null);
            return obj;
        }
        g<E> gVarI = this;
        do {
            gVarI = gVarI.i(i12, i16);
        } while (gVarI != null);
        return obj;
    }

    public final g<E> i(int i12, int i13) {
        long value;
        int i14;
        AtomicLong atomicLong = this.f400180d;
        do {
            value = atomicLong.getValue();
            i14 = (int) (1073741823 & value);
            if (i14 != i12) {
                throw new IllegalStateException("This queue can have only one consumer");
            }
            if ((1152921504606846976L & value) != 0) {
                return g();
            }
        } while (!this.f400180d.compareAndSet(value, b.b(f400175f, value, i13)));
        this.f400181e.set(this.f400178b & i14, null);
        return null;
    }
}
