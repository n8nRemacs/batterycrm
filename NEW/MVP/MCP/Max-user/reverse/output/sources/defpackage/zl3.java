package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zl3 implements py4, qy4 {
    public so0 a;
    public volatile boolean b;

    public static void f(so0 so0Var) {
        if (so0Var == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : (Object[]) so0Var.d) {
            if (obj instanceof py4) {
                try {
                    ((py4) obj).dispose();
                } catch (Throwable th) {
                    raj.c(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw bj5.d((Throwable) arrayList.get(0));
        }
    }

    @Override // defpackage.qy4
    public final boolean a(py4 py4Var) {
        Objects.requireNonNull(py4Var, "disposable is null");
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        so0 so0Var = this.a;
                        if (so0Var == null) {
                            so0Var = new so0();
                            int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                            so0Var.a = iNumberOfLeadingZeros - 1;
                            so0Var.c = (int) (0.75f * iNumberOfLeadingZeros);
                            so0Var.d = new Object[iNumberOfLeadingZeros];
                            this.a = so0Var;
                        }
                        so0Var.a(py4Var);
                        return true;
                    }
                } finally {
                }
            }
        }
        py4Var.dispose();
        return false;
    }

    @Override // defpackage.qy4
    public final boolean b(py4 py4Var) {
        if (!c(py4Var)) {
            return false;
        }
        py4Var.dispose();
        return true;
    }

    @Override // defpackage.qy4
    public final boolean c(py4 py4Var) {
        Object obj;
        Objects.requireNonNull(py4Var, "disposable is null");
        if (this.b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return false;
                }
                so0 so0Var = this.a;
                if (so0Var != null) {
                    Object[] objArr = (Object[]) so0Var.d;
                    int i = so0Var.a;
                    int iHashCode = py4Var.hashCode() * (-1640531527);
                    int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
                    Object obj2 = objArr[i2];
                    if (obj2 != null) {
                        if (obj2.equals(py4Var)) {
                            so0Var.c(i2, i, objArr);
                        } else {
                            do {
                                i2 = (i2 + 1) & i;
                                obj = objArr[i2];
                                if (obj == null) {
                                }
                            } while (!obj.equals(py4Var));
                            so0Var.c(i2, i, objArr);
                        }
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    public final void d() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                so0 so0Var = this.a;
                this.a = null;
                f(so0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                so0 so0Var = this.a;
                this.a = null;
                f(so0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.b;
    }
}
