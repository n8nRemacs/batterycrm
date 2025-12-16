package defpackage;

import android.os.Bundle;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;

/* loaded from: classes.dex */
public final class x91 implements di4 {
    public static final x91 a = new x91();
    public static final y91 b = y91.b;

    @Override // defpackage.di4
    public final ki4 a() {
        return b;
    }

    @Override // defpackage.di4
    public final ni4 b(String str, gi4 gi4Var, Bundle bundle) {
        mi4 w91Var;
        if (!b.a.contains(gi4Var)) {
            return null;
        }
        y91.b.getClass();
        if (gi4Var.equals(y91.c)) {
            w91Var = new g(7);
        } else if (gi4Var.equals(y91.d)) {
            final String string = bundle.getString("call_link");
            final String string2 = bundle.getString("call_title");
            final Long lD = l8j.d("call_chat_id", bundle);
            Boolean boolB = l8j.b("is_link_call", bundle);
            final boolean zBooleanValue = boolB != null ? boolB.booleanValue() : false;
            w91Var = new mi4() { // from class: v91
                @Override // defpackage.mi4
                public final Object a() {
                    return new CallLinkInfoScreen(lD, string, string2, zBooleanValue);
                }
            };
        } else {
            if (!gi4Var.equals(y91.e)) {
                throw new IllegalStateException(az1.h("invalid route ", gi4Var));
            }
            w91Var = new w91(l8j.i("chat_id", bundle), 0);
        }
        return new ni4(str, gi4Var, bundle, 0, null, w91Var, 24);
    }
}
