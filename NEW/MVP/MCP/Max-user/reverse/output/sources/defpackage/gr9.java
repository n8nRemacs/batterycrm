package defpackage;

import android.content.Context;
import android.text.Layout;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class gr9 {
    public final Context a;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final ContextScope h;
    public final bwf i;
    public final String b = gr9.class.getName();
    public final bwf f = new bwf(new yq9(0));
    public final ConcurrentHashMap g = new ConcurrentHashMap();

    public gr9(lzf lzfVar, so3 so3Var, k18 k18Var, k18 k18Var2, k18 k18Var3, Context context) {
        this.a = context;
        this.c = k18Var;
        this.d = k18Var2;
        this.e = k18Var3;
        this.h = d7j.a(((q2b) lzfVar).a());
        this.i = new bwf(new nz(k18Var, 21));
        so3Var.a(so3.c | so3.d, new yr7(1, this));
    }

    public static pm9 c(gr9 gr9Var, pb2 pb2Var, eh9 eh9Var, boolean z) {
        gr9Var.getClass();
        ar9 ar9Var = new ar9(pb2Var, eh9Var, false);
        yk8 yk8VarE = gr9Var.e();
        Object objC = yk8VarE.c(ar9Var);
        if (objC == null) {
            objC = gr9Var.a(pb2Var, eh9Var, null, false);
            yk8VarE.d(ar9Var, objC);
        }
        j18 j18Var = (j18) objC;
        return z ? j18Var.a : j18Var.b;
    }

    public final j18 a(final pb2 pb2Var, final eh9 eh9Var, final CharSequence charSequence, final boolean z) {
        Iterable<eh9> iterableSingletonList;
        final gr9 gr9Var;
        final pb2 pb2Var2;
        final eh9 eh9Var2;
        bwf bwfVar;
        ar9 ar9Var = new ar9(pb2Var, eh9Var, z);
        ((xeb) this.d.getValue()).getClass();
        sk9 sk9Var = eh9Var.c;
        if (sk9Var == null || sk9Var.a != 1) {
            iterableSingletonList = hd5.a;
        } else {
            eh9 eh9VarB = sk9Var.c;
            if (eh9VarB.b() != null) {
                eh9VarB = eh9VarB.b();
            }
            iterableSingletonList = Collections.singletonList(new web(eh9VarB.a, eh9VarB.b, eh9VarB.c, eh9VarB.d, eh9VarB.o, eh9VarB.X, eh9VarB.Y, eh9VarB.Z));
        }
        for (eh9 eh9Var3 : iterableSingletonList) {
            if (eh9Var3 != eh9Var) {
                a(pb2Var, eh9Var3, null, true);
            }
        }
        j18 j18Var = (j18) e().c(ar9Var);
        final int iB = ((dza) d()).b();
        final int iB2 = ((dza) d()).b();
        final int i = 0;
        bwf bwfVar2 = new bwf(new cm6(this) { // from class: zq9
            public final /* synthetic */ gr9 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                CharSequence charSequence2 = charSequence;
                boolean z2 = z;
                switch (i2) {
                }
                return this.b.b(pb2Var, eh9Var, iB, charSequence2, z2);
            }
        });
        boolean z2 = iB == iB2;
        if (z2) {
            gr9Var = this;
            pb2Var2 = pb2Var;
            eh9Var2 = eh9Var;
            bwfVar = bwfVar2;
        } else {
            final int i2 = 1;
            gr9Var = this;
            pb2Var2 = pb2Var;
            eh9Var2 = eh9Var;
            bwfVar = new bwf(new cm6(gr9Var) { // from class: zq9
                public final /* synthetic */ gr9 b;

                {
                    this.b = gr9Var;
                }

                @Override // defpackage.cm6
                public final Object invoke() {
                    int i22 = i2;
                    CharSequence charSequence2 = charSequence;
                    boolean z22 = z;
                    switch (i22) {
                    }
                    return this.b.b(pb2Var2, eh9Var2, iB2, charSequence2, z22);
                }
            });
        }
        boolean z3 = gr9Var.a.getResources().getConfiguration().orientation == 1;
        ContextScope contextScope = gr9Var.h;
        if (j18Var != null) {
            pm9 pm9Var = j18Var.a;
            pm9 pm9Var2 = j18Var.b;
            if (!z2 && !z3) {
                pm9Var2.b((Layout) bwfVar.getValue());
                svi.e(contextScope, null, null, new cr9(j18Var, bwfVar2, null), 3);
                return j18Var;
            }
            pm9Var.b((Layout) bwfVar2.getValue());
            if (pm9Var != pm9Var2) {
                svi.e(contextScope, null, null, new br9(j18Var, bwfVar, null), 3);
            }
            return j18Var;
        }
        pm9 pm9Var3 = new pm9(pb2Var2, eh9Var2, bwfVar2);
        pm9 pm9Var4 = z2 ? pm9Var3 : new pm9(pb2Var2, eh9Var2, bwfVar);
        j18 j18Var2 = new j18(pm9Var3, pm9Var4);
        gr9Var.e().d(ar9Var, j18Var2);
        if (!z2 && !z3) {
            pm9Var4.b((Layout) bwfVar.getValue());
            svi.e(contextScope, null, null, new er9(j18Var2, bwfVar2, null), 3);
            return j18Var2;
        }
        pm9Var3.b((Layout) bwfVar2.getValue());
        if (pm9Var3 != pm9Var4) {
            svi.e(contextScope, null, null, new dr9(j18Var2, bwfVar, null), 3);
        }
        return j18Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.Layout b(defpackage.pb2 r37, defpackage.eh9 r38, int r39, java.lang.CharSequence r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gr9.b(pb2, eh9, int, java.lang.CharSequence, boolean):android.text.Layout");
    }

    public final eu0 d() {
        return (eu0) this.c.getValue();
    }

    public final yk8 e() {
        return (yk8) this.f.getValue();
    }
}
