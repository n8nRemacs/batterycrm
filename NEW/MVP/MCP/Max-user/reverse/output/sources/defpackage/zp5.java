package defpackage;

import android.view.View;
import java.util.BitSet;

/* loaded from: classes2.dex */
public final class zp5 extends d2f {
    @Override // defpackage.d2f
    public final void A(t98 t98Var, Object obj) {
        bq5 bq5Var = (bq5) t98Var;
        aq5 aq5Var = obj instanceof aq5 ? (aq5) obj : null;
        if (aq5Var != null) {
            BitSet bitSet = (BitSet) aq5Var.b;
            boolean z = bitSet.get(0);
            View view = this.a;
            if (z || bitSet.get(5)) {
                ((uc2) view).b(bq5Var.b, bq5Var.Z, Long.valueOf(bq5Var.a));
            }
            if (bitSet.get(1)) {
                ((uc2) view).setOnline(bq5Var.c);
            }
            if (bitSet.get(2)) {
                ((uc2) view).setTitle(bq5Var.o);
            }
            if (bitSet.get(3)) {
                CharSequence charSequence = bq5Var.X;
                int i = uc2.Z0;
                ((uc2) view).d(charSequence, true);
            }
            bitSet.get(4);
            if (bitSet.get(6)) {
                ((uc2) view).setVerified(bq5Var.d);
            }
        }
    }

    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(bq5 bq5Var) {
        uc2 uc2Var = (uc2) this.a;
        long j = bq5Var.a;
        uc2Var.setId(j > 2147483647L ? Long.hashCode(j) : (int) j);
        uc2Var.setTitle(bq5Var.o);
        uc2Var.d(bq5Var.X, true);
        uc2Var.b(bq5Var.b, bq5Var.Z, Long.valueOf(j));
        uc2Var.setOnline(bq5Var.c);
        uc2Var.setVerified(bq5Var.d);
    }
}
