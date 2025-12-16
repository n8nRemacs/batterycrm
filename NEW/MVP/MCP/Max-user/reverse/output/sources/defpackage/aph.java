package defpackage;

/* loaded from: classes2.dex */
public final class aph extends dph {
    public static final aph c = new aph("cancelled", 3);

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof aph);
    }

    public final int hashCode() {
        return 685061141;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "Cancelled";
    }
}
