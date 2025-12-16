package defpackage;

import android.os.IBinder;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class pv8 implements IBinder.DeathRecipient {
    public final String a;
    public final int b;
    public final int c;
    public final b89 d;
    public final vv8 e;
    public final HashMap f = new HashMap();
    public final /* synthetic */ k89 g;

    public pv8(k89 k89Var, String str, int i, int i2, wv8 wv8Var) {
        this.g = k89Var;
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = new b89(str, i, i2);
        this.e = wv8Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.g.Y.post(new r98(4, this));
    }
}
