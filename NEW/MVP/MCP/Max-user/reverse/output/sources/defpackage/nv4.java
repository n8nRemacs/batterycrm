package defpackage;

/* loaded from: classes2.dex */
public enum nv4 {
    LOW((byte) 1),
    AVERAGE((byte) 2),
    HIGH((byte) 3);

    public static volatile nv4 b;
    public final byte a;

    nv4(byte b2) {
        this.a = b2;
    }

    public final boolean a() {
        return this == LOW;
    }
}
