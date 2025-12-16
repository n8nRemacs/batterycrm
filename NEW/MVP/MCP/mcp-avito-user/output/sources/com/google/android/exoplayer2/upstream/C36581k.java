package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import com.google.common.base.C37262f;
import j.P;
import java.net.URLDecoder;

/* compiled from: DataSchemeDataSource.java */
/* renamed from: com.google.android.exoplayer2.upstream.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36581k extends AbstractC36575e {

    /* renamed from: e, reason: collision with root package name */
    @P
    public p f347919e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public byte[] f347920f;

    /* renamed from: g, reason: collision with root package name */
    public int f347921g;

    /* renamed from: h, reason: collision with root package name */
    public int f347922h;

    public C36581k() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void close() {
        if (this.f347920f != null) {
            this.f347920f = null;
            m();
        }
        this.f347919e = null;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final long e(p pVar) throws DataSourceException, ParserException {
        n(pVar);
        this.f347919e = pVar;
        Uri uri = pVar.f347929a;
        String scheme = uri.getScheme();
        C36585a.a("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i12 = U.f348106a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException(androidx.appcompat.app.r.n(uri, "Unexpected URI format: "), null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f347920f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e12) {
                throw new ParserException(androidx.camera.camera2.internal.G.f("Error while parsing Base64 encoded string: ", str), e12, true, 0);
            }
        } else {
            this.f347920f = URLDecoder.decode(str, C37262f.f359032a.name()).getBytes(C37262f.f359034c);
        }
        byte[] bArr = this.f347920f;
        long length = bArr.length;
        long j12 = pVar.f347934f;
        if (j12 > length) {
            this.f347920f = null;
            throw new DataSourceException(2008);
        }
        int i13 = (int) j12;
        this.f347921g = i13;
        int length2 = bArr.length - i13;
        this.f347922h = length2;
        long j13 = pVar.f347935g;
        if (j13 != -1) {
            this.f347922h = (int) Math.min(length2, j13);
        }
        o(pVar);
        return j13 != -1 ? j13 : this.f347922h;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    @P
    public final Uri getUri() {
        p pVar = this.f347919e;
        if (pVar != null) {
            return pVar.f347929a;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36580j
    public final int read(byte[] bArr, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        int i14 = this.f347922h;
        if (i14 == 0) {
            return -1;
        }
        int iMin = Math.min(i13, i14);
        byte[] bArr2 = this.f347920f;
        int i15 = U.f348106a;
        System.arraycopy(bArr2, this.f347921g, bArr, i12, iMin);
        this.f347921g += iMin;
        this.f347922h -= iMin;
        l(iMin);
        return iMin;
    }
}
