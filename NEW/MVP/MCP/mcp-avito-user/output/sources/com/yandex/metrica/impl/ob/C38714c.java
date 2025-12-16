package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38714c implements InterfaceC38938l {

    /* renamed from: a, reason: collision with root package name */
    private boolean f380251a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final InterfaceC38988n f380252b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Map<String, T21.a> f380253c = new HashMap();

    public C38714c(@j.N InterfaceC38988n interfaceC38988n) {
        C38718c3 c38718c3 = (C38718c3) interfaceC38988n;
        for (T21.a aVar : c38718c3.a()) {
            this.f380253c.put(aVar.f15319b, aVar);
        }
        this.f380251a = c38718c3.b();
        this.f380252b = c38718c3;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38938l
    @j.l0
    public void a(@j.N Map<String, T21.a> map) {
        for (T21.a aVar : map.values()) {
            this.f380253c.put(aVar.f15319b, aVar);
        }
        ((C38718c3) this.f380252b).a(new ArrayList(this.f380253c.values()), this.f380251a);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38938l
    public void b() {
        if (this.f380251a) {
            return;
        }
        this.f380251a = true;
        ((C38718c3) this.f380252b).a(new ArrayList(this.f380253c.values()), this.f380251a);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38938l
    @j.P
    public T21.a a(@j.N String str) {
        return this.f380253c.get(str);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38938l
    public boolean a() {
        return this.f380251a;
    }
}
