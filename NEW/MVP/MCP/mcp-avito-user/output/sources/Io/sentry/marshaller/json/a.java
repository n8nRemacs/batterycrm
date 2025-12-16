package io.sentry.marshaller.json;

import java.util.Iterator;
import y41.C50055a;
import y41.InterfaceC50060f;

/* compiled from: DebugMetaInterfaceBinding.java */
/* loaded from: classes8.dex */
public class a implements d<C50055a> {
    @Override // io.sentry.marshaller.json.d
    public final void a(g gVar, InterfaceC50060f interfaceC50060f) {
        gVar.e0();
        gVar.q("images");
        Iterator<C50055a.C12886a> it = ((C50055a) interfaceC50060f).f442894b.iterator();
        while (it.hasNext()) {
            C50055a.C12886a next = it.next();
            gVar.e0();
            gVar.k0("uuid", next.f442895b);
            gVar.k0("type", "proguard");
            gVar.B();
        }
        gVar.A();
        gVar.B();
    }
}
