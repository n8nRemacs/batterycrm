package com.yandex.metrica.impl.ob;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C42745f0;

/* renamed from: com.yandex.metrica.impl.ob.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38789f implements InterfaceC38938l {

    /* renamed from: a, reason: collision with root package name */
    private boolean f380509a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, T21.a> f380510b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC38988n f380511c;

    public C38789f(@Y61.k InterfaceC38988n interfaceC38988n) {
        this.f380511c = interfaceC38988n;
        C38718c3 c38718c3 = (C38718c3) interfaceC38988n;
        this.f380509a = c38718c3.b();
        List<T21.a> listA = c38718c3.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listA) {
            linkedHashMap.put(((T21.a) obj).f15319b, obj);
        }
        this.f380510b = linkedHashMap;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38938l
    @j.l0
    public void a(@Y61.k Map<String, ? extends T21.a> map) {
        for (T21.a aVar : map.values()) {
            this.f380510b.put(aVar.f15319b, aVar);
        }
        ((C38718c3) this.f380511c).a(C42745f0.M0(this.f380510b.values()), this.f380509a);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38938l
    public void b() {
        if (this.f380509a) {
            return;
        }
        this.f380509a = true;
        ((C38718c3) this.f380511c).a(C42745f0.M0(this.f380510b.values()), this.f380509a);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38938l
    @Y61.l
    public T21.a a(@Y61.k String str) {
        return this.f380510b.get(str);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38938l
    public boolean a() {
        return this.f380509a;
    }
}
