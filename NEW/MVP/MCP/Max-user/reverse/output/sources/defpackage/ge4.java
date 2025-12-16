package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class ge4 extends tei {
    public ByteBuffer b;

    public final String toString() {
        return wy1.e(this.b.limit() - this.b.position(), "DataFrame[", "]");
    }
}
