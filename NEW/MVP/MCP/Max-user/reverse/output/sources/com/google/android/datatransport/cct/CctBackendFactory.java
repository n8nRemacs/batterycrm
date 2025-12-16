package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import defpackage.hig;
import defpackage.j62;
import defpackage.t90;
import defpackage.w94;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory {
    public hig create(w94 w94Var) {
        t90 t90Var = (t90) w94Var;
        return new j62(t90Var.a, t90Var.b, t90Var.c);
    }
}
