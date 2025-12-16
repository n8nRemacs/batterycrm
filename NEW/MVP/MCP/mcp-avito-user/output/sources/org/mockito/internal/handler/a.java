package org.mockito.internal.handler;

import e81.InterfaceC39969c;
import e81.h;
import g81.InterfaceC40547a;
import h81.InterfaceC40782a;
import java.util.Iterator;
import java.util.List;
import org.mockito.exceptions.base.MockitoException;

/* compiled from: InvocationNotifierHandler.java */
/* loaded from: classes7.dex */
class a<T> implements h<T> {

    /* renamed from: b, reason: collision with root package name */
    public final List<InterfaceC40547a> f421640b;

    /* renamed from: c, reason: collision with root package name */
    public final h<T> f421641c;

    public a(N71.a aVar, h hVar) {
        this.f421641c = hVar;
        this.f421640b = aVar.f11216g;
    }

    @Override // e81.h
    public final Object N0(org.mockito.internal.invocation.e eVar) {
        MockitoException mockitoExceptionD;
        List<InterfaceC40547a> list = this.f421640b;
        try {
            Object objN0 = ((e) this.f421641c).N0(eVar);
            Iterator<InterfaceC40547a> it = list.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(new d(eVar, objN0));
                } finally {
                }
            }
            return objN0;
        } catch (Throwable th2) {
            Iterator<InterfaceC40547a> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().a(new d(eVar, th2));
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override // e81.h
    public final InterfaceC39969c T5() {
        return ((e) this.f421641c).f421648b.f421642b;
    }

    @Override // e81.h
    public final InterfaceC40782a<T> j0() {
        return ((e) this.f421641c).f421648b.f421644d;
    }
}
