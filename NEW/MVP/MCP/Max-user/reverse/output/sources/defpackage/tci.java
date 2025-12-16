package defpackage;

/* loaded from: classes.dex */
public final class tci implements hdi {
    public final int a;

    public tci(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return hdi.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdi)) {
            return false;
        }
        tci tciVar = (tci) ((hdi) obj);
        if (this.a != tciVar.a) {
            return false;
        }
        tciVar.getClass();
        Object obj2 = fdi.a;
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (fdi.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + fdi.a + ')';
    }
}
