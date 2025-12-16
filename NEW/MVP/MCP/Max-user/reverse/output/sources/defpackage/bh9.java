package defpackage;

import com.google.android.exoplayer2.source.MergingMediaSource$IllegalMergeException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class bh9 extends hm3 {
    public static final i09 r;
    public final bk0[] k;
    public final r9g[] l;
    public final ArrayList m;
    public final lcj n;
    public int o;
    public long[][] p;
    public MergingMediaSource$IllegalMergeException q;

    static {
        nz8 nz8Var = new nz8();
        t76 t76Var = wg7.b;
        zjd zjdVar = zjd.o;
        List list = Collections.EMPTY_LIST;
        zjd zjdVar2 = zjd.o;
        r = new i09("MergingMediaSource", new rz8(nz8Var), null, new xz8(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), v19.R0);
    }

    public bh9(bk0... bk0VarArr) {
        lcj lcjVar = new lcj(17);
        this.k = bk0VarArr;
        this.n = lcjVar;
        this.m = new ArrayList(Arrays.asList(bk0VarArr));
        this.o = -1;
        this.l = new r9g[bk0VarArr.length];
        this.p = new long[0][];
        new HashMap();
        u4j.a(8, "expectedKeys");
        u4j.a(2, "expectedValuesPerKey");
        new y6a(wi3.a(8)).X = new x6a();
    }

    @Override // defpackage.bk0
    public final o29 a(c99 c99Var, qi4 qi4Var, long j) {
        bk0[] bk0VarArr = this.k;
        int length = bk0VarArr.length;
        o29[] o29VarArr = new o29[length];
        r9g[] r9gVarArr = this.l;
        int iB = r9gVarArr[0].b(c99Var.a);
        for (int i = 0; i < length; i++) {
            o29VarArr[i] = bk0VarArr[i].a(c99Var.b(r9gVarArr[i].l(iB)), qi4Var, j - this.p[iB][i]);
        }
        return new yg9(this.n, this.p[iB], o29VarArr);
    }

    @Override // defpackage.bk0
    public final i09 f() {
        bk0[] bk0VarArr = this.k;
        return bk0VarArr.length > 0 ? bk0VarArr[0].f() : r;
    }

    @Override // defpackage.hm3, defpackage.bk0
    public final void g() throws MergingMediaSource$IllegalMergeException {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.q;
        if (mergingMediaSource$IllegalMergeException != null) {
            throw mergingMediaSource$IllegalMergeException;
        }
        super.g();
    }

    @Override // defpackage.bk0
    public final void i(vgg vggVar) {
        this.j = vggVar;
        this.i = xxg.l(null);
        int i = 0;
        while (true) {
            bk0[] bk0VarArr = this.k;
            if (i >= bk0VarArr.length) {
                return;
            }
            r(Integer.valueOf(i), bk0VarArr[i]);
            i++;
        }
    }

    @Override // defpackage.bk0
    public final void k(o29 o29Var) {
        yg9 yg9Var = (yg9) o29Var;
        int i = 0;
        while (true) {
            bk0[] bk0VarArr = this.k;
            if (i >= bk0VarArr.length) {
                return;
            }
            bk0 bk0Var = bk0VarArr[i];
            o29 o29Var2 = yg9Var.a[i];
            if (o29Var2 instanceof wg9) {
                o29Var2 = ((wg9) o29Var2).a;
            }
            bk0Var.k(o29Var2);
            i++;
        }
    }

    @Override // defpackage.hm3, defpackage.bk0
    public final void m() {
        super.m();
        Arrays.fill(this.l, (Object) null);
        this.o = -1;
        this.q = null;
        ArrayList arrayList = this.m;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // defpackage.hm3
    public final c99 p(Object obj, c99 c99Var) {
        if (((Integer) obj).intValue() == 0) {
            return c99Var;
        }
        return null;
    }

    @Override // defpackage.hm3
    public final void q(Object obj, bk0 bk0Var, r9g r9gVar) {
        Integer num = (Integer) obj;
        if (this.q != null) {
            return;
        }
        if (this.o == -1) {
            this.o = r9gVar.h();
        } else if (r9gVar.h() != this.o) {
            this.q = new MergingMediaSource$IllegalMergeException();
            return;
        }
        int length = this.p.length;
        r9g[] r9gVarArr = this.l;
        if (length == 0) {
            this.p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.o, r9gVarArr.length);
        }
        ArrayList arrayList = this.m;
        arrayList.remove(bk0Var);
        r9gVarArr[num.intValue()] = r9gVar;
        if (arrayList.isEmpty()) {
            j(r9gVarArr[0]);
        }
    }
}
