package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes6.dex */
public final class ContentDataSource extends AbstractC36575e {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f347717e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public Uri f347718f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public AssetFileDescriptor f347719g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public FileInputStream f347720h;

    /* renamed from: i, reason: collision with root package name */
    public long f347721i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f347722j;

    public static class ContentDataSourceException extends DataSourceException {
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f347717e = context.getContentResolver();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void close() {
        this.f347718f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f347720h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f347720h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f347719g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e12) {
                        throw new ContentDataSourceException(e12, 2000);
                    }
                } finally {
                    this.f347719g = null;
                    if (this.f347722j) {
                        this.f347722j = false;
                        m();
                    }
                }
            } catch (IOException e13) {
                throw new ContentDataSourceException(e13, 2000);
            }
        } catch (Throwable th2) {
            this.f347720h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f347719g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f347719g = null;
                    if (this.f347722j) {
                        this.f347722j = false;
                        m();
                    }
                    throw th2;
                } catch (IOException e14) {
                    throw new ContentDataSourceException(e14, 2000);
                }
            } finally {
                this.f347719g = null;
                if (this.f347722j) {
                    this.f347722j = false;
                    m();
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final long e(p pVar) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uri = pVar.f347929a;
            this.f347718f = uri;
            n(pVar);
            boolean zEquals = "content".equals(pVar.f347929a.getScheme());
            ContentResolver contentResolver = this.f347717e;
            if (zEquals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            }
            this.f347719g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f347720h = fileInputStream;
            long j12 = pVar.f347934f;
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
                    this.f347721i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f347721i = jPosition;
                    if (jPosition < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j13 = length - jSkip;
                this.f347721i = j13;
                if (j13 < 0) {
                    throw new ContentDataSourceException(null, 2008);
                }
            }
            long j14 = pVar.f347935g;
            if (j14 != -1) {
                long j15 = this.f347721i;
                this.f347721i = j15 == -1 ? j14 : Math.min(j15, j14);
            }
            this.f347722j = true;
            o(pVar);
            return j14 != -1 ? j14 : this.f347721i;
        } catch (ContentDataSourceException e12) {
            throw e12;
        } catch (IOException e13) {
            throw new ContentDataSourceException(e13, e13 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    @P
    public final Uri getUri() {
        return this.f347718f;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36580j
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        if (i13 == 0) {
            return 0;
        }
        long j12 = this.f347721i;
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
        FileInputStream fileInputStream = this.f347720h;
        int i14 = U.f348106a;
        int i15 = fileInputStream.read(bArr, i12, i13);
        if (i15 == -1) {
            return -1;
        }
        long j13 = this.f347721i;
        if (j13 != -1) {
            this.f347721i = j13 - i15;
        }
        l(i15);
        return i15;
    }
}
