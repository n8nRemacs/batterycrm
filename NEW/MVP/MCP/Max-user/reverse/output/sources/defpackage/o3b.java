package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class o3b {
    public static final long e;
    public static final /* synthetic */ int f = 0;
    public final Context a;
    public final k18 b;
    public final k18 c;
    public final k18 d;

    static {
        int i = s65.d;
        e = v9j.h(3, y65.SECONDS);
    }

    public o3b(Context context, k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = context;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
    }

    public final j25 a() {
        return (j25) this.b.getValue();
    }
}
