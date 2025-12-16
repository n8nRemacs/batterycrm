package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.ob.InterfaceC38800fa;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.e5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38770e5 extends X4 {

    /* renamed from: b, reason: collision with root package name */
    private final Cd f380432b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ProtobufStateStorage f380433c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final A f380434d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final C39181v f380435e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final C39229x f380436f;

    public C38770e5(L3 l32, Cd cd2) {
        this(l32, cd2, InterfaceC38800fa.b.a(C39147td.class).a(l32.g()), new A(l32.g()), new C39181v(), new C39229x(l32.g()));
    }

    @Override // com.yandex.metrica.impl.ob.S4
    public boolean a(@j.N C38715c0 c38715c0) {
        C39147td c39147td;
        L3 l3A = a();
        l3A.e().toString();
        if (!l3A.x().k() || !l3A.A()) {
            return false;
        }
        C39147td c39147td2 = (C39147td) this.f380433c.read();
        List<Bd> list = c39147td2.f381879a;
        C39277z c39277z = c39147td2.f381880b;
        C39277z c39277zA = this.f380434d.a();
        List<String> list2 = c39147td2.f381881c;
        List<String> listA = this.f380436f.a();
        List<Bd> listA2 = this.f380432b.a(a().g(), list);
        if (listA2 == null && A2.a(c39277z, c39277zA) && C38689b.a(list2, listA)) {
            c39147td = null;
        } else {
            if (listA2 != null) {
                list = listA2;
            }
            c39147td = new C39147td(list, c39277zA, listA);
        }
        if (c39147td != null) {
            l3A.r().e(C38715c0.a(c38715c0, c39147td.f381879a, c39147td.f381880b, this.f380435e, c39147td.f381881c));
            this.f380433c.save(c39147td);
            return false;
        }
        if (!l3A.E()) {
            return false;
        }
        l3A.r().e(C38715c0.a(c38715c0, c39147td2.f381879a, c39147td2.f381880b, this.f380435e, c39147td2.f381881c));
        return false;
    }

    @j.k0
    public C38770e5(L3 l32, Cd cd2, @j.N ProtobufStateStorage protobufStateStorage, @j.N A a12, @j.N C39181v c39181v, @j.N C39229x c39229x) {
        super(l32);
        this.f380432b = cd2;
        this.f380433c = protobufStateStorage;
        this.f380434d = a12;
        this.f380435e = c39181v;
        this.f380436f = c39229x;
    }
}
