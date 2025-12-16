package defpackage;

import java.util.BitSet;

/* loaded from: classes2.dex */
public interface ioe extends t98 {
    public static final une W = une.a;

    s5g a();

    xne b();

    s5g c();

    foe d();

    u18 e();

    s5g getTitle();

    default hoe getType() {
        return hoe.b;
    }

    @Override // defpackage.t98
    default boolean h(t98 t98Var) {
        return getItemId() == t98Var.getItemId();
    }

    @Override // defpackage.t98
    default Object k(t98 t98Var) {
        toe toeVar = t98Var instanceof toe ? (toe) t98Var : null;
        if (toeVar == null) {
            return null;
        }
        goe goeVar = new goe(9);
        BitSet bitSet = (BitSet) goeVar.b;
        bitSet.set(0, t() != toeVar.b);
        bitSet.set(1, !fni.a(getTitle(), toeVar.c));
        bitSet.set(2, getType() != toeVar.d);
        bitSet.set(3, !fni.a(a(), toeVar.o));
        bitSet.set(4, !fni.a(d(), toeVar.Y));
        bitSet.set(5, !fni.a(b(), toeVar.Z));
        bitSet.set(6, !fni.a(c(), toeVar.s0));
        bitSet.set(7, !fni.a(e(), toeVar.X));
        return goeVar;
    }

    @Override // defpackage.t98
    /* renamed from: m */
    default int getK0() {
        return 0;
    }

    int t();
}
