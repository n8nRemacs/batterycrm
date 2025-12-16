package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.common.C23088b;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.datasource.j;
import com.adjust.sdk.network.ErrorCodes;
import j.InterfaceC42164u;
import j.P;
import j.X;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

@J
/* loaded from: classes.dex */
public final class FileDataSource extends d {

    /* renamed from: e, reason: collision with root package name */
    @P
    public RandomAccessFile f48173e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public Uri f48174f;

    /* renamed from: g, reason: collision with root package name */
    public long f48175g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f48176h;

    public static class FileDataSourceException extends DataSourceException {
    }

    @X
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC42164u
        public static boolean b(@P Throwable th2) {
            return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
        }
    }

    public static final class b implements j.a {
        @Override // androidx.media3.datasource.j.a
        public final j a() {
            return new FileDataSource();
        }
    }

    public FileDataSource() {
        super(false);
    }

    @Override // androidx.media3.datasource.j
    public final void close() {
        this.f48174f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f48173e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e12) {
                throw new FileDataSourceException(e12, 2000);
            }
        } finally {
            this.f48173e = null;
            if (this.f48176h) {
                this.f48176h = false;
                l();
            }
        }
    }

    @Override // androidx.media3.datasource.j
    public final long e(o oVar) throws IOException {
        Uri uri = oVar.f48245a;
        long j12 = oVar.f48250f;
        this.f48174f = uri;
        m(oVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f48173e = randomAccessFile;
            try {
                randomAccessFile.seek(j12);
                long length = oVar.f48251g;
                if (length == -1) {
                    length = this.f48173e.length() - j12;
                }
                this.f48175g = length;
                if (length < 0) {
                    throw new FileDataSourceException(2008, null, null);
                }
                this.f48176h = true;
                n(oVar);
                return this.f48175g;
            } catch (IOException e12) {
                throw new FileDataSourceException(e12, 2000);
            }
        } catch (FileNotFoundException e13) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e13, (M.f47887a < 21 || !a.b(e13.getCause())) ? 2005 : 2006);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbB = C23088b.b("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbB.append(fragment);
            throw new FileDataSourceException(ErrorCodes.PROTOCOL_EXCEPTION, sbB.toString(), e13);
        } catch (SecurityException e14) {
            throw new FileDataSourceException(e14, 2006);
        } catch (RuntimeException e15) {
            throw new FileDataSourceException(e15, 2000);
        }
    }

    @Override // androidx.media3.datasource.j
    @P
    public final Uri getUri() {
        return this.f48174f;
    }

    @Override // androidx.media3.common.InterfaceC23102m
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        if (i13 == 0) {
            return 0;
        }
        long j12 = this.f48175g;
        if (j12 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f48173e;
            int i14 = M.f47887a;
            int i15 = randomAccessFile.read(bArr, i12, (int) Math.min(j12, i13));
            if (i15 > 0) {
                this.f48175g -= i15;
                k(i15);
            }
            return i15;
        } catch (IOException e12) {
            throw new FileDataSourceException(e12, 2000);
        }
    }
}
