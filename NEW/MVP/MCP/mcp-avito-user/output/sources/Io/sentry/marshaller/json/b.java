package io.sentry.marshaller.json;

import java.util.ArrayDeque;
import java.util.Iterator;
import y41.C50056b;
import y41.C50059e;
import y41.InterfaceC50060f;

/* compiled from: ExceptionInterfaceBinding.java */
/* loaded from: classes8.dex */
public class b implements d<C50056b> {

    /* renamed from: a, reason: collision with root package name */
    public final h f405209a;

    public b(h hVar) {
        this.f405209a = hVar;
    }

    @Override // io.sentry.marshaller.json.d
    public final void a(g gVar, InterfaceC50060f interfaceC50060f) {
        ArrayDeque arrayDeque = ((C50056b) interfaceC50060f).f442896b;
        gVar.a0();
        Iterator itDescendingIterator = arrayDeque.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            C50059e c50059e = (C50059e) itDescendingIterator.next();
            gVar.e0();
            gVar.k0("type", c50059e.f442918c);
            gVar.k0("value", c50059e.f442917b);
            String str = c50059e.f442919d;
            if (str == null) {
                str = "(default)";
            }
            gVar.k0("module", str);
            gVar.G("stacktrace");
            this.f405209a.a(gVar, c50059e.f442920e);
            gVar.B();
        }
        gVar.A();
    }
}
