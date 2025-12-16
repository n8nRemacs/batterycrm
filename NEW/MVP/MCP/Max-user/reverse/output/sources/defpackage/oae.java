package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class oae {
    public static final w9e a = new w9e(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(w9e w9eVar) {
        if (w9eVar.f != null || w9eVar.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (w9eVar.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        w9e w9eVar2 = (w9e) atomicReference.get();
        if (w9eVar2 == a) {
            return;
        }
        int i = w9eVar2 != null ? w9eVar2.c : 0;
        if (i >= 65536) {
            return;
        }
        w9eVar.f = w9eVar2;
        w9eVar.b = 0;
        w9eVar.c = i + 8192;
        while (!atomicReference.compareAndSet(w9eVar2, w9eVar)) {
            if (atomicReference.get() != w9eVar2) {
                w9eVar.f = null;
                return;
            }
        }
    }

    public static final w9e b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        w9e w9eVar = a;
        w9e w9eVar2 = (w9e) atomicReference.getAndSet(w9eVar);
        if (w9eVar2 == w9eVar) {
            return new w9e();
        }
        if (w9eVar2 == null) {
            atomicReference.set(null);
            return new w9e();
        }
        atomicReference.set(w9eVar2.f);
        w9eVar2.f = null;
        w9eVar2.c = 0;
        return w9eVar2;
    }
}
