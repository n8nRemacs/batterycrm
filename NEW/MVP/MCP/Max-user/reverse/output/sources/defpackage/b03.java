package defpackage;

import android.view.View;
import java.util.BitSet;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class b03 extends d2f {
    public static sc2 H(gs2 gs2Var) {
        int iOrdinal = gs2Var.ordinal();
        if (iOrdinal == 0) {
            return sc2.a;
        }
        if (iOrdinal == 1) {
            return sc2.b;
        }
        if (iOrdinal == 2) {
            return sc2.c;
        }
        if (iOrdinal == 3) {
            return sc2.d;
        }
        if (iOrdinal == 4) {
            return sc2.o;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void I(uc2 uc2Var, hs2 hs2Var) {
        u4g u4gVar = hs2Var.o;
        if (u4gVar != null) {
            uc2Var.setSubtitle(u4gVar);
            return;
        }
        CharSequence charSequence = hs2Var.Y;
        if (charSequence == null || vmf.F(charSequence)) {
            charSequence = null;
        }
        if (charSequence == null) {
            charSequence = hs2Var.X;
        }
        uc2Var.d(charSequence, hs2Var.u0);
    }

    @Override // defpackage.d2f
    public final void C() {
        ((uc2) this.a).start();
    }

    @Override // defpackage.d2f
    public final void D() {
        ((uc2) this.a).stop();
    }

    @Override // defpackage.d2f
    public final void E() {
        ((uc2) this.a).stop();
    }

    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void z(hs2 hs2Var) {
        uc2 uc2Var = (uc2) this.a;
        int id = uc2Var.getId();
        uc2Var.setId(Long.hashCode(hs2Var.a));
        uc2Var.setTitle(hs2Var.c);
        I(uc2Var, hs2Var);
        u4g u4gVar = hs2Var.t0;
        int i = hs2Var.s0;
        if (u4gVar != null) {
            uc2Var.g(u4gVar, i);
        } else {
            uc2Var.f(i, hs2Var.Z, hs2Var.u0);
        }
        uc2Var.setPinned(hs2Var.z0 != 0);
        uc2Var.setMuted(hs2Var.x());
        uc2Var.setOnline(hs2Var.y());
        uc2Var.setCallBadge(hs2Var.n());
        uc2Var.setVerified((hs2Var.D0 & 4) != 0);
        uc2Var.setMention(hs2Var.p());
        uc2Var.setReaction(hs2Var.o());
        uc2Var.setTime(hs2Var.v0);
        uc2Var.j(hs2Var.y0, id == uc2Var.getId());
        uc2Var.setStatus(H(hs2Var.x0));
        uc2Var.b(hs2Var.b, hs2Var.C0, Long.valueOf(hs2Var.B0));
    }

    @Override // defpackage.d2f
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final void A(hs2 hs2Var, Object obj) {
        fs2 fs2Var = obj instanceof fs2 ? (fs2) obj : null;
        if (fs2Var == null) {
            z(hs2Var);
            return;
        }
        BitSet bitSet = (BitSet) fs2Var.b;
        boolean z = bitSet.get(1);
        View view = this.a;
        if (z) {
            ((uc2) view).b(hs2Var.b, hs2Var.C0, Long.valueOf(hs2Var.B0));
        }
        if (bitSet.get(0)) {
            ((uc2) view).setOnline(hs2Var.y());
        }
        if (bitSet.get(2)) {
            ((uc2) view).setTitle(hs2Var.c);
        }
        if (bitSet.get(4) || bitSet.get(15)) {
            I((uc2) view, hs2Var);
        }
        if (bitSet.get(5) || bitSet.get(16)) {
            uc2 uc2Var = (uc2) view;
            u4g u4gVar = hs2Var.t0;
            int i = hs2Var.s0;
            if (u4gVar != null) {
                uc2Var.g(u4gVar, i);
            } else {
                uc2Var.f(i, hs2Var.Z, hs2Var.u0);
            }
        }
        if (bitSet.get(6)) {
            ((uc2) view).setTime(hs2Var.v0);
        }
        if (bitSet.get(8)) {
            ((uc2) view).setStatus(H(hs2Var.x0));
        }
        if (bitSet.get(9)) {
            ((uc2) view).j(hs2Var.y0, true);
        }
        if (bitSet.get(10)) {
            ((uc2) view).setMuted(hs2Var.x());
        }
        if (bitSet.get(11)) {
            ((uc2) view).setReaction(hs2Var.o());
        }
        if (bitSet.get(12)) {
            ((uc2) view).setMention(hs2Var.p());
        }
        if (bitSet.get(13)) {
            ((uc2) view).setPinned(hs2Var.z0 != 0);
        }
        if (bitSet.get(14)) {
            ((uc2) view).setCallBadge(hs2Var.n());
        }
    }
}
