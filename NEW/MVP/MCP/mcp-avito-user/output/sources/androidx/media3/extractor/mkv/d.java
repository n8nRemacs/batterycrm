package androidx.media3.extractor.mkv;

import android.util.SparseArray;
import androidx.media3.common.C23101l;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.S;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.t;
import androidx.media3.common.util.z;
import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.J;
import androidx.media3.extractor.K;
import androidx.media3.extractor.p;
import androidx.media3.extractor.q;
import androidx.media3.extractor.r;
import com.facebook.imageutils.JfifUtil;
import com.google.common.base.C37262f;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import j.InterfaceC42153i;
import j.P;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import v61.InterfaceC49173d;
import v61.m;

/* compiled from: MatroskaExtractor.java */
@J
/* loaded from: classes.dex */
public class d implements p {

    /* renamed from: c0, reason: collision with root package name */
    public static final byte[] f50757c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0, reason: collision with root package name */
    public static final byte[] f50758d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f50759e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f50760f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final UUID f50761g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final Map<String, Integer> f50762h0;

    /* renamed from: A, reason: collision with root package name */
    public long f50763A;

    /* renamed from: B, reason: collision with root package name */
    public long f50764B;

    /* renamed from: C, reason: collision with root package name */
    @P
    public t f50765C;

    /* renamed from: D, reason: collision with root package name */
    @P
    public t f50766D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f50767E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f50768F;

    /* renamed from: G, reason: collision with root package name */
    public int f50769G;

    /* renamed from: H, reason: collision with root package name */
    public long f50770H;

    /* renamed from: I, reason: collision with root package name */
    public long f50771I;

    /* renamed from: J, reason: collision with root package name */
    public int f50772J;

    /* renamed from: K, reason: collision with root package name */
    public int f50773K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f50774L;

    /* renamed from: M, reason: collision with root package name */
    public int f50775M;

    /* renamed from: N, reason: collision with root package name */
    public int f50776N;

    /* renamed from: O, reason: collision with root package name */
    public int f50777O;

    /* renamed from: P, reason: collision with root package name */
    public int f50778P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f50779Q;

    /* renamed from: R, reason: collision with root package name */
    public long f50780R;

    /* renamed from: S, reason: collision with root package name */
    public int f50781S;

    /* renamed from: T, reason: collision with root package name */
    public int f50782T;

    /* renamed from: U, reason: collision with root package name */
    public int f50783U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f50784V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f50785W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f50786X;

    /* renamed from: Y, reason: collision with root package name */
    public int f50787Y;

    /* renamed from: Z, reason: collision with root package name */
    public byte f50788Z;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.extractor.mkv.a f50789a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f50790a0;

    /* renamed from: b, reason: collision with root package name */
    public final f f50791b;

    /* renamed from: b0, reason: collision with root package name */
    public r f50792b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray<C1855d> f50793c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f50794d;

    /* renamed from: e, reason: collision with root package name */
    public final z f50795e;

    /* renamed from: f, reason: collision with root package name */
    public final z f50796f;

    /* renamed from: g, reason: collision with root package name */
    public final z f50797g;

    /* renamed from: h, reason: collision with root package name */
    public final z f50798h;

    /* renamed from: i, reason: collision with root package name */
    public final z f50799i;

    /* renamed from: j, reason: collision with root package name */
    public final z f50800j;

    /* renamed from: k, reason: collision with root package name */
    public final z f50801k;

    /* renamed from: l, reason: collision with root package name */
    public final z f50802l;

    /* renamed from: m, reason: collision with root package name */
    public final z f50803m;

    /* renamed from: n, reason: collision with root package name */
    public final z f50804n;

    /* renamed from: o, reason: collision with root package name */
    public ByteBuffer f50805o;

    /* renamed from: p, reason: collision with root package name */
    public long f50806p;

    /* renamed from: q, reason: collision with root package name */
    public long f50807q;

    /* renamed from: r, reason: collision with root package name */
    public long f50808r;

    /* renamed from: s, reason: collision with root package name */
    public long f50809s;

    /* renamed from: t, reason: collision with root package name */
    public long f50810t;

    /* renamed from: u, reason: collision with root package name */
    @P
    public C1855d f50811u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f50812v;

    /* renamed from: w, reason: collision with root package name */
    public int f50813w;

    /* renamed from: x, reason: collision with root package name */
    public long f50814x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f50815y;

    /* renamed from: z, reason: collision with root package name */
    public long f50816z;

    /* compiled from: MatroskaExtractor.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* compiled from: MatroskaExtractor.java */
    public final class c implements androidx.media3.extractor.mkv.b {
        public c(a aVar) {
        }

        public final void a(int i12, int i13, C23191j c23191j) throws ParserException, EOFException, InterruptedIOException {
            C1855d c1855d;
            C1855d c1855d2;
            C1855d c1855d3;
            long j12;
            int i14;
            int i15;
            int i16;
            d dVar = d.this;
            SparseArray<C1855d> sparseArray = dVar.f50793c;
            int i17 = 4;
            int i18 = 0;
            int i19 = 1;
            if (i12 != 161 && i12 != 163) {
                if (i12 == 165) {
                    if (dVar.f50769G != 2) {
                        return;
                    }
                    C1855d c1855d4 = sparseArray.get(dVar.f50775M);
                    if (dVar.f50778P != 4 || !"V_VP9".equals(c1855d4.f50844b)) {
                        c23191j.i(i13);
                        return;
                    }
                    z zVar = dVar.f50804n;
                    zVar.C(i13);
                    c23191j.d(zVar.f47962a, 0, i13, false);
                    return;
                }
                if (i12 == 16877) {
                    dVar.d(i12);
                    C1855d c1855d5 = dVar.f50811u;
                    int i22 = c1855d5.f50849g;
                    if (i22 != 1685485123 && i22 != 1685480259) {
                        c23191j.i(i13);
                        return;
                    }
                    byte[] bArr = new byte[i13];
                    c1855d5.f50831N = bArr;
                    c23191j.d(bArr, 0, i13, false);
                    return;
                }
                if (i12 == 16981) {
                    dVar.d(i12);
                    byte[] bArr2 = new byte[i13];
                    dVar.f50811u.f50851i = bArr2;
                    c23191j.d(bArr2, 0, i13, false);
                    return;
                }
                if (i12 == 18402) {
                    byte[] bArr3 = new byte[i13];
                    c23191j.d(bArr3, 0, i13, false);
                    dVar.d(i12);
                    dVar.f50811u.f50852j = new J.a(1, 0, 0, bArr3);
                    return;
                }
                if (i12 == 21419) {
                    z zVar2 = dVar.f50799i;
                    Arrays.fill(zVar2.f47962a, (byte) 0);
                    c23191j.d(zVar2.f47962a, 4 - i13, i13, false);
                    zVar2.F(0);
                    dVar.f50813w = (int) zVar2.v();
                    return;
                }
                if (i12 == 25506) {
                    dVar.d(i12);
                    byte[] bArr4 = new byte[i13];
                    dVar.f50811u.f50853k = bArr4;
                    c23191j.d(bArr4, 0, i13, false);
                    return;
                }
                if (i12 != 30322) {
                    throw ParserException.a("Unexpected id: " + i12, null);
                }
                dVar.d(i12);
                byte[] bArr5 = new byte[i13];
                dVar.f50811u.f50864v = bArr5;
                c23191j.d(bArr5, 0, i13, false);
                return;
            }
            int i23 = dVar.f50769G;
            z zVar3 = dVar.f50797g;
            if (i23 == 0) {
                f fVar = dVar.f50791b;
                dVar.f50775M = (int) fVar.c(c23191j, false, true, 8);
                dVar.f50776N = fVar.f50874c;
                dVar.f50771I = -9223372036854775807L;
                dVar.f50769G = 1;
                zVar3.C(0);
            }
            C1855d c1855d6 = sparseArray.get(dVar.f50775M);
            if (c1855d6 == null) {
                c23191j.i(i13 - dVar.f50776N);
                dVar.f50769G = 0;
                return;
            }
            c1855d6.f50841X.getClass();
            if (dVar.f50769G == 1) {
                dVar.g(c23191j, 3);
                int i24 = (zVar3.f47962a[2] & 6) >> 1;
                byte b12 = 255;
                if (i24 == 0) {
                    dVar.f50773K = 1;
                    int[] iArr = dVar.f50774L;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else if (iArr.length < 1) {
                        iArr = new int[Math.max(iArr.length * 2, 1)];
                    }
                    dVar.f50774L = iArr;
                    iArr[0] = (i13 - dVar.f50776N) - 3;
                } else {
                    dVar.g(c23191j, 4);
                    int i25 = (zVar3.f47962a[3] & 255) + 1;
                    dVar.f50773K = i25;
                    int[] iArr2 = dVar.f50774L;
                    if (iArr2 == null) {
                        iArr2 = new int[i25];
                    } else if (iArr2.length < i25) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i25)];
                    }
                    dVar.f50774L = iArr2;
                    if (i24 == 2) {
                        int i26 = (i13 - dVar.f50776N) - 4;
                        int i27 = dVar.f50773K;
                        Arrays.fill(iArr2, 0, i27, i26 / i27);
                    } else {
                        if (i24 != 1) {
                            if (i24 != 3) {
                                throw ParserException.a("Unexpected lacing value: " + i24, null);
                            }
                            int i28 = 0;
                            int i29 = 0;
                            while (true) {
                                int i32 = dVar.f50773K - i19;
                                if (i28 >= i32) {
                                    c1855d2 = c1855d6;
                                    dVar.f50774L[i32] = ((i13 - dVar.f50776N) - i17) - i29;
                                    break;
                                }
                                dVar.f50774L[i28] = i18;
                                int i33 = i17 + 1;
                                dVar.g(c23191j, i33);
                                if (zVar3.f47962a[i17] == 0) {
                                    throw ParserException.a("No valid varint length mask found", null);
                                }
                                int i34 = i18;
                                while (true) {
                                    if (i34 >= 8) {
                                        c1855d3 = c1855d6;
                                        j12 = 0;
                                        i17 = i33;
                                        break;
                                    }
                                    int i35 = i19 << (7 - i34);
                                    if ((zVar3.f47962a[i17] & i35) != 0) {
                                        int i36 = i33 + i34;
                                        dVar.g(c23191j, i36);
                                        C1855d c1855d7 = c1855d6;
                                        j12 = zVar3.f47962a[i17] & b12 & (~i35);
                                        while (i33 < i36) {
                                            j12 = (j12 << 8) | (zVar3.f47962a[i33] & 255);
                                            i33++;
                                            i36 = i36;
                                            c1855d7 = c1855d7;
                                        }
                                        c1855d3 = c1855d7;
                                        int i37 = i36;
                                        if (i28 > 0) {
                                            j12 -= (1 << ((i34 * 7) + 6)) - 1;
                                        }
                                        i17 = i37;
                                    } else {
                                        i34++;
                                        b12 = 255;
                                        i19 = 1;
                                    }
                                }
                                if (j12 < -2147483648L || j12 > 2147483647L) {
                                    break;
                                }
                                int i38 = (int) j12;
                                int[] iArr3 = dVar.f50774L;
                                if (i28 != 0) {
                                    i38 += iArr3[i28 - 1];
                                }
                                iArr3[i28] = i38;
                                i29 += i38;
                                i28++;
                                c1855d6 = c1855d3;
                                b12 = 255;
                                i18 = 0;
                                i19 = 1;
                            }
                            throw ParserException.a("EBML lacing sample size out of range.", null);
                        }
                        int i39 = 0;
                        int i42 = 0;
                        while (true) {
                            i14 = dVar.f50773K - 1;
                            if (i39 >= i14) {
                                break;
                            }
                            dVar.f50774L[i39] = 0;
                            while (true) {
                                i15 = i17 + 1;
                                dVar.g(c23191j, i15);
                                int i43 = zVar3.f47962a[i17] & 255;
                                int[] iArr4 = dVar.f50774L;
                                i16 = iArr4[i39] + i43;
                                iArr4[i39] = i16;
                                if (i43 != 255) {
                                    break;
                                } else {
                                    i17 = i15;
                                }
                            }
                            i42 += i16;
                            i39++;
                            i17 = i15;
                        }
                        dVar.f50774L[i14] = ((i13 - dVar.f50776N) - i17) - i42;
                    }
                }
                c1855d2 = c1855d6;
                byte[] bArr6 = zVar3.f47962a;
                dVar.f50770H = dVar.k((bArr6[1] & 255) | (bArr6[0] << 8)) + dVar.f50764B;
                c1855d = c1855d2;
                dVar.f50777O = (c1855d.f50846d == 2 || (i12 == 163 && (zVar3.f47962a[2] & 128) == 128)) ? 1 : 0;
                dVar.f50769G = 2;
                dVar.f50772J = 0;
            } else {
                c1855d = c1855d6;
            }
            if (i12 == 163) {
                while (true) {
                    int i44 = dVar.f50772J;
                    if (i44 >= dVar.f50773K) {
                        dVar.f50769G = 0;
                        return;
                    }
                    dVar.e(c1855d, ((dVar.f50772J * c1855d.f50847e) / 1000) + dVar.f50770H, dVar.f50777O, dVar.l(c23191j, c1855d, dVar.f50774L[i44], false), 0);
                    dVar.f50772J++;
                    c1855d = c1855d;
                }
            } else {
                C1855d c1855d8 = c1855d;
                while (true) {
                    int i45 = dVar.f50772J;
                    if (i45 >= dVar.f50773K) {
                        return;
                    }
                    int[] iArr5 = dVar.f50774L;
                    iArr5[i45] = dVar.l(c23191j, c1855d8, iArr5[i45], true);
                    dVar.f50772J++;
                }
            }
        }

        public final void b(int i12, long j12) throws ParserException {
            d dVar = d.this;
            dVar.getClass();
            if (i12 == 20529) {
                if (j12 == 0) {
                    return;
                }
                throw ParserException.a("ContentEncodingOrder " + j12 + " not supported", null);
            }
            if (i12 == 20530) {
                if (j12 == 1) {
                    return;
                }
                throw ParserException.a("ContentEncodingScope " + j12 + " not supported", null);
            }
            switch (i12) {
                case 131:
                    dVar.d(i12);
                    dVar.f50811u.f50846d = (int) j12;
                    return;
                case 136:
                    dVar.d(i12);
                    dVar.f50811u.f50839V = j12 == 1;
                    return;
                case 155:
                    dVar.f50771I = dVar.k(j12);
                    return;
                case 159:
                    dVar.d(i12);
                    dVar.f50811u.f50832O = (int) j12;
                    return;
                case 176:
                    dVar.d(i12);
                    dVar.f50811u.f50855m = (int) j12;
                    return;
                case 179:
                    dVar.c(i12);
                    dVar.f50765C.a(dVar.k(j12));
                    return;
                case 186:
                    dVar.d(i12);
                    dVar.f50811u.f50856n = (int) j12;
                    return;
                case JfifUtil.MARKER_RST7 /* 215 */:
                    dVar.d(i12);
                    dVar.f50811u.f50845c = (int) j12;
                    return;
                case 231:
                    dVar.f50764B = dVar.k(j12);
                    return;
                case 238:
                    dVar.f50778P = (int) j12;
                    return;
                case 241:
                    if (dVar.f50767E) {
                        return;
                    }
                    dVar.c(i12);
                    dVar.f50766D.a(j12);
                    dVar.f50767E = true;
                    return;
                case 251:
                    dVar.f50779Q = true;
                    return;
                case 16871:
                    dVar.d(i12);
                    dVar.f50811u.f50849g = (int) j12;
                    return;
                case 16980:
                    if (j12 == 3) {
                        return;
                    }
                    throw ParserException.a("ContentCompAlgo " + j12 + " not supported", null);
                case 17029:
                    if (j12 < 1 || j12 > 2) {
                        throw ParserException.a("DocTypeReadVersion " + j12 + " not supported", null);
                    }
                    return;
                case 17143:
                    if (j12 == 1) {
                        return;
                    }
                    throw ParserException.a("EBMLReadVersion " + j12 + " not supported", null);
                case 18401:
                    if (j12 == 5) {
                        return;
                    }
                    throw ParserException.a("ContentEncAlgo " + j12 + " not supported", null);
                case 18408:
                    if (j12 == 1) {
                        return;
                    }
                    throw ParserException.a("AESSettingsCipherMode " + j12 + " not supported", null);
                case 21420:
                    dVar.f50814x = j12 + dVar.f50807q;
                    return;
                case 21432:
                    int i13 = (int) j12;
                    dVar.d(i12);
                    if (i13 == 0) {
                        dVar.f50811u.f50865w = 0;
                        return;
                    }
                    if (i13 == 1) {
                        dVar.f50811u.f50865w = 2;
                        return;
                    } else if (i13 == 3) {
                        dVar.f50811u.f50865w = 1;
                        return;
                    } else {
                        if (i13 != 15) {
                            return;
                        }
                        dVar.f50811u.f50865w = 3;
                        return;
                    }
                case 21680:
                    dVar.d(i12);
                    dVar.f50811u.f50857o = (int) j12;
                    return;
                case 21682:
                    dVar.d(i12);
                    dVar.f50811u.f50859q = (int) j12;
                    return;
                case 21690:
                    dVar.d(i12);
                    dVar.f50811u.f50858p = (int) j12;
                    return;
                case 21930:
                    dVar.d(i12);
                    dVar.f50811u.f50838U = j12 == 1;
                    return;
                case 21998:
                    dVar.d(i12);
                    dVar.f50811u.f50848f = (int) j12;
                    return;
                case 22186:
                    dVar.d(i12);
                    dVar.f50811u.f50835R = j12;
                    return;
                case 22203:
                    dVar.d(i12);
                    dVar.f50811u.f50836S = j12;
                    return;
                case 25188:
                    dVar.d(i12);
                    dVar.f50811u.f50833P = (int) j12;
                    return;
                case 30114:
                    dVar.f50780R = j12;
                    return;
                case 30321:
                    dVar.d(i12);
                    int i14 = (int) j12;
                    if (i14 == 0) {
                        dVar.f50811u.f50860r = 0;
                        return;
                    }
                    if (i14 == 1) {
                        dVar.f50811u.f50860r = 1;
                        return;
                    } else if (i14 == 2) {
                        dVar.f50811u.f50860r = 2;
                        return;
                    } else {
                        if (i14 != 3) {
                            return;
                        }
                        dVar.f50811u.f50860r = 3;
                        return;
                    }
                case 2352003:
                    dVar.d(i12);
                    dVar.f50811u.f50847e = (int) j12;
                    return;
                case 2807729:
                    dVar.f50808r = j12;
                    return;
                default:
                    switch (i12) {
                        case 21945:
                            dVar.d(i12);
                            int i15 = (int) j12;
                            if (i15 == 1) {
                                dVar.f50811u.f50818A = 2;
                                return;
                            } else {
                                if (i15 != 2) {
                                    return;
                                }
                                dVar.f50811u.f50818A = 1;
                                return;
                            }
                        case 21946:
                            dVar.d(i12);
                            int iG2 = C23101l.g((int) j12);
                            if (iG2 != -1) {
                                dVar.f50811u.f50868z = iG2;
                                return;
                            }
                            return;
                        case 21947:
                            dVar.d(i12);
                            dVar.f50811u.f50866x = true;
                            int iB2 = C23101l.b((int) j12);
                            if (iB2 != -1) {
                                dVar.f50811u.f50867y = iB2;
                                return;
                            }
                            return;
                        case 21948:
                            dVar.d(i12);
                            dVar.f50811u.f50819B = (int) j12;
                            return;
                        case 21949:
                            dVar.d(i12);
                            dVar.f50811u.f50820C = (int) j12;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    /* compiled from: MatroskaExtractor.java */
    /* renamed from: androidx.media3.extractor.mkv.d$d, reason: collision with other inner class name */
    public static final class C1855d {

        /* renamed from: N, reason: collision with root package name */
        public byte[] f50831N;

        /* renamed from: T, reason: collision with root package name */
        public K f50837T;

        /* renamed from: U, reason: collision with root package name */
        public boolean f50838U;

        /* renamed from: X, reason: collision with root package name */
        public androidx.media3.extractor.J f50841X;

        /* renamed from: Y, reason: collision with root package name */
        public int f50842Y;

        /* renamed from: a, reason: collision with root package name */
        public String f50843a;

        /* renamed from: b, reason: collision with root package name */
        public String f50844b;

        /* renamed from: c, reason: collision with root package name */
        public int f50845c;

        /* renamed from: d, reason: collision with root package name */
        public int f50846d;

        /* renamed from: e, reason: collision with root package name */
        public int f50847e;

        /* renamed from: f, reason: collision with root package name */
        public int f50848f;

        /* renamed from: g, reason: collision with root package name */
        public int f50849g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f50850h;

        /* renamed from: i, reason: collision with root package name */
        public byte[] f50851i;

        /* renamed from: j, reason: collision with root package name */
        public J.a f50852j;

        /* renamed from: k, reason: collision with root package name */
        public byte[] f50853k;

        /* renamed from: l, reason: collision with root package name */
        public DrmInitData f50854l;

        /* renamed from: m, reason: collision with root package name */
        public int f50855m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f50856n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f50857o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f50858p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f50859q = 0;

        /* renamed from: r, reason: collision with root package name */
        public int f50860r = -1;

        /* renamed from: s, reason: collision with root package name */
        public float f50861s = 0.0f;

        /* renamed from: t, reason: collision with root package name */
        public float f50862t = 0.0f;

        /* renamed from: u, reason: collision with root package name */
        public float f50863u = 0.0f;

        /* renamed from: v, reason: collision with root package name */
        public byte[] f50864v = null;

        /* renamed from: w, reason: collision with root package name */
        public int f50865w = -1;

        /* renamed from: x, reason: collision with root package name */
        public boolean f50866x = false;

        /* renamed from: y, reason: collision with root package name */
        public int f50867y = -1;

        /* renamed from: z, reason: collision with root package name */
        public int f50868z = -1;

        /* renamed from: A, reason: collision with root package name */
        public int f50818A = -1;

        /* renamed from: B, reason: collision with root package name */
        public int f50819B = 1000;

        /* renamed from: C, reason: collision with root package name */
        public int f50820C = 200;

        /* renamed from: D, reason: collision with root package name */
        public float f50821D = -1.0f;

        /* renamed from: E, reason: collision with root package name */
        public float f50822E = -1.0f;

        /* renamed from: F, reason: collision with root package name */
        public float f50823F = -1.0f;

        /* renamed from: G, reason: collision with root package name */
        public float f50824G = -1.0f;

        /* renamed from: H, reason: collision with root package name */
        public float f50825H = -1.0f;

        /* renamed from: I, reason: collision with root package name */
        public float f50826I = -1.0f;

        /* renamed from: J, reason: collision with root package name */
        public float f50827J = -1.0f;

        /* renamed from: K, reason: collision with root package name */
        public float f50828K = -1.0f;

        /* renamed from: L, reason: collision with root package name */
        public float f50829L = -1.0f;

        /* renamed from: M, reason: collision with root package name */
        public float f50830M = -1.0f;

        /* renamed from: O, reason: collision with root package name */
        public int f50832O = 1;

        /* renamed from: P, reason: collision with root package name */
        public int f50833P = -1;

        /* renamed from: Q, reason: collision with root package name */
        public int f50834Q = JosStatusCodes.RTN_CODE_COMMON_ERROR;

        /* renamed from: R, reason: collision with root package name */
        public long f50835R = 0;

        /* renamed from: S, reason: collision with root package name */
        public long f50836S = 0;

        /* renamed from: V, reason: collision with root package name */
        public boolean f50839V = true;

        /* renamed from: W, reason: collision with root package name */
        public String f50840W = "eng";

        @InterfaceC49173d
        public final byte[] a(String str) throws ParserException {
            byte[] bArr = this.f50853k;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.a("Missing CodecPrivate for codec " + str, null);
        }
    }

    static {
        int i12 = M.f47887a;
        f50758d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(C37262f.f359034c);
        f50759e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f50760f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f50761g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        S.e(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        S.e(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f50762h0 = Collections.unmodifiableMap(map);
    }

    public d() {
        this(0);
    }

    public static byte[] f(long j12, long j13, String str) {
        C23110a.b(j12 != -9223372036854775807L);
        int i12 = (int) (j12 / 3600000000L);
        long j14 = j12 - (i12 * 3600000000L);
        int i13 = (int) (j14 / 60000000);
        long j15 = j14 - (i13 * 60000000);
        int i14 = (int) (j15 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf((int) ((j15 - (i14 * 1000000)) / j13)));
        int i15 = M.f47887a;
        return str2.getBytes(C37262f.f359034c);
    }

    @Override // androidx.media3.extractor.p
    @InterfaceC42153i
    public final void a(long j12, long j13) {
        this.f50764B = -9223372036854775807L;
        this.f50769G = 0;
        androidx.media3.extractor.mkv.a aVar = this.f50789a;
        aVar.f50752e = 0;
        aVar.f50749b.clear();
        f fVar = aVar.f50750c;
        fVar.f50873b = 0;
        fVar.f50874c = 0;
        f fVar2 = this.f50791b;
        fVar2.f50873b = 0;
        fVar2.f50874c = 0;
        j();
        int i12 = 0;
        while (true) {
            SparseArray<C1855d> sparseArray = this.f50793c;
            if (i12 >= sparseArray.size()) {
                return;
            }
            K k12 = sparseArray.valueAt(i12).f50837T;
            if (k12 != null) {
                k12.f50385b = false;
                k12.f50386c = 0;
            }
            i12++;
        }
    }

    @Override // androidx.media3.extractor.p
    public final boolean b(q qVar) throws EOFException, InterruptedIOException {
        e eVar = new e();
        C23191j c23191j = (C23191j) qVar;
        long j12 = c23191j.f50582c;
        long j13 = 1024;
        if (j12 != -1 && j12 <= 1024) {
            j13 = j12;
        }
        int i12 = (int) j13;
        z zVar = eVar.f50869a;
        c23191j.a(zVar.f47962a, 0, 4, false);
        eVar.f50870b = 4;
        for (long jV2 = zVar.v(); jV2 != 440786851; jV2 = ((jV2 << 8) & (-256)) | (zVar.f47962a[0] & 255)) {
            int i13 = eVar.f50870b + 1;
            eVar.f50870b = i13;
            if (i13 == i12) {
                return false;
            }
            c23191j.a(zVar.f47962a, 0, 1, false);
        }
        long jA2 = eVar.a(c23191j);
        long j14 = eVar.f50870b;
        if (jA2 == Long.MIN_VALUE) {
            return false;
        }
        if (j12 != -1 && j14 + jA2 >= j12) {
            return false;
        }
        while (true) {
            long j15 = eVar.f50870b;
            long j16 = j14 + jA2;
            if (j15 >= j16) {
                return j15 == j16;
            }
            if (eVar.a(c23191j) == Long.MIN_VALUE) {
                return false;
            }
            long jA3 = eVar.a(c23191j);
            if (jA3 < 0 || jA3 > 2147483647L) {
                return false;
            }
            if (jA3 != 0) {
                int i14 = (int) jA3;
                c23191j.k(i14, false);
                eVar.f50870b += i14;
            }
        }
    }

    @InterfaceC49173d
    public final void c(int i12) throws ParserException {
        if (this.f50765C == null || this.f50766D == null) {
            throw ParserException.a("Element " + i12 + " must be in a Cues", null);
        }
    }

    @InterfaceC49173d
    public final void d(int i12) throws ParserException {
        if (this.f50811u != null) {
            return;
        }
        throw ParserException.a("Element " + i12 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    @v61.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(androidx.media3.extractor.mkv.d.C1855d r17, long r18, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mkv.d.e(androidx.media3.extractor.mkv.d$d, long, int, int, int):void");
    }

    public final void g(C23191j c23191j, int i12) throws EOFException, InterruptedIOException {
        z zVar = this.f50797g;
        if (zVar.f47964c >= i12) {
            return;
        }
        byte[] bArr = zVar.f47962a;
        if (bArr.length < i12) {
            zVar.b(Math.max(bArr.length * 2, i12));
        }
        byte[] bArr2 = zVar.f47962a;
        int i13 = zVar.f47964c;
        c23191j.d(bArr2, i13, i12 - i13, false);
        zVar.E(i12);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x049c A[PHI: r39
  0x049c: PHI (r39v37 java.lang.String) = 
  (r39v3 java.lang.String)
  (r39v4 java.lang.String)
  (r39v5 java.lang.String)
  (r39v6 java.lang.String)
  (r39v7 java.lang.String)
  (r39v8 java.lang.String)
  (r39v9 java.lang.String)
  (r39v10 java.lang.String)
  (r39v11 java.lang.String)
  (r39v12 java.lang.String)
  (r39v13 java.lang.String)
  (r39v14 java.lang.String)
  (r39v15 java.lang.String)
  (r39v16 java.lang.String)
  (r39v17 java.lang.String)
  (r39v18 java.lang.String)
  (r39v19 java.lang.String)
  (r39v20 java.lang.String)
  (r39v21 java.lang.String)
  (r39v22 java.lang.String)
  (r39v23 java.lang.String)
  (r39v24 java.lang.String)
  (r39v25 java.lang.String)
  (r39v26 java.lang.String)
  (r39v27 java.lang.String)
  (r39v28 java.lang.String)
  (r39v29 java.lang.String)
  (r39v30 java.lang.String)
  (r39v31 java.lang.String)
  (r39v32 java.lang.String)
  (r39v33 java.lang.String)
  (r39v34 java.lang.String)
  (r39v38 java.lang.String)
 binds: [B:366:0x0683, B:362:0x0678, B:358:0x066d, B:354:0x0662, B:350:0x0657, B:346:0x064c, B:342:0x0641, B:338:0x0634, B:334:0x0624, B:330:0x0614, B:326:0x0604, B:322:0x05f4, B:318:0x05e4, B:314:0x05d4, B:310:0x05c4, B:306:0x05b4, B:302:0x05a4, B:298:0x0594, B:294:0x0584, B:290:0x0574, B:286:0x0564, B:282:0x0554, B:278:0x0544, B:274:0x0534, B:270:0x0524, B:266:0x0514, B:262:0x0504, B:258:0x04f4, B:254:0x04e4, B:250:0x04d4, B:246:0x04c4, B:242:0x04b4, B:235:0x049a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0acd  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0ae4  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0ae6  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0af7  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0b08  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0cc6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0237 A[PHI: r6 r7 r10
  0x0237: PHI (r6v196 java.lang.String) = (r6v21 java.lang.String), (r6v22 java.lang.String), (r6v197 java.lang.String) binds: [B:228:0x0457, B:224:0x0447, B:96:0x0233] A[DONT_GENERATE, DONT_INLINE]
  0x0237: PHI (r7v112 java.lang.String) = (r7v15 java.lang.String), (r7v16 java.lang.String), (r7v113 java.lang.String) binds: [B:228:0x0457, B:224:0x0447, B:96:0x0233] A[DONT_GENERATE, DONT_INLINE]
  0x0237: PHI (r10v33 java.lang.String) = (r10v10 java.lang.String), (r10v11 java.lang.String), (r10v34 java.lang.String) binds: [B:228:0x0457, B:224:0x0447, B:96:0x0233] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v48, types: [androidx.media3.extractor.mkv.d$c] */
    /* JADX WARN: Type inference failed for: r0v88, types: [androidx.media3.extractor.mkv.d$d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r2v145 */
    /* JADX WARN: Type inference failed for: r2v40, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.media3.extractor.mkv.f] */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.media3.extractor.j] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [androidx.media3.extractor.mkv.a] */
    /* JADX WARN: Type inference failed for: r9v82 */
    @Override // androidx.media3.extractor.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(androidx.media3.extractor.q r46, androidx.media3.extractor.F r47) throws androidx.media3.common.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 5342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mkv.d.h(androidx.media3.extractor.q, androidx.media3.extractor.F):int");
    }

    @Override // androidx.media3.extractor.p
    public final void i(r rVar) {
        this.f50792b0 = rVar;
    }

    public final void j() {
        this.f50781S = 0;
        this.f50782T = 0;
        this.f50783U = 0;
        this.f50784V = false;
        this.f50785W = false;
        this.f50786X = false;
        this.f50787Y = 0;
        this.f50788Z = (byte) 0;
        this.f50790a0 = false;
        this.f50800j.C(0);
    }

    public final long k(long j12) throws ParserException {
        long j13 = this.f50808r;
        if (j13 != -9223372036854775807L) {
            return M.K(j12, j13, 1000L);
        }
        throw ParserException.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @m
    public final int l(C23191j c23191j, C1855d c1855d, int i12, boolean z12) throws ParserException, EOFException, InterruptedIOException {
        int iA2;
        int iA3;
        int i13;
        if ("S_TEXT/UTF8".equals(c1855d.f50844b)) {
            m(c23191j, f50757c0, i12);
            int i14 = this.f50782T;
            j();
            return i14;
        }
        if ("S_TEXT/ASS".equals(c1855d.f50844b)) {
            m(c23191j, f50759e0, i12);
            int i15 = this.f50782T;
            j();
            return i15;
        }
        if ("S_TEXT/WEBVTT".equals(c1855d.f50844b)) {
            m(c23191j, f50760f0, i12);
            int i16 = this.f50782T;
            j();
            return i16;
        }
        androidx.media3.extractor.J j12 = c1855d.f50841X;
        boolean z13 = this.f50784V;
        z zVar = this.f50800j;
        if (!z13) {
            boolean z14 = c1855d.f50850h;
            z zVar2 = this.f50797g;
            if (z14) {
                this.f50777O &= -1073741825;
                if (!this.f50785W) {
                    c23191j.d(zVar2.f47962a, 0, 1, false);
                    this.f50781S++;
                    byte b12 = zVar2.f47962a[0];
                    if ((b12 & 128) == 128) {
                        throw ParserException.a("Extension bit is set in signal byte", null);
                    }
                    this.f50788Z = b12;
                    this.f50785W = true;
                }
                byte b13 = this.f50788Z;
                if ((b13 & 1) == 1) {
                    boolean z15 = (b13 & 2) == 2;
                    this.f50777O |= 1073741824;
                    if (!this.f50790a0) {
                        z zVar3 = this.f50802l;
                        c23191j.d(zVar3.f47962a, 0, 8, false);
                        this.f50781S += 8;
                        this.f50790a0 = true;
                        zVar2.f47962a[0] = (byte) ((z15 ? 128 : 0) | 8);
                        zVar2.F(0);
                        j12.d(1, zVar2);
                        this.f50782T++;
                        zVar3.F(0);
                        j12.d(8, zVar3);
                        this.f50782T += 8;
                    }
                    if (z15) {
                        if (!this.f50786X) {
                            c23191j.d(zVar2.f47962a, 0, 1, false);
                            this.f50781S++;
                            zVar2.F(0);
                            this.f50787Y = zVar2.u();
                            this.f50786X = true;
                        }
                        int i17 = this.f50787Y * 4;
                        zVar2.C(i17);
                        c23191j.d(zVar2.f47962a, 0, i17, false);
                        this.f50781S += i17;
                        short s5 = (short) ((this.f50787Y / 2) + 1);
                        int i18 = (s5 * 6) + 2;
                        ByteBuffer byteBuffer = this.f50805o;
                        if (byteBuffer == null || byteBuffer.capacity() < i18) {
                            this.f50805o = ByteBuffer.allocate(i18);
                        }
                        this.f50805o.position(0);
                        this.f50805o.putShort(s5);
                        int i19 = 0;
                        int i22 = 0;
                        while (true) {
                            i13 = this.f50787Y;
                            if (i19 >= i13) {
                                break;
                            }
                            int iX2 = zVar2.x();
                            if (i19 % 2 == 0) {
                                this.f50805o.putShort((short) (iX2 - i22));
                            } else {
                                this.f50805o.putInt(iX2 - i22);
                            }
                            i19++;
                            i22 = iX2;
                        }
                        int i23 = (i12 - this.f50781S) - i22;
                        if (i13 % 2 == 1) {
                            this.f50805o.putInt(i23);
                        } else {
                            this.f50805o.putShort((short) i23);
                            this.f50805o.putInt(0);
                        }
                        byte[] bArrArray = this.f50805o.array();
                        z zVar4 = this.f50803m;
                        zVar4.D(i18, bArrArray);
                        j12.d(i18, zVar4);
                        this.f50782T += i18;
                    }
                }
            } else {
                byte[] bArr = c1855d.f50851i;
                if (bArr != null) {
                    zVar.D(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(c1855d.f50844b) ? z12 : c1855d.f50848f > 0) {
                this.f50777O |= 268435456;
                this.f50804n.C(0);
                int i24 = (zVar.f47964c + i12) - this.f50781S;
                zVar2.C(4);
                byte[] bArr2 = zVar2.f47962a;
                bArr2[0] = (byte) ((i24 >> 24) & 255);
                bArr2[1] = (byte) ((i24 >> 16) & 255);
                bArr2[2] = (byte) ((i24 >> 8) & 255);
                bArr2[3] = (byte) (i24 & 255);
                j12.d(4, zVar2);
                this.f50782T += 4;
            }
            this.f50784V = true;
        }
        int i25 = i12 + zVar.f47964c;
        if (!"V_MPEG4/ISO/AVC".equals(c1855d.f50844b) && !"V_MPEGH/ISO/HEVC".equals(c1855d.f50844b)) {
            if (c1855d.f50837T != null) {
                C23110a.g(zVar.f47964c == 0);
                c1855d.f50837T.c(c23191j);
            }
            while (true) {
                int i26 = this.f50781S;
                if (i26 >= i25) {
                    break;
                }
                int i27 = i25 - i26;
                int iA4 = zVar.a();
                if (iA4 > 0) {
                    iA3 = Math.min(i27, iA4);
                    j12.e(iA3, zVar);
                } else {
                    iA3 = j12.a(c23191j, i27, false);
                }
                this.f50781S += iA3;
                this.f50782T += iA3;
            }
        } else {
            z zVar5 = this.f50796f;
            byte[] bArr3 = zVar5.f47962a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i28 = c1855d.f50842Y;
            int i29 = 4 - i28;
            while (this.f50781S < i25) {
                int i32 = this.f50783U;
                if (i32 == 0) {
                    int iMin = Math.min(i28, zVar.a());
                    c23191j.d(bArr3, i29 + iMin, i28 - iMin, false);
                    if (iMin > 0) {
                        zVar.e(i29, iMin, bArr3);
                    }
                    this.f50781S += i28;
                    zVar5.F(0);
                    this.f50783U = zVar5.x();
                    z zVar6 = this.f50795e;
                    zVar6.F(0);
                    j12.e(4, zVar6);
                    this.f50782T += 4;
                } else {
                    int iA5 = zVar.a();
                    if (iA5 > 0) {
                        iA2 = Math.min(i32, iA5);
                        j12.e(iA2, zVar);
                    } else {
                        iA2 = j12.a(c23191j, i32, false);
                    }
                    this.f50781S += iA2;
                    this.f50782T += iA2;
                    this.f50783U -= iA2;
                }
            }
        }
        if ("A_VORBIS".equals(c1855d.f50844b)) {
            z zVar7 = this.f50798h;
            zVar7.F(0);
            j12.e(4, zVar7);
            this.f50782T += 4;
        }
        int i33 = this.f50782T;
        j();
        return i33;
    }

    public final void m(C23191j c23191j, byte[] bArr, int i12) throws EOFException, InterruptedIOException {
        int length = bArr.length + i12;
        z zVar = this.f50801k;
        byte[] bArr2 = zVar.f47962a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i12);
            zVar.D(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        c23191j.d(zVar.f47962a, bArr.length, i12, false);
        zVar.F(0);
        zVar.E(length);
    }

    public d(int i12) {
        androidx.media3.extractor.mkv.a aVar = new androidx.media3.extractor.mkv.a();
        this.f50807q = -1L;
        this.f50808r = -9223372036854775807L;
        this.f50809s = -9223372036854775807L;
        this.f50810t = -9223372036854775807L;
        this.f50816z = -1L;
        this.f50763A = -1L;
        this.f50764B = -9223372036854775807L;
        this.f50789a = aVar;
        aVar.f50751d = new c(null);
        this.f50794d = true;
        this.f50791b = new f();
        this.f50793c = new SparseArray<>();
        this.f50797g = new z(4);
        this.f50798h = new z(ByteBuffer.allocate(4).putInt(-1).array());
        this.f50799i = new z(4);
        this.f50795e = new z(androidx.media3.container.b.f48118a);
        this.f50796f = new z(4);
        this.f50800j = new z();
        this.f50801k = new z();
        this.f50802l = new z(8);
        this.f50803m = new z();
        this.f50804n = new z();
        this.f50774L = new int[1];
    }

    @Override // androidx.media3.extractor.p
    public final void release() {
    }
}
