package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class wt extends lj0 {
    public Uri X;
    public InputStream Y;
    public long Z;
    public final AssetManager o;
    public boolean s0;

    public wt(Context context) {
        super(false);
        this.o = context.getAssets();
    }

    @Override // defpackage.qe4
    public final long R(ye4 ye4Var) throws IOException {
        try {
            Uri uri = ye4Var.a;
            long j = ye4Var.f;
            this.X = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            d();
            InputStream inputStreamOpen = this.o.open(path, 1);
            this.Y = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new AssetDataSource$AssetDataSourceException(null, 2008);
            }
            long j2 = ye4Var.g;
            if (j2 != -1) {
                this.Z = j2;
            } else {
                long jAvailable = this.Y.available();
                this.Z = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.Z = -1L;
                }
            }
            this.s0 = true;
            e(ye4Var);
            return this.Z;
        } catch (AssetDataSource$AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssetDataSource$AssetDataSourceException(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // defpackage.qe4
    public final void close() throws Throwable {
        this.X = null;
        try {
            try {
                InputStream inputStream = this.Y;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new AssetDataSource$AssetDataSourceException(e, 2000);
            }
        } finally {
            this.Y = null;
            if (this.s0) {
                this.s0 = false;
                c();
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
        long j = this.Z;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new AssetDataSource$AssetDataSourceException(e, 2000);
                }
            }
            InputStream inputStream = this.Y;
            int i3 = xxg.a;
            int i4 = inputStream.read(bArr, i, i2);
            if (i4 != -1) {
                long j2 = this.Z;
                if (j2 != -1) {
                    this.Z = j2 - i4;
                }
                b(i4);
                return i4;
            }
        }
        return -1;
    }
}
