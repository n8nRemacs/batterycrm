package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.A;
import com.google.android.exoplayer2.util.C36590f;
import com.google.android.exoplayer2.util.F;
import j.P;
import java.util.ArrayList;

/* compiled from: AvcConfig.java */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f348181a;

    /* renamed from: b, reason: collision with root package name */
    public final int f348182b;

    /* renamed from: c, reason: collision with root package name */
    public final int f348183c;

    /* renamed from: d, reason: collision with root package name */
    public final int f348184d;

    /* renamed from: e, reason: collision with root package name */
    public final float f348185e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final String f348186f;

    public a(ArrayList arrayList, int i12, int i13, int i14, float f12, @P String str) {
        this.f348181a = arrayList;
        this.f348182b = i12;
        this.f348183c = i13;
        this.f348184d = i14;
        this.f348185e = f12;
        this.f348186f = str;
    }

    public static a a(F f12) throws ParserException {
        byte[] bArr;
        int i12;
        int i13;
        float f13;
        String str;
        try {
            f12.C(4);
            int iR2 = (f12.r() & 3) + 1;
            if (iR2 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iR3 = f12.r() & 31;
            int i14 = 0;
            while (true) {
                bArr = C36590f.f348124a;
                if (i14 >= iR3) {
                    break;
                }
                int iW2 = f12.w();
                int i15 = f12.f348071b;
                f12.C(iW2);
                byte[] bArr2 = f12.f348070a;
                byte[] bArr3 = new byte[iW2 + 4];
                System.arraycopy(bArr, 0, bArr3, 0, 4);
                System.arraycopy(bArr2, i15, bArr3, 4, iW2);
                arrayList.add(bArr3);
                i14++;
            }
            int iR4 = f12.r();
            for (int i16 = 0; i16 < iR4; i16++) {
                int iW3 = f12.w();
                int i17 = f12.f348071b;
                f12.C(iW3);
                byte[] bArr4 = f12.f348070a;
                byte[] bArr5 = new byte[iW3 + 4];
                System.arraycopy(bArr, 0, bArr5, 0, 4);
                System.arraycopy(bArr4, i17, bArr5, 4, iW3);
                arrayList.add(bArr5);
            }
            if (iR3 > 0) {
                A.c cVarD = A.d(iR2, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                int i18 = cVarD.f348043e;
                int i19 = cVarD.f348044f;
                float f14 = cVarD.f348045g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(cVarD.f348039a), Integer.valueOf(cVarD.f348040b), Integer.valueOf(cVarD.f348041c));
                i12 = i18;
                i13 = i19;
                f13 = f14;
            } else {
                i12 = -1;
                i13 = -1;
                f13 = 1.0f;
                str = null;
            }
            return new a(arrayList, iR2, i12, i13, f13, str);
        } catch (ArrayIndexOutOfBoundsException e12) {
            throw ParserException.a("Error parsing AVC config", e12);
        }
    }
}
