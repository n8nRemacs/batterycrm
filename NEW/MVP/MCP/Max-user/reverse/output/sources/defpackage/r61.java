package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class r61 implements di4 {
    public static final r61 a = new r61();
    public static final s61 b = s61.b;

    @Override // defpackage.di4
    public final ki4 a() {
        return b;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        int i;
        String str2 = null;
        if (!b.a.contains(gi4Var)) {
            return null;
        }
        s61.b.getClass();
        if (gi4Var.equals(s61.d)) {
            String strT = dqi.t(l8j.k("link", bundle));
            boolean zB = ovi.b(l8j.b("video_enabled", bundle));
            boolean zB2 = ovi.b(l8j.b("is_video_call", bundle));
            boolean zB3 = ovi.b(l8j.b("microphone_enabled", bundle));
            Boolean boolB = l8j.b("front_camera_enabled", bundle);
            return new ni4(str, gi4Var, bundle, 0, new li4(new q61(2, 0), new q61(2, 1)), new l61(strT, zB2, zB, zB3, boolB != null ? boolB.booleanValue() : true, ovi.b(l8j.b("is_new", bundle))), 8);
        }
        if (gi4Var.equals(s61.c)) {
            long jI = l8j.i("opponent_id", bundle);
            boolean zB4 = ovi.b(l8j.b("video_enabled", bundle));
            Boolean boolB2 = l8j.b("microphone_enabled", bundle);
            return new ni4(str, gi4Var, bundle, 0, new li4(new q61(2, 0), new q61(2, 1)), new m61(jI, zB4, boolB2 != null ? boolB2.booleanValue() : true, 0), 8);
        }
        if (gi4Var.equals(s61.e)) {
            return new ni4(str, gi4Var, bundle, 0, new li4(new q61(2, 0), new q61(2, 1)), new m61(l8j.i("chat_id", bundle), ovi.b(l8j.b("video_enabled", bundle)), ovi.b(l8j.b("microphone_enabled", bundle)), 1), 8);
        }
        if (gi4Var.equals(s61.g)) {
            String string = bundle.getString("place");
            if (string != null && !vmf.F(string)) {
                str2 = string;
            }
            if (str2 == null) {
                str2 = "OTHER";
            }
            if (str2 == null) {
                throw new NullPointerException("Name is null");
            }
            if (str2.equals("PIP")) {
                i = 1;
            } else if (str2.equals("FIRST")) {
                i = 2;
            } else if (str2.equals("OTHER")) {
                i = 3;
            } else {
                if (!str2.equals("GLOBAL_PIP")) {
                    throw new IllegalArgumentException("No enum constant one.me.calls.ui.deeplink.CallDeepLinkFactory.Place.".concat(str2));
                }
                i = 4;
            }
            return new ni4(str, gi4Var, bundle, 0, new li4(new q61(i, 0), new q61(i, 1)), new n61(0), 8);
        }
        if (gi4Var.equals(s61.l)) {
            return new ni4(str, gi4Var, bundle, 0, new li4(new q61(4, 0), new q61(4, 1)), new n61(1), 8);
        }
        if (gi4Var.equals(s61.f)) {
            return new ni4(str, gi4Var, bundle, 0, new li4(new q61(3, 0), new q61(3, 1)), new o61(l8j.i("chat_id", bundle), l8j.k("call_name", bundle), bundle.getString("call_avatar"), l8j.f("video_enabled", bundle)), 8);
        }
        if (gi4Var.equals(s61.h)) {
            return new ni4(str, gi4Var, bundle, 0, null, new k61(dqi.t(l8j.k("link", bundle)), 0, l8j.b("is_video_call", bundle)), 24);
        }
        if (gi4Var.equals(s61.i)) {
            return new ni4(str, gi4Var, bundle, 0, null, new g(3), 24);
        }
        if (gi4Var.equals(s61.j)) {
            return new ni4(str, gi4Var, bundle, 0, null, new g(4), 24);
        }
        if (gi4Var.equals(s61.k)) {
            return new ni4(str, gi4Var, bundle, 0, null, new g(5), 24);
        }
        if (gi4Var.equals(s61.n)) {
            return new ni4(str, gi4Var, bundle, 0, new li4(new q61(3, 0), new q61(3, 1)), new p61(bundle, 0), 8);
        }
        if (gi4Var.equals(s61.o)) {
            return new ni4(str, gi4Var, bundle, 0, new li4(new q61(3, 0), new q61(3, 1)), new p61(bundle, 1), 8);
        }
        if (gi4Var.equals(s61.m)) {
            return new ni4(str, gi4Var, bundle, 0, null, new g(6), 24);
        }
        throw new IllegalStateException(az1.h("invalid route ", gi4Var));
    }
}
