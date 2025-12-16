package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.J;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import j.P;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

@J
/* loaded from: classes.dex */
public final class UdpDataSource extends d {

    /* renamed from: e, reason: collision with root package name */
    public final int f48190e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f48191f;

    /* renamed from: g, reason: collision with root package name */
    public final DatagramPacket f48192g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public Uri f48193h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public DatagramSocket f48194i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public MulticastSocket f48195j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public InetAddress f48196k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f48197l;

    /* renamed from: m, reason: collision with root package name */
    public int f48198m;

    public static final class UdpDataSourceException extends DataSourceException {
    }

    public UdpDataSource() {
        super(true);
        this.f48190e = JosStatusCodes.RTN_CODE_COMMON_ERROR;
        byte[] bArr = new byte[2000];
        this.f48191f = bArr;
        this.f48192g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // androidx.media3.datasource.j
    public final void close() throws IOException {
        this.f48193h = null;
        MulticastSocket multicastSocket = this.f48195j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f48196k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f48195j = null;
        }
        DatagramSocket datagramSocket = this.f48194i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f48194i = null;
        }
        this.f48196k = null;
        this.f48198m = 0;
        if (this.f48197l) {
            this.f48197l = false;
            l();
        }
    }

    @Override // androidx.media3.datasource.j
    public final long e(o oVar) throws IOException {
        Uri uri = oVar.f48245a;
        this.f48193h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f48193h.getPort();
        m(oVar);
        try {
            this.f48196k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f48196k, port);
            if (this.f48196k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f48195j = multicastSocket;
                multicastSocket.joinGroup(this.f48196k);
                this.f48194i = this.f48195j;
            } else {
                this.f48194i = new DatagramSocket(inetSocketAddress);
            }
            this.f48194i.setSoTimeout(this.f48190e);
            this.f48197l = true;
            n(oVar);
            return -1L;
        } catch (IOException e12) {
            throw new UdpDataSourceException(e12, 2001);
        } catch (SecurityException e13) {
            throw new UdpDataSourceException(e13, 2006);
        }
    }

    @Override // androidx.media3.datasource.j
    @P
    public final Uri getUri() {
        return this.f48193h;
    }

    @Override // androidx.media3.common.InterfaceC23102m
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        if (i13 == 0) {
            return 0;
        }
        int i14 = this.f48198m;
        DatagramPacket datagramPacket = this.f48192g;
        if (i14 == 0) {
            try {
                DatagramSocket datagramSocket = this.f48194i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f48198m = length;
                k(length);
            } catch (SocketTimeoutException e12) {
                throw new UdpDataSourceException(e12, 2002);
            } catch (IOException e13) {
                throw new UdpDataSourceException(e13, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i15 = this.f48198m;
        int iMin = Math.min(i15, i13);
        System.arraycopy(this.f48191f, length2 - i15, bArr, i12, iMin);
        this.f48198m -= iMin;
        return iMin;
    }
}
