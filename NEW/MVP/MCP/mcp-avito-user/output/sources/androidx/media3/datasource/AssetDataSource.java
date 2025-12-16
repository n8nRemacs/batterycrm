package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@J
/* loaded from: classes.dex */
public final class AssetDataSource extends d {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f48160e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public Uri f48161f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public InputStream f48162g;

    /* renamed from: h, reason: collision with root package name */
    public long f48163h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f48164i;

    public static final class AssetDataSourceException extends DataSourceException {
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f48160e = context.getAssets();
    }

    @Override // androidx.media3.datasource.j
    public final void close() {
        this.f48161f = null;
        try {
            try {
                InputStream inputStream = this.f48162g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e12) {
                throw new AssetDataSourceException(e12, 2000);
            }
        } finally {
            this.f48162g = null;
            if (this.f48164i) {
                this.f48164i = false;
                l();
            }
        }
    }

    @Override // androidx.media3.datasource.j
    public final long e(o oVar) throws IOException {
        try {
            Uri uri = oVar.f48245a;
            long j12 = oVar.f48250f;
            this.f48161f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m(oVar);
            InputStream inputStreamOpen = this.f48160e.open(path, 1);
            this.f48162g = inputStreamOpen;
            if (inputStreamOpen.skip(j12) < j12) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j13 = oVar.f48251g;
            if (j13 != -1) {
                this.f48163h = j13;
            } else {
                long jAvailable = this.f48162g.available();
                this.f48163h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f48163h = -1L;
                }
            }
            this.f48164i = true;
            n(oVar);
            return this.f48163h;
        } catch (AssetDataSourceException e12) {
            throw e12;
        } catch (IOException e13) {
            throw new AssetDataSourceException(e13, e13 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // androidx.media3.datasource.j
    @P
    public final Uri getUri() {
        return this.f48161f;
    }

    @Override // androidx.media3.common.InterfaceC23102m
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        if (i13 == 0) {
            return 0;
        }
        long j12 = this.f48163h;
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
        InputStream inputStream = this.f48162g;
        int i14 = M.f47887a;
        int i15 = inputStream.read(bArr, i12, i13);
        if (i15 == -1) {
            return -1;
        }
        long j13 = this.f48163h;
        if (j13 != -1) {
            this.f48163h = j13 - i15;
        }
        k(i15);
        return i15;
    }
}
