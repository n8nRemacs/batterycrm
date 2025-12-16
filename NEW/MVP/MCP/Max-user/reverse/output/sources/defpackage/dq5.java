package defpackage;

import android.net.Uri;
import android.view.View;
import java.util.BitSet;

/* loaded from: classes2.dex */
public final class dq5 extends d2f {
    public jx0 E0;
    public jx0 F0;

    @Override // defpackage.d2f
    public final void A(t98 t98Var, Object obj) {
        bq5 bq5Var = (bq5) t98Var;
        CharSequence charSequence = bq5Var.X;
        aq5 aq5Var = obj instanceof aq5 ? (aq5) obj : null;
        if (aq5Var != null) {
            BitSet bitSet = (BitSet) aq5Var.b;
            boolean z = bitSet.get(0);
            View view = this.a;
            if (z) {
                v0b v0bVar = (v0b) view;
                long j = bq5Var.a;
                CharSequence charSequence2 = bq5Var.Z;
                Uri uri = bq5Var.b;
                if (uri == null) {
                    uri = Uri.EMPTY;
                }
                v0bVar.g(j, charSequence2, uri.toString());
            }
            if (bitSet.get(2)) {
                ((v0b) view).setTitle(bq5Var.o);
            }
            if (bitSet.get(3)) {
                ((v0b) view).setSubtitle(charSequence);
            }
            if (bitSet.get(4)) {
                v0b v0bVar2 = (v0b) view;
                if (bq5Var.Y) {
                    f8j.d(v0bVar2, 300L, new cq5(this, bq5Var, 2));
                    v0bVar2.setSubtitle(charSequence);
                    v0bVar2.f();
                } else {
                    f8j.d(v0bVar2, 300L, new cq5(this, bq5Var, 3));
                    if (charSequence == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    v0bVar2.h(charSequence, new qn2(this, 13, bq5Var));
                    v0bVar2.setSubtitle(null);
                }
            }
        }
    }

    @Override // defpackage.d2f
    public final void E() {
        this.E0 = null;
        this.F0 = null;
    }

    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(bq5 bq5Var) {
        v0b v0bVar = (v0b) this.a;
        long j = bq5Var.a;
        v0bVar.setId((int) (j >> 32));
        if (bq5Var.Y) {
            v0bVar.setSubtitle(bq5Var.X);
        } else {
            v0bVar.setSubtitle(null);
        }
        v0bVar.setTitle(bq5Var.o);
        CharSequence charSequence = bq5Var.Z;
        Uri uri = bq5Var.b;
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        v0bVar.g(j, charSequence, uri.toString());
    }
}
