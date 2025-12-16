package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.jl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38910jl implements Jk {
    @Override // com.yandex.metrica.impl.ob.Jk
    public void a(@j.N JSONObject jSONObject, @j.N Object obj, @j.N String str) {
        try {
            jSONObject.put(str, obj);
        } catch (Throwable unused) {
        }
    }
}
