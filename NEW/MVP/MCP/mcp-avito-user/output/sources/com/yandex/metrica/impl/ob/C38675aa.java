package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C39176ui;
import com.yandex.metrica.impl.ob.If;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.aa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38675aa implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    private static final EnumMap<C39176ui.b, String> f380114a;

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, C39176ui.b> f380115b;

    static {
        EnumMap<C39176ui.b, String> enumMap = new EnumMap<>(C39176ui.b.class);
        f380114a = enumMap;
        HashMap map = new HashMap();
        f380115b = map;
        C39176ui.b bVar = C39176ui.b.WIFI;
        enumMap.put((EnumMap<C39176ui.b, String>) bVar, (C39176ui.b) "wifi");
        C39176ui.b bVar2 = C39176ui.b.CELL;
        enumMap.put((EnumMap<C39176ui.b, String>) bVar2, (C39176ui.b) "cell");
        map.put("wifi", bVar);
        map.put("cell", bVar2);
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public If.t fromModel(@j.N C39176ui c39176ui) {
        If.t tVar = new If.t();
        if (c39176ui.f381976a != null) {
            If.u uVar = new If.u();
            tVar.f378454a = uVar;
            C39176ui.a aVar = c39176ui.f381976a;
            uVar.f378456a = aVar.f381978a;
            uVar.f378457b = aVar.f381979b;
        }
        if (c39176ui.f381977b != null) {
            If.u uVar2 = new If.u();
            tVar.f378455b = uVar2;
            C39176ui.a aVar2 = c39176ui.f381977b;
            uVar2.f378456a = aVar2.f381978a;
            uVar2.f378457b = aVar2.f381979b;
        }
        return tVar;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C39176ui toModel(@j.N If.t tVar) {
        If.u uVar = tVar.f378454a;
        C39176ui.a aVar = uVar != null ? new C39176ui.a(uVar.f378456a, uVar.f378457b) : null;
        If.u uVar2 = tVar.f378455b;
        return new C39176ui(aVar, uVar2 != null ? new C39176ui.a(uVar2.f378456a, uVar2.f378457b) : null);
    }
}
