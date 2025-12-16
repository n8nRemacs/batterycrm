package defpackage;

import android.os.Bundle;
import one.me.location.map.show.ShowLocationScreen;

/* loaded from: classes2.dex */
public final class hf8 implements di4 {
    public static final hf8 a = new hf8();
    public static final if8 b = if8.b;

    @Override // defpackage.di4
    public final ki4 a() {
        return b;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        mi4 j28Var;
        if (!b.a.contains(gi4Var)) {
            return null;
        }
        if8.b.getClass();
        if (gi4Var.equals(if8.c)) {
            j28Var = new j28(l8j.i("chat_id", bundle), l8j.h("request_code", bundle));
        } else {
            if (!gi4Var.equals(if8.d)) {
                throw new IllegalStateException(az1.h("invalid route ", gi4Var));
            }
            final Long lD = l8j.d("chat_id", bundle);
            final Long lD2 = l8j.d("sender_id", bundle);
            final Long lD3 = l8j.d("msg_id", bundle);
            final double dG = l8j.g("lat", bundle);
            final double dG2 = l8j.g("lon", bundle);
            String string = bundle.getString("z");
            final Float fValueOf = string != null ? Float.valueOf(Float.parseFloat(string)) : null;
            j28Var = new mi4() { // from class: gf8
                @Override // defpackage.mi4
                public final Object a() {
                    return new ShowLocationScreen(lD, lD2, lD3, dG, dG2, fValueOf);
                }
            };
        }
        return new ni4(str, gi4Var, bundle, 1, null, j28Var, 16);
    }
}
