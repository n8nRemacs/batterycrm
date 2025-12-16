package com.vk.push.core.utils;

import kotlin.Metadata;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: StringExtensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk-public-push-core_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class q {
    static {
        new C43059p("(?<=[a-zA-Z])[A-Z]");
    }

    @Y61.k
    public static final String a(@Y61.k String str) {
        return str.length() > 8 ? "****".concat(C43066x.u0(4, str)) : "****";
    }
}
