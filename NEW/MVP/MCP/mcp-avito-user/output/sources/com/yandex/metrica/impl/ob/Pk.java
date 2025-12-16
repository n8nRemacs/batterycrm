package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39107rl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Pk {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<Pk> f379218a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39107rl f379219b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final int f379220a;

        /* renamed from: b, reason: collision with root package name */
        final int f379221b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        final JSONObject f379222c;

        public a(int i12, int i13, @j.P JSONObject jSONObject) {
            this.f379220a = i12;
            this.f379221b = i13;
            this.f379222c = jSONObject;
        }
    }

    public Pk(@j.N C39107rl c39107rl) {
        this.f379219b = c39107rl;
    }

    public void a(@j.N Pk pk2) {
        this.f379218a.add(pk2);
    }

    @j.N
    public C39107rl a() {
        return this.f379219b;
    }

    @j.N
    public a a(@j.N C38861hl c38861hl, @j.N Ak ak2, int i12, int i13) {
        int length;
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        int i14 = i13 + 1;
        try {
            C39107rl.b bVarA = this.f379219b.a(ak2);
            boolean z12 = true;
            boolean z13 = c38861hl.f380738f || this.f379219b.a();
            if (bVarA != null && c38861hl.f380741i) {
                z12 = false;
            }
            if (z13 && z12) {
                jSONObject = this.f379219b.a(c38861hl, bVarA);
            }
            length = jSONObject.toString().getBytes().length + i12;
            try {
                jSONArray = new JSONArray();
                jSONObject.put("ch", jSONArray);
                length += 8;
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            length = i12;
        }
        if (length <= c38861hl.f380746n && i14 <= c38861hl.f380745m) {
            Iterator<Pk> it = this.f379218a.iterator();
            while (it.hasNext()) {
                a aVarA = it.next().a(c38861hl, ak2, length + 1, i14);
                JSONObject jSONObject2 = aVarA.f379222c;
                if (jSONObject2 != null) {
                    jSONArray.put(jSONObject2);
                }
                int i15 = aVarA.f379220a;
                if (i15 == 0) {
                    break;
                }
                i14 += aVarA.f379221b;
                length += i15;
            }
            return new a(length - i12, i14 - i13, jSONObject);
        }
        return new a(0, 0, null);
    }
}
