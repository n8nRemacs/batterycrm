package com.facebook.imagepipeline.nativecode;

import cX0.C27118a;
import cX0.C27119b;
import cX0.C27122e;
import cX0.InterfaceC27120c;
import com.facebook.common.internal.j;
import com.facebook.common.internal.o;
import com.facebook.infer.annotation.Nullsafe;
import j.k0;
import java.io.InputStream;
import java.io.OutputStream;
import wW0.i;

@com.facebook.common.internal.g
@Nullsafe
/* loaded from: classes13.dex */
public class NativeJpegTranscoder implements InterfaceC27120c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f340496a;

    /* renamed from: b, reason: collision with root package name */
    public int f340497b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f340498c;

    @k0
    public static void e(InputStream inputStream, i iVar, int i12, int i13, int i14) {
        e.a();
        if (!(i13 >= 1)) {
            throw new IllegalArgumentException();
        }
        if (!(i13 <= 16)) {
            throw new IllegalArgumentException();
        }
        if (!(i14 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i14 <= 100)) {
            throw new IllegalArgumentException();
        }
        j<Integer> jVar = C27122e.f57919a;
        if (!(i12 >= 0 && i12 <= 270 && i12 % 90 == 0)) {
            throw new IllegalArgumentException();
        }
        o.b("no transformation requested", (i13 == 8 && i12 == 0) ? false : true);
        iVar.getClass();
        nativeTranscodeJpeg(inputStream, iVar, i12, i13, i14);
    }

    @k0
    public static void f(InputStream inputStream, i iVar, int i12, int i13, int i14) {
        boolean z12;
        e.a();
        if (!(i13 >= 1)) {
            throw new IllegalArgumentException();
        }
        if (!(i13 <= 16)) {
            throw new IllegalArgumentException();
        }
        if (!(i14 >= 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i14 <= 100)) {
            throw new IllegalArgumentException();
        }
        j<Integer> jVar = C27122e.f57919a;
        switch (i12) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z12 = true;
                break;
            default:
                z12 = false;
                break;
        }
        if (!z12) {
            throw new IllegalArgumentException();
        }
        o.b("no transformation requested", (i13 == 8 && i12 == 1) ? false : true);
        iVar.getClass();
        nativeTranscodeJpegWithExifOrientation(inputStream, iVar, i12, i13, i14);
    }

    @com.facebook.common.internal.g
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i12, int i13, int i14);

    @com.facebook.common.internal.g
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i12, int i13, int i14);

    @Override // cX0.InterfaceC27120c
    public final String a() {
        return "NativeJpegTranscoder";
    }

    @Override // cX0.InterfaceC27120c
    public final C27119b b(YW0.d dVar, i iVar, @I41.h UW0.e eVar, @I41.h UW0.d dVar2) throws Throwable {
        Integer num = 85;
        if (eVar == null) {
            eVar = UW0.e.f16416b;
        }
        int iA2 = C27118a.a(eVar, dVar2, dVar, this.f340497b);
        try {
            int iC2 = C27122e.c(eVar, dVar2, dVar, this.f340496a);
            int iMax = Math.max(1, 8 / iA2);
            if (this.f340498c) {
                iC2 = iMax;
            }
            InputStream inputStreamF = dVar.f();
            j<Integer> jVar = C27122e.f57919a;
            dVar.m();
            if (jVar.contains(Integer.valueOf(dVar.f19501e))) {
                int iA3 = C27122e.a(eVar, dVar);
                o.c(inputStreamF, "Cannot transcode from null input stream!");
                f(inputStreamF, iVar, iA3, iC2, num.intValue());
            } else {
                int iB2 = C27122e.b(eVar, dVar);
                o.c(inputStreamF, "Cannot transcode from null input stream!");
                e(inputStreamF, iVar, iB2, iC2, num.intValue());
            }
            com.facebook.common.internal.e.b(inputStreamF);
            return new C27119b(iA2 != 1 ? 0 : 1);
        } catch (Throwable th2) {
            com.facebook.common.internal.e.b(null);
            throw th2;
        }
    }

    @Override // cX0.InterfaceC27120c
    public final boolean c(RW0.c cVar) {
        return cVar == RW0.b.f14495a;
    }

    @Override // cX0.InterfaceC27120c
    public final boolean d(YW0.d dVar, @I41.h UW0.e eVar, @I41.h UW0.d dVar2) {
        if (eVar == null) {
            eVar = UW0.e.f16416b;
        }
        return C27122e.c(eVar, dVar2, dVar, this.f340496a) < 8;
    }
}
