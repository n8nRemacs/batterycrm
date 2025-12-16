package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.common.C23088b;
import com.adjust.sdk.network.ErrorCodes;
import com.yandex.mobile.ads.impl.gn;
import j.InterfaceC42164u;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes8.dex */
public final class wv extends we {

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private RandomAccessFile f391495e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private Uri f391496f;

    /* renamed from: g, reason: collision with root package name */
    private long f391497g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f391498h;

    @j.X
    public static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC42164u
        public static boolean b(@j.P Throwable th2) {
            return (th2 instanceof ErrnoException) && ((ErrnoException) th2).errno == OsConstants.EACCES;
        }
    }

    public static final class b implements gn.a {
        @Override // com.yandex.mobile.ads.impl.gn.a
        public final gn a() {
            return new wv();
        }
    }

    public static class c extends hn {
        public c(Exception exc, int i12) {
            super(exc, i12);
        }

        public c(int i12, @j.P String str, @j.P FileNotFoundException fileNotFoundException) {
            super(i12, str, fileNotFoundException);
        }
    }

    public wv() {
        super(false);
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final long a(kn knVar) throws IOException {
        Uri uri = knVar.f387192a;
        this.f391496f = uri;
        b(knVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f391495e = randomAccessFile;
            try {
                randomAccessFile.seek(knVar.f387197f);
                long length = knVar.f387198g;
                if (length == -1) {
                    length = this.f391495e.length() - knVar.f387197f;
                }
                this.f391497g = length;
                if (length < 0) {
                    throw new c(2008, null, null);
                }
                this.f391498h = true;
                c(knVar);
                return this.f391497g;
            } catch (IOException e12) {
                throw new c(e12, 2000);
            }
        } catch (FileNotFoundException e13) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new c(e13, (pc1.f388768a < 21 || !a.b(e13.getCause())) ? 2005 : 2006);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbB = C23088b.b("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbB.append(fragment);
            throw new c(ErrorCodes.PROTOCOL_EXCEPTION, sbB.toString(), e13);
        } catch (SecurityException e14) {
            throw new c(e14, 2006);
        } catch (RuntimeException e15) {
            throw new c(e15, 2000);
        }
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final void close() {
        this.f391496f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f391495e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e12) {
                throw new c(e12, 2000);
            }
        } finally {
            this.f391495e = null;
            if (this.f391498h) {
                this.f391498h = false;
                f();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.gn
    @j.P
    public final Uri d() {
        return this.f391496f;
    }

    @Override // com.yandex.mobile.ads.impl.dn
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        if (i13 == 0) {
            return 0;
        }
        long j12 = this.f391497g;
        if (j12 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f391495e;
            int i14 = pc1.f388768a;
            int i15 = randomAccessFile.read(bArr, i12, (int) Math.min(j12, i13));
            if (i15 > 0) {
                this.f391497g -= i15;
                c(i15);
            }
            return i15;
        } catch (IOException e12) {
            throw new c(e12, 2000);
        }
    }
}
