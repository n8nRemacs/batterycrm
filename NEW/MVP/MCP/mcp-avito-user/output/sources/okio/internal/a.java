package okio.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;
import okio.C44802l;
import okio.Z;

/* compiled from: Buffer.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final byte[] f420070a = "0123456789abcdef".getBytes(C43047d.f410589b);

    public static final boolean a(@Y61.k Z z12, int i12, @Y61.k byte[] bArr, int i13) {
        int i14 = z12.f420052c;
        byte[] bArr2 = z12.f420050a;
        for (int i15 = 1; i15 < i13; i15++) {
            if (i12 == i14) {
                z12 = z12.f420055f;
                i12 = z12.f420051b;
                i14 = z12.f420052c;
                bArr2 = z12.f420050a;
            }
            if (bArr2[i12] != bArr[i15]) {
                return false;
            }
            i12++;
        }
        return true;
    }

    @Y61.k
    public static final String b(@Y61.k C44802l c44802l, long j12) {
        if (j12 > 0) {
            long j13 = j12 - 1;
            if (c44802l.m(j13) == 13) {
                String strZ1 = c44802l.z1(j13, C43047d.f410589b);
                c44802l.skip(2L);
                return strZ1;
            }
        }
        String strZ12 = c44802l.z1(j12, C43047d.f410589b);
        c44802l.skip(1L);
        return strZ12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r19 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int c(@Y61.k okio.C44802l r17, @Y61.k okio.P r18, boolean r19) {
        /*
            r0 = r17
            okio.Z r0 = r0.f420124b
            r1 = -2
            r2 = -1
            if (r0 != 0) goto Ld
            if (r19 == 0) goto Lb
            goto Lc
        Lb:
            r1 = r2
        Lc:
            return r1
        Ld:
            int r3 = r0.f420051b
            int r4 = r0.f420052c
            r5 = 0
            byte[] r6 = r0.f420050a
            r8 = r0
            r9 = r2
            r7 = r5
        L17:
            int r10 = r7 + 1
            r11 = r18
            int[] r12 = r11.f420030d
            r13 = r12[r7]
            int r7 = r7 + 2
            r10 = r12[r10]
            if (r10 == r2) goto L26
            r9 = r10
        L26:
            if (r8 != 0) goto L29
            goto L53
        L29:
            r10 = 0
            if (r13 >= 0) goto L6d
            int r13 = r13 * (-1)
            int r14 = r13 + r7
        L30:
            int r13 = r3 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r15 = r7 + 1
            r7 = r12[r7]
            if (r3 == r7) goto L3d
            return r9
        L3d:
            if (r15 != r14) goto L41
            r3 = 1
            goto L42
        L41:
            r3 = r5
        L42:
            if (r13 != r4) goto L5d
            okio.Z r4 = r8.f420055f
            int r6 = r4.f420051b
            int r7 = r4.f420052c
            byte[] r8 = r4.f420050a
            if (r4 != r0) goto L57
            if (r3 == 0) goto L53
            r4 = r7
            r7 = r10
            goto L60
        L53:
            if (r19 == 0) goto L56
            return r1
        L56:
            return r9
        L57:
            r16 = r7
            r7 = r4
            r4 = r16
            goto L60
        L5d:
            r7 = r8
            r8 = r6
            r6 = r13
        L60:
            if (r3 == 0) goto L68
            r3 = r12[r15]
            r1 = r6
            r6 = r8
            r8 = r7
            goto L8e
        L68:
            r3 = r6
            r6 = r8
            r8 = r7
            r7 = r15
            goto L30
        L6d:
            int r14 = r3 + 1
            r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r15 = r7 + r13
        L75:
            if (r7 != r15) goto L78
            return r9
        L78:
            r1 = r12[r7]
            if (r3 != r1) goto L95
            int r7 = r7 + r13
            r3 = r12[r7]
            if (r14 != r4) goto L8d
            okio.Z r8 = r8.f420055f
            int r1 = r8.f420051b
            int r4 = r8.f420052c
            byte[] r6 = r8.f420050a
            if (r8 != r0) goto L8e
            r8 = r10
            goto L8e
        L8d:
            r1 = r14
        L8e:
            if (r3 < 0) goto L91
            return r3
        L91:
            int r7 = -r3
            r3 = r1
            r1 = -2
            goto L17
        L95:
            int r7 = r7 + 1
            r1 = -2
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.a.c(okio.l, okio.P, boolean):int");
    }
}
