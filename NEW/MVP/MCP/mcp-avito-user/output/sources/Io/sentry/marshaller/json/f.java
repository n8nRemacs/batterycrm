package io.sentry.marshaller.json;

import java.util.Iterator;
import y41.C50058d;
import y41.InterfaceC50060f;

/* compiled from: MessageInterfaceBinding.java */
/* loaded from: classes8.dex */
public class f implements d<C50058d> {

    /* renamed from: a, reason: collision with root package name */
    public final int f405217a;

    public f() {
        this.f405217a = 1000;
    }

    @Override // io.sentry.marshaller.json.d
    public final void a(g gVar, InterfaceC50060f interfaceC50060f) {
        C50058d c50058d = (C50058d) interfaceC50060f;
        gVar.e0();
        String str = c50058d.f442914b;
        int i12 = this.f405217a;
        gVar.k0("message", io.sentry.util.b.d(i12, str));
        gVar.q("params");
        Iterator<String> it = c50058d.f442915c.iterator();
        while (it.hasNext()) {
            gVar.i0(it.next());
        }
        gVar.A();
        String str2 = c50058d.f442916d;
        if (str2 != null) {
            gVar.k0("formatted", io.sentry.util.b.d(i12, str2));
        }
        gVar.B();
    }

    public f(int i12) {
        this.f405217a = i12;
    }
}
