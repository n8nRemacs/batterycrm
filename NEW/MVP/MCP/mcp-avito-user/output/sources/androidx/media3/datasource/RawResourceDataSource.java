package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

@J
/* loaded from: classes.dex */
public final class RawResourceDataSource extends d {

    /* renamed from: e, reason: collision with root package name */
    public final Resources f48183e;

    /* renamed from: f, reason: collision with root package name */
    public final String f48184f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public Uri f48185g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public AssetFileDescriptor f48186h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public FileInputStream f48187i;

    /* renamed from: j, reason: collision with root package name */
    public long f48188j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f48189k;

    public static class RawResourceDataSourceException extends DataSourceException {
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f48183e = context.getResources();
        this.f48184f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i12) {
        return Uri.parse("rawresource:///" + i12);
    }

    @Override // androidx.media3.datasource.j
    public final void close() {
        this.f48185g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f48187i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f48187i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f48186h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e12) {
                        throw new RawResourceDataSourceException(2000, null, e12);
                    }
                } finally {
                    this.f48186h = null;
                    if (this.f48189k) {
                        this.f48189k = false;
                        l();
                    }
                }
            } catch (IOException e13) {
                throw new RawResourceDataSourceException(2000, null, e13);
            }
        } catch (Throwable th2) {
            this.f48187i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f48186h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f48186h = null;
                    if (this.f48189k) {
                        this.f48189k = false;
                        l();
                    }
                    throw th2;
                } catch (IOException e14) {
                    throw new RawResourceDataSourceException(2000, null, e14);
                }
            } finally {
                this.f48186h = null;
                if (this.f48189k) {
                    this.f48189k = false;
                    l();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // androidx.media3.datasource.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(androidx.media3.datasource.o r20) throws androidx.media3.datasource.DataSourceException, android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.RawResourceDataSource.e(androidx.media3.datasource.o):long");
    }

    @Override // androidx.media3.datasource.j
    @P
    public final Uri getUri() {
        return this.f48185g;
    }

    @Override // androidx.media3.common.InterfaceC23102m
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        if (i13 == 0) {
            return 0;
        }
        long j12 = this.f48188j;
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
        FileInputStream fileInputStream = this.f48187i;
        int i14 = M.f47887a;
        int i15 = fileInputStream.read(bArr, i12, i13);
        if (i15 == -1) {
            if (this.f48188j == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException(2000, "End of stream reached having not read sufficient data.", new EOFException());
        }
        long j13 = this.f48188j;
        if (j13 != -1) {
            this.f48188j = j13 - i15;
        }
        k(i15);
        return i15;
    }
}
