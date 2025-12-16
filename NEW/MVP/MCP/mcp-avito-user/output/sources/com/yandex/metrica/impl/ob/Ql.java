package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.Compressor;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.util.zip.GZIPInputStream;

/* loaded from: classes7.dex */
public class Ql implements Compressor {
    @Override // com.yandex.metrica.networktasks.api.Compressor
    @j.P
    public byte[] compress(@j.P byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return L0.b(bArr);
    }

    @j.P
    public byte[] uncompress(@j.P byte[] bArr) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        Throwable th2;
        GZIPInputStream gZIPInputStream;
        if (bArr == null) {
            return null;
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    byte[] bArrA = L0.a(gZIPInputStream);
                    A2.a((Closeable) gZIPInputStream);
                    A2.a((Closeable) byteArrayInputStream);
                    return bArrA;
                } catch (Throwable th3) {
                    th2 = th3;
                    A2.a((Closeable) gZIPInputStream);
                    A2.a((Closeable) byteArrayInputStream);
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
                gZIPInputStream = null;
            }
        } catch (Throwable th5) {
            byteArrayInputStream = null;
            th2 = th5;
            gZIPInputStream = null;
        }
    }
}
