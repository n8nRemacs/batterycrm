package io.ktor.utils.io.core.internal;

import Y61.k;
import androidx.camera.camera2.internal.G;
import kotlin.Metadata;
import kotlin.X;
import kotlin.jvm.internal.s0;

/* compiled from: UTF8.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class h {
    /* JADX WARN: Code restructure failed: missing block: B:100:0x020c, code lost:
    
        r8.f406838b = true;
        r0.f406840b = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0215, code lost:
    
        r8.f406838b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0262, code lost:
    
        r8.f406838b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0272, code lost:
    
        r8.f406838b = true;
        r0.f406840b = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x027b, code lost:
    
        r8.f406838b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x029c, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x029d, code lost:
    
        r8.f406838b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02a9, code lost:
    
        r8.f406838b = true;
        r0.f406840b = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02b2, code lost:
    
        r8.f406838b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0125, code lost:
    
        r8.f406838b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0138, code lost:
    
        r8.f406838b = true;
        r0.f406840b = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0141, code lost:
    
        r8.f406838b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c5, code lost:
    
        r4.c(r15 - r6);
        r3 = r7.f406840b;
        r10 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01fb, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01fc, code lost:
    
        r8.f406838b = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0298 A[Catch: all -> 0x012f, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x012f, blocks: (B:44:0x0120, B:93:0x01f7, B:138:0x0298), top: B:234:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0328 A[Catch: all -> 0x0128, TryCatch #3 {all -> 0x0128, blocks: (B:37:0x00fd, B:40:0x0119, B:47:0x0125, B:59:0x0143, B:162:0x0322, B:164:0x0328, B:165:0x032b, B:172:0x0338, B:168:0x0331, B:50:0x012b, B:160:0x0304, B:55:0x0138, B:56:0x013d, B:58:0x0141, B:62:0x014e, B:64:0x0152, B:67:0x0161, B:68:0x0178, B:69:0x0179, B:70:0x0191, B:71:0x0192, B:73:0x0196, B:76:0x019e, B:78:0x01a4, B:79:0x01b3, B:81:0x01c5, B:83:0x01d3, B:85:0x01e7, B:96:0x01fc, B:104:0x0217, B:97:0x01ff, B:153:0x02cc, B:100:0x020c, B:101:0x0211, B:103:0x0215, B:105:0x0221, B:107:0x0225, B:109:0x0230, B:110:0x0247, B:121:0x0262, B:149:0x02b4, B:122:0x0265, B:135:0x028b, B:141:0x029d, B:142:0x02a0, B:145:0x02a9, B:146:0x02ae, B:148:0x02b2, B:150:0x02be, B:152:0x02c2, B:154:0x02cf, B:155:0x02e6, B:127:0x0272, B:128:0x0277, B:130:0x027b, B:132:0x027f, B:134:0x0283, B:156:0x02e7, B:157:0x02fe, B:158:0x02ff, B:159:0x0303, B:161:0x0313), top: B:229:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0331 A[Catch: all -> 0x0128, TryCatch #3 {all -> 0x0128, blocks: (B:37:0x00fd, B:40:0x0119, B:47:0x0125, B:59:0x0143, B:162:0x0322, B:164:0x0328, B:165:0x032b, B:172:0x0338, B:168:0x0331, B:50:0x012b, B:160:0x0304, B:55:0x0138, B:56:0x013d, B:58:0x0141, B:62:0x014e, B:64:0x0152, B:67:0x0161, B:68:0x0178, B:69:0x0179, B:70:0x0191, B:71:0x0192, B:73:0x0196, B:76:0x019e, B:78:0x01a4, B:79:0x01b3, B:81:0x01c5, B:83:0x01d3, B:85:0x01e7, B:96:0x01fc, B:104:0x0217, B:97:0x01ff, B:153:0x02cc, B:100:0x020c, B:101:0x0211, B:103:0x0215, B:105:0x0221, B:107:0x0225, B:109:0x0230, B:110:0x0247, B:121:0x0262, B:149:0x02b4, B:122:0x0265, B:135:0x028b, B:141:0x029d, B:142:0x02a0, B:145:0x02a9, B:146:0x02ae, B:148:0x02b2, B:150:0x02be, B:152:0x02c2, B:154:0x02cf, B:155:0x02e6, B:127:0x0272, B:128:0x0277, B:130:0x027b, B:132:0x027f, B:134:0x0283, B:156:0x02e7, B:157:0x02fe, B:158:0x02ff, B:159:0x0303, B:161:0x0313), top: B:229:0x00fd }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Appendable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00a6 -> B:23:0x00ab). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@Y61.k java.lang.StringBuilder r28, int r29, @Y61.k Y41.p r30, @Y61.k Y41.l r31, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.core.internal.h.a(java.lang.StringBuilder, int, Y41.p, Y41.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0101, code lost:
    
        if (r9 != r11) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0103, code lost:
    
        r11 = r8 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0105, code lost:
    
        if (r11 <= 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0107, code lost:
    
        if (r10 < r7) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010b, code lost:
    
        r12 = r10 + 1;
        r18 = r21.charAt(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0115, code lost:
    
        if (java.lang.Character.isHighSurrogate(r18) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0117, code lost:
    
        r10 = r12;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0118, code lost:
    
        r12 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011b, code lost:
    
        if (r12 == r7) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0125, code lost:
    
        if (java.lang.Character.isLowSurrogate(r21.charAt(r12)) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0128, code lost:
    
        r10 = r10 + 2;
        r18 = ((r18 - 55232) << 10) | (r21.charAt(r12) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0135, code lost:
    
        r10 = r12;
        r12 = '?';
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0137, code lost:
    
        if (1 > r12) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0139, code lost:
    
        if (r12 >= 128) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013b, code lost:
    
        r13 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013d, code lost:
    
        if (128 > r12) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013f, code lost:
    
        if (r12 >= r2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0141, code lost:
    
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0143, code lost:
    
        if (r2 > r12) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0145, code lost:
    
        if (r12 >= 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0147, code lost:
    
        r13 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0149, code lost:
    
        if (0 > r12) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014d, code lost:
    
        if (r12 >= 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014f, code lost:
    
        r13 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0151, code lost:
    
        if (r13 <= r11) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0153, code lost:
    
        r10 = r10 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0157, code lost:
    
        if (r12 < 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0159, code lost:
    
        if (r12 >= 128) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015b, code lost:
    
        r20.put(r9, (byte) r12);
        r17 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0165, code lost:
    
        if (128 > r12) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0167, code lost:
    
        if (r12 >= r2) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0169, code lost:
    
        r20.put(r9, (byte) (((r12 >> 6) & 31) | 192));
        r20.put(r9 + 1, (byte) ((r12 & '?') | 128));
        r17 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017e, code lost:
    
        if (r2 > r12) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0180, code lost:
    
        if (r12 >= 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0182, code lost:
    
        r20.put(r9, (byte) (((r12 >> '\f') & 15) | 224));
        r20.put(r9 + 1, (byte) (((r12 >> 6) & 63) | 128));
        r20.put(r9 + 2, (byte) ((r12 & '?') | 128));
        r17 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a4, code lost:
    
        if (0 > r12) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a8, code lost:
    
        if (r12 >= 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01aa, code lost:
    
        r20.put(r9, (byte) (((r12 >> 18) & 7) | 240));
        r20.put(r9 + 1, (byte) (((r12 >> '\f') & 63) | 128));
        r20.put(r9 + 2, (byte) (((r12 >> 6) & 63) | 128));
        r20.put(r9 + 3, (byte) ((r12 & '?') | 128));
        r17 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01d4, code lost:
    
        r9 = r9 + r17;
        r2 = 2048;
        r13 = 56320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01dd, code lost:
    
        c(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e2, code lost:
    
        c(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e7, code lost:
    
        r0 = (short) (r10 - r22);
        r1 = kotlin.C0.f406602c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f8, code lost:
    
        r0 = (short) (r10 - r22);
        r1 = kotlin.C0.f406602c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01fe, code lost:
    
        return ((r0 & 65535) << 16) | (((short) (r9 - r24)) & 65535);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(@Y61.k java.nio.ByteBuffer r20, @Y61.k java.lang.CharSequence r21, int r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.core.internal.h.b(java.nio.ByteBuffer, java.lang.CharSequence, int, int, int, int):int");
    }

    @X
    @k
    public static final void c(int i12) {
        throw new IllegalArgumentException(G.e(i12, "Malformed code-point ", " found"));
    }
}
