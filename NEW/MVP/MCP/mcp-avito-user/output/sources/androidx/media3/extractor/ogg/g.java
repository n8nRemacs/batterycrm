package androidx.media3.extractor.ogg;

import androidx.media3.common.C23108t;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.z;
import androidx.media3.extractor.E;
import androidx.media3.extractor.M;
import androidx.media3.extractor.ogg.h;
import com.google.common.collect.AbstractC37401r1;
import java.util.ArrayList;
import java.util.Arrays;
import v61.InterfaceC49174e;

/* compiled from: OpusReader.java */
/* loaded from: classes.dex */
final class g extends h {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f51117o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f51118p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f51119n;

    public static boolean e(z zVar, byte[] bArr) {
        if (zVar.a() < bArr.length) {
            return false;
        }
        int i12 = zVar.f47963b;
        byte[] bArr2 = new byte[bArr.length];
        zVar.e(0, bArr.length, bArr2);
        zVar.F(i12);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // androidx.media3.extractor.ogg.h
    public final long b(z zVar) {
        byte[] bArr = zVar.f47962a;
        return (this.f51128i * E.b(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // androidx.media3.extractor.ogg.h
    @InterfaceC49174e
    public final boolean c(z zVar, long j12, h.b bVar) {
        if (e(zVar, f51117o)) {
            byte[] bArrCopyOf = Arrays.copyOf(zVar.f47962a, zVar.f47964c);
            int i12 = bArrCopyOf[9] & 255;
            ArrayList arrayListA = E.a(bArrCopyOf);
            if (bVar.f51133a != null) {
                return true;
            }
            C23108t.b bVar2 = new C23108t.b();
            bVar2.f47787k = "audio/opus";
            bVar2.f47800x = i12;
            bVar2.f47801y = 48000;
            bVar2.f47789m = arrayListA;
            bVar.f51133a = bVar2.a();
            return true;
        }
        if (!e(zVar, f51118p)) {
            C23110a.h(bVar.f51133a);
            return false;
        }
        C23110a.h(bVar.f51133a);
        if (this.f51119n) {
            return true;
        }
        this.f51119n = true;
        zVar.G(8);
        Metadata metadataB = M.b(AbstractC37401r1.w(M.c(zVar, false, false).f50395a));
        if (metadataB == null) {
            return true;
        }
        C23108t.b bVarA = bVar.f51133a.a();
        Metadata metadata = bVar.f51133a.f47755k;
        if (metadata != null) {
            metadataB = metadataB.a(metadata.f47361b);
        }
        bVarA.f47785i = metadataB;
        bVar.f51133a = bVarA.a();
        return true;
    }

    @Override // androidx.media3.extractor.ogg.h
    public final void d(boolean z12) {
        super.d(z12);
        if (z12) {
            this.f51119n = false;
        }
    }
}
