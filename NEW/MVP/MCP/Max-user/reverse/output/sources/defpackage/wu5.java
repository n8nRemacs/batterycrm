package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class wu5 {
    public final String a;
    public final Map b;

    public wu5(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static i5i a(String str) {
        return new i5i(str, 18);
    }

    public static wu5 c(String str) {
        return new wu5(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu5)) {
            return false;
        }
        wu5 wu5Var = (wu5) obj;
        return this.a.equals(wu5Var.a) && this.b.equals(wu5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
