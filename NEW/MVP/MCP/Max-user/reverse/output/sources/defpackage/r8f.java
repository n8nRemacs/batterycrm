package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class r8f implements m1f {
    public static final int s0 = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final Object t0 = new Object();
    public final int X;
    public AtomicReferenceArray Y;
    public final AtomicLong Z;
    public final AtomicLong a;
    public final int b;
    public long c;
    public final int d;
    public AtomicReferenceArray o;

    public r8f(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.a = atomicLong;
        this.Z = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iNumberOfLeadingZeros + 1);
        this.o = atomicReferenceArray;
        this.d = i2;
        this.b = Math.min(iNumberOfLeadingZeros / 4, s0);
        this.Y = atomicReferenceArray;
        this.X = i2;
        this.c = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    @Override // defpackage.o1f
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // defpackage.o1f
    public final boolean isEmpty() {
        return this.a.get() == this.Z.get();
    }

    @Override // defpackage.o1f
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.o;
        AtomicLong atomicLong = this.a;
        long j = atomicLong.get();
        int i = this.d;
        int i2 = ((int) j) & i;
        if (j < this.c) {
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j2 = this.b + j;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            this.c = j2 - 1;
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j + 1);
            return true;
        }
        long j3 = j + 1;
        if (atomicReferenceArray.get(((int) j3) & i) == null) {
            atomicReferenceArray.lazySet(i2, obj);
            atomicLong.lazySet(j3);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.o = atomicReferenceArray2;
        this.c = (j + i) - 1;
        atomicReferenceArray2.lazySet(i2, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i2, t0);
        atomicLong.lazySet(j3);
        return true;
    }

    @Override // defpackage.o1f
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.Y;
        AtomicLong atomicLong = this.Z;
        long j = atomicLong.get();
        int i = this.X;
        int i2 = ((int) j) & i;
        Object obj = atomicReferenceArray.get(i2);
        boolean z = obj == t0;
        if (obj != null && !z) {
            atomicReferenceArray.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
            return obj;
        }
        if (!z) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, null);
        this.Y = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i2);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            atomicLong.lazySet(j + 1);
        }
        return obj2;
    }
}
