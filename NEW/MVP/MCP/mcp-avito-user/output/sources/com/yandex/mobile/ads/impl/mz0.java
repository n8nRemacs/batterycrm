package com.yandex.mobile.ads.impl;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import okio.C44802l;
import okio.InterfaceC44804n;

/* loaded from: classes8.dex */
public abstract class mz0 implements Closeable {

    public static final class a {
        public /* synthetic */ a(int i12) {
            this();
        }

        public static lz0 a(byte[] bArr) {
            C44802l c44802l = new C44802l();
            c44802l.write(bArr, 0, bArr.length);
            return new lz0(bArr.length, null, c44802l);
        }

        private a() {
        }
    }

    static {
        new a(0);
    }

    @Y61.k
    public final InputStream a() {
        return d().s6();
    }

    public abstract long b();

    @Y61.l
    public abstract pd0 c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        qc1.a((Closeable) d());
    }

    @Y61.k
    public abstract InterfaceC44804n d();
}
