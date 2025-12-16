package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class uv3 {
    public final String a;

    public uv3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uv3) {
            return Objects.equals(this.a, ((uv3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return ho7.l(new StringBuilder("MenuButton{text='"), this.a, "'}");
    }
}
