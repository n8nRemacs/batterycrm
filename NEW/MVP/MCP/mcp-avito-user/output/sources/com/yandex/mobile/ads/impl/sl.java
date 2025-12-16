package com.yandex.mobile.ads.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes8.dex */
public final class sl extends we {

    /* renamed from: e, reason: collision with root package name */
    private final ContentResolver f389975e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private Uri f389976f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private AssetFileDescriptor f389977g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private FileInputStream f389978h;

    /* renamed from: i, reason: collision with root package name */
    private long f389979i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f389980j;

    public static class a extends hn {
        public a(@j.P IOException iOException, int i12) {
            super(iOException, i12);
        }
    }

    public sl(Context context) {
        super(false);
        this.f389975e = context.getContentResolver();
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final long a(kn knVar) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uri = knVar.f387192a;
            this.f389976f = uri;
            b(knVar);
            if ("content".equals(knVar.f387192a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f389975e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f389975e.openAssetFileDescriptor(uri, "r");
            }
            this.f389977g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + uri), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f389978h = fileInputStream;
            if (length != -1 && knVar.f387197f > length) {
                throw new a(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(knVar.f387197f + startOffset) - startOffset;
            if (jSkip != knVar.f387197f) {
                throw new a(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f389979i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f389979i = jPosition;
                    if (jPosition < 0) {
                        throw new a(null, 2008);
                    }
                }
            } else {
                long j12 = length - jSkip;
                this.f389979i = j12;
                if (j12 < 0) {
                    throw new a(null, 2008);
                }
            }
            long jMin = knVar.f387198g;
            if (jMin != -1) {
                long j13 = this.f389979i;
                if (j13 != -1) {
                    jMin = Math.min(j13, jMin);
                }
                this.f389979i = jMin;
            }
            this.f389980j = true;
            c(knVar);
            long j14 = knVar.f387198g;
            return j14 != -1 ? j14 : this.f389979i;
        } catch (a e12) {
            throw e12;
        } catch (IOException e13) {
            throw new a(e13, e13 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final void close() {
        this.f389976f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f389978h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f389978h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f389977g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e12) {
                        throw new a(e12, 2000);
                    }
                } finally {
                    this.f389977g = null;
                    if (this.f389980j) {
                        this.f389980j = false;
                        f();
                    }
                }
            } catch (IOException e13) {
                throw new a(e13, 2000);
            }
        } catch (Throwable th2) {
            this.f389978h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f389977g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f389977g = null;
                    if (this.f389980j) {
                        this.f389980j = false;
                        f();
                    }
                    throw th2;
                } catch (IOException e14) {
                    throw new a(e14, 2000);
                }
            } finally {
                this.f389977g = null;
                if (this.f389980j) {
                    this.f389980j = false;
                    f();
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.gn
    @j.P
    public final Uri d() {
        return this.f389976f;
    }

    @Override // com.yandex.mobile.ads.impl.dn
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        if (i13 == 0) {
            return 0;
        }
        long j12 = this.f389979i;
        if (j12 == 0) {
            return -1;
        }
        if (j12 != -1) {
            try {
                i13 = (int) Math.min(j12, i13);
            } catch (IOException e12) {
                throw new a(e12, 2000);
            }
        }
        FileInputStream fileInputStream = this.f389978h;
        int i14 = pc1.f388768a;
        int i15 = fileInputStream.read(bArr, i12, i13);
        if (i15 == -1) {
            return -1;
        }
        long j13 = this.f389979i;
        if (j13 != -1) {
            this.f389979i = j13 - i15;
        }
        c(i15);
        return i15;
    }
}
