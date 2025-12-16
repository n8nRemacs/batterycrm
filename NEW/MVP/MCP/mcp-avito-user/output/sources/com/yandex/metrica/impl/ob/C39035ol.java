package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39107rl;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ol, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39035ol implements Ik {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<C39107rl> f381269a;

    public C39035ol(@j.N List<C39107rl> list) {
        this.f381269a = list;
    }

    @Override // com.yandex.metrica.impl.ob.Ik
    @j.N
    public Object a(@j.N C38761dl c38761dl, @j.N C38861hl c38861hl, @j.N Ak ak2, int i12) {
        JSONArray jSONArray = new JSONArray();
        if (this.f381269a.isEmpty()) {
            return jSONArray;
        }
        for (C39107rl c39107rl : this.f381269a) {
            C39107rl.b bVarA = c39107rl.a(ak2);
            int i13 = 0;
            if ((c38861hl.f380738f || c39107rl.a()) && (bVarA == null || !c38861hl.f380741i)) {
                JSONObject jSONObjectA = c39107rl.a(c38861hl, bVarA);
                int length = jSONObjectA.toString().getBytes().length + 1;
                int length2 = jSONArray.length();
                if (i12 + length <= c38861hl.f380746n && length2 < c38861hl.f380745m) {
                    jSONArray.put(jSONObjectA);
                    i13 = length;
                }
            }
            i12 += i13;
        }
        return jSONArray;
    }
}
