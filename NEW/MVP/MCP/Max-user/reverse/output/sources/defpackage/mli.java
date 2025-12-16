package defpackage;

/* loaded from: classes.dex */
public final class mli implements emi {
    public final int a;

    public mli(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return emi.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emi)) {
            return false;
        }
        mli mliVar = (mli) ((emi) obj);
        if (this.a != mliVar.a) {
            return false;
        }
        mliVar.getClass();
        Object obj2 = cmi.a;
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (cmi.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + cmi.a + ')';
    }
}
