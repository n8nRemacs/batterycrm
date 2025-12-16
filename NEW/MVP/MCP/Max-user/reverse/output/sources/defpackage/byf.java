package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;

/* loaded from: classes2.dex */
public final class byf {
    public final /* synthetic */ uy5 a;

    public byf(uy5 uy5Var) {
        this.a = uy5Var;
    }

    public final int a(ByteBuffer byteBuffer) throws IOException {
        uy5 uy5Var = this.a;
        yxf yxfVar = (yxf) uy5Var.Y;
        if (yxfVar == null) {
            return ((SocketChannel) uy5Var.b).write(byteBuffer);
        }
        ByteBuffer byteBuffer2 = yxfVar.b;
        SSLEngine sSLEngine = yxfVar.a;
        if (byteBuffer2.hasRemaining()) {
            ((SocketChannel) uy5Var.b).write(byteBuffer2);
            return 0;
        }
        byteBuffer2.clear();
        SSLEngineResult sSLEngineResultWrap = sSLEngine.wrap(byteBuffer, byteBuffer2);
        sSLEngineResultWrap.toString();
        uy5Var.getClass();
        if (sSLEngineResultWrap.getStatus() == SSLEngineResult.Status.OK) {
            byteBuffer2.flip();
            ((SocketChannel) uy5Var.b).write(byteBuffer2);
            return sSLEngineResultWrap.bytesConsumed();
        }
        String str = "TLS engine.wrap error. res: " + sSLEngineResultWrap;
        uy5Var.a(str);
        throw new IOException(str);
    }
}
