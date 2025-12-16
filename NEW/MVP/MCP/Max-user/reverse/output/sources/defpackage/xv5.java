package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class xv5 extends mj0 {
    public Uri X;
    public long Y;
    public boolean Z;
    public RandomAccessFile o;

    @Override // defpackage.se4
    public final long H(ze4 ze4Var) throws IOException {
        Uri uri = ze4Var.a;
        long j = ze4Var.f;
        this.X = uri;
        d(ze4Var);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.o = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = ze4Var.g;
                if (length == -1) {
                    length = this.o.length() - j;
                }
                this.Y = length;
                if (length < 0) {
                    throw new FileDataSource$FileDataSourceException(null, null, 2008);
                }
                this.Z = true;
                e(ze4Var);
                return this.Y;
            } catch (IOException e) {
                throw new FileDataSource$FileDataSourceException(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSource$FileDataSourceException(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
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

    @Override // defpackage.se4
    public final void close() {
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

    @Override // defpackage.se4
    public final Uri getUri() {
        return this.X;
    }

    @Override // defpackage.ke4
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
            String str = zxg.a;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.Y -= i3;
                b(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new FileDataSource$FileDataSourceException(e, 2000);
        }
    }
}
