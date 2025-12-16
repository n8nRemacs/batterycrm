package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.ob.C38757dh;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ah, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38682ah {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private ProtobufStateStorage f380126a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private C38782eh f380127b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private com.yandex.metrica.coreutils.services.e f380128c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private C38832gh f380129d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private a f380130e;

    /* renamed from: com.yandex.metrica.impl.ob.ah$a */
    public interface a {
    }

    public C38682ah(@j.N ProtobufStateStorage protobufStateStorage, @j.N a aVar) {
        this(protobufStateStorage, aVar, new com.yandex.metrica.coreutils.services.e(), new C38832gh(protobufStateStorage));
    }

    public void a(@j.N C38782eh c38782eh) {
        this.f380126a.save(c38782eh);
        this.f380127b = c38782eh;
        this.f380129d.a();
        C38757dh.a aVar = (C38757dh.a) this.f380130e;
        C38757dh.this.b();
        C38757dh.this.f380391h = false;
    }

    @j.k0
    public C38682ah(@j.N ProtobufStateStorage protobufStateStorage, @j.N a aVar, @j.N com.yandex.metrica.coreutils.services.e eVar, @j.N C38832gh c38832gh) {
        this.f380126a = protobufStateStorage;
        this.f380127b = (C38782eh) protobufStateStorage.read();
        this.f380128c = eVar;
        this.f380129d = c38832gh;
        this.f380130e = aVar;
    }

    public void a() {
        C38782eh c38782eh = this.f380127b;
        List<C38857hh> list = c38782eh.f380491a;
        String str = c38782eh.f380492b;
        this.f380128c.getClass();
        C38782eh c38782eh2 = new C38782eh(list, str, System.currentTimeMillis(), true, true);
        this.f380126a.save(c38782eh2);
        this.f380127b = c38782eh2;
        C38757dh.a aVar = (C38757dh.a) this.f380130e;
        C38757dh.this.b();
        C38757dh.this.f380391h = false;
    }
}
