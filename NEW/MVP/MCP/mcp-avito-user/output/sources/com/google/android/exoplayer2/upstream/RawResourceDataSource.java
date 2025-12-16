package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class RawResourceDataSource extends AbstractC36575e {

    /* renamed from: e, reason: collision with root package name */
    public final Resources f347778e;

    /* renamed from: f, reason: collision with root package name */
    public final String f347779f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public Uri f347780g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public AssetFileDescriptor f347781h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public FileInputStream f347782i;

    /* renamed from: j, reason: collision with root package name */
    public long f347783j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f347784k;

    public static class RawResourceDataSourceException extends DataSourceException {
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f347778e = context.getResources();
        this.f347779f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i12) {
        return Uri.parse("rawresource:///" + i12);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void close() {
        this.f347780g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f347782i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f347782i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f347781h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e12) {
                        throw new RawResourceDataSourceException(2000, null, e12);
                    }
                } finally {
                    this.f347781h = null;
                    if (this.f347784k) {
                        this.f347784k = false;
                        m();
                    }
                }
            } catch (IOException e13) {
                throw new RawResourceDataSourceException(2000, null, e13);
            }
        } catch (Throwable th2) {
            this.f347782i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f347781h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f347781h = null;
                    if (this.f347784k) {
                        this.f347784k = false;
                        m();
                    }
                    throw th2;
                } catch (IOException e14) {
                    throw new RawResourceDataSourceException(2000, null, e14);
                }
            } finally {
                this.f347781h = null;
                if (this.f347784k) {
                    this.f347784k = false;
                    m();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(com.google.android.exoplayer2.upstream.p r20) throws com.google.android.exoplayer2.upstream.DataSourceException, android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.RawResourceDataSource.e(com.google.android.exoplayer2.upstream.p):long");
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    @P
    public final Uri getUri() {
        return this.f347780g;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36580j
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        if (i13 == 0) {
            return 0;
        }
        long j12 = this.f347783j;
        if (j12 == 0) {
            return -1;
        }
        if (j12 != -1) {
            try {
                i13 = (int) Math.min(j12, i13);
            } catch (IOException e12) {
                throw new RawResourceDataSourceException(2000, null, e12);
            }
        }
        FileInputStream fileInputStream = this.f347782i;
        int i14 = U.f348106a;
        int i15 = fileInputStream.read(bArr, i12, i13);
        if (i15 == -1) {
            if (this.f347783j == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException(2000, "End of stream reached having not read sufficient data.", new EOFException());
        }
        long j13 = this.f347783j;
        if (j13 != -1) {
            this.f347783j = j13 - i15;
        }
        l(i15);
        return i15;
    }
}
