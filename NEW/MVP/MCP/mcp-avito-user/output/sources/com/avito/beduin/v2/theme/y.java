package com.avito.beduin.v2.theme;

import com.avito.beduin.v2.logger.LogLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ThemeColors.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"impl_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class y {
    @Y61.k
    public static final r a(@Y61.k String str) {
        if (C43066x.h0(str, "?", false)) {
            r rVar = t.f338374a;
            return new r(rVar.f338366a, rVar.f338367b, str);
        }
        r.f338365d.getClass();
        return new r(str, str, null, 4, null);
    }

    @Y61.l
    public static final String b(@Y61.k String str) {
        if (C43066x.h0(str, "?", false)) {
            return str.substring(1);
        }
        RU0.b bVar = RU0.b.f14467a;
        LogLevel[] logLevelArr = LogLevel.f337864b;
        bVar.getClass();
        if (3 >= RU0.b.f14469c) {
            RU0.b.f14468b.e(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":ThemeColor"), "Unsupported color token format \"" + str + "\": missing ? prefix");
        }
        return null;
    }
}
