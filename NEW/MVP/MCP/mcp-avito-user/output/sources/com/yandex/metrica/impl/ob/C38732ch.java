package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ch, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38732ch implements CacheControlHttpsConnectionPerformer.Client {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C38782eh f380342a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C38682ah f380343b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C38707bh f380344c;

    public C38732ch(C38707bh c38707bh, C38782eh c38782eh, C38682ah c38682ah) {
        this.f380344c = c38707bh;
        this.f380342a = c38782eh;
        this.f380343b = c38682ah;
    }

    @Override // com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer.Client
    @j.P
    public String getOldETag() {
        return this.f380342a.f380492b;
    }

    @Override // com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer.Client
    public void onError() {
        this.f380343b.a();
    }

    @Override // com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer.Client
    public void onNotModified() {
        C38682ah c38682ah = this.f380343b;
        C38782eh c38782eh = this.f380342a;
        List<C38857hh> list = c38782eh.f380491a;
        String str = c38782eh.f380492b;
        this.f380344c.f380213f.getClass();
        c38682ah.a(new C38782eh(list, str, System.currentTimeMillis(), true, false));
    }

    @Override // com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer.Client
    public void onResponse(@j.N String str, @j.N byte[] bArr) {
        List<C38857hh> listA = this.f380344c.f380210c.a(this.f380344c.f380211d.a(bArr, "af9202nao18gswqp"));
        C38682ah c38682ah = this.f380343b;
        this.f380344c.f380213f.getClass();
        c38682ah.a(new C38782eh(listA, str, System.currentTimeMillis(), true, false));
    }
}
