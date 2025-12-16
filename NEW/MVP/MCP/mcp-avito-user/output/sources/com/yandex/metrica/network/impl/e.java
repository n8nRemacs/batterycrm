package com.yandex.metrica.network.impl;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f382396a = new e();

    private e() {
    }

    public static byte[] a(int i12, Y41.a aVar) {
        try {
            InputStream inputStream = (InputStream) aVar.invoke();
            if (inputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[8192];
                        int i13 = 0;
                        while (true) {
                            int i14 = inputStream.read(bArr);
                            if (-1 == i14 || i13 > i12) {
                                break;
                            }
                            if (i14 > 0) {
                                byteArrayOutputStream.write(bArr, 0, i14);
                                i13 += i14;
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        kotlin.io.c.a(byteArrayOutputStream, null);
                        kotlin.io.c.a(inputStream, null);
                        return byteArray;
                    } catch (Throwable unused) {
                        kotlin.io.c.a(byteArrayOutputStream, null);
                        kotlin.io.c.a(inputStream, null);
                    }
                } finally {
                }
            }
        } catch (Throwable unused2) {
        }
        return new byte[0];
    }
}
