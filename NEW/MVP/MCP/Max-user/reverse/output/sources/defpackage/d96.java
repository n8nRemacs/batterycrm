package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class d96 implements e96 {
    public final List a;

    public d96(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d96) && fni.a(this.a, ((d96) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenPicker(includes=" + this.a + ")";
    }
}
