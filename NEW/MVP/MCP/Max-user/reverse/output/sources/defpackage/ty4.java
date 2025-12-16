package defpackage;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ty4 implements py4 {
    public static final ty4 a;
    public static final /* synthetic */ ty4[] b;

    static {
        ty4 ty4Var = new ty4("DISPOSED", 0);
        a = ty4Var;
        b = new ty4[]{ty4Var};
    }

    public static boolean a(AtomicReference atomicReference) {
        py4 py4Var;
        py4 py4Var2 = (py4) atomicReference.get();
        ty4 ty4Var = a;
        if (py4Var2 == ty4Var || (py4Var = (py4) atomicReference.getAndSet(ty4Var)) == ty4Var) {
            return false;
        }
        if (py4Var == null) {
            return true;
        }
        py4Var.dispose();
        return true;
    }

    public static boolean c(py4 py4Var) {
        return py4Var == a;
    }

    public static boolean d(AtomicReference atomicReference, py4 py4Var) {
        while (true) {
            py4 py4Var2 = (py4) atomicReference.get();
            if (py4Var2 == a) {
                if (py4Var == null) {
                    return false;
                }
                py4Var.dispose();
                return false;
            }
            while (!atomicReference.compareAndSet(py4Var2, py4Var)) {
                if (atomicReference.get() != py4Var2) {
                    break;
                }
            }
            return true;
        }
    }

    public static void g(AtomicReference atomicReference, py4 py4Var) {
        while (true) {
            py4 py4Var2 = (py4) atomicReference.get();
            if (py4Var2 == a) {
                py4Var.dispose();
                return;
            }
            while (!atomicReference.compareAndSet(py4Var2, py4Var)) {
                if (atomicReference.get() != py4Var2) {
                    break;
                }
            }
            if (py4Var2 != null) {
                py4Var2.dispose();
                return;
            }
            return;
        }
    }

    public static boolean h(AtomicReference atomicReference, py4 py4Var) {
        Objects.requireNonNull(py4Var, "d is null");
        while (!atomicReference.compareAndSet(null, py4Var)) {
            if (atomicReference.get() != null) {
                py4Var.dispose();
                if (atomicReference.get() == a) {
                    return false;
                }
                t8j.a(new ProtocolViolationException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean i(py4 py4Var, py4 py4Var2) {
        if (py4Var2 == null) {
            t8j.a(new NullPointerException("next is null"));
            return false;
        }
        if (py4Var == null) {
            return true;
        }
        py4Var2.dispose();
        t8j.a(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    public static ty4 valueOf(String str) {
        return (ty4) Enum.valueOf(ty4.class, str);
    }

    public static ty4[] values() {
        return (ty4[]) b.clone();
    }

    @Override // defpackage.py4
    public final void dispose() {
    }

    @Override // defpackage.py4
    public final boolean e() {
        return true;
    }
}
