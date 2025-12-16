package androidx.media3.datasource;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

@J
/* loaded from: classes.dex */
public final class ContentDataSource extends d {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f48165e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public Uri f48166f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public AssetFileDescriptor f48167g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public FileInputStream f48168h;

    /* renamed from: i, reason: collision with root package name */
    public long f48169i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f48170j;

    public static class ContentDataSourceException extends DataSourceException {
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f48165e = context.getContentResolver();
    }

    @Override // androidx.media3.datasource.j
    public final void close() {
        this.f48166f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f48168h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f48168h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f48167g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e12) {
                        throw new ContentDataSourceException(e12, 2000);
                    }
                } finally {
                    this.f48167g = null;
                    if (this.f48170j) {
                        this.f48170j = false;
                        l();
                    }
                }
            } catch (IOException e13) {
                throw new ContentDataSourceException(e13, 2000);
            }
        } catch (Throwable th2) {
            this.f48168h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f48167g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f48167g = null;
                    if (this.f48170j) {
                        this.f48170j = false;
                        l();
                    }
                    throw th2;
                } catch (IOException e14) {
                    throw new ContentDataSourceException(e14, 2000);
                }
            } finally {
                this.f48167g = null;
                if (this.f48170j) {
                    this.f48170j = false;
                    l();
                }
            }
        }
    }

    @Override // androidx.media3.datasource.j
    public final long e(o oVar) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = oVar.f48245a.normalizeScheme();
            this.f48166f = uriNormalizeScheme;
            m(oVar);
            boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
            ContentResolver contentResolver = this.f48165e;
            if (zEquals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f48167g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f48168h = fileInputStream;
            long j12 = oVar.f48250f;
            if (length != -1 && j12 > length) {
                throw new ContentDataSourceException(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(startOffset + j12) - startOffset;
            if (jSkip != j12) {
                throw new ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f48169i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f48169i = jPosition;
                    if (jPosition < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j13 = length - jSkip;
                this.f48169i = j13;
                if (j13 < 0) {
                    throw new ContentDataSourceException(null, 2008);
                }
            }
            long j14 = oVar.f48251g;
            if (j14 != -1) {
                long j15 = this.f48169i;
                this.f48169i = j15 == -1 ? j14 : Math.min(j15, j14);
            }
            this.f48170j = true;
            n(oVar);
            return j14 != -1 ? j14 : this.f48169i;
        } catch (ContentDataSourceException e12) {
            throw e12;
        } catch (IOException e13) {
            throw new ContentDataSourceException(e13, e13 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // androidx.media3.datasource.j
    @P
    public final Uri getUri() {
        return this.f48166f;
    }

    @Override // androidx.media3.common.InterfaceC23102m
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        if (i13 == 0) {
            return 0;
        }
        long j12 = this.f48169i;
        if (j12 == 0) {
            return -1;
        }
        if (j12 != -1) {
            try {
                i13 = (int) Math.min(j12, i13);
            } catch (IOException e12) {
                throw new ContentDataSourceException(e12, 2000);
            }
        }
        FileInputStream fileInputStream = this.f48168h;
        int i14 = M.f47887a;
        int i15 = fileInputStream.read(bArr, i12, i13);
        if (i15 == -1) {
            return -1;
        }
        long j13 = this.f48169i;
        if (j13 != -1) {
            this.f48169i = j13 - i15;
        }
        k(i15);
        return i15;
    }
}
