package defpackage;

import android.content.Context;
import java.util.UUID;

/* loaded from: classes.dex */
public final class sve {
    public static final cl3 b;
    public final Context a;

    static {
        bl3 bl3VarB = cl3.b(sve.class);
        bl3VarB.a(vt4.a(o1a.class));
        bl3VarB.a(vt4.a(Context.class));
        bl3VarB.g = new jmf(4);
        b = bl3VarB.b();
    }

    public sve(Context context) {
        this.a = context;
    }

    public final synchronized String a() {
        String string = this.a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }
}
