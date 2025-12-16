package defpackage;

import java.nio.ByteBuffer;
import tech.kwik.core.generic.IntegerTooLargeException;
import tech.kwik.core.impl.TransportError;

/* loaded from: classes.dex */
public abstract class atc {
    public static int e(ByteBuffer byteBuffer) throws TransportError {
        try {
            return epi.g(byteBuffer);
        } catch (IntegerTooLargeException unused) {
            throw new TransportError(2, "value too large");
        }
    }

    public abstract void a(ysc yscVar, btc btcVar, bj bjVar);

    public abstract int c();

    public boolean d() {
        return !(this instanceof z5);
    }

    public abstract void g(ByteBuffer byteBuffer);
}
