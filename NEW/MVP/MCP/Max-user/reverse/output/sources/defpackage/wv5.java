package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class wv5 extends lj0 {
    public Uri X;
    public long Y;
    public boolean Z;
    public RandomAccessFile o;

    @Override // defpackage.qe4
    public final long R(ye4 ye4Var) throws IOException {
        Uri uri = ye4Var.a;
        long j = ye4Var.f;
        this.X = uri;
        d();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.o = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = ye4Var.g;
                if (length == -1) {
                    length = this.o.length() - j;
                }
                this.Y = length;
                if (length < 0) {
                    throw new FileDataSource$FileDataSourceException(null, null, 2008);
                }
                this.Z = true;
                e(ye4Var);
                return this.Y;
            } catch (IOException e) {
                throw new FileDataSource$FileDataSourceException(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSource$FileDataSourceException(e2, (xxg.a < 21 || !tv5.b(e2.getCause())) ? 2005 : 2006);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbL = wy1.l("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbL.append(fragment);
            throw new FileDataSource$FileDataSourceException(sbL.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new FileDataSource$FileDataSourceException(e3, 2006);
        } catch (RuntimeException e4) {
            throw new FileDataSource$FileDataSourceException(e4, 2000);
        }
    }

    @Override // defpackage.qe4
    public final void close() throws Throwable {
        this.X = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.o;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new FileDataSource$FileDataSourceException(e, 2000);
            }
        } finally {
            this.o = null;
            if (this.Z) {
                this.Z = false;
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
        long j = this.Y;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.o;
            int i3 = xxg.a;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i4 > 0) {
                this.Y -= i4;
                b(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new FileDataSource$FileDataSourceException(e, 2000);
        }
    }
}
