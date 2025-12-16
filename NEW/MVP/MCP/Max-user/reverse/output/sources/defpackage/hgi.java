package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class hgi extends fgi implements Serializable {
    public final transient wi3 c;

    public hgi() {
        wi3 wi3Var = new wi3(1);
        if (!wi3Var.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.c = wi3Var;
    }
}
