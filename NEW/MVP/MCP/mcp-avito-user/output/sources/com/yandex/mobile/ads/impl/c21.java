package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;

/* loaded from: classes8.dex */
public final class c21 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ps f384163a = new ps();

    @Y61.k
    public final String a(@Y61.k Context context, @Y61.k e31 e31Var, @Y61.k q8 q8Var, @Y61.k ts tsVar) {
        String[] strArr = {vv.a(e31.c(context)).e(tsVar.f()).d(tsVar.d()).a(q8Var.a(), q8Var.c()).a(q8Var.b()).c().j(context).b().a(e31.a(context)).a(context, tsVar.b()).a(context).f().g().a(), C42745f0.O(tsVar.e(), ContainerUtils.FIELD_DELIMITER, null, null, b21.f383764a, 30)};
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < 2; i12++) {
            String str = strArr[i12];
            if (!C43066x.K(str)) {
                arrayList.add(str);
            }
        }
        return this.f384163a.a(context, C42745f0.O(arrayList, ContainerUtils.FIELD_DELIMITER, null, null, null, 62));
    }
}
