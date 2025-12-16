package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.impl.dk;

/* loaded from: classes8.dex */
public final class ck {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final wy0 f384321a;

    public ck(@Y61.k wy0 wy0Var) {
        this.f384321a = wy0Var;
    }

    public final void a(@Y61.k Context context, @Y61.k Uri.Builder builder) {
        dk.f384623a.getClass();
        dk dkVarA = dk.a.a(context);
        wy0 wy0Var = this.f384321a;
        fk fkVar = (fk) dkVarA;
        String strC = fkVar.c();
        wy0Var.getClass();
        wy0.a(builder, "gdpr", strC);
        wy0 wy0Var2 = this.f384321a;
        String strB = fkVar.b();
        wy0Var2.getClass();
        wy0.a(builder, "gdpr_consent", strB);
        wy0 wy0Var3 = this.f384321a;
        String strD = fkVar.d();
        wy0Var3.getClass();
        wy0.a(builder, "parsed_purpose_consents", strD);
        wy0 wy0Var4 = this.f384321a;
        String strE = fkVar.e();
        wy0Var4.getClass();
        wy0.a(builder, "parsed_vendor_consents", strE);
        wy0 wy0Var5 = this.f384321a;
        Integer numValueOf = Integer.valueOf(fkVar.a() ? 1 : 0);
        wy0Var5.getClass();
        wy0.a(builder, numValueOf);
    }
}
