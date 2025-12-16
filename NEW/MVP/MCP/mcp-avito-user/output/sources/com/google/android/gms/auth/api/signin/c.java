package com.google.android.gms.auth.api.signin;

import android.content.Context;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.dynamite.DynamiteModule;
import j.k0;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@Deprecated
/* loaded from: classes6.dex */
public class c extends com.google.android.gms.common.api.h<GoogleSignInOptions> {

    /* renamed from: k, reason: collision with root package name */
    @k0
    public static int f348762k;

    static {
        new m(null);
        f348762k = 1;
    }

    public final synchronized int d() {
        int i12;
        try {
            i12 = f348762k;
            if (i12 == 1) {
                Context applicationContext = getApplicationContext();
                C36687f c36687f = C36687f.f349287e;
                int iC2 = c36687f.c(12451000, applicationContext);
                if (iC2 == 0) {
                    i12 = 4;
                    f348762k = 4;
                } else if (c36687f.b(applicationContext, iC2, null) != null || DynamiteModule.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i12 = 2;
                    f348762k = 2;
                } else {
                    i12 = 3;
                    f348762k = 3;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return i12;
    }
}
