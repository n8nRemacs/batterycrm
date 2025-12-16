package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public abstract class kzi {
    public static final CharSequence a(CharSequence charSequence) {
        return charSequence.subSequence(0, charSequence.length());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(mbe mbeVar, long j, em6 em6Var) {
        xva xvaVar = new xva(j);
        wva wvaVar = wva.a;
        uog.d(3, wvaVar);
        Symbol symbol = pbe.a;
        kbe kbeVar = new kbe(mbeVar, xvaVar, wvaVar, obe.b, pbe.e, (dtf) em6Var, null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mbe.X;
        mbeVar.f(kbeVar, false);
    }
}
