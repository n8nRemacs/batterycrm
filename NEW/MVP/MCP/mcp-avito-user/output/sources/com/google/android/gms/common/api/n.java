package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.C36729v;
import j.N;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class n {
    @N
    @RX0.a
    public static m a(@N Status status) {
        C36729v.a("Status code must not be SUCCESS", !status.h());
        C c12 = new C(status);
        c12.setResult(status);
        return c12;
    }
}
