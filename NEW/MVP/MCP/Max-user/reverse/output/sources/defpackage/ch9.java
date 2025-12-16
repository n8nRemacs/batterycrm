package defpackage;

import androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class ch9 extends im3 {
    public static final k09 s;
    public final ck0[] k;
    public final ArrayList l;
    public final s9g[] m;
    public final ArrayList n;
    public final kc3 o;
    public int p;
    public long[][] q;
    public MergingMediaSource$IllegalMergeException r;

    static {
        oz8 oz8Var = new oz8();
        t76 t76Var = wg7.b;
        zjd zjdVar = zjd.o;
        List list = Collections.EMPTY_LIST;
        zjd zjdVar2 = zjd.o;
        wz8 wz8Var = new wz8();
        s = new k09("MergingMediaSource", new sz8(oz8Var), null, new yz8(wz8Var), w19.K, d09.d);
    }

    public ch9(ck0... ck0VarArr) {
        kc3 kc3Var = new kc3(18);
        this.k = ck0VarArr;
        this.o = kc3Var;
        this.n = new ArrayList(Arrays.asList(ck0VarArr));
        this.p = -1;
        this.l = new ArrayList(ck0VarArr.length);
        for (int i = 0; i < ck0VarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new s9g[ck0VarArr.length];
        this.q = new long[0][];
        new HashMap();
        u4j.a(8, "expectedKeys");
        u4j.a(2, "expectedValuesPerKey");
        new y6a(wi3.a(8)).X = new x6a();
    }

    @Override // defpackage.ck0
    public final boolean a(k09 k09Var) {
        ck0[] ck0VarArr = this.k;
        return ck0VarArr.length > 0 && ck0VarArr[0].a(k09Var);
    }

    @Override // defpackage.ck0
    public final p29 c(d99 d99Var, ri4 ri4Var, long j) {
        ck0[] ck0VarArr = this.k;
        int length = ck0VarArr.length;
        p29[] p29VarArr = new p29[length];
        s9g[] s9gVarArr = this.m;
        int iB = s9gVarArr[0].b(d99Var.a);
        for (int i = 0; i < length; i++) {
            d99 d99VarA = d99Var.a(s9gVarArr[i].l(iB));
            p29VarArr[i] = ck0VarArr[i].c(d99VarA, ri4Var, j - this.q[iB][i]);
            ((List) this.l.get(i)).add(new ah9(d99VarA, p29VarArr[i]));
        }
        return new zg9(this.o, this.q[iB], p29VarArr);
    }

    @Override // defpackage.ck0
    public final k09 i() {
        ck0[] ck0VarArr = this.k;
        return ck0VarArr.length > 0 ? ck0VarArr[0].i() : s;
    }

    @Override // defpackage.im3, defpackage.ck0
    public final void k() throws MergingMediaSource$IllegalMergeException {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.r;
        if (mergingMediaSource$IllegalMergeException != null) {
            throw mergingMediaSource$IllegalMergeException;
        }
        super.k();
    }

    @Override // defpackage.ck0
    public final void m(wgg wggVar) {
        this.j = wggVar;
        this.i = zxg.n(null);
        int i = 0;
        while (true) {
            ck0[] ck0VarArr = this.k;
            if (i >= ck0VarArr.length) {
                return;
            }
            z(Integer.valueOf(i), ck0VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.ck0
    public final void o(p29 p29Var) {
        zg9 zg9Var = (zg9) p29Var;
        int i = 0;
        while (true) {
            ck0[] ck0VarArr = this.k;
            if (i >= ck0VarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            p29[] p29VarArr = zg9Var.a;
            boolean[] zArr = zg9Var.b;
            p29 p29Var2 = zArr[i] ? ((x8g) p29VarArr[i]).a : p29VarArr[i];
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (((ah9) list.get(i2)).b.equals(p29Var2)) {
                    list.remove(i2);
                    break;
                }
                i2++;
            }
            ck0 ck0Var = ck0VarArr[i];
            p29[] p29VarArr2 = zg9Var.a;
            ck0Var.o(zArr[i] ? ((x8g) p29VarArr2[i]).a : p29VarArr2[i]);
            i++;
        }
    }

    @Override // defpackage.im3, defpackage.ck0
    public final void q() {
        super.q();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // defpackage.ck0
    public final void t(k09 k09Var) {
        this.k[0].t(k09Var);
    }

    @Override // defpackage.im3
    public final d99 v(Object obj, d99 d99Var) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((ah9) list.get(i)).a.equals(d99Var)) {
                return ((ah9) ((List) arrayList.get(0)).get(i)).a;
            }
        }
        return null;
    }

    @Override // defpackage.im3
    public final void y(Object obj, ck0 ck0Var, s9g s9gVar) {
        Integer num = (Integer) obj;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            this.p = s9gVar.h();
        } else if (s9gVar.h() != this.p) {
            this.r = new MergingMediaSource$IllegalMergeException();
            return;
        }
        int length = this.q.length;
        s9g[] s9gVarArr = this.m;
        if (length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.p, s9gVarArr.length);
        }
        ArrayList arrayList = this.n;
        arrayList.remove(ck0Var);
        s9gVarArr[num.intValue()] = s9gVar;
        if (arrayList.isEmpty()) {
            n(s9gVarArr[0]);
        }
    }
}
