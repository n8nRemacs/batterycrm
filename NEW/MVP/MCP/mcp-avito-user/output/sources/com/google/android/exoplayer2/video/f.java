package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.A;
import com.google.android.exoplayer2.util.C36590f;
import com.google.android.exoplayer2.util.F;
import j.P;
import java.util.Collections;
import java.util.List;

/* compiled from: HevcConfig.java */
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f348225a;

    /* renamed from: b, reason: collision with root package name */
    public final int f348226b;

    /* renamed from: c, reason: collision with root package name */
    public final float f348227c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final String f348228d;

    public f(List list, int i12, float f12, @P String str) {
        this.f348225a = list;
        this.f348226b = i12;
        this.f348227c = f12;
        this.f348228d = str;
    }

    public static f a(F f12) throws ParserException {
        int i12;
        try {
            f12.C(21);
            int iR2 = f12.r() & 3;
            int iR3 = f12.r();
            int i13 = f12.f348071b;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < iR3; i16++) {
                f12.C(1);
                int iW2 = f12.w();
                for (int i17 = 0; i17 < iW2; i17++) {
                    int iW3 = f12.w();
                    i15 += iW3 + 4;
                    f12.C(iW3);
                }
            }
            f12.B(i13);
            byte[] bArr = new byte[i15];
            float f13 = 1.0f;
            String strA = null;
            int i18 = 0;
            int i19 = 0;
            while (i18 < iR3) {
                int iR4 = f12.r() & 127;
                int iW4 = f12.w();
                int i22 = i14;
                while (i22 < iW4) {
                    int iW5 = f12.w();
                    System.arraycopy(A.f348026a, i14, bArr, i19, 4);
                    int i23 = i19 + 4;
                    System.arraycopy(f12.f348070a, f12.f348071b, bArr, i23, iW5);
                    if (iR4 == 33 && i22 == 0) {
                        A.a aVarC = A.c(i23, i23 + iW5, bArr);
                        float f14 = aVarC.f348036g;
                        i12 = iR3;
                        strA = C36590f.a(aVarC.f348030a, aVarC.f348031b, aVarC.f348032c, aVarC.f348033d, aVarC.f348034e, aVarC.f348035f);
                        f13 = f14;
                    } else {
                        i12 = iR3;
                    }
                    i19 = i23 + iW5;
                    f12.C(iW5);
                    i22++;
                    iR3 = i12;
                    i14 = 0;
                }
                i18++;
                i14 = 0;
            }
            return new f(i15 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iR2 + 1, f13, strA);
        } catch (ArrayIndexOutOfBoundsException e12) {
            throw ParserException.a("Error parsing HEVC config", e12);
        }
    }
}
