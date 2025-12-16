package defpackage;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class l47 {
    public final p47 a;
    public final qe4 b;
    public final qe4 c;
    public final znd d;
    public final Uri[] e;
    public final gf6[] f;
    public final bn4 g;
    public final kfg h;
    public final List i;
    public final m4c k;
    public boolean l;
    public BehindLiveWindowException n;
    public Uri o;
    public boolean p;
    public an5 q;
    public boolean s;
    public final h08 j = new h08(17);
    public byte[] m = xxg.f;
    public long r = -9223372036854775807L;

    public l47(p47 p47Var, bn4 bn4Var, Uri[] uriArr, gf6[] gf6VarArr, x6i x6iVar, vgg vggVar, znd zndVar, List list, m4c m4cVar) {
        this.a = p47Var;
        this.g = bn4Var;
        this.e = uriArr;
        this.f = gf6VarArr;
        this.d = zndVar;
        this.i = list;
        this.k = m4cVar;
        qe4 qe4VarA = ((ne4) x6iVar.b).a();
        this.b = qe4VarA;
        if (vggVar != null) {
            qe4VarA.S(vggVar);
        }
        this.c = ((ne4) x6iVar.b).a();
        this.h = new kfg("", gf6VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((gf6VarArr[i].o & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        kfg kfgVar = this.h;
        int[] iArrI = jni.i(arrayList);
        i47 i47Var = new i47(kfgVar, iArrI);
        i47Var.g = i47Var.q(kfgVar.c[iArrI[0]]);
        this.q = i47Var;
    }

    public final bw8[] a(r47 r47Var, long j) {
        List listUnmodifiableList;
        l47 l47Var = this;
        r47 r47Var2 = r47Var;
        int iA = r47Var2 == null ? -1 : l47Var.h.a(r47Var2.d);
        int length = l47Var.q.length();
        bw8[] bw8VarArr = new bw8[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int iF = l47Var.q.f(i);
            Uri uri = l47Var.e[iF];
            bn4 bn4Var = l47Var.g;
            if (bn4Var.d(uri)) {
                h57 h57VarA = bn4Var.a(uri, z);
                h57VarA.getClass();
                long j2 = h57VarA.h - bn4Var.Y;
                Pair pairC = l47Var.c(r47Var2, iF != iA ? true : z, h57VarA, j2, j);
                long jLongValue = ((Long) pairC.first).longValue();
                int iIntValue = ((Integer) pairC.second).intValue();
                long j3 = h57VarA.k;
                wg7 wg7Var = h57VarA.s;
                wg7 wg7Var2 = h57VarA.r;
                int i2 = (int) (jLongValue - j3);
                if (i2 < 0 || wg7Var2.size() < i2) {
                    t76 t76Var = wg7.b;
                    listUnmodifiableList = zjd.o;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < wg7Var2.size()) {
                        if (iIntValue != -1) {
                            c57 c57Var = (c57) wg7Var2.get(i2);
                            if (iIntValue == 0) {
                                arrayList.add(c57Var);
                            } else if (iIntValue < c57Var.w0.size()) {
                                wg7 wg7Var3 = c57Var.w0;
                                arrayList.addAll(wg7Var3.subList(iIntValue, wg7Var3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(wg7Var2.subList(i2, wg7Var2.size()));
                        iIntValue = 0;
                    }
                    if (h57VarA.n != -9223372036854775807L) {
                        if (iIntValue == -1) {
                            iIntValue = 0;
                        }
                        if (iIntValue < wg7Var.size()) {
                            arrayList.addAll(wg7Var.subList(iIntValue, wg7Var.size()));
                        }
                    }
                    listUnmodifiableList = Collections.unmodifiableList(arrayList);
                }
                bw8VarArr[i] = new g47(j2, listUnmodifiableList);
            } else {
                bw8VarArr[i] = bw8.M;
            }
            i++;
            l47Var = this;
            r47Var2 = r47Var;
            z = false;
        }
        return bw8VarArr;
    }

    public final int b(r47 r47Var) {
        int i = r47Var.y0;
        if (i == -1) {
            return 1;
        }
        h57 h57VarA = this.g.a(this.e[this.h.a(r47Var.d)], false);
        h57VarA.getClass();
        wg7 wg7Var = h57VarA.r;
        int i2 = (int) (r47Var.t0 - h57VarA.k);
        if (i2 < 0) {
            return 1;
        }
        wg7 wg7Var2 = i2 < wg7Var.size() ? ((c57) wg7Var.get(i2)).w0 : h57VarA.s;
        if (i >= wg7Var2.size()) {
            return 2;
        }
        y47 y47Var = (y47) wg7Var2.get(i);
        if (y47Var.w0) {
            return 0;
        }
        return xxg.a(Uri.parse(koi.h(h57VarA.a, y47Var.a)), r47Var.b.a) ? 1 : 2;
    }

    public final Pair c(r47 r47Var, boolean z, h57 h57Var, long j, long j2) {
        boolean z2 = true;
        if (r47Var != null) {
            long jA = r47Var.t0;
            int i = r47Var.y0;
            if (!z) {
                if (!r47Var.R0) {
                    return new Pair(Long.valueOf(jA), Integer.valueOf(i));
                }
                if (i == -1) {
                    jA = r47Var.a();
                }
                return new Pair(Long.valueOf(jA), Integer.valueOf(i != -1 ? i + 1 : -1));
            }
        }
        long j3 = h57Var.u;
        wg7 wg7Var = h57Var.s;
        long j4 = h57Var.k;
        wg7 wg7Var2 = h57Var.r;
        long j5 = j3 + j;
        if (r47Var != null && !this.p) {
            j2 = r47Var.Y;
        }
        if (!h57Var.o && j2 >= j5) {
            return new Pair(Long.valueOf(j4 + wg7Var2.size()), -1);
        }
        long j6 = j2 - j;
        Long lValueOf = Long.valueOf(j6);
        int i2 = 0;
        if (this.g.X && r47Var != null) {
            z2 = false;
        }
        int iD = xxg.d(lValueOf, wg7Var2, z2);
        long j7 = iD + j4;
        if (iD >= 0) {
            c57 c57Var = (c57) wg7Var2.get(iD);
            wg7 wg7Var3 = j6 < c57Var.o + c57Var.c ? c57Var.w0 : wg7Var;
            while (true) {
                if (i2 >= wg7Var3.size()) {
                    break;
                }
                y47 y47Var = (y47) wg7Var3.get(i2);
                if (j6 >= y47Var.o + y47Var.c) {
                    i2++;
                } else if (y47Var.v0) {
                    j7 += wg7Var3 == wg7Var ? 1L : 0L;
                    i = i2;
                }
            }
        }
        return new Pair(Long.valueOf(j7), Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e47 d(Uri uri, int i) {
        if (uri == null) {
            return null;
        }
        h08 h08Var = this.j;
        byte[] bArr = (byte[]) ((zl6) h08Var.b).remove(uri);
        if (bArr != null) {
            return null;
        }
        ye4 ye4Var = new ye4(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        gf6 gf6Var = this.f[i];
        int iK = this.q.k();
        Object objM = this.q.m();
        byte[] bArr2 = this.m;
        e47 e47Var = new e47(this.c, ye4Var, 3, gf6Var, iK, objM, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = xxg.f;
        }
        e47Var.t0 = bArr2;
        return e47Var;
    }
}
