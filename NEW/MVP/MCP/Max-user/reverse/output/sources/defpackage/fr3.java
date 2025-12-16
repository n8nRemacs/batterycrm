package defpackage;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.channels.UnresolvedAddressException;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;

/* loaded from: classes2.dex */
public final class fr3 {
    public final RandomAccessFile a;
    public final long b;
    public final String c;
    public final int d;
    public final uaj e = zvg.b;
    public final String f;
    public final int g;
    public final String h;
    public int i;
    public final uy5 j;
    public final lk6 k;
    public c93 l;
    public ng4 m;
    public final boolean n;
    public final bwf o;
    public final byte[] p;

    public fr3(Selector selector, Uri uri, RandomAccessFile randomAccessFile, long j, String str, int i, SSLContext sSLContext) throws IOException {
        int iIntValue;
        this.a = randomAccessFile;
        this.b = j;
        this.c = str;
        this.d = i;
        String host = uri.getHost();
        if (host == null) {
            throw new IllegalArgumentException("Host is null");
        }
        this.f = host;
        int port = uri.getPort();
        Integer numValueOf = port <= 0 ? null : Integer.valueOf(port);
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            Integer num = sSLContext != null ? 443 : null;
            iIntValue = num != null ? num.intValue() : 80;
        }
        this.g = iIntValue;
        this.h = u45.k(uri.getPath(), "?", uri.getQuery());
        this.i = 1;
        SocketChannel socketChannelOpen = SocketChannel.open();
        socketChannelOpen.configureBlocking(false);
        this.j = new uy5(i, socketChannelOpen, selector, this, sSLContext);
        this.k = new lk6(12, (byte) 0);
        this.n = true;
        this.o = new bwf(new hk1(21, this));
        this.p = new byte[8096];
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1 A[LOOP:1: B:19:0x007a->B:37:0x00d1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.ng4 r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr3.a(ng4):void");
    }

    public final void b() throws IOException {
        e("close");
        ((SocketChannel) this.j.b).close();
    }

    public final void c() throws IOException {
        uy5 uy5Var = this.j;
        uaj.a(this.e, this.i == 1, yvg.CONNECTION_WRONG_STATE_INIT);
        try {
            ((SocketChannel) uy5Var.b).connect(new InetSocketAddress(this.f, this.g));
            ((SocketChannel) uy5Var.b).register((Selector) uy5Var.c, 8, (fr3) uy5Var.d);
            h(2);
        } catch (UnresolvedAddressException unused) {
            throw new IOException("UnresolvedAddressException");
        }
    }

    public final void d() throws IOException {
        boolean zBooleanValue = false;
        uaj.a(this.e, this.i == 2, yvg.CONNECTION_WRONG_STATE_WAITING_FOR_CONNECT);
        h(3);
        uy5 uy5Var = this.j;
        SocketChannel socketChannel = (SocketChannel) uy5Var.b;
        boolean zFinishConnect = socketChannel.finishConnect();
        Boolean boolValueOf = Boolean.valueOf(zFinishConnect);
        if (!zFinishConnect) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            SSLContext sSLContext = (SSLContext) uy5Var.o;
            if (sSLContext != null) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketChannel.getRemoteAddress();
                SSLEngine sSLEngineCreateSSLEngine = sSLContext.createSSLEngine(inetSocketAddress.getHostName(), inetSocketAddress.getPort());
                sSLEngineCreateSSLEngine.setUseClientMode(true);
                sSLEngineCreateSSLEngine.beginHandshake();
                uy5Var.Y = new yxf(sSLEngineCreateSSLEngine);
            }
            zBooleanValue = boolValueOf.booleanValue();
        }
        if (!zBooleanValue) {
            b();
            return;
        }
        ng4 ng4Var = this.m;
        if (ng4Var == null) {
            ((SocketChannel) uy5Var.b).register((Selector) uy5Var.c, 4, (fr3) uy5Var.d);
        } else {
            a(ng4Var);
        }
    }

    public final void e(String str) {
        if (this.n) {
            Log.d("UploadConnection", "[" + this.d + "] " + str);
        }
    }

    public final void f() throws IOException {
        er3 er3Var = new er3(this, 0);
        uy5 uy5Var = this.j;
        ayf ayfVar = (ayf) uy5Var.Z;
        SocketChannel socketChannel = (SocketChannel) uy5Var.b;
        uaj uajVar = (uaj) uy5Var.X;
        yxf yxfVar = (yxf) uy5Var.Y;
        if (yxfVar == null) {
            er3Var.invoke(ayfVar);
            return;
        }
        ByteBuffer byteBuffer = yxfVar.d;
        ByteBuffer byteBuffer2 = yxfVar.c;
        SSLEngine sSLEngine = yxfVar.a;
        SSLEngineResult.HandshakeStatus handshakeStatus = sSLEngine.getHandshakeStatus();
        int i = handshakeStatus == null ? -1 : zxf.$EnumSwitchMapping$0[handshakeStatus.ordinal()];
        if (i == 1) {
            byteBuffer2.compact();
            int i2 = socketChannel.read(byteBuffer2);
            if (i2 == -1) {
                throw new IOException();
            }
            if (i2 == 0) {
                return;
            }
            byteBuffer2.flip();
            while (true) {
                byteBuffer.clear();
                byteBuffer2.position();
                byteBuffer2.limit();
                SSLEngineResult sSLEngineResultUnwrap = sSLEngine.unwrap(byteBuffer2, byteBuffer);
                Objects.toString(sSLEngineResultUnwrap);
                if (sSLEngineResultUnwrap.getStatus() != SSLEngineResult.Status.OK) {
                    if (sSLEngineResultUnwrap.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                        return;
                    }
                    String str = "TLS handshake error. wrapResult: " + sSLEngineResultUnwrap;
                    uy5Var.a(str);
                    throw new IOException(str);
                }
                if (sSLEngineResultUnwrap.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NEED_UNWRAP && sSLEngineResultUnwrap.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                    socketChannel.register((Selector) uy5Var.c, 4, (fr3) uy5Var.d);
                    return;
                }
            }
        } else {
            if (i == 2) {
                er3Var.invoke(ayfVar);
                return;
            }
            if (i != 3) {
                if (i == 4) {
                    uy5Var.a("NEED_WRAP");
                    uaj.a(uajVar, false, yvg.TLS_WRONG_HANDSHAKE_STATUS_1);
                    return;
                } else if (i != 5) {
                    uy5Var.a("handshakeStatus is null");
                    uaj.a(uajVar, false, yvg.TLS_WRONG_HANDSHAKE_STATUS_3);
                    return;
                } else {
                    uy5Var.a("FINISHED");
                    uaj.a(uajVar, false, yvg.TLS_WRONG_HANDSHAKE_STATUS_2);
                    return;
                }
            }
            while (true) {
                Runnable delegatedTask = sSLEngine.getDelegatedTask();
                if (delegatedTask == null) {
                    return;
                } else {
                    delegatedTask.run();
                }
            }
        }
    }

    public final void g() throws IOException {
        er3 er3Var = new er3(this, 1);
        uy5 uy5Var = this.j;
        byf byfVar = (byf) uy5Var.s0;
        SocketChannel socketChannel = (SocketChannel) uy5Var.b;
        uaj uajVar = (uaj) uy5Var.X;
        yxf yxfVar = (yxf) uy5Var.Y;
        if (yxfVar == null) {
            er3Var.invoke(byfVar);
            return;
        }
        ByteBuffer byteBuffer = yxfVar.b;
        SSLEngine sSLEngine = yxfVar.a;
        SSLEngineResult.HandshakeStatus handshakeStatus = sSLEngine.getHandshakeStatus();
        int i = handshakeStatus == null ? -1 : zxf.$EnumSwitchMapping$0[handshakeStatus.ordinal()];
        if (i == 1) {
            uy5Var.a("NEED_UNWRAP");
            uaj.a(uajVar, false, yvg.TLS_WRONG_HANDSHAKE_STATUS_5);
            return;
        }
        if (i == 2) {
            er3Var.invoke(byfVar);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    uy5Var.a("handshakeStatus is null");
                    uaj.a(uajVar, false, yvg.TLS_WRONG_HANDSHAKE_STATUS_6);
                    return;
                } else {
                    uy5Var.a("FINISHED");
                    uaj.a(uajVar, false, yvg.TLS_WRONG_HANDSHAKE_STATUS_4);
                    return;
                }
            }
            byteBuffer.clear();
            SSLEngineResult sSLEngineResultWrap = sSLEngine.wrap((ByteBuffer) uy5Var.t0, byteBuffer);
            Objects.toString(sSLEngineResultWrap);
            if (sSLEngineResultWrap.getStatus() != SSLEngineResult.Status.OK) {
                String str = "TLS handshake error. wrapResult: " + sSLEngineResultWrap;
                uy5Var.a(str);
                throw new IOException(str);
            }
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                socketChannel.write(byteBuffer);
            }
            if (sSLEngine.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                socketChannel.register((Selector) uy5Var.c, 1, (fr3) uy5Var.d);
                return;
            }
            return;
        }
        while (true) {
            Runnable delegatedTask = sSLEngine.getDelegatedTask();
            if (delegatedTask == null) {
                return;
            } else {
                delegatedTask.run();
            }
        }
    }

    public final void h(int i) {
        uaj.a(this.e, this.i != i, yvg.CONNECTION_STATE_INVALID_SET);
        int i2 = this.i;
        if (i2 != i) {
            e("state " + hf3.j(i2) + " -> " + hf3.j(i));
            this.i = i;
        }
    }
}
