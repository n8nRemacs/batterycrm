package androidx.media3.extractor.mp4;

import android.util.SparseArray;
import androidx.camera.camera2.internal.G;
import androidx.media3.common.C23108t;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.s;
import androidx.media3.common.util.z;
import androidx.media3.extractor.mp4.a;
import androidx.media3.extractor.mp4.h;
import androidx.media3.extractor.p;
import androidx.media3.extractor.q;
import androidx.media3.extractor.r;
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
@J
/* loaded from: classes.dex */
public class e implements p {

    /* renamed from: E, reason: collision with root package name */
    public static final byte[] f50954E = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: F, reason: collision with root package name */
    public static final C23108t f50955F;

    /* renamed from: A, reason: collision with root package name */
    public r f50956A;

    /* renamed from: B, reason: collision with root package name */
    public androidx.media3.extractor.J[] f50957B;

    /* renamed from: C, reason: collision with root package name */
    public androidx.media3.extractor.J[] f50958C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f50959D;

    /* renamed from: a, reason: collision with root package name */
    public final List<C23108t> f50960a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray<c> f50961b;

    /* renamed from: c, reason: collision with root package name */
    public final z f50962c;

    /* renamed from: d, reason: collision with root package name */
    public final z f50963d;

    /* renamed from: e, reason: collision with root package name */
    public final z f50964e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f50965f;

    /* renamed from: g, reason: collision with root package name */
    public final z f50966g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.media3.extractor.metadata.emsg.b f50967h;

    /* renamed from: i, reason: collision with root package name */
    public final z f50968i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque<a.C1856a> f50969j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayDeque<b> f50970k;

    /* renamed from: l, reason: collision with root package name */
    public int f50971l;

    /* renamed from: m, reason: collision with root package name */
    public int f50972m;

    /* renamed from: n, reason: collision with root package name */
    public long f50973n;

    /* renamed from: o, reason: collision with root package name */
    public int f50974o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public z f50975p;

    /* renamed from: q, reason: collision with root package name */
    public long f50976q;

    /* renamed from: r, reason: collision with root package name */
    public int f50977r;

    /* renamed from: s, reason: collision with root package name */
    public long f50978s;

    /* renamed from: t, reason: collision with root package name */
    public long f50979t;

    /* renamed from: u, reason: collision with root package name */
    public long f50980u;

    /* renamed from: v, reason: collision with root package name */
    @P
    public c f50981v;

    /* renamed from: w, reason: collision with root package name */
    public int f50982w;

    /* renamed from: x, reason: collision with root package name */
    public int f50983x;

    /* renamed from: y, reason: collision with root package name */
    public int f50984y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f50985z;

    /* compiled from: FragmentedMp4Extractor.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: FragmentedMp4Extractor.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f50986a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f50987b;

        /* renamed from: c, reason: collision with root package name */
        public final int f50988c;

        public b(int i12, long j12, boolean z12) {
            this.f50986a = j12;
            this.f50987b = z12;
            this.f50988c = i12;
        }
    }

    /* compiled from: FragmentedMp4Extractor.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.extractor.J f50989a;

        /* renamed from: d, reason: collision with root package name */
        public n f50992d;

        /* renamed from: e, reason: collision with root package name */
        public androidx.media3.extractor.mp4.c f50993e;

        /* renamed from: f, reason: collision with root package name */
        public int f50994f;

        /* renamed from: g, reason: collision with root package name */
        public int f50995g;

        /* renamed from: h, reason: collision with root package name */
        public int f50996h;

        /* renamed from: i, reason: collision with root package name */
        public int f50997i;

        /* renamed from: l, reason: collision with root package name */
        public boolean f51000l;

        /* renamed from: b, reason: collision with root package name */
        public final m f50990b = new m();

        /* renamed from: c, reason: collision with root package name */
        public final z f50991c = new z();

        /* renamed from: j, reason: collision with root package name */
        public final z f50998j = new z(1);

        /* renamed from: k, reason: collision with root package name */
        public final z f50999k = new z();

        public c(androidx.media3.extractor.J j12, n nVar, androidx.media3.extractor.mp4.c cVar) {
            this.f50989a = j12;
            this.f50992d = nVar;
            this.f50993e = cVar;
            this.f50992d = nVar;
            this.f50993e = cVar;
            j12.b(nVar.f51074a.f51046f);
            d();
        }

        @P
        public final l a() {
            if (!this.f51000l) {
                return null;
            }
            m mVar = this.f50990b;
            androidx.media3.extractor.mp4.c cVar = mVar.f51057a;
            int i12 = M.f47887a;
            int i13 = cVar.f50944a;
            l lVar = mVar.f51069m;
            if (lVar == null) {
                lVar = this.f50992d.f51074a.f51051k[i13];
            }
            if (lVar == null || !lVar.f51052a) {
                return null;
            }
            return lVar;
        }

        public final boolean b() {
            this.f50994f++;
            if (!this.f51000l) {
                return false;
            }
            int i12 = this.f50995g + 1;
            this.f50995g = i12;
            int[] iArr = this.f50990b.f51063g;
            int i13 = this.f50996h;
            if (i12 != iArr[i13]) {
                return true;
            }
            this.f50996h = i13 + 1;
            this.f50995g = 0;
            return false;
        }

        public final int c(int i12, int i13) {
            z zVar;
            l lVarA = a();
            if (lVarA == null) {
                return 0;
            }
            m mVar = this.f50990b;
            int length = lVarA.f51055d;
            if (length != 0) {
                zVar = mVar.f51070n;
            } else {
                int i14 = M.f47887a;
                byte[] bArr = lVarA.f51056e;
                int length2 = bArr.length;
                z zVar2 = this.f50999k;
                zVar2.D(length2, bArr);
                length = bArr.length;
                zVar = zVar2;
            }
            boolean z12 = mVar.f51067k && mVar.f51068l[this.f50994f];
            boolean z13 = z12 || i13 != 0;
            z zVar3 = this.f50998j;
            zVar3.f47962a[0] = (byte) ((z13 ? 128 : 0) | length);
            zVar3.F(0);
            androidx.media3.extractor.J j12 = this.f50989a;
            j12.d(1, zVar3);
            j12.d(length, zVar);
            if (!z13) {
                return length + 1;
            }
            z zVar4 = this.f50991c;
            if (!z12) {
                zVar4.C(8);
                byte[] bArr2 = zVar4.f47962a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) 0;
                bArr2[3] = (byte) (i13 & 255);
                bArr2[4] = (byte) ((i12 >> 24) & 255);
                bArr2[5] = (byte) ((i12 >> 16) & 255);
                bArr2[6] = (byte) ((i12 >> 8) & 255);
                bArr2[7] = (byte) (i12 & 255);
                j12.d(8, zVar4);
                return length + 9;
            }
            z zVar5 = mVar.f51070n;
            int iZ2 = zVar5.z();
            zVar5.G(-2);
            int i15 = (iZ2 * 6) + 2;
            if (i13 != 0) {
                zVar4.C(i15);
                byte[] bArr3 = zVar4.f47962a;
                zVar5.e(0, i15, bArr3);
                int i16 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i13;
                bArr3[2] = (byte) ((i16 >> 8) & 255);
                bArr3[3] = (byte) (i16 & 255);
            } else {
                zVar4 = zVar5;
            }
            j12.d(i15, zVar4);
            return length + 1 + i15;
        }

        public final void d() {
            m mVar = this.f50990b;
            mVar.f51060d = 0;
            mVar.f51072p = 0L;
            mVar.f51073q = false;
            mVar.f51067k = false;
            mVar.f51071o = false;
            mVar.f51069m = null;
            this.f50994f = 0;
            this.f50996h = 0;
            this.f50995g = 0;
            this.f50997i = 0;
            this.f51000l = false;
        }
    }

    static {
        C23108t.b bVar = new C23108t.b();
        bVar.f47787k = "application/x-emsg";
        f50955F = bVar.a();
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
            if (bVar.f50910a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.f50914b.f47962a;
                h.a aVarA = h.a(bArr);
                UUID uuid = aVarA == null ? null : aVarA.f51030a;
                if (uuid == null) {
                    s.g();
                } else {
                    arrayList2.add(new DrmInitData.SchemeData(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList2.toArray(new DrmInitData.SchemeData[0]));
    }

    public static void d(z zVar, int i12, m mVar) throws ParserException {
        zVar.F(i12 + 8);
        int iG2 = zVar.g();
        if ((iG2 & 1) != 0) {
            throw ParserException.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z12 = (iG2 & 2) != 0;
        int iX2 = zVar.x();
        if (iX2 == 0) {
            Arrays.fill(mVar.f51068l, 0, mVar.f51061e, false);
            return;
        }
        if (iX2 != mVar.f51061e) {
            StringBuilder sbJ = G.j(iX2, "Senc sample count ", " is different from fragment sample count");
            sbJ.append(mVar.f51061e);
            throw ParserException.a(sbJ.toString(), null);
        }
        Arrays.fill(mVar.f51068l, 0, iX2, z12);
        int iA2 = zVar.a();
        z zVar2 = mVar.f51070n;
        zVar2.C(iA2);
        mVar.f51067k = true;
        mVar.f51071o = true;
        zVar.e(0, zVar2.f47964c, zVar2.f47962a);
        zVar2.F(0);
        mVar.f51071o = false;
    }

    @Override // androidx.media3.extractor.p
    public final void a(long j12, long j13) {
        SparseArray<c> sparseArray = this.f50961b;
        int size = sparseArray.size();
        for (int i12 = 0; i12 < size; i12++) {
            sparseArray.valueAt(i12).d();
        }
        this.f50970k.clear();
        this.f50977r = 0;
        this.f50978s = j13;
        this.f50969j.clear();
        this.f50971l = 0;
        this.f50974o = 0;
    }

    @Override // androidx.media3.extractor.p
    public final boolean b(q qVar) {
        return j.a(qVar, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:327:0x0778, code lost:
    
        r11 = r0;
        r11.f50971l = 0;
        r11.f50974o = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x077e, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r46) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.e.e(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ec, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ee, code lost:
    
        r19 = r13;
        r13 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f1, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f2, code lost:
    
        r28.f50985z = r3;
        r28.f50983x += 5;
        r28.f50982w += r7;
        r3 = r17;
        r13 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020d, code lost:
    
        throw androidx.media3.common.ParserException.a("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x020e, code lost:
    
        r17 = r3;
        r19 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0215, code lost:
    
        if (r28.f50985z == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0217, code lost:
    
        r3 = r28.f50964e;
        r3.C(r4);
        r20 = r7;
        r21 = r14;
        ((androidx.media3.extractor.C23191j) r29).d(r3.f47962a, 0, r28.f50984y, false);
        r11.e(r28.f50984y, r3);
        r4 = r28.f50984y;
        r7 = androidx.media3.container.b.e(r3.f47964c, r3.f47962a);
        r3.F("video/hevc".equals(r6.f47757m) ? 1 : 0);
        r3.E(r7);
        androidx.media3.extractor.C23188g.a(r8, r3, r28.f50958C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x024c, code lost:
    
        r20 = r7;
        r21 = r14;
        r4 = r11.a(r29, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0255, code lost:
    
        r28.f50983x += r4;
        r28.f50984y -= r4;
        r3 = r17;
        r13 = r19;
        r7 = r20;
        r14 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0269, code lost:
    
        r3 = r28.f50983x;
        r4 = r28.f50982w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x026d, code lost:
    
        if (r3 >= r4) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x026f, code lost:
    
        r28.f50983x += r11.a(r29, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x027d, code lost:
    
        if (r2.f51000l != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x027f, code lost:
    
        r5 = r2.f50992d.f51080g[r2.f50994f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x028e, code lost:
    
        if (r5.f51066j[r2.f50994f] == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0290, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0292, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0297, code lost:
    
        if (r2.a() == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0299, code lost:
    
        r22 = 1073741824 | r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x029f, code lost:
    
        r22 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02a1, code lost:
    
        r0 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02a5, code lost:
    
        if (r0 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02a7, code lost:
    
        r25 = r0.f51054c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02ac, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02ae, code lost:
    
        r11.f(r8, r22, r28.f50982w, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02bf, code lost:
    
        if (r12.isEmpty() != false) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c1, code lost:
    
        r0 = r12.removeFirst();
        r28.f50977r -= r0.f50988c;
        r3 = r0.f50987b;
        r4 = r0.f50986a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02d2, code lost:
    
        if (r3 == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02d4, code lost:
    
        r4 = r4 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02d5, code lost:
    
        r3 = r28.f50957B;
        r6 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02d9, code lost:
    
        if (r7 >= r6) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02db, code lost:
    
        r3[r7].f(r4, 1, r0.f50988c, r28.f50977r, null);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02f5, code lost:
    
        if (r2.b() != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02f7, code lost:
    
        r28.f50981v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02fa, code lost:
    
        r28.f50971l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02fe, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b4, code lost:
    
        r3 = r28.f50971l;
        r5 = r2.f50990b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ba, code lost:
    
        if (r3 != 3) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00be, code lost:
    
        if (r2.f51000l != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c0, code lost:
    
        r3 = r2.f50992d.f51077d[r2.f50994f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c9, code lost:
    
        r3 = r5.f51064h[r2.f50994f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cf, code lost:
    
        r28.f50982w = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        if (r2.f50994f >= r2.f50997i) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d7, code lost:
    
        ((androidx.media3.extractor.C23191j) r29).i(r3);
        r0 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e0, code lost:
    
        if (r0 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e3, code lost:
    
        r3 = r5.f51070n;
        r0 = r0.f51055d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
    
        if (r0 == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
    
        r3.G(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ec, code lost:
    
        r0 = r2.f50994f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f0, code lost:
    
        if (r5.f51067k == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f6, code lost:
    
        if (r5.f51068l[r0] == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f8, code lost:
    
        r3.G(r3.z() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0104, code lost:
    
        if (r2.b() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0106, code lost:
    
        r28.f50981v = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0108, code lost:
    
        r28.f50971l = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0115, code lost:
    
        if (r2.f50992d.f51074a.f51047g != 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0117, code lost:
    
        r28.f50982w = r3 - 8;
        ((androidx.media3.extractor.C23191j) r29).i(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0130, code lost:
    
        if ("audio/ac4".equals(r2.f50992d.f51074a.f51046f.f47757m) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0132, code lost:
    
        r28.f50983x = r2.c(r28.f50982w, 7);
        r3 = r28.f50982w;
        r8 = r28.f50966g;
        androidx.media3.extractor.C23184c.a(r3, r8);
        r2.f50989a.e(7, r8);
        r28.f50983x += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014d, code lost:
    
        r28.f50983x = r2.c(r28.f50982w, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0155, code lost:
    
        r28.f50982w += r28.f50983x;
        r28.f50971l = 4;
        r28.f50984y = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0161, code lost:
    
        r3 = r2.f50992d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0165, code lost:
    
        if (r2.f51000l != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0167, code lost:
    
        r8 = r3.f51079f[r2.f50994f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016e, code lost:
    
        r8 = r5.f51065i[r2.f50994f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0175, code lost:
    
        r3 = r3.f51074a;
        r7 = r3.f51050j;
        r11 = r2.f50989a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017b, code lost:
    
        if (r7 == 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017d, code lost:
    
        r13 = r28.f50963d;
        r14 = r13.f47962a;
        r14[0] = 0;
        r14[1] = 0;
        r14[2] = 0;
        r15 = r7 + 1;
        r7 = 4 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0193, code lost:
    
        if (r28.f50983x >= r28.f50982w) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0195, code lost:
    
        r4 = r28.f50984y;
        r6 = r3.f51046f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019b, code lost:
    
        if (r4 != 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019d, code lost:
    
        r17 = r3;
        ((androidx.media3.extractor.C23191j) r29).d(r14, r7, r15, false);
        r13.F(0);
        r4 = r13.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ae, code lost:
    
        if (r4 < 1) goto L423;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b0, code lost:
    
        r28.f50984y = r4 - 1;
        r4 = r28.f50962c;
        r4.F(0);
        r11.e(4, r4);
        r11.e(1, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c5, code lost:
    
        if (r28.f50958C.length <= 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c7, code lost:
    
        r4 = r6.f47757m;
        r6 = r14[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d1, code lost:
    
        if ("video/avc".equals(r4) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d3, code lost:
    
        r19 = r13;
        r13 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d8, code lost:
    
        if ((r6 & 31) == 6) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01db, code lost:
    
        r19 = r13;
        r13 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e2, code lost:
    
        if ("video/hevc".equals(r4) == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ea, code lost:
    
        if (((r6 & 126) >> 1) != 39) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.extractor.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(androidx.media3.extractor.q r29, androidx.media3.extractor.F r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.e.h(androidx.media3.extractor.q, androidx.media3.extractor.F):int");
    }

    @Override // androidx.media3.extractor.p
    public final void i(r rVar) {
        this.f50956A = rVar;
        int i12 = 0;
        this.f50971l = 0;
        this.f50974o = 0;
        androidx.media3.extractor.J[] jArr = new androidx.media3.extractor.J[2];
        this.f50957B = jArr;
        androidx.media3.extractor.J[] jArr2 = (androidx.media3.extractor.J[]) M.H(0, jArr);
        this.f50957B = jArr2;
        for (androidx.media3.extractor.J j12 : jArr2) {
            j12.b(f50955F);
        }
        List<C23108t> list = this.f50960a;
        this.f50958C = new androidx.media3.extractor.J[list.size()];
        int i13 = 100;
        while (i12 < this.f50958C.length) {
            int i14 = i13 + 1;
            androidx.media3.extractor.J jC2 = this.f50956A.c(i13, 3);
            jC2.b(list.get(i12));
            this.f50958C[i12] = jC2;
            i12++;
            i13 = i14;
        }
    }

    public e(int i12) {
        this.f50960a = Collections.unmodifiableList(Collections.emptyList());
        this.f50967h = new androidx.media3.extractor.metadata.emsg.b();
        this.f50968i = new z(16);
        this.f50962c = new z(androidx.media3.container.b.f48118a);
        this.f50963d = new z(5);
        this.f50964e = new z();
        byte[] bArr = new byte[16];
        this.f50965f = bArr;
        this.f50966g = new z(bArr);
        this.f50969j = new ArrayDeque<>();
        this.f50970k = new ArrayDeque<>();
        this.f50961b = new SparseArray<>();
        this.f50979t = -9223372036854775807L;
        this.f50978s = -9223372036854775807L;
        this.f50980u = -9223372036854775807L;
        this.f50956A = r.f51145J1;
        this.f50957B = new androidx.media3.extractor.J[0];
        this.f50958C = new androidx.media3.extractor.J[0];
    }

    @Override // androidx.media3.extractor.p
    public final void release() {
    }
}
