package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.Metadata;

@Metadata(d1 = {"okio/N", "okio/O"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class M {
    @Y61.k
    public static final c0 a(@Y61.k File file) {
        Logger logger = N.f420027a;
        return c(new FileOutputStream(file, true));
    }

    @X41.i
    @Y61.k
    public static final c0 b() {
        return new C44801k();
    }

    @Y61.k
    public static final c0 c(@Y61.k OutputStream outputStream) {
        Logger logger = N.f420027a;
        return new Q(outputStream, new i0());
    }

    @Y61.k
    public static final c0 d(@Y61.k Socket socket) {
        Logger logger = N.f420027a;
        d0 d0Var = new d0(socket);
        return d0Var.sink(new Q(socket.getOutputStream(), d0Var));
    }

    public static c0 e(File file) {
        Logger logger = N.f420027a;
        return c(new FileOutputStream(file, false));
    }

    @Y61.k
    public static final e0 f(@Y61.k File file) {
        Logger logger = N.f420027a;
        return new G(new FileInputStream(file), i0.NONE);
    }

    @Y61.k
    public static final e0 g(@Y61.k InputStream inputStream) {
        Logger logger = N.f420027a;
        return new G(inputStream, new i0());
    }

    @Y61.k
    public static final e0 h(@Y61.k Socket socket) {
        Logger logger = N.f420027a;
        d0 d0Var = new d0(socket);
        return d0Var.source(new G(socket.getInputStream(), d0Var));
    }
}
