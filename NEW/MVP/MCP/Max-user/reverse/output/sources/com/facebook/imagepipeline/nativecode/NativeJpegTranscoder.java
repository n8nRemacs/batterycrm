package com.facebook.imagepipeline.nativecode;

import android.graphics.ColorSpace;
import defpackage.ce5;
import defpackage.fz4;
import defpackage.jca;
import defpackage.l16;
import defpackage.l5j;
import defpackage.lv7;
import defpackage.me7;
import defpackage.mn4;
import defpackage.n9j;
import defpackage.of9;
import defpackage.sz;
import defpackage.tf7;
import defpackage.xc3;
import defpackage.ynd;
import defpackage.ysd;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@fz4
/* loaded from: classes.dex */
public class NativeJpegTranscoder implements tf7 {
    public boolean a;
    public int b;
    public boolean c;

    public static void e(InputStream inputStream, of9 of9Var, int i, int i2, int i3) throws IOException {
        jca.e();
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException();
        }
        if (!(i2 <= 16)) {
            throw new IllegalArgumentException();
        }
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i3 <= 100)) {
            throw new IllegalArgumentException();
        }
        sz szVar = lv7.a;
        if (!(i >= 0 && i <= 270 && i % 90 == 0)) {
            throw new IllegalArgumentException();
        }
        l5j.b("no transformation requested", (i2 == 8 && i == 0) ? false : true);
        nativeTranscodeJpeg(inputStream, of9Var, i, i2, i3);
    }

    public static void f(InputStream inputStream, of9 of9Var, int i, int i2, int i3) throws IOException {
        boolean z;
        jca.e();
        if (!(i2 >= 1)) {
            throw new IllegalArgumentException();
        }
        if (!(i2 <= 16)) {
            throw new IllegalArgumentException();
        }
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i3 <= 100)) {
            throw new IllegalArgumentException();
        }
        sz szVar = lv7.a;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            throw new IllegalArgumentException();
        }
        l5j.b("no transformation requested", (i2 == 8 && i == 1) ? false : true);
        nativeTranscodeJpegWithExifOrientation(inputStream, of9Var, i, i2, i3);
    }

    @fz4
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @fz4
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @Override // defpackage.tf7
    public final String a() {
        return "NativeJpegTranscoder";
    }

    @Override // defpackage.tf7
    public final l16 b(ce5 ce5Var, of9 of9Var, ysd ysdVar, ynd yndVar, ColorSpace colorSpace) throws IOException {
        Integer num = 85;
        if (ysdVar == null) {
            ysdVar = ysd.c;
        }
        int iA = n9j.a(ysdVar, yndVar, ce5Var, this.b);
        try {
            int iC = lv7.c(ysdVar, yndVar, ce5Var, this.a);
            int iMax = Math.max(1, 8 / iA);
            if (this.c) {
                iC = iMax;
            }
            InputStream inputStreamW = ce5Var.w();
            sz szVar = lv7.a;
            ce5Var.i0();
            if (szVar.contains(Integer.valueOf(ce5Var.d))) {
                int iA2 = lv7.a(ysdVar, ce5Var);
                l5j.e(inputStreamW, "Cannot transcode from null input stream!");
                f(inputStreamW, of9Var, iA2, iC, num.intValue());
            } else {
                int iB = lv7.b(ysdVar, ce5Var);
                l5j.e(inputStreamW, "Cannot transcode from null input stream!");
                e(inputStreamW, of9Var, iB, iC, num.intValue());
            }
            xc3.b(inputStreamW);
            return new l16(iA != 1 ? 0 : 1, 8);
        } catch (Throwable th) {
            xc3.b(null);
            throw th;
        }
    }

    @Override // defpackage.tf7
    public final boolean c(me7 me7Var) {
        return me7Var == mn4.a;
    }

    @Override // defpackage.tf7
    public final boolean d(ce5 ce5Var, ysd ysdVar, ynd yndVar) {
        if (ysdVar == null) {
            ysdVar = ysd.c;
        }
        return lv7.c(ysdVar, yndVar, ce5Var, this.a) < 8;
    }
}
