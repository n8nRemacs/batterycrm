package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.datasource.ContentDataSource$ContentDataSourceException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z24 extends mj0 {
    public Uri X;
    public AssetFileDescriptor Y;
    public FileInputStream Z;
    public final ContentResolver o;
    public long s0;
    public boolean t0;

    public z24(Context context) {
        super(false);
        this.o = context.getContentResolver();
    }

    @Override // defpackage.se4
    public final long H(ze4 ze4Var) throws IOException {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = ze4Var.a;
                long j = ze4Var.g;
                long j2 = ze4Var.f;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.X = uriNormalizeScheme;
                d(ze4Var);
                boolean zEquals = Objects.equals(uriNormalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.o;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.Y = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new ContentDataSource$ContentDataSourceException(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
                    } catch (IOException e) {
                        e = e;
                        if (e instanceof FileNotFoundException) {
                            i = 2005;
                        }
                        throw new ContentDataSource$ContentDataSourceException(e, i);
                    }
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
                e(ze4Var);
                return j != -1 ? j : this.s0;
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (ContentDataSource$ContentDataSourceException e3) {
            throw e3;
        }
    }

    @Override // defpackage.se4
    public final void close() {
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

    @Override // defpackage.se4
    public final Uri getUri() {
        return this.X;
    }

    @Override // defpackage.ke4
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
            String str = zxg.a;
            int i3 = fileInputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.s0;
                if (j2 != -1) {
                    this.s0 = j2 - i3;
                }
                b(i3);
                return i3;
            }
        }
        return -1;
    }
}
