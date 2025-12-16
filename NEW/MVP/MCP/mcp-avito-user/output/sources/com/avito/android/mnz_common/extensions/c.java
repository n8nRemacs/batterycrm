package com.avito.android.mnz_common.extensions;

import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.util.C35835l0;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ContextExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mnz-common_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {
    @f0
    @l
    public static final Integer a(@k Context context, @l String str) {
        if (str != null) {
            return Integer.valueOf(C35835l0.j(com.avito.android.lib.util.f.d(str), context));
        }
        return null;
    }
}
