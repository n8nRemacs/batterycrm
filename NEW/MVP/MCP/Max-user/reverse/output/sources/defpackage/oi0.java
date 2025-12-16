package defpackage;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class oi0 {
    public final int a;
    public final ExecutorService b;

    public /* synthetic */ oi0(int i, ExecutorService executorService) {
        this.a = i;
        this.b = executorService;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oi0)) {
            return false;
        }
        oi0 oi0Var = (oi0) obj;
        return this.a == oi0Var.a && syi.c(this.b, oi0Var.b) && syi.c(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.FALSE, this.b, null});
    }
}
