package defpackage;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class fof implements cof {
    public static final fof a;
    public static final /* synthetic */ fof[] b;

    static {
        fof fofVar = new fof("CANCELLED", 0);
        a = fofVar;
        b = new fof[]{fofVar};
    }

    public static void a(AtomicReference atomicReference) {
        cof cofVar;
        cof cofVar2 = (cof) atomicReference.get();
        fof fofVar = a;
        if (cofVar2 == fofVar || (cofVar = (cof) atomicReference.getAndSet(fofVar)) == fofVar || cofVar == null) {
            return;
        }
        cofVar.cancel();
    }

    public static void c(AtomicReference atomicReference, AtomicLong atomicLong, long j) {
        cof cofVar = (cof) atomicReference.get();
        if (cofVar != null) {
            cofVar.g(j);
            return;
        }
        if (e(j)) {
            nui.a(atomicLong, j);
            cof cofVar2 = (cof) atomicReference.get();
            if (cofVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    cofVar2.g(andSet);
                }
            }
        }
    }

    public static boolean d(AtomicReference atomicReference, cof cofVar) {
        Objects.requireNonNull(cofVar, "s is null");
        while (!atomicReference.compareAndSet(null, cofVar)) {
            if (atomicReference.get() != null) {
                cofVar.cancel();
                if (atomicReference.get() == a) {
                    return false;
                }
                t8j.a(new ProtocolViolationException("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean e(long j) {
        if (j > 0) {
            return true;
        }
        t8j.a(new IllegalArgumentException(vb9.e(j, "n > 0 required but it was ")));
        return false;
    }

    public static boolean h(cof cofVar, cof cofVar2) {
        if (cofVar2 == null) {
            t8j.a(new NullPointerException("next is null"));
            return false;
        }
        if (cofVar == null) {
            return true;
        }
        cofVar2.cancel();
        t8j.a(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static fof valueOf(String str) {
        return (fof) Enum.valueOf(fof.class, str);
    }

    public static fof[] values() {
        return (fof[]) b.clone();
    }

    @Override // defpackage.cof
    public final void cancel() {
    }

    @Override // defpackage.cof
    public final void g(long j) {
    }
}
