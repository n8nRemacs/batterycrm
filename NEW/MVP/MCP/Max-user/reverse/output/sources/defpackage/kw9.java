package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public final class kw9 {
    public final k18 a;
    public final k18 b;
    public final Collection c;
    public final bwf d;

    public kw9(final Context context, final k18 k18Var, final k18 k18Var2, final k18 k18Var3, final k18 k18Var4, final k18 k18Var5, final k18 k18Var6, final k18 k18Var7, final l4e l4eVar, final k18 k18Var8, final k18 k18Var9, final k18 k18Var10, k18 k18Var11, k18 k18Var12, k18 k18Var13, List list) {
        this.a = k18Var12;
        this.b = k18Var13;
        this.c = list;
        this.d = new bwf(new cm6() { // from class: jw9
            @Override // defpackage.cm6
            public final Object invoke() {
                return new yw9(context, k18Var, k18Var2, k18Var3, k18Var4, k18Var5, k18Var6, k18Var7, this.b, l4eVar, (lzf) k18Var8.getValue(), (nxg) k18Var9.getValue(), (qi8) k18Var10.getValue());
            }
        });
    }
}
