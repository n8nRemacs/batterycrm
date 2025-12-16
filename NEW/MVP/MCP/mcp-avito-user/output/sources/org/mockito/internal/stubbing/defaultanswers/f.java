package org.mockito.internal.stubbing.defaultanswers;

import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.stubbing.defaultanswers.c;
import org.mockito.q;

/* compiled from: ReturnsMocks.java */
/* loaded from: classes7.dex */
class f implements c.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f421715a;

    public f(g gVar) {
        this.f421715a = gVar;
    }

    @Override // org.mockito.internal.stubbing.defaultanswers.c.a
    public final Object a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        M71.b bVar = new M71.b();
        g gVar = this.f421715a;
        bVar.f11213d = gVar;
        if (gVar == null) {
            throw new MockitoException("defaultAnswer() does not accept null parameter");
        }
        q.f421785a.getClass();
        return K71.d.b(cls, bVar);
    }
}
