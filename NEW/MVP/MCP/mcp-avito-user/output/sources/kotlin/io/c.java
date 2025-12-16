package kotlin.io;

import java.io.Closeable;
import kotlin.C42833p;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.X;

/* compiled from: Closeable.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes8.dex */
public final class c {
    @X
    @InterfaceC42733c0
    public static final void a(@Y61.l Closeable closeable, @Y61.l Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                C42833p.a(th2, th3);
            }
        }
    }
}
