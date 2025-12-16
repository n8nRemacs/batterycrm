package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.ob.InterfaceC39110s0;
import com.yandex.metrica.impl.ob.InterfaceC39182v0;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.r0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39086r0<CANDIDATE, CHOSEN extends InterfaceC39182v0, STORAGE extends InterfaceC39110s0<CANDIDATE, CHOSEN>> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f381689a;

    /* renamed from: b, reason: collision with root package name */
    private final ProtobufStateStorage f381690b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC39134t0<CHOSEN> f381691c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC39280z2<CANDIDATE, CHOSEN> f381692d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC39088r2<CANDIDATE, CHOSEN, STORAGE> f381693e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC38692b2<CHOSEN> f381694f;

    /* renamed from: g, reason: collision with root package name */
    private final Y1 f381695g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC38765e0 f381696h;

    /* renamed from: i, reason: collision with root package name */
    private STORAGE f381697i;

    /* JADX WARN: Multi-variable type inference failed */
    public C39086r0(@Y61.k Context context, @Y61.k ProtobufStateStorage protobufStateStorage, @Y61.k AbstractC39134t0 abstractC39134t0, @Y61.k InterfaceC39280z2 interfaceC39280z2, @Y61.k InterfaceC39088r2 interfaceC39088r2, @Y61.k InterfaceC38692b2 interfaceC38692b2, @Y61.k Y1 y12, @Y61.k InterfaceC38765e0 interfaceC38765e0, @Y61.k InterfaceC39110s0 interfaceC39110s0, @Y61.k String str) {
        this.f381689a = context;
        this.f381690b = protobufStateStorage;
        this.f381691c = abstractC39134t0;
        this.f381692d = interfaceC39280z2;
        this.f381693e = interfaceC39088r2;
        this.f381694f = interfaceC38692b2;
        this.f381695g = y12;
        this.f381696h = interfaceC38765e0;
        this.f381697i = interfaceC39110s0;
    }

    private final synchronized CHOSEN c() {
        try {
            if (!this.f381695g.a()) {
                CHOSEN chosenInvoke = this.f381694f.invoke();
                this.f381695g.b();
                if (chosenInvoke != null) {
                    b(chosenInvoke);
                }
            }
            C38842h2.a("Choosing distribution data: %s", this.f381697i);
        } catch (Throwable th2) {
            throw th2;
        }
        return (CHOSEN) this.f381697i.b();
    }

    @Y61.k
    public final synchronized STORAGE a() {
        return this.f381697i;
    }

    public final synchronized boolean b(@Y61.k CHOSEN chosen) {
        boolean z12 = false;
        if (chosen.a() == EnumC39158u0.UNDEFINED) {
            return false;
        }
        List<? extends CANDIDATE> listInvoke = this.f381692d.invoke(this.f381697i.a(), chosen);
        boolean z13 = listInvoke != null;
        if (listInvoke == null) {
            listInvoke = this.f381697i.a();
        }
        if (this.f381691c.a(chosen, this.f381697i.b())) {
            z12 = true;
        } else {
            chosen = (CHOSEN) this.f381697i.b();
        }
        if (z12 || z13) {
            STORAGE storageInvoke = this.f381693e.invoke(chosen, listInvoke);
            this.f381697i = storageInvoke;
            this.f381690b.save(storageInvoke);
        }
        return z12;
    }

    @Y61.k
    public final CHOSEN a(@Y61.k CHOSEN chosen) {
        CHOSEN chosen2;
        this.f381696h.a(this.f381689a);
        synchronized (this) {
            b(chosen);
            chosen2 = (CHOSEN) c();
        }
        return chosen2;
    }

    @Y61.k
    public final CHOSEN b() {
        this.f381696h.a(this.f381689a);
        return (CHOSEN) c();
    }
}
