package com.yandex.metrica.impl.ob;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.dl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38761dl {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private Pk f380417a;

    public void a(@j.N Rk rk2, @j.N View view, @j.N Hk hk2) {
        Pk pkB = rk2.b(null, view, 0);
        this.f380417a = pkB;
        if (pkB != null) {
            a(rk2, pkB, view, 1, hk2);
        }
    }

    @j.N
    public JSONObject a(@j.N C38861hl c38861hl, @j.N Ak ak2, int i12) {
        Pk pk2 = this.f380417a;
        JSONObject jSONObject = pk2 != null ? pk2.a(c38861hl, ak2, i12, 0).f379222c : null;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    private void a(@j.N Rk rk2, @j.N Pk pk2, @j.N View view, int i12, @j.N Hk hk2) {
        ArrayList arrayList = (ArrayList) rk2.a(view, i12);
        if (arrayList.size() == 0) {
            hk2.a(pk2.a());
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            Pk pkB = rk2.b(pk2.a(), view2, i12);
            if (pkB != null) {
                pk2.a(pkB);
                a(rk2, pkB, view2, i12 + 1, hk2);
            }
        }
    }
}
