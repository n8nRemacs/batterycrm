package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.vo1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class mp1 implements vo1 {

    /* renamed from: a, reason: collision with root package name */
    private final vo1 f388057a;

    public mp1(rp1 rp1Var) {
        this.f388057a = rp1Var;
    }

    @Override // com.yandex.mobile.ads.impl.vo1
    public final JSONObject a(View view) {
        return gp1.a(0, 0, 0, 0);
    }

    @Override // com.yandex.mobile.ads.impl.vo1
    public final void a(View view, JSONObject jSONObject, vo1.a aVar, boolean z12, boolean z13) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        uo1 uo1VarA = uo1.a();
        if (uo1VarA != null) {
            Collection<to1> collectionC = uo1VarA.c();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionC.size() * 2) + 3);
            Iterator<to1> it = collectionC.iterator();
            while (it.hasNext()) {
                View viewE = it.next().e();
                if (viewE != null && aq1.b(viewE) && (rootView = viewE.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fA2 = aq1.a(rootView);
                    int size = arrayList.size();
                    while (size > 0 && aq1.a((View) arrayList.get(size - 1)) > fA2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((wa1) aVar).a((View) it2.next(), this.f388057a, jSONObject, z13);
        }
    }
}
