package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.common.C23088b;
import com.adjust.sdk.network.ErrorCodes;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import com.google.android.exoplayer2.util.U;
import j.InterfaceC42164u;
import j.P;
import j.X;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes6.dex */
public final class FileDataSource extends AbstractC36575e {

    /* renamed from: e, reason: collision with root package name */
    @P
    public RandomAccessFile f347728e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public Uri f347729f;

    /* renamed from: g, reason: collision with root package name */
    public long f347730g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f347731h;

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

    public static final class b implements InterfaceC36583m.a {
        @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m.a
        public final InterfaceC36583m a() {
            return new FileDataSource();
        }
    }

    public FileDataSource() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void close() {
        this.f347729f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f347728e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e12) {
                throw new FileDataSourceException(e12, 2000);
            }
        } finally {
            this.f347728e = null;
            if (this.f347731h) {
                this.f347731h = false;
                m();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final long e(p pVar) throws IOException {
        Uri uri = pVar.f347929a;
        long j12 = pVar.f347934f;
        this.f347729f = uri;
        n(pVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f347728e = randomAccessFile;
            try {
                randomAccessFile.seek(j12);
                long length = pVar.f347935g;
                if (length == -1) {
                    length = this.f347728e.length() - j12;
                }
                this.f347730g = length;
                if (length < 0) {
                    throw new FileDataSourceException(2008, null, null);
                }
                this.f347731h = true;
                o(pVar);
                return this.f347730g;
            } catch (IOException e12) {
                throw new FileDataSourceException(e12, 2000);
            }
        } catch (FileNotFoundException e13) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e13, (U.f348106a < 21 || !a.b(e13.getCause())) ? 2005 : 2006);
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

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    @P
    public final Uri getUri() {
        return this.f347729f;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36580j
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        if (i13 == 0) {
            return 0;
        }
        long j12 = this.f347730g;
        if (j12 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f347728e;
            int i14 = U.f348106a;
            int i15 = randomAccessFile.read(bArr, i12, (int) Math.min(j12, i13));
            if (i15 > 0) {
                this.f347730g -= i15;
                l(i15);
            }
            return i15;
        } catch (IOException e12) {
            throw new FileDataSourceException(e12, 2000);
        }
    }
}
