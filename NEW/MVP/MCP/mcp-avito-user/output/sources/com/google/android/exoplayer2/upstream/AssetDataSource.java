package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public final class AssetDataSource extends AbstractC36575e {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f347705e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public Uri f347706f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public InputStream f347707g;

    /* renamed from: h, reason: collision with root package name */
    public long f347708h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f347709i;

    public static final class AssetDataSourceException extends DataSourceException {
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f347705e = context.getAssets();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void close() {
        this.f347706f = null;
        try {
            try {
                InputStream inputStream = this.f347707g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e12) {
                throw new AssetDataSourceException(e12, 2000);
            }
        } finally {
            this.f347707g = null;
            if (this.f347709i) {
                this.f347709i = false;
                m();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final long e(p pVar) throws IOException {
        try {
            Uri uri = pVar.f347929a;
            long j12 = pVar.f347934f;
            this.f347706f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            n(pVar);
            InputStream inputStreamOpen = this.f347705e.open(path, 1);
            this.f347707g = inputStreamOpen;
            if (inputStreamOpen.skip(j12) < j12) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j13 = pVar.f347935g;
            if (j13 != -1) {
                this.f347708h = j13;
            } else {
                long jAvailable = this.f347707g.available();
                this.f347708h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f347708h = -1L;
                }
            }
            this.f347709i = true;
            o(pVar);
            return this.f347708h;
        } catch (AssetDataSourceException e12) {
            throw e12;
        } catch (IOException e13) {
            throw new AssetDataSourceException(e13, e13 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    @P
    public final Uri getUri() {
        return this.f347706f;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36580j
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        if (i13 == 0) {
            return 0;
        }
        long j12 = this.f347708h;
        if (j12 == 0) {
            return -1;
        }
        if (j12 != -1) {
            try {
                i13 = (int) Math.min(j12, i13);
            } catch (IOException e12) {
                throw new AssetDataSourceException(e12, 2000);
            }
        }
        InputStream inputStream = this.f347707g;
        int i14 = U.f348106a;
        int i15 = inputStream.read(bArr, i12, i13);
        if (i15 == -1) {
            return -1;
        }
        long j13 = this.f347708h;
        if (j13 != -1) {
            this.f347708h = j13 - i15;
        }
        l(i15);
        return i15;
    }
}
