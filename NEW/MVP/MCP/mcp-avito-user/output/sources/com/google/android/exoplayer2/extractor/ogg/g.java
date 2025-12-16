package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.audio.v;
import com.google.android.exoplayer2.extractor.D;
import com.google.android.exoplayer2.extractor.ogg.h;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
import com.google.common.collect.AbstractC37401r1;
import java.util.ArrayList;
import java.util.Arrays;
import v61.InterfaceC49174e;

/* compiled from: OpusReader.java */
/* loaded from: classes6.dex */
final class g extends h {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f344944o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f344945p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f344946n;

    public static boolean e(F f12, byte[] bArr) {
        if (f12.a() < bArr.length) {
            return false;
        }
        int i12 = f12.f348071b;
        byte[] bArr2 = new byte[bArr.length];
        f12.c(0, bArr.length, bArr2);
        f12.B(i12);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.h
    public final long b(F f12) {
        int i12;
        byte[] bArr = f12.f348070a;
        byte b12 = bArr[0];
        int i13 = b12 & 255;
        int i14 = b12 & 3;
        if (i14 != 0) {
            i12 = 2;
            if (i14 != 1 && i14 != 2) {
                i12 = bArr[1] & 63;
            }
        } else {
            i12 = 1;
        }
        int i15 = i13 >> 3;
        return (this.f344955i * (i12 * (i15 >= 16 ? 2500 << r0 : i15 >= 12 ? 10000 << (i15 & 1) : (i15 & 3) == 3 ? 60000 : 10000 << r0))) / 1000000;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.h
    @InterfaceC49174e
    public final boolean c(F f12, long j12, h.b bVar) {
        if (e(f12, f344944o)) {
            byte[] bArrCopyOf = Arrays.copyOf(f12.f348070a, f12.f348072c);
            int i12 = bArrCopyOf[9] & 255;
            ArrayList arrayListA = v.a(bArrCopyOf);
            if (bVar.f344960a != null) {
                return true;
            }
            I.b bVar2 = new I.b();
            bVar2.f343504k = "audio/opus";
            bVar2.f343517x = i12;
            bVar2.f343518y = 48000;
            bVar2.f343506m = arrayListA;
            bVar.f344960a = bVar2.a();
            return true;
        }
        if (!e(f12, f344945p)) {
            C36585a.e(bVar.f344960a);
            return false;
        }
        C36585a.e(bVar.f344960a);
        if (this.f344946n) {
            return true;
        }
        this.f344946n = true;
        f12.C(8);
        Metadata metadataB = D.b(AbstractC37401r1.w(D.c(f12, false, false).f344387a));
        if (metadataB == null) {
            return true;
        }
        I.b bVarA = bVar.f344960a.a();
        Metadata metadata = bVar.f344960a.f343474k;
        if (metadata != null) {
            Metadata.Entry[] entryArr = metadata.f345623b;
            if (entryArr.length != 0) {
                int i13 = U.f348106a;
                Metadata.Entry[] entryArr2 = metadataB.f345623b;
                Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
                metadataB = new Metadata((Metadata.Entry[]) objArrCopyOf);
            }
        }
        bVarA.f343502i = metadataB;
        bVar.f344960a = bVarA.a();
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.h
    public final void d(boolean z12) {
        super.d(z12);
        if (z12) {
            this.f344946n = false;
        }
    }
}
