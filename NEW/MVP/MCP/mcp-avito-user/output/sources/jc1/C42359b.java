package jc1;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ByteArrayTimSort.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ljc1/b;", "", "a", "shark-graph"}, k = 1, mv = {1, 4, 1})
/* renamed from: jc1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C42359b {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f405740i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public int f405741a = 7;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f405742b;

    /* renamed from: c, reason: collision with root package name */
    public int f405743c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f405744d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f405745e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f405746f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC42358a f405747g;

    /* renamed from: h, reason: collision with root package name */
    public final int f405748h;

    /* compiled from: ByteArrayTimSort.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Ljc1/b$a;", "", "<init>", "()V", "", "DEBUG", "Z", "", "INITIAL_TMP_STORAGE_LENGTH", "I", "MIN_GALLOP", "MIN_MERGE", "shark-graph"}, k = 1, mv = {1, 4, 1})
    /* renamed from: jc1.b$a */
    public static final class a {
        public a() {
        }

        public static final int a(a aVar, byte[] bArr, int i12, byte[] bArr2, int i13, int i14, int i15, int i16, InterfaceC42358a interfaceC42358a) {
            int i17;
            int i18;
            aVar.getClass();
            int i19 = i13 + i15;
            if (interfaceC42358a.a(bArr, i16, bArr2, i12, i19) > 0) {
                int i22 = i14 - i15;
                int i23 = 0;
                int i24 = 1;
                while (i24 < i22 && interfaceC42358a.a(bArr, i16, bArr2, i12, i19 + i24) > 0) {
                    int i25 = (i24 * 2) + 1;
                    if (i25 <= 0) {
                        i25 = i22;
                    }
                    int i26 = i25;
                    i23 = i24;
                    i24 = i26;
                }
                if (i24 <= i22) {
                    i22 = i24;
                }
                i17 = i23 + i15;
                i18 = i22 + i15;
            } else {
                int i27 = i15 + 1;
                int i28 = 0;
                int i29 = 1;
                while (i29 < i27 && interfaceC42358a.a(bArr, i16, bArr2, i12, i19 - i29) <= 0) {
                    int i32 = (i29 * 2) + 1;
                    if (i32 <= 0) {
                        i32 = i27;
                    }
                    int i33 = i32;
                    i28 = i29;
                    i29 = i33;
                }
                if (i29 <= i27) {
                    i27 = i29;
                }
                int i34 = i15 - i28;
                i17 = i15 - i27;
                i18 = i34;
            }
            int i35 = i17 + 1;
            while (i35 < i18) {
                int i36 = ((i18 - i35) >>> 1) + i35;
                if (interfaceC42358a.a(bArr, i16, bArr2, i12, i13 + i36) > 0) {
                    i35 = i36 + 1;
                } else {
                    i18 = i36;
                }
            }
            return i18;
        }

        public static final int b(a aVar, byte[] bArr, int i12, byte[] bArr2, int i13, int i14, int i15, int i16, InterfaceC42358a interfaceC42358a) {
            int i17;
            int i18;
            aVar.getClass();
            int i19 = i13 + i15;
            if (interfaceC42358a.a(bArr, i16, bArr2, i12, i19) < 0) {
                int i22 = i15 + 1;
                int i23 = 0;
                int i24 = 1;
                while (i24 < i22 && interfaceC42358a.a(bArr, i16, bArr2, i12, i19 - i24) < 0) {
                    int i25 = (i24 * 2) + 1;
                    if (i25 <= 0) {
                        i25 = i22;
                    }
                    int i26 = i25;
                    i23 = i24;
                    i24 = i26;
                }
                if (i24 <= i22) {
                    i22 = i24;
                }
                i18 = i15 - i22;
                i17 = i15 - i23;
            } else {
                int i27 = i14 - i15;
                int i28 = 0;
                int i29 = 1;
                while (i29 < i27 && interfaceC42358a.a(bArr, i16, bArr2, i12, i19 + i29) >= 0) {
                    int i32 = (i29 * 2) + 1;
                    if (i32 <= 0) {
                        i32 = i27;
                    }
                    int i33 = i32;
                    i28 = i29;
                    i29 = i33;
                }
                if (i29 <= i27) {
                    i27 = i29;
                }
                i17 = i27 + i15;
                i18 = i28 + i15;
            }
            int i34 = i18 + 1;
            while (i34 < i17) {
                int i35 = ((i17 - i34) >>> 1) + i34;
                if (interfaceC42358a.a(bArr, i16, bArr2, i12, i13 + i35) < 0) {
                    i17 = i35;
                } else {
                    i34 = i35 + 1;
                }
            }
            return i17;
        }

        public static void c(byte[] bArr, int i12, int i13, int i14, int i15, InterfaceC42358a interfaceC42358a) {
            int i16 = i14;
            if (i16 == i12) {
                i16++;
            }
            byte[] bArr2 = new byte[i15];
            for (int i17 = i16; i17 < i13; i17++) {
                int i18 = i17 * i15;
                for (int i19 = 0; i19 < i15; i19++) {
                    bArr2[i19] = bArr[i18 + i19];
                }
                int i22 = i12;
                int i23 = i17;
                while (i22 < i23) {
                    int i24 = (i22 + i23) >>> 1;
                    if (interfaceC42358a.a(bArr2, i15, bArr, 0, i24) < 0) {
                        i23 = i24;
                    } else {
                        i22 = i24 + 1;
                    }
                }
                int i25 = i17 - i22;
                if (i25 == 1) {
                    int i26 = i22 * i15;
                    int i27 = (i22 + 1) * i15;
                    for (int i28 = 0; i28 < i15; i28++) {
                        bArr[i27 + i28] = bArr[i26 + i28];
                    }
                } else if (i25 != 2) {
                    System.arraycopy(bArr, i22 * i15, bArr, (i22 + 1) * i15, i25 * i15);
                } else {
                    int i29 = i22 * i15;
                    int i32 = (i22 + 1) * i15;
                    int i33 = (i22 + 2) * i15;
                    for (int i34 = 0; i34 < i15; i34++) {
                        bArr[i33 + i34] = bArr[i32 + i34];
                    }
                    for (int i35 = 0; i35 < i15; i35++) {
                        bArr[i32 + i35] = bArr[i29 + i35];
                    }
                }
                int i36 = i22 * i15;
                for (int i37 = 0; i37 < i15; i37++) {
                    bArr[i36 + i37] = bArr2[i37];
                }
            }
        }

        public static int d(byte[] bArr, int i12, int i13, int i14, InterfaceC42358a interfaceC42358a) {
            int i15 = i12 + 1;
            if (i15 == i13) {
                return 1;
            }
            int i16 = i12 + 2;
            if (interfaceC42358a.a(bArr, i14, bArr, i15, i12) >= 0) {
                while (i16 < i13) {
                    if (interfaceC42358a.a(bArr, i14, bArr, i16, i16 - 1) < 0) {
                        break;
                    }
                    i16++;
                }
            } else {
                while (i16 < i13) {
                    if (interfaceC42358a.a(bArr, i14, bArr, i16, i16 - 1) >= 0) {
                        break;
                    }
                    i16++;
                }
                int i17 = i12;
                for (int i18 = i16 - 1; i17 < i18; i18--) {
                    int i19 = i17 * i14;
                    int i22 = i18 * i14;
                    for (int i23 = 0; i23 < i14; i23++) {
                        int i24 = i19 + i23;
                        byte b12 = bArr[i24];
                        int i25 = i22 + i23;
                        bArr[i24] = bArr[i25];
                        bArr[i25] = b12;
                    }
                    i17++;
                }
            }
            return i16 - i12;
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    public C42359b(byte[] bArr, InterfaceC42358a interfaceC42358a, int i12, C42822w c42822w) {
        this.f405746f = bArr;
        this.f405747g = interfaceC42358a;
        this.f405748h = i12;
        int length = bArr.length / i12;
        this.f405742b = new byte[i12 * (length < 512 ? length >>> 1 : 256)];
        int i13 = length < 120 ? 5 : length < 1542 ? 10 : length < 119151 ? 19 : 40;
        this.f405744d = new int[i13];
        this.f405745e = new int[i13];
    }

    public final byte[] a(int i12) {
        byte[] bArr = this.f405742b;
        if (bArr == null) {
            L.k();
            throw null;
        }
        int length = bArr.length;
        int i13 = this.f405748h;
        if (length < i12 * i13) {
            int i14 = (i12 >> 1) | i12;
            int i15 = i14 | (i14 >> 2);
            int i16 = i15 | (i15 >> 4);
            int i17 = i16 | (i16 >> 8);
            int i18 = (i17 | (i17 >> 16)) + 1;
            if (i18 >= 0) {
                i12 = Math.min(i18, (this.f405746f.length / i13) >>> 1);
            }
            this.f405742b = new byte[i12 * i13];
        }
        byte[] bArr2 = this.f405742b;
        if (bArr2 != null) {
            return bArr2;
        }
        L.k();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x02b2, code lost:
    
        r11 = r2;
        r18 = r4;
        r19 = r13;
        r13 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02b8, code lost:
    
        r21 = r12;
        r12 = r8;
        r20 = r9;
        r22 = r11;
        r11 = r10;
        r2 = r19 - jc1.C42359b.a.b(jc1.C42359b.f405740i, r10, r18, r8, r12, r19, r19 - 1, r9, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02d6, code lost:
    
        if (r2 == 0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02d8, code lost:
    
        r23 = r23 - r2;
        r1 = r1 - r2;
        r3 = r19 - r2;
        java.lang.System.arraycopy(r12, (r1 + 1) * r20, r12, (r23 + 1) * r20, r2 * r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02ea, code lost:
    
        if (r3 != 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02ec, code lost:
    
        r4 = r18;
        r7 = r20;
        r2 = r22;
        r8 = 1;
        r33 = r13;
        r13 = r3;
        r3 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02fa, code lost:
    
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02fc, code lost:
    
        r9 = r23 * r20;
        r4 = r18 * r20;
        r7 = r20;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0303, code lost:
    
        if (r10 >= r7) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0305, code lost:
    
        r12[r9 + r10] = r11[r4 + r10];
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0310, code lost:
    
        r23 = r23 - 1;
        r4 = r18 - 1;
        r5 = r13 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0317, code lost:
    
        if (r5 != 1) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0319, code lost:
    
        r13 = r3;
        r3 = r5;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x031c, code lost:
    
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x031f, code lost:
    
        r6 = r5 - jc1.C42359b.a.a(jc1.C42359b.f405740i, r12, r1, r11, 0, r5, r13 - 2, r7, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0337, code lost:
    
        if (r6 == 0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0339, code lost:
    
        r23 = r23 - r6;
        r4 = r4 - r6;
        r5 = r5 - r6;
        java.lang.System.arraycopy(r11, (r4 + 1) * r7, r12, (r23 + 1) * r7, r6 * r7);
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0349, code lost:
    
        if (r5 > 1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x034b, code lost:
    
        r13 = r3;
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x034e, code lost:
    
        r18 = r4;
        r13 = r5;
        r9 = r23 * r7;
        r4 = r1 * r7;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0356, code lost:
    
        if (r10 >= r7) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0358, code lost:
    
        r12[r9 + r10] = r12[r4 + r10];
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0363, code lost:
    
        r23 = r23 - 1;
        r1 = r1 - 1;
        r19 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0369, code lost:
    
        if (r19 != 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x036b, code lost:
    
        r3 = r13;
        r4 = r18;
        r13 = r19;
        r2 = r22;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x03af, code lost:
    
        r3 = r22 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03b4, code lost:
    
        if (r2 < 7) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03b6, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03b8, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03b9, code lost:
    
        if (r6 < 7) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03bb, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03bd, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03bf, code lost:
    
        if ((r2 | r4) != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03c1, code lost:
    
        if (r3 >= 0) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03c3, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03d8, code lost:
    
        r9 = r7;
        r10 = r11;
        r8 = r12;
        r12 = r21;
        r11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00eb, code lost:
    
        r4 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0118, code lost:
    
        r4 = jc1.C42359b.a.b(jc1.C42359b.f405740i, r10, r23, r1, r16, r17, 0, r2, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012e, code lost:
    
        if (r4 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0130, code lost:
    
        java.lang.System.arraycopy(r1, r16 * r2, r10, r13 * r2, r4 * r2);
        r13 = r13 + r4;
        r16 = r16 + r4;
        r5 = r17 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013e, code lost:
    
        if (r5 > 1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0140, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0142, code lost:
    
        r17 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0144, code lost:
    
        r5 = r13 * r2;
        r6 = r23 * r2;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0149, code lost:
    
        if (r7 >= r2) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014b, code lost:
    
        r10[r5 + r7] = r10[r6 + r7];
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0156, code lost:
    
        r13 = r13 + 1;
        r23 = r23 + 1;
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015c, code lost:
    
        if (r3 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015f, code lost:
    
        r5 = jc1.C42359b.a.a(jc1.C42359b.f405740i, r1, r16, r10, r23, r3, 0, r2, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0175, code lost:
    
        if (r5 == 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0177, code lost:
    
        java.lang.System.arraycopy(r10, r23 * r2, r10, r13 * r2, r5 * r2);
        r13 = r13 + r5;
        r23 = r23 + r5;
        r3 = r3 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0184, code lost:
    
        if (r3 != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0188, code lost:
    
        r6 = r13 * r2;
        r7 = r16 * r2;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018d, code lost:
    
        if (r8 >= r2) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x018f, code lost:
    
        r10[r6 + r8] = r1[r7 + r8];
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019a, code lost:
    
        r13 = r13 + 1;
        r16 = r16 + 1;
        r6 = r17 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a0, code lost:
    
        if (r6 != 1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a2, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d6, code lost:
    
        r12 = r12 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d8, code lost:
    
        if (r4 < 7) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01da, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01dc, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01dd, code lost:
    
        if (r5 < 7) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01df, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e1, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e3, code lost:
    
        if ((r4 | r5) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01e5, code lost:
    
        if (r12 >= 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01e7, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01f2, code lost:
    
        r17 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03e0 A[LOOP:13: B:104:0x0255->B:173:0x03e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02b2 A[EDGE_INSN: B:201:0x02b2->B:122:0x02b2 BREAK  A[LOOP:13: B:104:0x0255->B:173:0x03e0], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r35) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jc1.C42359b.b(int):void");
    }
}
