package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.lu0;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes8.dex */
public final class g11 implements f11 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final q21 f385548a;

    public g11(@Y61.k q21 q21Var) {
        this.f385548a = q21Var;
    }

    @Override // com.yandex.mobile.ads.impl.f11
    @Y61.l
    public final SSLSocketFactory a(@Y61.k Context context) {
        v11 v11VarA = this.f385548a.a(context);
        kn1 kn1VarA = an.a(context);
        if (v11VarA != null && v11VarA.Q()) {
            return d90.a(kn1VarA);
        }
        if (!h7.a(21)) {
            return null;
        }
        int i12 = lu0.f387712b;
        return lu0.a.a();
    }

    public /* synthetic */ g11() {
        this(q21.b());
    }
}
