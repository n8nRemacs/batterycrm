package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.HashMap;
import kotlin.text.C43066x;

/* loaded from: classes8.dex */
public final class sq {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final vi f390010a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final HashMap f390011b = new HashMap();

    public sq(@Y61.k vi viVar) {
        this.f390010a = viVar;
    }

    public final void a(int i12, @Y61.k vi viVar) {
        this.f390011b.put(Integer.valueOf(i12), viVar);
    }

    public final void a(@Y61.k Uri uri, @Y61.k com.yandex.div.core.n0 n0Var) {
        String queryParameter = uri.getQueryParameter("assetName");
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter("position");
            Integer numY0 = queryParameter2 != null ? C43066x.y0(queryParameter2) : null;
            if (numY0 == null) {
                this.f390010a.a(n0Var.getView(), queryParameter);
                return;
            }
            vi viVar = (vi) this.f390011b.get(numY0);
            if (viVar != null) {
                viVar.a(n0Var.getView(), queryParameter);
            }
        }
    }
}
