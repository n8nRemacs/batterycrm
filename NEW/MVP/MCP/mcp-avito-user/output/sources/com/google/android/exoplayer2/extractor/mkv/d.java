package com.google.android.exoplayer2.extractor.mkv;

import android.util.SparseArray;
import androidx.media3.common.S;
import com.facebook.imageutils.JfifUtil;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.A;
import com.google.android.exoplayer2.extractor.B;
import com.google.android.exoplayer2.extractor.j;
import com.google.android.exoplayer2.extractor.k;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36606w;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
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
/* loaded from: classes6.dex */
public class d implements j {

    /* renamed from: c0, reason: collision with root package name */
    public static final byte[] f344585c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0, reason: collision with root package name */
    public static final byte[] f344586d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f344587e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f344588f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final UUID f344589g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final Map<String, Integer> f344590h0;

    /* renamed from: A, reason: collision with root package name */
    public long f344591A;

    /* renamed from: B, reason: collision with root package name */
    public long f344592B;

    /* renamed from: C, reason: collision with root package name */
    @P
    public C36606w f344593C;

    /* renamed from: D, reason: collision with root package name */
    @P
    public C36606w f344594D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f344595E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f344596F;

    /* renamed from: G, reason: collision with root package name */
    public int f344597G;

    /* renamed from: H, reason: collision with root package name */
    public long f344598H;

    /* renamed from: I, reason: collision with root package name */
    public long f344599I;

    /* renamed from: J, reason: collision with root package name */
    public int f344600J;

    /* renamed from: K, reason: collision with root package name */
    public int f344601K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f344602L;

    /* renamed from: M, reason: collision with root package name */
    public int f344603M;

    /* renamed from: N, reason: collision with root package name */
    public int f344604N;

    /* renamed from: O, reason: collision with root package name */
    public int f344605O;

    /* renamed from: P, reason: collision with root package name */
    public int f344606P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f344607Q;

    /* renamed from: R, reason: collision with root package name */
    public long f344608R;

    /* renamed from: S, reason: collision with root package name */
    public int f344609S;

    /* renamed from: T, reason: collision with root package name */
    public int f344610T;

    /* renamed from: U, reason: collision with root package name */
    public int f344611U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f344612V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f344613W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f344614X;

    /* renamed from: Y, reason: collision with root package name */
    public int f344615Y;

    /* renamed from: Z, reason: collision with root package name */
    public byte f344616Z;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.extractor.mkv.a f344617a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f344618a0;

    /* renamed from: b, reason: collision with root package name */
    public final f f344619b;

    /* renamed from: b0, reason: collision with root package name */
    public l f344620b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray<C10580d> f344621c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f344622d;

    /* renamed from: e, reason: collision with root package name */
    public final F f344623e;

    /* renamed from: f, reason: collision with root package name */
    public final F f344624f;

    /* renamed from: g, reason: collision with root package name */
    public final F f344625g;

    /* renamed from: h, reason: collision with root package name */
    public final F f344626h;

    /* renamed from: i, reason: collision with root package name */
    public final F f344627i;

    /* renamed from: j, reason: collision with root package name */
    public final F f344628j;

    /* renamed from: k, reason: collision with root package name */
    public final F f344629k;

    /* renamed from: l, reason: collision with root package name */
    public final F f344630l;

    /* renamed from: m, reason: collision with root package name */
    public final F f344631m;

    /* renamed from: n, reason: collision with root package name */
    public final F f344632n;

    /* renamed from: o, reason: collision with root package name */
    public ByteBuffer f344633o;

    /* renamed from: p, reason: collision with root package name */
    public long f344634p;

    /* renamed from: q, reason: collision with root package name */
    public long f344635q;

    /* renamed from: r, reason: collision with root package name */
    public long f344636r;

    /* renamed from: s, reason: collision with root package name */
    public long f344637s;

    /* renamed from: t, reason: collision with root package name */
    public long f344638t;

    /* renamed from: u, reason: collision with root package name */
    @P
    public C10580d f344639u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f344640v;

    /* renamed from: w, reason: collision with root package name */
    public int f344641w;

    /* renamed from: x, reason: collision with root package name */
    public long f344642x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f344643y;

    /* renamed from: z, reason: collision with root package name */
    public long f344644z;

    /* compiled from: MatroskaExtractor.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* compiled from: MatroskaExtractor.java */
    public final class c implements com.google.android.exoplayer2.extractor.mkv.b {
        public c(a aVar) {
        }

        public final void a(int i12, int i13, com.google.android.exoplayer2.extractor.f fVar) throws ParserException, EOFException, InterruptedIOException {
            C10580d c10580d;
            C10580d c10580d2;
            C10580d c10580d3;
            long j12;
            int i14;
            int i15;
            int i16;
            d dVar = d.this;
            SparseArray<C10580d> sparseArray = dVar.f344621c;
            int i17 = 4;
            int i18 = 0;
            int i19 = 1;
            if (i12 != 161 && i12 != 163) {
                if (i12 == 165) {
                    if (dVar.f344597G != 2) {
                        return;
                    }
                    C10580d c10580d4 = sparseArray.get(dVar.f344603M);
                    if (dVar.f344606P != 4 || !"V_VP9".equals(c10580d4.f344672b)) {
                        fVar.i(i13);
                        return;
                    }
                    F f12 = dVar.f344632n;
                    f12.y(i13);
                    fVar.d(f12.f348070a, 0, i13, false);
                    return;
                }
                if (i12 == 16877) {
                    dVar.d(i12);
                    C10580d c10580d5 = dVar.f344639u;
                    int i22 = c10580d5.f344677g;
                    if (i22 != 1685485123 && i22 != 1685480259) {
                        fVar.i(i13);
                        return;
                    }
                    byte[] bArr = new byte[i13];
                    c10580d5.f344659N = bArr;
                    fVar.d(bArr, 0, i13, false);
                    return;
                }
                if (i12 == 16981) {
                    dVar.d(i12);
                    byte[] bArr2 = new byte[i13];
                    dVar.f344639u.f344679i = bArr2;
                    fVar.d(bArr2, 0, i13, false);
                    return;
                }
                if (i12 == 18402) {
                    byte[] bArr3 = new byte[i13];
                    fVar.d(bArr3, 0, i13, false);
                    dVar.d(i12);
                    dVar.f344639u.f344680j = new A.a(1, 0, 0, bArr3);
                    return;
                }
                if (i12 == 21419) {
                    F f13 = dVar.f344627i;
                    Arrays.fill(f13.f348070a, (byte) 0);
                    fVar.d(f13.f348070a, 4 - i13, i13, false);
                    f13.B(0);
                    dVar.f344641w = (int) f13.s();
                    return;
                }
                if (i12 == 25506) {
                    dVar.d(i12);
                    byte[] bArr4 = new byte[i13];
                    dVar.f344639u.f344681k = bArr4;
                    fVar.d(bArr4, 0, i13, false);
                    return;
                }
                if (i12 != 30322) {
                    throw ParserException.a("Unexpected id: " + i12, null);
                }
                dVar.d(i12);
                byte[] bArr5 = new byte[i13];
                dVar.f344639u.f344692v = bArr5;
                fVar.d(bArr5, 0, i13, false);
                return;
            }
            int i23 = dVar.f344597G;
            F f14 = dVar.f344625g;
            if (i23 == 0) {
                f fVar2 = dVar.f344619b;
                dVar.f344603M = (int) fVar2.c(fVar, false, true, 8);
                dVar.f344604N = fVar2.f344702c;
                dVar.f344599I = -9223372036854775807L;
                dVar.f344597G = 1;
                f14.y(0);
            }
            C10580d c10580d6 = sparseArray.get(dVar.f344603M);
            if (c10580d6 == null) {
                fVar.i(i13 - dVar.f344604N);
                dVar.f344597G = 0;
                return;
            }
            c10580d6.f344669X.getClass();
            if (dVar.f344597G == 1) {
                dVar.g(fVar, 3);
                int i24 = (f14.f348070a[2] & 6) >> 1;
                byte b12 = 255;
                if (i24 == 0) {
                    dVar.f344601K = 1;
                    int[] iArr = dVar.f344602L;
                    if (iArr == null) {
                        iArr = new int[1];
                    } else if (iArr.length < 1) {
                        iArr = new int[Math.max(iArr.length * 2, 1)];
                    }
                    dVar.f344602L = iArr;
                    iArr[0] = (i13 - dVar.f344604N) - 3;
                } else {
                    dVar.g(fVar, 4);
                    int i25 = (f14.f348070a[3] & 255) + 1;
                    dVar.f344601K = i25;
                    int[] iArr2 = dVar.f344602L;
                    if (iArr2 == null) {
                        iArr2 = new int[i25];
                    } else if (iArr2.length < i25) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i25)];
                    }
                    dVar.f344602L = iArr2;
                    if (i24 == 2) {
                        int i26 = (i13 - dVar.f344604N) - 4;
                        int i27 = dVar.f344601K;
                        Arrays.fill(iArr2, 0, i27, i26 / i27);
                    } else {
                        if (i24 != 1) {
                            if (i24 != 3) {
                                throw ParserException.a("Unexpected lacing value: " + i24, null);
                            }
                            int i28 = 0;
                            int i29 = 0;
                            while (true) {
                                int i32 = dVar.f344601K - i19;
                                if (i28 >= i32) {
                                    c10580d2 = c10580d6;
                                    dVar.f344602L[i32] = ((i13 - dVar.f344604N) - i17) - i29;
                                    break;
                                }
                                dVar.f344602L[i28] = i18;
                                int i33 = i17 + 1;
                                dVar.g(fVar, i33);
                                if (f14.f348070a[i17] == 0) {
                                    throw ParserException.a("No valid varint length mask found", null);
                                }
                                int i34 = i18;
                                while (true) {
                                    if (i34 >= 8) {
                                        c10580d3 = c10580d6;
                                        j12 = 0;
                                        i17 = i33;
                                        break;
                                    }
                                    int i35 = i19 << (7 - i34);
                                    if ((f14.f348070a[i17] & i35) != 0) {
                                        int i36 = i33 + i34;
                                        dVar.g(fVar, i36);
                                        C10580d c10580d7 = c10580d6;
                                        j12 = f14.f348070a[i17] & b12 & (~i35);
                                        while (i33 < i36) {
                                            j12 = (j12 << 8) | (f14.f348070a[i33] & 255);
                                            i33++;
                                            i36 = i36;
                                            c10580d7 = c10580d7;
                                        }
                                        c10580d3 = c10580d7;
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
                                int[] iArr3 = dVar.f344602L;
                                if (i28 != 0) {
                                    i38 += iArr3[i28 - 1];
                                }
                                iArr3[i28] = i38;
                                i29 += i38;
                                i28++;
                                c10580d6 = c10580d3;
                                b12 = 255;
                                i18 = 0;
                                i19 = 1;
                            }
                            throw ParserException.a("EBML lacing sample size out of range.", null);
                        }
                        int i39 = 0;
                        int i42 = 0;
                        while (true) {
                            i14 = dVar.f344601K - 1;
                            if (i39 >= i14) {
                                break;
                            }
                            dVar.f344602L[i39] = 0;
                            while (true) {
                                i15 = i17 + 1;
                                dVar.g(fVar, i15);
                                int i43 = f14.f348070a[i17] & 255;
                                int[] iArr4 = dVar.f344602L;
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
                        dVar.f344602L[i14] = ((i13 - dVar.f344604N) - i17) - i42;
                    }
                }
                c10580d2 = c10580d6;
                byte[] bArr6 = f14.f348070a;
                dVar.f344598H = dVar.k((bArr6[1] & 255) | (bArr6[0] << 8)) + dVar.f344592B;
                c10580d = c10580d2;
                dVar.f344605O = (c10580d.f344674d == 2 || (i12 == 163 && (f14.f348070a[2] & 128) == 128)) ? 1 : 0;
                dVar.f344597G = 2;
                dVar.f344600J = 0;
            } else {
                c10580d = c10580d6;
            }
            if (i12 == 163) {
                while (true) {
                    int i44 = dVar.f344600J;
                    if (i44 >= dVar.f344601K) {
                        dVar.f344597G = 0;
                        return;
                    }
                    dVar.e(c10580d, ((dVar.f344600J * c10580d.f344675e) / 1000) + dVar.f344598H, dVar.f344605O, dVar.l(fVar, c10580d, dVar.f344602L[i44], false), 0);
                    dVar.f344600J++;
                    c10580d = c10580d;
                }
            } else {
                C10580d c10580d8 = c10580d;
                while (true) {
                    int i45 = dVar.f344600J;
                    if (i45 >= dVar.f344601K) {
                        return;
                    }
                    int[] iArr5 = dVar.f344602L;
                    iArr5[i45] = dVar.l(fVar, c10580d8, iArr5[i45], true);
                    dVar.f344600J++;
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
            int i13 = 3;
            switch (i12) {
                case 131:
                    dVar.d(i12);
                    dVar.f344639u.f344674d = (int) j12;
                    return;
                case 136:
                    dVar.d(i12);
                    dVar.f344639u.f344667V = j12 == 1;
                    return;
                case 155:
                    dVar.f344599I = dVar.k(j12);
                    return;
                case 159:
                    dVar.d(i12);
                    dVar.f344639u.f344660O = (int) j12;
                    return;
                case 176:
                    dVar.d(i12);
                    dVar.f344639u.f344683m = (int) j12;
                    return;
                case 179:
                    dVar.c(i12);
                    dVar.f344593C.a(dVar.k(j12));
                    return;
                case 186:
                    dVar.d(i12);
                    dVar.f344639u.f344684n = (int) j12;
                    return;
                case JfifUtil.MARKER_RST7 /* 215 */:
                    dVar.d(i12);
                    dVar.f344639u.f344673c = (int) j12;
                    return;
                case 231:
                    dVar.f344592B = dVar.k(j12);
                    return;
                case 238:
                    dVar.f344606P = (int) j12;
                    return;
                case 241:
                    if (dVar.f344595E) {
                        return;
                    }
                    dVar.c(i12);
                    dVar.f344594D.a(j12);
                    dVar.f344595E = true;
                    return;
                case 251:
                    dVar.f344607Q = true;
                    return;
                case 16871:
                    dVar.d(i12);
                    dVar.f344639u.f344677g = (int) j12;
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
                    dVar.f344642x = j12 + dVar.f344635q;
                    return;
                case 21432:
                    int i14 = (int) j12;
                    dVar.d(i12);
                    if (i14 == 0) {
                        dVar.f344639u.f344693w = 0;
                        return;
                    }
                    if (i14 == 1) {
                        dVar.f344639u.f344693w = 2;
                        return;
                    } else if (i14 == 3) {
                        dVar.f344639u.f344693w = 1;
                        return;
                    } else {
                        if (i14 != 15) {
                            return;
                        }
                        dVar.f344639u.f344693w = 3;
                        return;
                    }
                case 21680:
                    dVar.d(i12);
                    dVar.f344639u.f344685o = (int) j12;
                    return;
                case 21682:
                    dVar.d(i12);
                    dVar.f344639u.f344687q = (int) j12;
                    return;
                case 21690:
                    dVar.d(i12);
                    dVar.f344639u.f344686p = (int) j12;
                    return;
                case 21930:
                    dVar.d(i12);
                    dVar.f344639u.f344666U = j12 == 1;
                    return;
                case 21998:
                    dVar.d(i12);
                    dVar.f344639u.f344676f = (int) j12;
                    return;
                case 22186:
                    dVar.d(i12);
                    dVar.f344639u.f344663R = j12;
                    return;
                case 22203:
                    dVar.d(i12);
                    dVar.f344639u.f344664S = j12;
                    return;
                case 25188:
                    dVar.d(i12);
                    dVar.f344639u.f344661P = (int) j12;
                    return;
                case 30114:
                    dVar.f344608R = j12;
                    return;
                case 30321:
                    dVar.d(i12);
                    int i15 = (int) j12;
                    if (i15 == 0) {
                        dVar.f344639u.f344688r = 0;
                        return;
                    }
                    if (i15 == 1) {
                        dVar.f344639u.f344688r = 1;
                        return;
                    } else if (i15 == 2) {
                        dVar.f344639u.f344688r = 2;
                        return;
                    } else {
                        if (i15 != 3) {
                            return;
                        }
                        dVar.f344639u.f344688r = 3;
                        return;
                    }
                case 2352003:
                    dVar.d(i12);
                    dVar.f344639u.f344675e = (int) j12;
                    return;
                case 2807729:
                    dVar.f344636r = j12;
                    return;
                default:
                    switch (i12) {
                        case 21945:
                            dVar.d(i12);
                            int i16 = (int) j12;
                            if (i16 == 1) {
                                dVar.f344639u.f344646A = 2;
                                return;
                            } else {
                                if (i16 != 2) {
                                    return;
                                }
                                dVar.f344639u.f344646A = 1;
                                return;
                            }
                        case 21946:
                            dVar.d(i12);
                            int i17 = (int) j12;
                            if (i17 != 1) {
                                if (i17 == 16) {
                                    i13 = 6;
                                } else if (i17 == 18) {
                                    i13 = 7;
                                } else if (i17 != 6 && i17 != 7) {
                                    i13 = -1;
                                }
                            }
                            if (i13 != -1) {
                                dVar.f344639u.f344696z = i13;
                                return;
                            }
                            return;
                        case 21947:
                            dVar.d(i12);
                            dVar.f344639u.f344694x = true;
                            int iA2 = com.google.android.exoplayer2.video.b.a((int) j12);
                            if (iA2 != -1) {
                                dVar.f344639u.f344695y = iA2;
                                return;
                            }
                            return;
                        case 21948:
                            dVar.d(i12);
                            dVar.f344639u.f344647B = (int) j12;
                            return;
                        case 21949:
                            dVar.d(i12);
                            dVar.f344639u.f344648C = (int) j12;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    /* compiled from: MatroskaExtractor.java */
    /* renamed from: com.google.android.exoplayer2.extractor.mkv.d$d, reason: collision with other inner class name */
    public static final class C10580d {

        /* renamed from: N, reason: collision with root package name */
        public byte[] f344659N;

        /* renamed from: T, reason: collision with root package name */
        public B f344665T;

        /* renamed from: U, reason: collision with root package name */
        public boolean f344666U;

        /* renamed from: X, reason: collision with root package name */
        public A f344669X;

        /* renamed from: Y, reason: collision with root package name */
        public int f344670Y;

        /* renamed from: a, reason: collision with root package name */
        public String f344671a;

        /* renamed from: b, reason: collision with root package name */
        public String f344672b;

        /* renamed from: c, reason: collision with root package name */
        public int f344673c;

        /* renamed from: d, reason: collision with root package name */
        public int f344674d;

        /* renamed from: e, reason: collision with root package name */
        public int f344675e;

        /* renamed from: f, reason: collision with root package name */
        public int f344676f;

        /* renamed from: g, reason: collision with root package name */
        public int f344677g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f344678h;

        /* renamed from: i, reason: collision with root package name */
        public byte[] f344679i;

        /* renamed from: j, reason: collision with root package name */
        public A.a f344680j;

        /* renamed from: k, reason: collision with root package name */
        public byte[] f344681k;

        /* renamed from: l, reason: collision with root package name */
        public DrmInitData f344682l;

        /* renamed from: m, reason: collision with root package name */
        public int f344683m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f344684n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f344685o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f344686p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f344687q = 0;

        /* renamed from: r, reason: collision with root package name */
        public int f344688r = -1;

        /* renamed from: s, reason: collision with root package name */
        public float f344689s = 0.0f;

        /* renamed from: t, reason: collision with root package name */
        public float f344690t = 0.0f;

        /* renamed from: u, reason: collision with root package name */
        public float f344691u = 0.0f;

        /* renamed from: v, reason: collision with root package name */
        public byte[] f344692v = null;

        /* renamed from: w, reason: collision with root package name */
        public int f344693w = -1;

        /* renamed from: x, reason: collision with root package name */
        public boolean f344694x = false;

        /* renamed from: y, reason: collision with root package name */
        public int f344695y = -1;

        /* renamed from: z, reason: collision with root package name */
        public int f344696z = -1;

        /* renamed from: A, reason: collision with root package name */
        public int f344646A = -1;

        /* renamed from: B, reason: collision with root package name */
        public int f344647B = 1000;

        /* renamed from: C, reason: collision with root package name */
        public int f344648C = 200;

        /* renamed from: D, reason: collision with root package name */
        public float f344649D = -1.0f;

        /* renamed from: E, reason: collision with root package name */
        public float f344650E = -1.0f;

        /* renamed from: F, reason: collision with root package name */
        public float f344651F = -1.0f;

        /* renamed from: G, reason: collision with root package name */
        public float f344652G = -1.0f;

        /* renamed from: H, reason: collision with root package name */
        public float f344653H = -1.0f;

        /* renamed from: I, reason: collision with root package name */
        public float f344654I = -1.0f;

        /* renamed from: J, reason: collision with root package name */
        public float f344655J = -1.0f;

        /* renamed from: K, reason: collision with root package name */
        public float f344656K = -1.0f;

        /* renamed from: L, reason: collision with root package name */
        public float f344657L = -1.0f;

        /* renamed from: M, reason: collision with root package name */
        public float f344658M = -1.0f;

        /* renamed from: O, reason: collision with root package name */
        public int f344660O = 1;

        /* renamed from: P, reason: collision with root package name */
        public int f344661P = -1;

        /* renamed from: Q, reason: collision with root package name */
        public int f344662Q = JosStatusCodes.RTN_CODE_COMMON_ERROR;

        /* renamed from: R, reason: collision with root package name */
        public long f344663R = 0;

        /* renamed from: S, reason: collision with root package name */
        public long f344664S = 0;

        /* renamed from: V, reason: collision with root package name */
        public boolean f344667V = true;

        /* renamed from: W, reason: collision with root package name */
        public String f344668W = "eng";

        @InterfaceC49173d
        public final byte[] a(String str) throws ParserException {
            byte[] bArr = this.f344681k;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.a("Missing CodecPrivate for codec " + str, null);
        }
    }

    static {
        int i12 = U.f348106a;
        f344586d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(C37262f.f359034c);
        f344587e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f344588f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f344589g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        S.e(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        S.e(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f344590h0 = Collections.unmodifiableMap(map);
    }

    public d() {
        this(0);
    }

    public static byte[] f(long j12, long j13, String str) {
        C36585a.b(j12 != -9223372036854775807L);
        int i12 = (int) (j12 / 3600000000L);
        long j14 = j12 - (i12 * 3600000000L);
        int i13 = (int) (j14 / 60000000);
        long j15 = j14 - (i13 * 60000000);
        int i14 = (int) (j15 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf((int) ((j15 - (i14 * 1000000)) / j13)));
        int i15 = U.f348106a;
        return str2.getBytes(C37262f.f359034c);
    }

    @Override // com.google.android.exoplayer2.extractor.j
    @InterfaceC42153i
    public final void a(long j12, long j13) {
        this.f344592B = -9223372036854775807L;
        this.f344597G = 0;
        com.google.android.exoplayer2.extractor.mkv.a aVar = this.f344617a;
        aVar.f344580e = 0;
        aVar.f344577b.clear();
        f fVar = aVar.f344578c;
        fVar.f344701b = 0;
        fVar.f344702c = 0;
        f fVar2 = this.f344619b;
        fVar2.f344701b = 0;
        fVar2.f344702c = 0;
        j();
        int i12 = 0;
        while (true) {
            SparseArray<C10580d> sparseArray = this.f344621c;
            if (i12 >= sparseArray.size()) {
                return;
            }
            B b12 = sparseArray.valueAt(i12).f344665T;
            if (b12 != null) {
                b12.f344377b = false;
                b12.f344378c = 0;
            }
            i12++;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void b(l lVar) {
        this.f344620b0 = lVar;
    }

    @InterfaceC49173d
    public final void c(int i12) throws ParserException {
        if (this.f344593C == null || this.f344594D == null) {
            throw ParserException.a("Element " + i12 + " must be in a Cues", null);
        }
    }

    @InterfaceC49173d
    public final void d(int i12) throws ParserException {
        if (this.f344639u != null) {
            return;
        }
        throw ParserException.a("Element " + i12 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @v61.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.google.android.exoplayer2.extractor.mkv.d.C10580d r17, long r18, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.d.e(com.google.android.exoplayer2.extractor.mkv.d$d, long, int, int, int):void");
    }

    public final void g(com.google.android.exoplayer2.extractor.f fVar, int i12) throws EOFException, InterruptedIOException {
        F f12 = this.f344625g;
        if (f12.f348072c >= i12) {
            return;
        }
        byte[] bArr = f12.f348070a;
        if (bArr.length < i12) {
            f12.b(Math.max(bArr.length * 2, i12));
        }
        byte[] bArr2 = f12.f348070a;
        int i13 = f12.f348072c;
        fVar.d(bArr2, i13, i12 - i13, false);
        f12.A(i12);
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final boolean h(k kVar) throws EOFException, InterruptedIOException {
        e eVar = new e();
        com.google.android.exoplayer2.extractor.f fVar = (com.google.android.exoplayer2.extractor.f) kVar;
        long j12 = fVar.f344494c;
        long j13 = 1024;
        if (j12 != -1 && j12 <= 1024) {
            j13 = j12;
        }
        int i12 = (int) j13;
        F f12 = eVar.f344697a;
        fVar.a(f12.f348070a, 0, 4, false);
        eVar.f344698b = 4;
        for (long jS2 = f12.s(); jS2 != 440786851; jS2 = ((jS2 << 8) & (-256)) | (f12.f348070a[0] & 255)) {
            int i13 = eVar.f344698b + 1;
            eVar.f344698b = i13;
            if (i13 == i12) {
                return false;
            }
            fVar.a(f12.f348070a, 0, 1, false);
        }
        long jA2 = eVar.a(fVar);
        long j14 = eVar.f344698b;
        if (jA2 == Long.MIN_VALUE) {
            return false;
        }
        if (j12 != -1 && j14 + jA2 >= j12) {
            return false;
        }
        while (true) {
            long j15 = eVar.f344698b;
            long j16 = j14 + jA2;
            if (j15 >= j16) {
                return j15 == j16;
            }
            if (eVar.a(fVar) == Long.MIN_VALUE) {
                return false;
            }
            long jA3 = eVar.a(fVar);
            if (jA3 < 0 || jA3 > 2147483647L) {
                return false;
            }
            if (jA3 != 0) {
                int i14 = (int) jA3;
                fVar.l(i14, false);
                eVar.f344698b += i14;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:388:0x0775, code lost:
    
        if (r1 == 0) goto L389;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0497 A[PHI: r40
  0x0497: PHI (r40v37 java.lang.String) = 
  (r40v3 java.lang.String)
  (r40v4 java.lang.String)
  (r40v5 java.lang.String)
  (r40v6 java.lang.String)
  (r40v7 java.lang.String)
  (r40v8 java.lang.String)
  (r40v9 java.lang.String)
  (r40v10 java.lang.String)
  (r40v11 java.lang.String)
  (r40v12 java.lang.String)
  (r40v13 java.lang.String)
  (r40v14 java.lang.String)
  (r40v15 java.lang.String)
  (r40v16 java.lang.String)
  (r40v17 java.lang.String)
  (r40v18 java.lang.String)
  (r40v19 java.lang.String)
  (r40v20 java.lang.String)
  (r40v21 java.lang.String)
  (r40v22 java.lang.String)
  (r40v23 java.lang.String)
  (r40v24 java.lang.String)
  (r40v25 java.lang.String)
  (r40v26 java.lang.String)
  (r40v27 java.lang.String)
  (r40v28 java.lang.String)
  (r40v29 java.lang.String)
  (r40v30 java.lang.String)
  (r40v31 java.lang.String)
  (r40v32 java.lang.String)
  (r40v33 java.lang.String)
  (r40v34 java.lang.String)
  (r40v38 java.lang.String)
 binds: [B:366:0x067e, B:362:0x0673, B:358:0x0668, B:354:0x065d, B:350:0x0652, B:346:0x0647, B:342:0x063c, B:338:0x062f, B:334:0x061f, B:330:0x060f, B:326:0x05ff, B:322:0x05ef, B:318:0x05df, B:314:0x05cf, B:310:0x05bf, B:306:0x05af, B:302:0x059f, B:298:0x058f, B:294:0x057f, B:290:0x056f, B:286:0x055f, B:282:0x054f, B:278:0x053f, B:274:0x052f, B:270:0x051f, B:266:0x050f, B:262:0x04ff, B:258:0x04ef, B:254:0x04df, B:250:0x04cf, B:246:0x04bf, B:242:0x04af, B:235:0x0495] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0ab0  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0ac5  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0c9e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0234 A[PHI: r6 r7 r10
  0x0234: PHI (r6v200 java.lang.String) = (r6v26 java.lang.String), (r6v27 java.lang.String), (r6v201 java.lang.String) binds: [B:228:0x0454, B:224:0x0444, B:96:0x0230] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r7v112 java.lang.String) = (r7v15 java.lang.String), (r7v16 java.lang.String), (r7v113 java.lang.String) binds: [B:228:0x0454, B:224:0x0444, B:96:0x0230] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r10v30 java.lang.String) = (r10v15 java.lang.String), (r10v16 java.lang.String), (r10v31 java.lang.String) binds: [B:228:0x0454, B:224:0x0444, B:96:0x0230] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v54, types: [com.google.android.exoplayer2.extractor.mkv.d$c] */
    /* JADX WARN: Type inference failed for: r0v97, types: [com.google.android.exoplayer2.extractor.mkv.d$d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v3, types: [com.google.android.exoplayer2.extractor.f] */
    /* JADX WARN: Type inference failed for: r3v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.android.exoplayer2.extractor.mkv.f] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.google.android.exoplayer2.extractor.mkv.a] */
    /* JADX WARN: Type inference failed for: r9v83 */
    @Override // com.google.android.exoplayer2.extractor.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(com.google.android.exoplayer2.extractor.k r47, com.google.android.exoplayer2.extractor.w r48) throws com.google.android.exoplayer2.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 5316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.d.i(com.google.android.exoplayer2.extractor.k, com.google.android.exoplayer2.extractor.w):int");
    }

    public final void j() {
        this.f344609S = 0;
        this.f344610T = 0;
        this.f344611U = 0;
        this.f344612V = false;
        this.f344613W = false;
        this.f344614X = false;
        this.f344615Y = 0;
        this.f344616Z = (byte) 0;
        this.f344618a0 = false;
        this.f344628j.y(0);
    }

    public final long k(long j12) throws ParserException {
        long j13 = this.f344636r;
        if (j13 != -9223372036854775807L) {
            return U.M(j12, j13, 1000L);
        }
        throw ParserException.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @m
    public final int l(com.google.android.exoplayer2.extractor.f fVar, C10580d c10580d, int i12, boolean z12) throws ParserException, EOFException, InterruptedIOException {
        int iB2;
        int iB3;
        int i13;
        if ("S_TEXT/UTF8".equals(c10580d.f344672b)) {
            m(fVar, f344585c0, i12);
            int i14 = this.f344610T;
            j();
            return i14;
        }
        if ("S_TEXT/ASS".equals(c10580d.f344672b)) {
            m(fVar, f344587e0, i12);
            int i15 = this.f344610T;
            j();
            return i15;
        }
        if ("S_TEXT/WEBVTT".equals(c10580d.f344672b)) {
            m(fVar, f344588f0, i12);
            int i16 = this.f344610T;
            j();
            return i16;
        }
        A a12 = c10580d.f344669X;
        boolean z13 = this.f344612V;
        F f12 = this.f344628j;
        if (!z13) {
            boolean z14 = c10580d.f344678h;
            F f13 = this.f344625g;
            if (z14) {
                this.f344605O &= -1073741825;
                if (!this.f344613W) {
                    fVar.d(f13.f348070a, 0, 1, false);
                    this.f344609S++;
                    byte b12 = f13.f348070a[0];
                    if ((b12 & 128) == 128) {
                        throw ParserException.a("Extension bit is set in signal byte", null);
                    }
                    this.f344616Z = b12;
                    this.f344613W = true;
                }
                byte b13 = this.f344616Z;
                if ((b13 & 1) == 1) {
                    boolean z15 = (b13 & 2) == 2;
                    this.f344605O |= 1073741824;
                    if (!this.f344618a0) {
                        F f14 = this.f344630l;
                        fVar.d(f14.f348070a, 0, 8, false);
                        this.f344609S += 8;
                        this.f344618a0 = true;
                        f13.f348070a[0] = (byte) ((z15 ? 128 : 0) | 8);
                        f13.B(0);
                        a12.e(1, f13);
                        this.f344610T++;
                        f14.B(0);
                        a12.e(8, f14);
                        this.f344610T += 8;
                    }
                    if (z15) {
                        if (!this.f344614X) {
                            fVar.d(f13.f348070a, 0, 1, false);
                            this.f344609S++;
                            f13.B(0);
                            this.f344615Y = f13.r();
                            this.f344614X = true;
                        }
                        int i17 = this.f344615Y * 4;
                        f13.y(i17);
                        fVar.d(f13.f348070a, 0, i17, false);
                        this.f344609S += i17;
                        short s5 = (short) ((this.f344615Y / 2) + 1);
                        int i18 = (s5 * 6) + 2;
                        ByteBuffer byteBuffer = this.f344633o;
                        if (byteBuffer == null || byteBuffer.capacity() < i18) {
                            this.f344633o = ByteBuffer.allocate(i18);
                        }
                        this.f344633o.position(0);
                        this.f344633o.putShort(s5);
                        int i19 = 0;
                        int i22 = 0;
                        while (true) {
                            i13 = this.f344615Y;
                            if (i19 >= i13) {
                                break;
                            }
                            int iU2 = f13.u();
                            if (i19 % 2 == 0) {
                                this.f344633o.putShort((short) (iU2 - i22));
                            } else {
                                this.f344633o.putInt(iU2 - i22);
                            }
                            i19++;
                            i22 = iU2;
                        }
                        int i23 = (i12 - this.f344609S) - i22;
                        if (i13 % 2 == 1) {
                            this.f344633o.putInt(i23);
                        } else {
                            this.f344633o.putShort((short) i23);
                            this.f344633o.putInt(0);
                        }
                        byte[] bArrArray = this.f344633o.array();
                        F f15 = this.f344631m;
                        f15.z(i18, bArrArray);
                        a12.e(i18, f15);
                        this.f344610T += i18;
                    }
                }
            } else {
                byte[] bArr = c10580d.f344679i;
                if (bArr != null) {
                    f12.z(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(c10580d.f344672b) ? z12 : c10580d.f344676f > 0) {
                this.f344605O |= 268435456;
                this.f344632n.y(0);
                int i24 = (f12.f348072c + i12) - this.f344609S;
                f13.y(4);
                byte[] bArr2 = f13.f348070a;
                bArr2[0] = (byte) ((i24 >> 24) & 255);
                bArr2[1] = (byte) ((i24 >> 16) & 255);
                bArr2[2] = (byte) ((i24 >> 8) & 255);
                bArr2[3] = (byte) (i24 & 255);
                a12.e(4, f13);
                this.f344610T += 4;
            }
            this.f344612V = true;
        }
        int i25 = i12 + f12.f348072c;
        if (!"V_MPEG4/ISO/AVC".equals(c10580d.f344672b) && !"V_MPEGH/ISO/HEVC".equals(c10580d.f344672b)) {
            if (c10580d.f344665T != null) {
                C36585a.d(f12.f348072c == 0);
                c10580d.f344665T.c(fVar);
            }
            while (true) {
                int i26 = this.f344609S;
                if (i26 >= i25) {
                    break;
                }
                int i27 = i25 - i26;
                int iA2 = f12.a();
                if (iA2 > 0) {
                    iB3 = Math.min(i27, iA2);
                    a12.c(iB3, f12);
                } else {
                    iB3 = a12.b(fVar, i27, false);
                }
                this.f344609S += iB3;
                this.f344610T += iB3;
            }
        } else {
            F f16 = this.f344624f;
            byte[] bArr3 = f16.f348070a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i28 = c10580d.f344670Y;
            int i29 = 4 - i28;
            while (this.f344609S < i25) {
                int i32 = this.f344611U;
                if (i32 == 0) {
                    int iMin = Math.min(i28, f12.a());
                    fVar.d(bArr3, i29 + iMin, i28 - iMin, false);
                    if (iMin > 0) {
                        f12.c(i29, iMin, bArr3);
                    }
                    this.f344609S += i28;
                    f16.B(0);
                    this.f344611U = f16.u();
                    F f17 = this.f344623e;
                    f17.B(0);
                    a12.c(4, f17);
                    this.f344610T += 4;
                } else {
                    int iA3 = f12.a();
                    if (iA3 > 0) {
                        iB2 = Math.min(i32, iA3);
                        a12.c(iB2, f12);
                    } else {
                        iB2 = a12.b(fVar, i32, false);
                    }
                    this.f344609S += iB2;
                    this.f344610T += iB2;
                    this.f344611U -= iB2;
                }
            }
        }
        if ("A_VORBIS".equals(c10580d.f344672b)) {
            F f18 = this.f344626h;
            f18.B(0);
            a12.c(4, f18);
            this.f344610T += 4;
        }
        int i33 = this.f344610T;
        j();
        return i33;
    }

    public final void m(com.google.android.exoplayer2.extractor.f fVar, byte[] bArr, int i12) throws EOFException, InterruptedIOException {
        int length = bArr.length + i12;
        F f12 = this.f344629k;
        byte[] bArr2 = f12.f348070a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i12);
            f12.z(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        fVar.d(f12.f348070a, bArr.length, i12, false);
        f12.B(0);
        f12.A(length);
    }

    public d(int i12) {
        com.google.android.exoplayer2.extractor.mkv.a aVar = new com.google.android.exoplayer2.extractor.mkv.a();
        this.f344635q = -1L;
        this.f344636r = -9223372036854775807L;
        this.f344637s = -9223372036854775807L;
        this.f344638t = -9223372036854775807L;
        this.f344644z = -1L;
        this.f344591A = -1L;
        this.f344592B = -9223372036854775807L;
        this.f344617a = aVar;
        aVar.f344579d = new c(null);
        this.f344622d = true;
        this.f344619b = new f();
        this.f344621c = new SparseArray<>();
        this.f344625g = new F(4);
        this.f344626h = new F(ByteBuffer.allocate(4).putInt(-1).array());
        this.f344627i = new F(4);
        this.f344623e = new F(com.google.android.exoplayer2.util.A.f348026a);
        this.f344624f = new F(4);
        this.f344628j = new F();
        this.f344629k = new F();
        this.f344630l = new F(8);
        this.f344631m = new F();
        this.f344632n = new F();
        this.f344602L = new int[1];
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void release() {
    }
}
