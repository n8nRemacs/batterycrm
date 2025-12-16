package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HexExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.text.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43051h {
    static {
        int[] iArr = new int[256];
        int i12 = 0;
        for (int i13 = 0; i13 < 256; i13++) {
            iArr[i13] = "0123456789abcdef".charAt(i13 & 15) | ("0123456789abcdef".charAt(i13 >> 4) << '\b');
        }
        int[] iArr2 = new int[256];
        for (int i14 = 0; i14 < 256; i14++) {
            iArr2[i14] = "0123456789ABCDEF".charAt(i14 & 15) | ("0123456789ABCDEF".charAt(i14 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i15 = 0; i15 < 256; i15++) {
            iArr3[i15] = -1;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i18)] = i19;
            i18++;
            i19++;
        }
        long[] jArr = new long[256];
        for (int i22 = 0; i22 < 256; i22++) {
            jArr[i22] = -1;
        }
        int i23 = 0;
        int i24 = 0;
        while (i23 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i23)] = i24;
            i23++;
            i24++;
        }
        int i25 = 0;
        while (i12 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i12)] = i25;
            i12++;
            i25++;
        }
    }
}
