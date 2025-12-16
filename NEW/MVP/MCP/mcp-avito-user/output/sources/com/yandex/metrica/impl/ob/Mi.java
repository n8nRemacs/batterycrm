package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Tl;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class Mi {

    /* renamed from: a, reason: collision with root package name */
    private final C38902jd f378960a = F0.g().j();

    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Map.Entry<? extends String, ? extends C38853hd>, Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Tl.a f378961a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Tl.a aVar) {
            super(1);
            this.f378961a = aVar;
        }

        @Override // Y41.l
        public Object invoke(Map.Entry<? extends String, ? extends C38853hd> entry) {
            return entry.getValue().parse((JSONObject) this.f378961a);
        }
    }

    public final void a(@Y61.k Ui ui2, @Y61.k Tl.a aVar) {
        Map<String, C38853hd> mapC = this.f378960a.c();
        a aVar2 = new a(aVar);
        Map<String, Object> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<String, C38853hd> entry : mapC.entrySet()) {
            Object objInvoke = aVar2.invoke(entry);
            if (objInvoke != null) {
                linkedHashMap.put(entry.getKey(), objInvoke);
            }
        }
        ui2.b(linkedHashMap);
    }
}
