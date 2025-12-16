package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.vd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39195vd {
    @X41.n
    public static final boolean a(@Y61.k Context context, @Y61.k String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
