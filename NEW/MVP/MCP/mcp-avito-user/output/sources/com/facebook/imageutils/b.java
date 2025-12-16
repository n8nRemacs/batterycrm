package com.facebook.imageutils;

import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.io.InputStream;
import uW0.C48986a;

/* compiled from: TiffUtil.java */
@Nullsafe
/* loaded from: classes15.dex */
class b {

    /* compiled from: TiffUtil.java */
    /* renamed from: com.facebook.imageutils.b$b, reason: collision with other inner class name */
    public static class C10541b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f340821a;

        /* renamed from: b, reason: collision with root package name */
        public int f340822b;

        public C10541b() {
        }
    }

    public static int a(int i12, InputStream inputStream) throws IOException {
        int i13;
        int i14;
        C10541b c10541b = new C10541b();
        if (i12 > 8) {
            int iA2 = com.facebook.imageutils.a.a(inputStream, 4, false);
            if (iA2 == 1229531648 || iA2 == 1296891946) {
                boolean z12 = iA2 == 1229531648;
                c10541b.f340821a = z12;
                int iA3 = com.facebook.imageutils.a.a(inputStream, 4, z12);
                c10541b.f340822b = iA3;
                i13 = i12 - 8;
                if (iA3 < 8 || iA3 - 8 > i13) {
                    C48986a.a(b.class, "Invalid offset");
                }
            } else {
                C48986a.a(b.class, "Invalid TIFF header");
            }
            i13 = 0;
        } else {
            i13 = 0;
        }
        int i15 = c10541b.f340822b - 8;
        if (i13 == 0 || i15 > i13) {
            return 0;
        }
        inputStream.skip(i15);
        int i16 = i13 - i15;
        boolean z13 = c10541b.f340821a;
        if (i16 < 14) {
            i14 = 0;
        } else {
            int iA4 = com.facebook.imageutils.a.a(inputStream, 2, z13);
            int i17 = i16 - 2;
            while (true) {
                int i18 = iA4 - 1;
                if (iA4 <= 0 || i17 < 12) {
                    break;
                }
                i14 = i17 - 2;
                if (com.facebook.imageutils.a.a(inputStream, 2, z13) == 274) {
                    break;
                }
                inputStream.skip(10L);
                i17 -= 12;
                iA4 = i18;
            }
        }
        boolean z14 = c10541b.f340821a;
        if (i14 >= 10 && com.facebook.imageutils.a.a(inputStream, 2, z14) == 3 && com.facebook.imageutils.a.a(inputStream, 4, z14) == 1) {
            return com.facebook.imageutils.a.a(inputStream, 2, z14);
        }
        return 0;
    }
}
