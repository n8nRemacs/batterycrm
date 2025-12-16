package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class jmd implements Serializable {
    public final ArrayList a;

    public jmd(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jmd) && this.a.equals(((jmd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReplyKeyboard(buttonAttaches=" + this.a + ")";
    }
}
