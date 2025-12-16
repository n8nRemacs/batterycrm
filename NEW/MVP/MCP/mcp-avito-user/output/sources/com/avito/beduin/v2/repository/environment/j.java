package com.avito.beduin.v2.repository.environment;

import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.A;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: EnvironmentExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"impl_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j {
    @Y61.k
    public static final A a(@Y61.k h hVar, @Y61.k C36272i c36272i) {
        hVar.getClass();
        Platform platform = Platform.f338205b;
        Q q12 = new Q("platform", c36272i.e("Android"));
        Q q13 = new Q("osVersion", c36272i.e(hVar.f338235a));
        Q q14 = new Q("hasLidar", c36272i.f(false));
        Q q15 = new Q("orientation", c36272i.e(hVar.f338236b.toString()));
        Q q16 = new Q("screenWidth", c36272i.c(hVar.f338237c));
        Q q17 = new Q("screenHeight", c36272i.c(hVar.f338238d));
        Q q18 = new Q("isProduction", c36272i.f(true));
        Q q19 = new Q("appVersion", c36272i.e(hVar.f338239e));
        k kVar = hVar.f338240f;
        return new A(q12, q13, q14, q15, q16, q17, q18, q19, new Q("safeAreaInsets", new A(new Q("start", c36272i.c(kVar.f338252a)), new Q("end", c36272i.c(kVar.f338253b)), new Q("bottom", c36272i.c(kVar.f338254c)), new Q("top", c36272i.c(kVar.f338255d)))));
    }
}
