package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.UdpDataSource$UdpDataSourceException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class cqg extends lj0 {
    public final byte[] X;
    public final DatagramPacket Y;
    public Uri Z;
    public final int o;
    public DatagramSocket s0;
    public MulticastSocket t0;
    public InetAddress u0;
    public boolean v0;
    public int w0;

    public cqg() {
        super(true);
        this.o = 8000;
        byte[] bArr = new byte[2000];
        this.X = bArr;
        this.Y = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // defpackage.qe4
    public final long R(ye4 ye4Var) throws IOException {
        Uri uri = ye4Var.a;
        this.Z = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.Z.getPort();
        d();
        try {
            this.u0 = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.u0, port);
            if (this.u0.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.t0 = multicastSocket;
                multicastSocket.joinGroup(this.u0);
                this.s0 = this.t0;
            } else {
                this.s0 = new DatagramSocket(inetSocketAddress);
            }
            this.s0.setSoTimeout(this.o);
            this.v0 = true;
            e(ye4Var);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSource$UdpDataSourceException(e, 2001);
        } catch (SecurityException e2) {
            throw new UdpDataSource$UdpDataSourceException(e2, 2006);
        }
    }

    @Override // defpackage.qe4
    public final void close() throws Throwable {
        this.Z = null;
        MulticastSocket multicastSocket = this.t0;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.u0;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.t0 = null;
        }
        DatagramSocket datagramSocket = this.s0;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.s0 = null;
        }
        this.u0 = null;
        this.w0 = 0;
        if (this.v0) {
            this.v0 = false;
            c();
        }
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        return this.Z;
    }

    @Override // defpackage.je4
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.w0;
        DatagramPacket datagramPacket = this.Y;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.s0;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.w0 = length;
                b(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSource$UdpDataSourceException(e, 2002);
            } catch (IOException e2) {
                throw new UdpDataSource$UdpDataSourceException(e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.w0;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.X, length2 - i4, bArr, i, iMin);
        this.w0 -= iMin;
        return iMin;
    }
}
