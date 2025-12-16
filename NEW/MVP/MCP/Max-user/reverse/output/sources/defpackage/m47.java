package defpackage;

import android.net.Uri;
import android.util.Pair;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m47 {
    public final wm4 a;
    public final se4 b;
    public final se4 c;
    public final s6b d;
    public final Uri[] e;
    public final hf6[] f;
    public final bn4 g;
    public final lfg h;
    public final List i;
    public final n4c k;
    public boolean l;
    public BehindLiveWindowException n;
    public Uri o;
    public Uri p;
    public boolean q;
    public bn5 r;
    public final a3b j = new a3b(18);
    public byte[] m = zxg.b;
    public long s = -9223372036854775807L;

    public m47(wm4 wm4Var, bn4 bn4Var, Uri[] uriArr, hf6[] hf6VarArr, y6i y6iVar, wgg wggVar, s6b s6bVar, List list, n4c n4cVar) {
        this.a = wm4Var;
        this.g = bn4Var;
        this.e = uriArr;
        this.f = hf6VarArr;
        this.d = s6bVar;
        this.i = list;
        this.k = n4cVar;
        se4 se4VarA = ((oe4) y6iVar.b).a();
        this.b = se4VarA;
        if (wggVar != null) {
            se4VarA.I(wggVar);
        }
        this.c = ((oe4) y6iVar.b).a();
        this.h = new lfg("", hf6VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((hf6VarArr[i].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        lfg lfgVar = this.h;
        int[] iArrI = jni.i(arrayList);
        j47 j47Var = new j47(lfgVar, iArrI);
        j47Var.g = j47Var.s(lfgVar.d[iArrI[0]]);
        this.r = j47Var;
    }

    public static k47 d(i57 i57Var, long j, int i) {
        long j2 = i57Var.k;
        wg7 wg7Var = i57Var.s;
        int i2 = (int) (j - j2);
        wg7 wg7Var2 = i57Var.r;
        if (i2 == wg7Var2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < wg7Var.size()) {
                return new k47((f57) wg7Var.get(i), j, i);
            }
            return null;
        }
        d57 d57Var = (d57) wg7Var2.get(i2);
        if (i == -1) {
            return new k47(d57Var, j, -1);
        }
        if (i < d57Var.w0.size()) {
            return new k47((f57) d57Var.w0.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < wg7Var2.size()) {
            return new k47((f57) wg7Var2.get(i3), j + 1, -1);
        }
        if (wg7Var.isEmpty()) {
            return null;
        }
        return new k47((f57) wg7Var.get(0), j + 1, 0);
    }

    public final cw8[] a(s47 s47Var, long j) {
        List listUnmodifiableList;
        m47 m47Var = this;
        s47 s47Var2 = s47Var;
        int iB = s47Var2 == null ? -1 : m47Var.h.b(s47Var2.d);
        int length = m47Var.r.length();
        cw8[] cw8VarArr = new cw8[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int iF = m47Var.r.f(i);
            Uri uri = m47Var.e[iF];
            bn4 bn4Var = m47Var.g;
            if (bn4Var.d(uri)) {
                i57 i57VarB = bn4Var.b(uri, z);
                i57VarB.getClass();
                long j2 = i57VarB.h - bn4Var.Y;
                Pair pairC = m47Var.c(s47Var2, iF != iB ? true : z, i57VarB, j2, j);
                long jLongValue = ((Long) pairC.first).longValue();
                int iIntValue = ((Integer) pairC.second).intValue();
                long j3 = i57VarB.k;
                wg7 wg7Var = i57VarB.s;
                wg7 wg7Var2 = i57VarB.r;
                int i2 = (int) (jLongValue - j3);
                if (i2 < 0 || wg7Var2.size() < i2) {
                    t76 t76Var = wg7.b;
                    listUnmodifiableList = zjd.o;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < wg7Var2.size()) {
                        if (iIntValue != -1) {
                            d57 d57Var = (d57) wg7Var2.get(i2);
                            if (iIntValue == 0) {
                                arrayList.add(d57Var);
                            } else if (iIntValue < d57Var.w0.size()) {
                                wg7 wg7Var3 = d57Var.w0;
                                arrayList.addAll(wg7Var3.subList(iIntValue, wg7Var3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(wg7Var2.subList(i2, wg7Var2.size()));
                        iIntValue = 0;
                    }
                    if (i57VarB.n != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < wg7Var.size()) {
                            arrayList.addAll(wg7Var.subList(iIntValue, wg7Var.size()));
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                cw8VarArr[i] = new h47(j2, listUnmodifiableList);
            } else {
                cw8VarArr[i] = cw8.N;
            }
            i++;
            m47Var = this;
            s47Var2 = s47Var;
            z = false;
        }
        return cw8VarArr;
    }

    public final int b(s47 s47Var) {
        int i = s47Var.y0;
        if (i == -1) {
            return 1;
        }
        i57 i57VarB = this.g.b(this.e[this.h.b(s47Var.d)], false);
        i57VarB.getClass();
        wg7 wg7Var = i57VarB.r;
        int i2 = (int) (s47Var.t0 - i57VarB.k);
        if (i2 < 0) {
            return 1;
        }
        wg7 wg7Var2 = i2 < wg7Var.size() ? ((d57) wg7Var.get(i2)).w0 : i57VarB.s;
        if (i >= wg7Var2.size()) {
            return 2;
        }
        z47 z47Var = (z47) wg7Var2.get(i);
        if (z47Var.w0) {
            return 0;
        }
        return Objects.equals(Uri.parse(moi.d(i57VarB.a, z47Var.a)), s47Var.b.a) ? 1 : 2;
    }

    public final Pair c(s47 s47Var, boolean z, i57 i57Var, long j, long j2) {
        if (s47Var != null) {
            long jA = s47Var.t0;
            int i = s47Var.y0;
            if (!z) {
                if (!s47Var.R0) {
                    return new Pair(Long.valueOf(jA), Integer.valueOf(i));
                }
                if (i == -1) {
                    jA = s47Var.a();
                }
                return new Pair(Long.valueOf(jA), Integer.valueOf(i != -1 ? i + 1 : -1));
            }
        }
        long j3 = i57Var.u;
        wg7 wg7Var = i57Var.s;
        long j4 = i57Var.k;
        wg7 wg7Var2 = i57Var.r;
        long j5 = j3 + j;
        if (s47Var != null && !this.q) {
            j2 = s47Var.Y;
        }
        if (!i57Var.o && j2 >= j5) {
            return new Pair(Long.valueOf(j4 + wg7Var2.size()), -1);
        }
        long j6 = j2 - j;
        int i2 = 0;
        int iC = zxg.c(wg7Var2, Long.valueOf(j6), true, !this.g.X || s47Var == null);
        long j7 = iC + j4;
        if (iC >= 0) {
            d57 d57Var = (d57) wg7Var2.get(iC);
            wg7 wg7Var3 = j6 < d57Var.o + d57Var.c ? d57Var.w0 : wg7Var;
            while (true) {
                if (i2 >= wg7Var3.size()) {
                    break;
                }
                z47 z47Var = (z47) wg7Var3.get(i2);
                if (j6 >= z47Var.o + z47Var.c) {
                    i2++;
                } else if (z47Var.v0) {
                    j7 += wg7Var3 == wg7Var ? 1L : 0L;
                    i = i2;
                }
            }
        }
        return new Pair(Long.valueOf(j7), Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final f47 e(int i, Uri uri, boolean z) {
        if (uri == null) {
            return null;
        }
        a3b a3bVar = this.j;
        byte[] bArr = (byte[]) ((zl6) a3bVar.b).remove(uri);
        if (bArr != null) {
            return null;
        }
        ze4 ze4Var = new ze4(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        hf6 hf6Var = this.f[i];
        int iK = this.r.k();
        Object objM = this.r.m();
        byte[] bArr2 = this.m;
        f47 f47Var = new f47(this.c, ze4Var, 3, hf6Var, iK, objM, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = zxg.b;
        }
        f47Var.t0 = bArr2;
        return f47Var;
    }
}
