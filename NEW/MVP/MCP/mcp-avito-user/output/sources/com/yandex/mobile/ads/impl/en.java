package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* loaded from: classes8.dex */
public final class en extends we {

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private kn f385008e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private byte[] f385009f;

    /* renamed from: g, reason: collision with root package name */
    private int f385010g;

    /* renamed from: h, reason: collision with root package name */
    private int f385011h;

    public en() {
        super(false);
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final long a(kn knVar) throws hn, tr0 {
        b(knVar);
        this.f385008e = knVar;
        Uri uri = knVar.f387192a;
        String scheme = uri.getScheme();
        db.a("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i12 = pc1.f388768a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw tr0.a("Unexpected URI format: " + uri, (IllegalArgumentException) null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f385009f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e12) {
                throw tr0.a("Error while parsing Base64 encoded string: " + str, e12);
            }
        } else {
            this.f385009f = pc1.b(URLDecoder.decode(str, oi.f388552a.name()));
        }
        long j12 = knVar.f387197f;
        byte[] bArr = this.f385009f;
        if (j12 > bArr.length) {
            this.f385009f = null;
            throw new hn(2008);
        }
        int i13 = (int) j12;
        this.f385010g = i13;
        int length = bArr.length - i13;
        this.f385011h = length;
        long j13 = knVar.f387198g;
        if (j13 != -1) {
            this.f385011h = (int) Math.min(length, j13);
        }
        c(knVar);
        long j14 = knVar.f387198g;
        return j14 != -1 ? j14 : this.f385011h;
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final void close() {
        if (this.f385009f != null) {
            this.f385009f = null;
            f();
        }
        this.f385008e = null;
    }

    @Override // com.yandex.mobile.ads.impl.gn
    @j.P
    public final Uri d() {
        kn knVar = this.f385008e;
        if (knVar != null) {
            return knVar.f387192a;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.dn
    public final int read(byte[] bArr, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        int i14 = this.f385011h;
        if (i14 == 0) {
            return -1;
        }
        int iMin = Math.min(i13, i14);
        byte[] bArr2 = this.f385009f;
        int i15 = pc1.f388768a;
        System.arraycopy(bArr2, this.f385010g, bArr, i12, iMin);
        this.f385010g += iMin;
        this.f385011h -= iMin;
        c(iMin);
        return iMin;
    }
}
