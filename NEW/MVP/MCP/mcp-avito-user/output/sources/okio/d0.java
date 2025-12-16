package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: JvmOkio.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/d0;", "Lokio/j;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class d0 extends C44800j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Socket f420066b;

    public d0(@Y61.k Socket socket) {
        this.f420066b = socket;
    }

    @Override // okio.C44800j
    @Y61.k
    public final IOException newTimeoutException(@Y61.l IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.C44800j
    public final void timedOut() throws IOException {
        Socket socket = this.f420066b;
        try {
            socket.close();
        } catch (AssertionError e12) {
            Logger logger = N.f420027a;
            boolean z12 = false;
            if (e12.getCause() != null) {
                String message = e12.getMessage();
                if (message != null ? C43066x.q(message, "getsockname failed", false) : false) {
                    z12 = true;
                }
            }
            if (!z12) {
                throw e12;
            }
            N.f420027a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e12);
        } catch (Exception e13) {
            N.f420027a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e13);
        }
    }
}
