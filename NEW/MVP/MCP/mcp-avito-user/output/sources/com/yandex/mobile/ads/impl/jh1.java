package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class jh1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f386879a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final qi1 f386880b = new qi1();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final wi1 f386881c = new wi1();

    public jh1(@Y61.k Context context) {
        this.f386879a = context.getApplicationContext();
    }

    public final void a(@Y61.k List<String> list, @Y61.l Map<String, String> map) {
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (String strA : list) {
            boolean z12 = map != null;
            if (z12) {
                this.f386880b.getClass();
                strA = qi1.a(strA, map);
            } else if (z12) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(strA);
        }
        this.f386881c.getClass();
        Iterator it = wi1.a(arrayList).iterator();
        while (it.hasNext()) {
            qh1.f389188c.a(this.f386879a).a((String) it.next());
        }
    }
}
