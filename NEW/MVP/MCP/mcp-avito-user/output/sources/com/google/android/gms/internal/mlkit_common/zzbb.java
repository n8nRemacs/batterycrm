package com.google.android.gms.internal.mlkit_common;

import I41.a;
import java.util.Arrays;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzbb extends zzat {

    /* renamed from: h, reason: collision with root package name */
    public static final zzat f351210h = new zzbb(null, new Object[0], 0);

    /* renamed from: e, reason: collision with root package name */
    @a
    public final transient Object f351211e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f351212f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f351213g;

    public zzbb(@a Object obj, Object[] objArr, int i12) {
        this.f351211e = obj;
        this.f351212f = objArr;
        this.f351213g = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static zzbb d(int i12, Object[] objArr, zzas zzasVar) {
        int iHighestOneBit;
        short[] sArr;
        char c12;
        char c13;
        byte[] bArr;
        int i13 = i12;
        Object[] objArrCopyOf = objArr;
        if (i13 == 0) {
            return (zzbb) f351210h;
        }
        Object obj = null;
        int i14 = 1;
        if (i13 == 1) {
            objArrCopyOf[0].getClass();
            objArrCopyOf[1].getClass();
            return new zzbb(null, objArrCopyOf, 1);
        }
        zzae.zzb(i13, objArrCopyOf.length >> 1, "index");
        int iMax = Math.max(i13, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (iHighestOneBit * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i13 == 1) {
            objArrCopyOf[0].getClass();
            objArrCopyOf[1].getClass();
            i13 = 1;
            c12 = 1;
            c13 = 2;
        } else {
            int i15 = iHighestOneBit - 1;
            char c14 = 65535;
            if (iHighestOneBit <= 128) {
                byte[] bArr2 = new byte[iHighestOneBit];
                Arrays.fill(bArr2, (byte) -1);
                int i16 = 0;
                int i17 = 0;
                while (i16 < i13) {
                    int i18 = i17 + i17;
                    int i19 = i16 + i16;
                    Object obj2 = objArrCopyOf[i19];
                    obj2.getClass();
                    Object obj3 = objArrCopyOf[i19 ^ i14];
                    obj3.getClass();
                    int iA2 = zzaj.a(obj2.hashCode());
                    while (true) {
                        int i22 = iA2 & i15;
                        int i23 = bArr2[i22] & 255;
                        if (i23 == 255) {
                            bArr2[i22] = (byte) i18;
                            if (i17 < i16) {
                                objArrCopyOf[i18] = obj2;
                                objArrCopyOf[i18 ^ 1] = obj3;
                            }
                            i17++;
                        } else {
                            if (obj2.equals(objArrCopyOf[i23])) {
                                int i24 = i23 ^ 1;
                                Object obj4 = objArrCopyOf[i24];
                                obj4.getClass();
                                zzar zzarVar = new zzar(obj2, obj3, obj4);
                                objArrCopyOf[i24] = obj3;
                                obj = zzarVar;
                                break;
                            }
                            iA2 = i22 + 1;
                        }
                    }
                    i16++;
                    i14 = 1;
                }
                if (i17 == i13) {
                    bArr = bArr2;
                } else {
                    bArr = new Object[]{bArr2, Integer.valueOf(i17), obj};
                    c13 = 2;
                    c12 = 1;
                    obj = bArr;
                }
            } else if (iHighestOneBit <= 32768) {
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i25 = 0;
                for (int i26 = 0; i26 < i13; i26++) {
                    int i27 = i25 + i25;
                    int i28 = i26 + i26;
                    Object obj5 = objArrCopyOf[i28];
                    obj5.getClass();
                    Object obj6 = objArrCopyOf[i28 ^ 1];
                    obj6.getClass();
                    int iA3 = zzaj.a(obj5.hashCode());
                    while (true) {
                        int i29 = iA3 & i15;
                        char c15 = (char) sArr[i29];
                        if (c15 == 65535) {
                            sArr[i29] = (short) i27;
                            if (i25 < i26) {
                                objArrCopyOf[i27] = obj5;
                                objArrCopyOf[i27 ^ 1] = obj6;
                            }
                            i25++;
                        } else {
                            if (obj5.equals(objArrCopyOf[c15])) {
                                int i32 = c15 ^ 1;
                                Object obj7 = objArrCopyOf[i32];
                                obj7.getClass();
                                zzar zzarVar2 = new zzar(obj5, obj6, obj7);
                                objArrCopyOf[i32] = obj6;
                                obj = zzarVar2;
                                break;
                            }
                            iA3 = i29 + 1;
                        }
                    }
                }
                if (i25 != i13) {
                    c13 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i25), obj};
                    c12 = 1;
                }
                bArr = sArr;
            } else {
                int i33 = 1;
                sArr = new int[iHighestOneBit];
                Arrays.fill((int[]) sArr, -1);
                int i34 = 0;
                int i35 = 0;
                while (i34 < i13) {
                    int i36 = i35 + i35;
                    int i37 = i34 + i34;
                    Object obj8 = objArrCopyOf[i37];
                    obj8.getClass();
                    Object obj9 = objArrCopyOf[i37 ^ i33];
                    obj9.getClass();
                    int iA4 = zzaj.a(obj8.hashCode());
                    while (true) {
                        int i38 = iA4 & i15;
                        ?? r15 = sArr[i38];
                        if (r15 == c14) {
                            sArr[i38] = i36;
                            if (i35 < i34) {
                                objArrCopyOf[i36] = obj8;
                                objArrCopyOf[i36 ^ 1] = obj9;
                            }
                            i35++;
                        } else {
                            if (obj8.equals(objArrCopyOf[r15])) {
                                int i39 = r15 ^ 1;
                                Object obj10 = objArrCopyOf[i39];
                                obj10.getClass();
                                zzar zzarVar3 = new zzar(obj8, obj9, obj10);
                                objArrCopyOf[i39] = obj9;
                                obj = zzarVar3;
                                break;
                            }
                            iA4 = i38 + 1;
                            c14 = 65535;
                        }
                    }
                    i34++;
                    i33 = 1;
                    c14 = 65535;
                }
                if (i35 != i13) {
                    c12 = 1;
                    c13 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i35), obj};
                }
                bArr = sArr;
            }
            c13 = 2;
            c12 = 1;
            obj = bArr;
        }
        boolean z12 = obj instanceof Object[];
        Object obj11 = obj;
        if (z12) {
            Object[] objArr2 = (Object[]) obj;
            zzar zzarVar4 = (zzar) objArr2[c13];
            if (zzasVar == null) {
                throw zzarVar4.a();
            }
            zzasVar.f351193c = zzarVar4;
            Object obj12 = objArr2[0];
            int iIntValue = ((Integer) objArr2[c12]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            obj11 = obj12;
            i13 = iIntValue;
        }
        return new zzbb(obj11, objArrCopyOf, i13);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzat
    public final zzam a() {
        return new zzba(this.f351212f, 1, this.f351213g);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzat
    public final zzau b() {
        return new zzay(this, this.f351212f, this.f351213g);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzat
    public final zzau c() {
        return new zzaz(this, new zzba(this.f351212f, 0, this.f351213g));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // com.google.android.gms.internal.mlkit_common.zzat, java.util.Map
    @I41.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(@I41.a java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            r1 = 1
            int r2 = r9.f351213g
            java.lang.Object[] r3 = r9.f351212f
            if (r2 != r1) goto L20
            r2 = 0
            r2 = r3[r2]
            r2.getClass()
            boolean r10 = r2.equals(r10)
            if (r10 == 0) goto L3
            r10 = r3[r1]
            r10.getClass()
            goto L9c
        L20:
            java.lang.Object r2 = r9.f351211e
            if (r2 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r2 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r2
            byte[] r4 = (byte[]) r4
            int r2 = r4.length
            int r6 = r2 + (-1)
            int r2 = r10.hashCode()
            int r2 = com.google.android.gms.internal.mlkit_common.zzaj.a(r2)
        L38:
            r2 = r2 & r6
            r5 = r4[r2]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r3[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r3[r10]
            goto L9c
        L4e:
            int r2 = r2 + 1
            goto L38
        L51:
            boolean r4 = r2 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r2
            short[] r4 = (short[]) r4
            int r2 = r4.length
            int r6 = r2 + (-1)
            int r2 = r10.hashCode()
            int r2 = com.google.android.gms.internal.mlkit_common.zzaj.a(r2)
        L63:
            r2 = r2 & r6
            short r5 = r4[r2]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r3[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r3[r10]
            goto L9c
        L7a:
            int r2 = r2 + 1
            goto L63
        L7d:
            int[] r2 = (int[]) r2
            int r4 = r2.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.mlkit_common.zzaj.a(r6)
        L89:
            r6 = r6 & r4
            r7 = r2[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r3[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r3[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zzbb.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f351213g;
    }
}
