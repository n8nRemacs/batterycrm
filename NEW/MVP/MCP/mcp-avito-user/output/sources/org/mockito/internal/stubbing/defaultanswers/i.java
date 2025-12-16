package org.mockito.internal.stubbing.defaultanswers;

import e81.InterfaceC39968b;
import org.mockito.Answers;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.stubbing.defaultanswers.c;
import org.mockito.internal.stubbing.defaultanswers.j;
import org.mockito.q;

/* compiled from: ReturnsSmartNulls.java */
/* loaded from: classes7.dex */
class i implements c.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC39968b f421718a;

    public i(InterfaceC39968b interfaceC39968b) {
        this.f421718a = interfaceC39968b;
    }

    @Override // org.mockito.internal.stubbing.defaultanswers.c.a
    public final Object a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        j.a aVar = new j.a(this.f421718a, new P71.d());
        K71.d dVar = q.f421785a;
        M71.b bVar = new M71.b();
        Answers answers = q.f421786b;
        bVar.f11213d = answers;
        if (answers == null) {
            throw new MockitoException("defaultAnswer() does not accept null parameter");
        }
        bVar.f11213d = aVar;
        q.f421785a.getClass();
        return K71.d.b(cls, bVar);
    }
}
