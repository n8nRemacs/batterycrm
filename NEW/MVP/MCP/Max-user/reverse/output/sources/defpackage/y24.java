package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class y24 extends lj0 {
    public Uri X;
    public AssetFileDescriptor Y;
    public FileInputStream Z;
    public final ContentResolver o;
    public long s0;
    public boolean t0;

    public y24(Context context) {
        super(false);
        this.o = context.getContentResolver();
    }

    @Override // defpackage.qe4
    public final long R(ye4 ye4Var) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uri = ye4Var.a;
            long j = ye4Var.g;
            long j2 = ye4Var.f;
            this.X = uri;
            d();
            boolean zEquals = "content".equals(ye4Var.a.getScheme());
            ContentResolver contentResolver = this.o;
            if (zEquals) {
                Bundle bundle = new Bundle();
                if (xxg.a >= 31) {
                    x24.a(bundle);
                }
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            }
            this.Y = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                String strValueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
                sb.append("Could not open file descriptor for: ");
                sb.append(strValueOf);
                throw new ContentDataSource$ContentDataSourceException(new IOException(sb.toString()), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.Z = fileInputStream;
            if (length != -1 && j2 > length) {
                throw new ContentDataSource$ContentDataSourceException(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
            if (jSkip != j2) {
                throw new ContentDataSource$ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.s0 = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.s0 = jPosition;
                    if (jPosition < 0) {
                        throw new ContentDataSource$ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j3 = length - jSkip;
                this.s0 = j3;
                if (j3 < 0) {
                    throw new ContentDataSource$ContentDataSourceException(null, 2008);
                }
            }
            if (j != -1) {
                long j4 = this.s0;
                this.s0 = j4 == -1 ? j : Math.min(j4, j);
            }
            this.t0 = true;
            e(ye4Var);
            return j != -1 ? j : this.s0;
        } catch (ContentDataSource$ContentDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new ContentDataSource$ContentDataSourceException(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // defpackage.qe4
    public final void close() throws Throwable {
        this.X = null;
        try {
            try {
                FileInputStream fileInputStream = this.Z;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.Z = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.Y;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new ContentDataSource$ContentDataSourceException(e, 2000);
                    }
                } finally {
                    this.Y = null;
                    if (this.t0) {
                        this.t0 = false;
                        c();
                    }
                }
            } catch (IOException e2) {
                throw new ContentDataSource$ContentDataSourceException(e2, 2000);
            }
        } catch (Throwable th) {
            this.Z = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.Y;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.Y = null;
                    if (this.t0) {
                        this.t0 = false;
                        c();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new ContentDataSource$ContentDataSourceException(e3, 2000);
                }
            } finally {
                this.Y = null;
                if (this.t0) {
                    this.t0 = false;
                    c();
                }
            }
        }
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        return this.X;
    }

    @Override // defpackage.je4
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.s0;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new ContentDataSource$ContentDataSourceException(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.Z;
            int i3 = xxg.a;
            int i4 = fileInputStream.read(bArr, i, i2);
            if (i4 != -1) {
                long j2 = this.s0;
                if (j2 != -1) {
                    this.s0 = j2 - i4;
                }
                b(i4);
                return i4;
            }
        }
        return -1;
    }
}
