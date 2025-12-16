package defpackage;

/* loaded from: classes.dex */
public final class ly implements bpc {
    public final int a;

    public ly(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return bpc.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpc)) {
            return false;
        }
        ly lyVar = (ly) ((bpc) obj);
        if (this.a != lyVar.a) {
            return false;
        }
        lyVar.getClass();
        Object obj2 = apc.a;
        return obj2.equals(obj2);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.a) + (apc.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + apc.a + ')';
    }
}
