package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class yie {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final Bundle b;
    public final long c;
    public final mie d;

    static {
        String str = zxg.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = Integer.toString(3, 36);
    }

    public yie(int i) {
        this(i, Bundle.EMPTY);
    }

    public static yie a(Bundle bundle) {
        int i = bundle.getInt(e, -1);
        Bundle bundle2 = bundle.getBundle(f);
        long j = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        mie mieVarA = bundle3 != null ? mie.a(bundle3) : i != 0 ? new mie(i) : null;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new yie(i, bundle2, j, mieVarA);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(e, this.a);
        bundle.putBundle(f, this.b);
        bundle.putLong(g, this.c);
        mie mieVar = this.d;
        if (mieVar != null) {
            bundle.putBundle(h, mieVar.b());
        }
        return bundle;
    }

    public yie(int i, Bundle bundle) {
        this(i, bundle, SystemClock.elapsedRealtime(), null);
    }

    public yie(int i, Bundle bundle, long j, mie mieVar) {
        hsi.b(mieVar == null || i < 0);
        this.a = i;
        this.b = new Bundle(bundle);
        this.c = j;
        if (mieVar == null && i < 0) {
            mieVar = new mie(i);
        }
        this.d = mieVar;
    }
}
