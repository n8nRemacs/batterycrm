package com.avito.android.ux.feedback.impl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;

/* compiled from: CampaignLifecycleHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ux/feedback/impl/q;", "LCb1/f;", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q implements Cb1.f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final v f319166a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public s f319167b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f319168c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public SK0.d f319169d;

    public q(@Y61.k v vVar) {
        this.f319166a = vVar;
        if (vVar.f319182e) {
            vVar.f319179b = Long.valueOf(System.currentTimeMillis());
            vVar.f319178a.c(new UK0.d());
        }
    }

    public final void a(int i12, @Y61.k String str) {
        SK0.f fVar;
        LinkedHashMap linkedHashMap;
        String str2;
        String str3;
        String str4;
        SK0.f fVar2;
        SK0.d dVar = this.f319169d;
        if (dVar != null) {
            dVar.v5(str);
        }
        r rVar = (r) this.f319168c.remove(str);
        s sVar = this.f319167b;
        if (sVar != null) {
            String string = UUID.randomUUID().toString();
            HashMap map = sVar.f319175b;
            map.clear();
            if (rVar != null && (fVar2 = rVar.f319170a) != null) {
                map.putAll(fVar2.f14906a);
            }
            map.put("uxfid", string);
            VK0.a aVar = sVar.f319176c;
            aVar.getClass();
            kotlin.reflect.n<Object> nVar = VK0.a.f17075f[2];
            if (((Boolean) aVar.f17078d.a().invoke()).booleanValue() && rVar != null && (str4 = rVar.f319171b) != null) {
                map.put("user_id", str4);
            }
            if (rVar != null && (str3 = rVar.f319172c) != null) {
                map.put("hash_user_id", str3);
            }
            if (rVar != null && (str2 = rVar.f319173d) != null) {
                map.put("app_version", str2);
            }
            sVar.f319174a.c(new UK0.c(str, i12, string, rVar != null ? rVar.f319171b : null, (rVar == null || (fVar = rVar.f319170a) == null || (linkedHashMap = fVar.f14906a) == null) ? null : C42745f0.O(P0.o(linkedHashMap), ",", "{", "}", t.f319177l, 24)));
        }
    }
}
