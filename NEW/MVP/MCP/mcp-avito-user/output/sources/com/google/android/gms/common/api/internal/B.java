package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C36695c;
import com.google.android.gms.tasks.C37028k;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* loaded from: classes6.dex */
public class B {
    @RX0.a
    public static <ResultT> void a(@j.N Status status, @j.P ResultT resultt, @j.N C37028k<ResultT> c37028k) {
        if (status.h()) {
            c37028k.b(resultt);
        } else {
            c37028k.a(C36695c.a(status));
        }
    }

    @ResultIgnorabilityUnspecified
    @RX0.a
    public static <ResultT> boolean b(@j.N Status status, @j.P ResultT resultt, @j.N C37028k<ResultT> c37028k) {
        return status.h() ? c37028k.d(resultt) : c37028k.c(C36695c.a(status));
    }
}
