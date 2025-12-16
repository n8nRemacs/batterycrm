package defpackage;

import ru.ok.android.externcalls.sdk.stat.candidateschanged.IceCandidatePairChangedStat;

/* loaded from: classes2.dex */
public final class p70 extends n2 {
    /* JADX WARN: Illegal instructions before constructor call */
    public p70(int i) {
        short s = 1;
        if (i != 1) {
            s = 2;
            if (i != 2) {
                throw null;
            }
        }
        super("registration_failed", 3, fzd.c(new imb(IceCandidatePairChangedStat.KEY_REASON, Short.valueOf(s))));
    }
}
