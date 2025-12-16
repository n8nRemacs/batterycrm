package defpackage;

import android.net.TrafficStats;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zp7 {
    public static final bwf c = new bwf(new i77(9));
    public final c9f a;
    public final String b = zp7.class.getName();

    public zp7(c9f c9fVar) {
        this.a = c9fVar;
    }

    public final void a(Socket socket) throws IOException {
        String str = this.b;
        try {
            TrafficStats.untagSocket(socket);
        } catch (Exception e) {
            wqi.e(str, "error occuried while untag stat for " + socket, e);
        }
        if (socket.isClosed()) {
            return;
        }
        try {
            socket.close();
        } catch (IOException e2) {
            wqi.e(str, "failed to close " + socket, e2);
        }
    }

    public final void b(Socket socket) throws IOException {
        lg8 lg8Var = lg8.c;
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        String str = this.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str, "sendRequest, OPTIONS /generate_204 HTTP/1.1\r\nHost: gstatic.com:443\r\nUser-Agent: WebClient\r\nAccept: */*\r\nConnection: close\r\n\r\n ...", null);
        }
        Charset charset = lb2.a;
        outputStream.write("OPTIONS /generate_204 HTTP/1.1\r\nHost: gstatic.com:443\r\nUser-Agent: WebClient\r\nAccept: */*\r\nConnection: close\r\n\r\n".getBytes(charset));
        outputStream.flush();
        byte[] bytes = "\r\n\r\n".getBytes(charset);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        do {
            int i3 = inputStream.read();
            if (i3 == -1) {
                throw new IOException("Unexpected error in header");
            }
            byteArrayOutputStream.write(i3);
            i2 = i3 == bytes[i2] ? i2 + 1 : 0;
        } while (i2 != bytes.length);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr = (byte[]) c.getValue();
        int length = byteArray.length - bArr.length;
        if (length < 0) {
            i = -1;
            break;
        }
        while (!Arrays.equals(bArr, ys.o(i, byteArray, bArr.length + i))) {
            if (i == length) {
                i = -1;
                break;
            }
            i++;
        }
        if (i == -1) {
            String str2 = new String(byteArray, lb2.a);
            if (!dnf.r(str2, "HTTP/1.1 204 No Content", true)) {
                throw new IOException("Invalid reply header=".concat(str2));
            }
        }
        String str3 = this.b;
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            l6bVar2.c(lg8Var, str3, "process, looks like the gstatic.com is reachable", null);
        }
    }
}
