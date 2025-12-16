package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.util.SparseArray;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class khg implements zt {
    public final c4h X;
    public final w86 Y;
    public final uy0 Z;
    public final int a;
    public final g95 b;
    public final pm3 c;
    public final chg d;
    public final u1j o;
    public final LogSessionId s0;
    public long t0;
    public final /* synthetic */ lhg u0;

    public khg(lhg lhgVar, int i, pm3 pm3Var, chg chgVar, u1j u1jVar, c4h c4hVar, w86 w86Var, uy0 uy0Var, LogSessionId logSessionId) {
        this.u0 = lhgVar;
        this.a = i;
        this.b = (g95) ((h95) pm3Var.a.get(i)).a.get(0);
        this.c = pm3Var;
        this.d = chgVar;
        this.o = u1jVar;
        this.X = c4hVar;
        this.Y = w86Var;
        this.Z = uy0Var;
        this.s0 = logSessionId;
    }

    @Override // defpackage.zt
    public final void a(int i) {
        if (i <= 0) {
            c(ExportException.a(1001, new IllegalStateException("AssetLoader instances must provide at least 1 track.")));
            return;
        }
        synchronized (this.u0.l) {
            k5i k5iVar = this.u0.m;
            ((ihg) ((ArrayList) k5iVar.b).get(this.a)).b = i;
        }
    }

    @Override // defpackage.zt
    public final zwd b(hf6 hf6Var) {
        synchronized (this.u0.l) {
            try {
                if (!this.u0.m.i()) {
                    return null;
                }
                final int iE = tfi.e(hf6Var.n);
                SparseArray sparseArray = (SparseArray) this.u0.m.d;
                hsi.g(zxg.k(sparseArray, iE));
                if (((Boolean) sparseArray.get(iE)).booleanValue()) {
                    k5i k5iVar = this.u0.m;
                    ArrayList arrayList = (ArrayList) k5iVar.b;
                    hsi.f("Primary track can only be queried after all tracks are added.", k5iVar.i());
                    int i = 0;
                    while (true) {
                        if (i >= arrayList.size()) {
                            i = -1;
                            break;
                        }
                        if (zxg.k(((ihg) arrayList.get(i)).a, iE)) {
                            break;
                        }
                        i++;
                    }
                    if (i == this.a) {
                        f(hf6Var);
                    }
                } else {
                    g(iE);
                }
                bxd bxdVar = (bxd) ((SparseArray) this.u0.m.c).get(iE);
                if (bxdVar == null) {
                    return null;
                }
                final sx6 sx6VarJ = bxdVar.j(this.b, hf6Var, this.a);
                qva qvaVar = new qva() { // from class: jhg
                    @Override // defpackage.qva
                    public final void a(g95 g95Var, long j, hf6 hf6Var2, boolean z) {
                        khg khgVar = this.a;
                        int i2 = iE;
                        sx6 sx6Var = sx6VarJ;
                        lhg lhgVar = khgVar.u0;
                        if (lhgVar.c) {
                            synchronized (lhgVar.l) {
                                try {
                                    boolean z2 = true;
                                    if (((ihg) ((ArrayList) khgVar.u0.m.b).get(khgVar.a)).a.size() <= 1 || i2 != 2) {
                                        ((h95) khgVar.c.a.get(khgVar.a)).getClass();
                                        hsi.f("MediaItem duration required for sequence looping could not be extracted.", j != -9223372036854775807L);
                                        khgVar.t0 += j;
                                        synchronized (khgVar.u0.q) {
                                            if (z) {
                                                try {
                                                    khgVar.u0.z--;
                                                } finally {
                                                }
                                            }
                                            lhg lhgVar2 = khgVar.u0;
                                            if (lhgVar2.z != 0) {
                                                z2 = false;
                                            }
                                            long j2 = khgVar.t0;
                                            long j3 = lhgVar2.y;
                                            if (j2 > j3 || z2) {
                                                lhgVar2.y = Math.max(j2, j3);
                                                for (int i3 = 0; i3 < khgVar.u0.k.size(); i3++) {
                                                    ((eee) khgVar.u0.k.get(i3)).getClass();
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                        sx6Var.a(g95Var, j, hf6Var2, z);
                    }
                };
                HashMap map = ((eee) this.u0.k.get(this.a)).Y;
                hsi.b(iE == 1 || iE == 2);
                hsi.b(map.get(Integer.valueOf(iE)) == null);
                map.put(Integer.valueOf(iE), qvaVar);
                SparseArray sparseArray2 = (SparseArray) this.u0.m.o;
                sparseArray2.put(iE, Integer.valueOf(zxg.k(sparseArray2, iE) ? 1 + ((Integer) sparseArray2.get(iE)).intValue() : 1));
                k5i k5iVar2 = this.u0.m;
                ArrayList arrayList2 = (ArrayList) k5iVar2.b;
                int i2 = 0;
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (zxg.k(((ihg) arrayList2.get(i3)).a, iE)) {
                        i2++;
                    }
                }
                if (((Integer) ((SparseArray) k5iVar2.o).get(iE)).intValue() == i2) {
                    this.u0.e();
                    this.u0.j.a(2, bxdVar).b();
                }
                return sx6VarJ;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zt
    public final void c(ExportException exportException) {
        this.u0.d(exportException);
    }

    @Override // defpackage.zt
    public final void d(long j) {
    }

    @Override // defpackage.zt
    public final boolean e(int i, hf6 hf6Var) {
        boolean zH;
        int iE = tfi.e(hf6Var.n);
        synchronized (this.u0.l) {
            try {
                k5i k5iVar = this.u0.m;
                int i2 = this.a;
                k5iVar.getClass();
                int iE2 = tfi.e(hf6Var.n);
                SparseArray sparseArray = ((ihg) ((ArrayList) k5iVar.b).get(i2)).a;
                boolean z = true;
                hsi.g(!zxg.k(sparseArray, iE2));
                sparseArray.put(iE2, hf6Var);
                if (this.u0.m.i()) {
                    ArrayList arrayList = (ArrayList) this.u0.m.b;
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        SparseArray sparseArray2 = ((ihg) arrayList.get(i5)).a;
                        if (zxg.k(sparseArray2, 1)) {
                            i3 = 1;
                        }
                        if (sparseArray2.indexOfKey(2) >= 0) {
                            i4 = 1;
                        }
                    }
                    int i6 = i3 + i4;
                    u9a u9aVar = this.u0.o;
                    if (u9aVar.n != 2) {
                        hsi.f("The track count cannot be changed after adding track formats.", u9aVar.d.size() == 0);
                        u9aVar.s = i6;
                    }
                    ((AtomicInteger) this.Y.d).set(i6);
                }
                zH = h(i, hf6Var);
                if (!zH && tfi.e(hf6Var.n) == 2) {
                    u9a u9aVar2 = this.u0.o;
                    float fI = tfi.i(this.b.f.b, hf6Var);
                    if (fI == 90.0f || fI == 180.0f || fI == 270.0f) {
                        int iRound = 360 - Math.round(fI);
                        hsi.f("The additional rotation cannot be changed after adding track formats.", u9aVar2.d.size() == 0 || u9aVar2.r == iRound);
                        u9aVar2.r = iRound;
                    }
                }
                SparseArray sparseArray3 = (SparseArray) this.u0.m.d;
                if (zxg.k(sparseArray3, iE)) {
                    if (zH != ((Boolean) sparseArray3.get(iE)).booleanValue()) {
                        z = false;
                    }
                    hsi.g(z);
                } else {
                    sparseArray3.put(iE, Boolean.valueOf(zH));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zH;
    }

    public final void f(hf6 hf6Var) throws ExportException {
        hf6 hf6Var2;
        long j;
        boolean z;
        String str = hf6Var.n;
        int iE = tfi.e(str);
        lhg lhgVar = this.u0;
        jkc jkcVar = lhgVar.d;
        k5i k5iVar = lhgVar.m;
        hsi.g(((bxd) ((SparseArray) k5iVar.c).get(iE)) == null);
        SparseArray sparseArray = ((ihg) ((ArrayList) k5iVar.b).get(this.a)).a;
        hsi.g(zxg.k(sparseArray, iE));
        hf6 hf6Var3 = (hf6) sparseArray.get(iE);
        boolean zI = xz9.i(str);
        pm3 pm3Var = this.c;
        if (zI) {
            k5iVar.k(1, new w50(hf6Var3, hf6Var, this.d, this.b, pm3Var.c.a, this.o, jkcVar, lhgVar.o, this.Y, this.s0));
            return;
        }
        if (xz9.m(str)) {
            boolean z2 = this.d.d == 1;
            gf3 gf3Var = hf6Var3.D;
            if (gf3Var == null || !gf3Var.f()) {
                gf3Var = gf3.h;
            }
            if (z2 && gf3.h(gf3Var)) {
                gf3Var = gf3.h;
            }
            ff6 ff6VarA = hf6Var3.a();
            ff6VarA.C = gf3Var;
            hf6Var2 = new hf6(ff6VarA);
        } else {
            if (!xz9.k(str)) {
                throw ExportException.d(new IllegalArgumentException("assetLoaderOutputFormat has to have a audio, video or image mimetype."));
            }
            ff6 ff6VarA2 = hf6Var.a();
            gf3 gf3Var2 = hf6Var.D;
            if (gf3Var2 == null || !gf3Var2.f()) {
                gf3Var2 = gf3.h;
            }
            ff6VarA2.C = gf3Var2;
            hf6Var2 = new hf6(ff6VarA2);
        }
        Context context = lhgVar.a;
        mni mniVar = pm3Var.b;
        wg7 wg7Var = pm3Var.c.b;
        u9a u9aVar = lhgVar.o;
        ehg ehgVar = new ehg(1, this);
        hf6 hf6Var4 = hf6Var2;
        long j2 = lhgVar.h;
        ArrayList arrayList = (ArrayList) k5iVar.b;
        if (arrayList.size() >= 2) {
            int i = 0;
            int i2 = 0;
            while (i < arrayList.size()) {
                long j3 = j2;
                if (zxg.k(((ihg) arrayList.get(i)).a, 2)) {
                    i2++;
                }
                i++;
                j2 = j3;
            }
            j = j2;
            z = true;
            if (i2 <= 1) {
            }
            k5iVar.k(2, new lch(context, hf6Var4, this.d, mniVar, wg7Var, this.X, jkcVar, u9aVar, ehgVar, this.Y, this.Z, j, z, lhgVar.u, lhgVar.v, this.s0));
        }
        j = j2;
        z = false;
        k5iVar.k(2, new lch(context, hf6Var4, this.d, mniVar, wg7Var, this.X, jkcVar, u9aVar, ehgVar, this.Y, this.Z, j, z, lhgVar.u, lhgVar.v, this.s0));
    }

    public final void g(int i) {
        lhg lhgVar = this.u0;
        k5i k5iVar = lhgVar.m;
        hsi.g(((bxd) ((SparseArray) k5iVar.c).get(i)) == null);
        wg7 wg7Var = this.c.a;
        int i2 = this.a;
        hsi.a("Gaps can not be transmuxed.", !((h95) wg7Var.get(i2)).a());
        SparseArray sparseArray = ((ihg) ((ArrayList) k5iVar.b).get(i2)).a;
        hsi.g(zxg.k(sparseArray, i));
        k5iVar.k(i, new fe5((hf6) sparseArray.get(i), this.d, lhgVar.o, this.Y, lhgVar.h));
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r10, defpackage.hf6 r11) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.khg.h(int, hf6):boolean");
    }
}
