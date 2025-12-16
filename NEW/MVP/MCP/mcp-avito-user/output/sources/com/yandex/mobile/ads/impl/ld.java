package com.yandex.mobile.ads.impl;

import android.graphics.RectF;

/* loaded from: classes8.dex */
public final class ld {
    public static boolean a(@Y61.k b30 b30Var) {
        nd ndVarA;
        k51 k51VarC = b30Var.c();
        if (k51VarC == null || (ndVarA = k51VarC.a()) == null) {
            return false;
        }
        return (ndVarA.a() != null && ndVarA.d() != null && kotlin.jvm.internal.L.f(ndVarA.a(), ndVarA.d())) || (ndVarA.b() != null && ndVarA.c() != null && kotlin.jvm.internal.L.f(ndVarA.b(), ndVarA.c()));
    }

    @Y61.l
    public static String a(@Y61.k RectF rectF, @Y61.k b30 b30Var) {
        nd ndVarA;
        k51 k51VarC;
        c51 c51VarB;
        float fWidth;
        int iC2;
        k51 k51VarC2 = b30Var.c();
        if (k51VarC2 == null || (ndVarA = k51VarC2.a()) == null || (k51VarC = b30Var.c()) == null || (c51VarB = k51VarC.b()) == null) {
            return null;
        }
        float fWidth2 = rectF.width();
        float fHeight = rectF.height();
        float fE2 = b30Var.e();
        float fA2 = b30Var.a();
        float fC2 = c51VarB.c();
        float fB2 = c51VarB.b();
        if (fWidth2 == 0.0f || fHeight == 0.0f || fE2 == 0.0f || fA2 == 0.0f || fC2 == 0.0f || fB2 == 0.0f) {
            return null;
        }
        if (rectF.width() / rectF.height() > c51VarB.c() / c51VarB.b()) {
            fWidth = rectF.height();
            iC2 = c51VarB.b();
        } else {
            fWidth = rectF.width();
            iC2 = c51VarB.c();
        }
        if (fWidth / iC2 <= 1.0f) {
            if (fWidth2 / fHeight > fC2 / fB2) {
                if (kotlin.jvm.internal.L.f(ndVarA.c(), ndVarA.b())) {
                    return ndVarA.c();
                }
                return null;
            }
            if (kotlin.jvm.internal.L.f(ndVarA.d(), ndVarA.a())) {
                return ndVarA.d();
            }
            return null;
        }
        if (fWidth2 / fHeight > fE2 / fA2) {
            if (kotlin.jvm.internal.L.f(ndVarA.c(), ndVarA.b())) {
                return ndVarA.c();
            }
            return null;
        }
        if (kotlin.jvm.internal.L.f(ndVarA.d(), ndVarA.a())) {
            return ndVarA.d();
        }
        return null;
    }
}
