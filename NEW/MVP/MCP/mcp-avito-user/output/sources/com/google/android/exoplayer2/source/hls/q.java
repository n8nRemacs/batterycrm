package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.extractor.A;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.A;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.C36554q;
import com.google.android.exoplayer2.source.C36557u;
import com.google.android.exoplayer2.source.L;
import com.google.android.exoplayer2.source.N;
import com.google.android.exoplayer2.source.V;
import com.google.android.exoplayer2.source.W;
import com.google.android.exoplayer2.source.hls.h;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.InterfaceC36572b;
import com.google.android.exoplayer2.upstream.InterfaceC36580j;
import com.google.android.exoplayer2.upstream.J;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.z;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
import com.google.common.collect.W1;
import j.P;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import v61.InterfaceC49173d;

/* compiled from: HlsSampleStreamWrapper.java */
/* loaded from: classes6.dex */
final class q implements Loader.b<com.google.android.exoplayer2.source.chunk.e>, Loader.f, N, com.google.android.exoplayer2.extractor.l, L.d {

    /* renamed from: Z, reason: collision with root package name */
    public static final Set<Integer> f346533Z = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: A, reason: collision with root package name */
    public A f346534A;

    /* renamed from: B, reason: collision with root package name */
    public int f346535B;

    /* renamed from: C, reason: collision with root package name */
    public int f346536C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f346537D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f346538E;

    /* renamed from: F, reason: collision with root package name */
    public int f346539F;

    /* renamed from: G, reason: collision with root package name */
    public I f346540G;

    /* renamed from: H, reason: collision with root package name */
    @P
    public I f346541H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f346542I;

    /* renamed from: J, reason: collision with root package name */
    public W f346543J;

    /* renamed from: K, reason: collision with root package name */
    public Set<V> f346544K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f346545L;

    /* renamed from: M, reason: collision with root package name */
    public int f346546M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f346547N;

    /* renamed from: O, reason: collision with root package name */
    public boolean[] f346548O;

    /* renamed from: P, reason: collision with root package name */
    public boolean[] f346549P;

    /* renamed from: Q, reason: collision with root package name */
    public long f346550Q;

    /* renamed from: R, reason: collision with root package name */
    public long f346551R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f346552S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f346553T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f346554U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f346555V;

    /* renamed from: W, reason: collision with root package name */
    public long f346556W;

    /* renamed from: X, reason: collision with root package name */
    @P
    public DrmInitData f346557X;

    /* renamed from: Y, reason: collision with root package name */
    @P
    public l f346558Y;

    /* renamed from: b, reason: collision with root package name */
    public final String f346559b;

    /* renamed from: c, reason: collision with root package name */
    public final int f346560c;

    /* renamed from: d, reason: collision with root package name */
    public final n f346561d;

    /* renamed from: e, reason: collision with root package name */
    public final h f346562e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC36572b f346563f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public final I f346564g;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.f f346565h;

    /* renamed from: i, reason: collision with root package name */
    public final e.a f346566i;

    /* renamed from: j, reason: collision with root package name */
    public final z f346567j;

    /* renamed from: l, reason: collision with root package name */
    public final A.a f346569l;

    /* renamed from: m, reason: collision with root package name */
    public final int f346570m;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList<l> f346572o;

    /* renamed from: p, reason: collision with root package name */
    public final List<l> f346573p;

    /* renamed from: q, reason: collision with root package name */
    public final p f346574q;

    /* renamed from: r, reason: collision with root package name */
    public final p f346575r;

    /* renamed from: s, reason: collision with root package name */
    public final Handler f346576s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList<o> f346577t;

    /* renamed from: u, reason: collision with root package name */
    public final Map<String, DrmInitData> f346578u;

    /* renamed from: v, reason: collision with root package name */
    @P
    public com.google.android.exoplayer2.source.chunk.e f346579v;

    /* renamed from: w, reason: collision with root package name */
    public d[] f346580w;

    /* renamed from: y, reason: collision with root package name */
    public final HashSet f346582y;

    /* renamed from: z, reason: collision with root package name */
    public final SparseIntArray f346583z;

    /* renamed from: k, reason: collision with root package name */
    public final Loader f346568k = new Loader("Loader:HlsSampleStreamWrapper");

    /* renamed from: n, reason: collision with root package name */
    public final h.b f346571n = new h.b();

    /* renamed from: x, reason: collision with root package name */
    public int[] f346581x = new int[0];

    /* compiled from: HlsSampleStreamWrapper.java */
    public interface b extends N.a<q> {
    }

    /* compiled from: HlsSampleStreamWrapper.java */
    public static class c implements com.google.android.exoplayer2.extractor.A {

        /* renamed from: g, reason: collision with root package name */
        public static final I f346584g;

        /* renamed from: h, reason: collision with root package name */
        public static final I f346585h;

        /* renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.metadata.emsg.a f346586a = new com.google.android.exoplayer2.metadata.emsg.a();

        /* renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.extractor.A f346587b;

        /* renamed from: c, reason: collision with root package name */
        public final I f346588c;

        /* renamed from: d, reason: collision with root package name */
        public I f346589d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f346590e;

        /* renamed from: f, reason: collision with root package name */
        public int f346591f;

        static {
            I.b bVar = new I.b();
            bVar.f343504k = "application/id3";
            f346584g = bVar.a();
            I.b bVar2 = new I.b();
            bVar2.f343504k = "application/x-emsg";
            f346585h = bVar2.a();
        }

        public c(com.google.android.exoplayer2.extractor.A a12, int i12) {
            this.f346587b = a12;
            if (i12 == 1) {
                this.f346588c = f346584g;
            } else {
                if (i12 != 3) {
                    throw new IllegalArgumentException(AK.c.g(i12, "Unknown metadataType: "));
                }
                this.f346588c = f346585h;
            }
            this.f346590e = new byte[0];
            this.f346591f = 0;
        }

        @Override // com.google.android.exoplayer2.extractor.A
        public final void a(I i12) {
            this.f346589d = i12;
            this.f346587b.a(this.f346588c);
        }

        @Override // com.google.android.exoplayer2.extractor.A
        public final int d(InterfaceC36580j interfaceC36580j, int i12, boolean z12) throws EOFException {
            int i13 = this.f346591f + i12;
            byte[] bArr = this.f346590e;
            if (bArr.length < i13) {
                this.f346590e = Arrays.copyOf(bArr, (i13 / 2) + i13);
            }
            int i14 = interfaceC36580j.read(this.f346590e, this.f346591f, i12);
            if (i14 != -1) {
                this.f346591f += i14;
                return i14;
            }
            if (z12) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // com.google.android.exoplayer2.extractor.A
        public final void e(int i12, F f12) {
            int i13 = this.f346591f + i12;
            byte[] bArr = this.f346590e;
            if (bArr.length < i13) {
                this.f346590e = Arrays.copyOf(bArr, (i13 / 2) + i13);
            }
            f12.c(this.f346591f, i12, this.f346590e);
            this.f346591f += i12;
        }

        @Override // com.google.android.exoplayer2.extractor.A
        public final void f(long j12, int i12, int i13, int i14, @P A.a aVar) {
            this.f346589d.getClass();
            int i15 = this.f346591f - i14;
            F f12 = new F(Arrays.copyOfRange(this.f346590e, i15 - i13, i15));
            byte[] bArr = this.f346590e;
            System.arraycopy(bArr, i15, bArr, 0, i14);
            this.f346591f = i14;
            String str = this.f346589d.f343476m;
            I i16 = this.f346588c;
            if (!U.a(str, i16.f343476m)) {
                if (!"application/x-emsg".equals(this.f346589d.f343476m)) {
                    String str2 = this.f346589d.f343476m;
                    return;
                }
                this.f346586a.getClass();
                EventMessage eventMessageC = com.google.android.exoplayer2.metadata.emsg.a.c(f12);
                I iI02 = eventMessageC.i0();
                if (iI02 == null || !U.a(i16.f343476m, iI02.f343476m)) {
                    Objects.toString(eventMessageC.i0());
                    return;
                } else {
                    byte[] bArrZ = eventMessageC.Z();
                    bArrZ.getClass();
                    f12 = new F(bArrZ);
                }
            }
            int iA2 = f12.a();
            this.f346587b.c(iA2, f12);
            this.f346587b.f(j12, i12, iA2, i14, aVar);
        }
    }

    /* compiled from: HlsSampleStreamWrapper.java */
    public static final class d extends L {

        /* renamed from: H, reason: collision with root package name */
        public final Map<String, DrmInitData> f346592H;

        /* renamed from: I, reason: collision with root package name */
        @P
        public DrmInitData f346593I;

        public d() {
            throw null;
        }

        public d(InterfaceC36572b interfaceC36572b, com.google.android.exoplayer2.drm.f fVar, e.a aVar, Map map, a aVar2) {
            super(interfaceC36572b, fVar, aVar);
            this.f346592H = map;
        }

        @Override // com.google.android.exoplayer2.source.L
        public final I m(I i12) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.f346593I;
            if (drmInitData2 == null) {
                drmInitData2 = i12.f343479p;
            }
            if (drmInitData2 != null && (drmInitData = this.f346592H.get(drmInitData2.f344320d)) != null) {
                drmInitData2 = drmInitData;
            }
            Metadata metadata = i12.f343474k;
            Metadata metadata2 = null;
            if (metadata == null) {
                metadata = metadata2;
            } else {
                Metadata.Entry[] entryArr = metadata.f345623b;
                int length = entryArr.length;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        i14 = -1;
                        break;
                    }
                    Metadata.Entry entry = entryArr[i14];
                    if ((entry instanceof PrivFrame) && "com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame) entry).f345702c)) {
                        break;
                    }
                    i14++;
                }
                if (i14 != -1) {
                    if (length != 1) {
                        Metadata.Entry[] entryArr2 = new Metadata.Entry[length - 1];
                        while (i13 < length) {
                            if (i13 != i14) {
                                entryArr2[i13 < i14 ? i13 : i13 - 1] = entryArr[i13];
                            }
                            i13++;
                        }
                        metadata2 = new Metadata(entryArr2);
                    }
                    metadata = metadata2;
                }
            }
            if (drmInitData2 != i12.f343479p || metadata != i12.f343474k) {
                I.b bVarA = i12.a();
                bVarA.f343507n = drmInitData2;
                bVarA.f343502i = metadata;
                i12 = bVarA.a();
            }
            return super.m(i12);
        }
    }

    public q(String str, int i12, n nVar, h hVar, Map map, InterfaceC36572b interfaceC36572b, long j12, @P I i13, com.google.android.exoplayer2.drm.f fVar, e.a aVar, z zVar, A.a aVar2, int i14) {
        this.f346559b = str;
        this.f346560c = i12;
        this.f346561d = nVar;
        this.f346562e = hVar;
        this.f346578u = map;
        this.f346563f = interfaceC36572b;
        this.f346564g = i13;
        this.f346565h = fVar;
        this.f346566i = aVar;
        this.f346567j = zVar;
        this.f346569l = aVar2;
        this.f346570m = i14;
        Set<Integer> set = f346533Z;
        this.f346582y = new HashSet(set.size());
        this.f346583z = new SparseIntArray(set.size());
        this.f346580w = new d[0];
        this.f346549P = new boolean[0];
        this.f346548O = new boolean[0];
        ArrayList<l> arrayList = new ArrayList<>();
        this.f346572o = arrayList;
        this.f346573p = Collections.unmodifiableList(arrayList);
        this.f346577t = new ArrayList<>();
        this.f346574q = new p(this, 0);
        this.f346575r = new p(this, 1);
        this.f346576s = U.n(null);
        this.f346550Q = j12;
        this.f346551R = j12;
    }

    public static I n(@P I i12, I i13, boolean z12) {
        String strE;
        String strQ;
        if (i12 == null) {
            return i13;
        }
        String str = i13.f343476m;
        int i14 = com.google.android.exoplayer2.util.z.i(str);
        String str2 = i12.f343473j;
        if (U.p(i14, str2) == 1) {
            strQ = U.q(i14, str2);
            strE = com.google.android.exoplayer2.util.z.e(strQ);
        } else {
            String strC = com.google.android.exoplayer2.util.z.c(str2, str);
            strE = str;
            strQ = strC;
        }
        I.b bVarA = i13.a();
        bVarA.f343494a = i12.f343465b;
        bVarA.f343495b = i12.f343466c;
        bVarA.f343496c = i12.f343467d;
        bVarA.f343497d = i12.f343468e;
        bVarA.f343498e = i12.f343469f;
        bVarA.f343499f = z12 ? i12.f343470g : -1;
        bVarA.f343500g = z12 ? i12.f343471h : -1;
        bVarA.f343501h = strQ;
        if (i14 == 2) {
            bVarA.f343509p = i12.f343481r;
            bVarA.f343510q = i12.f343482s;
            bVarA.f343511r = i12.f343483t;
        }
        if (strE != null) {
            bVarA.f343504k = strE;
        }
        int i15 = i12.f343489z;
        if (i15 != -1 && i14 == 1) {
            bVarA.f343517x = i15;
        }
        Metadata metadata = i12.f343474k;
        if (metadata != null) {
            Metadata metadata2 = i13.f343474k;
            if (metadata2 != null) {
                Metadata.Entry[] entryArr = metadata.f345623b;
                if (entryArr.length == 0) {
                    metadata = metadata2;
                } else {
                    Metadata.Entry[] entryArr2 = metadata2.f345623b;
                    Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                    System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
                    metadata = new Metadata((Metadata.Entry[]) objArrCopyOf);
                }
            }
            bVarA.f343502i = metadata;
        }
        return bVarA.a();
    }

    public static int q(int i12) {
        if (i12 == 1) {
            return 2;
        }
        if (i12 != 2) {
            return i12 != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public final void a() {
        for (d dVar : this.f346580w) {
            dVar.y(true);
            DrmSession drmSession = dVar.f346050h;
            if (drmSession != null) {
                drmSession.e(dVar.f346047e);
                dVar.f346050h = null;
                dVar.f346049g = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public final void b() {
        this.f346555V = true;
        this.f346576s.post(this.f346575r);
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public final com.google.android.exoplayer2.extractor.A c(int i12, int i13) {
        Integer numValueOf = Integer.valueOf(i13);
        Set<Integer> set = f346533Z;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.f346582y;
        SparseIntArray sparseIntArray = this.f346583z;
        com.google.android.exoplayer2.extractor.A iVar = null;
        if (zContains) {
            C36585a.b(set.contains(Integer.valueOf(i13)));
            int i14 = sparseIntArray.get(i13, -1);
            if (i14 != -1) {
                if (hashSet.add(Integer.valueOf(i13))) {
                    this.f346581x[i14] = i12;
                }
                iVar = this.f346581x[i14] == i12 ? this.f346580w[i14] : new com.google.android.exoplayer2.extractor.i();
            }
        } else {
            int i15 = 0;
            while (true) {
                com.google.android.exoplayer2.extractor.A[] aArr = this.f346580w;
                if (i15 >= aArr.length) {
                    break;
                }
                if (this.f346581x[i15] == i12) {
                    iVar = aArr[i15];
                    break;
                }
                i15++;
            }
        }
        if (iVar == null) {
            if (this.f346555V) {
                return new com.google.android.exoplayer2.extractor.i();
            }
            int length = this.f346580w.length;
            boolean z12 = i13 == 1 || i13 == 2;
            d dVar = new d(this.f346563f, this.f346565h, this.f346566i, this.f346578u, null);
            dVar.f346062t = this.f346550Q;
            if (z12) {
                dVar.f346593I = this.f346557X;
                dVar.f346068z = true;
            }
            long j12 = this.f346556W;
            if (dVar.f346041F != j12) {
                dVar.f346041F = j12;
                dVar.f346068z = true;
            }
            l lVar = this.f346558Y;
            if (lVar != null) {
                dVar.f346038C = lVar.f346336k;
            }
            dVar.f346048f = this;
            int i16 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.f346581x, i16);
            this.f346581x = iArrCopyOf;
            iArrCopyOf[length] = i12;
            d[] dVarArr = this.f346580w;
            int i17 = U.f348106a;
            Object[] objArrCopyOf = Arrays.copyOf(dVarArr, dVarArr.length + 1);
            objArrCopyOf[dVarArr.length] = dVar;
            this.f346580w = (d[]) objArrCopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.f346549P, i16);
            this.f346549P = zArrCopyOf;
            zArrCopyOf[length] = z12;
            this.f346547N |= z12;
            hashSet.add(Integer.valueOf(i13));
            sparseIntArray.append(i13, length);
            if (q(i13) > q(this.f346535B)) {
                this.f346536C = length;
                this.f346535B = i13;
            }
            this.f346548O = Arrays.copyOf(this.f346548O, i16);
            iVar = dVar;
        }
        if (i13 != 5) {
            return iVar;
        }
        if (this.f346534A == null) {
            this.f346534A = new c(iVar, this.f346570m);
        }
        return this.f346534A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    @Override // com.google.android.exoplayer2.source.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean continueLoading(long r57) {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.q.continueLoading(long):boolean");
    }

    @Override // com.google.android.exoplayer2.source.L.d
    public final void g() {
        this.f346576s.post(this.f346574q);
    }

    @Override // com.google.android.exoplayer2.source.N
    public final long getBufferedPositionUs() {
        long j12;
        if (this.f346554U) {
            return Long.MIN_VALUE;
        }
        if (r()) {
            return this.f346551R;
        }
        long jMax = this.f346550Q;
        l lVarP = p();
        if (!lVarP.f346332I) {
            ArrayList<l> arrayList = this.f346572o;
            lVarP = arrayList.size() > 1 ? (l) androidx.appcompat.app.r.j(2, arrayList) : null;
        }
        if (lVarP != null) {
            jMax = Math.max(jMax, lVarP.f346225h);
        }
        if (this.f346537D) {
            for (d dVar : this.f346580w) {
                synchronized (dVar) {
                    j12 = dVar.f346064v;
                }
                jMax = Math.max(jMax, j12);
            }
        }
        return jMax;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final long getNextLoadPositionUs() {
        if (r()) {
            return this.f346551R;
        }
        if (this.f346554U) {
            return Long.MIN_VALUE;
        }
        return p().f346225h;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public final void h(Loader.e eVar, long j12, long j13, boolean z12) {
        com.google.android.exoplayer2.source.chunk.e eVar2 = (com.google.android.exoplayer2.source.chunk.e) eVar;
        this.f346579v = null;
        long j14 = eVar2.f346218a;
        J j15 = eVar2.f346226i;
        Uri uri = j15.f347753c;
        C36554q c36554q = new C36554q(j14, j15.f347754d);
        this.f346567j.getClass();
        this.f346569l.d(c36554q, eVar2.f346220c, this.f346560c, eVar2.f346221d, eVar2.f346222e, eVar2.f346223f, eVar2.f346224g, eVar2.f346225h);
        if (z12) {
            return;
        }
        if (r() || this.f346539F == 0) {
            v();
        }
        if (this.f346539F > 0) {
            this.f346561d.g(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.N
    public final boolean isLoading() {
        return this.f346568k.c();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public final void j(Loader.e eVar, long j12, long j13) {
        com.google.android.exoplayer2.source.chunk.e eVar2 = (com.google.android.exoplayer2.source.chunk.e) eVar;
        this.f346579v = null;
        h hVar = this.f346562e;
        if (eVar2 instanceof h.a) {
            h.a aVar = (h.a) eVar2;
            hVar.f346304m = aVar.f346228j;
            Uri uri = aVar.f346219b.f347929a;
            byte[] bArr = aVar.f346311l;
            bArr.getClass();
            LinkedHashMap<Uri, byte[]> linkedHashMap = hVar.f346301j.f346291a;
            uri.getClass();
            linkedHashMap.put(uri, bArr);
        }
        long j14 = eVar2.f346218a;
        J j15 = eVar2.f346226i;
        Uri uri2 = j15.f347753c;
        C36554q c36554q = new C36554q(j14, j15.f347754d);
        this.f346567j.getClass();
        this.f346569l.f(c36554q, eVar2.f346220c, this.f346560c, eVar2.f346221d, eVar2.f346222e, eVar2.f346223f, eVar2.f346224g, eVar2.f346225h);
        if (this.f346538E) {
            this.f346561d.g(this);
        } else {
            continueLoading(this.f346550Q);
        }
    }

    @InterfaceC49173d
    public final void k() {
        C36585a.d(this.f346538E);
        this.f346543J.getClass();
        this.f346544K.getClass();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public final Loader.c l(Loader.e eVar, long j12, long j13, IOException iOException, int i12) {
        boolean zQ2;
        Loader.c cVarB;
        int i13;
        com.google.android.exoplayer2.source.chunk.e eVar2 = (com.google.android.exoplayer2.source.chunk.e) eVar;
        boolean z12 = eVar2 instanceof l;
        if (z12 && !((l) eVar2).f346335L && (iOException instanceof HttpDataSource.InvalidResponseCodeException) && ((i13 = ((HttpDataSource.InvalidResponseCodeException) iOException).f347735e) == 410 || i13 == 404)) {
            return Loader.f347759d;
        }
        long j14 = eVar2.f346226i.f347752b;
        J j15 = eVar2.f346226i;
        Uri uri = j15.f347753c;
        C36554q c36554q = new C36554q(eVar2.f346218a, j15.f347754d);
        U.R(eVar2.f346224g);
        U.R(eVar2.f346225h);
        z.d dVar = new z.d(iOException, i12);
        h hVar = this.f346562e;
        z.a aVarA = com.google.android.exoplayer2.trackselection.s.a(hVar.f346308q);
        z zVar = this.f346567j;
        z.b bVarC = zVar.c(aVarA, dVar);
        if (bVarC == null || bVarC.f348022a != 2) {
            zQ2 = false;
        } else {
            com.google.android.exoplayer2.trackselection.k kVar = hVar.f346308q;
            zQ2 = kVar.q(kVar.h(hVar.f346299h.a(eVar2.f346221d)), bVarC.f348023b);
        }
        if (zQ2) {
            if (z12 && j14 == 0) {
                ArrayList<l> arrayList = this.f346572o;
                C36585a.d(((l) C22026a.b(1, arrayList)) == eVar2);
                if (arrayList.isEmpty()) {
                    this.f346551R = this.f346550Q;
                } else {
                    ((l) W1.d(arrayList)).f346334K = true;
                }
            }
            cVarB = Loader.f347760e;
        } else {
            long jB2 = zVar.b(dVar);
            cVarB = jB2 != -9223372036854775807L ? Loader.b(jB2, false) : Loader.f347761f;
        }
        Loader.c cVar = cVarB;
        int i14 = cVar.f347765a;
        boolean z13 = i14 == 0 || i14 == 1;
        this.f346569l.h(c36554q, eVar2.f346220c, this.f346560c, eVar2.f346221d, eVar2.f346222e, eVar2.f346223f, eVar2.f346224g, eVar2.f346225h, iOException, !z13);
        if (!z13) {
            this.f346579v = null;
        }
        if (zQ2) {
            if (this.f346538E) {
                this.f346561d.g(this);
            } else {
                continueLoading(this.f346550Q);
            }
        }
        return cVar;
    }

    public final W m(V[] vArr) {
        for (int i12 = 0; i12 < vArr.length; i12++) {
            V v12 = vArr[i12];
            I[] iArr = new I[v12.f346148b];
            for (int i13 = 0; i13 < v12.f346148b; i13++) {
                I i14 = v12.f346151e[i13];
                int iC2 = this.f346565h.c(i14);
                I.b bVarA = i14.a();
                bVarA.f343493D = iC2;
                iArr[i13] = bVarA.a();
            }
            vArr[i12] = new V(v12.f346149c, iArr);
        }
        return new W(vArr);
    }

    public final void o(int i12) {
        ArrayList<l> arrayList;
        C36585a.d(!this.f346568k.c());
        int i13 = i12;
        loop0: while (true) {
            arrayList = this.f346572o;
            if (i13 >= arrayList.size()) {
                i13 = -1;
                break;
            }
            int i14 = i13;
            while (true) {
                if (i14 >= arrayList.size()) {
                    l lVar = arrayList.get(i13);
                    for (int i15 = 0; i15 < this.f346580w.length; i15++) {
                        if (this.f346580w[i15].o() > lVar.d(i15)) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (arrayList.get(i14).f346339n) {
                    break;
                } else {
                    i14++;
                }
            }
            i13++;
        }
        if (i13 == -1) {
            return;
        }
        long j12 = p().f346225h;
        l lVar2 = arrayList.get(i13);
        U.L(i13, arrayList.size(), arrayList);
        for (int i16 = 0; i16 < this.f346580w.length; i16++) {
            this.f346580w[i16].k(lVar2.d(i16));
        }
        if (arrayList.isEmpty()) {
            this.f346551R = this.f346550Q;
        } else {
            ((l) W1.d(arrayList)).f346334K = true;
        }
        this.f346554U = false;
        int i17 = this.f346535B;
        long j13 = lVar2.f346224g;
        A.a aVar = this.f346569l;
        aVar.m(new C36557u(1, i17, null, 3, null, aVar.b(j13), aVar.b(j12)));
    }

    public final l p() {
        return (l) androidx.appcompat.app.r.j(1, this.f346572o);
    }

    public final boolean r() {
        return this.f346551R != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final void reevaluateBuffer(long j12) {
        Loader loader = this.f346568k;
        if (loader.f347764c == null && !r()) {
            boolean zC2 = loader.c();
            h hVar = this.f346562e;
            List<l> list = this.f346573p;
            if (zC2) {
                this.f346579v.getClass();
                if (hVar.f346305n != null ? false : hVar.f346308q.l(j12, this.f346579v, list)) {
                    loader.a();
                    return;
                }
                return;
            }
            int size = list.size();
            while (size > 0 && hVar.b(list.get(size - 1)) == 2) {
                size--;
            }
            if (size < list.size()) {
                o(size);
            }
            int size2 = (hVar.f346305n != null || hVar.f346308q.length() < 2) ? list.size() : hVar.f346308q.m(j12, list);
            if (size2 < this.f346572o.size()) {
                o(size2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s() {
        int i12;
        if (!this.f346542I && this.f346545L == null && this.f346537D) {
            int i13 = 0;
            for (d dVar : this.f346580w) {
                if (dVar.r() == null) {
                    return;
                }
            }
            W w12 = this.f346543J;
            if (w12 != null) {
                int i14 = w12.f346155b;
                int[] iArr = new int[i14];
                this.f346545L = iArr;
                Arrays.fill(iArr, -1);
                for (int i15 = 0; i15 < i14; i15++) {
                    int i16 = 0;
                    while (true) {
                        d[] dVarArr = this.f346580w;
                        if (i16 < dVarArr.length) {
                            I iR2 = dVarArr[i16].r();
                            C36585a.e(iR2);
                            I i17 = this.f346543J.a(i15).f346151e[0];
                            String str = i17.f343476m;
                            String str2 = iR2.f343476m;
                            int i18 = com.google.android.exoplayer2.util.z.i(str2);
                            if (i18 != 3) {
                                if (i18 == com.google.android.exoplayer2.util.z.i(str)) {
                                    break;
                                } else {
                                    i16++;
                                }
                            } else if (U.a(str2, str) && (!("application/cea-608".equals(str2) || "application/cea-708".equals(str2)) || iR2.f343462E == i17.f343462E)) {
                                break;
                            } else {
                                i16++;
                            }
                        }
                    }
                    this.f346545L[i15] = i16;
                }
                Iterator<o> it = this.f346577t.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                return;
            }
            int length = this.f346580w.length;
            int i19 = 0;
            int i22 = -1;
            int i23 = -2;
            while (true) {
                int i24 = 1;
                if (i19 >= length) {
                    break;
                }
                I iR3 = this.f346580w[i19].r();
                C36585a.e(iR3);
                String str3 = iR3.f343476m;
                if (com.google.android.exoplayer2.util.z.m(str3)) {
                    i24 = 2;
                } else if (!com.google.android.exoplayer2.util.z.k(str3)) {
                    i24 = com.google.android.exoplayer2.util.z.l(str3) ? 3 : -2;
                }
                if (q(i24) > q(i23)) {
                    i22 = i19;
                    i23 = i24;
                } else if (i24 == i23 && i22 != -1) {
                    i22 = -1;
                }
                i19++;
            }
            V v12 = this.f346562e.f346299h;
            int i25 = v12.f346148b;
            this.f346546M = -1;
            this.f346545L = new int[length];
            for (int i26 = 0; i26 < length; i26++) {
                this.f346545L[i26] = i26;
            }
            V[] vArr = new V[length];
            int i27 = 0;
            while (i27 < length) {
                I iR4 = this.f346580w[i27].r();
                C36585a.e(iR4);
                String str4 = this.f346559b;
                I i28 = this.f346564g;
                if (i27 == i22) {
                    I[] iArr2 = new I[i25];
                    for (int i29 = i13; i29 < i25; i29++) {
                        I iE2 = v12.f346151e[i29];
                        if (i23 == 1 && i28 != null) {
                            iE2 = iE2.e(i28);
                        }
                        iArr2[i29] = i25 == 1 ? iR4.e(iE2) : n(iE2, iR4, true);
                    }
                    vArr[i27] = new V(str4, iArr2);
                    this.f346546M = i27;
                    i12 = 0;
                } else {
                    if (i23 != 2 || !com.google.android.exoplayer2.util.z.k(iR4.f343476m)) {
                        i28 = null;
                    }
                    StringBuilder sbZ = androidx.appcompat.app.r.z(str4, ":muxed:");
                    sbZ.append(i27 < i22 ? i27 : i27 - 1);
                    i12 = 0;
                    vArr[i27] = new V(sbZ.toString(), n(i28, iR4, false));
                }
                i27++;
                i13 = i12;
            }
            int i32 = i13;
            this.f346543J = m(vArr);
            C36585a.d(this.f346544K == null ? 1 : i32);
            this.f346544K = Collections.emptySet();
            this.f346538E = true;
            this.f346561d.j();
        }
    }

    public final void t() {
        this.f346568k.d(BeduinInputModel.MIN_TEXT_VERSION);
        h hVar = this.f346562e;
        BehindLiveWindowException behindLiveWindowException = hVar.f346305n;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        Uri uri = hVar.f346306o;
        if (uri == null || !hVar.f346310s) {
            return;
        }
        hVar.f346298g.i(uri);
    }

    public final void u(V[] vArr, int... iArr) {
        this.f346543J = m(vArr);
        this.f346544K = new HashSet();
        for (int i12 : iArr) {
            this.f346544K.add(this.f346543J.a(i12));
        }
        this.f346546M = 0;
        this.f346576s.post(new p(this.f346561d, 2));
        this.f346538E = true;
    }

    public final void v() {
        for (d dVar : this.f346580w) {
            dVar.y(this.f346552S);
        }
        this.f346552S = false;
    }

    public final boolean w(long j12, boolean z12) {
        this.f346550Q = j12;
        if (r()) {
            this.f346551R = j12;
            return true;
        }
        if (this.f346537D && !z12) {
            int length = this.f346580w.length;
            for (int i12 = 0; i12 < length; i12++) {
                if (this.f346580w[i12].z(j12, false) || (!this.f346549P[i12] && this.f346547N)) {
                }
            }
            return false;
        }
        this.f346551R = j12;
        this.f346554U = false;
        this.f346572o.clear();
        Loader loader = this.f346568k;
        if (loader.c()) {
            if (this.f346537D) {
                for (d dVar : this.f346580w) {
                    dVar.i();
                }
            }
            loader.a();
        } else {
            loader.f347764c = null;
            v();
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.l
    public final void i(y yVar) {
    }
}
