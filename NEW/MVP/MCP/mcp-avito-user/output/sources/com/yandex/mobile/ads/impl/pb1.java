package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes8.dex */
public final class pb1 extends we {

    /* renamed from: e, reason: collision with root package name */
    private final int f388757e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f388758f;

    /* renamed from: g, reason: collision with root package name */
    private final DatagramPacket f388759g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private Uri f388760h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private DatagramSocket f388761i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private MulticastSocket f388762j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    private InetAddress f388763k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f388764l;

    /* renamed from: m, reason: collision with root package name */
    private int f388765m;

    public static final class a extends hn {
        public a(Exception exc, int i12) {
            super(exc, i12);
        }
    }

    public pb1(int i12) {
        super(true);
        this.f388757e = JosStatusCodes.RTN_CODE_COMMON_ERROR;
        byte[] bArr = new byte[2000];
        this.f388758f = bArr;
        this.f388759g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final long a(kn knVar) throws IOException {
        Uri uri = knVar.f387192a;
        this.f388760h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f388760h.getPort();
        b(knVar);
        try {
            this.f388763k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f388763k, port);
            if (this.f388763k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f388762j = multicastSocket;
                multicastSocket.joinGroup(this.f388763k);
                this.f388761i = this.f388762j;
            } else {
                this.f388761i = new DatagramSocket(inetSocketAddress);
            }
            this.f388761i.setSoTimeout(this.f388757e);
            this.f388764l = true;
            c(knVar);
            return -1L;
        } catch (IOException e12) {
            throw new a(e12, 2001);
        } catch (SecurityException e13) {
            throw new a(e13, 2006);
        }
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final void close() throws IOException {
        this.f388760h = null;
        MulticastSocket multicastSocket = this.f388762j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f388763k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f388762j = null;
        }
        DatagramSocket datagramSocket = this.f388761i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f388761i = null;
        }
        this.f388763k = null;
        this.f388765m = 0;
        if (this.f388764l) {
            this.f388764l = false;
            f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.gn
    @j.P
    public final Uri d() {
        return this.f388760h;
    }

    @Override // com.yandex.mobile.ads.impl.dn
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        if (i13 == 0) {
            return 0;
        }
        if (this.f388765m == 0) {
            try {
                DatagramSocket datagramSocket = this.f388761i;
                datagramSocket.getClass();
                datagramSocket.receive(this.f388759g);
                int length = this.f388759g.getLength();
                this.f388765m = length;
                c(length);
            } catch (SocketTimeoutException e12) {
                throw new a(e12, 2002);
            } catch (IOException e13) {
                throw new a(e13, 2001);
            }
        }
        int length2 = this.f388759g.getLength();
        int i14 = this.f388765m;
        int iMin = Math.min(i14, i13);
        System.arraycopy(this.f388758f, length2 - i14, bArr, i12, iMin);
        this.f388765m -= iMin;
        return iMin;
    }
}
