package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class dv extends utb implements sk3 {
    public final sk3 a;

    public dv(sk3 sk3Var) {
        this.a = sk3Var;
    }

    @Override // defpackage.sk3
    public final void c(jk3 jk3Var) {
        try {
            this.a.c(jk3Var);
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof InterruptedException)) {
                throw e;
            }
            if (jk3Var.e()) {
                Thread.currentThread().interrupt();
                return;
            }
            Throwable cause = e.getCause();
            if (jk3Var.a(cause)) {
                return;
            }
            t8j.a(cause);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dv) && Objects.equals(this.a, ((dv) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        Object[] objArr = {this.a};
        String[] strArrSplit = "a".length() == 0 ? new String[0] : "a".split(";");
        StringBuilder sb = new StringBuilder();
        sb.append(dv.class.getSimpleName());
        sb.append("[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
