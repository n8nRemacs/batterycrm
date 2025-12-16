package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.e71;
import com.yandex.mobile.ads.impl.vw;
import java.util.ArrayList;
import java.util.Arrays;
import v61.InterfaceC49174e;

/* loaded from: classes8.dex */
final class cr0 extends e71 {

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f384397o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    private static final byte[] f384398p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    private boolean f384399n;

    public static boolean b(pr0 pr0Var) {
        byte[] bArr = f384397o;
        if (pr0Var.a() < 8) {
            return false;
        }
        int iD2 = pr0Var.d();
        byte[] bArr2 = new byte[8];
        pr0Var.a(bArr2, 0, 8);
        pr0Var.e(iD2);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.yandex.mobile.ads.impl.e71
    public final void a(boolean z12) {
        super.a(z12);
        if (z12) {
            this.f384399n = false;
        }
    }

    @Override // com.yandex.mobile.ads.impl.e71
    public final long a(pr0 pr0Var) {
        int i12;
        byte[] bArrC = pr0Var.c();
        byte b12 = bArrC[0];
        int i13 = b12 & 255;
        int i14 = b12 & 3;
        if (i14 != 0) {
            i12 = 2;
            if (i14 != 1 && i14 != 2) {
                i12 = bArrC[1] & 63;
            }
        } else {
            i12 = 1;
        }
        int i15 = i13 >> 3;
        return b(i12 * (i15 >= 16 ? 2500 << r0 : i15 >= 12 ? 10000 << (i15 & 1) : (i15 & 3) == 3 ? 60000 : 10000 << r0));
    }

    @Override // com.yandex.mobile.ads.impl.e71
    @InterfaceC49174e
    public final boolean a(pr0 pr0Var, long j12, e71.a aVar) {
        boolean zEquals;
        boolean zEquals2;
        byte[] bArr = f384397o;
        if (pr0Var.a() < 8) {
            zEquals = false;
        } else {
            int iD2 = pr0Var.d();
            byte[] bArr2 = new byte[8];
            pr0Var.a(bArr2, 0, 8);
            pr0Var.e(iD2);
            zEquals = Arrays.equals(bArr2, bArr);
        }
        if (zEquals) {
            byte[] bArrCopyOf = Arrays.copyOf(pr0Var.c(), pr0Var.e());
            int i12 = bArrCopyOf[9] & 255;
            ArrayList arrayListA = dr0.a(bArrCopyOf);
            if (aVar.f384810a != null) {
                return true;
            }
            aVar.f384810a = new vw.a().f("audio/opus").c(i12).n(48000).a(arrayListA).a();
            return true;
        }
        byte[] bArr3 = f384398p;
        if (pr0Var.a() < 8) {
            zEquals2 = false;
        } else {
            int iD3 = pr0Var.d();
            byte[] bArr4 = new byte[8];
            pr0Var.a(bArr4, 0, 8);
            pr0Var.e(iD3);
            zEquals2 = Arrays.equals(bArr4, bArr3);
        }
        if (zEquals2) {
            db.b(aVar.f384810a);
            if (this.f384399n) {
                return true;
            }
            this.f384399n = true;
            pr0Var.f(8);
            Metadata metadataA = zk1.a(com.yandex.mobile.ads.embedded.guava.collect.p.b(zk1.a(pr0Var, false, false).f392277a));
            if (metadataA == null) {
                return true;
            }
            aVar.f384810a = aVar.f384810a.a().a(metadataA.a(aVar.f384810a.f391179j)).a();
            return true;
        }
        db.b(aVar.f384810a);
        return false;
    }
}
