package defpackage;

import android.os.Bundle;
import java.util.HashMap;
import one.me.android.media.service.OneMeMediaSessionService;

/* loaded from: classes.dex */
public class w69 {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final o79 a;

    public w69(OneMeMediaSessionService oneMeMediaSessionService, em5 em5Var, wg7 wg7Var, wg7 wg7Var2, wg7 wg7Var3, usd usdVar, Bundle bundle, Bundle bundle2, h79 h79Var) {
        synchronized (b) {
            HashMap map = c;
            if (map.containsKey("")) {
                throw new IllegalStateException("Session ID must be unique. ID=");
            }
            map.put("", this);
        }
        this.a = new o79(this, oneMeMediaSessionService, em5Var, wg7Var, wg7Var2, wg7Var3, usdVar, bundle, bundle2, h79Var);
    }

    public final u3c a() {
        return this.a.t.a;
    }
}
