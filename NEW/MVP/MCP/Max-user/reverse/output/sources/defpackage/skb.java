package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public interface skb {
    public static final Pair R;
    public static final Pair S;
    public static final Pair T;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        R = Pair.create(fValueOf, fValueOf);
        S = Pair.create(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(1.0f);
        T = Pair.create(fValueOf2, fValueOf2);
    }
}
