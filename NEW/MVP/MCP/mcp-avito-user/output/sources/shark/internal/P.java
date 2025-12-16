package shark.internal;

import androidx.media3.exoplayer.C23179x;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.sequences.C43026i;
import kotlin.sequences.C43033p;
import shark.AbstractC48368z1;
import shark.C48236b2;
import shark.C48349u2;
import shark.HprofRecordTag;
import shark.HprofVersion;
import shark.PrimitiveType;
import shark.Z2;
import shark.a3;
import shark.internal.M0;
import shark.k3;

/* compiled from: HprofInMemoryIndex.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lshark/internal/P;", "", "a", "b", "shark-graph"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class P {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final b f438415r = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f438416a;

    /* renamed from: b, reason: collision with root package name */
    public final shark.internal.hppc.h<String> f438417b;

    /* renamed from: c, reason: collision with root package name */
    public final shark.internal.hppc.d f438418c;

    /* renamed from: d, reason: collision with root package name */
    public final H0 f438419d;

    /* renamed from: e, reason: collision with root package name */
    public final H0 f438420e;

    /* renamed from: f, reason: collision with root package name */
    public final H0 f438421f;

    /* renamed from: g, reason: collision with root package name */
    public final H0 f438422g;

    /* renamed from: h, reason: collision with root package name */
    public final List<AbstractC48368z1> f438423h;

    /* renamed from: i, reason: collision with root package name */
    public final a3 f438424i;

    /* renamed from: j, reason: collision with root package name */
    public final int f438425j;

    /* renamed from: k, reason: collision with root package name */
    public final int f438426k;

    /* renamed from: l, reason: collision with root package name */
    public final int f438427l;

    /* renamed from: m, reason: collision with root package name */
    public final int f438428m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f438429n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C48299w f438430o;

    /* renamed from: p, reason: collision with root package name */
    public final int f438431p;

    /* renamed from: q, reason: collision with root package name */
    public final shark.internal.hppc.j f438432q;

    /* compiled from: HprofInMemoryIndex.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/internal/P$a;", "Lshark/Z2;", "shark-graph"}, k = 1, mv = {1, 4, 1})
    public static final class a implements Z2 {

        /* renamed from: a, reason: collision with root package name */
        public final int f438433a;

        /* renamed from: b, reason: collision with root package name */
        public final int f438434b;

        /* renamed from: c, reason: collision with root package name */
        public final int f438435c;

        /* renamed from: d, reason: collision with root package name */
        public final shark.internal.hppc.h<String> f438436d;

        /* renamed from: e, reason: collision with root package name */
        public final shark.internal.hppc.d f438437e;

        /* renamed from: f, reason: collision with root package name */
        public final byte[] f438438f;

        /* renamed from: g, reason: collision with root package name */
        public int f438439g;

        /* renamed from: h, reason: collision with root package name */
        public final M0 f438440h;

        /* renamed from: i, reason: collision with root package name */
        public final M0 f438441i;

        /* renamed from: j, reason: collision with root package name */
        public final M0 f438442j;

        /* renamed from: k, reason: collision with root package name */
        public final M0 f438443k;

        /* renamed from: l, reason: collision with root package name */
        public final ArrayList f438444l;

        /* renamed from: m, reason: collision with root package name */
        public final int f438445m;

        /* renamed from: n, reason: collision with root package name */
        public final int f438446n;

        /* renamed from: o, reason: collision with root package name */
        public final int f438447o;

        /* renamed from: p, reason: collision with root package name */
        public final int f438448p;

        public a(boolean z12, long j12, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i22, @Y61.k shark.internal.hppc.j jVar) {
            this.f438445m = i16;
            this.f438446n = i17;
            this.f438447o = i18;
            this.f438448p = i19;
            int i23 = z12 ? 8 : 4;
            this.f438433a = i23;
            P.f438415r.getClass();
            int iA2 = b.a(j12);
            this.f438434b = iA2;
            int iA3 = b.a(i22);
            this.f438435c = iA3;
            this.f438436d = new shark.internal.hppc.h<>();
            this.f438437e = new shark.internal.hppc.d(i12);
            this.f438438f = new byte[i22];
            int i24 = i23 + iA2;
            this.f438440h = new M0(4 + i24 + i16 + iA3, z12, i12, 0.0d, 8, null);
            this.f438441i = new M0(i24 + i17, z12, i13, 0.0d, 8, null);
            this.f438442j = new M0(i24 + i18, z12, i14, 0.0d, 8, null);
            this.f438443k = new M0(iA2 + 1 + i19, z12, i15, 0.0d, 8, null);
            ArrayList arrayList = new ArrayList(jVar.f438555b + (jVar.f438558e ? 1 : 0));
            Iterator it = jVar.d().iterator();
            while (it.hasNext()) {
                arrayList.add(new AbstractC48368z1.k(((Number) it.next()).longValue()));
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
            this.f438444l = arrayList;
        }

        @Override // shark.Z2
        public final void a(@Y61.k HprofRecordTag hprofRecordTag, long j12, @Y61.k C48349u2 c48349u2) {
            int iOrdinal = hprofRecordTag.ordinal();
            int i12 = this.f438433a;
            if (iOrdinal == 0) {
                long jC2 = c48349u2.c();
                long j13 = j12 - i12;
                c48349u2.f438782a += j13;
                String strD4 = c48349u2.f438785d.d4(j13);
                shark.internal.hppc.h<String> hVar = this.f438436d;
                int i13 = hVar.f438548d;
                if (jC2 == 0) {
                    hVar.f438550f = true;
                    String[] strArr = hVar.f438546b;
                    int i14 = i13 + 1;
                    String str = strArr[i14];
                    strArr[i14] = strD4;
                    return;
                }
                long[] jArr = hVar.f438545a;
                shark.internal.hppc.a.f438525a.getClass();
                int iB2 = shark.internal.hppc.a.b(jC2) & i13;
                long j14 = jArr[iB2];
                while (j14 != 0) {
                    if (j14 == jC2) {
                        String[] strArr2 = hVar.f438546b;
                        String str2 = strArr2[iB2];
                        strArr2[iB2] = strD4;
                        return;
                    }
                    iB2 = (iB2 + 1) & i13;
                    j14 = jArr[iB2];
                }
                int i15 = hVar.f438547c;
                if (i15 == hVar.f438549e) {
                    long[] jArr2 = hVar.f438545a;
                    String[] strArr3 = hVar.f438546b;
                    shark.internal.hppc.a aVar = shark.internal.hppc.a.f438525a;
                    int i16 = hVar.f438548d + 1;
                    int i17 = i15 + (hVar.f438550f ? 1 : 0);
                    aVar.getClass();
                    hVar.a(shark.internal.hppc.a.c(i16, i17, 0.75d));
                    jArr2[iB2] = jC2;
                    strArr3[iB2] = strD4;
                    hVar.c(jArr2, strArr3);
                } else {
                    jArr[iB2] = jC2;
                    hVar.f438546b[iB2] = strD4;
                }
                hVar.f438547c++;
                return;
            }
            if (iOrdinal == 1) {
                PrimitiveType[] primitiveTypeArr = PrimitiveType.f438192d;
                c48349u2.j(4);
                long jC3 = c48349u2.c();
                c48349u2.j(4);
                this.f438437e.f(jC3, c48349u2.c());
                return;
            }
            ArrayList arrayList = this.f438444l;
            switch (iOrdinal) {
                case 14:
                    AbstractC48368z1.n nVar = new AbstractC48368z1.n(c48349u2.c());
                    if (nVar.f438836a != 0) {
                        arrayList.add(nVar);
                    }
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                    return;
                case 15:
                    AbstractC48368z1.e eVar = new AbstractC48368z1.e(c48349u2.c(), c48349u2.c());
                    if (eVar.f438818a != 0) {
                        arrayList.add(eVar);
                    }
                    kotlin.G0 g03 = kotlin.G0.f406611a;
                    return;
                case 16:
                    AbstractC48368z1.f fVar = new AbstractC48368z1.f(c48349u2.d(), c48349u2.d(), c48349u2.c());
                    if (fVar.f438820a != 0) {
                        arrayList.add(fVar);
                    }
                    kotlin.G0 g04 = kotlin.G0.f406611a;
                    return;
                case 17:
                    AbstractC48368z1.d dVar = new AbstractC48368z1.d(c48349u2.d(), c48349u2.d(), c48349u2.c());
                    if (dVar.f438815a != 0) {
                        arrayList.add(dVar);
                    }
                    kotlin.G0 g05 = kotlin.G0.f406611a;
                    return;
                case 18:
                    AbstractC48368z1.i iVar = new AbstractC48368z1.i(c48349u2.c(), c48349u2.d());
                    if (iVar.f438827a != 0) {
                        arrayList.add(iVar);
                    }
                    kotlin.G0 g06 = kotlin.G0.f406611a;
                    return;
                case 19:
                    c48349u2.j(c48349u2.f438783b);
                    return;
                case 20:
                    AbstractC48368z1.l lVar = new AbstractC48368z1.l(c48349u2.c(), c48349u2.d());
                    if (lVar.f438831a != 0) {
                        arrayList.add(lVar);
                    }
                    kotlin.G0 g07 = kotlin.G0.f406611a;
                    return;
                case 21:
                    AbstractC48368z1.h hVar2 = new AbstractC48368z1.h(c48349u2.c());
                    if (hVar2.f438826a != 0) {
                        arrayList.add(hVar2);
                    }
                    kotlin.G0 g08 = kotlin.G0.f406611a;
                    return;
                case 22:
                    AbstractC48368z1.m mVar = new AbstractC48368z1.m(c48349u2.d(), c48349u2.d(), c48349u2.c());
                    if (mVar.f438833a != 0) {
                        arrayList.add(mVar);
                    }
                    kotlin.G0 g09 = kotlin.G0.f406611a;
                    return;
                default:
                    switch (iOrdinal) {
                        case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                            AbstractC48368z1.c cVar = new AbstractC48368z1.c(c48349u2.c());
                            if (cVar.f438814a != 0) {
                                arrayList.add(cVar);
                            }
                            kotlin.G0 g010 = kotlin.G0.f406611a;
                            return;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                            AbstractC48368z1.b bVar = new AbstractC48368z1.b(c48349u2.c());
                            if (bVar.f438813a != 0) {
                                arrayList.add(bVar);
                            }
                            kotlin.G0 g011 = kotlin.G0.f406611a;
                            return;
                        case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                            AbstractC48368z1.a aVar2 = new AbstractC48368z1.a(c48349u2.c());
                            if (aVar2.f438812a != 0) {
                                arrayList.add(aVar2);
                            }
                            kotlin.G0 g012 = kotlin.G0.f406611a;
                            return;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                            AbstractC48368z1.j jVar = new AbstractC48368z1.j(c48349u2.c());
                            if (jVar.f438829a != 0) {
                                arrayList.add(jVar);
                            }
                            kotlin.G0 g013 = kotlin.G0.f406611a;
                            return;
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                            AbstractC48368z1.p pVar = new AbstractC48368z1.p(c48349u2.c());
                            if (pVar.f438838a != 0) {
                                arrayList.add(pVar);
                            }
                            kotlin.G0 g014 = kotlin.G0.f406611a;
                            return;
                        case AvailableCode.HMS_IS_SPOOF /* 29 */:
                            AbstractC48368z1.g gVar = new AbstractC48368z1.g(c48349u2.d(), c48349u2.d(), c48349u2.c());
                            if (gVar.f438823a != 0) {
                                arrayList.add(gVar);
                            }
                            kotlin.G0 g015 = kotlin.G0.f406611a;
                            return;
                        case 30:
                            AbstractC48368z1.o oVar = new AbstractC48368z1.o(c48349u2.c());
                            if (oVar.f438837a != 0) {
                                arrayList.add(oVar);
                            }
                            kotlin.G0 g016 = kotlin.G0.f406611a;
                            return;
                        default:
                            int i18 = this.f438434b;
                            switch (iOrdinal) {
                                case 32:
                                    long j15 = c48349u2.f438782a;
                                    long jC4 = c48349u2.c();
                                    PrimitiveType[] primitiveTypeArr2 = PrimitiveType.f438192d;
                                    c48349u2.j(4);
                                    long jC5 = c48349u2.c();
                                    c48349u2.j(i12 * 5);
                                    int iD2 = c48349u2.d();
                                    int i19 = c48349u2.i();
                                    for (int i22 = 0; i22 < i19; i22++) {
                                        PrimitiveType[] primitiveTypeArr3 = PrimitiveType.f438192d;
                                        c48349u2.j(2);
                                        c48349u2.j(c48349u2.f438784c[c48349u2.h()]);
                                    }
                                    int i23 = this.f438439g;
                                    long j16 = c48349u2.f438782a;
                                    b(c48349u2, 2);
                                    int i24 = this.f438439g;
                                    byte[] bArr = this.f438438f;
                                    int i25 = 1;
                                    int i26 = ((short) ((bArr[i24 - 1] & 255) | ((bArr[i24 - 2] & 255) << 8))) & 65535;
                                    int i27 = 0;
                                    while (i27 < i26) {
                                        b(c48349u2, i12);
                                        b(c48349u2, i25);
                                        int i28 = i26;
                                        int i29 = bArr[this.f438439g - i25] & 255;
                                        if (i29 == 2) {
                                            b(c48349u2, i12);
                                        } else {
                                            PrimitiveType.f438195g.getClass();
                                            b(c48349u2, ((Number) P0.d(PrimitiveType.f438193e, Integer.valueOf(i29))).intValue());
                                        }
                                        i27++;
                                        i25 = 1;
                                        i26 = i28;
                                    }
                                    int i32 = i25;
                                    b(c48349u2, 2);
                                    int i33 = this.f438439g;
                                    int i34 = ((short) ((bArr[i33 - i32] & 255) | ((bArr[i33 - 2] & 255) << 8))) & 65535;
                                    for (int i35 = 0; i35 < i34; i35 += i32) {
                                        b(c48349u2, i12);
                                        b(c48349u2, i32);
                                    }
                                    long j17 = c48349u2.f438782a;
                                    int i36 = (int) (j17 - j16);
                                    M0.a aVarC = this.f438440h.c(jC4);
                                    aVarC.c(i18, j15);
                                    aVarC.a(jC5);
                                    aVarC.b(iD2);
                                    aVarC.c(this.f438445m, j17 - j15);
                                    aVarC.c(this.f438435c, i23);
                                    kotlin.G0 g017 = kotlin.G0.f406611a;
                                    int i37 = i23 + i36;
                                    if (i37 == this.f438439g) {
                                        return;
                                    }
                                    StringBuilder sb2 = new StringBuilder("Expected ");
                                    C23179x.a(sb2, this.f438439g, " to have moved by ", i36, " and be equal to ");
                                    sb2.append(i37);
                                    throw new IllegalArgumentException(sb2.toString().toString());
                                case 33:
                                    long j18 = c48349u2.f438782a;
                                    long jC6 = c48349u2.c();
                                    PrimitiveType[] primitiveTypeArr4 = PrimitiveType.f438192d;
                                    c48349u2.j(4);
                                    long jC7 = c48349u2.c();
                                    c48349u2.j(c48349u2.d());
                                    long j19 = c48349u2.f438782a - j18;
                                    M0.a aVarC2 = this.f438441i.c(jC6);
                                    aVarC2.c(i18, j18);
                                    aVarC2.a(jC7);
                                    aVarC2.c(this.f438446n, j19);
                                    kotlin.G0 g018 = kotlin.G0.f406611a;
                                    return;
                                case 34:
                                    long j22 = c48349u2.f438782a;
                                    long jC8 = c48349u2.c();
                                    PrimitiveType[] primitiveTypeArr5 = PrimitiveType.f438192d;
                                    c48349u2.j(4);
                                    int iD3 = c48349u2.d();
                                    long jC9 = c48349u2.c();
                                    c48349u2.j(i12 * iD3);
                                    long j23 = c48349u2.f438782a - j22;
                                    M0.a aVarC3 = this.f438442j.c(jC8);
                                    aVarC3.c(i18, j22);
                                    aVarC3.a(jC9);
                                    aVarC3.c(this.f438447o, j23);
                                    kotlin.G0 g019 = kotlin.G0.f406611a;
                                    return;
                                case 35:
                                    long j24 = c48349u2.f438782a;
                                    long jC10 = c48349u2.c();
                                    PrimitiveType[] primitiveTypeArr6 = PrimitiveType.f438192d;
                                    c48349u2.j(4);
                                    int iD4 = c48349u2.d();
                                    PrimitiveType.f438195g.getClass();
                                    PrimitiveType primitiveType = (PrimitiveType) P0.d(PrimitiveType.f438194f, Integer.valueOf(c48349u2.h()));
                                    c48349u2.j(iD4 * primitiveType.f438197c);
                                    long j25 = c48349u2.f438782a - j24;
                                    M0.a aVarC4 = this.f438443k.c(jC10);
                                    aVarC4.c(i18, j24);
                                    byte bOrdinal = (byte) primitiveType.ordinal();
                                    M0 m02 = M0.this;
                                    int i38 = m02.f438395d;
                                    m02.f438395d = i38 + 1;
                                    int i39 = m02.f438392a;
                                    if (i38 < 0 || i39 < i38) {
                                        throw new IllegalArgumentException(androidx.compose.foundation.H.j(i38, i39, "Index ", " should be between 0 and ").toString());
                                    }
                                    int iB3 = androidx.compose.foundation.H.b(m02.f438396e, 1, i39, i38);
                                    byte[] bArr2 = m02.f438393b;
                                    if (bArr2 == null) {
                                        kotlin.jvm.internal.L.k();
                                        throw null;
                                    }
                                    bArr2[iB3] = bOrdinal;
                                    aVarC4.c(this.f438448p, j25);
                                    kotlin.G0 g020 = kotlin.G0.f406611a;
                                    return;
                                default:
                                    return;
                            }
                    }
            }
        }

        public final void b(C48349u2 c48349u2, int i12) {
            int i13 = 1;
            if (1 > i12) {
                return;
            }
            while (true) {
                int i14 = this.f438439g;
                this.f438439g = i14 + 1;
                this.f438438f[i14] = c48349u2.a();
                if (i13 == i12) {
                    return;
                } else {
                    i13++;
                }
            }
        }
    }

    /* compiled from: HprofInMemoryIndex.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lshark/internal/P$b;", "", "<init>", "()V", "shark-graph"}, k = 1, mv = {1, 4, 1})
    public static final class b {
        public b() {
        }

        public static int a(long j12) {
            int i12 = 0;
            while (j12 != 0) {
                j12 >>= 8;
                i12++;
            }
            return i12;
        }

        @Y61.k
        public static P b(@Y61.k k3 k3Var, @Y61.k C48236b2 c48236b2, @Y61.l a3 a3Var, @Y61.k EnumSet enumSet) {
            l0.g gVar = new l0.g();
            gVar.f406841b = 0L;
            l0.g gVar2 = new l0.g();
            gVar2.f406841b = 0L;
            l0.g gVar3 = new l0.g();
            gVar3.f406841b = 0L;
            l0.g gVar4 = new l0.g();
            gVar4.f406841b = 0L;
            l0.f fVar = new l0.f();
            fVar.f406840b = 0;
            l0.f fVar2 = new l0.f();
            fVar2.f406840b = 0;
            l0.f fVar3 = new l0.f();
            fVar3.f406840b = 0;
            l0.f fVar4 = new l0.f();
            fVar4.f406840b = 0;
            l0.f fVar5 = new l0.f();
            fVar5.f406840b = 0;
            shark.internal.hppc.j jVar = new shark.internal.hppc.j(0, 1, null);
            HprofRecordTag hprofRecordTag = HprofRecordTag.f438079y;
            HprofRecordTag hprofRecordTag2 = HprofRecordTag.f438080z;
            HprofRecordTag hprofRecordTag3 = HprofRecordTag.f438051A;
            HprofRecordTag hprofRecordTag4 = HprofRecordTag.f438052B;
            long jA2 = k3Var.a(EnumSet.of(hprofRecordTag, hprofRecordTag2, hprofRecordTag3, hprofRecordTag4, HprofRecordTag.f438066l), new S(fVar, gVar, fVar5, fVar2, gVar2, fVar3, gVar3, fVar4, gVar4, jVar));
            int iA2 = a(gVar.f406841b);
            int iA3 = a(gVar2.f406841b);
            int iA4 = a(gVar3.f406841b);
            int iA5 = a(gVar4.f406841b);
            a aVar = new a(c48236b2.f438248d == 8, jA2, fVar.f406840b, fVar2.f406840b, fVar3.f406840b, fVar4.f406840b, iA2, iA3, iA4, iA5, fVar5.f406840b, jVar);
            EnumSet enumSetOf = EnumSet.of(HprofRecordTag.f438056b, HprofRecordTag.f438057c, hprofRecordTag, hprofRecordTag2, hprofRecordTag3, hprofRecordTag4);
            HprofRecordTag.f438055E.getClass();
            k3Var.a(b1.h(enumSetOf, C42745f0.M(HprofRecordTag.f438054D, enumSet)), aVar);
            int i12 = aVar.f438439g;
            byte[] bArr = aVar.f438438f;
            if (i12 != bArr.length) {
                throw new IllegalArgumentException(("Read " + aVar.f438439g + " into fields bytes instead of expected " + bArr.length).toString());
            }
            return new P(aVar.f438434b, aVar.f438436d, aVar.f438437e, aVar.f438440h.d(), aVar.f438441i.d(), aVar.f438442j.d(), aVar.f438443k.d(), aVar.f438444l, a3Var, iA2, iA3, iA4, iA5, c48236b2.f438247c != HprofVersion.ANDROID, new C48299w(aVar.f438433a, bArr), aVar.f438435c, jVar, null);
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }
    }

    public P() {
        throw null;
    }

    public P(int i12, shark.internal.hppc.h hVar, shark.internal.hppc.d dVar, H0 h02, H0 h03, H0 h04, H0 h05, List list, a3 a3Var, int i13, int i14, int i15, int i16, boolean z12, C48299w c48299w, int i17, shark.internal.hppc.j jVar, C42822w c42822w) {
        this.f438416a = i12;
        this.f438417b = hVar;
        this.f438418c = dVar;
        this.f438419d = h02;
        this.f438420e = h03;
        this.f438421f = h04;
        this.f438422g = h05;
        this.f438423h = list;
        this.f438424i = a3Var;
        this.f438425j = i13;
        this.f438426k = i14;
        this.f438427l = i15;
        this.f438428m = i16;
        this.f438429n = z12;
        this.f438430o = c48299w;
        this.f438431p = i17;
        this.f438432q = jVar;
    }

    public final String a(long j12) {
        shark.internal.hppc.h<String> hVar = this.f438417b;
        String str = null;
        if (j12 != 0) {
            long[] jArr = hVar.f438545a;
            int i12 = hVar.f438548d;
            shark.internal.hppc.a.f438525a.getClass();
            int iB2 = shark.internal.hppc.a.b(j12) & i12;
            long j13 = jArr[iB2];
            while (true) {
                if (j13 == 0) {
                    break;
                }
                if (j13 == j12) {
                    str = hVar.f438546b[iB2];
                    break;
                }
                iB2 = (iB2 + 1) & i12;
                j13 = jArr[iB2];
            }
        } else if (hVar.f438550f) {
            str = hVar.f438546b[hVar.f438548d + 1];
        }
        String str2 = str;
        if (str2 != null) {
            return str2;
        }
        throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.i(j12, "Hprof string ", " not in cache"));
    }

    @Y61.k
    public final kotlin.sequences.o0 b() {
        return new kotlin.sequences.o0(this.f438419d.b(), new T(this));
    }

    @Y61.k
    public final kotlin.sequences.o0 c() {
        return new kotlin.sequences.o0(this.f438420e.b(), new U(this));
    }

    @Y61.k
    public final C43026i d() {
        return C43033p.A(C43033p.A(C43033p.A(b(), c()), new kotlin.sequences.o0(this.f438421f.b(), new V(this))), new kotlin.sequences.o0(this.f438422g.b(), new W(this)));
    }
}
