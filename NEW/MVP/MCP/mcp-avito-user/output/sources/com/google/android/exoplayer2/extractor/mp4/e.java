package com.google.android.exoplayer2.extractor.mp4;

import android.util.SparseArray;
import androidx.camera.camera2.internal.G;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.A;
import com.google.android.exoplayer2.extractor.mp4.a;
import com.google.android.exoplayer2.extractor.mp4.h;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.O;
import com.google.android.exoplayer2.util.U;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: FragmentedMp4Extractor.java */
/* loaded from: classes6.dex */
public class e implements com.google.android.exoplayer2.extractor.j {

    /* renamed from: G, reason: collision with root package name */
    public static final byte[] f344779G = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: H, reason: collision with root package name */
    public static final I f344780H;

    /* renamed from: A, reason: collision with root package name */
    public int f344781A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f344782B;

    /* renamed from: C, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.l f344783C;

    /* renamed from: D, reason: collision with root package name */
    public A[] f344784D;

    /* renamed from: E, reason: collision with root package name */
    public A[] f344785E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f344786F;

    /* renamed from: a, reason: collision with root package name */
    public final int f344787a;

    /* renamed from: b, reason: collision with root package name */
    public final List<I> f344788b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray<c> f344789c;

    /* renamed from: d, reason: collision with root package name */
    public final F f344790d;

    /* renamed from: e, reason: collision with root package name */
    public final F f344791e;

    /* renamed from: f, reason: collision with root package name */
    public final F f344792f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f344793g;

    /* renamed from: h, reason: collision with root package name */
    public final F f344794h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public final O f344795i;

    /* renamed from: j, reason: collision with root package name */
    public final com.google.android.exoplayer2.metadata.emsg.b f344796j;

    /* renamed from: k, reason: collision with root package name */
    public final F f344797k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayDeque<a.C10581a> f344798l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque<b> f344799m;

    /* renamed from: n, reason: collision with root package name */
    public int f344800n;

    /* renamed from: o, reason: collision with root package name */
    public int f344801o;

    /* renamed from: p, reason: collision with root package name */
    public long f344802p;

    /* renamed from: q, reason: collision with root package name */
    public int f344803q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public F f344804r;

    /* renamed from: s, reason: collision with root package name */
    public long f344805s;

    /* renamed from: t, reason: collision with root package name */
    public int f344806t;

    /* renamed from: u, reason: collision with root package name */
    public long f344807u;

    /* renamed from: v, reason: collision with root package name */
    public long f344808v;

    /* renamed from: w, reason: collision with root package name */
    public long f344809w;

    /* renamed from: x, reason: collision with root package name */
    @P
    public c f344810x;

    /* renamed from: y, reason: collision with root package name */
    public int f344811y;

    /* renamed from: z, reason: collision with root package name */
    public int f344812z;

    /* compiled from: FragmentedMp4Extractor.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: FragmentedMp4Extractor.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f344813a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f344814b;

        /* renamed from: c, reason: collision with root package name */
        public final int f344815c;

        public b(int i12, long j12, boolean z12) {
            this.f344813a = j12;
            this.f344814b = z12;
            this.f344815c = i12;
        }
    }

    /* compiled from: FragmentedMp4Extractor.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final A f344816a;

        /* renamed from: d, reason: collision with root package name */
        public n f344819d;

        /* renamed from: e, reason: collision with root package name */
        public com.google.android.exoplayer2.extractor.mp4.c f344820e;

        /* renamed from: f, reason: collision with root package name */
        public int f344821f;

        /* renamed from: g, reason: collision with root package name */
        public int f344822g;

        /* renamed from: h, reason: collision with root package name */
        public int f344823h;

        /* renamed from: i, reason: collision with root package name */
        public int f344824i;

        /* renamed from: l, reason: collision with root package name */
        public boolean f344827l;

        /* renamed from: b, reason: collision with root package name */
        public final m f344817b = new m();

        /* renamed from: c, reason: collision with root package name */
        public final F f344818c = new F();

        /* renamed from: j, reason: collision with root package name */
        public final F f344825j = new F(1);

        /* renamed from: k, reason: collision with root package name */
        public final F f344826k = new F();

        public c(A a12, n nVar, com.google.android.exoplayer2.extractor.mp4.c cVar) {
            this.f344816a = a12;
            this.f344819d = nVar;
            this.f344820e = cVar;
            this.f344819d = nVar;
            this.f344820e = cVar;
            a12.a(nVar.f344901a.f344873f);
            d();
        }

        @P
        public final l a() {
            if (!this.f344827l) {
                return null;
            }
            m mVar = this.f344817b;
            com.google.android.exoplayer2.extractor.mp4.c cVar = mVar.f344884a;
            int i12 = U.f348106a;
            int i13 = cVar.f344769a;
            l lVar = mVar.f344896m;
            if (lVar == null) {
                lVar = this.f344819d.f344901a.f344878k[i13];
            }
            if (lVar == null || !lVar.f344879a) {
                return null;
            }
            return lVar;
        }

        public final boolean b() {
            this.f344821f++;
            if (!this.f344827l) {
                return false;
            }
            int i12 = this.f344822g + 1;
            this.f344822g = i12;
            int[] iArr = this.f344817b.f344890g;
            int i13 = this.f344823h;
            if (i12 != iArr[i13]) {
                return true;
            }
            this.f344823h = i13 + 1;
            this.f344822g = 0;
            return false;
        }

        public final int c(int i12, int i13) {
            F f12;
            l lVarA = a();
            if (lVarA == null) {
                return 0;
            }
            m mVar = this.f344817b;
            int length = lVarA.f344882d;
            if (length != 0) {
                f12 = mVar.f344897n;
            } else {
                int i14 = U.f348106a;
                byte[] bArr = lVarA.f344883e;
                int length2 = bArr.length;
                F f13 = this.f344826k;
                f13.z(length2, bArr);
                length = bArr.length;
                f12 = f13;
            }
            boolean z12 = mVar.f344894k && mVar.f344895l[this.f344821f];
            boolean z13 = z12 || i13 != 0;
            F f14 = this.f344825j;
            f14.f348070a[0] = (byte) ((z13 ? 128 : 0) | length);
            f14.B(0);
            A a12 = this.f344816a;
            a12.e(1, f14);
            a12.e(length, f12);
            if (!z13) {
                return length + 1;
            }
            F f15 = this.f344818c;
            if (!z12) {
                f15.y(8);
                byte[] bArr2 = f15.f348070a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) 0;
                bArr2[3] = (byte) (i13 & 255);
                bArr2[4] = (byte) ((i12 >> 24) & 255);
                bArr2[5] = (byte) ((i12 >> 16) & 255);
                bArr2[6] = (byte) ((i12 >> 8) & 255);
                bArr2[7] = (byte) (i12 & 255);
                a12.e(8, f15);
                return length + 9;
            }
            F f16 = mVar.f344897n;
            int iW2 = f16.w();
            f16.C(-2);
            int i15 = (iW2 * 6) + 2;
            if (i13 != 0) {
                f15.y(i15);
                byte[] bArr3 = f15.f348070a;
                f16.c(0, i15, bArr3);
                int i16 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i13;
                bArr3[2] = (byte) ((i16 >> 8) & 255);
                bArr3[3] = (byte) (i16 & 255);
            } else {
                f15 = f16;
            }
            a12.e(i15, f15);
            return length + 1 + i15;
        }

        public final void d() {
            m mVar = this.f344817b;
            mVar.f344887d = 0;
            mVar.f344899p = 0L;
            mVar.f344900q = false;
            mVar.f344894k = false;
            mVar.f344898o = false;
            mVar.f344896m = null;
            this.f344821f = 0;
            this.f344823h = 0;
            this.f344822g = 0;
            this.f344824i = 0;
            this.f344827l = false;
        }
    }

    static {
        I.b bVar = new I.b();
        bVar.f343504k = "application/x-emsg";
        f344780H = bVar.a();
    }

    public e() {
        this(0);
    }

    @P
    public static DrmInitData c(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i12 = 0; i12 < size; i12++) {
            a.b bVar = (a.b) arrayList.get(i12);
            if (bVar.f344737a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.f344741b.f348070a;
                h.a aVarB = h.b(bArr);
                UUID uuid = aVarB == null ? null : aVarB.f344857a;
                if (uuid != null) {
                    arrayList2.add(new DrmInitData.SchemeData(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList2.toArray(new DrmInitData.SchemeData[0]));
    }

    public static void d(F f12, int i12, m mVar) throws ParserException {
        f12.B(i12 + 8);
        int iD2 = f12.d();
        if ((iD2 & 1) != 0) {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z12 = (iD2 & 2) != 0;
        int iU2 = f12.u();
        if (iU2 == 0) {
            Arrays.fill(mVar.f344895l, 0, mVar.f344888e, false);
            return;
        }
        if (iU2 != mVar.f344888e) {
            StringBuilder sbJ = G.j(iU2, "Senc sample count ", " is different from fragment sample count");
            sbJ.append(mVar.f344888e);
            throw ParserException.a(sbJ.toString(), null);
        }
        Arrays.fill(mVar.f344895l, 0, iU2, z12);
        int iA2 = f12.a();
        F f13 = mVar.f344897n;
        f13.y(iA2);
        mVar.f344894k = true;
        mVar.f344898o = true;
        f12.c(0, f13.f348072c, f13.f348070a);
        f13.B(0);
        mVar.f344898o = false;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void a(long j12, long j13) {
        SparseArray<c> sparseArray = this.f344789c;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            sparseArray.valueAt(i12).d();
        }
        this.f344799m.clear();
        this.f344806t = 0;
        this.f344807u = j13;
        this.f344798l.clear();
        this.f344800n = 0;
        this.f344803q = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void b(com.google.android.exoplayer2.extractor.l lVar) {
        int i12;
        this.f344783C = lVar;
        int i13 = 0;
        this.f344800n = 0;
        this.f344803q = 0;
        A[] aArr = new A[2];
        this.f344784D = aArr;
        int i14 = 100;
        if ((this.f344787a & 4) != 0) {
            aArr[0] = lVar.c(100, 5);
            i12 = 1;
            i14 = UpdateStatusCode.DialogButton.CONFIRM;
        } else {
            i12 = 0;
        }
        A[] aArr2 = (A[]) U.J(i12, this.f344784D);
        this.f344784D = aArr2;
        for (A a12 : aArr2) {
            a12.a(f344780H);
        }
        List<I> list = this.f344788b;
        this.f344785E = new A[list.size()];
        while (i13 < this.f344785E.length) {
            A aC2 = this.f344783C.c(i14, 3);
            aC2.a(list.get(i13));
            this.f344785E[i13] = aC2;
            i13++;
            i14++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:333:0x0791, code lost:
    
        r4 = r0;
        r4.f344800n = 0;
        r4.f344803q = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0797, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r51) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 1944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.e.e(long):void");
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final boolean h(com.google.android.exoplayer2.extractor.k kVar) {
        return j.a(kVar, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f3, code lost:
    
        if (((r13 & 126) >> 1) != 39) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f5, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f7, code lost:
    
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fa, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fb, code lost:
    
        r30.f344782B = r3;
        r30.f344812z += 5;
        r30.f344811y += r7;
        r3 = r18;
        r10 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020c, code lost:
    
        r13 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0217, code lost:
    
        throw com.google.android.exoplayer2.ParserException.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0218, code lost:
    
        r18 = r3;
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x021f, code lost:
    
        if (r30.f344782B == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0221, code lost:
    
        r3 = r30.f344792f;
        r3.y(r4);
        r21 = r7;
        r22 = r14;
        ((com.google.android.exoplayer2.extractor.f) r31).d(r3.f348070a, 0, r30.f344781A, false);
        r11.c(r30.f344781A, r3);
        r4 = r30.f344781A;
        r7 = com.google.android.exoplayer2.util.A.e(r3.f348072c, r3.f348070a);
        r3.B("video/hevc".equals(r13.f343476m) ? 1 : 0);
        r3.A(r7);
        com.google.android.exoplayer2.extractor.C36513c.a(r8, r3, r30.f344785E);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0256, code lost:
    
        r21 = r7;
        r22 = r14;
        r4 = r11.b(r31, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x025f, code lost:
    
        r30.f344812z += r4;
        r30.f344781A -= r4;
        r3 = r18;
        r10 = r20;
        r7 = r21;
        r14 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0272, code lost:
    
        r27 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0275, code lost:
    
        r27 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0277, code lost:
    
        r3 = r30.f344812z;
        r4 = r30.f344811y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x027b, code lost:
    
        if (r3 >= r4) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x027d, code lost:
    
        r30.f344812z += r11.b(r31, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x028b, code lost:
    
        if (r2.f344827l != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x028d, code lost:
    
        r5 = r2.f344819d.f344907g[r2.f344821f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x029c, code lost:
    
        if (r5.f344893j[r2.f344821f] == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x029e, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a0, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02a5, code lost:
    
        if (r2.a() == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02a7, code lost:
    
        r23 = 1073741824 | r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02ad, code lost:
    
        r23 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02af, code lost:
    
        r0 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b3, code lost:
    
        if (r0 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b5, code lost:
    
        r26 = r0.f344881c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02ba, code lost:
    
        r26 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02bc, code lost:
    
        r11.f(r8, r23, r30.f344811y, 0, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02cd, code lost:
    
        if (r12.isEmpty() != false) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02cf, code lost:
    
        r0 = r12.removeFirst();
        r30.f344806t -= r0.f344815c;
        r3 = r0.f344814b;
        r4 = r0.f344813a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e0, code lost:
    
        if (r3 == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e2, code lost:
    
        r4 = r4 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02e3, code lost:
    
        r6 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02e5, code lost:
    
        if (r27 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02e7, code lost:
    
        r4 = r6.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02eb, code lost:
    
        r3 = r30.f344784D;
        r7 = r3.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02ef, code lost:
    
        if (r10 >= r7) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f1, code lost:
    
        r3[r10].f(r4, 1, r0.f344815c, r30.f344806t, null);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0307, code lost:
    
        r27 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x030e, code lost:
    
        if (r2.b() != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0310, code lost:
    
        r30.f344810x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0313, code lost:
    
        r30.f344800n = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0317, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
    
        r3 = r30.f344800n;
        r5 = r2.f344817b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        if (r3 != 3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bd, code lost:
    
        if (r2.f344827l != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bf, code lost:
    
        r3 = r2.f344819d.f344904d[r2.f344821f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c8, code lost:
    
        r3 = r5.f344891h[r2.f344821f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ce, code lost:
    
        r30.f344811y = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
    
        if (r2.f344821f >= r2.f344824i) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
    
        ((com.google.android.exoplayer2.extractor.f) r31).i(r3);
        r0 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00df, code lost:
    
        if (r0 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e2, code lost:
    
        r3 = r5.f344897n;
        r0 = r0.f344882d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e6, code lost:
    
        if (r0 == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e8, code lost:
    
        r3.C(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00eb, code lost:
    
        r0 = r2.f344821f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ef, code lost:
    
        if (r5.f344894k == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f5, code lost:
    
        if (r5.f344895l[r0] == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f7, code lost:
    
        r3.C(r3.w() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0103, code lost:
    
        if (r2.b() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0105, code lost:
    
        r30.f344810x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0107, code lost:
    
        r30.f344800n = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0114, code lost:
    
        if (r2.f344819d.f344901a.f344874g != 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0116, code lost:
    
        r30.f344811y = r3 - 8;
        ((com.google.android.exoplayer2.extractor.f) r31).i(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012f, code lost:
    
        if ("audio/ac4".equals(r2.f344819d.f344901a.f344873f.f343476m) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0131, code lost:
    
        r30.f344812z = r2.c(r30.f344811y, 7);
        r3 = r30.f344811y;
        r8 = r30.f344794h;
        com.google.android.exoplayer2.audio.C36505c.a(r3, r8);
        r2.f344816a.c(7, r8);
        r30.f344812z += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014c, code lost:
    
        r30.f344812z = r2.c(r30.f344811y, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0154, code lost:
    
        r30.f344811y += r30.f344812z;
        r30.f344800n = 4;
        r30.f344781A = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0160, code lost:
    
        r3 = r2.f344819d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0164, code lost:
    
        if (r2.f344827l != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0166, code lost:
    
        r8 = r3.f344906f[r2.f344821f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016d, code lost:
    
        r8 = r5.f344892i[r2.f344821f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0174, code lost:
    
        if (r13 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0176, code lost:
    
        r8 = r13.a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017a, code lost:
    
        r3 = r3.f344901a;
        r7 = r3.f344877j;
        r11 = r2.f344816a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0180, code lost:
    
        if (r7 == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0182, code lost:
    
        r14 = r30.f344791e;
        r15 = r14.f348070a;
        r15[0] = 0;
        r15[1] = 0;
        r15[2] = 0;
        r10 = r7 + 1;
        r7 = 4 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019a, code lost:
    
        if (r30.f344812z >= r30.f344811y) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019c, code lost:
    
        r4 = r30.f344781A;
        r27 = r13;
        r13 = r3.f344873f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a4, code lost:
    
        if (r4 != 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a6, code lost:
    
        r18 = r3;
        ((com.google.android.exoplayer2.extractor.f) r31).d(r15, r7, r10, false);
        r14.B(0);
        r4 = r14.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b7, code lost:
    
        if (r4 < 1) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b9, code lost:
    
        r30.f344781A = r4 - 1;
        r4 = r30.f344790d;
        r4.B(0);
        r11.c(4, r4);
        r11.c(1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ce, code lost:
    
        if (r30.f344785E.length <= 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d0, code lost:
    
        r4 = r13.f343476m;
        r13 = r15[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01da, code lost:
    
        if ("video/avc".equals(r4) == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01dc, code lost:
    
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e1, code lost:
    
        if ((r13 & 31) == 6) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e4, code lost:
    
        r20 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01eb, code lost:
    
        if ("video/hevc".equals(r4) == false) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.extractor.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(com.google.android.exoplayer2.extractor.k r31, com.google.android.exoplayer2.extractor.w r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.e.i(com.google.android.exoplayer2.extractor.k, com.google.android.exoplayer2.extractor.w):int");
    }

    public e(int i12) {
        this(0, null, Collections.emptyList());
    }

    public e(int i12, @P O o12, List list) {
        this.f344787a = i12;
        this.f344795i = o12;
        this.f344788b = Collections.unmodifiableList(list);
        this.f344796j = new com.google.android.exoplayer2.metadata.emsg.b();
        this.f344797k = new F(16);
        this.f344790d = new F(com.google.android.exoplayer2.util.A.f348026a);
        this.f344791e = new F(5);
        this.f344792f = new F();
        byte[] bArr = new byte[16];
        this.f344793g = bArr;
        this.f344794h = new F(bArr);
        this.f344798l = new ArrayDeque<>();
        this.f344799m = new ArrayDeque<>();
        this.f344789c = new SparseArray<>();
        this.f344808v = -9223372036854775807L;
        this.f344807u = -9223372036854775807L;
        this.f344809w = -9223372036854775807L;
        this.f344783C = com.google.android.exoplayer2.extractor.l.f344575h2;
        this.f344784D = new A[0];
        this.f344785E = new A[0];
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void release() {
    }
}
