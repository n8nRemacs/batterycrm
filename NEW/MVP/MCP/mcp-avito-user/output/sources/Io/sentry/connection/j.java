package io.sentry.connection;

import com.adjust.sdk.Constants;
import io.sentry.event.Event;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;

/* compiled from: OutputStreamConnection.java */
/* loaded from: classes8.dex */
public class j extends a {

    /* renamed from: i, reason: collision with root package name */
    public static final Charset f405143i = Charset.forName(Constants.ENCODING);

    /* renamed from: g, reason: collision with root package name */
    public final PrintStream f405144g;

    /* renamed from: h, reason: collision with root package name */
    public io.sentry.marshaller.json.e f405145h;

    public j(PrintStream printStream) {
        super(null, null);
        this.f405144g = printStream;
    }

    @Override // io.sentry.connection.a
    public final synchronized void a(Event event) {
        try {
            PrintStream printStream = this.f405144g;
            Charset charset = f405143i;
            printStream.write("Sentry event:\n".getBytes(charset));
            this.f405145h.d(event, this.f405144g);
            this.f405144g.write("\n".getBytes(charset));
            this.f405144g.flush();
        } catch (IOException e12) {
            ConnectionException connectionException = new ConnectionException("Couldn't sent the event properly", e12);
            connectionException.f405089b = null;
            connectionException.f405090c = null;
            throw connectionException;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f405144g.close();
    }
}
