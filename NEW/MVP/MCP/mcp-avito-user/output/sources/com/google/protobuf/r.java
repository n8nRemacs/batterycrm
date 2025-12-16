package com.google.protobuf;

/* compiled from: ByteBufferWriter.java */
/* loaded from: classes7.dex */
final class r {
    static {
        Class<?> cls;
        new ThreadLocal();
        try {
            cls = Class.forName("java.io.FileOutputStream");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                if (r1.f362948e) {
                    r1.f362946c.n(cls.getDeclaredField("channel"));
                }
            } catch (Throwable unused2) {
            }
        }
    }
}
