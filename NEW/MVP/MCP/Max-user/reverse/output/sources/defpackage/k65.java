package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class k65 extends HashMap {
    public static k65 a(tm9 tm9Var) {
        int iM = efi.m(tm9Var);
        k65 k65Var = new k65();
        for (int i = 0; i < iM; i++) {
            k65Var.put(Long.valueOf(tm9Var.t0()), Long.valueOf(tm9Var.t0()));
        }
        return k65Var;
    }
}
