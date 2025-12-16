package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import j.P;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes6.dex */
public final class UdpDataSource extends AbstractC36575e {

    /* renamed from: e, reason: collision with root package name */
    public final int f347785e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f347786f;

    /* renamed from: g, reason: collision with root package name */
    public final DatagramPacket f347787g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public Uri f347788h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public DatagramSocket f347789i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public MulticastSocket f347790j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public InetAddress f347791k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f347792l;

    /* renamed from: m, reason: collision with root package name */
    public int f347793m;

    public static final class UdpDataSourceException extends DataSourceException {
    }

    public UdpDataSource() {
        super(true);
        this.f347785e = JosStatusCodes.RTN_CODE_COMMON_ERROR;
        byte[] bArr = new byte[2000];
        this.f347786f = bArr;
        this.f347787g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void close() throws IOException {
        this.f347788h = null;
        MulticastSocket multicastSocket = this.f347790j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f347791k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f347790j = null;
        }
        DatagramSocket datagramSocket = this.f347789i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f347789i = null;
        }
        this.f347791k = null;
        this.f347793m = 0;
        if (this.f347792l) {
            this.f347792l = false;
            m();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final long e(p pVar) throws IOException {
        Uri uri = pVar.f347929a;
        this.f347788h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f347788h.getPort();
        n(pVar);
        try {
            this.f347791k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f347791k, port);
            if (this.f347791k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f347790j = multicastSocket;
                multicastSocket.joinGroup(this.f347791k);
                this.f347789i = this.f347790j;
            } else {
                this.f347789i = new DatagramSocket(inetSocketAddress);
            }
            this.f347789i.setSoTimeout(this.f347785e);
            this.f347792l = true;
            o(pVar);
            return -1L;
        } catch (IOException e12) {
            throw new UdpDataSourceException(e12, 2001);
        } catch (SecurityException e13) {
            throw new UdpDataSourceException(e13, 2006);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    @P
    public final Uri getUri() {
        return this.f347788h;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36580j
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        if (i13 == 0) {
            return 0;
        }
        int i14 = this.f347793m;
        DatagramPacket datagramPacket = this.f347787g;
        if (i14 == 0) {
            try {
                DatagramSocket datagramSocket = this.f347789i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f347793m = length;
                l(length);
            } catch (SocketTimeoutException e12) {
                throw new UdpDataSourceException(e12, 2002);
            } catch (IOException e13) {
                throw new UdpDataSourceException(e13, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i15 = this.f347793m;
        int iMin = Math.min(i15, i13);
        System.arraycopy(this.f347786f, length2 - i15, bArr, i12, iMin);
        this.f347793m -= iMin;
        return iMin;
    }
}
