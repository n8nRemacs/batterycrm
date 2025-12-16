package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class o8d extends lj0 {
    public final String X;
    public Uri Y;
    public AssetFileDescriptor Z;
    public final Resources o;
    public FileInputStream s0;
    public long t0;
    public boolean u0;

    public o8d(Context context) {
        super(false);
        this.o = context.getResources();
        this.X = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("rawresource:///");
        sb.append(i);
        return Uri.parse(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.qe4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long R(defpackage.ye4 r21) throws com.google.android.exoplayer2.upstream.DataSourceException, android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o8d.R(ye4):long");
    }

    @Override // defpackage.qe4
    public final void close() throws Throwable {
        this.Y = null;
        try {
            try {
                FileInputStream fileInputStream = this.s0;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.s0 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.Z;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new RawResourceDataSource$RawResourceDataSourceException(null, e, 2000);
                    }
                } finally {
                    this.Z = null;
                    if (this.u0) {
                        this.u0 = false;
                        c();
                    }
                }
            } catch (IOException e2) {
                throw new RawResourceDataSource$RawResourceDataSourceException(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.s0 = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.Z;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.Z = null;
                    if (this.u0) {
                        this.u0 = false;
                        c();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, e3, 2000);
                }
            } finally {
                this.Z = null;
                if (this.u0) {
                    this.u0 = false;
                    c();
                }
            }
        }
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        return this.Y;
    }

    @Override // defpackage.je4
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.t0;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.s0;
            int i3 = xxg.a;
            int i4 = fileInputStream.read(bArr, i, i2);
            if (i4 != -1) {
                long j2 = this.t0;
                if (j2 != -1) {
                    this.t0 = j2 - i4;
                }
                b(i4);
                return i4;
            }
            if (this.t0 != -1) {
                throw new RawResourceDataSource$RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}
