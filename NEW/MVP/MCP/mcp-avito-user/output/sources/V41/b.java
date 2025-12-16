package V41;

import X41.i;
import Y61.l;
import kotlin.C42833p;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.X;

/* compiled from: AutoCloseableJVM.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u001a\b\u0007\u0010\u0004\"\u00020\u00002\u00020\u0000B\f\b\u0001\u0012\b\b\u0002\u0012\u0004\b\b(\u0003¨\u0006\u0005"}, d2 = {"Ljava/lang/AutoCloseable;", "Lkotlin/c0;", "version", "2.0", "AutoCloseable", "kotlin-stdlib-jdk7"}, k = 2, mv = {1, 9, 0}, xi = 48)
@i
/* loaded from: classes8.dex */
public final class b {
    @X
    @InterfaceC42733c0
    public static final void a(@l AutoCloseable autoCloseable, @l Throwable th2) throws Exception {
        if (autoCloseable != null) {
            if (th2 == null) {
                autoCloseable.close();
                return;
            }
            try {
                autoCloseable.close();
            } catch (Throwable th3) {
                C42833p.a(th2, th3);
            }
        }
    }
}
