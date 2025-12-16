package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.yg;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes8.dex */
public final class bh implements fn {

    /* renamed from: a, reason: collision with root package name */
    private final yg f383951a;

    /* renamed from: b, reason: collision with root package name */
    private final long f383952b = 5242880;

    /* renamed from: c, reason: collision with root package name */
    private final int f383953c = 20480;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private kn f383954d;

    /* renamed from: e, reason: collision with root package name */
    private long f383955e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private File f383956f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private OutputStream f383957g;

    /* renamed from: h, reason: collision with root package name */
    private long f383958h;

    /* renamed from: i, reason: collision with root package name */
    private long f383959i;

    /* renamed from: j, reason: collision with root package name */
    private xz0 f383960j;

    public static final class a extends yg.a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private yg f383961a;

        public final b a(yg ygVar) {
            this.f383961a = ygVar;
            return this;
        }

        public final bh a() {
            yg ygVar = this.f383961a;
            ygVar.getClass();
            return new bh(ygVar);
        }
    }

    public bh(yg ygVar) {
        this.f383951a = (yg) db.a(ygVar);
    }

    private void b(kn knVar) {
        long j12 = knVar.f387198g;
        long jMin = j12 != -1 ? Math.min(j12 - this.f383959i, this.f383955e) : -1L;
        yg ygVar = this.f383951a;
        String str = knVar.f387199h;
        int i12 = pc1.f388768a;
        this.f383956f = ygVar.a(str, knVar.f387197f + this.f383959i, jMin);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f383956f);
        if (this.f383953c > 0) {
            xz0 xz0Var = this.f383960j;
            if (xz0Var == null) {
                this.f383960j = new xz0(fileOutputStream, this.f383953c);
            } else {
                xz0Var.a(fileOutputStream);
            }
            this.f383957g = this.f383960j;
        } else {
            this.f383957g = fileOutputStream;
        }
        this.f383958h = 0L;
    }

    @Override // com.yandex.mobile.ads.impl.fn
    public final void a(kn knVar) throws a {
        knVar.f387199h.getClass();
        if (knVar.f387198g == -1 && knVar.a(2)) {
            this.f383954d = null;
            return;
        }
        this.f383954d = knVar;
        this.f383955e = knVar.a(4) ? this.f383952b : Long.MAX_VALUE;
        this.f383959i = 0L;
        try {
            b(knVar);
        } catch (IOException e12) {
            throw new a(e12);
        }
    }

    @Override // com.yandex.mobile.ads.impl.fn
    public final void close() throws a {
        if (this.f383954d == null) {
            return;
        }
        try {
            OutputStream outputStream = this.f383957g;
            if (outputStream == null) {
                return;
            }
            try {
                outputStream.flush();
                pc1.a((Closeable) this.f383957g);
                this.f383957g = null;
                File file = this.f383956f;
                this.f383956f = null;
                this.f383951a.a(file, this.f383958h);
            } catch (Throwable th2) {
                pc1.a((Closeable) this.f383957g);
                this.f383957g = null;
                File file2 = this.f383956f;
                this.f383956f = null;
                file2.delete();
                throw th2;
            }
        } catch (IOException e12) {
            throw new a(e12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.fn
    public final void write(byte[] bArr, int i12, int i13) throws IOException {
        kn knVar = this.f383954d;
        if (knVar == null) {
            return;
        }
        int i14 = 0;
        while (i14 < i13) {
            try {
                if (this.f383958h == this.f383955e) {
                    OutputStream outputStream = this.f383957g;
                    if (outputStream != null) {
                        try {
                            outputStream.flush();
                            pc1.a((Closeable) this.f383957g);
                            this.f383957g = null;
                            File file = this.f383956f;
                            this.f383956f = null;
                            this.f383951a.a(file, this.f383958h);
                        } finally {
                        }
                    }
                    b(knVar);
                }
                int iMin = (int) Math.min(i13 - i14, this.f383955e - this.f383958h);
                OutputStream outputStream2 = this.f383957g;
                int i15 = pc1.f388768a;
                outputStream2.write(bArr, i12 + i14, iMin);
                i14 += iMin;
                long j12 = iMin;
                this.f383958h += j12;
                this.f383959i += j12;
            } catch (IOException e12) {
                throw new a(e12);
            }
        }
    }
}
